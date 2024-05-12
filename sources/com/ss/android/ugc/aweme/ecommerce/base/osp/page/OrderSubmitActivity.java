package com.ss.android.ugc.aweme.ecommerce.base.osp.page;

import X.AMD;
import X.AML;
import X.AbstractActivityC27434Api;
import X.AbstractC26082ALm;
import X.C157166Eu;
import X.C221108m2;
import X.C27215AmB;
import X.C27739Aud;
import X.C27830Aw6;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65803Ps7;
import X.C71284RyK;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C78857UxB;
import X.C78983UzD;
import X.EnumC63755P0l;
import X.InterfaceC151715xP;
import X.InterfaceC18010nF;
import X.InterfaceC27825Aw1;
import X.InterfaceC36571c5;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.L9X;
import X.TBW;
import X.TMG;
import X.W1T;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressPromotionSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS64S0400000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OrderSubmitActivity extends AbstractActivityC27434Api implements InterfaceC151715xP, AMD<ViewModelProvider.Factory>, InterfaceC18010nF {
    public Integer LJLJJI;
    public final lifecycleAwareLazy LJLJJLL;
    public InterfaceC88472Yns<? super MotionEvent, C76800UCe> LJLJL;
    public long LJLJLJ;
    public Fragment LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 175));

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.AbstractActivityC27434Api, X.InterfaceC37828Esy
    public final String getPageName() {
        return "order_submit";
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public OrderSubmitActivity() {
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLJJLL = new lifecycleAwareLazy(this, new AqS64S0400000_4(this, LIZ, C27215AmB.INSTANCE, LIZ, 6));
        this.LJLJL = C27830Aw6.LJLIL;
        this.LJLJLJ = -1L;
    }

    public final OrderSubmitViewModel LLII() {
        return (OrderSubmitViewModel) this.LJLJJLL.getValue();
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return EnumC63755P0l.ORDER_SUBMIT_PAGE.getPageCode();
    }

    @Override // X.AMD
    public final ViewModelProvider.Factory getViewModelFactory() {
        return (ViewModelProvider.Factory) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C73157SnR.LJIIJJI(LLII(), new AqS170S0100000_4(this, 253));
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        WeakReference<L9X> weakReference = L9X.LIZJ;
        if (weakReference != null) {
            weakReference.clear();
        }
        L9X.LIZJ = null;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        LiveOuterService.LJJJLL().LJJIJIL().E8(SystemClock.elapsedRealtime() - this.LJLJLJ);
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity", "onResume", true);
        super.onResume();
        this.LJLJLJ = SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity", "onStart", true);
        super.onStart();
        InterfaceC36571c5 interfaceC36571c5 = this.LJLJLLL;
        if (interfaceC36571c5 != null && (interfaceC36571c5 instanceof InterfaceC27825Aw1)) {
            ((InterfaceC27825Aw1) interfaceC36571c5).onVisible();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        InterfaceC36571c5 interfaceC36571c5 = this.LJLJLLL;
        if (interfaceC36571c5 != null && (interfaceC36571c5 instanceof InterfaceC27825Aw1)) {
            ((InterfaceC27825Aw1) interfaceC36571c5).onInVisible();
        }
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    public static final /* synthetic */ void LLFZ(OrderSubmitActivity orderSubmitActivity) {
        super.onBackPressed();
    }

    public static void LLIIIILZ(HashMap hashMap) {
        Object obj;
        Object obj2;
        String str;
        Object obj3;
        String str2;
        Object obj4;
        String str3;
        Object obj5;
        if (hashMap != null) {
            obj = hashMap.get("enter_from_info");
        } else {
            obj = null;
        }
        if (!o.LJ(obj, "goods_search")) {
            if (hashMap != null) {
                obj5 = hashMap.get("enter_from_info");
            } else {
                obj5 = null;
            }
            if (!o.LJ(obj5, "store_tab_search")) {
                return;
            }
        }
        HashMap LJ = C27739Aud.LJ("entrance_info", hashMap);
        if (LJ != null) {
            obj2 = LJ.get("search_id");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        if (C78857UxB.LJJJIL(str)) {
            if (LJ != null) {
                obj3 = LJ.get("search_result_id");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str2 = (String) obj3;
            } else {
                str2 = null;
            }
            if (C78857UxB.LJJJIL(str2)) {
                if (LJ != null) {
                    obj4 = LJ.get("search_entrance");
                } else {
                    obj4 = null;
                }
                if (obj4 instanceof String) {
                    str3 = (String) obj4;
                } else {
                    str3 = null;
                }
                if (C78857UxB.LJJJIL(str3)) {
                    return;
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (LJ != null) {
            for (Map.Entry entry : LJ.entrySet()) {
                Object value = entry.getValue();
                if ((value instanceof String) && value != null) {
                    linkedHashMap.put(entry.getKey(), value);
                }
            }
        }
        C78983UzD.LJIILLIIL("search_params_missing", linkedHashMap);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.LJLJL.invoke(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0263 A[Catch: Exception -> 0x0370, TryCatch #0 {Exception -> 0x0370, blocks: (B:26:0x01c1, B:28:0x01cd, B:29:0x01cf, B:31:0x01df, B:32:0x01e1, B:34:0x01f2, B:57:0x0244, B:62:0x0257, B:64:0x0263, B:65:0x0265, B:68:0x0271, B:69:0x0275, B:72:0x027c, B:73:0x0280, B:76:0x0287, B:77:0x028b, B:80:0x0292, B:81:0x0296, B:83:0x02a4, B:85:0x02bb, B:86:0x02c1, B:89:0x02d1, B:93:0x02dd, B:96:0x02e6, B:98:0x02ea, B:99:0x02fe, B:102:0x0314, B:103:0x0318, B:106:0x031f, B:107:0x0329, B:110:0x0334, B:111:0x0338, B:114:0x0343, B:115:0x034f, B:118:0x035f), top: B:25:0x01c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a4 A[Catch: Exception -> 0x0370, TryCatch #0 {Exception -> 0x0370, blocks: (B:26:0x01c1, B:28:0x01cd, B:29:0x01cf, B:31:0x01df, B:32:0x01e1, B:34:0x01f2, B:57:0x0244, B:62:0x0257, B:64:0x0263, B:65:0x0265, B:68:0x0271, B:69:0x0275, B:72:0x027c, B:73:0x0280, B:76:0x0287, B:77:0x028b, B:80:0x0292, B:81:0x0296, B:83:0x02a4, B:85:0x02bb, B:86:0x02c1, B:89:0x02d1, B:93:0x02dd, B:96:0x02e6, B:98:0x02ea, B:99:0x02fe, B:102:0x0314, B:103:0x0318, B:106:0x031f, B:107:0x0329, B:110:0x0334, B:111:0x0338, B:114:0x0343, B:115:0x034f, B:118:0x035f), top: B:25:0x01c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02dd A[Catch: Exception -> 0x0370, TryCatch #0 {Exception -> 0x0370, blocks: (B:26:0x01c1, B:28:0x01cd, B:29:0x01cf, B:31:0x01df, B:32:0x01e1, B:34:0x01f2, B:57:0x0244, B:62:0x0257, B:64:0x0263, B:65:0x0265, B:68:0x0271, B:69:0x0275, B:72:0x027c, B:73:0x0280, B:76:0x0287, B:77:0x028b, B:80:0x0292, B:81:0x0296, B:83:0x02a4, B:85:0x02bb, B:86:0x02c1, B:89:0x02d1, B:93:0x02dd, B:96:0x02e6, B:98:0x02ea, B:99:0x02fe, B:102:0x0314, B:103:0x0318, B:106:0x031f, B:107:0x0329, B:110:0x0334, B:111:0x0338, B:114:0x0343, B:115:0x034f, B:118:0x035f), top: B:25:0x01c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ea A[Catch: Exception -> 0x0370, TryCatch #0 {Exception -> 0x0370, blocks: (B:26:0x01c1, B:28:0x01cd, B:29:0x01cf, B:31:0x01df, B:32:0x01e1, B:34:0x01f2, B:57:0x0244, B:62:0x0257, B:64:0x0263, B:65:0x0265, B:68:0x0271, B:69:0x0275, B:72:0x027c, B:73:0x0280, B:76:0x0287, B:77:0x028b, B:80:0x0292, B:81:0x0296, B:83:0x02a4, B:85:0x02bb, B:86:0x02c1, B:89:0x02d1, B:93:0x02dd, B:96:0x02e6, B:98:0x02ea, B:99:0x02fe, B:102:0x0314, B:103:0x0318, B:106:0x031f, B:107:0x0329, B:110:0x0334, B:111:0x0338, B:114:0x0343, B:115:0x034f, B:118:0x035f), top: B:25:0x01c1 }] */
    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r33) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        C78983UzD.LJIILL("OSP statistic page rebuild");
        String str4 = null;
        outState.putString("requestParams", C27739Aud.LJI(new OrderSubmitRequestParam(LLII().LJLJLJ, LLII().LJLJLLL, null, null, null, null, null, null, null, null, null, null, 4092, null)));
        outState.putString("chain_key", LLII().LJLLL);
        HashMap<String, Object> hashMap = LLII().LLIL;
        String str5 = null;
        if (hashMap != null) {
            str = C27739Aud.LJI(hashMap);
        } else {
            str = null;
        }
        outState.putString("trackParams", str);
        outState.putString("repoId", LLII().LLILIL);
        BillInfoData billInfoData = LLII().LJZ;
        if (billInfoData != null) {
            str2 = C27739Aud.LJI(billInfoData);
        } else {
            str2 = null;
        }
        C71284RyK.LIZIZ("order_submit_page_cache", "bill_info_data", str2);
        Fragment fragment = this.LJLJLLL;
        if (fragment != null) {
            str3 = fragment.getTag();
        } else {
            str3 = null;
        }
        outState.putString("last_page", str3);
        outState.putInt("buy_type", LLII().LJLJJLL);
        outState.putString("pdp_from", LLII().LLJILJIL);
        List<AddressPromotionSku> list = LLII().LLJILJILJ;
        if (list != null) {
            str4 = C27739Aud.LJI(list);
        }
        outState.putString("promotion_request", str4);
        List<String> list2 = LLII().LLJILLL;
        if (list2 != null) {
            str5 = C27739Aud.LJI(list2);
        }
        outState.putString("best_voucher_type_ids", str5);
        outState.putString("voucher_type_id", LLII().LLJJ);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
