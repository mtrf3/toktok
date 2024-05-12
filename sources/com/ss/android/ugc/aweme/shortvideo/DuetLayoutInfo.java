package com.ss.android.ugc.aweme.shortvideo;

import X.F9E;
import X.H9X;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DuetLayoutInfo extends F9E implements Parcelable {
    public static final Parcelable.Creator<DuetLayoutInfo> CREATOR = new H9X();
    public final int type;
    public final float x1;
    public final float x2;
    public final float y1;
    public final float y2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DuetLayoutInfo() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 31
            r7 = 0
            r0 = r8
            r3 = r2
            r4 = r2
            r5 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.DuetLayoutInfo.<init>():void");
    }

    public static /* synthetic */ DuetLayoutInfo copy$default(DuetLayoutInfo duetLayoutInfo, int i, float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = duetLayoutInfo.type;
        }
        if ((i2 & 2) != 0) {
            f = duetLayoutInfo.x1;
        }
        if ((i2 & 4) != 0) {
            f2 = duetLayoutInfo.y1;
        }
        if ((i2 & 8) != 0) {
            f3 = duetLayoutInfo.x2;
        }
        if ((i2 & 16) != 0) {
            f4 = duetLayoutInfo.y2;
        }
        return duetLayoutInfo.copy(i, f, f2, f3, f4);
    }

    public final DuetLayoutInfo copy(int i, float f, float f2, float f3, float f4) {
        return new DuetLayoutInfo(i, f, f2, f3, f4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.type), Float.valueOf(this.x1), Float.valueOf(this.y1), Float.valueOf(this.x2), Float.valueOf(this.y2)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeInt(this.type);
        parcel.writeFloat(this.x1);
        parcel.writeFloat(this.y1);
        parcel.writeFloat(this.x2);
        parcel.writeFloat(this.y2);
    }

    public final int getType() {
        return this.type;
    }

    public final float getX1() {
        return this.x1;
    }

    public final float getX2() {
        return this.x2;
    }

    public final float getY1() {
        return this.y1;
    }

    public final float getY2() {
        return this.y2;
    }

    public DuetLayoutInfo(int i, float f, float f2, float f3, float f4) {
        this.type = i;
        this.x1 = f;
        this.y1 = f2;
        this.x2 = f3;
        this.y2 = f4;
    }

    public /* synthetic */ DuetLayoutInfo(int i, float f, float f2, float f3, float f4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? 0.0f : f, (i2 & 4) != 0 ? 0.0f : f2, (i2 & 8) != 0 ? 0.0f : f3, (i2 & 16) == 0 ? f4 : 0.0f);
    }
}
