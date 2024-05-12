package com.ss.ugc.android.editor.components.base.transition;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.android.editor.components.base.transition.DavinciViewPositionRect;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class DavinciViewPositionRect implements Parcelable {
    public static final Parcelable.Creator<DavinciViewPositionRect> CREATOR = new Parcelable.Creator<DavinciViewPositionRect>() { // from class: X.5RW
        @Override // android.os.Parcelable.Creator
        public final DavinciViewPositionRect createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new DavinciViewPositionRect(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final DavinciViewPositionRect[] newArray(int i) {
            return new DavinciViewPositionRect[i];
        }
    };
    public int bottom;
    public int left;
    public float ratio;
    public int right;
    public int top;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.left);
        out.writeInt(this.right);
        out.writeInt(this.top);
        out.writeInt(this.bottom);
        out.writeFloat(this.ratio);
    }

    public DavinciViewPositionRect(int i, int i2, int i3, int i4, float f) {
        this.left = i;
        this.right = i2;
        this.top = i3;
        this.bottom = i4;
        this.ratio = f;
    }
}
