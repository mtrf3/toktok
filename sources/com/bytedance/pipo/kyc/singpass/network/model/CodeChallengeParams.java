package com.bytedance.pipo.kyc.singpass.network.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class CodeChallengeParams extends F9E {

    @InterfaceC65349Pkn("code_challenge")
    public final String codeChallenge;

    @InterfaceC65349Pkn("code_challenge_method")
    public final String codeChallengeMethod;

    @InterfaceC65349Pkn("config")
    public final Config config;

    @InterfaceC65349Pkn("redirect_url")
    public final String redirectUrl;

    @InterfaceC65349Pkn("session_id")
    public final String sessionId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.codeChallenge, this.codeChallengeMethod, this.config, this.redirectUrl, this.sessionId};
    }

    public CodeChallengeParams(String codeChallenge, String codeChallengeMethod, Config config, String redirectUrl, String sessionId) {
        o.LJIIIZ(codeChallenge, "codeChallenge");
        o.LJIIIZ(codeChallengeMethod, "codeChallengeMethod");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(redirectUrl, "redirectUrl");
        o.LJIIIZ(sessionId, "sessionId");
        this.codeChallenge = codeChallenge;
        this.codeChallengeMethod = codeChallengeMethod;
        this.config = config;
        this.redirectUrl = redirectUrl;
        this.sessionId = sessionId;
    }
}
