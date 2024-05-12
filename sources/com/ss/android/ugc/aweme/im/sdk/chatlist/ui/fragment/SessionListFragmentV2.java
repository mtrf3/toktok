package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment;

import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.C106674Gp;
import X.C10A;
import X.C141335gf;
import X.C157166Eu;
import X.C16300kU;
import X.C16880lQ;
import X.C1HQ;
import X.C221108m2;
import X.C255099zl;
import X.C29S;
import X.C2NU;
import X.C2U8;
import X.C37O;
import X.C3C5;
import X.C3E6;
import X.C3K3;
import X.C3L4;
import X.C3TV;
import X.C3TX;
import X.C3Y4;
import X.C41147GCx;
import X.C48339Iy7;
import X.C48841JEv;
import X.C53946LFe;
import X.C54502LaE;
import X.C57738MlK;
import X.C5H3;
import X.C62822Ol8;
import X.C65777Prh;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C73305Spp;
import X.C73411SrX;
import X.C76800UCe;
import X.C772831o;
import X.C80763Ey;
import X.C82253Kr;
import X.C82773Mr;
import X.C84543Tm;
import X.C84563To;
import X.C85323Wm;
import X.C85613Xp;
import X.C90903hW;
import X.C96423qQ;
import X.C96963rI;
import X.C97463s6;
import X.C97913sp;
import X.C97933sr;
import X.C98143tC;
import X.C98313tT;
import X.C98533tp;
import X.C98603tw;
import X.C9XU;
import X.EXV;
import X.EnumC100693xJ;
import X.EnumC58046MqI;
import X.G27;
import X.InterfaceC151715xP;
import X.InterfaceC191547fS;
import X.InterfaceC61213O0r;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC82683Wch;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.InterfaceC97983sw;
import X.InterfaceC98113t9;
import X.InterfaceC98133tB;
import X.InterfaceC98153tD;
import X.InterfaceC98253tN;
import X.JBR;
import X.JBS;
import X.LFH;
import X.ORS;
import X.TBW;
import X.TMG;
import X.UTK;
import X.W1T;
import X.XKX;
import X.Y96;
import Y.ARunnableS37S0100000_1;
import Y.AfS53S0100000_1;
import Y.IDrS41S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.router.arg.RouteArgInjector;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.DMNavArg;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

