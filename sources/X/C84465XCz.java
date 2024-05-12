package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XCz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84465XCz {
    public final C0FT LIZ;
    public final XCG LIZIZ;

    public C84465XCz(XCG effectConfig) {
        o.LJIIJ(effectConfig, "effectConfig");
        this.LIZIZ = effectConfig;
        this.LIZ = new C0FT((Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r7, java.lang.String r8, X.XDR<java.lang.Boolean> r9) {
        /*
            r6 = this;
            X.0FT r0 = r6.LIZ
            java.lang.Object r0 = r0.LIZ
            if (r0 != 0) goto Ld
            if (r9 == 0) goto Ld
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.onSuccess(r0)
        Ld:
            X.0FT r0 = r6.LIZ
            java.lang.Object r1 = r0.LIZ
            X.1ia r1 = (X.C40601ia) r1
            if (r1 == 0) goto L40
            boolean r0 = r1.containsKey(r7)
            if (r0 == 0) goto L53
            r4 = -1
            if (r8 == 0) goto L25
            int r0 = r8.length()
            if (r0 != 0) goto L4e
        L25:
            r2 = -1
        L27:
            java.lang.Object r1 = r1.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L35
            int r0 = r1.length()
            if (r0 != 0) goto L49
        L35:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L41
            if (r9 == 0) goto L40
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.onSuccess(r0)
        L40:
            return
        L41:
            if (r9 == 0) goto L40
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.onSuccess(r0)
            goto L40
        L49:
            long r4 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r1)     // Catch: java.lang.Exception -> L35
            goto L35
        L4e:
            long r2 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r8)     // Catch: java.lang.Exception -> L25
            goto L27
        L53:
            if (r9 == 0) goto L40
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.onSuccess(r0)
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84465XCz.LIZ(java.lang.String, java.lang.String, X.XDR):void");
    }

    public final void LIZIZ(String str, String str2, String str3, XD4 xd4) {
        if (this.LIZ.LIZ == null && xd4 != null) {
            xd4.onFinally();
        }
        C40601ia c40601ia = (C40601ia) this.LIZ.LIZ;
        if (c40601ia != null) {
            c40601ia.put(str2, str3);
            this.LIZIZ.LJJJ.LIZIZ(str, new XD2(xd4));
            C84477XDl c84477XDl = new C84477XDl(this.LIZIZ, str, c40601ia);
            XCX xcx = this.LIZIZ.LJJIIJ;
            if (xcx != null) {
                xcx.LIZ(c84477XDl);
            }
        }
    }
}
