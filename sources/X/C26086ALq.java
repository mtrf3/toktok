package X;

import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils$fillOriginImage$1$1", f = "AnchorBizUtils.kt", l = {1397, 1405}, m = "invokeSuspend")
/* renamed from: X.ALq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26086ALq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ ShopWindowAnchorModel LJLJJI;
    public final /* synthetic */ SHA LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26086ALq(String str, boolean z, ShopWindowAnchorModel shopWindowAnchorModel, SHA sha, InterfaceC67352kd<? super C26086ALq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = shopWindowAnchorModel;
        this.LJLJJL = sha;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26086ALq(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLIL
            r7 = 2
            r3 = 1
            if (r0 == 0) goto L12
            if (r0 == r3) goto L36
            if (r0 != r7) goto L92
            X.C141335gf.LIZJ(r9)
        Lf:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L12:
            X.C141335gf.LIZJ(r9)
            java.lang.String r1 = r8.LJLILLLLZI
            java.lang.String r0 = "image"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            android.util.LruCache<java.lang.String, X.HLn<X.UCe>> r0 = X.C70868Rrc.LIZ
            java.lang.Object r1 = r0.get(r1)
            X.2mE r1 = (X.InterfaceC68342mE) r1
            if (r1 == 0) goto L39
            boolean r0 = r1.isCompleted()
            if (r0 != 0) goto L39
            r8.LJLIL = r3
            java.lang.Object r0 = r1.LJI(r8)
            if (r0 != r6) goto L39
            return r6
        L36:
            X.C141335gf.LIZJ(r9)
        L39:
            X.RzZ r0 = X.C71361RzZ.LIZ
            java.lang.String r1 = r8.LJLILLLLZI
            r0.getClass()
            boolean r0 = X.C70759Rpr.LIZJ(r1)
            r5 = 0
            if (r0 != 0) goto L84
        L47:
            r4 = r5
        L48:
            boolean r0 = r8.LJLJI
            if (r0 == 0) goto L71
            X.RzZ r2 = X.C71361RzZ.LIZ
            com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel r0 = r8.LJLJJI
            com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel r1 = r0.LIZ
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
            r2.getClass()
            java.lang.String r3 = X.C71361RzZ.LJJIJLIJ(r1, r0)
        L5e:
            X.UtN r2 = X.C36636EZk.LIZ
            X.ALo r1 = new X.ALo
            X.SHA r0 = r8.LJLJJL
            r1.<init>(r4, r0, r3, r5)
            r8.LJLIL = r7
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r8)
            if (r0 != r6) goto Lf
            return r6
        L71:
            X.RzZ r2 = X.C71361RzZ.LIZ
            com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel r0 = r8.LJLJJI
            com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel r1 = r0.LIZ
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r3)
            r2.getClass()
            java.lang.String r3 = X.C71361RzZ.LJJIJLIJ(r1, r0)
            goto L5e
        L84:
            java.lang.String r1 = X.C70759Rpr.LIZ(r1)
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Exception -> L47
            android.content.res.Resources r0 = X.C86V.LJ()     // Catch: java.lang.Exception -> L47
            r4.<init>(r0, r1)     // Catch: java.lang.Exception -> L47
            goto L48
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26086ALq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
