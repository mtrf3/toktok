package com.ss.android.ugc.aweme.compliance.api.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class HeaderParamConfigSetting {

    @InterfaceC65349Pkn("custom")
    public final List<HeaderParamConfig> custom;

    /* renamed from: default, reason: not valid java name */
    @InterfaceC65349Pkn("default")
    public final HeaderParamConfig f18default;

    /* JADX WARN: Multi-variable type inference failed */
    public HeaderParamConfigSetting() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderParamConfigSetting)) {
            return false;
        }
        HeaderParamConfigSetting headerParamConfigSetting = (HeaderParamConfigSetting) obj;
        return o.LJ(this.f18default, headerParamConfigSetting.f18default) && o.LJ(this.custom, headerParamConfigSetting.custom);
    }

    public final int hashCode() {
        HeaderParamConfig headerParamConfig = this.f18default;
        int hashCode = (headerParamConfig == null ? 0 : headerParamConfig.hashCode()) * 31;
        List<HeaderParamConfig> list = this.custom;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HeaderParamConfigSetting(default=");
        LIZ.append(this.f18default);
        LIZ.append(", custom=");
        return C1NE.LIZIZ(LIZ, this.custom, ')', LIZ);
    }

    public HeaderParamConfigSetting(HeaderParamConfig headerParamConfig, List<HeaderParamConfig> list) {
        this.f18default = headerParamConfig;
        this.custom = list;
    }

    public /* synthetic */ HeaderParamConfigSetting(HeaderParamConfig headerParamConfig, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : headerParamConfig, (i & 2) != 0 ? null : list);
    }
}
