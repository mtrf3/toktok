package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aht, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94493aht extends F9E implements XGE {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    @Override // X.InterfaceC84562XGs
    public final C57332Mem LLZL() {
        return new C57332Mem(0, 3000L, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC84562XGs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r11, X.InterfaceC67352kd<? super X.C94492ahs> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C94696alA
            if (r0 == 0) goto L46
            r9 = r12
            X.alA r9 = (X.C94696alA) r9
            int r2 = r9.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r9.LJLJI = r2
        L12:
            java.lang.Object r1 = r9.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLJI
            r2 = 1
            if (r0 == 0) goto L26
            if (r0 != r2) goto L4c
            X.C141335gf.LIZJ(r1)
        L20:
            X.ahs r0 = new X.ahs
            r0.<init>()
            return r0
        L26:
            X.C141335gf.LIZJ(r1)
            X.Meg r1 = X.C78977Uz7.LJJJJJL(r11)
            java.lang.Class<com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AddMusicToDspApi> r0 = com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AddMusicToDspApi.class
            java.lang.Object r4 = r1.create(r0)
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AddMusicToDspApi r4 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AddMusicToDspApi) r4
            int r5 = r10.LJLIL
            java.lang.String r6 = r10.LJLILLLLZI
            java.lang.String r7 = r10.LJLJI
            java.lang.String r8 = r10.LJLJJI
            r9.LJLJI = r2
            java.lang.Object r0 = r4.selectDspPlaylist(r5, r6, r7, r8, r9)
            if (r0 != r3) goto L20
            return r3
        L46:
            X.alA r9 = new X.alA
            r9.<init>(r10, r12)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94493aht.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }

    public C94493aht(int i, String songId, String playlistId, String authToken) {
        o.LJIIIZ(songId, "songId");
        o.LJIIIZ(playlistId, "playlistId");
        o.LJIIIZ(authToken, "authToken");
        this.LJLIL = i;
        this.LJLILLLLZI = songId;
        this.LJLJI = playlistId;
        this.LJLJJI = authToken;
    }
}
