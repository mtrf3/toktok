package com.ss.android.ugc.aweme.creative.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CutSameMediaItemCrop;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CutSameMediaItemCrop extends F9E implements Parcelable {
    public static final Parcelable.Creator<CutSameMediaItemCrop> CREATOR = new Parcelable.Creator<CutSameMediaItemCrop>() { // from class: X.6r2
        @Override // android.os.Parcelable.Creator
        public final CutSameMediaItemCrop createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new CutSameMediaItemCrop(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final CutSameMediaItemCrop[] newArray(int i) {
            return new CutSameMediaItemCrop[i];
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CutSameMediaItemCrop() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.CutSameMediaItemCrop.<init>():void");
    }

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

    public CutSameMediaItemCrop(float f, float f2, float f3, float f4) {
        this.upperLeftX = f;
        this.upperLeftY = f2;
        this.lowerRightX = f3;
        this.lowerRightY = f4;
    }

    public /* synthetic */ CutSameMediaItemCrop(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }
}
