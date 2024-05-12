package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aGy, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92824aGy extends AbstractC65781Prl implements InterfaceC88474Ynu<InterfaceC06520Nk, String, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC65784Pro<Float> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Object LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92824aGy(InterfaceC65784Pro<Float> interfaceC65784Pro, String str, int i, String str2, Object obj, String str3) {
        super(4);
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = str2;
        this.LJLJJL = obj;
        this.LJLJJLL = str3;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(InterfaceC06520Nk AnimatedContent, String it, InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC65784Pro interfaceC65784Pro;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        num.intValue();
        o.LJIIIZ(AnimatedContent, "$this$AnimatedContent");
        o.LJIIIZ(it, "it");
        if (!o.LJ(it, "checkout_home") && !o.LJ(it, "select_pi_without_default")) {
            interfaceC65784Pro = C92822aGw.LJLIL;
        } else {
            interfaceC65784Pro = this.LJLIL;
        }
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        InterfaceC07790Sh LJIIL = C78866UxK.LJIIL(C09290Yb.LJII(c1m1), ((Number) interfaceC65784Pro.invoke()).floatValue());
        C32301Oo c32301Oo = C0YW.LJ;
        String str = this.LJLILLLLZI;
        int i = this.LJLJI;
        String str2 = this.LJLJJI;
        Object obj = this.LJLJJL;
        String str3 = this.LJLJJLL;
        interfaceC24520xk2.LJJIIJ(693286680);
        InterfaceC07760Se.LJJJ.getClass();
        InterfaceC273215k LIZ = C0YX.LIZ(c32301Oo, C07730Sb.LJIIJ, interfaceC24520xk2);
        interfaceC24520xk2.LJJIIJ(-1323940314);
        Object LJIILLIIL = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJ);
        Object LJIILLIIL2 = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIIJ);
        Object LJIILLIIL3 = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIILJJIL);
        InterfaceC03730Cr.LJ.getClass();
        C46041rM c46041rM = C03720Cq.LIZIZ;
        C40431iJ LJIIL2 = C56509MFt.LJIIL(LJIIL);
        if (interfaceC24520xk2.LJJ() instanceof InterfaceC24420xa) {
            interfaceC24520xk2.LJIJI();
            if (interfaceC24520xk2.LJIJJLI()) {
                interfaceC24520xk2.LJJI(c46041rM);
            } else {
                interfaceC24520xk2.LIZIZ();
            }
            interfaceC24520xk2.LJJIIZI();
            C24830yF.LIZ(interfaceC24520xk2, LIZ, C03720Cq.LJ);
            C24830yF.LIZ(interfaceC24520xk2, LJIILLIIL, C03720Cq.LIZLLL);
            C24830yF.LIZ(interfaceC24520xk2, LJIILLIIL2, C03720Cq.LJFF);
            C24830yF.LIZ(interfaceC24520xk2, LJIILLIIL3, C03720Cq.LJI);
            interfaceC24520xk2.LJIIIIZZ();
            LJIIL2.invoke(new C24440xc(interfaceC24520xk2), interfaceC24520xk2, 0);
            interfaceC24520xk2.LJJIIJ(2058660585);
            interfaceC24520xk2.LJJIIJ(-678309503);
            if (o.LJ(it, "checkout_home") || o.LJ(it, "select_pi") || o.LJ(it, "select_pi_without_default")) {
                interfaceC24520xk2.LJJIIJ(-1295374120);
                C91905a29.LIZIZ(C92054a4Y.LIZ("pipo_payin_total_amount_title", new String[0]), str, interfaceC24520xk2, (i >> 6) & 112);
                interfaceC24520xk2.LJJIJIIJIL();
            } else if (o.LJ(it, "select_assemble_pi")) {
                interfaceC24520xk2.LJJIIJ(-1295373894);
                C91864a1U.LIZ(str2, obj, interfaceC24520xk2, ((i >> 18) & 14) | 64);
                interfaceC24520xk2.LJJIJIIJIL();
            } else if (o.LJ(it, "webview")) {
                interfaceC24520xk2.LJJIIJ(-1295373714);
                C91905a29.LIZJ((i >> 15) & 14, interfaceC24520xk2, str3);
                interfaceC24520xk2.LJJIJIIJIL();
            } else if (o.LJ(it, "pay_result")) {
                interfaceC24520xk2.LJJIIJ(-1295373640);
                C91905a29.LIZJ(6, interfaceC24520xk2, "");
                interfaceC24520xk2.LJJIJIIJIL();
            } else {
                interfaceC24520xk2.LJJIIJ(-1295373594);
                C79057V0z.LJ(c1m1, interfaceC24520xk2, 6);
                interfaceC24520xk2.LJJIJIIJIL();
            }
            interfaceC24520xk2.LJJIJIIJIL();
            interfaceC24520xk2.LJJIJIIJIL();
            interfaceC24520xk2.LJIJ();
            interfaceC24520xk2.LJJIJIIJIL();
            interfaceC24520xk2.LJJIJIIJIL();
            return C76800UCe.LIZ;
        }
        C78929UyL.LJIILJJIL();
        throw null;
    }
}
