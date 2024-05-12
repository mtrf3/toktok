package X;

import com.bytedance.android.live.base.model.user.User;

/* renamed from: X.RwS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71168RwS extends AbstractC65781Prl implements InterfaceC88472Yns<User, C76800UCe> {
    public static final C71168RwS LJLIL = new C71168RwS();

    public C71168RwS() {
        super(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if (r0.intValue() == 1) goto L7;
     */
    @Override // X.InterfaceC88472Yns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(com.bytedance.android.live.base.model.user.User r4) {
        /*
            r3 = this;
            com.bytedance.android.live.base.model.user.User r4 = (com.bytedance.android.live.base.model.user.User) r4
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            long r0 = X.C71166RwQ.LIZIZ
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            com.bytedance.android.livesdk.model.UserAttr r0 = r4.getUserAttr()
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r0.adminPermissions
            if (r1 == 0) goto L22
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L39
        L22:
            r1 = 0
        L23:
            boolean r0 = X.C71166RwQ.LIZ(r2)
            if (r0 == 0) goto L33
            if (r1 == 0) goto L36
            X.RxF r0 = X.EnumC71217RxF.MODERATOR
        L2d:
            java.lang.String r0 = r0.getRoleStr()
            X.C71166RwQ.LJII = r0
        L33:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L36:
            X.RxF r0 = X.EnumC71217RxF.AUDIENCE
            goto L2d
        L39:
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L22
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71168RwS.invoke(java.lang.Object):java.lang.Object");
    }
}
