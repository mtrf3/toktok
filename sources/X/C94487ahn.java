package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ahn, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94487ahn extends F9E implements XGE {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
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
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r11, X.InterfaceC67352kd<? super X.C94486ahm> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C94693al7
            if (r0 == 0) goto L48
            r9 = r12
            X.al7 r9 = (X.C94693al7) r9
            int r2 = r9.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r9.LJLJI = r2
        L12:
            java.lang.Object r1 = r9.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLJI
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L4e
            X.C141335gf.LIZJ(r1)
        L20:
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.AmazonAccessTokenResponse r1 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.AmazonAccessTokenResponse) r1
            X.ahm r0 = new X.ahm
            r0.<init>(r1)
            return r0
        L28:
            X.C141335gf.LIZJ(r1)
            X.Meg r1 = X.C78977Uz7.LJJJJJL(r11)
            java.lang.Class<com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AmazonAuthApi> r0 = com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AmazonAuthApi.class
            java.lang.Object r4 = r1.create(r0)
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AmazonAuthApi r4 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AmazonAuthApi) r4
            java.lang.String r5 = r10.LJLIL
            java.lang.String r6 = r10.LJLILLLLZI
            java.lang.String r7 = r10.LJLJI
            java.lang.String r8 = r10.LJLJJI
            r9.LJLJI = r2
            java.lang.Object r1 = r4.refreshAmazonAccessToken(r5, r6, r7, r8, r9)
            if (r1 != r3) goto L20
            return r3
        L48:
            X.al7 r9 = new X.al7
            r9.<init>(r10, r12)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94487ahn.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }

    public C94487ahn(String str, String clientId, String clientSecret) {
        o.LJIIIZ(clientId, "clientId");
        o.LJIIIZ(clientSecret, "clientSecret");
        this.LJLIL = "refresh_token";
        this.LJLILLLLZI = str;
        this.LJLJI = clientId;
        this.LJLJJI = clientSecret;
    }
}
