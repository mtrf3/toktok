package com.ss.android.ugc.aweme.shortvideo.jsbopenrecord;

import X.F9E;
import X.GPV;
import X.HCT;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class OptionalComponents extends F9E implements Parcelable {
    public static final Parcelable.Creator<OptionalComponents> CREATOR = new HCT();

    @GPV
    public final boolean albumEntrance;

    @GPV
    public final boolean chooseMusicEntrance;

    @GPV
    public final boolean effectPanelEntrance;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.chooseMusicEntrance), Boolean.valueOf(this.effectPanelEntrance), Boolean.valueOf(this.albumEntrance)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.chooseMusicEntrance ? 1 : 0);
        out.writeInt(this.effectPanelEntrance ? 1 : 0);
        out.writeInt(this.albumEntrance ? 1 : 0);
    }

    public OptionalComponents(boolean z, boolean z2, boolean z3) {
        this.chooseMusicEntrance = z;
        this.effectPanelEntrance = z2;
        this.albumEntrance = z3;
    }
}
