package com.ss.android.ugc.aweme.ecommerce.base.address.list;

import X.AMD;
import X.AML;
import X.ARI;
import X.ASQ;
import X.ASX;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.C0A2;
import X.C10A;
import X.C141335gf;
import X.C157166Eu;
import X.C16880lQ;
import X.C1A7;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26227ARb;
import X.C26706Ady;
import X.C26755Ael;
import X.C26880Agm;
import X.C26881Agn;
import X.C26882Ago;
import X.C27090AkA;
import X.C27532ArI;
import X.C27739Aud;
import X.C29S;
import X.C3AW;
import X.C3C5;
import X.C45804HyK;
import X.C5H3;
import X.C65330PkU;
import X.C65352Pkq;
import X.C65776Prg;
import X.C68322mC;
import X.C70858RrS;
import X.C70921RsT;
import X.C73139Sn9;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C78857UxB;
import X.C78915Uy7;
import X.C78946Uyc;
import X.C79045V0n;
import X.C84654XKg;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC151715xP;
import X.InterfaceC26883Agp;
import X.InterfaceC27833Aw9;
import X.InterfaceC60061Nhh;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.InterfaceC92693kP;
import X.TBT;
import X.TBW;
import X.TMF;
import X.TMG;
import X.W1T;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.NoticeDialogMessage;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.style.IAddressListHalfScreenStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.UsAddressListViewModel;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS64S0400000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class AddressListPanelFragment extends ECBaseFragment implements InterfaceC151715xP, AMD<ViewModelProvider.Factory>, InterfaceC27833Aw9, InterfaceC60061Nhh, c {
    public static final C26880Agm Companion = new C26880Agm();
    public int availableAddressCount;
    public final C5H3 engine$delegate;
    public long resumeTime;
    public long retryStartTime;
    public int totalAddressCount;
    public final lifecycleAwareLazy viewModel$delegate;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C5H3 adapter$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 133));
    public int isFirstLoad = 1;
    public boolean loadSuccess = true;
    public String failReason = "other reason";
    public boolean isFirstReport = true;
    public final C5H3 style$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 131));
    public final C5H3 viewModelFactory$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 132));

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
        return "shipping_info";
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

    @Override // X.InterfaceC27833Aw9
    public boolean onBackPressed() {
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_ss_android_ugc_aweme_ecommerce_base_address_list_AddressListPanelFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    public final String stateToReason(int i) {
        return i != 2 ? i != 3 ? i != 4 ? "other reason" : "no address info" : "something went wrong" : "network error";
    }

    public AddressListPanelFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(AddressListViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 138);
        this.viewModel$delegate = new lifecycleAwareLazy(this, aqS154S0100000_4, new AqS64S0400000_4(this, aqS154S0100000_4, LIZ, C26881Agn.INSTANCE, 3));
        this.engine$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 134));
        this.resumeTime = -1L;
    }

    private final IAddressListHalfScreenStyle getStyle() {
        return (IAddressListHalfScreenStyle) this.style$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void logStayPage() {
        T t;
        C68322mC c68322mC = new C68322mC();
        if (ActivityStack.isAppBackGround()) {
            t = "close";
        } else {
            t = "return";
        }
        c68322mC.element = t;
        if (getViewModel().LJLLLL) {
            c68322mC.element = "next";
        }
        C78946Uyc.LJJII(this, new C70921RsT(), new AqS135S0200000_4(this, (AddressListPanelFragment) c68322mC, (C68322mC<String>) 18));
    }

    public final AddressAdapter getAdapter() {
        return (AddressAdapter) this.adapter$delegate.getValue();
    }

    public final InterfaceC26883Agp<AddressListViewModel> getEngine() {
        return (InterfaceC26883Agp) this.engine$delegate.getValue();
    }

    public final AddressListViewModel getViewModel() {
        return (AddressListViewModel) this.viewModel$delegate.getValue();
    }

    @Override // X.AMD
    public ViewModelProvider.Factory getViewModelFactory() {
        return (ViewModelProvider.Factory) this.viewModelFactory$delegate.getValue();
    }

    private final void initSubscribe() {
        EventCenter.LJ().LIZJ("ec_address_select", this);
        EventCenter.LJ().LIZJ("ec_address_change", this);
        EventCenter.LJ().LIZJ("ec_show_notice_dialog", this);
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Agf
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((AddressListState) obj).getStatus());
            }
        }, new AqS186S0100000_4(this, 16));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Agq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AddressListState) obj).getAddressState();
            }
        }, new AqS186S0100000_4(this, 17));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Agw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AddressListState) obj).getAddressItems();
            }
        }, new AqS186S0100000_4(this, 18));
        if (getViewModel().Nv0()) {
            C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Agy
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((AddressListState) obj).getSelectAddressId();
                }
            }, new AqS186S0100000_4(this, 19));
            C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Agr
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((AddressListState) obj).getPolicyItemVO();
                }
            }, new AqS186S0100000_4(this, 15));
        }
    }

    private final void initUI() {
        Window window;
        int navTitleRes;
        Integer LJI;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            window = mo49getActivity.getWindow();
        } else {
            window = null;
        }
        C1A7.LJJIJL(window);
        ((RecyclerView) _$_findCachedViewById(R.id.isf)).setAdapter(getAdapter());
        Integer num = getViewModel().LJZ;
        if (num != null) {
            if (num.intValue() == 4) {
                navTitleRes = R.string.f6m;
            } else {
                navTitleRes = getStyle().getNavTitleRes();
            }
        } else {
            navTitleRes = getStyle().getNavTitleRes();
        }
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.l9j);
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(navTitleRes);
        o.LJIIIIZZ(string, "getString(navTitleRes)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 135));
        int i = 0;
        c235119Kp.LIZIZ(LIZJ);
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.cr, context)) != null) {
            i = LJI.intValue();
        }
        c235119Kp.LIZJ(i);
        c235119Kp.LIZLLL = true;
        c252709vu.setNavActions(c235119Kp);
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        String str;
        super.onDestroy();
        getEngine().onDestroy();
        Address address = getViewModel().LL;
        if (address == null || (str = address.addressId) == null) {
            str = "";
        }
        AddressPageStarter.AddressEvent addressEvent = new AddressPageStarter.AddressEvent(str, 3, null, 4, null);
        C84654XKg c84654XKg = AddressPageStarter.LIZIZ;
        if (c84654XKg != null) {
            C3C5.m7constructorimpl(addressEvent);
            c84654XKg.resumeWith(addressEvent);
            AddressPageStarter.LIZIZ = null;
        }
        C27090AkA.LJLJI.clear();
        EventCenter.LJ().LIZIZ("ec_address_select", this);
        EventCenter.LJ().LIZIZ("ec_address_change", this);
        EventCenter.LJ().LIZIZ("ec_show_notice_dialog", this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        LiveOuterService.LJJJLL().LJJIJIL().E8(SystemClock.elapsedRealtime() - this.resumeTime);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.resumeTime = SystemClock.elapsedRealtime();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        logStayPage();
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    private final C76800UCe showNoticeDialog(String str) {
        Context context;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(NoticeDialogMessage.class)));
            if (!(fromJson instanceof NoticeDialogMessage)) {
                fromJson = null;
            }
            NoticeDialogMessage noticeDialogMessage = (NoticeDialogMessage) fromJson;
            if (noticeDialogMessage == null || (context = getContext()) == null) {
                return null;
            }
            C26227ARb LIZ = C3AW.LIZ(context);
            String str2 = noticeDialogMessage.titleText;
            if (str2 != null) {
                LIZ.LJFF(str2);
            }
            String str3 = noticeDialogMessage.contentText;
            if (str3 != null) {
                LIZ.LIZIZ(str3);
            }
            ARI ari = new ARI(context);
            String str4 = noticeDialogMessage.confirmButtonText;
            if (str4 != null) {
                ari.LJII(str4, new AqS170S0100000_4(this, 215));
            }
            LIZ.LJIIL = ari;
            LIZ.LJI().LIZLLL();
            return C76800UCe.LIZ;
        } catch (s unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public void fillNodeParams(C70858RrS params) {
        o.LJIIIZ(params, "params");
        HashMap<String, Object> hashMap = getViewModel().LJLJL;
        C78915Uy7.LJJIL(params, new AqS170S0100000_4((HashMap) hashMap, (HashMap<String, Object>) 212));
        C78915Uy7.LJJJ(params, new AqS170S0100000_4((HashMap) hashMap, (HashMap<String, Object>) 213));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getEngine().LIZIZ(this, mo49getActivity(), getViewModel(), null);
        initUI();
        initSubscribe();
        getViewModel().Lv0();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        AddressPageStarter.AddressListEnterParams addressListEnterParams;
        String str;
        String str2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str3 = null;
        if (arguments != null) {
            addressListEnterParams = (AddressPageStarter.AddressListEnterParams) arguments.getParcelable("enter_params");
        } else {
            addressListEnterParams = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("track_id");
        } else {
            str = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("selected_address_id");
        } else {
            str2 = null;
        }
        C27090AkA.LJLILLLLZI = str2;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            str3 = arguments4.getString("unavailable_address_ids");
        }
        if (C78857UxB.LJJJIL(str3)) {
            ArrayList<String> arrayList = C27090AkA.LJLJI;
            arrayList.clear();
            arrayList.addAll((Collection) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), str3, new C26882Ago().getType()));
        }
        getViewModel().Mv0(addressListEnterParams, str);
        getViewModel().LJLLILLLL = true;
        this.isFirstLoad = 1;
    }

    public final void setPrivacyPolicyText(LinkRichText linkRichText) {
        SpannableStringBuilder spannableStringBuilder;
        TextView textView = (TextView) _$_findCachedViewById(R.id.be3);
        if (textView != null) {
            C45804HyK.LJJLL(textView);
            Context context = textView.getContext();
            if (context != null) {
                spannableStringBuilder = RichTextUtil.LIZJ(RichTextUtil.LIZ, context, linkRichText, null, 0, false, null, null, 124);
            } else {
                spannableStringBuilder = null;
            }
            textView.setText(spannableStringBuilder);
            textView.setClickable(true);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final void showBottomAddAddressBtn(boolean z) {
        int i;
        String str;
        View bottomBtnLayout = _$_findCachedViewById(R.id.aof);
        o.LJIIIIZZ(bottomBtnLayout, "bottomBtnLayout");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        bottomBtnLayout.setVisibility(i);
        if (getStyle().getBottomBtnUseBigCorner()) {
            _$_findCachedViewById(R.id.aoe).getClass();
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.aoe);
        Context context = getContext();
        if (context != null) {
            str = context.getString(getStyle().getBottomBtnTextRes());
        } else {
            str = null;
        }
        textView.setText(str);
        View bottomBtn = _$_findCachedViewById(R.id.aoe);
        o.LJIIIIZZ(bottomBtn, "bottomBtn");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 26, 42), bottomBtn);
    }

    @Override // X.InterfaceC60061Nhh
    public void onEvent(String eventName, String params) {
        C0A2 layoutManager;
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(params, "params");
        int hashCode = eventName.hashCode();
        if (hashCode != -2019832472) {
            if (hashCode != 1819520028) {
                if (hashCode != 1974122510 || !eventName.equals("ec_show_notice_dialog")) {
                    return;
                }
                showNoticeDialog(params);
                return;
            }
            if (!eventName.equals("ec_address_change") || C26755Ael.LIZ(params).type == 2 || !(getViewModel() instanceof UsAddressListViewModel) || (layoutManager = ((RecyclerView) _$_findCachedViewById(R.id.isf)).getLayoutManager()) == null) {
                return;
            }
            layoutManager.LJZL(0);
            return;
        }
        if (!eventName.equals("ec_address_select")) {
            return;
        }
        C26755Ael.LIZ(params);
        ASQ.LJ(this, ASX.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        getEngine().LIZ(getViewModel(), view);
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIILLIIL(c73139Sn9, interfaceC88472Yns);
    }

    public View com_ss_android_ugc_aweme_ecommerce_base_address_list_AddressListPanelFragment__onCreateView$___twin___(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        if (viewGroup != null) {
            Context context = inflater.getContext();
            o.LJIIIIZZ(context, "inflater.context");
            return C27532ArI.LIZ(R.layout.xb, context, viewGroup, false);
        }
        return null;
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

    public static View com_ss_android_ugc_aweme_ecommerce_base_address_list_AddressListPanelFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(AddressListPanelFragment addressListPanelFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View com_ss_android_ugc_aweme_ecommerce_base_address_list_AddressListPanelFragment__onCreateView$___twin___ = addressListPanelFragment.com_ss_android_ugc_aweme_ecommerce_base_address_list_AddressListPanelFragment__onCreateView$___twin___(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(com_ss_android_ugc_aweme_ecommerce_base_address_list_AddressListPanelFragment__onCreateView$___twin___ instanceof View)) {
            com_ss_android_ugc_aweme_ecommerce_base_address_list_AddressListPanelFragment__onCreateView$___twin___ = null;
        }
        if (com_ss_android_ugc_aweme_ecommerce_base_address_list_AddressListPanelFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(com_ss_android_ugc_aweme_ecommerce_base_address_list_AddressListPanelFragment__onCreateView$___twin___, addressListPanelFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(com_ss_android_ugc_aweme_ecommerce_base_address_list_AddressListPanelFragment__onCreateView$___twin___, addressListPanelFragment);
                C10A.LIZIZ(com_ss_android_ugc_aweme_ecommerce_base_address_list_AddressListPanelFragment__onCreateView$___twin___, addressListPanelFragment);
                ActivityC45651qj mo49getActivity = addressListPanelFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return com_ss_android_ugc_aweme_ecommerce_base_address_list_AddressListPanelFragment__onCreateView$___twin___;
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
