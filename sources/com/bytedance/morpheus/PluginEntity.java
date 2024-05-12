package com.bytedance.morpheus;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PluginEntity {

    @InterfaceC65349Pkn("aabName")
    public final String aabName;

    @InterfaceC65349Pkn("packageName")
    public final String packageName;

    public final String getAabName() {
        return this.aabName;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public PluginEntity(String packageName, String aabName) {
        o.LJIIIZ(packageName, "packageName");
        o.LJIIIZ(aabName, "aabName");
        this.packageName = packageName;
        this.aabName = aabName;
    }
}
