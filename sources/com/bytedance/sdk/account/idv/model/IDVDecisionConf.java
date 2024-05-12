package com.bytedance.sdk.account.idv.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class IDVDecisionConf extends F9E {

    @InterfaceC65349Pkn("code")
    public final String code;

    @InterfaceC65349Pkn("extra")
    public final List<Object> extra;

    @InterfaceC65349Pkn("need_replay")
    public final boolean needReplay;

    @InterfaceC65349Pkn("passport_ticket")
    public final String passportTicket;

    @InterfaceC65349Pkn("url")
    public final String url;

    @InterfaceC65349Pkn("version")
    public final String version;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.code, this.extra, Boolean.valueOf(this.needReplay), this.passportTicket, this.url, this.version};
    }

    public IDVDecisionConf(String code, List<? extends Object> extra, boolean z, String passportTicket, String url, String version) {
        o.LJIIJ(code, "code");
        o.LJIIJ(extra, "extra");
        o.LJIIJ(passportTicket, "passportTicket");
        o.LJIIJ(url, "url");
        o.LJIIJ(version, "version");
        this.code = code;
        this.extra = extra;
        this.needReplay = z;
        this.passportTicket = passportTicket;
        this.url = url;
        this.version = version;
    }
}
