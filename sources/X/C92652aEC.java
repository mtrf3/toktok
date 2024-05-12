package X;

import com.bytedance.pipo.checkout.api.network.model.request.PaymentMethod;
import com.bytedance.pipo.checkout.api.network.model.response.Methods;
import java.util.List;
import kotlin.jvm.internal.IDqS178S0200000_31;
import kotlin.jvm.internal.IDqS30S0300000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.aEC, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92652aEC extends AbstractC65781Prl implements InterfaceC88473Ynt<C23390vv, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ List<InterfaceC91961a33> LJLIL;
    public final /* synthetic */ EnumC91839a15 LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<PaymentMethod, C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92652aEC(List<? extends InterfaceC91961a33> list, EnumC91839a15 enumC91839a15, boolean z, boolean z2, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super PaymentMethod, C76800UCe> interfaceC88472Yns2) {
        super(3);
        this.LJLIL = list;
        this.LJLILLLLZI = enumC91839a15;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = interfaceC88472Yns2;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(C23390vv c23390vv, InterfaceC24520xk interfaceC24520xk, Integer num) {
        boolean z;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 81) ^ 16) != 0 || !interfaceC24520xk2.LIZ()) {
            C32371Ov c32371Ov = C0YW.LIZJ;
            List<InterfaceC91961a33> list = this.LJLIL;
            EnumC91839a15 enumC91839a15 = this.LJLILLLLZI;
            boolean z2 = this.LJLJI;
            boolean z3 = this.LJLJJI;
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LJLJJL;
            InterfaceC88472Yns<PaymentMethod, C76800UCe> interfaceC88472Yns2 = this.LJLJJLL;
            interfaceC24520xk2.LJJIIJ(-483455358);
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZ = C09330Yf.LIZ(c32371Ov, C07730Sb.LJIILIIL, interfaceC24520xk2);
            interfaceC24520xk2.LJJIIJ(-1323940314);
            Object LJIILLIIL = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIIJ);
            Object LJIILLIIL3 = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(c1m1);
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
                LJIIL.invoke(new C24440xc(interfaceC24520xk2), interfaceC24520xk2, 0);
                interfaceC24520xk2.LJJIIJ(2058660585);
                interfaceC24520xk2.LJJIIJ(-1163856341);
                for (InterfaceC91961a33 interfaceC91961a33 : list) {
                    if (interfaceC91961a33 instanceof C92231a7P) {
                        Methods methods = ((C92231a7P) interfaceC91961a33).LJLIL;
                        if (o.LJ(methods.getPaymentMethodType(), EnumC91967a39.CCDC.getValue())) {
                            interfaceC24520xk2.LJJIIJ(-1245083825);
                            C91745ZzZ.LIZ(enumC91839a15, false, false, z2, new IDqS178S0200000_31(interfaceC91961a33, (InterfaceC91961a33) interfaceC88472Yns, (InterfaceC88472Yns<? super String, C76800UCe>) 5), interfaceC24520xk2, 0, 6);
                            interfaceC24520xk2.LJJIJIIJIL();
                        } else {
                            interfaceC24520xk2.LJJIIJ(-1245083392);
                            if (z3 && o.LJ(interfaceC91961a33, C91943a2l.LIZ.getValue())) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C91750Zze.LIZIZ(methods, null, null, false, false, z, z2, new IDqS30S0300000_31(interfaceC91961a33, (InterfaceC91961a33) interfaceC88472Yns2, (InterfaceC88472Yns<? super PaymentMethod, C76800UCe>) interfaceC88472Yns, (InterfaceC88472Yns<? super String, C76800UCe>) 1), interfaceC24520xk2, 8, 30);
                            interfaceC24520xk2.LJJIJIIJIL();
                        }
                    }
                }
                interfaceC24520xk2.LJJIJIIJIL();
                interfaceC24520xk2.LJJIJIIJIL();
                interfaceC24520xk2.LJIJ();
                interfaceC24520xk2.LJJIJIIJIL();
                interfaceC24520xk2.LJJIJIIJIL();
            } else {
                C78929UyL.LJIILJJIL();
                throw null;
            }
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
