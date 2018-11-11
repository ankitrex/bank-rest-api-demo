# bank-rest-api-demo

<p>Data and Schema- Based on <a href="https://github.com/bhavyanshu/indian-bank-ifsc-branch-database-sql">MySQL dump</a> which, in turn, is based on the unwieldy <a href="http://rbidocs.rbi.org.in/rdocs/content/docs/68774.xls" rel="nofollow">excel file from RBI</a>.

<h2>API Endpoints and Usage</h2>

<h4>Get Requests</h4>
<ul>
<li> <b>/bank-details/{ifsc}</b> - Given a bank branch IFSC code, get branch details </li>
<li> <b>/branches/{branch name}/{city}</b> - Given a bank name and city, gets details of all branches of the bank in the city </li>
</ul>
