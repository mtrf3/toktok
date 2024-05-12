package com.ss.android.ugc.cut_ui.player;

import X.ETZ;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CutSameVideoConfig extends F9E implements Parcelable {
    public static final Parcelable.Creator<CutSameVideoConfig> CREATOR = new ETZ();
    public final String bitRateJsonStr;
    public final int minInWidthAndHeight;
    public final boolean supportHwEncoder;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.minInWidthAndHeight), this.bitRateJsonStr, Boolean.valueOf(this.supportHwEncoder)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.minInWidthAndHeight);
        out.writeString(this.bitRateJsonStr);
        out.writeInt(this.supportHwEncoder ? 1 : 0);
    }

    public CutSameVideoConfig(int i, String bitRateJsonStr, boolean z) {
        o.LJIIIZ(bitRateJsonStr, "bitRateJsonStr");
        this.minInWidthAndHeight = i;
        this.bitRateJsonStr = bitRateJsonStr;
        this.supportHwEncoder = z;
    }
}
