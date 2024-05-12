package com.ss.android.ugc.aweme.shortvideo.edit;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class LoudnessBalanceParam extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<LoudnessBalanceParam> CREATOR = new Parcelable.Creator<LoudnessBalanceParam>() { // from class: X.5fK
        @Override // android.os.Parcelable.Creator
        public final LoudnessBalanceParam createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new LoudnessBalanceParam(parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final LoudnessBalanceParam[] newArray(int i) {
            return new LoudnessBalanceParam[i];
        }
    };

    @InterfaceC65349Pkn("avg_loudness")
    public double avgLoudness;

    @InterfaceC65349Pkn("bgm_loudness")
    public double bgmLoudness;

    @InterfaceC65349Pkn("peak_loudness")
    public double peakLoudness;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LoudnessBalanceParam() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam.<init>():void");
    }

    public static /* synthetic */ LoudnessBalanceParam copy$default(LoudnessBalanceParam loudnessBalanceParam, double d, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = loudnessBalanceParam.bgmLoudness;
        }
        if ((i & 2) != 0) {
            d2 = loudnessBalanceParam.peakLoudness;
        }
        if ((i & 4) != 0) {
            d3 = loudnessBalanceParam.avgLoudness;
        }
        return loudnessBalanceParam.copy(d, d2, d3);
    }

    public final LoudnessBalanceParam copy(double d, double d2, double d3) {
        return new LoudnessBalanceParam(d, d2, d3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Double.valueOf(this.bgmLoudness), Double.valueOf(this.peakLoudness), Double.valueOf(this.avgLoudness)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeDouble(this.bgmLoudness);
        out.writeDouble(this.peakLoudness);
        out.writeDouble(this.avgLoudness);
    }

    public final double getAvgLoudness() {
        return this.avgLoudness;
    }

    public final double getBgmLoudness() {
        return this.bgmLoudness;
    }

    public final double getPeakLoudness() {
        return this.peakLoudness;
    }

    public final void setAvgLoudness(double d) {
        this.avgLoudness = d;
    }

    public final void setBgmLoudness(double d) {
        this.bgmLoudness = d;
    }

    public final void setPeakLoudness(double d) {
        this.peakLoudness = d;
    }

    public LoudnessBalanceParam(double d, double d2, double d3) {
        this.bgmLoudness = d;
        this.peakLoudness = d2;
        this.avgLoudness = d3;
    }

    public /* synthetic */ LoudnessBalanceParam(double d, double d2, double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d, (i & 2) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d2, (i & 4) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d3);
    }
}
