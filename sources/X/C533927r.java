package X;

/* renamed from: X.27r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C533927r extends AbstractC44281oW {
    public final int LIZIZ = 10001;

    @Override // X.AbstractC44281oW
    public final String LJIIIIZZ() {
        return "pipo.getInfoByOcr";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return EnumC38005Evp.PUBLIC;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    @Override // X.AbstractC44281oW, X.InterfaceC37774Es6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.InterfaceC78280Uns r13, final X.InterfaceC31943CgF r14, X.EnumC37847EtH r15) {
        /*
            r12 = this;
            super.LIZJ(r13, r14, r15)
            java.lang.String r0 = "merchant_user_id"
            java.lang.String r7 = X.C04490Fp.LJ(r13, r0)
            java.lang.String r0 = "nonce"
            java.lang.String r8 = X.C04490Fp.LJ(r13, r0)
            java.lang.String r0 = "merchant_id"
            java.lang.String r6 = X.C04490Fp.LJ(r13, r0)
            r3 = 0
            if (r13 != 0) goto L35
        L18:
            r4 = 0
        L19:
            java.lang.String r0 = "show_security_tips"
            java.lang.String r10 = X.C04490Fp.LJ(r13, r0)
            java.lang.String r0 = "ui_type"
            java.lang.String r11 = X.C04490Fp.LJ(r13, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r2 = 101(0x65, float:1.42E-43)
            java.lang.String r1 = "pipo.getInfoByOcr"
            if (r0 == 0) goto L50
            java.lang.String r0 = "merchantId is empty!"
            X.C04490Fp.LIZIZ(r1, r3, r2, r0, r14)
            return
        L35:
            java.lang.String r1 = "ocr_mode"
            boolean r0 = r13.hasKey(r1)
            if (r0 != 0) goto L3e
            goto L18
        L3e:
            X.UrV r2 = r13.get(r1)
            X.Urm r1 = r2.getType()
            X.Urm r0 = X.EnumC78522Urm.Int
            if (r1 == r0) goto L4b
            goto L18
        L4b:
            int r4 = r2.asInt()     // Catch: java.lang.Throwable -> L18
            goto L19
        L50:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L5c
            java.lang.String r0 = "merchantUserId is empty!"
            X.C04490Fp.LIZIZ(r1, r3, r2, r0, r14)
            return
        L5c:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L68
            java.lang.String r0 = "nonce is empty!"
            X.C04490Fp.LIZIZ(r1, r3, r2, r0, r14)
            return
        L68:
            X.16o r3 = X.C276216o.LJIIL
            X.16m r0 = r3.LIZ
            r0.LJIILL = r8
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.myLooper()
            X.121 r0 = new X.121
            r0.<init>()
            r2.<init>(r1, r0)
            X.C16880lQ.LLLLIIIILLL()
            X.F6K r5 = new X.F6K
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3.LIZJ()
            wi2.f r1 = wi2.f.LIZIZ
            X.1dk r0 = new X.1dk
            r0.<init>()
            X.C41501k2.LIZIZ(r5, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C533927r.LIZJ(X.Uns, X.CgF, X.EtH):void");
    }
}
