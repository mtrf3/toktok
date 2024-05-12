package com.ss.android.ugc.cut_ui;

import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.cut_ui.ItemCrop;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ItemCrop extends F9E implements Parcelable {
    public static final Parcelable.Creator<ItemCrop> CREATOR = new Parcelable.Creator<ItemCrop>() { // from class: X.5Rb
        @Override // android.os.Parcelable.Creator
        public final ItemCrop createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new ItemCrop(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemCrop[] newArray(int i) {
            return new ItemCrop[i];
        }
    };
    public final float lowerRightX;
    public final float lowerRightY;
    public final float upperLeftX;
    public final float upperLeftY;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.upperLeftX), Float.valueOf(this.upperLeftY), Float.valueOf(this.lowerRightX), Float.valueOf(this.lowerRightY)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeFloat(this.upperLeftX);
        out.writeFloat(this.upperLeftY);
        out.writeFloat(this.lowerRightX);
        out.writeFloat(this.lowerRightY);
    }

    public ItemCrop(float f, float f2, float f3, float f4) {
        this.upperLeftX = f;
        this.upperLeftY = f2;
        this.lowerRightX = f3;
        this.lowerRightY = f4;
    }
}
