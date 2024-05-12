package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc;

import X.C141335gf;
import X.C214298b3;
import X.C26706Ady;
import X.C27496Aqi;
import X.C27500Aqm;
import X.C27503Aqp;
import X.C27739Aud;
import X.C28112B1o;
import X.C3C5;
import X.C47261Igj;
import X.C47704Ins;
import X.C55749LuL;
import X.C65330PkU;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71690SBq;
import X.C71692SBs;
import X.C71694SBu;
import X.C71697SBx;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.EnumC27826Aw2;
import X.InterfaceC60061Nhh;
import X.ORY;
import X.ORZ;
import X.OSZ;
import X.SAN;
import X.SC5;
import X.SCQ;
import X.TBT;
import X.UC0;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentFragmentStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingFragmentEnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.dto.SelectRegionDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class CCDCAddCardAssem extends UIContentAssem implements InterfaceC60061Nhh, c {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C55749LuL hierarchyData$delegate;
    public final C214298b3 viewModel$delegate;

    private final void initSubscribe() {
        C8YN.LJII(this, getViewModel(), new TBT() { // from class: X.SC0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71677SBd) obj).LJLLI;
            }
        }, null, new AqS194S0100000_12(this, 48), 6);
        C8YN.LJII(this, getViewModel(), new TBT() { // from class: X.SC1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71677SBd) obj).LJLLILLLL;
            }
        }, null, C71694SBu.LJLIL, 6);
        C8YN.LJII(this, getViewModel(), new TBT() { // from class: X.SC3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71677SBd) obj).LJLJI;
            }
        }, null, new AqS194S0100000_12(this, 49), 6);
        C8YN.LJII(this, getViewModel(), new TBT() { // from class: X.SBp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71677SBd) obj).LJLILLLLZI;
            }
        }, null, C71690SBq.LJLIL, 6);
        C8YN.LJII(this, getViewModel(), new TBT() { // from class: X.SC4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71677SBd) obj).LJLJJLL;
            }
        }, null, new AqS194S0100000_12(this, 43), 6);
        C8YN.LJII(this, getViewModel(), new TBT() { // from class: X.SC2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71677SBd) obj).LJLJL;
            }
        }, null, new AqS194S0100000_12(this, 44), 6);
        C8YN.LJII(this, getViewModel(), new TBT() { // from class: X.SBy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71677SBd) obj).LJLJLLL;
            }
        }, null, new AqS194S0100000_12(this, 45), 6);
        C8YN.LJII(this, getViewModel(), new TBT() { // from class: X.SBw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71677SBd) obj).LJLL;
            }
        }, null, new AqS194S0100000_12(this, 46), 6);
        C8YN.LJII(this, getViewModel(), new TBT() { // from class: X.SBz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71677SBd) obj).LJLJLJ;
            }
        }, null, new AqS194S0100000_12(this, 47), 6);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public CCDCAddCardAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CCDCAddCardViewModel.class);
        this.viewModel$delegate = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 298), C71697SBx.INSTANCE, null);
        this.hierarchyData$delegate = new C55749LuL(C47704Ins.LIZJ(this, C71692SBs.class, null), checkSupervisorPrepared());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        PaymentInfo paymentInfo;
        String str;
        Object obj;
        Object obj2;
        PaymentMethodInfo paymentMethodInfo;
        List<PaymentElement> paymentElements;
        PaymentMethod paymentMethod;
        PaymentElement paymentElement;
        PaymentMethod ccdcPaymentMethod = getCcdcPaymentMethod();
        if (ccdcPaymentMethod != null) {
            CCDCAddCardViewModel viewModel = getViewModel();
            EnterParams enterParams = getHierarchyData().LJLILLLLZI;
            String str2 = getHierarchyData().LJLJJI;
            viewModel.getClass();
            viewModel.LJLJI = str2;
            viewModel.LJLILLLLZI = enterParams;
            if (C27500Aqm.LIZ()) {
                List<ElementDTO> list = ccdcPaymentMethod.elementDTOS;
                if (list != null || (list = ccdcPaymentMethod.neededElementDTOS) != null) {
                    for (ElementDTO elementDTO : list) {
                        Map<String, List<PaymentElement>> map = viewModel.LJLIL;
                        String str3 = elementDTO.id;
                        if (str3 == null) {
                            str3 = "";
                        }
                        map.put(str3, elementDTO.LIZIZ());
                    }
                }
                List list2 = (List) ((LinkedHashMap) viewModel.LJLIL).get("eg_ccdc_global_billing_address_country_regin");
                if (list2 != null && (paymentElement = (PaymentElement) ORZ.LJLLLL(list2)) != null) {
                    paymentElement.setParamValue(((Region) viewModel.LJLL.getValue()).code);
                }
            } else {
                List<ElementDTO> LJI = ccdcPaymentMethod.LJI();
                if (LJI != null) {
                    for (ElementDTO elementDTO2 : LJI) {
                        Map<String, List<PaymentElement>> map2 = viewModel.LJLIL;
                        String str4 = elementDTO2.id;
                        if (str4 == null) {
                            str4 = "";
                        }
                        map2.put(str4, elementDTO2.LIZIZ());
                    }
                }
            }
            if (o.LJ(str2, "EDIT_CARD")) {
                if (enterParams != null) {
                    paymentInfo = enterParams.paymentInfo;
                } else {
                    paymentInfo = null;
                }
                viewModel.LJLJJI = paymentInfo;
                if (paymentInfo == null || (paymentMethod = paymentInfo.paymentMethod) == null || (str = paymentMethod.LJFF()) == null) {
                    str = "";
                }
                viewModel.LJLJLLL = str;
                PaymentInfo paymentInfo2 = viewModel.LJLJJI;
                if (paymentInfo2 != null && (paymentMethodInfo = paymentInfo2.paymentMethodInfo) != null && (paymentElements = paymentMethodInfo.getPaymentElements()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (PaymentElement paymentElement2 : paymentElements) {
                        PaymentElement paymentElement3 = paymentElement2;
                        if (C27500Aqm.LIZ()) {
                            if (!o.LJ(paymentElement3.getElement(), "save_element")) {
                                arrayList.add(paymentElement2);
                            }
                        } else {
                            SAN san = SAN.LIZ;
                            String element = paymentElement3.getElement();
                            san.getClass();
                            if (!SAN.LJFF(element) && !o.LJ(paymentElement3.getElement(), "save_element")) {
                                arrayList.add(paymentElement2);
                            }
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        PaymentElement paymentElement4 = (PaymentElement) it.next();
                        Map<String, List<PaymentElement>> map3 = viewModel.LJLIL;
                        String element2 = paymentElement4.getElement();
                        if (element2 == null) {
                            element2 = "";
                        }
                        map3.put(element2, C47261Igj.LJJIJ(PaymentElement.copy$default(paymentElement4, null, null, null, null, null, 31, null)));
                    }
                }
                List<PaymentElement> remove = viewModel.LJLIL.remove("eg_ccdc_global_expiration_month");
                if (remove != null) {
                    obj = ORZ.LJLLLL(remove);
                } else {
                    obj = null;
                }
                List<PaymentElement> remove2 = viewModel.LJLIL.remove("eg_ccdc_global_expiration_year");
                if (remove2 != null) {
                    obj2 = ORZ.LJLLLL(remove2);
                } else {
                    obj2 = null;
                }
                viewModel.LJLIL.put("eg_ccdc_global_expiration_date", ORY.LJJIJLIJ(new PaymentElement[]{obj, obj2}));
            }
            viewModel.setStateImmediate(new AqS143S0200000_12(ccdcPaymentMethod, viewModel, 119));
        }
        getViewModel().LJLJJLL = (IPaymentFragmentStyle) UC0.LJIIJJI(this, "payment_method", null, null, null, 14);
    }

    public final C71692SBs getHierarchyData() {
        return (C71692SBs) this.hierarchyData$delegate.getValue();
    }

    public final CCDCAddCardViewModel getViewModel() {
        return (CCDCAddCardViewModel) this.viewModel$delegate.getValue();
    }

    private final PaymentMethod getCcdcPaymentMethod() {
        return getHierarchyData().LJLIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void initViews() {
        /*
            Method dump skipped, instructions count: 871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardAssem.initViews():void");
    }

    public final CCDCAddCardHalfFragment getFragment() {
        LifecycleOwner parent = getParent();
        if (parent instanceof CCDCAddCardHalfFragment) {
            return (CCDCAddCardHalfFragment) parent;
        }
        return null;
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        EventCenter.LJ().LIZIZ("ec_district_panel_changed_v2", this);
    }

    @Override // X.C8W0
    public void onStop() {
        super.onStop();
        if (!SCQ.LJIIIIZZ) {
            OSZ<Boolean, List<String>> lv0 = getViewModel().lv0();
            C28112B1o.LJIIL(C28112B1o.LIZ("stay_duration"), Boolean.valueOf(getViewModel().iv0().LJ), getViewModel().iv0().LJFF.toString(), getViewModel().iv0().LJI, ORZ.LLD(lv0.getSecond(), ",", null, null, null, 62), lv0.getFirst().booleanValue());
        }
    }

    public final void editBillingAddress(PaymentInfo paymentInfo) {
        Object LIZ;
        Address address;
        HashMap<String, Object> hashMap;
        if (paymentInfo == null) {
            return;
        }
        String str = null;
        try {
            CCDCAddCardHalfFragment fragment = getFragment();
            if (fragment != null) {
                LIZ = fragment.getChildFragmentManager();
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        FragmentManager fragmentManager = (FragmentManager) LIZ;
        if (fragmentManager != null) {
            PaymentMethod ccdcPaymentMethod = getCcdcPaymentMethod();
            EnumC27826Aw2 enumC27826Aw2 = EnumC27826Aw2.ADD_NEW_CARD;
            EnterParams enterParams = getHierarchyData().LJLILLLLZI;
            if (enterParams != null) {
                address = enterParams.shippingAddress;
            } else {
                address = null;
            }
            EnterParams enterParams2 = getHierarchyData().LJLILLLLZI;
            if (enterParams2 != null) {
                str = enterParams2.paySource;
            }
            HashMap hashMap2 = new HashMap();
            EnterParams enterParams3 = getViewModel().LJLILLLLZI;
            if (enterParams3 != null && (hashMap = enterParams3.trackParams) != null) {
                hashMap2.putAll(hashMap);
            }
            hashMap2.put("previous_page", "ccdc_card_info");
            hashMap2.put("page_info", "add");
            C27496Aqi.LIZ(fragmentManager, new BillingFragmentEnterParams(ccdcPaymentMethod, enumC27826Aw2, address, paymentInfo, true, str, hashMap2, null, 128, null), getContext(), !C27503Aqp.LIZ().baFullPage);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        initData();
        initViews();
        initSubscribe();
        EventCenter.LJ().LIZJ("ec_district_panel_changed_v2", this);
    }

    @Override // X.InterfaceC60061Nhh
    public void onEvent(String str, String str2) {
        Integer status;
        List<Region> districts;
        AqS143S0200000_12 aqS143S0200000_12;
        if (SC5.LIZIZ(str, "eventName", str2, "params", str, "ec_district_panel_changed_v2")) {
            SelectRegionDTO selectRegionDTO = null;
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str2, C65330PkU.LIZJ(C65352Pkq.LJI(SelectRegionDTO.class)));
                if (!(fromJson instanceof SelectRegionDTO)) {
                    fromJson = null;
                }
                selectRegionDTO = (SelectRegionDTO) fromJson;
            } catch (s unused) {
            }
            if (selectRegionDTO == null || (status = selectRegionDTO.getStatus()) == null || status.intValue() != 2 || (districts = selectRegionDTO.getDistricts()) == null || (aqS143S0200000_12 = getViewModel().LJLLI) == null) {
                return;
            }
            aqS143S0200000_12.invoke(districts);
        }
    }
}
