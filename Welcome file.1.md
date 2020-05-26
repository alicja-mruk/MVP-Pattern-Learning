
**Description of  Model View Presenter Architecture**

The aim is to separate the codebase of your app into 3 different layers that can work independently.

 1. Model: This is the data centre of the app. All the data is kept here and when the model is changed, instead of updating the view directly, the presenter is notified to update the views accordingly.
 2. View : View decides how the data is to be displayed to the user.
 3. Presenter: This is the brain of the app. All the business logic is kept here.

Contract Interface contains all other interfaces uses in the App.
<!--stackedit_data:
eyJoaXN0b3J5IjpbMTIwMjAxMDQ4Nl19
-->