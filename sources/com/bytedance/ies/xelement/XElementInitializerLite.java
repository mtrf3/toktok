package com.bytedance.ies.xelement;

import X.C221108m2;
import X.C5H3;
import X.C79991VaN;
import X.C79992VaO;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class XElementInitializerLite {
    public static final C79992VaO Companion = new C79992VaO();
    public static final C5H3 instance$delegate = C221108m2.LIZIZ(C79991VaN.LJLIL);
    public XElementConfigLite localConfig;

    public final XElementConfigLite getConfig() {
        XElementConfigLite xElementConfigLite = this.localConfig;
        if (xElementConfigLite != null) {
            return xElementConfigLite;
        }
        o.LJIJI("localConfig");
        throw null;
    }

    public XElementInitializerLite() {
    }

    public /* synthetic */ XElementInitializerLite(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void setConfig(XElementConfigLite value) {
        o.LJIIJ(value, "value");
        this.localConfig = value;
    }
}
