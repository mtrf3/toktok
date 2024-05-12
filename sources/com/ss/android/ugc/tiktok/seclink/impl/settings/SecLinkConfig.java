package com.ss.android.ugc.tiktok.seclink.impl.settings;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SecLinkConfig {

    @InterfaceC65349Pkn("blockList")
    public List<SecLinkConfigItem> blockList;

    @InterfaceC65349Pkn("handleOverrideUrlScenes")
    public List<String> handleOverrideUrlScenes;

    /* JADX WARN: Multi-variable type inference failed */
    public SecLinkConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecLinkConfig)) {
            return false;
        }
        SecLinkConfig secLinkConfig = (SecLinkConfig) obj;
        return o.LJ(this.handleOverrideUrlScenes, secLinkConfig.handleOverrideUrlScenes) && o.LJ(this.blockList, secLinkConfig.blockList);
    }

    public final int hashCode() {
        List<String> list = this.handleOverrideUrlScenes;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<SecLinkConfigItem> list2 = this.blockList;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SecLinkConfig(handleOverrideUrlScenes=");
        LIZ.append(this.handleOverrideUrlScenes);
        LIZ.append(", blockList=");
        return C1NE.LIZIZ(LIZ, this.blockList, ')', LIZ);
    }

    public SecLinkConfig(List<String> list, List<SecLinkConfigItem> list2) {
        this.handleOverrideUrlScenes = list;
        this.blockList = list2;
    }

    public /* synthetic */ SecLinkConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
