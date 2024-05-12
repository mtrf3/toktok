package com.ss.android.ugc.tiktok.seclink.impl.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SecLinkConfigItem extends F9E {

    @InterfaceC65349Pkn("pattern")
    public String pattern;

    @InterfaceC65349Pkn("type")
    public int type;

    /* JADX WARN: Multi-variable type inference failed */
    public SecLinkConfigItem() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.pattern, Integer.valueOf(this.type)};
    }

    public SecLinkConfigItem(String pattern, int i) {
        o.LJIIIZ(pattern, "pattern");
        this.pattern = pattern;
        this.type = i;
    }

    public /* synthetic */ SecLinkConfigItem(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i);
    }
}
