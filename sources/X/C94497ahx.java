package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ahx, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94497ahx implements XGE<C94496ahw> {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C94497ahx)) {
            return false;
        }
        C94497ahx c94497ahx = (C94497ahx) obj;
        return this.LJLIL == c94497ahx.LJLIL && this.LJLILLLLZI == c94497ahx.LJLILLLLZI && o.LJ(this.LJLJI, c94497ahx.LJLJI);
    }

    public final int hashCode() {
        int i = ((this.LJLIL * 31) + this.LJLILLLLZI) * 31;
        String str = this.LJLJI;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateDspPlatformMutation(platform=");
        LIZ.append(this.LJLIL);
        LIZ.append(", action=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", refreshToken=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
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
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r8, X.InterfaceC67352kd<? super X.C94496ahw> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C94698alC
            if (r0 == 0) goto L44
            r6 = r9
            X.alC r6 = (X.C94698alC) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r6.LJLJI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r4 = 1
            if (r0 == 0) goto L26
            if (r0 != r4) goto L4a
            X.C141335gf.LIZJ(r1)
        L20:
            X.ahw r0 = new X.ahw
            r0.<init>()
            return r0
        L26:
            X.C141335gf.LIZJ(r1)
            X.Meg r1 = X.C78977Uz7.LJJJJJL(r8)
            java.lang.Class<com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.DspPlatformApi> r0 = com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.DspPlatformApi.class
            java.lang.Object r3 = r1.create(r0)
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.DspPlatformApi r3 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.DspPlatformApi) r3
            int r2 = r7.LJLIL
            int r1 = r7.LJLILLLLZI
            java.lang.String r0 = r7.LJLJI
            r6.LJLJI = r4
            java.lang.Object r0 = r3.updateDspPlatform(r2, r1, r0, r6)
            if (r0 != r5) goto L20
            return r5
        L44:
            X.alC r6 = new X.alC
            r6.<init>(r7, r9)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94497ahx.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }

    public C94497ahx(int i, int i2, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = str;
    }
}
