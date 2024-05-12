package com.ss.android.ugc.aweme.tools.mvtemplate.preview.prepare;

import X.C44622HfG;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VECompileBpsConfig extends F9E implements Parcelable {
    public static final C44622HfG CREATOR = new C44622HfG();

    @InterfaceC65349Pkn("bps_for_1080p")
    public final int bpsFor1080p;

    @InterfaceC65349Pkn("bps_for_720p")
    public final int bpsFor720p;

    @InterfaceC65349Pkn("use_material_bps")
    public final boolean useMaterialBps;

    /* JADX WARN: Multi-variable type inference failed */
    public VECompileBpsConfig() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.bpsFor1080p), Integer.valueOf(this.bpsFor720p), Boolean.valueOf(this.useMaterialBps)};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VECompileBpsConfig(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readByte() == 1);
        o.LJIIIZ(parcel, "parcel");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeInt(this.bpsFor1080p);
        dest.writeInt(this.bpsFor720p);
        dest.writeByte(this.useMaterialBps ? (byte) 1 : (byte) 0);
    }

    public VECompileBpsConfig(int i, int i2, boolean z) {
        this.bpsFor1080p = i;
        this.bpsFor720p = i2;
        this.useMaterialBps = z;
    }

    public /* synthetic */ VECompileBpsConfig(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 16777216 : i, (i3 & 2) != 0 ? 10485760 : i2, (i3 & 4) != 0 ? false : z);
    }
}
