package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.7zD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203797zD implements XGE<C203787zC> {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C203797zD)) {
            return false;
        }
        C203797zD c203797zD = (C203797zD) obj;
        return o.LJ(this.LJLIL, c203797zD.LJLIL) && this.LJLILLLLZI == c203797zD.LJLILLLLZI && this.LJLJI == c203797zD.LJLJI;
    }

    public final int hashCode() {
        String str = this.LJLIL;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.LJLILLLLZI) * 31) + this.LJLJI;
    }

    @Override // X.InterfaceC84562XGs
    public final C57332Mem LLZL() {
        return new C57332Mem(0, 3000L, false);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CollectAwemeReverseMutation(awemeId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", action=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", privacySetting=");
        return b0.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C203797zD(String str, int i) {
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
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r8, X.InterfaceC67352kd<? super X.C203787zC> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C203817zF
            if (r0 == 0) goto L3f
            r6 = r9
            X.7zF r6 = (X.C203817zF) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r6.LJLJI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r4 = 1
            if (r0 == 0) goto L28
            if (r0 != r4) goto L45
            X.C141335gf.LIZJ(r1)
        L20:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1
            X.7zC r0 = new X.7zC
            r0.<init>(r1)
            return r0
        L28:
            java.lang.Class<com.ss.android.ugc.aweme.favorites.business.aweme.api.FavoriteAwemeApi> r0 = com.ss.android.ugc.aweme.favorites.business.aweme.api.FavoriteAwemeApi.class
            java.lang.Object r3 = X.C05L.LIZIZ(r1, r8, r0)
            com.ss.android.ugc.aweme.favorites.business.aweme.api.FavoriteAwemeApi r3 = (com.ss.android.ugc.aweme.favorites.business.aweme.api.FavoriteAwemeApi) r3
            java.lang.String r2 = r7.LJLIL
            int r1 = r7.LJLILLLLZI
            int r0 = r7.LJLJI
            r6.LJLJI = r4
            java.lang.Object r1 = r3.collectAwemeReverse(r2, r1, r0, r6)
            if (r1 != r5) goto L20
            return r5
        L3f:
            X.7zF r6 = new X.7zF
            r6.<init>(r7, r9)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203797zD.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }
}
