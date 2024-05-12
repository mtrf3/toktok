package com.ss.android.ugc.aweme.share;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ScopeData extends F9E {

    @InterfaceC65349Pkn("app_name")
    public final String appName;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("error_code")
    public final int errorCode;

    @InterfaceC65349Pkn("pass_code")
    public final boolean passCode;

    @InterfaceC65349Pkn("scopes")
    public final List<Scope> scopes;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.scopes, this.appName, this.description, Integer.valueOf(this.errorCode), Boolean.valueOf(this.passCode)};
    }

    public ScopeData(List<Scope> scopes, String appName, String description, int i, boolean z) {
        o.LJIIIZ(scopes, "scopes");
        o.LJIIIZ(appName, "appName");
        o.LJIIIZ(description, "description");
        this.scopes = scopes;
        this.appName = appName;
        this.description = description;
        this.errorCode = i;
        this.passCode = z;
    }
}
