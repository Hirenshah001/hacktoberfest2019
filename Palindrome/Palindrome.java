<div class="inner"><h2 is-upgraded="" class="step-title">1. Welcome</h2>
        <p>This practical codelab is part of <a href="https://developer.android.com/courses/fundamentals-training/toc-v2#unit_1_get_started" target="_blank">Unit 1: Get started</a> in the Android Developer Fundamentals (Version 2) course. You will get the most value out of this course if you work through the codelabs in sequence:</p>
<ul>
<li>For the complete list of codelabs in the course, see <a href="https://developer.android.com/courses/fundamentals-training/toc-v2" target="_blank">Codelabs for Android Developer Fundamentals (V2)</a>.</li>
<li>For details about the course, including links to all the concept chapters, apps, and slides, see <a href="https://developer.android.com/courses/fundamentals-training/overview-v2" target="_blank">Android Developer Fundamentals (Version 2)</a>.</li>
</ul>
<aside class="special"><p><strong>Note:</strong> This course uses the terms "codelab" and "practical" interchangeably.</p>
</aside>

<h2 is-upgraded="">Introduction</h2>
<p>The user interface (UI) that appears on a screen of an Android device consists of a hierarchy of objects called <em>views</em> — every element of the screen is a <a href="https://developer.android.com/reference/android/view/View.html" target="_blank"><code>View</code></a>. The <code>View</code> class represents the basic building block for all UI components, and the base class for classes that provide interactive UI components such as buttons, checkboxes, and text entry fields. Commonly used <code>View</code> subclasses described over several lessons include:</p>
<ul>
<li><a href="http://developer.android.com/reference/android/widget/TextView.html" target="_blank"><code>TextView</code></a> for displaying text.</li>
<li><a href="https://developer.android.com/reference/android/widget/EditText.html" target="_blank"><code>EditText</code></a> to enable the user to enter and edit text.</li>
<li><a href="https://developer.android.com/reference/android/widget/Button.html" target="_blank"><code>Button</code></a> and other clickable elements (such as <a href="https://developer.android.com/reference/android/widget/RadioButton.html" target="_blank"><code>RadioButton</code></a>, <a href="https://developer.android.com/reference/android/widget/CheckBox.html" target="_blank"><code>CheckBox</code></a>, and <a href="https://developer.android.com/reference/android/widget/Spinner.html" target="_blank"><code>Spinner</code></a>) to provide interactive behavior.</li>
<li><a href="https://developer.android.com/reference/android/widget/ScrollView.html" target="_blank"><code>ScrollView</code></a> and <a href="https://developer.android.com/reference/android/support/v7/widget/RecyclerView.html" target="_blank"><code>RecyclerView</code></a> to display scrollable items.</li>
<li><a href="https://developer.android.com/reference/android/widget/ImageView.html" target="_blank"><code>ImageView</code></a> for displaying images.</li>
<li><a href="https://developer.android.com/reference/android/support/constraint/ConstraintLayout.html" target="_blank"><code>ConstraintLayout</code></a> and <a href="https://developer.android.com/reference/android/widget/LinearLayout.html" target="_blank"><code>LinearLayout</code></a> for containing other <code>View</code> elements and positioning them.</li>
</ul>
<p>The Java code that displays and drives the UI is contained in a class that extends <a href="https://developer.android.com/reference/android/app/Activity.html" target="_blank"><code>Activity</code></a>.  An <code>Activity</code> is usually associated with a layout of UI views defined as an XML (eXtended Markup Language) file. This XML file is usually named after its <code>Activity</code> and defines the layout of <code>View</code> elements on the screen.</p>
<p>For example, the <code>MainActivity</code> code in the Hello World app displays a layout defined in the <code>activity_main.xml</code> layout file, which includes a <code>TextView</code> with the text "Hello World". </p>
<p>In more complex apps, an <code>Activity</code> might implement actions to respond to user taps, draw graphical content, or request data from a database or the internet. You learn more about the <code>Activity</code> class in another lesson.</p>
<p>In this practical you learn how to create your first interactive app—an app that enables user interaction. You create an app using the Empty Activity template. You also learn how to use the layout editor to design a layout, and how to edit the layout in XML. You need to develop these skills so you can complete the other practicals in this course.</p>
<h2 is-upgraded="">What you should already know</h2>
<p>You should be familiar with:</p>
<ul>
<li>How to install and open Android Studio. </li>
<li>How to create the HelloWorld app.</li>
<li>How to run the HelloWorld app.</li>
</ul>
<h2 class="checklist" is-upgraded="">What you'll learn</h2>
<ul class="checklist">
<li>How to create an app with interactive behavior.</li>
<li>How to use the layout editor to design a layout.</li>
<li>How to edit the layout in XML.</li>
<li>A lot of new terminology. Check out the <a href="https://developers.google.com/android/for-all/vocab-words/" target="_blank">Vocabulary words and concepts glossary </a>for friendly definitions. </li>
</ul>
<h2 is-upgraded="">What you'll do</h2>
<ul>
<li>Create an app and add two <code>Button</code> elements and a <code>TextView</code> to the layout.</li>
<li>Manipulate each element in the <a href="https://developer.android.com/reference/android/support/constraint/ConstraintLayout.html" target="_blank"><code>ConstraintLayout</code></a> to constrain them to the margins and other elements.</li>
<li>Change UI element attributes.</li>
<li>Edit the app's layout in XML. </li>
<li>Extract hardcoded strings into string resources.</li>
<li>Implement click-handler methods to display messages on the screen when the user taps each <code>Button</code>.</li>
</ul>


      </div>