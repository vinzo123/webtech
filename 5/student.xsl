<?xml version="1.0"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
<body>
<h2><center>STUDENT DATABASE</center></h2>
<table align="center" border="5" cellpadding="20">
<tr bgcolor="yellow">
<th>name</th>
<th>department</th>
<th>univ_rank</th>
<th>percentage</th>
</tr>
<xsl:for-each select="student/Person-Details">
<xsl:sort select="percentage"/>
<tr bgcolor="cyan">
<td><xsl:value-of select="name"/></td>
<td><xsl:value-of select="department"/></td>
<td><xsl:value-of select="univ_rank"/></td>
<td><xsl:value-of select="percentage"/></td>
</tr>
</xsl:for-each>
</table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>