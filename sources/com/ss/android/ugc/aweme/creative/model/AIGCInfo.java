package com.ss.android.ugc.aweme.creative.model;

import X.C41748Ga0;
import X.F9E;
import X.GPV;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AIGCInfo extends F9E implements Parcelable {
    public static final Parcelable.Creator<AIGCInfo> CREATOR = new C41748Ga0();

    @InterfaceC65349Pkn("aigc_label_type")
    public int AIGCLabelType;

    @GPV
    public int AIGCSwitchStatusWhenCompile;

    @InterfaceC65349Pkn("manual_change_switch")
    public boolean manualChangeSwitch;

    /* JADX WARN: Multi-variable type inference failed */
    public AIGCInfo() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.AIGCLabelType), Boolean.valueOf(this.manualChangeSwitch), Integer.valueOf(this.AIGCSwitchStatusWhenCompile)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.AIGCLabelType);
        out.writeInt(this.manualChangeSwitch ? 1 : 0);
        out.writeInt(this.AIGCSwitchStatusWhenCompile);
    }

    public AIGCInfo(int i, boolean z, int i2) {
        this.AIGCLabelType = i;
        this.manualChangeSwitch = z;
        this.AIGCSwitchStatusWhenCompile = i2;
    }

    public /* synthetic */ AIGCInfo(int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 0 : i2);
    }
}
