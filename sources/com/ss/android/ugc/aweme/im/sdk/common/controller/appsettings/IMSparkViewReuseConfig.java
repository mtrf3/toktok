package com.ss.android.ugc.aweme.im.sdk.common.controller.appsettings;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class IMSparkViewReuseConfig {

    @InterfaceC65349Pkn("allow_schema_list")
    public final ArrayList<String> allowList;

    @InterfaceC65349Pkn("deny_schema_list")
    public final ArrayList<String> denyList;

    @InterfaceC65349Pkn("reuse_enable")
    public final boolean enable;

    @InterfaceC65349Pkn("expired_time_in_seconds")
    public final int expiredTimeInSeconds;

    @InterfaceC65349Pkn("is_allow_all_schema")
    public final boolean isAllowAllSchema;

    @InterfaceC65349Pkn("reuse_volume")
    public final int volume;

    /* JADX WARN: Multi-variable type inference failed */
    public IMSparkViewReuseConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMSparkViewReuseConfig)) {
            return false;
        }
        IMSparkViewReuseConfig iMSparkViewReuseConfig = (IMSparkViewReuseConfig) obj;
        return this.enable == iMSparkViewReuseConfig.enable && this.volume == iMSparkViewReuseConfig.volume && this.expiredTimeInSeconds == iMSparkViewReuseConfig.expiredTimeInSeconds && this.isAllowAllSchema == iMSparkViewReuseConfig.isAllowAllSchema && o.LJ(this.allowList, iMSparkViewReuseConfig.allowList) && o.LJ(this.denyList, iMSparkViewReuseConfig.denyList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public final int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((((((r0 * 31) + this.volume) * 31) + this.expiredTimeInSeconds) * 31) + (this.isAllowAllSchema ? 1 : 0)) * 31;
        ArrayList<String> arrayList = this.allowList;
        int hashCode = (i + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<String> arrayList2 = this.denyList;
        return hashCode + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMSparkViewReuseConfig(enable=");
        LIZ.append(this.enable);
        LIZ.append(", volume=");
        LIZ.append(this.volume);
        LIZ.append(", expiredTimeInSeconds=");
        LIZ.append(this.expiredTimeInSeconds);
        LIZ.append(", isAllowAllSchema=");
        LIZ.append(this.isAllowAllSchema);
        LIZ.append(", allowList=");
        LIZ.append(this.allowList);
        LIZ.append(", denyList=");
        LIZ.append(this.denyList);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public IMSparkViewReuseConfig(boolean z, int i, int i2, boolean z2, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.enable = z;
        this.volume = i;
        this.expiredTimeInSeconds = i2;
        this.isAllowAllSchema = z2;
        this.allowList = arrayList;
        this.denyList = arrayList2;
    }

    public /* synthetic */ IMSparkViewReuseConfig(boolean z, int i, int i2, boolean z2, ArrayList arrayList, ArrayList arrayList2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 10 : i, (i3 & 4) != 0 ? -1 : i2, (i3 & 8) != 0 ? true : z2, (i3 & 16) != 0 ? null : arrayList, (i3 & 32) == 0 ? arrayList2 : null);
    }
}
