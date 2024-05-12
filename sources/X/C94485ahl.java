package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ahl, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94485ahl extends F9E implements XGE {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, Integer.valueOf(this.LJLJI), this.LJLJJI, this.LJLJJL};
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
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r12, X.InterfaceC67352kd<? super X.C94484ahk> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C94692al6
            if (r0 == 0) goto L4a
            r10 = r13
            X.al6 r10 = (X.C94692al6) r10
            int r2 = r10.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r10.LJLJI = r2
        L12:
            java.lang.Object r1 = r10.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLJI
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L50
            X.C141335gf.LIZJ(r1)
        L20:
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.SpotifyAccessTokenResponse r1 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.SpotifyAccessTokenResponse) r1
            X.ahk r0 = new X.ahk
            r0.<init>(r1)
            return r0
        L28:
            X.C141335gf.LIZJ(r1)
            X.Meg r1 = X.C78977Uz7.LJJJJJL(r12)
            java.lang.Class<com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.SpotifyAuthApi> r0 = com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.SpotifyAuthApi.class
            java.lang.Object r4 = r1.create(r0)
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.SpotifyAuthApi r4 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.SpotifyAuthApi) r4
            int r5 = r11.LJLIL
            java.lang.String r6 = r11.LJLILLLLZI
            int r7 = r11.LJLJI
            java.lang.String r8 = r11.LJLJJI
            java.lang.String r9 = r11.LJLJJL
            r10.LJLJI = r2
            java.lang.Object r1 = r4.getSpotifyAccessToken(r5, r6, r7, r8, r9, r10)
            if (r1 != r3) goto L20
            return r3
        L4a:
            X.al6 r10 = new X.al6
            r10.<init>(r11, r13)
            goto L12
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94485ahl.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }

    public C94485ahl(int i, String clientId, String str) {
        o.LJIIIZ(clientId, "clientId");
        this.LJLIL = i;
        this.LJLILLLLZI = clientId;
        this.LJLJI = 0;
        this.LJLJJI = str;
        this.LJLJJL = "https://www.tiktok.com/third-party-oauth-redirect/music/spotify";
    }
}
