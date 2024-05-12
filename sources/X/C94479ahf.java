package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ahf, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94479ahf extends F9E implements XGE {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL};
    }

    @Override // X.InterfaceC84562XGs
    public final C57332Mem LLZL() {
        return new C57332Mem(0, 3000L, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC84562XGs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r13, X.InterfaceC67352kd<? super X.C94478ahe> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C94689al3
            if (r0 == 0) goto L4c
            r11 = r14
            X.al3 r11 = (X.C94689al3) r11
            int r2 = r11.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r11.LJLJI = r2
        L12:
            java.lang.Object r1 = r11.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLJI
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L52
            X.C141335gf.LIZJ(r1)
        L20:
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.AmazonAccessTokenResponse r1 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.AmazonAccessTokenResponse) r1
            X.ahe r0 = new X.ahe
            r0.<init>(r1)
            return r0
        L28:
            X.C141335gf.LIZJ(r1)
            X.Meg r1 = X.C78977Uz7.LJJJJJL(r13)
            java.lang.Class<com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AmazonAuthApi> r0 = com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AmazonAuthApi.class
            java.lang.Object r4 = r1.create(r0)
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AmazonAuthApi r4 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AmazonAuthApi) r4
            java.lang.String r5 = r12.LJLIL
            java.lang.String r6 = r12.LJLILLLLZI
            java.lang.String r7 = r12.LJLJI
            java.lang.String r8 = r12.LJLJJI
            java.lang.String r9 = r12.LJLJJL
            java.lang.String r10 = r12.LJLJJLL
            r11.LJLJI = r2
            java.lang.Object r1 = r4.getAccessToken(r5, r6, r7, r8, r9, r10, r11)
            if (r1 != r3) goto L20
            return r3
        L4c:
            X.al3 r11 = new X.al3
            r11.<init>(r12, r14)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94479ahf.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }

    public C94479ahf(String code, String clientId, String clientSecret, String redirectUri, String codeVerifier) {
        o.LJIIIZ(code, "code");
        o.LJIIIZ(clientId, "clientId");
        o.LJIIIZ(clientSecret, "clientSecret");
        o.LJIIIZ(redirectUri, "redirectUri");
        o.LJIIIZ(codeVerifier, "codeVerifier");
        this.LJLIL = "authorization_code";
        this.LJLILLLLZI = code;
        this.LJLJI = clientId;
        this.LJLJJI = clientSecret;
        this.LJLJJL = redirectUri;
        this.LJLJJLL = codeVerifier;
    }
}
