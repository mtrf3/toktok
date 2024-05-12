package com.ss.android.ugc.asve.recorder;

import X.C84008Wy4;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class ASMediaSegment extends F9E implements Parcelable {
    public static final C84008Wy4 CREATOR = new C84008Wy4();
    public final long duration;
    public final double speed;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.duration), Double.valueOf(this.speed)};
    }

    public ASMediaSegment(double d, long j) {
        this.duration = j;
        this.speed = d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeLong(this.duration);
        parcel.writeDouble(this.speed);
    }
}
