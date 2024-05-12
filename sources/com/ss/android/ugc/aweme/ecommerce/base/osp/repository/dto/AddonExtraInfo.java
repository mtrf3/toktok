package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddonExtraInfo implements Serializable {

    @InterfaceC65349Pkn("da_info")
    public final AddonDaInfo daInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public AddonExtraInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AddonExtraInfo copy$default(AddonExtraInfo addonExtraInfo, AddonDaInfo addonDaInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            addonDaInfo = addonExtraInfo.daInfo;
        }
        return addonExtraInfo.copy(addonDaInfo);
    }

    public final AddonExtraInfo copy(AddonDaInfo addonDaInfo) {
        return new AddonExtraInfo(addonDaInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddonExtraInfo) && o.LJ(this.daInfo, ((AddonExtraInfo) obj).daInfo);
    }

    public int hashCode() {
        AddonDaInfo addonDaInfo = this.daInfo;
        if (addonDaInfo == null) {
            return 0;
        }
        return addonDaInfo.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddonExtraInfo(daInfo=");
        LIZ.append(this.daInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final AddonDaInfo getDaInfo() {
        return this.daInfo;
    }

    public AddonExtraInfo(AddonDaInfo addonDaInfo) {
        this.daInfo = addonDaInfo;
    }

    public /* synthetic */ AddonExtraInfo(AddonDaInfo addonDaInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : addonDaInfo);
    }
}
