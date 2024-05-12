package com.bytedance.bpea.cert.token;

import X.AbstractC39330Fc6;
import X.C78966Uyw;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class TokenCert extends AbstractC39330Fc6 {
    public static final Companion Companion = new Companion();
    public String authKey;
    public final String token;

    public static /* synthetic */ TokenCert copy$default(TokenCert tokenCert, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenCert.token;
        }
        return tokenCert.copy(str);
    }

    private Object[] getObjects() {
        return new Object[]{this.token};
    }

    public static final TokenCert with(String str) {
        return Companion.with(str);
    }

    public final TokenCert copy(String str) {
        return new TokenCert(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TokenCert) {
            return C78966Uyw.LJIIIZ(((TokenCert) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // X.AbstractC39330Fc6
    public String toString() {
        return C78966Uyw.LJJJLL("TokenCert:%s", getObjects());
    }

    /* loaded from: classes9.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TokenCert with(String token) {
            o.LJIIJ(token, "token");
            return new TokenCert(token);
        }
    }

    @Override // X.AbstractC39330Fc6, com.bytedance.bpea.basics.Cert
    public String authKey() {
        return this.authKey;
    }

    public final String getToken() {
        return this.token;
    }

    public TokenCert(String str) {
        super(str, "TokenCert");
        this.token = str;
    }

    public final TokenCert auth(String auth) {
        o.LJIIJ(auth, "auth");
        this.authKey = auth;
        return this;
    }
}
