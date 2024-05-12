package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FetchConfig extends F9E {

    @InterfaceC65349Pkn("api_host")
    public final String apiHost;

    @InterfaceC65349Pkn("cdn_host")
    public final String cdnHost;

    @InterfaceC65349Pkn("cdn_path")
    public final String cdnPath;

    @InterfaceC65349Pkn("source")
    public final int source;

    /* JADX WARN: Multi-variable type inference failed */
    public FetchConfig() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FetchConfig copy$default(FetchConfig fetchConfig, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fetchConfig.source;
        }
        if ((i2 & 2) != 0) {
            str = fetchConfig.cdnHost;
        }
        if ((i2 & 4) != 0) {
            str2 = fetchConfig.cdnPath;
        }
        if ((i2 & 8) != 0) {
            str3 = fetchConfig.apiHost;
        }
        return fetchConfig.copy(i, str, str2, str3);
    }

    public final FetchConfig copy(int i, String cdnHost, String cdnPath, String apiHost) {
        o.LJIIIZ(cdnHost, "cdnHost");
        o.LJIIIZ(cdnPath, "cdnPath");
        o.LJIIIZ(apiHost, "apiHost");
        return new FetchConfig(i, cdnHost, cdnPath, apiHost);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.source), this.cdnHost, this.cdnPath, this.apiHost};
    }

    public final String getApiHost() {
        return this.apiHost;
    }

    public final String getCdnHost() {
        return this.cdnHost;
    }

    public final String getCdnPath() {
        return this.cdnPath;
    }

    public final int getSource() {
        return this.source;
    }

    public FetchConfig(int i, String str, String str2, String str3) {
        HH1.LIZ(str, "cdnHost", str2, "cdnPath", str3, "apiHost");
        this.source = i;
        this.cdnHost = str;
        this.cdnPath = str2;
        this.apiHost = str3;
    }

    public /* synthetic */ FetchConfig(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}
