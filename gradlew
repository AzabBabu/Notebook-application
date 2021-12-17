<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="15sp"
    tools:context="com.example.nz.sqliteclassone.MainActivity">

    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <EditText
            android:id="@+id/nameEditText"
            android:hint="Name"
            android:layout_width="220sp"
            android:layout_height="wrap_content" />
        <Button
            android:id="@+id/clearButton"
            android:text="Clear"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />
    </LinearLayout>



    <EditText
        android:id="@+id/ageEditText"
        android:hint="Age"
        android:inputType="number"
        android:layout_width="220sp"
        android:layout_height="wrap_content" />
    <EditText
        android:id="@+id/genderEditText"
        android:hint="Gender"
        android:layout_width="220sp"
        android:layout_height="wrap_content" />
    <Button
        android:id="@+id/saveButton"
        android:text="Save Data"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
    <Button
        android:id="@+id/showButton"
        android:text="Show Data"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <EditText
            android:id="@+id/idEditText"
            android:hint="Enter ID"
            android:inputType="number"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />
        <Button
            android:id="@+id/updateButton"
            android:text="Update Data"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />
        <Button
            android:id="@+id/deleteButton"
            android:text="Delete Data"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />

    </LinearLayout>






</LinearLayout>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            