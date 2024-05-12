package com.ss.android.ugc.aweme.setting;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class IncentiveSetting extends F9E {

    @InterfaceC65349Pkn("creator_incentive_schema_url")
    public final String schemaUrl;

    @InterfaceC65349Pkn("show_red_dot")
    public final boolean showRedDot;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.schemaUrl, Boolean.valueOf(this.showRedDot)};
    }

    public IncentiveSetting(String schemaUrl, boolean z) {
        o.LJIIIZ(schemaUrl, "schemaUrl");
        this.schemaUrl = schemaUrl;
        this.showRedDot = z;
    }

    public /* synthetic */ IncentiveSetting(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
