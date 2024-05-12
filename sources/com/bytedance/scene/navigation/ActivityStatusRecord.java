package com.bytedance.scene.navigation;

import Y.IDCreatorS53S0000000_10;
import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;

/* loaded from: classes11.dex */
public class ActivityStatusRecord implements Parcelable {
    public static final Parcelable.Creator<ActivityStatusRecord> CREATOR = new IDCreatorS53S0000000_10(0);
    public int mNavigationBarColor;
    public int mRequestedOrientation;
    public int mSoftInputMode;
    public int mStatusBarColor;
    public int mSystemUiVisibility;
    public int mWindowFlags;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ActivityStatusRecord() {
    }

    public ActivityStatusRecord(Parcel parcel) {
        this.mStatusBarColor = parcel.readInt();
        this.mNavigationBarColor = parcel.readInt();
        this.mSystemUiVisibility = parcel.readInt();
        this.mSoftInputMode = parcel.readInt();
        this.mWindowFlags = parcel.readInt();
        this.mRequestedOrientation = parcel.readInt();
    }

    public static ActivityStatusRecord LIZ(Activity activity) {
        ActivityStatusRecord activityStatusRecord = new ActivityStatusRecord();
        Window window = activity.getWindow();
        View decorView = window.getDecorView();
        activityStatusRecord.mStatusBarColor = window.getStatusBarColor();
        activityStatusRecord.mNavigationBarColor = window.getNavigationBarColor();
        activityStatusRecord.mSystemUiVisibility = decorView.getSystemUiVisibility();
        activityStatusRecord.mSoftInputMode = window.getAttributes().softInputMode;
        activityStatusRecord.mWindowFlags = window.getAttributes().flags;
        activityStatusRecord.mRequestedOrientation = activity.getRequestedOrientation();
        return activityStatusRecord;
    }

    public final void LIZIZ(Activity activity) {
        Window window = activity.getWindow();
        window.setStatusBarColor(this.mStatusBarColor);
        window.setNavigationBarColor(this.mNavigationBarColor);
        window.getDecorView().setSystemUiVisibility(this.mSystemUiVisibility);
        window.setSoftInputMode(this.mSoftInputMode);
        int i = window.getAttributes().flags;
        int i2 = this.mWindowFlags;
        int i3 = ~(i & i2);
        window.addFlags(i2 & i3);
        window.clearFlags(i & i3);
        activity.setRequestedOrientation(this.mRequestedOrientation);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mStatusBarColor);
        parcel.writeInt(this.mNavigationBarColor);
        parcel.writeInt(this.mSystemUiVisibility);
        parcel.writeInt(this.mSoftInputMode);
        parcel.writeInt(this.mWindowFlags);
        parcel.writeInt(this.mRequestedOrientation);
    }
}
