package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ModuleLayout {

    @InterfaceC65349Pkn("module_config")
    public final Map<String, String> module_config;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModuleLayout) && o.LJ(this.module_config, ((ModuleLayout) obj).module_config);
    }

    public final int hashCode() {
        Map<String, String> map = this.module_config;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ModuleLayout(module_config=");
        return C15890jp.LIZ(LIZ, this.module_config, ')', LIZ);
    }

    public ModuleLayout(Map<String, String> map) {
        this.module_config = map;
    }
}
