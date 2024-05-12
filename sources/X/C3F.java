package X;

import android.content.Context;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.comp.impl.game.GameDropsShortCardAgent$loadGameDropsShortCardWithLottie$2", f = "GameDropsShortCardAgent.kt", l = {239, 251, 255, 256}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class C3F extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public C68322mC LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ C30451BxH LJLJJLL;
    public final /* synthetic */ InterfaceC30642C0w LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3F(boolean z, Context context, C30451BxH c30451BxH, InterfaceC30642C0w interfaceC30642C0w, InterfaceC67352kd<? super C3F> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = z;
        this.LJLJJL = context;
        this.LJLJJLL = c30451BxH;
        this.LJLJL = interfaceC30642C0w;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3F(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLJI
            r6 = 4
            r3 = 3
            r8 = 2
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L19
            if (r0 == r2) goto L6f
            if (r0 == r8) goto La1
            if (r0 == r3) goto Lb3
            if (r0 != r6) goto Lcb
            X.C141335gf.LIZJ(r12)
        L16:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L19:
            X.2mC r7 = X.C793239k.LIZ(r12)
            boolean r0 = r11.LJLJJI
            if (r0 == 0) goto L87
            android.content.Context r10 = r11.LJLJJL
            if (r10 == 0) goto L79
            X.BxH r0 = r11.LJLJJLL
            java.lang.String r1 = r0.LJFF
            r11.LJLIL = r7
            r11.LJLILLLLZI = r7
            r11.LJLJI = r2
            X.XKg r9 = new X.XKg
            X.2kd r0 = X.C78555UsJ.LJJII(r11)
            r9.<init>(r0)
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)
            X.W5P r2 = X.W5P.LIZLLL(r0)
            X.V7y r1 = new X.V7y
            r0 = 198(0xc6, float:2.77E-43)
            r1.<init>(r0, r0)
            r2.LIZJ = r1
            X.W5O r1 = r2.LIZ()
            java.lang.String r0 = "newBuilderWithSource(ima…\n                .build()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.W6J r0 = X.W5I.LIZ()
            X.W4W r2 = r0.LJ(r1, r10)
            X.Cbt r1 = new X.Cbt
            r1.<init>(r9)
            X.VKj r0 = X.C79561VKj.LJLIL
            X.Iyq r2 = (X.AbstractC48384Iyq) r2
            r2.LJ(r1, r0)
            java.lang.Object r12 = r9.LIZ()
            if (r12 != r5) goto L6d
            return r5
        L6d:
            r0 = r7
            goto L76
        L6f:
            X.2mC r7 = r11.LJLILLLLZI
            X.2mC r0 = r11.LJLIL
            X.C141335gf.LIZJ(r12)
        L76:
            r7.element = r12
            r7 = r0
        L79:
            X.BxH r2 = r11.LJLJJLL
            X.1Eo r1 = r2.LIZIZ
            if (r1 == 0) goto L87
            X.C3D r0 = new X.C3D
            r0.<init>(r2, r7)
            r1.addLottieOnCompositionLoadedListener(r0)
        L87:
            X.BxH r1 = r11.LJLJJLL
            X.1Eo r0 = r1.LIZIZ
            if (r0 == 0) goto La4
            X.2w8 r2 = new X.2w8
            r2.<init>(r1, r0, r7, r4)
            r11.LJLIL = r4
            r11.LJLILLLLZI = r4
            r11.LJLJI = r8
            r0 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r0 = X.C74209TAn.LIZJ(r0, r2, r11)
            if (r0 != r5) goto La4
            return r5
        La1:
            X.C141335gf.LIZJ(r12)
        La4:
            r11.LJLIL = r4
            r11.LJLILLLLZI = r4
            r11.LJLJI = r3
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r11)
            if (r0 != r5) goto Lb6
            return r5
        Lb3:
            X.C141335gf.LIZJ(r12)
        Lb6:
            X.UtN r3 = X.C36636EZk.LIZ
            X.C3E r2 = new X.C3E
            X.C0w r1 = r11.LJLJL
            X.BxH r0 = r11.LJLJJLL
            r2.<init>(r1, r0, r4)
            r11.LJLJI = r6
            java.lang.Object r0 = X.XKX.LJI(r3, r2, r11)
            if (r0 != r5) goto L16
            return r5
        Lcb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3F.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
