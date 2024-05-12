package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.AMD;
import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.B0F;
import X.B15;
import X.B16;
import X.B19;
import X.B1A;
import X.B1B;
import X.B1C;
import X.B1K;
import X.B1P;
import X.B20;
import X.B21;
import X.C10A;
import X.C113714dD;
import X.C117104ig;
import X.C141335gf;
import X.C157166Eu;
import X.C165116dv;
import X.C16880lQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26597AcD;
import X.C26706Ady;
import X.C27570Aru;
import X.C27739Aud;
import X.C27985Ayb;
import X.C27993Ayj;
import X.C27994Ayk;
import X.C28096B0y;
import X.C28121B1x;
import X.C28123B1z;
import X.C29S;
import X.C32I;
import X.C3C5;
import X.C45804HyK;
import X.C5H3;
import X.C61878OQg;
import X.C65330PkU;
import X.C65352Pkq;
import X.C65776Prg;
import X.C66822jm;
import X.C73139Sn9;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76542zS;
import X.C76800UCe;
import X.C76917UGr;
import X.C78983UzD;
import X.C79045V0n;
import X.C79057V0z;
import X.C90903hW;
import X.C9KF;
import X.DialogC25756A8y;
import X.EnumC28094B0w;
import X.InterfaceC151715xP;
import X.InterfaceC27825Aw1;
import X.InterfaceC27833Aw9;
import X.InterfaceC61312at;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC71003Rtn;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.InterfaceC92693kP;
import X.KL2;
import X.ORZ;
import X.OUP;
import X.QD3;
import X.SCQ;
import X.TBT;
import X.TBW;
import X.TMF;
import X.TMG;
import X.ViewTreeObserverOnGlobalLayoutListenerC28085B0n;
import X.W1T;
import X.X1D;
import X.Y8Z;
import Y.IDrS44S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentFragmentStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustItem;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.Au2S0S1100000_4;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS167S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.AqS64S0400000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import wg5.c;

