package X;

import com.bytedance.lighten.loader.SmartImageView;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.core.image.PdpDescImageOptimize$load$1", f = "PdpDescImageOptimize.kt", l = {42}, m = "invokeSuspend")
/* renamed from: X.ALp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26085ALp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C47261Igj LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ C27177AlZ LJLJJL;
    public final /* synthetic */ SmartImageView LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26085ALp(boolean z, C47261Igj c47261Igj, String str, C27177AlZ c27177AlZ, SmartImageView smartImageView, InterfaceC67352kd<? super C26085ALp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = c47261Igj;
        this.LJLJJI = str;
        this.LJLJJL = c27177AlZ;
        this.LJLJJLL = smartImageView;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26085ALp(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLIL
            r6 = 1
            if (r0 == 0) goto L16
            if (r0 != r6) goto Le
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Exception -> Lab
            goto Lab
        Le:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L16:
            X.C141335gf.LIZJ(r9)
            boolean r0 = r8.LJLILLLLZI     // Catch: java.lang.Exception -> Lab
            java.lang.String r7 = ""
            if (r0 == 0) goto L3c
            X.Igj r1 = r8.LJLJI     // Catch: java.lang.Exception -> Lab
            java.lang.String r0 = r8.LJLJJI     // Catch: java.lang.Exception -> Lab
            if (r0 != 0) goto L26
            r0 = r7
        L26:
            r1.getClass()     // Catch: java.lang.Exception -> Lab
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> Lab
            java.lang.String r0 = "parse(imageUrl)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> Lab
            boolean r0 = X.C70759Rpr.LIZIZ(r1)     // Catch: java.lang.Exception -> Lab
            if (r0 != 0) goto L3c
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Exception -> Lab
            return r0
        L3c:
            X.AlZ r0 = r8.LJLJJL     // Catch: java.lang.Exception -> Lab
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.LJLIL     // Catch: java.lang.Exception -> Lab
            java.lang.Integer r0 = r0.getWidth()     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto L87
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> Lab
        L4a:
            double r3 = (double) r0     // Catch: java.lang.Exception -> Lab
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 * r0
            X.AlZ r0 = r8.LJLJJL     // Catch: java.lang.Exception -> Lab
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.LJLIL     // Catch: java.lang.Exception -> Lab
            java.lang.Integer r0 = r0.getHeight()     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto L85
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> Lab
        L5c:
            double r0 = (double) r0     // Catch: java.lang.Exception -> Lab
            double r3 = r3 / r0
            r0 = 100
            double r1 = (double) r0     // Catch: java.lang.Exception -> Lab
            double r1 = r1 / r3
            java.lang.String r0 = r8.LJLJJI     // Catch: java.lang.Exception -> Lab
            if (r0 != 0) goto L83
        L66:
            int r0 = (int) r1     // Catch: java.lang.Exception -> Lab
            java.lang.String r3 = X.C62643OiF.LJIIZILJ(r0, r7)     // Catch: java.lang.Exception -> Lab
            X.Igj r1 = r8.LJLJI     // Catch: java.lang.Exception -> Lab
            com.bytedance.lighten.loader.SmartImageView r0 = r8.LJLJJLL     // Catch: java.lang.Exception -> Lab
            android.content.Context r2 = r0.getContext()     // Catch: java.lang.Exception -> Lab
            java.lang.String r0 = "image.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> Lab
            r1.getClass()     // Catch: java.lang.Exception -> Lab
            boolean r0 = X.C70759Rpr.LIZJ(r3)     // Catch: java.lang.Exception -> Lab
            r4 = 0
            if (r0 != 0) goto L89
            goto L97
        L83:
            r7 = r0
            goto L66
        L85:
            r0 = 1
            goto L5c
        L87:
            r0 = 1
            goto L4a
        L89:
            java.lang.String r1 = X.C70759Rpr.LIZ(r3)     // Catch: java.lang.Exception -> Lab
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Exception -> L97
            android.content.res.Resources r0 = r2.getResources()     // Catch: java.lang.Exception -> L97
            r3.<init>(r0, r1)     // Catch: java.lang.Exception -> L97
            goto L98
        L97:
            r3 = r4
        L98:
            X.UtN r2 = X.C36636EZk.LIZ     // Catch: java.lang.Exception -> Lab
            X.ALn r1 = new X.ALn     // Catch: java.lang.Exception -> Lab
            com.bytedance.lighten.loader.SmartImageView r0 = r8.LJLJJLL     // Catch: java.lang.Exception -> Lab
            r1.<init>(r3, r0, r4)     // Catch: java.lang.Exception -> Lab
            r8.LJLIL = r6     // Catch: java.lang.Exception -> Lab
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r8)     // Catch: java.lang.Exception -> Lab
            if (r0 != r5) goto Lab
            return r5
        Lab:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26085ALp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
