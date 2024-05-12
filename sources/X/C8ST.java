package X;

/* renamed from: X.8ST, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8ST extends F9E implements XGE {
    public final String LJLIL;
    public final int LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    @Override // X.InterfaceC84562XGs
    public final C57332Mem LLZL() {
        return new C57332Mem(3, 3000L, true);
    }

    public C8ST(String str, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC84562XGs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r7, X.InterfaceC67352kd<? super X.C8SV> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C8SU
            if (r0 == 0) goto L3d
            r5 = r8
            X.8SU r5 = (X.C8SU) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 != r3) goto L43
            X.C141335gf.LIZJ(r1)
        L20:
            com.ss.android.ugc.aweme.music.model.CollectMusicResponse r1 = (com.ss.android.ugc.aweme.music.model.CollectMusicResponse) r1
            X.8SV r0 = new X.8SV
            r0.<init>(r1)
            return r0
        L28:
            java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApiV2> r0 = com.ss.android.ugc.aweme.music.api.MusicDetailApiV2.class
            java.lang.Object r2 = X.C05L.LIZIZ(r1, r7, r0)
            com.ss.android.ugc.aweme.music.api.MusicDetailApiV2 r2 = (com.ss.android.ugc.aweme.music.api.MusicDetailApiV2) r2
            java.lang.String r1 = r6.LJLIL
            int r0 = r6.LJLILLLLZI
            r5.LJLJI = r3
            java.lang.Object r1 = r2.collectMusic(r1, r0, r5)
            if (r1 != r4) goto L20
            return r4
        L3d:
            X.8SU r5 = new X.8SU
            r5.<init>(r6, r8)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8ST.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }
}
