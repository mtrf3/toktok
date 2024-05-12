package com.ss.android.ugc.tiktok.security.csrf;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BlockRuleBean extends F9E {

    @InterfaceC65349Pkn("prefix")
    public final String prefix;

    @InterfaceC65349Pkn("suffix")
    public final String suffix;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.prefix, this.suffix};
    }

    public BlockRuleBean(String prefix, String suffix) {
        o.LJIIIZ(prefix, "prefix");
        o.LJIIIZ(suffix, "suffix");
        this.prefix = prefix;
        this.suffix = suffix;
    }
}
