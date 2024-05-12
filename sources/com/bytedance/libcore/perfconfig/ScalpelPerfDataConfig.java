package com.bytedance.libcore.perfconfig;

import X.C84289X6f;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ScalpelPerfDataConfig {

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("main_thread")
    public ScalpelPerfConfigItem mainThreadConfig;

    @InterfaceC65349Pkn("sub_thread")
    public ScalpelPerfConfigItem subThreadConfig;

    public ScalpelPerfDataConfig() {
        this(null, null, null, 7, null);
    }

    public final String getExtra() {
        return this.extra;
    }

    public final ScalpelPerfConfigItem getMainThreadConfig() {
        return this.mainThreadConfig;
    }

    public final ScalpelPerfConfigItem getSubThreadConfig() {
        return this.subThreadConfig;
    }

    public final void setExtra(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.extra = str;
    }

    public final void setMainThreadConfig(ScalpelPerfConfigItem scalpelPerfConfigItem) {
        o.LJIIIZ(scalpelPerfConfigItem, "<set-?>");
        this.mainThreadConfig = scalpelPerfConfigItem;
    }

    public final void setSubThreadConfig(ScalpelPerfConfigItem scalpelPerfConfigItem) {
        o.LJIIIZ(scalpelPerfConfigItem, "<set-?>");
        this.subThreadConfig = scalpelPerfConfigItem;
    }

    public ScalpelPerfDataConfig(ScalpelPerfConfigItem mainThreadConfig, ScalpelPerfConfigItem subThreadConfig, String extra) {
        o.LJIIIZ(mainThreadConfig, "mainThreadConfig");
        o.LJIIIZ(subThreadConfig, "subThreadConfig");
        o.LJIIIZ(extra, "extra");
        this.mainThreadConfig = mainThreadConfig;
        this.subThreadConfig = subThreadConfig;
        this.extra = extra;
    }

    public ScalpelPerfDataConfig(ScalpelPerfConfigItem scalpelPerfConfigItem, ScalpelPerfConfigItem scalpelPerfConfigItem2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C84289X6f.LIZ : scalpelPerfConfigItem, (i & 2) != 0 ? C84289X6f.LIZ : scalpelPerfConfigItem2, (i & 4) != 0 ? "" : str);
    }
}
