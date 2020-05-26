---

Repository to Learn Basics of MVP Architecture Pattern
---

<p><strong>Description of  Model View Presenter Architecture</strong></p>
<p>The aim is to separate the codebase of your app into 3 different layers that can work independently.</p>
<ol>
<li>Model: This is the data centre of the app. All the data is kept here and when the model is changed, instead of updating the view directly, the presenter is notified to update the views accordingly.</li>
<li>View : View decides how the data is to be displayed to the user.</li>
<li>Presenter: This is the brain of the app. All the business logic is kept here.</li>
</ol>
<p>Contract Interface contains all other interfaces uses in the App.</p>

