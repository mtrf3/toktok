package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sharedar.message.handler.EffectReadyMessageHandler$loadCurrentUserAvatarAndSendToEffect$1", f = "EffectReadyMessageHandler.kt", l = {105, 112}, m = "invokeSuspend")
/* renamed from: X.5e9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139775e9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC45930I0w LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ C44328HaW LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C139775e9(C44328HaW c44328HaW, InterfaceC67352kd<? super C139775e9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c44328HaW;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C139775e9(this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLJI
            r6 = 0
            r5 = 2
            r10 = 1
            if (r0 == 0) goto L30
            if (r0 == r10) goto Lb5
            if (r0 != r5) goto Ldf
            java.lang.Object r4 = r11.LJLILLLLZI
            java.io.File r4 = (java.io.File) r4
            X.I0w r3 = r11.LJLIL
            X.C141335gf.LIZJ(r12)
        L16:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r0 = r12.booleanValue()
            if (r0 != 0) goto L26
            java.lang.String r0 = "save user avatar failed"
            X.H78.LIZJ(r0)
        L23:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            X.HaW r1 = r11.LJLJJI
            java.lang.String r0 = r3.getUniqueId()
            r1.LJI(r4, r0)
            goto L23
        L30:
            X.C141335gf.LIZJ(r12)
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.HQ7 r0 = r0.getAccountService()
            X.Hc3 r3 = r0.getCurrentUser()
            if (r3 != 0) goto L44
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L44:
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.GpZ r0 = r0.LJJIJL()
            X.Gvt r4 = r0.getFileProvider()
            X.HaW r0 = r11.LJLJJI
            X.Ol8 r0 = r0.LJLL
            java.lang.Object r2 = r0.getValue()
            java.io.File r2 = (java.io.File) r2
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r3.getUid()
            r1.append(r0)
            java.lang.String r0 = ".jpg"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.io.File r4 = r4.LIZIZ(r2, r0)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L9f
            long r8 = r4.length()
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L9f
            X.HaW r1 = r11.LJLJJI
            java.lang.String r0 = r3.getUniqueId()
            if (r0 == 0) goto L90
            int r0 = r0.length()
            if (r0 != 0) goto L9a
        L90:
            java.lang.String r0 = r3.getShortId()
        L94:
            r1.LJI(r4, r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L9a:
            java.lang.String r0 = r3.getUniqueId()
            goto L94
        L9f:
            X.XIA r2 = X.C78613UtF.LIZJ
            X.5e8 r1 = new X.5e8
            X.HaW r0 = r11.LJLJJI
            r1.<init>(r0, r6)
            r11.LJLIL = r3
            r11.LJLILLLLZI = r4
            r11.LJLJI = r10
            java.lang.Object r12 = X.XKX.LJI(r2, r1, r11)
            if (r12 != r7) goto Lbe
            return r7
        Lb5:
            java.lang.Object r4 = r11.LJLILLLLZI
            java.io.File r4 = (java.io.File) r4
            X.I0w r3 = r11.LJLIL
            X.C141335gf.LIZJ(r12)
        Lbe:
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            if (r12 != 0) goto Lcb
            java.lang.String r1 = "SharedAR"
            java.lang.String r0 = "current user avatar load failed."
            X.H78.LIZIZ(r1, r0)
            goto L23
        Lcb:
            X.XIA r1 = X.C78613UtF.LIZJ
            X.5eA r0 = new X.5eA
            r0.<init>(r12, r4, r6)
            r11.LJLIL = r3
            r11.LJLILLLLZI = r4
            r11.LJLJI = r5
            java.lang.Object r12 = X.XKX.LJI(r1, r0, r11)
            if (r12 != r7) goto L16
            return r7
        Ldf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139775e9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