/* loaded from: classes5.dex */
public final class PaymentFragment extends ECBaseFragment implements InterfaceC151715xP, AMD<ViewModelProvider.Factory>, InterfaceC27833Aw9, InterfaceC27825Aw1, c {
    public static final B1B Companion = new B1B();
    public final C5H3 adapter$delegate;
    public boolean confirmQuit;
    public PaymentMethod currentCheckedPaymentMethod;
    public final C5H3 dynamicStyle$delegate;
    public String[] errorParamString;
    public String firstType;
    public final C5H3 loadingDialog$delegate;
    public final C5H3 paymentLogger$delegate;
    public String preNodeId;
    public String quitType;
    public InterfaceC88472Yns<? super InterfaceC67352kd<? super C27993Ayj>, ? extends Object> refresh;
    public final lifecycleAwareLazy viewModel$delegate;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public EnterParams enterParams = new EnterParams(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    public InterfaceC88473Ynt<? super PaymentInfo, ? super Boolean, ? super Map<String, ? extends Object>, C76800UCe> onBottomButtonClick = C28096B0y.LJLIL;
    public InterfaceC88472Yns<? super PaymentMethod, C76800UCe> onCheckPaymentMethod = B19.LJLIL;
    public InterfaceC88472Yns<? super B0F, C76800UCe> onRegionPanelStatus = B16.LJLIL;
    public InterfaceC88472Yns<? super PaymentInfo, C76800UCe> onBackConfirm = B15.LJLIL;
    public InterfaceC65784Pro<C76800UCe> onCloseClick = B1C.LJLIL;
    public final C5H3 viewModelFactory$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 203));

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
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

    @Override // X.InterfaceC73141SnB
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC37828Esy
    public String getPageName() {
        return "payment_method";
    }

    @Override // X.InterfaceC73149SnJ
    /* renamed from: getReceiver, reason: avoid collision after fix types in other method */
    public AML getReceiver2() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_ss_android_ugc_aweme_ecommerce_base_osp_payment_PaymentFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public PaymentFragment() {
        AqS186S0100000_4 aqS186S0100000_4 = new AqS186S0100000_4(this, 76);
        C65776Prg LIZ = C65352Pkq.LIZ(PaymentViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 202);
        this.viewModel$delegate = new lifecycleAwareLazy(this, aqS154S0100000_4, new AqS64S0400000_4(this, aqS154S0100000_4, LIZ, aqS186S0100000_4, 7));
        this.adapter$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 196));
        this.paymentLogger$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 201));
        String[] strArr = new String[4];
        int i = 0;
        do {
            strArr[i] = null;
            i++;
        } while (i < 4);
        this.errorParamString = strArr;
        this.loadingDialog$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 200));
        this.dynamicStyle$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 197));
    }

    private final IPaymentFragmentStyle getDynamicStyle() {
        return (IPaymentFragmentStyle) this.dynamicStyle$delegate.getValue();
    }

    private final void getErrorParamString() {
        List<? extends Object> list;
        String[] strArr = this.errorParamString;
        if (getViewModel().LJLLLL != null && (list = getViewModel().LJLLLL) != null) {
            for (Object obj : list) {
                if (obj instanceof C28123B1z) {
                    if (((C28123B1z) obj).LIZJ != null) {
                        strArr[0] = ",card_number";
                    } else {
                        strArr[0] = null;
                    }
                } else if (obj instanceof B20) {
                    if (((B20) obj).LIZJ != null) {
                        strArr[1] = ",date";
                    } else {
                        strArr[1] = null;
                    }
                } else if (obj instanceof B21) {
                    B21 b21 = (B21) obj;
                    if (o.LJ(b21.LIZ.paramName, "cvv")) {
                        if (b21.LIZJ != null) {
                            strArr[2] = ",code";
                        } else {
                            strArr[2] = null;
                        }
                    } else if (o.LJ(b21.LIZ.paramName, "holder_name")) {
                        if (b21.LIZJ != null) {
                            strArr[3] = ",card_holder";
                        } else {
                            strArr[3] = null;
                        }
                    }
                }
            }
        }
    }

    private final String getQuitType() {
        String str = this.quitType;
        this.quitType = null;
        return str;
    }

    private final void initSecurePayment() {
        UserTrustItem userTrustItem;
        PaymentMethodsData paymentMethodsData = this.enterParams.paymentData;
        String str = null;
        if (paymentMethodsData == null || paymentMethodsData.securePayment == null) {
            C78983UzD.LJIILL("secure payment param is empty");
            return;
        }
        TextView secure_payments = (TextView) _$_findCachedViewById(R.id.jju);
        o.LJIIIIZZ(secure_payments, "secure_payments");
        PaymentMethodsData paymentMethodsData2 = this.enterParams.paymentData;
        if (paymentMethodsData2 != null && (userTrustItem = paymentMethodsData2.securePayment) != null) {
            str = userTrustItem.title;
        }
        OUP.LJJLIIIJILLIZJL(secure_payments, str);
        getPaymentLogger().LIZLLL("secure_payments");
        View secure_payments2 = _$_findCachedViewById(R.id.jju);
        o.LJIIIIZZ(secure_payments2, "secure_payments");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 33, 42), secure_payments2);
    }

    public final C26597AcD getAdapter() {
        return (C26597AcD) this.adapter$delegate.getValue();
    }

    public final DialogC25756A8y getLoadingDialog() {
        return (DialogC25756A8y) this.loadingDialog$delegate.getValue();
    }

    public final B1K getPaymentLogger() {
        return (B1K) this.paymentLogger$delegate.getValue();
    }

    public final PaymentViewModel getViewModel() {
        return (PaymentViewModel) this.viewModel$delegate.getValue();
    }

    @Override // X.AMD
    public ViewModelProvider.Factory getViewModelFactory() {
        return (ViewModelProvider.Factory) this.viewModelFactory$delegate.getValue();
    }

    public final boolean isSaveCard() {
        PaymentElement paymentElement;
        String paramValue;
        PaymentMethod paymentMethod = this.currentCheckedPaymentMethod;
        if (paymentMethod == null || (paymentElement = (PaymentElement) ORZ.LJLLLLLL(0, getViewModel().Lv0(paymentMethod, "save_element"))) == null || (paramValue = paymentElement.getParamValue()) == null) {
            return false;
        }
        return Boolean.parseBoolean(paramValue);
    }

    @Override // X.InterfaceC27833Aw9
    public boolean onBackPressed() {
        if (this.confirmQuit) {
            return false;
        }
        PaymentViewModel viewModel = getViewModel();
        viewModel.getClass();
        viewModel.setState(new B1P(viewModel, false));
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC71003Rtn
    public InterfaceC71003Rtn preTrackNode() {
        return TrackNodeStore.LIZLLL(this, this.preNodeId);
    }

    public final void clickBottomButton() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C27570Aru.LIZJ(mo49getActivity);
        }
        PaymentViewModel viewModel = getViewModel();
        viewModel.getClass();
        viewModel.setState(new B1P(viewModel, true));
        getErrorParamString();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        PaymentViewModel viewModel = getViewModel();
        viewModel.getClass();
        EventCenter.LJ().LIZIZ("ec_resend_pay_request", viewModel);
        EventCenter.LJ().LIZIZ("ec_payment_page_refresh_data", viewModel);
        B1K.LJIIL = null;
        B1K.LJIILIIL = null;
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.InterfaceC27825Aw1
    public void onInVisible() {
        if (ActivityStack.isAppBackGround()) {
            this.quitType = "close";
        }
        if (!SCQ.LJIIIIZZ) {
            B1K paymentLogger = getPaymentLogger();
            String quitType = getQuitType();
            if (quitType == null) {
                quitType = "return";
            }
            paymentLogger.LJIILL(quitType, this.currentCheckedPaymentMethod, isSaveCard(), Boolean.valueOf(getViewModel().Kv0().LJ), getViewModel().Kv0().LJFF.toString(), getViewModel().Kv0().LJI);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.enterParams.LIZ) {
            onVisible();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (this.enterParams.LIZ) {
            onInVisible();
        }
    }

    @Override // X.InterfaceC27825Aw1
    public void onVisible() {
        B1K paymentLogger = getPaymentLogger();
        paymentLogger.getClass();
        paymentLogger.LJI = SystemClock.elapsedRealtime();
    }

    public final PaymentMethod getCurrentCheckedPaymentMethod() {
        return this.currentCheckedPaymentMethod;
    }

    public final EnterParams getEnterParams() {
        return this.enterParams;
    }

    public final InterfaceC88472Yns<PaymentInfo, C76800UCe> getOnBackConfirm() {
        return this.onBackConfirm;
    }

    public final InterfaceC88473Ynt<PaymentInfo, Boolean, Map<String, ? extends Object>, C76800UCe> getOnBottomButtonClick() {
        return this.onBottomButtonClick;
    }

    public final InterfaceC88472Yns<PaymentMethod, C76800UCe> getOnCheckPaymentMethod() {
        return this.onCheckPaymentMethod;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnCloseClick() {
        return this.onCloseClick;
    }

    public final InterfaceC88472Yns<B0F, C76800UCe> getOnRegionPanelStatus() {
        return this.onRegionPanelStatus;
    }

    public final String getPreNodeId() {
        return this.preNodeId;
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    public final InterfaceC88472Yns<InterfaceC67352kd<? super C27993Ayj>, Object> getRefresh() {
        return this.refresh;
    }

    private final void initArguments(Bundle bundle) {
        if (o.LJ(this.enterParams, new EnterParams(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 131071, null))) {
            EnterParams enterParams = null;
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), C66822jm.LIZ.getString("PAYMENT_STATE", ""), C65330PkU.LIZJ(C65352Pkq.LJI(EnterParams.class)));
                if (!(fromJson instanceof EnterParams)) {
                    fromJson = null;
                }
                enterParams = (EnterParams) fromJson;
            } catch (s unused) {
            }
            if (enterParams != null) {
                this.enterParams = enterParams;
            }
        }
    }

    private final void initSubscribe(Activity activity) {
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.B10
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PaymentState) obj).getCheckedPaymentMethod();
            }
        }, new AqS167S0200000_4(this, activity, 9));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.B12
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PaymentState) obj).getPaymentList();
            }
        }, new AqS186S0100000_4(this, 77));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.B13
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PaymentState) obj).getSystemError();
            }
        }, new AqS186S0100000_4(this, 78));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AoO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((PaymentState) obj).getEmailHintVisible());
            }
        }, new AqS186S0100000_4(this, 79));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.B11
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PaymentState) obj).getPaymentInfoForNextStep();
            }
        }, new AqS186S0100000_4(this, 69));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.B0h
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PaymentState) obj).getResendPayAction();
            }
        }, new AqS186S0100000_4(this, 70));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.B0g
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PaymentState) obj).getPaymentInfoForThreeStepCache();
            }
        }, new AqS186S0100000_4(this, 71));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.B0z
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PaymentState) obj).getToast();
            }
        }, new AqS186S0100000_4(this, 72));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AoP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((PaymentState) obj).getShowLoading());
            }
        }, new AqS186S0100000_4(this, 73));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.B0i
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PaymentState) obj).getScrollUpAction();
            }
        }, new AqS186S0100000_4(this, 74));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Axd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PaymentState) obj).getEditBillingAddress();
            }
        }, new AqS186S0100000_4(this, 75));
    }

    private final void initUI(Activity activity) {
        int i;
        int i2;
        String str;
        String str2;
        Integer LJI;
        _$_findCachedViewById(R.id.isf).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC28085B0n(System.currentTimeMillis(), this));
        ((RecyclerView) _$_findCachedViewById(R.id.isf)).setAdapter(getAdapter());
        ((RecyclerView) _$_findCachedViewById(R.id.isf)).setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) _$_findCachedViewById(R.id.isf)).LJII(new C117104ig(AnonymousClass636.LJIIIIZZ(R.attr.dz, activity)), -1);
        ((RecyclerView) _$_findCachedViewById(R.id.ct6)).LJII(new C165116dv((int) KL2.LIZJ(mo49getActivity(), 12.0f), (int) KL2.LIZJ(mo49getActivity(), 16.0f)), -1);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.fey);
        o.LJIIIIZZ(string, "getString(R.string.ecom_…sum_payment_method_title)");
        IPaymentFragmentStyle dynamicStyle = getDynamicStyle();
        if (dynamicStyle != null) {
            string = getString(dynamicStyle.getPageTitle());
            o.LJIIIIZZ(string, "getString(it.pageTitle)");
        }
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = string;
        C28121B1x.LIZ.getClass();
        if (C28121B1x.LIZ()) {
            C252709vu titleBar = (C252709vu) _$_findCachedViewById(R.id.l9j);
            o.LJIIIIZZ(titleBar, "titleBar");
            String string2 = getResources().getString(R.string.f8z);
            o.LJIIIIZZ(string2, "resources.getString(R.st…eckout_payment_guarantee)");
            c9kf.LIZLLL = C76917UGr.LJIJI(titleBar, string2);
        }
        c235119Kp.LIZJ = c9kf;
        boolean z = true;
        c235119Kp.LIZLLL = true;
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.cr, context)) != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        c235119Kp.LIZJ(i);
        if (this.enterParams.LIZ) {
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark;
            LIZJ.LIZIZ(new AqS154S0100000_4(this, 198));
            c235119Kp.LIZIZ(LIZJ);
        } else {
            C234529Ii LIZJ2 = s1.LIZJ();
            LIZJ2.LIZJ = R.raw.icon_arrow_left_ltr;
            LIZJ2.LIZIZ(new AqS154S0100000_4(this, 199));
            c235119Kp.LIZLLL(LIZJ2);
        }
        ((C252709vu) _$_findCachedViewById(R.id.l9j)).setNavActions(c235119Kp);
        EnterParams enterParams = this.enterParams;
        Integer num = enterParams.currentProgress;
        Integer num2 = enterParams.totalProgress;
        if (num != null && num2 != null) {
            ((C113714dD) _$_findCachedViewById(R.id.kg9)).setTotalStep(num2.intValue());
            ((C113714dD) _$_findCachedViewById(R.id.kg9)).setLightStep(num.intValue());
            _$_findCachedViewById(R.id.kg9).setVisibility(0);
        }
        Integer num3 = this.enterParams.buttonType;
        EnumC28094B0w enumC28094B0w = EnumC28094B0w.NEXT;
        int ordinal = enumC28094B0w.ordinal();
        if (num3 == null || num3.intValue() != ordinal) {
            int ordinal2 = EnumC28094B0w.CONTINUE.ordinal();
            if (num3 == null || num3.intValue() != ordinal2) {
                int ordinal3 = EnumC28094B0w.SAVE.ordinal();
                if (num3 == null || num3.intValue() != ordinal3) {
                    i2 = R.string.fet;
                } else {
                    i2 = R.string.f37;
                }
            } else {
                i2 = R.string.fer;
            }
        } else {
            i2 = R.string.fes;
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.aog);
        Context context2 = getContext();
        String str3 = null;
        if (context2 != null) {
            str = context2.getString(i2);
        } else {
            str = null;
        }
        textView.setText(str);
        _$_findCachedViewById(R.id.aog).getClass();
        Integer num4 = this.enterParams.buttonType;
        int ordinal4 = enumC28094B0w.ordinal();
        if (num4 == null || num4.intValue() != ordinal4) {
            int ordinal5 = EnumC28094B0w.PAY_NOW.ordinal();
            if (num4 == null || num4.intValue() != ordinal5) {
                int ordinal6 = EnumC28094B0w.CONTINUE.ordinal();
                if (num4 == null || num4.intValue() != ordinal6) {
                    int ordinal7 = EnumC28094B0w.SAVE.ordinal();
                    if (num4 == null || num4.intValue() != ordinal7) {
                        str2 = "";
                    } else {
                        str2 = "save";
                    }
                } else {
                    str2 = "continue";
                }
            } else {
                str2 = "pay_now";
            }
        } else {
            str2 = "next";
        }
        getPaymentLogger().LJIIL(str2);
        String str4 = this.enterParams.price;
        if (str4 != null && str4.length() != 0) {
            z = false;
        }
        if (z) {
            _$_findCachedViewById(R.id.cd4).setVisibility(8);
            _$_findCachedViewById(R.id.lis).setVisibility(8);
            _$_findCachedViewById(R.id.lik).setVisibility(8);
        } else {
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.lis);
            StringBuilder LIZ = X1D.LIZ();
            Context context3 = getContext();
            if (context3 != null) {
                str3 = context3.getString(R.string.r_m);
            }
            LIZ.append(str3);
            LIZ.append(':');
            textView2.setText(X1D.LIZIZ(LIZ));
            withState(getViewModel(), new AqS170S0100000_4(this, 271));
        }
        IPaymentFragmentStyle dynamicStyle2 = getDynamicStyle();
        if (dynamicStyle2 != null) {
            if (dynamicStyle2.getBottomDividerLineShow()) {
                C45804HyK.LJJLL(_$_findCachedViewById(R.id.cd4));
            }
            if (dynamicStyle2.getShowSecurePayment()) {
                initSecurePayment();
            }
        }
        PaymentViewModel viewModel = getViewModel();
        AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 272);
        viewModel.getClass();
        viewModel.LJLJJLL = aqS170S0100000_4;
        getViewModel().LJLJL = this.enterParams.shippingAddress;
        View bottomButton = _$_findCachedViewById(R.id.aog);
        o.LJIIIIZZ(bottomButton, "bottomButton");
        C16880lQ.LJIIJ(new Au2S0S1100000_4(this, str2, 1), bottomButton);
        ((RecyclerView) _$_findCachedViewById(R.id.isf)).LJIIJJI(new IDrS44S0100000_4(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188  */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityCreated(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment.onActivityCreated(android.os.Bundle):void");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAddCCDCCard(C27985Ayb event) {
        PaymentInfo paymentInfo;
        o.LJIIIZ(event, "event");
        String str = event.LJLILLLLZI;
        if ((o.LJ(str, "ADD_NEW_CARD") || o.LJ(str, "EDIT_CARD")) && (paymentInfo = event.LJLIL) != null) {
            PaymentViewModel viewModel = getViewModel();
            String str2 = event.LJLJI;
            if (str2 == null) {
                str2 = "";
            }
            viewModel.getClass();
            viewModel.withState(new AqS47S1200000_4(paymentInfo, viewModel, str2, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        initArguments(bundle);
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC27438Apm
    public boolean onDetectBlank(Map<String, String> params) {
        o.LJIIIZ(params, "params");
        PaymentViewModel viewModel = getViewModel();
        viewModel.getClass();
        PaymentState lv0 = viewModel.lv0();
        params.put("content_list_size", String.valueOf(lv0.getPaymentList().size()));
        if (lv0.getPaymentList().isEmpty()) {
            params.put("blank_type", "empty_data_list");
            return true;
        }
        if (this.enterParams.paymentData == null) {
            params.put("blank_type", "no_meta_data");
            return true;
        }
        if (((ViewGroup) _$_findCachedViewById(R.id.isf)).getChildCount() > 0 && _$_findCachedViewById(R.id.isf).getHeight() > 0) {
            return false;
        }
        params.put("blank_type", "empty_view");
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        C79057V0z.LJJJJJ(C66822jm.LIZ, "PAYMENT_STATE", C27739Aud.LJI(this.enterParams));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSubPaymentSelectedEvent$ecommerce_transaction_release(C27994Ayk event) {
        o.LJIIIZ(event, "event");
        withState(getViewModel(), new AqS135S0200000_4(this, event.LJLIL, 37));
        clickBottomButton();
    }

    public final void setCurrentCheckedPaymentMethod(PaymentMethod paymentMethod) {
        this.currentCheckedPaymentMethod = paymentMethod;
    }

    public final void setEnterParams(EnterParams enterParams) {
        o.LJIIIZ(enterParams, "<set-?>");
        this.enterParams = enterParams;
    }

    public final void setOnBackConfirm(InterfaceC88472Yns<? super PaymentInfo, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.onBackConfirm = interfaceC88472Yns;
    }

    public final void setOnBottomButtonClick(InterfaceC88473Ynt<? super PaymentInfo, ? super Boolean, ? super Map<String, ? extends Object>, C76800UCe> interfaceC88473Ynt) {
        o.LJIIIZ(interfaceC88473Ynt, "<set-?>");
        this.onBottomButtonClick = interfaceC88473Ynt;
    }

    public final void setOnCheckPaymentMethod(InterfaceC88472Yns<? super PaymentMethod, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.onCheckPaymentMethod = interfaceC88472Yns;
    }

    public final void setOnCloseClick(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.onCloseClick = interfaceC65784Pro;
    }

    public final void setOnRegionPanelStatus(InterfaceC88472Yns<? super B0F, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.onRegionPanelStatus = interfaceC88472Yns;
    }

    public final void setPreNodeId(String str) {
        this.preNodeId = str;
    }

    public final void setRefresh(InterfaceC88472Yns<? super InterfaceC67352kd<? super C27993Ayj>, ? extends Object> interfaceC88472Yns) {
        this.refresh = interfaceC88472Yns;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.enterParams.LIZ) {
            new Y8Z(this);
        }
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIILLIIL(c73139Sn9, interfaceC88472Yns);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.OQg] */
    public View com_ss_android_ugc_aweme_ecommerce_base_osp_payment_PaymentFragment__onCreateView$___twin___(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList arrayList;
        List<PaymentMethod> list;
        o.LJIIIZ(inflater, "inflater");
        B1K paymentLogger = getPaymentLogger();
        EnterParams enterParams = this.enterParams;
        paymentLogger.getClass();
        o.LJIIIZ(enterParams, "enterParams");
        if (!paymentLogger.LJIIIIZZ) {
            PaymentMethodsData paymentMethodsData = enterParams.paymentData;
            String str = null;
            if (paymentMethodsData != null && (list = paymentMethodsData.paymentMethods) != null) {
                arrayList = new ArrayList();
                for (PaymentMethod paymentMethod : list) {
                    PaymentMethod paymentMethod2 = paymentMethod;
                    if (!(paymentMethod2 instanceof PaymentMethod) || paymentMethod2 == null || paymentMethod2.LIZ()) {
                        arrayList.add(paymentMethod);
                    }
                }
            } else {
                arrayList = null;
            }
            PaymentMethodsData paymentMethodsData2 = enterParams.paymentData;
            if (paymentMethodsData2 != null) {
                ArrayList arrayList2 = new ArrayList();
                Collection collection = paymentMethodsData2.storedMethods;
                if (collection == null) {
                    collection = C61878OQg.INSTANCE;
                }
                arrayList2.addAll(collection);
                ArrayList arrayList3 = arrayList;
                if (arrayList == null) {
                    arrayList3 = C61878OQg.INSTANCE;
                }
                arrayList2.addAll(arrayList3);
                ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((PaymentMethod) it.next()).LJIIL());
                }
                str = ORZ.LLD(arrayList4, ",", null, null, B1A.LJLIL, 30);
            }
            C76542zS.LIZIZ("tiktokec_enter_page", paymentLogger.LIZ, new AqS29S1000000_4(str, 1));
            paymentLogger.LJIIIIZZ = true;
        }
        return C16880lQ.LLLLIILL(inflater, R.layout.a1n, viewGroup, false);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C73157SnR.LJIIJ(vm1, vm2, interfaceC88471Ynr);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, InterfaceC88471Ynr<? super PROP1, ? super PROP2, ? extends R> interfaceC88471Ynr) {
        return (R) C73157SnR.LJIILL(c73139Sn9, c73139Sn92, interfaceC88471Ynr);
    }

    public static View com_ss_android_ugc_aweme_ecommerce_base_osp_payment_PaymentFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(PaymentFragment paymentFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View com_ss_android_ugc_aweme_ecommerce_base_osp_payment_PaymentFragment__onCreateView$___twin___ = paymentFragment.com_ss_android_ugc_aweme_ecommerce_base_osp_payment_PaymentFragment__onCreateView$___twin___(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(com_ss_android_ugc_aweme_ecommerce_base_osp_payment_PaymentFragment__onCreateView$___twin___ instanceof View)) {
            com_ss_android_ugc_aweme_ecommerce_base_osp_payment_PaymentFragment__onCreateView$___twin___ = null;
        }
        if (com_ss_android_ugc_aweme_ecommerce_base_osp_payment_PaymentFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(com_ss_android_ugc_aweme_ecommerce_base_osp_payment_PaymentFragment__onCreateView$___twin___, paymentFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(com_ss_android_ugc_aweme_ecommerce_base_osp_payment_PaymentFragment__onCreateView$___twin___, paymentFragment);
                C10A.LIZIZ(com_ss_android_ugc_aweme_ecommerce_base_osp_payment_PaymentFragment__onCreateView$___twin___, paymentFragment);
                ActivityC45651qj mo49getActivity = paymentFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return com_ss_android_ugc_aweme_ecommerce_base_osp_payment_PaymentFragment__onCreateView$___twin___;
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C73157SnR.LJIIIZ(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, InterfaceC88473Ynt<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC88473Ynt) {
        return (R) C73157SnR.LJIILJJIL(c73139Sn9, c73139Sn92, c73139Sn93, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC88474Ynu<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC88474Ynu) {
        return (R) C73157SnR.LJIIIIZZ(vm1, vm2, vm3, vm4, interfaceC88474Ynu);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, InterfaceC88474Ynu<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC88474Ynu) {
        return (R) C73157SnR.LJIILIIL(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, VM5 extends JediViewModel<S5>, S5 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC88475Ynv<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC88475Ynv) {
        return (R) C73157SnR.LJII(vm1, vm2, vm3, vm4, vm5, interfaceC88475Ynv);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, M5 extends C73139Sn9<S5, PROP5>, PROP5 extends InterfaceC61312at, S5 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, C73139Sn9<S5, PROP5> c73139Sn95, InterfaceC88475Ynv<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC88475Ynv) {
        return (R) C73157SnR.LJIIL(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, c73139Sn95, interfaceC88475Ynv);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }

    public <S extends InterfaceC61312at, A, B, C, D, E> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C73165SnZ<TMF> c73165SnZ, InterfaceC88476Ynw<? super AML, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C73157SnR.LJFF(this, jediViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c73165SnZ, interfaceC88476Ynw);
    }
}
