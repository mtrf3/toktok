package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RomaConfig extends F9E {

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("fetch")
    public final FetchConfig fetch;

    @InterfaceC65349Pkn("rules")
    public final List<RomaCheckRule> rules;

    @InterfaceC65349Pkn("skip_cache")
    public final boolean skipCache;

    public RomaConfig() {
        this(false, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RomaConfig copy$default(RomaConfig romaConfig, boolean z, boolean z2, List list, FetchConfig fetchConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            z = romaConfig.enable;
        }
        if ((i & 2) != 0) {
            z2 = romaConfig.skipCache;
        }
        if ((i & 4) != 0) {
            list = romaConfig.rules;
        }
        if ((i & 8) != 0) {
            fetchConfig = romaConfig.fetch;
        }
        return romaConfig.copy(z, z2, list, fetchConfig);
    }

    public final RomaConfig copy(boolean z, boolean z2, List<RomaCheckRule> rules, FetchConfig fetch) {
        o.LJIIIZ(rules, "rules");
        o.LJIIIZ(fetch, "fetch");
        return new RomaConfig(z, z2, rules, fetch);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Boolean.valueOf(this.skipCache), this.rules, this.fetch};
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final FetchConfig getFetch() {
        return this.fetch;
    }

    public final List<RomaCheckRule> getRules() {
        return this.rules;
    }

    public final boolean getSkipCache() {
        return this.skipCache;
    }

    public RomaConfig(boolean z, boolean z2, List<RomaCheckRule> rules, FetchConfig fetch) {
        o.LJIIIZ(rules, "rules");
        o.LJIIIZ(fetch, "fetch");
        this.enable = z;
        this.skipCache = z2;
        this.rules = rules;
        this.fetch = fetch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RomaConfig(boolean z, boolean z2, List list, FetchConfig fetchConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? C61878OQg.INSTANCE : list, (i & 8) != 0 ? new FetchConfig(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0) : fetchConfig);
    }
}
