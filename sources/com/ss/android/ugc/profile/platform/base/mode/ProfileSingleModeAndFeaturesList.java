package com.ss.android.ugc.profile.platform.base.mode;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileSingleModeAndFeaturesList extends F9E {

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("support_components")
    public final List<String> support_components;

    public ProfileSingleModeAndFeaturesList() {
        this(null, null, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.name, this.support_components};
    }

    public ProfileSingleModeAndFeaturesList(String name, List<String> support_components) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(support_components, "support_components");
        this.name = name;
        this.support_components = support_components;
    }

    public ProfileSingleModeAndFeaturesList(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "normal_mode" : str, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
