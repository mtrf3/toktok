package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ahh, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94481ahh implements InterfaceC57356MfA<C94480ahg> {
    public final String LJLIL = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C94481ahh) && o.LJ(this.LJLIL, ((C94481ahh) obj).LJLIL);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetDspPlatformListQuery(offset=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC84562XGs
    public final C57332Mem LLZL() {
        return C57330Mek.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC84562XGs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r6, X.InterfaceC67352kd<? super X.C94480ahg> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C94690al4
            if (r0 == 0) goto L42
            r4 = r7
            X.al4 r4 = (X.C94690al4) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L48
            X.C141335gf.LIZJ(r1)
        L20:
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlatformListResponse r1 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlatformListResponse) r1
            X.ahg r0 = new X.ahg
            r0.<init>(r1)
            return r0
        L28:
            X.C141335gf.LIZJ(r1)
            X.Meg r1 = X.C78977Uz7.LJJJJJL(r6)
            java.lang.Class<com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.DspPlatformApi> r0 = com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.DspPlatformApi.class
            java.lang.Object r1 = r1.create(r0)
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.DspPlatformApi r1 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.DspPlatformApi) r1
            java.lang.String r0 = r5.LJLIL
            r4.LJLJI = r2
            java.lang.Object r1 = r1.getDspPlatformList(r0, r4)
            if (r1 != r3) goto L20
            return r3
        L42:
            X.al4 r4 = new X.al4
            r4.<init>(r5, r7)
            goto L12
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94481ahh.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }
}
