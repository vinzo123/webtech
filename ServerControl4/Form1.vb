Public Class Form1

    Private Sub Label1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Label1.Click

    End Sub

    Private Sub ComboBox1_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ComboBox1.SelectedIndexChanged
        If ComboBox1.SelectedIndex = 0 Then
            TextBox4.Text = "MGR001"
            TextBox3.Text = "James Martin"
        ElseIf ComboBox1.SelectedIndex = 1 Then
            TextBox4.Text = "MGR002"
            TextBox3.Text = "Balagurusamy"
        Else
            TextBox4.Text = "MGR003"
            TextBox3.Text = "Victor Solomon"
        End If
    End Sub

    Private Sub MonthCalendar1_DateChanged(ByVal sender As System.Object, ByVal e As System.Windows.Forms.DateRangeEventArgs) Handles MonthCalendar1.DateChanged
        TextBox5.Text = MonthCalendar1.SelectionRange.Start.Date.ToString()

    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Label9.Visible = True
        Label9.Text = "Thank you " & TextBox5.Text & ".You borrowed the book " & ComboBox1.SelectedItem() & ". You must return on or before " & MonthCalendar1.SelectionRange.Start.Date.AddDays(15).ToString()

        TextBox1.Text = ""
        TextBox2.Text = ""
        TextBox3.Text = ""
        TextBox4.Text = ""
        TextBox5.Text = ""

    End Sub

End Class