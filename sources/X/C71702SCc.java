package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardViewModel$collectData$1", f = "ATMCardViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.SCc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71702SCc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ATMCardViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71702SCc(ATMCardViewModel aTMCardViewModel, String str, InterfaceC67352kd<? super C71702SCc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = aTMCardViewModel;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71702SCc(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str;
        Object obj3;
        C71706SCg LLJLLL;
        InterfaceC71722SCw interfaceC71722SCw;
        Object value;
        C141335gf.LIZJ(obj);
        List<InterfaceC57784Mm4> list = this.LJLIL.getState().LJLIL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (C8RL c8rl : list) {
            if (c8rl instanceof C71704SCe) {
                C71704SCe c71704SCe = (C71704SCe) c8rl;
                String LJJIIZI = C78934UyQ.LJJIIZI((InterfaceC71708SCi) c8rl);
                o.LJIIIZ(c71704SCe, "<this>");
                C71735SDj L = C71735SDj.L(c71704SCe.LJLJJL.LIZIZ, LJJIIZI);
                C71706SCg c71706SCg = c71704SCe.LJLJJL;
                InterfaceC71722SCw interfaceC71722SCw2 = c71706SCg.LIZ;
                int i = c71706SCg.LIZJ;
                C71706SCg c71706SCg2 = new C71706SCg(0);
                c71706SCg2.LIZ = interfaceC71722SCw2;
                c71706SCg2.LIZIZ = L;
                c71706SCg2.LIZJ = i;
                c8rl = C71704SCe.LIZ(c71704SCe, c71706SCg2);
            }
            arrayList.add(c8rl);
        }
        PaymentMethod paymentMethod = this.LJLIL.LJLILLLLZI;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof InterfaceC71708SCi) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (((InterfaceC71708SCi) next2).LLJLLL().LIZIZ.M()) {
                arrayList3.add(next2);
            }
        }
        if (C1GE.LJIILIIL(arrayList3) || paymentMethod == null) {
            this.LJLIL.jv0(arrayList);
            String str2 = this.LJLILLLLZI;
            OSZ[] oszArr = new OSZ[2];
            oszArr[0] = new OSZ("is_card_save", Boolean.valueOf(this.LJLIL.LJLJI));
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                String str3 = ((InterfaceC71708SCi) it3.next()).getElementDTO().paramName;
                if (str3 != null) {
                    arrayList4.add(str3);
                }
            }
            oszArr[1] = new OSZ("payment_info_finish", ORZ.LLD(arrayList4, ",", null, null, null, 62));
            C28112B1o.LIZJ(str2, C113554cx.LJJL(oszArr), Boolean.valueOf(this.LJLIL.iv0().LJ), this.LJLIL.iv0().LJFF.toString(), this.LJLIL.iv0().LJI);
            return C76800UCe.LIZ;
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List<PaymentElement> LJJLL = ((InterfaceC71708SCi) it4.next()).LJJLL();
            if (LJJLL != null) {
                arrayList5.add(LJJLL);
            }
        }
        List LJJLI = C32I.LJJLI(arrayList5);
        Iterator it5 = arrayList2.iterator();
        while (true) {
            if (it5.hasNext()) {
                obj2 = it5.next();
                if (ORZ.LJLJJI(((InterfaceC71708SCi) obj2).getElementDTO().id, C71691SBr.LJFF)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        InterfaceC71708SCi interfaceC71708SCi = (InterfaceC71708SCi) obj2;
        Object obj4 = "";
        if (interfaceC71708SCi == null || (LLJLLL = interfaceC71708SCi.LLJLLL()) == null || (interfaceC71722SCw = LLJLLL.LIZ) == null || (value = interfaceC71722SCw.value()) == null || (str = value.toString()) == null) {
            str = "";
        }
        try {
            Object LLIIIILZ = C40689Fy1.LLIIIILZ(4, str);
            C3C5.m7constructorimpl(LLIIIILZ);
            obj3 = LLIIIILZ;
        } catch (Throwable th) {
            Object LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            obj3 = LIZ;
        }
        if (!C3C5.m12isFailureimpl(obj3)) {
            obj4 = obj3;
        }
        PaymentMethod LIZIZ = PaymentMethod.LIZIZ(paymentMethod, paymentMethod.LJIIL() + "(**" + ((String) obj4) + ')', null, null, true, str, -3, 63);
        PaymentInfo paymentInfo = new PaymentInfo(new PaymentMethodInfo(LIZIZ.id, LIZIZ.token, LJJLI, Boolean.valueOf(this.LJLIL.LJLJI), null, null, null, 64, null), LIZIZ, null, Boolean.TRUE, null, null, 48, null);
        PaymentCacheHelper.LJII(this.LJLIL.LJLJJI);
        PaymentCacheHelper.LIZIZ(paymentInfo);
        ATMCardViewModel aTMCardViewModel = this.LJLIL;
        C2U8.LIZ(new C27985Ayb(paymentInfo, aTMCardViewModel.LJLIL, aTMCardViewModel.LJLJJI));
        C28112B1o.LJFF = "next";
        C28112B1o.LIZJ(this.LJLILLLLZI, C113554cx.LJJL(new OSZ("is_card_save", new Integer(this.LJLIL.LJLJI ? 1 : 0)), new OSZ("payment_info_finish", "1")), Boolean.valueOf(this.LJLIL.iv0().LJ), this.LJLIL.iv0().LJFF.toString(), this.LJLIL.iv0().LJI);
        this.LJLIL.setState(C71710SCk.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
