package com.ss.android.ugc.aweme.setting;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DeeplinkPersonalizationConfig extends F9E {

    @InterfaceC65349Pkn("url_config")
    public final List<PersonalizationModel> urlConfig;

    @InterfaceC65349Pkn("url_regex")
    public final String urlRegex;

    /* JADX WARN: Multi-variable type inference failed */
    public DeeplinkPersonalizationConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.urlRegex, this.urlConfig};
    }

    public DeeplinkPersonalizationConfig(String urlRegex, List<PersonalizationModel> urlConfig) {
        o.LJIIIZ(urlRegex, "urlRegex");
        o.LJIIIZ(urlConfig, "urlConfig");
        this.urlRegex = urlRegex;
        this.urlConfig = urlConfig;
    }

    public /* synthetic */ DeeplinkPersonalizationConfig(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
