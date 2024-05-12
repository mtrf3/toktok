package com.ss.android.ugc.aweme.creatortools.tiktokseries;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SeriesSetting extends F9E {

    @InterfaceC65349Pkn("entry_schema")
    public final String schemaUrl;

    @InterfaceC65349Pkn("show_red_dot")
    public final boolean showRedDot;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.showRedDot), this.schemaUrl};
    }

    public SeriesSetting(boolean z, String schemaUrl) {
        o.LJIIIZ(schemaUrl, "schemaUrl");
        this.showRedDot = z;
        this.schemaUrl = schemaUrl;
    }
}
