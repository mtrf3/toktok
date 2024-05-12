package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card;

import X.AbstractC118814lR;
import X.C221108m2;
import X.C53318KwE;
import X.C62822Ol8;
import X.C71704SCe;
import X.C71705SCf;
import X.C71706SCg;
import X.C71712SCm;
import X.C71713SCn;
import X.C71717SCr;
import X.EnumC28119B1v;
import X.InterfaceC57784Mm4;
import X.InterfaceC71708SCi;
import X.ORZ;
import X.SCQ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ATMCardViewModel extends AssemViewModel<C71705SCf> {
    public String LJLIL;
    public PaymentMethod LJLILLLLZI;
    public boolean LJLJI;
    public String LJLJJI = "";
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C71717SCr.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C71705SCf defaultState() {
        return new C71705SCf(0);
    }

    public final SCQ iv0() {
        return (SCQ) this.LJLJJL.getValue();
    }

    public final void jv0(List<? extends InterfaceC57784Mm4> list) {
        C71706SCg LLJLLL;
        List LLJILJILJ = ORZ.LLJILJILJ(list);
        if (((Number) C53318KwE.LIZ.getValue()).intValue() != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) LLJILJILJ).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof InterfaceC71708SCi) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC71708SCi) it2.next()).LLJLLL().LIZJ = 5;
            }
            InterfaceC71708SCi interfaceC71708SCi = (InterfaceC71708SCi) ORZ.LLFII(arrayList);
            if (interfaceC71708SCi != null && (LLJLLL = interfaceC71708SCi.LLJLLL()) != null) {
                LLJLLL.LIZJ = 6;
            }
        }
        setState(new AqS178S0100000_12(LLJILJILJ, (List<Tab>) 118));
    }

    public static C71704SCe gv0(ElementDTO elementDTO, PaymentMethod paymentMethod) {
        o.LJIIIZ(elementDTO, "elementDTO");
        o.LJIIIZ(paymentMethod, "paymentMethod");
        Integer num = elementDTO.styleType;
        int ordinal = EnumC28119B1v.Normal.ordinal();
        if (num == null || num.intValue() != ordinal) {
            int ordinal2 = EnumC28119B1v.CardNumber.ordinal();
            if (num == null || num.intValue() != ordinal2) {
                int ordinal3 = EnumC28119B1v.Date.ordinal();
                if (num == null || num.intValue() != ordinal3) {
                    int ordinal4 = EnumC28119B1v.ISSUE_DATE.ordinal();
                    if (num == null || num.intValue() != ordinal4) {
                        return null;
                    }
                }
                return new C71704SCe(elementDTO, paymentMethod, new C71713SCn(), 2, 16);
            }
            return new C71704SCe(elementDTO, paymentMethod, new C71712SCm(), 2, 16);
        }
        return new C71704SCe(elementDTO, paymentMethod, (AbstractC118814lR) null, 0, 28);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0026, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List hv0(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r4, java.util.List r5) {
        /*
            java.lang.String r0 = "pm"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.addAll(r5)
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r4.subPaymentMethods
            if (r0 == 0) goto L17
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L28
        L17:
            X.SAN r0 = X.SAN.LIZ
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r1 = X.SAN.LIZJ
            java.lang.String r0 = "pm_pi_atmcard_all"
            java.lang.Object r4 = r1.get(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r4 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r4
            if (r4 == 0) goto L55
        L28:
            java.lang.String r1 = r4.saveDisplayText
            if (r1 == 0) goto L34
            X.SCq r0 = new X.SCq
            r0.<init>(r1)
            r3.add(r0)
        L34:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r4.subPaymentMethods
            if (r0 == 0) goto L55
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L41:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r0
            java.lang.String r0 = r0.iconUrl
            if (r0 == 0) goto L41
            r2.add(r0)
            goto L41
        L55:
            X.OQg r2 = X.C61878OQg.INSTANCE
        L57:
            X.4kR r0 = new X.4kR
            r0.<init>(r2)
            r3.add(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardViewModel.hv0(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, java.util.List):java.util.List");
    }
}
