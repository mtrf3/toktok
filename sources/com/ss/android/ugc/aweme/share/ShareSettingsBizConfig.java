package com.ss.android.ugc.aweme.share;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareSettingsBizConfig {

    @InterfaceC65349Pkn("enable_silent_share_lemon8")
    public final Boolean enableSilentShareLemon8;

    /* JADX WARN: Multi-variable type inference failed */
    public ShareSettingsBizConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShareSettingsBizConfig) && o.LJ(this.enableSilentShareLemon8, ((ShareSettingsBizConfig) obj).enableSilentShareLemon8);
    }

    public final int hashCode() {
        Boolean bool = this.enableSilentShareLemon8;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShareSettingsBizConfig(enableSilentShareLemon8=");
        return C78920UyC.LIZIZ(LIZ, this.enableSilentShareLemon8, ')', LIZ);
    }

    public ShareSettingsBizConfig(Boolean bool) {
        this.enableSilentShareLemon8 = bool;
    }

    public /* synthetic */ ShareSettingsBizConfig(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool);
    }
}
