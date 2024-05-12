package com.ss.android.ugc.aweme.editSticker.model;

import X.C143075jT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.model.DrawRect;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class DrawRect implements Parcelable, Serializable {
    public float bottom;
    public float left;
    public float right;
    public float top;
    public static final C143075jT Companion = new Object() { // from class: X.5jT
    };
    public static final Parcelable.Creator<DrawRect> CREATOR = new Parcelable.Creator<DrawRect>() { // from class: X.5jS
        @Override // android.os.Parcelable.Creator
        public final DrawRect createFromParcel(Parcel in) {
            o.LJIIIZ(in, "in");
            return new DrawRect(in.readFloat(), in.readFloat(), in.readFloat(), in.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final DrawRect[] newArray(int i) {
            return new DrawRect[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeFloat(this.left);
        parcel.writeFloat(this.bottom);
        parcel.writeFloat(this.right);
        parcel.writeFloat(this.top);
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public final void setBottom(float f) {
        this.bottom = f;
    }

    public final void setLeft(float f) {
        this.left = f;
    }

    public final void setRight(float f) {
        this.right = f;
    }

    public final void setTop(float f) {
        this.top = f;
    }

    public DrawRect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.bottom = f2;
        this.right = f3;
        this.top = f4;
    }
}
