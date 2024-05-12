package com.bytedance.helios.api.config;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class CustomAnchorConfig {

    @InterfaceC65349Pkn("DetectDelay")
    public final long detectDelay;

    @InterfaceC65349Pkn("DisabledCaseIds")
    public final String[] disabledCaseId;

    @InterfaceC65349Pkn("Enabled")
    public final boolean enabled;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomAnchorConfig() {
        this(false, 0L, null, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAnchorConfig)) {
            return false;
        }
        CustomAnchorConfig customAnchorConfig = (CustomAnchorConfig) obj;
        return this.enabled == customAnchorConfig.enabled && this.detectDelay == customAnchorConfig.detectDelay && o.LJ(this.disabledCaseId, customAnchorConfig.disabledCaseId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        long j = this.detectDelay;
        int i = ((r0 * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String[] strArr = this.disabledCaseId;
        return i + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomAnchorConfig(enabled=");
        LIZ.append(this.enabled);
        LIZ.append(", detectDelay=");
        LIZ.append(this.detectDelay);
        LIZ.append(", disabledCaseId=");
        return JBR.LJFF(LIZ, Arrays.toString(this.disabledCaseId), ")", LIZ);
    }

    public CustomAnchorConfig(boolean z, long j, String[] disabledCaseId) {
        o.LJIIIZ(disabledCaseId, "disabledCaseId");
        this.enabled = z;
        this.detectDelay = j;
        this.disabledCaseId = disabledCaseId;
    }

    public /* synthetic */ CustomAnchorConfig(boolean z, long j, String[] strArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 2000L : j, (i & 4) != 0 ? new String[0] : strArr);
    }
}
