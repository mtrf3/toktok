package com.ss.android.ugc.aweme.creative.model.audio;

import X.GPV;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.creative.model.audio.MatchPeriod;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class MatchPeriod implements Parcelable {
    public static final Parcelable.Creator<MatchPeriod> CREATOR = new Parcelable.Creator<MatchPeriod>() { // from class: X.6Lr
        @Override // android.os.Parcelable.Creator
        public final MatchPeriod createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new MatchPeriod(parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final MatchPeriod[] newArray(int i) {
            return new MatchPeriod[i];
        }
    };

    @GPV
    @InterfaceC65349Pkn("match_duration")
    public final double matchDuration;

    @GPV
    @InterfaceC65349Pkn("match_offset")
    public final double matchOffset;

    @GPV
    @InterfaceC65349Pkn("start_offset")
    public final double startOffset;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MatchPeriod() {
        /*
            r9 = this;
            r1 = 0
            r7 = 7
            r8 = 0
            r0 = r9
            r3 = r1
            r5 = r1
            r0.<init>(r1, r3, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.audio.MatchPeriod.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeDouble(this.startOffset);
        out.writeDouble(this.matchOffset);
        out.writeDouble(this.matchDuration);
    }

    public MatchPeriod(double d, double d2, double d3) {
        this.startOffset = d;
        this.matchOffset = d2;
        this.matchDuration = d3;
    }

    public /* synthetic */ MatchPeriod(double d, double d2, double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d, (i & 2) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d2, (i & 4) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d3);
    }
}
