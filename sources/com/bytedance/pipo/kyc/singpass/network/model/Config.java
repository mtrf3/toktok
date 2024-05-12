package com.bytedance.pipo.kyc.singpass.network.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Config extends F9E {

    @InterfaceC65349Pkn("authorization_endpoint")
    public final String authorizationEndpoint;

    @InterfaceC65349Pkn("client_id")
    public final String clientId;

    @InterfaceC65349Pkn("issuer")
    public final String issuer;

    @InterfaceC65349Pkn("purpose_id")
    public final String purposeId;

    @InterfaceC65349Pkn("scope")
    public final String scope;

    @InterfaceC65349Pkn("token_endpoint")
    public final String tokenEndpoint;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.authorizationEndpoint, this.tokenEndpoint, this.issuer, this.clientId, this.purposeId, this.scope};
    }

    public Config(String authorizationEndpoint, String tokenEndpoint, String issuer, String clientId, String purposeId, String scope) {
        o.LJIIIZ(authorizationEndpoint, "authorizationEndpoint");
        o.LJIIIZ(tokenEndpoint, "tokenEndpoint");
        o.LJIIIZ(issuer, "issuer");
        o.LJIIIZ(clientId, "clientId");
        o.LJIIIZ(purposeId, "purposeId");
        o.LJIIIZ(scope, "scope");
        this.authorizationEndpoint = authorizationEndpoint;
        this.tokenEndpoint = tokenEndpoint;
        this.issuer = issuer;
        this.clientId = clientId;
        this.purposeId = purposeId;
        this.scope = scope;
    }
}
