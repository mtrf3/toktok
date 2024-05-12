package com.ss.android.ugc.aweme.creative.model.audio;

import X.GPV;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetail;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class MatchDetail implements Parcelable {
    public static final Parcelable.Creator<MatchDetail> CREATOR = new Parcelable.Creator<MatchDetail>() { // from class: X.6Em
        @Override // android.os.Parcelable.Creator
        public final MatchDetail createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new MatchDetail(parcel.readLong(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final MatchDetail[] newArray(int i) {
            return new MatchDetail[i];
        }
    };

    @GPV
    @InterfaceC65349Pkn("duration")
    public final double duration;

    @GPV
    @InterfaceC65349Pkn("music_id")
    public final long musicId;

    @GPV
    @InterfaceC65349Pkn("start")
    public final double start;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MatchDetail() {
        /*
            r9 = this;
            r1 = 0
            r3 = 0
            r7 = 7
            r8 = 0
            r0 = r9
            r5 = r3
            r0.<init>(r1, r3, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.audio.MatchDetail.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.musicId);
        out.writeDouble(this.start);
        out.writeDouble(this.duration);
    }

    public MatchDetail(long j, double d, double d2) {
        this.musicId = j;
        this.start = d;
        this.duration = d2;
    }

    public /* synthetic */ MatchDetail(long j, double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d, (i & 4) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d2);
    }
}
