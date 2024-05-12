package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ahp, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94489ahp extends F9E implements XGE {
    public final String LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    @Override // X.InterfaceC84562XGs
    public final C57332Mem LLZL() {
        return new C57332Mem(0, 3000L, false);
    }

    public C94489ahp(String developerToken, String str) {
        o.LJIIIZ(developerToken, "developerToken");
        this.LJLIL = developerToken;
        this.LJLILLLLZI = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC84562XGs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r7, X.InterfaceC67352kd<? super X.C94488aho> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C94694al8
            if (r0 == 0) goto L44
            r5 = r8
            X.al8 r5 = (X.C94694al8) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 != r3) goto L4a
            X.C141335gf.LIZJ(r1)
        L20:
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.AppleMusicRefreshTokenResponse r1 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.AppleMusicRefreshTokenResponse) r1
            X.aho r0 = new X.aho
            r0.<init>(r1)
            return r0
        L28:
            X.C141335gf.LIZJ(r1)
            X.Meg r1 = X.C78977Uz7.LJJJJJL(r7)
            java.lang.Class<com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AppleMusicAuthApi> r0 = com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AppleMusicAuthApi.class
            java.lang.Object r2 = r1.create(r0)
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AppleMusicAuthApi r2 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AppleMusicAuthApi) r2
            java.lang.String r1 = r6.LJLIL
            java.lang.String r0 = r6.LJLILLLLZI
            r5.LJLJI = r3
            java.lang.Object r1 = r2.refreshAppleMusicAccessToken(r1, r0, r5)
            if (r1 != r4) goto L20
            return r4
        L44:
            X.al8 r5 = new X.al8
            r5.<init>(r6, r8)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94489ahp.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }
}
