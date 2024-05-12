package com.bytedance.ies.powerpreload.task;

import X.C57096May;
import X.C62850Ola;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TaskTraceMetric implements Parcelable {
    public static final C57096May CREATOR = new C57096May();
    public long initTime = SystemClock.elapsedRealtime();
    public long shootEndTime;
    public long shootStartTime;
    public long taskExecuteEndTime;
    public long taskExecuteStartTime;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initTime=");
        LIZ.append(this.initTime);
        LIZ.append("&taskExecuteStartTime=");
        C62850Ola.LJIIIIZZ(LIZ, this.taskExecuteStartTime, '&', "taskExecuteEndTime=");
        LIZ.append(this.taskExecuteEndTime);
        LIZ.append("&shootStartTime=");
        LIZ.append(this.shootStartTime);
        LIZ.append("&shootEndTime=");
        LIZ.append(this.shootEndTime);
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIJ(parcel, "parcel");
        parcel.writeLong(this.initTime);
        parcel.writeLong(this.taskExecuteStartTime);
        parcel.writeLong(this.taskExecuteEndTime);
        parcel.writeLong(this.shootStartTime);
        parcel.writeLong(this.shootEndTime);
    }
}
