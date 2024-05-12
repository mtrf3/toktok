package com.bytedance.android.live.design.view.sheet;

import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class SheetOptions implements Parcelable {
    public static final Parcelable.Creator<SheetOptions> CREATOR = new IDCreatorS45S0000000(41);
    public static SheetOptions LJLIL;
    public boolean closePerceptible;
    public int closeTintColor;
    public boolean closeTintColorSet;
    public int cornerRadius;
    public boolean draggable;
    public boolean fullscreenEnabled;
    public int height;
    public float heightRatio;
    public boolean isHeaderFloating;
    public int maxHeight;
    public float maxHeightRatio;
    public boolean navigateUpPerceptible;
    public int navigateUpTintColor;
    public boolean navigateUpTintColorSet;
    public int sheetStyle;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean LIZ() {
        int i = this.sheetStyle;
        if (i == 2 || i == 1) {
            return true;
        }
        return false;
    }

    public SheetOptions() {
        this.height = -1;
        this.maxHeight = -1;
        this.cornerRadius = -1;
        this.draggable = true;
        LIZIZ(0);
    }

    public SheetOptions(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        this.height = -1;
        this.maxHeight = -1;
        this.cornerRadius = -1;
        this.draggable = true;
        this.sheetStyle = parcel.readInt();
        this.height = parcel.readInt();
        this.heightRatio = parcel.readFloat();
        this.maxHeight = parcel.readInt();
        this.maxHeightRatio = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.draggable = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.fullscreenEnabled = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.closePerceptible = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.navigateUpPerceptible = z4;
        this.navigateUpTintColor = parcel.readInt();
        this.closeTintColor = parcel.readInt();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.navigateUpTintColorSet = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.closeTintColorSet = z6;
        this.isHeaderFloating = parcel.readByte() != 0;
        this.cornerRadius = parcel.readInt();
    }

    public final void LIZIZ(int i) {
        this.sheetStyle = i;
        if (i == 0) {
            this.heightRatio = 0.0f;
            this.maxHeightRatio = 0.6f;
        } else if (i == 1) {
            this.heightRatio = 0.7f;
            this.maxHeightRatio = 0.0f;
        } else {
            if (i != 2) {
                return;
            }
            this.heightRatio = 0.6f;
            this.maxHeightRatio = 0.0f;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.sheetStyle);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.heightRatio);
        parcel.writeInt(this.maxHeight);
        parcel.writeFloat(this.maxHeightRatio);
        parcel.writeByte(this.draggable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.fullscreenEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.closePerceptible ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.navigateUpPerceptible ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.navigateUpTintColor);
        parcel.writeInt(this.closeTintColor);
        parcel.writeByte(this.navigateUpTintColorSet ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.closeTintColorSet ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isHeaderFloating ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.cornerRadius);
    }
}
