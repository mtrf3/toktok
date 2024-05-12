package com.ss.android.ugc.aweme.creative.model.video2sticker;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.video2sticker.VideoTimeTrimData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VideoTimeTrimData extends F9E implements Parcelable {
    public static final Parcelable.Creator<VideoTimeTrimData> CREATOR = new Parcelable.Creator<VideoTimeTrimData>() { // from class: X.5mB
        @Override // android.os.Parcelable.Creator
        public final VideoTimeTrimData createFromParcel(Parcel parcel) {
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new VideoTimeTrimData(readLong, readLong2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTimeTrimData[] newArray(int i) {
            return new VideoTimeTrimData[i];
        }
    };

    @InterfaceC65349Pkn("end_time")
    public long endTime;

    @InterfaceC65349Pkn("is_single_frame")
    public boolean isSingleFrame;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoTimeTrimData() {
        /*
            r8 = this;
            r1 = 0
            r5 = 0
            r6 = 7
            r7 = 0
            r0 = r8
            r3 = r1
            r0.<init>(r1, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.video2sticker.VideoTimeTrimData.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.startTime), Long.valueOf(this.endTime), Boolean.valueOf(this.isSingleFrame)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.startTime);
        out.writeLong(this.endTime);
        out.writeInt(this.isSingleFrame ? 1 : 0);
    }

    public VideoTimeTrimData(long j, long j2, boolean z) {
        this.startTime = j;
        this.endTime = j2;
        this.isSingleFrame = z;
    }

    public /* synthetic */ VideoTimeTrimData(long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 2500L : j2, (i & 4) != 0 ? false : z);
    }
}
