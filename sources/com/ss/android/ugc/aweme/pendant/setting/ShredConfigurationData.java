package com.ss.android.ugc.aweme.pendant.setting;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ShredConfigurationData {

    @InterfaceC65349Pkn("fragment_display_switch")
    public final boolean twinkleEnabled;

    @InterfaceC65349Pkn("vv_of_fragments")
    public final int[] vvList;

    public static /* synthetic */ ShredConfigurationData copy$default(ShredConfigurationData shredConfigurationData, boolean z, int[] iArr, int i, Object obj) {
        if ((i & 1) != 0) {
            z = shredConfigurationData.twinkleEnabled;
        }
        if ((i & 2) != 0) {
            iArr = shredConfigurationData.vvList;
        }
        return shredConfigurationData.copy(z, iArr);
    }

    public final ShredConfigurationData copy(boolean z, int[] vvList) {
        o.LJIIIZ(vvList, "vvList");
        return new ShredConfigurationData(z, vvList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShredConfigurationData)) {
            return false;
        }
        ShredConfigurationData shredConfigurationData = (ShredConfigurationData) obj;
        return this.twinkleEnabled == shredConfigurationData.twinkleEnabled && o.LJ(this.vvList, shredConfigurationData.vvList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public int hashCode() {
        boolean z = this.twinkleEnabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return Arrays.hashCode(this.vvList) + (r0 * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShredConfigurationData(twinkleEnabled=");
        LIZ.append(this.twinkleEnabled);
        LIZ.append(", vvList=");
        LIZ.append(Arrays.toString(this.vvList));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean getTwinkleEnabled() {
        return this.twinkleEnabled;
    }

    public final int[] getVvList() {
        return this.vvList;
    }

    public ShredConfigurationData(boolean z, int[] vvList) {
        o.LJIIIZ(vvList, "vvList");
        this.twinkleEnabled = z;
        this.vvList = vvList;
    }
}
