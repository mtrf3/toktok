package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.MeU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57314MeU implements InterfaceC57356MfA<C54843Lfj> {
    public final String LJLIL;
    public final String LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57314MeU)) {
            return false;
        }
        C57314MeU c57314MeU = (C57314MeU) obj;
        return o.LJ(this.LJLIL, c57314MeU.LJLIL) && o.LJ(this.LJLILLLLZI, c57314MeU.LJLILLLLZI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.InterfaceC84562XGs
    public final C57332Mem LLZL() {
        return C57330Mek.LIZ();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QueryPartnerMusicQuery(mcId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", name=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C57314MeU(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC84562XGs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r7, X.InterfaceC67352kd<? super X.C54843Lfj> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C57315MeV
            if (r0 == 0) goto L3d
            r5 = r8
            X.MeV r5 = (X.C57315MeV) r5
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
            com.ss.android.ugc.aweme.music.model.MusicDetail r1 = (com.ss.android.ugc.aweme.music.model.MusicDetail) r1
            X.Lfj r0 = new X.Lfj
            r0.<init>(r1)
            return r0
        L28:
            java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApiV2> r0 = com.ss.android.ugc.aweme.music.api.MusicDetailApiV2.class
            java.lang.Object r2 = X.C05L.LIZIZ(r1, r7, r0)
            com.ss.android.ugc.aweme.music.api.MusicDetailApiV2 r2 = (com.ss.android.ugc.aweme.music.api.MusicDetailApiV2) r2
            java.lang.String r1 = r6.LJLIL
            java.lang.String r0 = r6.LJLILLLLZI
            r5.LJLJI = r3
            java.lang.Object r1 = r2.queryPartnerMusic(r1, r0, r5)
            if (r1 != r4) goto L20
            return r4
        L3d:
            X.MeV r5 = new X.MeV
            r5.<init>(r6, r8)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57314MeU.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }
}
