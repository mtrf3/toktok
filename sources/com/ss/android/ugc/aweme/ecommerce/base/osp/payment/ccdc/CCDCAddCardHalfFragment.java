package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc;

import X.ASL;
import X.ActivityC45651qj;
import X.B2L;
import X.B2P;
import X.B2W;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C244659iv;
import X.C252709vu;
import X.C26045AKb;
import X.C26227ARb;
import X.C26706Ady;
import X.C27162AlK;
import X.C28112B1o;
import X.C28121B1x;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C5H3;
import X.C76542zS;
import X.C76800UCe;
import X.C76917UGr;
import X.C78983UzD;
import X.C79045V0n;
import X.C7MY;
import X.C8VV;
import X.C90903hW;
import X.C9KF;
import X.EO3;
import X.EnumC28021AzB;
import X.InterfaceC60061Nhh;
import X.InterfaceC65784Pro;
import X.O6R;
import X.OUP;
import X.SC5;
import X.SY9;
import X.UC0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.addcard.IAddCardStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.core.ab.GuaranteeConfig;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustItem;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class CCDCAddCardHalfFragment extends CommerceBottomSheetDialogFragment implements c, InterfaceC60061Nhh {
    public static final B2W Companion = new B2W();
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public PaymentMethod ccdcPaymentMethod;
    public InterfaceC65784Pro<C76800UCe> dismissParent;
    public final C5H3 dynamicStyle$delegate;
    public EnterParams enterParams;
    public String openType;
    public EnumC28021AzB pageType;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public boolean enableDragClose() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_ss_android_ugc_aweme_ecommerce_base_osp_payment_ccdc_CCDCAddCardHalfFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    public CCDCAddCardHalfFragment() {
        super(false, 1, null);
        this.dynamicStyle$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 218));
    }

    private final IAddCardStyle getDynamicStyle() {
        return (IAddCardStyle) this.dynamicStyle$delegate.getValue();
    }

    private final void initViews() {
        int i;
        int i2;
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL = true;
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZLLL = true;
        c234529Ii.LIZIZ(new AqS154S0100000_4(this, 219));
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_x_mark_small;
        c235119Kp.LIZIZ(c234529Ii);
        C28112B1o.LJ("close", null);
        String str = this.openType;
        if (o.LJ(str, "EDIT_CARD")) {
            i = R.string.f8d;
        } else if (o.LJ(str, "ADD_NEW_CARD")) {
            i = R.string.f8c;
        } else {
            i = R.string.f4m;
        }
        if (this.pageType == EnumC28021AzB.ADD_ATM) {
            i = R.string.fbh;
        }
        C9KF c9kf = new C9KF();
        String string = getResources().getString(i);
        o.LJIIIIZZ(string, "resources.getString(titleId)");
        c9kf.LIZJ = string;
        C28121B1x.LIZ.getClass();
        if (C28121B1x.LIZ()) {
            C252709vu navBar = (C252709vu) _$_findCachedViewById(R.id.gwf);
            o.LJIIIIZZ(navBar, "navBar");
            String string2 = getResources().getString(R.string.f8v);
            o.LJIIIIZZ(string2, "resources.getString(R.st…_checkout_data_guarantee)");
            c9kf.LIZLLL = C76917UGr.LJIJI(navBar, string2);
        }
        c235119Kp.LIZJ = c9kf;
        ((C252709vu) _$_findCachedViewById(R.id.gwf)).setNavActions(c235119Kp);
        String str2 = this.openType;
        String str3 = "save";
        if (o.LJ(str2, "EDIT_CARD")) {
            IAddCardStyle dynamicStyle = getDynamicStyle();
            if (dynamicStyle == null || Integer.valueOf(dynamicStyle.getBtnTextIdForAddCard()) == null) {
                str3 = "confirm";
            }
            IAddCardStyle dynamicStyle2 = getDynamicStyle();
            if (dynamicStyle2 != null) {
                i2 = dynamicStyle2.getBtnTextIdForAddCard();
            } else {
                i2 = R.string.f4y;
            }
        } else if (o.LJ(str2, "ADD_NEW_CARD")) {
            IAddCardStyle dynamicStyle3 = getDynamicStyle();
            if (dynamicStyle3 == null || Integer.valueOf(dynamicStyle3.getBtnTextIdForAddCard()) == null) {
                str3 = "add_and_continue";
            }
            IAddCardStyle dynamicStyle4 = getDynamicStyle();
            if (dynamicStyle4 != null) {
                i2 = dynamicStyle4.getBtnTextIdForAddCard();
            } else {
                i2 = R.string.f8b;
            }
        } else {
            str3 = "add";
            i2 = R.string.i1;
        }
        ((TextView) _$_findCachedViewById(R.id.at8)).setText(getResources().getString(i2));
        _$_findCachedViewById(R.id.at8).getClass();
        C28112B1o.LJ(str3, null);
        initSecurePayment();
        if (this.pageType == EnumC28021AzB.ADD_CCDC) {
            C8VV.LIZ(this, false, new AqS58S1100000_4(this, str3, 8));
        } else {
            C8VV.LIZ(this, false, new AqS58S1100000_4(this, str3, 9));
        }
        if (!enableDragClose()) {
            ((RecyclerView) _$_findCachedViewById(R.id.hqp)).setNestedScrollingEnabled(false);
        }
    }

    public final void dismissAll() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.dismissParent;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        dismissAllowingStateLoss();
    }

    public final void showKeepDialog() {
        C28121B1x.LIZ.getClass();
        if (!((GuaranteeConfig) C28121B1x.LIZJ.getValue()).ccdcPopup) {
            dismissAllowingStateLoss();
            return;
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        SY9 sy9 = new SY9(context, R.raw.icon_shield_tick);
        Integer LJI = C79045V0n.LJI(R.attr.e9, context);
        if (LJI != null) {
            sy9.LJ(LJI.intValue());
        }
        sy9.setBounds(0, 0, C7MY.LIZIZ(36), O6R.LJJIIZ(C32151Nz.LJIIZILJ(43)));
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJIIIZ = new C244659iv(0, context, sy9);
        c26227ARb.LJ(R.string.f5o);
        c26227ARb.LIZ(R.string.f5m);
        UC0.LIZJ(c26227ARb, new AqS170S0100000_4(this, 278));
        c26227ARb.LIZJ(B2L.LJLIL);
        c26227ARb.LJII = false;
        c26227ARb.LJI().LIZLLL();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C28112B1o.LIZIZ);
        linkedHashMap.put("popup_for", "quit_editing");
        linkedHashMap.put("popup_name", "quit_editing_ccdc");
        C76542zS.LIZ("tiktokec_popup_show", linkedHashMap);
    }

    private final void initSecurePayment() {
        PaymentMethodsData paymentMethodsData;
        String str;
        PaymentMethodsData paymentMethodsData2;
        UserTrustItem userTrustItem;
        IAddCardStyle dynamicStyle = getDynamicStyle();
        if (dynamicStyle != null && dynamicStyle.getShowSecurePayment()) {
            EnterParams enterParams = this.enterParams;
            if (enterParams == null || (paymentMethodsData = enterParams.paymentData) == null || paymentMethodsData.securePayment == null) {
                C78983UzD.LJIILL("secure payment param is empty");
                return;
            }
            TextView secure_payments = (TextView) _$_findCachedViewById(R.id.jju);
            o.LJIIIIZZ(secure_payments, "secure_payments");
            EnterParams enterParams2 = this.enterParams;
            if (enterParams2 != null && (paymentMethodsData2 = enterParams2.paymentData) != null && (userTrustItem = paymentMethodsData2.securePayment) != null) {
                str = userTrustItem.title;
            } else {
                str = null;
            }
            OUP.LJJLIIIJILLIZJL(secure_payments, str);
            C28112B1o.LJ("secure_payments", null);
            View secure_payments2 = _$_findCachedViewById(R.id.jju);
            o.LJIIIIZZ(secure_payments2, "secure_payments");
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 34, 42), secure_payments2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public Integer getDialogHeight() {
        IAddCardStyle dynamicStyle = getDynamicStyle();
        if (dynamicStyle != null) {
            return Integer.valueOf((int) (dynamicStyle.getCcdcScreenRatio() * C27162AlK.LIZIZ));
        }
        return super.getDialogHeight();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C28112B1o.LIZIZ.clear();
        ((LinkedHashMap) C28112B1o.LIZJ).clear();
        EO3.LIZIZ(this);
        EventCenter.LJ().LIZIZ("EC_CLOSE_PREVIOUS_PAGE", this);
        _$_clearFindViewByIdCache();
    }

    public final PaymentMethod getCcdcPaymentMethod() {
        return this.ccdcPaymentMethod;
    }

    public final InterfaceC65784Pro<C76800UCe> getDismissParent() {
        return this.dismissParent;
    }

    public final EnterParams getEnterParams() {
        return this.enterParams;
    }

    public final String getOpenType() {
        return this.openType;
    }

    public final EnumC28021AzB getPageType() {
        return this.pageType;
    }

    public final void setCcdcPaymentMethod(PaymentMethod paymentMethod) {
        this.ccdcPaymentMethod = paymentMethod;
    }

    public final void setDismissParent(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.dismissParent = interfaceC65784Pro;
    }

    public final void setEnterParams(EnterParams enterParams) {
        this.enterParams = enterParams;
    }

    public final void setOpenType(String str) {
        this.openType = str;
    }

    public final void setPageType(EnumC28021AzB enumC28021AzB) {
        this.pageType = enumC28021AzB;
    }

    public final void toast(String msg) {
        o.LJIIIZ(msg, "msg");
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIZ(msg);
        c26045AKb.LJIIJ();
    }

    public final void toast(int i) {
        String string = getString(i);
        o.LJIIIIZZ(string, "getString(id)");
        toast(string);
    }

    @Override // X.InterfaceC60061Nhh
    public void onEvent(String str, String str2) {
        if (SC5.LIZIZ(str, "eventName", str2, "params", str, "EC_CLOSE_PREVIOUS_PAGE")) {
            dismissAll();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        HashMap<String, Object> hashMap;
        int i;
        String str2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        EnterParams enterParams = this.enterParams;
        String str3 = this.openType;
        if (this.pageType != EnumC28021AzB.ADD_ATM) {
            str = "ccdc_card_info";
        } else {
            str = "atm_card_info";
        }
        if (enterParams != null) {
            hashMap = enterParams.trackParams;
        } else {
            hashMap = null;
        }
        C28112B1o.LJFF = null;
        C28112B1o.LIZ = "";
        if (enterParams == null || enterParams.shippingAddress == null) {
            i = 0;
        } else {
            i = 1;
        }
        C28112B1o.LIZLLL = Integer.valueOf(i);
        if (o.LJ(str3, "EDIT_CARD")) {
            str2 = "edit";
        } else if (o.LJ(str3, "ADD_NEW_CARD")) {
            str2 = "add";
        } else {
            str2 = "pay";
        }
        C28112B1o.LJ = str2;
        LinkedHashMap<String, Object> linkedHashMap = C28112B1o.LIZIZ;
        if (hashMap != null) {
            linkedHashMap.putAll(hashMap);
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", str);
        Integer num = C28112B1o.LIZLLL;
        if (num != null) {
            linkedHashMap.put("is_with_delivery_info", Integer.valueOf(num.intValue()));
        }
        String str4 = C28112B1o.LJ;
        if (str4 != null) {
            linkedHashMap.put("fill_type", str4);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(linkedHashMap);
        C76542zS.LIZ("tiktokec_enter_page", linkedHashMap2);
        C28112B1o.LJIILJJIL("stay_duration");
        initViews();
        EO3.LIZJ(this, "ccdc_card_info");
        EventCenter.LJ().LIZJ("EC_CLOSE_PREVIOUS_PAGE", this);
    }

    public final void showLearMoreDialog(String title, String content) {
        Object LIZ;
        Context context;
        o.LJIIIZ(title, "title");
        o.LJIIIZ(content, "content");
        try {
            LIZ = getChildFragmentManager();
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        FragmentManager fragmentManager = (FragmentManager) LIZ;
        if (fragmentManager != null && (context = getContext()) != null) {
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setText(content);
            tuxTextView.setTuxFont(51);
            tuxTextView.setTextColorRes(R.attr.go);
            tuxTextView.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(23)), C7MY.LIZIZ(23), C7MY.LIZIZ(23), O6R.LJJIIZ(C32151Nz.LJIIZILJ(35)));
            ASL asl = new ASL();
            asl.LJI(4);
            C235119Kp c235119Kp = new C235119Kp();
            c235119Kp.LIZLLL = true;
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = title;
            c235119Kp.LIZJ = c9kf;
            C234529Ii c234529Ii = new C234529Ii();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_x_mark_fill_small;
            c2068389v.LJ = Integer.valueOf(R.attr.go);
            c2068389v.LIZIZ = C7MY.LIZIZ(24);
            c2068389v.LIZJ = C7MY.LIZIZ(24);
            c234529Ii.LIZ(c2068389v);
            c234529Ii.LIZIZ(new AqS154S0100000_4(tuxTextView, 220));
            c235119Kp.LIZIZ(c234529Ii);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLL = c235119Kp;
            tuxSheet.LJLLI = tuxTextView;
            tuxSheet.LJLILLLLZI = B2P.LJLIL;
            tuxSheet.show(fragmentManager, title);
        }
    }

    public View com_ss_android_ugc_aweme_ecommerce_base_osp_payment_ccdc_CCDCAddCardHalfFragment__onCreateView$___twin___(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        return C16880lQ.LLLLIILL(inflater, R.layout.a0u, viewGroup, false);
    }

    public static View com_ss_android_ugc_aweme_ecommerce_base_osp_payment_ccdc_CCDCAddCardHalfFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(CCDCAddCardHalfFragment cCDCAddCardHalfFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View com_ss_android_ugc_aweme_ecommerce_base_osp_payment_ccdc_CCDCAddCardHalfFragment__onCreateView$___twin___ = cCDCAddCardHalfFragment.com_ss_android_ugc_aweme_ecommerce_base_osp_payment_ccdc_CCDCAddCardHalfFragment__onCreateView$___twin___(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(com_ss_android_ugc_aweme_ecommerce_base_osp_payment_ccdc_CCDCAddCardHalfFragment__onCreateView$___twin___ instanceof View)) {
            com_ss_android_ugc_aweme_ecommerce_base_osp_payment_ccdc_CCDCAddCardHalfFragment__onCreateView$___twin___ = null;
        }
        if (com_ss_android_ugc_aweme_ecommerce_base_osp_payment_ccdc_CCDCAddCardHalfFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(com_ss_android_ugc_aweme_ecommerce_base_osp_payment_ccdc_CCDCAddCardHalfFragment__onCreateView$___twin___, cCDCAddCardHalfFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(com_ss_android_ugc_aweme_ecommerce_base_osp_payment_ccdc_CCDCAddCardHalfFragment__onCreateView$___twin___, cCDCAddCardHalfFragment);
                C10A.LIZIZ(com_ss_android_ugc_aweme_ecommerce_base_osp_payment_ccdc_CCDCAddCardHalfFragment__onCreateView$___twin___, cCDCAddCardHalfFragment);
                ActivityC45651qj mo49getActivity = cCDCAddCardHalfFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return com_ss_android_ugc_aweme_ecommerce_base_osp_payment_ccdc_CCDCAddCardHalfFragment__onCreateView$___twin___;
    }
}