@InterfaceC61213O0r(attachActivity = SessionListFragmentV2$$Activity.class)
/* loaded from: classes2.dex */
public final class SessionListFragmentV2 extends BaseFragment implements JBS, InterfaceC151715xP, InterfaceC191547fS, G27, InterfaceC98253tN {
    public static final /* synthetic */ int LJZL = 0;
    public C97933sr LJLIL;
    public InterfaceC97983sw LJLLILLLL;
    public C73411SrX LJLLL;
    public InterfaceC82683Wch LJLLLL;
    public boolean LJLZ;
    public final Map<Integer, View> LJZI = new LinkedHashMap();
    public final String LJLILLLLZI = "";
    public final C98313tT LJLJI = new C98313tT(0);
    public final C98603tw LJLJJI = new C98603tw(0);
    public final C5H3 LJLJJL = RouteArgExtension.INSTANCE.navArg(this);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C98143tC.LJLIL);
    public final SessionListTopNoticeViewModel LJLJL = new SessionListTopNoticeViewModel("SessionListFragmentV2", null, null, 1022);
    public final InterfaceC98113t9 LJLJLJ = C57738MlK.LIZIZ.LJIILIIL().LIZJ();
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 580));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 582));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 583));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 581));
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 579));
    public final IDrS41S0100000_1 LJZ = new IDrS41S0100000_1(this, 2);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
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

    @Override // X.JBS
    public final /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    public final void Al() {
        String str;
        int i;
        String str2;
        String noticeType;
        Integer messageCount;
        C3TV c3tv = C3TV.LIZ;
        DMNavArg wl = wl();
        String str3 = "";
        if (wl == null || (str = wl.getEnterFrom()) == null) {
            str = "";
        }
        DMNavArg wl2 = wl();
        if (wl2 != null && (messageCount = wl2.getMessageCount()) != null) {
            i = messageCount.intValue();
        } else {
            i = 0;
        }
        DMNavArg wl3 = wl();
        if (wl3 == null || (str2 = wl3.getEnterMethod()) == null) {
            str2 = "";
        }
        DMNavArg wl4 = wl();
        if (wl4 != null && (noticeType = wl4.getNoticeType()) != null) {
            str3 = noticeType;
        }
        C85323Wm onEventV3 = C772831o.LIZ();
        c3tv.getClass();
        String LIZ = C3TV.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ LIZIZ = C48339Iy7.LIZIZ("enter_from", str);
        LIZIZ.put("num", String.valueOf(i));
        LIZIZ.put("enter_method", str2);
        LIZIZ.put("notice_type", str3);
        LIZIZ.put("from_book_mode", LIZ);
        onEventV3.LIZIZ("enter_chat_list", LIZIZ);
        C3Y4.LJ("enter_from", str);
        C3Y4.LJ("enter_method", str2);
        if (wl() == null) {
            return;
        }
        C98603tw c98603tw = this.LJLJJI;
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        c98603tw.LIZIZ(requireActivity, wl());
    }

    public final boolean isBookMode() {
        return LFH.LIZIZ.LIZLLL().LJIIIIZZ().LIZLLL("bookmode_dm");
    }

    public final boolean vl() {
        if (this.LJLJLJ.getEnable() && !LFH.LIZIZ.LIZLLL().LJIIIIZZ().LIZLLL("bookmode_dm")) {
            return true;
        }
        return false;
    }

    public final DMNavArg wl() {
        return (DMNavArg) this.LJLJJL.getValue();
    }

    public final C97463s6 xl() {
        return (C97463s6) this.LJLLJ.getValue();
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        xl().showLoadMoreLoading();
        C82253Kr.LJJI(C37O.LIZIZ());
    }

    @Override // X.JBS
    public final void onBackPressed_Activity() {
        if (C53946LFe.LIZJ(mo49getActivity(), null).LJFF) {
            JBR.LIZIZ(this);
            return;
        }
        InterfaceC97983sw interfaceC97983sw = this.LJLLILLLL;
        if (interfaceC97983sw != null && interfaceC97983sw.LIZLLL()) {
            InterfaceC97983sw interfaceC97983sw2 = this.LJLLILLLL;
            if (interfaceC97983sw2 == null) {
                return;
            }
            interfaceC97983sw2.LJII();
            return;
        }
        if (requireActivity().isTaskRoot()) {
            SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "//main");
            buildRoute.addFlags(67108864);
            buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            buildRoute.open();
        }
        JBR.LIZIZ(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C3E6.LIZJ();
        C98533tp.LIZIZ();
        C97933sr c97933sr = this.LJLIL;
        if (c97933sr != null) {
            if (EventBus.LIZJ().LJI(c97933sr)) {
                EventBus.LIZJ().LJIJ(c97933sr);
            }
            C97463s6 c97463s6 = c97933sr.LJLJI;
            Iterator it = ((ArrayList) c97463s6.LJLJL).iterator();
            while (it.hasNext()) {
                ((SessionListViewHolder) it.next()).U();
            }
            ORS.LJJLIL(C85613Xp.LJLIL, c97463s6.LJLJL);
            C48841JEv.LIZJ(c97933sr.LJLJLJ, null);
            C82253Kr LIZIZ = C37O.LIZIZ();
            C97933sr c97933sr2 = this.LJLIL;
            if (c97933sr2 != null) {
                C65777Prh.LIZ(LIZIZ.LJLIL).remove(c97933sr2);
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.jq7);
                if (recyclerView == null) {
                    return;
                }
                recyclerView.setAdapter(null);
                return;
            }
            o.LJIJI("mSessionListView");
            throw null;
        }
        o.LJIJI("mSessionListView");
        throw null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLJI.stop();
        C98313tT c98313tT = this.LJLJI;
        long j = c98313tT.LIZJ - c98313tT.LIZIZ;
        String LIZ = C80763Ey.LIZ(false);
        LIZ.toString();
        C85323Wm eventSender = C772831o.LIZ();
        o.LJIIIZ(eventSender, "eventSender");
        C1HQ c1hq = new C1HQ();
        c1hq.put("user_id", LIZ);
        c1hq.put("duration", String.valueOf(j));
        eventSender.LIZIZ("leave_chat_list", c1hq);
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        super.onResume();
        C96963rI.LJ().getClass();
        C96963rI.LIZLLL().getClass();
        if (C84563To.LIZ()) {
            C84543Tm.LIZ();
        }
        DMNavArg wl = wl();
        if (wl == null || (str = wl.getEnterFrom()) == null) {
            str = "";
        }
        if (ujb.o.LJJJJIZL(str, "outer_push", true)) {
            return;
        }
        C106674Gp.LJIIJJI("session_list_v2_resume", false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LJLLL = (C73411SrX) UTK.LIZIZ.LJFF(EnumC58046MqI.CONTACT).LIZIZ().LJJJJZI(new AfS53S0100000_1(this, 14));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C73411SrX c73411SrX = this.LJLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public final void refreshData() {
        mo49getActivity();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                if (xl().LJLZ()) {
                    ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
                    ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LJFF();
                }
                C106674Gp.LJIIJJI("session_list_v2_refresh", false);
                C2U8.LIZ(new C82773Mr());
                return;
            }
        } catch (Exception unused) {
        }
        if (xl().LJLZ()) {
            XKX.LIZLLL(C48841JEv.LIZ(EXV.LIZ), null, null, new C97913sp(this, null), 3);
        }
    }

    public final void Dl(RecyclerView recyclerView) {
        int i;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.gi7);
        if (canScrollVertically && !isBookMode() && !this.LJLZ) {
            i = 0;
        } else {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
    }

    public final void handleBookModeDiff(Configuration configuration) {
        if (!isBookMode()) {
            return;
        }
        this.LJLZ = C53946LFe.LIZJ(mo49getActivity(), configuration).LJFF;
        RecyclerView sessionRv = (RecyclerView) _$_findCachedViewById(R.id.jq7);
        o.LJIIIIZZ(sessionRv, "sessionRv");
        Dl(sessionRv);
        Drawable drawable = null;
        if (this.LJLZ) {
            C16300kU.LJIILLIIL(_$_findCachedViewById(R.id.l_2), null);
            return;
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.l_2);
        Context context = getContext();
        if (context != null) {
            drawable = context.getDrawable(R.drawable.bhh);
        }
        C16300kU.LJIILLIIL(_$_findCachedViewById, drawable);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        String str;
        super.onActivityCreated(bundle);
        activityConfiguration(C41147GCx.LJLIL);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C9XU.LIZ(mo49getActivity.hashCode(), this);
        }
        C255099zl c255099zl = (C255099zl) this.LJLJLLL.getValue();
        DMNavArg wl = wl();
        if (wl != null) {
            str = wl.getJumpedFromInviteId();
        } else {
            str = null;
        }
        c255099zl.LIZ(str);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        InterfaceC98153tD.LIZ.LIZIZ("chat_list");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C54502LaE.LIZ("im_chat_list");
        super.onCreate(bundle);
        fragmentConfiguration(new AqS173S0100000_7(this, 74));
        C96423qQ.LIZ().LIZ(EnumC100693xJ.ENTER_SESSION_LIST);
        C3E6.LIZIZ();
        Al();
    }

    @Override // X.JBS
    public final void onNewIntent(Intent intent) {
        String str;
        requireActivity().setIntent(intent);
        RouteArgInjector.INSTANCE.inject(this);
        Al();
        C255099zl c255099zl = (C255099zl) this.LJLJLLL.getValue();
        DMNavArg wl = wl();
        if (wl != null) {
            str = wl.getJumpedFromInviteId();
        } else {
            str = null;
        }
        c255099zl.LIZ(str);
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        TuxActionSheet tuxActionSheet;
        o.LJIIIZ(newConfig, "newConfig");
        InterfaceC82683Wch interfaceC82683Wch = this.LJLLLL;
        if (interfaceC82683Wch != null && interfaceC82683Wch.isShowing()) {
            interfaceC82683Wch.dismiss();
        }
        C97463s6 xl = xl();
        RecyclerView recyclerView = xl.LJLJLLL;
        if (recyclerView != null) {
            recyclerView.post(new ARunnableS37S0100000_1(xl, 6));
        }
        xl().LJZ();
        C97463s6 xl2 = xl();
        xl2.getClass();
        InterfaceC97983sw LIZ = LFH.LIZIZ.LIZLLL().LJIIIIZZ().LIZ();
        if (LIZ != null && LIZ.LIZLLL() && !LIZ.LJIIIIZZ()) {
            try {
                Iterator<C3L4> it = xl2.LJLJJI.iterator();
                while (it.hasNext()) {
                    xl2.LJLIL.LIZ(it.next(), 3, null);
                }
                if (C3TX.LIZIZ() && (tuxActionSheet = C3K3.LIZ().LJLJJLL) != null) {
                    tuxActionSheet.dismiss();
                }
            } catch (Throwable unused) {
            }
        }
        handleBookModeDiff(newConfig);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0278, code lost:
    
        if (r0 == false) goto L55;
     */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragmentV2.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // X.InterfaceC98253tN
    public final void zb(boolean z, boolean z2) {
        if (!z && z2) {
            xl().LJZI(-1);
        }
    }

    @Override // X.JBS
    public final void onActivityResult_Activity(int i, int i2, Intent intent) {
        if (i == 1101 && i2 == 11) {
            C3TV.LJII(C3TV.LIZ, xl().LJLJJI.size(), null, null, -1);
        }
        JBR.LIZ(this, i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C98313tT c98313tT = this.LJLJI;
        c98313tT.LIZIZ = 0L;
        c98313tT.LIZJ = 0L;
        c98313tT.start();
        View rootView = C16880lQ.LLLLIILL(inflater, R.layout.b1y, viewGroup, false);
        InterfaceC98133tB LJIIIIZZ = LFH.LIZIZ.LIZLLL().LJIIIIZZ();
        o.LJIIIIZZ(rootView, "rootView");
        InterfaceC97983sw LIZIZ = LJIIIIZZ.LIZIZ(this, rootView, new Y96());
        this.LJLLILLLL = LIZIZ;
        View rootView2 = LIZIZ.getRootView();
        C29S c29s = null;
        if (!(rootView2 instanceof View)) {
            rootView2 = null;
        }
        if (rootView2 != null) {
            try {
                ViewTreeLifecycleOwner.set(rootView2, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(rootView2, this);
                C10A.LIZIZ(rootView2, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return rootView2;
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
