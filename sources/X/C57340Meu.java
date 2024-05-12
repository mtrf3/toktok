package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Meu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57340Meu implements InterfaceC57356MfA<C57346Mf0> {
    public final String LJLIL;
    public final int LJLILLLLZI = 0;
    public final int LJLJI;
    public final java.util.Map<String, String> LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57340Meu)) {
            return false;
        }
        C57340Meu c57340Meu = (C57340Meu) obj;
        return o.LJ(this.LJLIL, c57340Meu.LJLIL) && this.LJLILLLLZI == c57340Meu.LJLILLLLZI && this.LJLJI == c57340Meu.LJLJI && o.LJ(this.LJLJJI, c57340Meu.LJLJJI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.LJLILLLLZI) * 31) + this.LJLJI) * 31;
        java.util.Map<String, String> map = this.LJLJJI;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @Override // X.InterfaceC84562XGs
    public final C57332Mem LLZL() {
        return C57330Mek.LIZ();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QueryMusicExtraWithHighPriorityQuery(mcId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", reason=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isMCAUser=");
        LIZ.append(this.LJLJI);
        LIZ.append(", extra=");
        return C15890jp.LIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC84562XGs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r10, X.InterfaceC67352kd<? super X.C57346Mf0> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C57341Mev
            if (r0 == 0) goto L41
            r8 = r11
            X.Mev r8 = (X.C57341Mev) r8
            int r2 = r8.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r8.LJLJI = r2
        L12:
            java.lang.Object r3 = r8.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJI
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 != r1) goto L47
            X.C141335gf.LIZJ(r3)
        L20:
            com.ss.android.ugc.aweme.music.model.MusicDetail r3 = (com.ss.android.ugc.aweme.music.model.MusicDetail) r3
            X.Mf0 r0 = new X.Mf0
            r0.<init>(r3)
            return r0
        L28:
            java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApiV2> r0 = com.ss.android.ugc.aweme.music.api.MusicDetailApiV2.class
            java.lang.Object r3 = X.C05L.LIZIZ(r3, r10, r0)
            com.ss.android.ugc.aweme.music.api.MusicDetailApiV2 r3 = (com.ss.android.ugc.aweme.music.api.MusicDetailApiV2) r3
            java.lang.String r4 = r9.LJLIL
            int r5 = r9.LJLILLLLZI
            int r6 = r9.LJLJI
            java.util.Map<java.lang.String, java.lang.String> r7 = r9.LJLJJI
            r8.LJLJI = r1
            java.lang.Object r3 = r3.queryMusicExtraWithHighPriority(r4, r5, r6, r7, r8)
            if (r3 != r2) goto L20
            return r2
        L41:
            X.Mev r8 = new X.Mev
            r8.<init>(r9, r11)
            goto L12
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57340Meu.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }

    public C57340Meu(String str, int i, java.util.Map map) {
        this.LJLIL = str;
        this.LJLJI = i;
        this.LJLJJI = map;
    }
}
