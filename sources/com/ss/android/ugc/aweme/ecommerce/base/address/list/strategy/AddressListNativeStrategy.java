package com.ss.android.ugc.aweme.ecommerce.base.address.list.strategy;

import X.AML;
import X.AbstractC234519Ih;
import X.AbstractC26082ALm;
import X.AbstractC26897Ah3;
import X.C157166Eu;
import X.C16880lQ;
import X.C1A7;
import X.C1DD;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26059AKp;
import X.C26227ARb;
import X.C26615AcV;
import X.C26706Ady;
import X.C26751Aeh;
import X.C27739Aud;
import X.C3AW;
import X.C5H3;
import X.C65330PkU;
import X.C65352Pkq;
import X.C68322mC;
import X.C73139Sn9;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C78840Uwu;
import X.C9KF;
import X.InterfaceC151715xP;
import X.InterfaceC60061Nhh;
import X.InterfaceC61312at;
import X.InterfaceC65784Pro;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.InterfaceC92693kP;
import X.SC5;
import X.TBT;
import X.TBW;
import X.TMF;
import X.TMG;
import X.UC0;
import X.W1T;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.NoticeDialogMessage;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListActivity;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.style.IAddressListStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class AddressListNativeStrategy extends AbstractC26897Ah3 implements InterfaceC151715xP, InterfaceC60061Nhh, c {
    public final AddressListActivity activity;
    public final C5H3 adapter$delegate;
    public String failReason;
    public int isFirstLoad;
    public boolean isFirstReport;
    public boolean loadSuccess;
    public long retryStartTime;
    public final C5H3 style$delegate;
    public final AddressListViewModel viewModel;

    @Override // X.InterfaceC73141SnB
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
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

    @Override // X.AbstractC26897Ah3
    public void onStart() {
    }

    public final String stateToReason(int i) {
        return i != 2 ? i != 3 ? i != 4 ? "other reason" : "no address info" : "something went wrong" : "network error";
    }

    private final IAddressListStyle getStyle() {
        return (IAddressListStyle) this.style$delegate.getValue();
    }

    private final void handleUserBack() {
        withState(this.viewModel, new AqS170S0100000_4(this, 219));
    }

    private final void initSubscribe() {
        C73156SnQ.LJIIIIZZ(this, this.viewModel, new TBT() { // from class: X.Agg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((AddressListState) obj).getStatus());
            }
        }, new AqS186S0100000_4(this, 22));
        C73156SnQ.LJIIIIZZ(this, this.viewModel, new TBT() { // from class: X.Agx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AddressListState) obj).getAddressItems();
            }
        }, new AqS186S0100000_4(this, 23));
        C73156SnQ.LJIIIIZZ(this, this.viewModel, new TBT() { // from class: X.Agt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AddressListState) obj).getAddressState();
            }
        }, new AqS186S0100000_4(this, 24));
        C73156SnQ.LJIIIIZZ(this, this.viewModel, new TBT() { // from class: X.Agu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AddressListState) obj).getAddressState();
            }
        }, new AqS186S0100000_4(this, 25));
        C73156SnQ.LJIIIIZZ(this, this.viewModel, new TBT() { // from class: X.Agz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AddressListState) obj).getSelectAddressId();
            }
        }, new AqS186S0100000_4(this, 20));
        C73156SnQ.LJIIIIZZ(this, this.viewModel, new TBT() { // from class: X.Ags
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AddressListState) obj).getPolicyItemVO();
            }
        }, new AqS186S0100000_4(this, 21));
        C26059AKp.LIZ().LIZJ("ec_show_notice_dialog", this);
    }

    private final void initUI() {
        C1A7.LJJIJL(this.activity.getWindow());
        ((RecyclerView) this.activity._$_findCachedViewById(R.id.isf)).setAdapter(getAdapter());
        ((RecyclerView) this.activity._$_findCachedViewById(R.id.isf)).setLayoutManager(new LinearLayoutManager());
        if (this.viewModel.Nv0()) {
            View _$_findCachedViewById = this.activity._$_findCachedViewById(R.id.g6f);
            o.LJIIIIZZ(_$_findCachedViewById, "activity.ll_submit");
            _$_findCachedViewById.setVisibility(0);
            C252709vu c252709vu = (C252709vu) this.activity._$_findCachedViewById(R.id.l9j);
            C235119Kp c235119Kp = new C235119Kp();
            String string = this.activity.getString(R.string.fcw);
            o.LJIIIIZZ(string, "activity.getString(R.str…_address_list_page_title)");
            C78840Uwu.LJJIL(c235119Kp, string, this.activity);
            c252709vu.setNavActions(c235119Kp);
            View _$_findCachedViewById2 = this.activity._$_findCachedViewById(R.id.auf);
            o.LJIIIIZZ(_$_findCachedViewById2, "activity.btnSubmit");
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 27, 42), _$_findCachedViewById2);
            return;
        }
        View _$_findCachedViewById3 = this.activity._$_findCachedViewById(R.id.g6f);
        o.LJIIIIZZ(_$_findCachedViewById3, "activity.ll_submit");
        _$_findCachedViewById3.setVisibility(8);
        C252709vu c252709vu2 = (C252709vu) this.activity._$_findCachedViewById(R.id.l9j);
        C235119Kp c235119Kp2 = new C235119Kp();
        C234529Ii c234529Ii = new C234529Ii();
        int navArrowRes = getStyle().getNavArrowRes();
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = navArrowRes;
        c234529Ii.LJII = C1DD.LIZLLL(R.string.aub, "AppContextManager.getApp…lityLabels_settings_back)");
        c234529Ii.LIZIZ(new AqS154S0100000_4(this, 144));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp2, new AbstractC234519Ih[]{c234529Ii});
        String string2 = this.activity.getString(getStyle().getNavTitleRes());
        o.LJIIIIZZ(string2, "activity.getString(style.navTitleRes)");
        LIZLLL.LIZJ = string2;
        c235119Kp2.LIZJ = LIZLLL;
        c235119Kp2.LIZLLL = true;
        c252709vu2.setNavActions(c235119Kp2);
    }

    public final AddressAdapter getAdapter() {
        return (AddressAdapter) this.adapter$delegate.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.activity.getLifecycle();
        o.LJIIIIZZ(lifecycle, "activity.lifecycle");
        return lifecycle;
    }

    @Override // X.AbstractC26897Ah3
    public void onDestroy() {
        C26615AcV.LIZ = new LinkedHashMap();
        C26059AKp.LIZ().LIZIZ("ec_show_notice_dialog", this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC26897Ah3
    public void onPause() {
        T t;
        C68322mC c68322mC = new C68322mC();
        if (ActivityStack.isAppBackGround()) {
            t = "close";
        } else {
            t = "return";
        }
        c68322mC.element = t;
        AddressListViewModel addressListViewModel = this.viewModel;
        if (addressListViewModel.LJLLLL) {
            c68322mC.element = "next";
        }
        withState(addressListViewModel, new AqS135S0200000_4(this, (AddressListNativeStrategy) c68322mC, (C68322mC<String>) 20));
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final AddressListActivity getActivity() {
        return this.activity;
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    public final AddressListViewModel getViewModel() {
        return this.viewModel;
    }

    private final C76800UCe showNoticeDialog(String str) {
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(NoticeDialogMessage.class)));
            if (!(fromJson instanceof NoticeDialogMessage)) {
                fromJson = null;
            }
            NoticeDialogMessage noticeDialogMessage = (NoticeDialogMessage) fromJson;
            if (noticeDialogMessage == null) {
                return null;
            }
            C26227ARb LIZ = C3AW.LIZ(this.activity);
            String str2 = noticeDialogMessage.titleText;
            if (str2 != null) {
                LIZ.LJFF(str2);
            }
            String str3 = noticeDialogMessage.contentText;
            if (str3 != null) {
                LIZ.LIZIZ(str3);
            }
            String str4 = noticeDialogMessage.confirmButtonText;
            if (str4 != null) {
                UC0.LIZJ(LIZ, new AqS58S1100000_4(str4, this, 4));
            }
            LIZ.LJI().LIZLLL();
            return C76800UCe.LIZ;
        } catch (s unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.Strategy
    public void onBackPressed(InterfaceC65784Pro<C76800UCe> defaultAction) {
        o.LJIIIZ(defaultAction, "defaultAction");
        super.onBackPressed(defaultAction);
        handleUserBack();
    }

    @Override // X.AbstractC26897Ah3
    public void onCreate(Bundle bundle) {
        this.activity.setContentView(R.layout.xa);
        C26751Aeh c26751Aeh = AddressPageStarter.AddressListEnterParams.Companion;
        Intent intent = this.activity.getIntent();
        c26751Aeh.getClass();
        AddressPageStarter.AddressListEnterParams LIZ = C26751Aeh.LIZ(intent);
        Intent intent2 = this.activity.getIntent();
        o.LJIIIZ(intent2, "<this>");
        this.viewModel.Mv0(LIZ, C16880lQ.LLJJIJIIJIL(intent2, "lib_track_rtn_id"));
        AddressListViewModel viewModel = this.viewModel;
        o.LJIIIZ(viewModel, "viewModel");
        Map<String, Object> map = C26615AcV.LIZ;
        map.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        map.put("page_name", "shipping_info");
        HashMap<String, Object> hashMap = viewModel.LJLJL;
        if (hashMap != null) {
            map.putAll(hashMap);
        }
        this.isFirstLoad = 1;
        initUI();
        initSubscribe();
        this.viewModel.Lv0();
    }

    public final void setPrivacyPolicyText(LinkRichText linkRichText) {
        TextView textView = (TextView) this.activity._$_findCachedViewById(R.id.mef);
        if (textView != null) {
            textView.setText(RichTextUtil.LIZJ(RichTextUtil.LIZ, this.activity, linkRichText, null, 0, false, null, null, 124));
            textView.setClickable(true);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressListNativeStrategy(AddressListActivity activity, AddressListViewModel viewModel) {
        super(activity);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(viewModel, "viewModel");
        this.activity = activity;
        this.viewModel = viewModel;
        this.adapter$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 143));
        this.isFirstLoad = 1;
        this.loadSuccess = true;
        this.failReason = "other reason";
        this.isFirstReport = true;
        this.style$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 145));
    }

    @Override // X.InterfaceC60061Nhh
    public void onEvent(String str, String str2) {
        if (SC5.LIZIZ(str, "eventName", str2, "params", str, "ec_show_notice_dialog")) {
            showNoticeDialog(str2);
        }
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIILLIIL(c73139Sn9, interfaceC88472Yns);
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
