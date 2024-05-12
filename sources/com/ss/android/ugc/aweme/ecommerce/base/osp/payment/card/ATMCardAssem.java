package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card;

import X.AbstractC38911fr;
import X.C00F;
import X.C117104ig;
import X.C16880lQ;
import X.C19N;
import X.C214298b3;
import X.C28112B1o;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71691SBr;
import X.C71693SBt;
import X.C71704SCe;
import X.C71711SCl;
import X.C71721SCv;
import X.C78926UyI;
import X.C78934UyQ;
import X.C87583cA;
import X.C8YN;
import X.C9BE;
import X.EO3;
import X.InterfaceC57784Mm4;
import X.InterfaceC71708SCi;
import X.ORZ;
import X.OSZ;
import X.SAN;
import X.SCQ;
import X.SY4;
import X.SYL;
import X.TBT;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.viewholder.ATMSaveNewCardViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.viewholder.NormalTextInputHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.viewholder.SupportIconsHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ATMCardAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public ATMCardAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ATMCardViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 275), C71711SCl.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, C71693SBt.class, null), checkSupervisorPrepared());
    }

    public final C71693SBt v3() {
        return (C71693SBt) this.LJLILLLLZI.getValue();
    }

    public final ATMCardViewModel x3() {
        return (ATMCardViewModel) this.LJLIL.getValue();
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        if (!SCQ.LJIIIIZZ) {
            List<InterfaceC57784Mm4> list = x3().getState().LJLIL;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC57784Mm4 interfaceC57784Mm4 : list) {
                if (interfaceC57784Mm4 instanceof InterfaceC71708SCi) {
                    arrayList.add(interfaceC57784Mm4);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            boolean z = true;
            while (it.hasNext()) {
                InterfaceC71708SCi interfaceC71708SCi = (InterfaceC71708SCi) it.next();
                boolean z2 = false;
                if (C78934UyQ.LJJIIZI(interfaceC71708SCi).length() <= 0) {
                    String LJIILIIL = C28112B1o.LJIILIIL(interfaceC71708SCi.getElementDTO().paramName);
                    z2 = z;
                    if (LJIILIIL != null) {
                        arrayList2.add(LJIILIIL);
                    }
                }
                z = z2;
            }
            OSZ osz = new OSZ(Boolean.valueOf(z), arrayList2);
            C28112B1o.LJIIL(C28112B1o.LIZ("stay_duration"), Boolean.valueOf(x3().iv0().LJ), x3().iv0().LJFF.toString(), x3().iv0().LJI, ORZ.LLD((Iterable) osz.getSecond(), ",", null, null, null, 62), ((Boolean) osz.getFirst()).booleanValue());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean LJ;
        PaymentMethodInfo paymentMethodInfo;
        Boolean isChooseSave;
        PaymentMethod paymentMethod;
        String LJFF;
        PaymentInfo paymentInfo;
        PaymentMethodInfo paymentMethodInfo2;
        List<PaymentElement> paymentElements;
        PaymentElement paymentElement;
        String str;
        PaymentElement paymentElement2;
        String paramValue;
        PaymentElement paymentElement3;
        String paramValue2;
        String LIZIZ;
        o.LJIIIZ(view, "view");
        ((SY4) _$_findCachedViewById(R.id.at8)).setEnabled(true);
        SYL syl = (SYL) _$_findCachedViewById(R.id.hqp);
        syl.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager() { // from class: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardAssem$initViews$1$1
            {
                super(2);
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[Catch: Exception -> 0x00c8, TryCatch #0 {Exception -> 0x00c8, blocks: (B:9:0x003c, B:12:0x0043, B:13:0x0054, B:15:0x005d, B:17:0x0065, B:19:0x0069, B:21:0x006f, B:24:0x0082, B:28:0x0074, B:30:0x007c, B:32:0x0087, B:33:0x008a, B:37:0x008d, B:44:0x0097, B:45:0x009b, B:47:0x00a1, B:50:0x00ae, B:52:0x00b2, B:54:0x00b8, B:56:0x00c0), top: B:8:0x003c }] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0085 A[SYNTHETIC] */
            @Override // X.C0A2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.view.View LJL(int r11, android.view.View r12) {
                /*
                    r10 = this;
                    java.lang.String r0 = "focused"
                    kotlin.jvm.internal.o.LJIIIZ(r12, r0)
                    com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardAssem r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardAssem.this
                    com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardViewModel r2 = r0.x3()
                    com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardAssem r1 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardAssem.this
                    r0 = 2131373020(0x7f0a2bdc, float:1.836612E38)
                    android.view.View r6 = r1._$_findCachedViewById(r0)
                    X.SYL r6 = (X.SYL) r6
                    java.lang.String r0 = "plElementList"
                    kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
                    r2.getClass()
                    r0 = 2
                    r9 = 0
                    if (r11 != r0) goto L34
                    X.Ol8 r0 = X.C53318KwE.LIZ
                    java.lang.Object r0 = r0.getValue()
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r0 = r0.intValue()
                    r8 = 0
                    if (r0 != 0) goto Lce
                    r0 = 1
                L32:
                    if (r0 == 0) goto L3a
                L34:
                    r12 = r9
                L35:
                    if (r12 != 0) goto L38
                L37:
                    return r9
                L38:
                    r9 = r12
                    goto L37
                L3a:
                    r0 = 30
                    android.view.View r7 = X.C30581Hy.LJJIL(r12, r6, r0)     // Catch: java.lang.Exception -> Lc8
                    if (r7 != 0) goto L43
                    goto L34
                L43:
                    Y.IDObjectS332S0100000_12 r1 = new Y.IDObjectS332S0100000_12     // Catch: java.lang.Exception -> Lc8
                    r0 = 11
                    r1.<init>(r6, r0)     // Catch: java.lang.Exception -> Lc8
                    java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lc8
                    r3.<init>()     // Catch: java.lang.Exception -> Lc8
                    java.util.Iterator r5 = r1.iterator()     // Catch: java.lang.Exception -> Lc8
                    r4 = r9
                L54:
                    r1 = r5
                    Y.IDObjectS5S0101000_12 r1 = (Y.IDObjectS5S0101000_12) r1     // Catch: java.lang.Exception -> Lc8
                    boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> Lc8
                    if (r0 == 0) goto L8b
                    java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> Lc8
                    int r2 = r8 + 1
                    if (r8 < 0) goto L87
                    android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Exception -> Lc8
                    if (r4 != 0) goto L74
                    boolean r0 = kotlin.jvm.internal.o.LJ(r0, r7)     // Catch: java.lang.Exception -> Lc8
                    if (r0 == 0) goto L7f
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> Lc8
                    goto L7f
                L74:
                    androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r6.LJJJJJL(r0)     // Catch: java.lang.Exception -> Lc8
                    boolean r0 = r1 instanceof X.InterfaceC27239AmZ     // Catch: java.lang.Exception -> Lc8
                    if (r0 == 0) goto L7f
                    X.AmZ r1 = (X.InterfaceC27239AmZ) r1     // Catch: java.lang.Exception -> Lc8
                    goto L80
                L7f:
                    r1 = r9
                L80:
                    if (r1 == 0) goto L85
                    r3.add(r1)     // Catch: java.lang.Exception -> Lc8
                L85:
                    r8 = r2
                    goto L54
                L87:
                    X.C47261Igj.LJJJJJ()     // Catch: java.lang.Exception -> Lc8
                    throw r9     // Catch: java.lang.Exception -> Lc8
                L8b:
                    if (r4 == 0) goto L34
                    r4.intValue()     // Catch: java.lang.Exception -> Lc8
                    boolean r0 = r3.isEmpty()     // Catch: java.lang.Exception -> Lc8
                    if (r0 == 0) goto L97
                    goto L35
                L97:
                    java.util.Iterator r2 = r3.iterator()     // Catch: java.lang.Exception -> Lc8
                L9b:
                    boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Lc8
                    if (r0 == 0) goto Lc6
                    java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> Lc8
                    r0 = r1
                    X.AmZ r0 = (X.InterfaceC27239AmZ) r0     // Catch: java.lang.Exception -> Lc8
                    boolean r0 = r0.needFocus()     // Catch: java.lang.Exception -> Lc8
                    if (r0 == 0) goto L9b
                Lae:
                    X.AmZ r1 = (X.InterfaceC27239AmZ) r1     // Catch: java.lang.Exception -> Lc8
                    if (r1 == 0) goto Lb8
                    android.view.View r12 = r1.getFocusView()     // Catch: java.lang.Exception -> Lc8
                    if (r12 != 0) goto L35
                Lb8:
                    java.lang.Object r0 = X.ORZ.LJLLLL(r3)     // Catch: java.lang.Exception -> Lc8
                    X.AmZ r0 = (X.InterfaceC27239AmZ) r0     // Catch: java.lang.Exception -> Lc8
                    if (r0 == 0) goto L34
                    android.view.View r12 = r0.getFocusView()     // Catch: java.lang.Exception -> Lc8
                    goto L35
                Lc6:
                    r1 = r9
                    goto Lae
                Lc8:
                    r0 = move-exception
                    X.C16880lQ.LLLLIIL(r0)
                    goto L34
                Lce:
                    r0 = 0
                    goto L32
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardAssem$initViews$1$1.LJL(int, android.view.View):android.view.View");
            }
        };
        gridLayoutManager.LLIILII = new C71721SCv();
        syl.setLayoutManager(gridLayoutManager);
        syl.LJII(new C117104ig(-1), -1);
        syl.setLifecycleOwner(this);
        syl.LLLF.LJZL(NormalTextInputHolder.class, ATMSaveNewCardViewHolder.class, SupportIconsHolder.class);
        PaymentInfo paymentInfo2 = null;
        syl.setItemAnimator(null);
        PaymentMethod paymentMethod2 = v3().LJLIL;
        String str2 = "";
        if (paymentMethod2 != null) {
            ArrayList arrayList = new ArrayList();
            List<ElementDTO> LJI = paymentMethod2.LJI();
            if (LJI != null) {
                for (ElementDTO elementDTO : LJI) {
                    x3().getClass();
                    C71704SCe gv0 = ATMCardViewModel.gv0(elementDTO, paymentMethod2);
                    if (gv0 != null) {
                        arrayList.add(gv0);
                    }
                }
            }
            x3().getClass();
            List<? extends InterfaceC57784Mm4> hv0 = ATMCardViewModel.hv0(paymentMethod2, arrayList);
            if (o.LJ(v3().LJLJJI, "EDIT_CARD")) {
                ATMCardViewModel x3 = x3();
                EnterParams enterParams = v3().LJLILLLLZI;
                if (enterParams != null) {
                    paymentInfo = enterParams.paymentInfo;
                } else {
                    paymentInfo = null;
                }
                x3.getClass();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = ((ArrayList) hv0).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof C71704SCe) {
                        arrayList2.add(next);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C71704SCe c71704SCe = (C71704SCe) it2.next();
                    o.LJIIIZ(c71704SCe, "<this>");
                    AbstractC38911fr adapter = c71704SCe.LJLJI;
                    o.LJIIIZ(adapter, "adapter");
                    if (paymentInfo != null && (paymentMethodInfo2 = paymentInfo.paymentMethodInfo) != null && (paymentElements = paymentMethodInfo2.getPaymentElements()) != null) {
                        List<ElementDTO> list = c71704SCe.LJLIL.subElementDTOList;
                        if (list == null || list.isEmpty()) {
                            Iterator<PaymentElement> it3 = paymentElements.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    paymentElement = it3.next();
                                    SAN san = SAN.LIZ;
                                    String element = paymentElement.getElement();
                                    san.getClass();
                                    if (o.LJ(SAN.LIZJ(element), SAN.LIZJ(c71704SCe.LJLIL.id))) {
                                        break;
                                    }
                                } else {
                                    paymentElement = null;
                                    break;
                                }
                            }
                            PaymentElement paymentElement4 = paymentElement;
                            if (paymentElement4 == null || (str = paymentElement4.getParamValue()) == null) {
                                str = "";
                            }
                            c71704SCe.LJLJJL.LIZ = adapter.LJIIL(str);
                        } else {
                            Iterator<PaymentElement> it4 = paymentElements.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    paymentElement2 = it4.next();
                                    if (ORZ.LJLJJI(paymentElement2.getElement(), C71691SBr.LIZIZ)) {
                                        break;
                                    }
                                } else {
                                    paymentElement2 = null;
                                    break;
                                }
                            }
                            PaymentElement paymentElement5 = paymentElement2;
                            if (paymentElement5 != null && (paramValue = paymentElement5.getParamValue()) != null) {
                                Iterator<PaymentElement> it5 = paymentElements.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        paymentElement3 = it5.next();
                                        if (ORZ.LJLJJI(paymentElement3.getElement(), C71691SBr.LIZJ)) {
                                            break;
                                        }
                                    } else {
                                        paymentElement3 = null;
                                        break;
                                    }
                                }
                                PaymentElement paymentElement6 = paymentElement3;
                                if (paymentElement6 != null && (paramValue2 = paymentElement6.getParamValue()) != null && (LIZIZ = C00F.LIZIZ(paramValue, '/', paramValue2)) != null) {
                                    c71704SCe.LJLJJL.LIZ = adapter.LJIIL(LIZIZ);
                                }
                            }
                        }
                    }
                }
            }
            x3().jv0(hv0);
        }
        View btAdd = _$_findCachedViewById(R.id.at8);
        o.LJIIIIZZ(btAdd, "btAdd");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 75, 42), btAdd);
        C8YN.LJIIJ(this, x3(), new TBT() { // from class: X.SCs
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71705SCf) obj).LJLIL;
            }
        }, new TBT() { // from class: X.SCt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71705SCf) obj).LJLJJL;
            }
        }, null, C87583cA.LJLIL, 12);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.SCp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71705SCf) obj).LJLJI;
            }
        }, null, new AqS194S0100000_12(this, 200), 6);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.SCu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71705SCf) obj).LJLILLLLZI;
            }
        }, null, new AqS194S0100000_12(this, 201), 6);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.SCo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71705SCf) obj).LJLJJI;
            }
        }, null, new AqS194S0100000_12(this, 202), 6);
        EO3.LIZLLL("atm_card_info");
        ATMCardViewModel x32 = x3();
        EnterParams enterParams2 = v3().LJLILLLLZI;
        x32.LJLIL = v3().LJLJJI;
        if (enterParams2 != null) {
            paymentInfo2 = enterParams2.paymentInfo;
            PaymentInfo paymentInfo3 = enterParams2.paymentInfo;
            if (paymentInfo3 != null && (paymentMethod = paymentInfo3.paymentMethod) != null && (LJFF = paymentMethod.LJFF()) != null) {
                str2 = LJFF;
            }
        }
        x32.LJLJJI = str2;
        if (paymentInfo2 != null && (paymentMethodInfo = paymentInfo2.paymentMethodInfo) != null && (isChooseSave = paymentMethodInfo.isChooseSave()) != null) {
            LJ = isChooseSave.booleanValue();
        } else {
            LJ = C19N.LJ("ecom_ccdc_auto_save", false);
        }
        x32.LJLJI = LJ;
    }
}
