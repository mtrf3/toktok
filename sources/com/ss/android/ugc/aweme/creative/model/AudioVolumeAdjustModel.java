package com.ss.android.ugc.aweme.creative.model;

import X.HBC;
import X.HBH;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AudioVolumeAdjustModel implements Parcelable {

    @InterfaceC65349Pkn("audio_volume_dbrange")
    public double dbRange;
    public static final HBH Companion = new HBH();
    public static final Parcelable.Creator<AudioVolumeAdjustModel> CREATOR = new HBC();

    public AudioVolumeAdjustModel() {
        this(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeDouble(this.dbRange);
    }

    public AudioVolumeAdjustModel(double d) {
        this.dbRange = d;
    }

    public /* synthetic */ AudioVolumeAdjustModel(double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1.0d : d);
    }
}
