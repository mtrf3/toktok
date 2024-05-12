package com.ss.android.ugc.aweme.mvtheme;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.mvtheme.MvItemCrop;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class MvItemCrop extends F9E implements Serializable, Parcelable {
    public static final Parcelable.Creator<MvItemCrop> CREATOR = new Parcelable.Creator<MvItemCrop>() { // from class: X.6r3
        @Override // android.os.Parcelable.Creator
        public final MvItemCrop createFromParcel(Parcel in) {
            o.LJIIIZ(in, "in");
            return new MvItemCrop(in.readFloat(), in.readFloat(), in.readFloat(), in.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final MvItemCrop[] newArray(int i) {
            return new MvItemCrop[i];
        }
    };

    @InterfaceC65349Pkn("lowerRightX")
    public final float lowerRightX;

    @InterfaceC65349Pkn("lowerRightY")
    public final float lowerRightY;

    @InterfaceC65349Pkn("upperLeftX")
    public final float upperLeftX;

    @InterfaceC65349Pkn("upperLeftY")
    public final float upperLeftY;

    public static /* synthetic */ MvItemCrop copy$default(MvItemCrop mvItemCrop, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = mvItemCrop.upperLeftX;
        }
        if ((i & 2) != 0) {
            f2 = mvItemCrop.upperLeftY;
        }
        if ((i & 4) != 0) {
            f3 = mvItemCrop.lowerRightX;
        }
        if ((i & 8) != 0) {
            f4 = mvItemCrop.lowerRightY;
        }
        return mvItemCrop.copy(f, f2, f3, f4);
    }

    public final MvItemCrop copy(float f, float f2, float f3, float f4) {
        return new MvItemCrop(f, f2, f3, f4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Float.valueOf(this.upperLeftX), Float.valueOf(this.upperLeftY), Float.valueOf(this.lowerRightX), Float.valueOf(this.lowerRightY)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeFloat(this.upperLeftX);
        parcel.writeFloat(this.upperLeftY);
        parcel.writeFloat(this.lowerRightX);
        parcel.writeFloat(this.lowerRightY);
    }

    public final float getLowerRightX() {
        return this.lowerRightX;
    }

    public final float getLowerRightY() {
        return this.lowerRightY;
    }

    public final float getUpperLeftX() {
        return this.upperLeftX;
    }

    public final float getUpperLeftY() {
        return this.upperLeftY;
    }

    public MvItemCrop(float f, float f2, float f3, float f4) {
        this.upperLeftX = f;
        this.upperLeftY = f2;
        this.lowerRightX = f3;
        this.lowerRightY = f4;
    }
}
