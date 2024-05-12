package com.ss.android.ugc.aweme.settings;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SparkSwitchSettingsExt5Bean extends F9E {

    @InterfaceC65349Pkn("allowList")
    public final List<String> allowList;

    @InterfaceC65349Pkn("denyList")
    public final List<String> denyList;

    public SparkSwitchSettingsExt5Bean() {
        this(null, null, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.allowList, this.denyList};
    }

    public SparkSwitchSettingsExt5Bean(List<String> allowList, List<String> denyList) {
        o.LJIIIZ(allowList, "allowList");
        o.LJIIIZ(denyList, "denyList");
        this.allowList = allowList;
        this.denyList = denyList;
    }

    public SparkSwitchSettingsExt5Bean(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
