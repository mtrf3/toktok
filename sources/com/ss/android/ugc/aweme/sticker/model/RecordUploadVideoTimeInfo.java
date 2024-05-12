package com.ss.android.ugc.aweme.sticker.model;

import X.HCD;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class RecordUploadVideoTimeInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<RecordUploadVideoTimeInfo> CREATOR = new HCD();

    @InterfaceC65349Pkn("bgv_end_time")
    public final long endTime;

    @InterfaceC65349Pkn("bgv_start_time")
    public final long startTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecordUploadVideoTimeInfo() {
        /*
            r7 = this;
            r1 = 0
            r5 = 3
            r6 = 0
            r0 = r7
            r3 = r1
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.model.RecordUploadVideoTimeInfo.<init>():void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public RecordUploadVideoTimeInfo(long j, long j2) {
        this.startTime = j;
        this.endTime = j2;
    }

    public /* synthetic */ RecordUploadVideoTimeInfo(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
    }
}
