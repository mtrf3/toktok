package com.ss.android.ugc.aweme.notification;

import X.AbstractC030109x;
import X.AbstractC28931Bp;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C10K;
import X.C113554cx;
import X.C116644hw;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C221658mv;
import X.C29S;
import X.C2NU;
import X.C3C5;
import X.C3U3;
import X.C45804HyK;
import X.C57031MZv;
import X.C57032MZw;
import X.C57033MZx;
import X.C57034MZy;
import X.C57035MZz;
import X.C57038Ma2;
import X.C57039Ma3;
import X.C57040Ma4;
import X.C57041Ma5;
import X.C57042Ma6;
import X.C57043Ma7;
import X.C57044Ma8;
import X.C57045Ma9;
import X.C57046MaA;
import X.C57047MaB;
import X.C57048MaC;
import X.C57049MaD;
import X.C57050MaE;
import X.C57051MaF;
import X.C57053MaH;
import X.C57054MaI;
import X.C57055MaJ;
import X.C5H3;
import X.C63081OpJ;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C73379Sr1;
import X.C76800UCe;
import X.C78685UuP;
import X.C90903hW;
import X.EF7;
import X.EnumC221088m0;
import X.FMX;
import X.GDJ;
import X.GDL;
import X.InterfaceC191547fS;
import X.InterfaceC223218pR;
import X.InterfaceC61213O0r;
import X.KL2;
import X.LK2;
import X.MGN;
import X.MX7;
import X.MXP;
import X.ORZ;
import X.OSZ;
import X.QD3;
import Y.ACListenerS29S0100000_9;
import Y.AObserverS77S0100000_9;
import Y.AgS126S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

@InterfaceC61213O0r
/* loaded from: classes10.dex */
public final class LikeListDetailFragment extends BaseFragment implements InterfaceC191547fS, InterfaceC223218pR<DiggInfo>, LK2 {
    public static final int LJZL = (int) KL2.LIZJ(EF7.LIZIZ(), 8.0f);
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C5H3 LJLL;
    public final C5H3 LJLLI;
    public final C5H3 LJLLILLLL;
    public final C5H3 LJLLJ;
    public final C5H3 LJLLL;
    public final C5H3 LJLLLL;
    public final C5H3 LJLLLLLL;
    public final C5H3 LJLZ;
    public List<DiggInfo> LJZ;
    public final Map<Integer, View> LJZI = new LinkedHashMap();

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
    }

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

    @Override // X.InterfaceC27853AwT
    public final String getPageName() {
        return "social_interaction";
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<DiggInfo> list, boolean z) {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public LikeListDetailFragment() {
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLIL = C221108m2.LIZ(enumC221088m0, C57049MaD.LJLIL);
        this.LJLILLLLZI = C221108m2.LIZ(enumC221088m0, new AqS159S0100000_9(this, 334));
        this.LJLJI = C221108m2.LIZ(enumC221088m0, new AqS159S0100000_9(this, 333));
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLJJI = routeArgExtension.optionalArg(this, C57043Ma7.LJLIL, "nid", String.class);
        this.LJLJJL = routeArgExtension.optionalArg(this, C57039Ma3.LJLIL, "aweme_id", String.class);
        this.LJLJJLL = routeArgExtension.optionalArg(this, C57044Ma8.LJLIL, "ref_id", String.class);
        this.LJLJL = routeArgExtension.optionalArgNotNull(this, C57033MZx.LJLIL, "digg_type", Integer.class);
        this.LJLJLJ = routeArgExtension.optionalArgNotNull(this, C57042Ma6.LJLIL, "is_new", Boolean.class);
        this.LJLJLLL = routeArgExtension.optionalArgNotNull(this, C57035MZz.LJLIL, "last_read_time", Long.class);
        this.LJLL = routeArgExtension.optionalArg(this, C57045Ma9.LJLIL, "second_title", String.class);
        this.LJLLI = routeArgExtension.optionalArg(this, C57040Ma4.LJLIL, "cover", UrlModel.class);
        this.LJLLILLLL = routeArgExtension.optionalArg(this, C57041Ma5.LJLIL, "cover_url", String.class);
        this.LJLLJ = routeArgExtension.optionalArg(this, C57046MaA.LJLIL, "tab_name", String.class);
        this.LJLLL = routeArgExtension.optionalArg(this, C57034MZy.LJLIL, "is_favorite", Integer.class);
        this.LJLLLL = routeArgExtension.optionalArgNotNull(this, C57038Ma2.LJLIL, "is_story", Boolean.class);
        this.LJLLLLLL = routeArgExtension.optionalArg(this, C57048MaC.LJLIL, "sort_option_name", String.class);
        this.LJLZ = routeArgExtension.optionalArg(this, C57047MaB.LJLIL, "notification_tab_name", String.class);
    }

    public final int Al() {
        return ((Number) this.LJLJL.getValue()).intValue();
    }

    public final C57054MaI Dl() {
        return (C57054MaI) this.LJLJI.getValue();
    }

    public final Integer Gl() {
        return (Integer) this.LJLLL.getValue();
    }

    public final C57055MaJ Hl() {
        return (C57055MaJ) this.LJLILLLLZI.getValue();
    }

    public final MX7 wl() {
        return (MX7) this.LJLIL.getValue();
    }

    public final String xl() {
        return (String) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LJFF();
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        Integer Gl = Gl();
        if (Gl == null || Gl.intValue() != 1) {
            Hl().LJIIJJI();
        } else {
            Dl().LJIIJJI();
        }
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        if (wl().mShowFooter) {
            wl().setShowFooter(false);
            wl().notifyDataSetChanged();
            wl().showLoadMoreEmpty();
            wl().setShowFooter(false);
        }
        if (wl().getItemCount() == 0) {
            ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
            C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
            C73306Spq c73306Spq = new C73306Spq();
            String string = getString(R.string.h6i);
            o.LJIIIIZZ(string, "getString(R.string.im_like_list_empty_title)");
            c73306Spq.LJFF = string;
            String string2 = getString(R.string.h6h);
            o.LJIIIIZZ(string2, "getString(R.string.im_like_list_empty_desc)");
            c73306Spq.LJI = string2;
            c73305Spp.setStatus(c73306Spq);
        }
        C57053MaH.LIZ(0);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Hl().LIZIZ();
        Dl().LIZIZ();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        wl().showLoadMoreLoading();
    }

    public final void vl() {
        getContext();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                if (wl().getItemCount() == 0) {
                    ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
                    ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LJFF();
                }
                Integer Gl = Gl();
                if (Gl == null || Gl.intValue() != 1) {
                    Hl().refresh();
                } else {
                    Dl().refresh();
                }
                C57050MaE c57050MaE = C57050MaE.LJLIL;
                C57051MaF c57051MaF = C57053MaH.LIZ;
                if (c57051MaF != null) {
                    c57050MaE.invoke(c57051MaF);
                    return;
                }
                return;
            }
        } catch (Exception unused) {
        }
        if (wl().getItemCount() == 0) {
            C10K.LJII(100L).LJ(new AgS126S0100000_9(this, 16), C10K.LJIIIIZZ, null);
        }
        C57053MaH.LIZ = null;
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        if (wl().mShowFooter) {
            wl().setShowFooter(false);
            wl().notifyDataSetChanged();
        }
        if (wl().getItemCount() == 0) {
            ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
            MGN mgn = MGN.LJLILLLLZI;
            if (mgn.isStandardUIEnable()) {
                C73305Spp status_view = (C73305Spp) _$_findCachedViewById(R.id.kf_);
                o.LJIIIIZZ(status_view, "status_view");
                mgn.setStatusView(status_view, "inbox_like_list", new C57031MZv(this), exc);
                Context context = getContext();
                o.LJI(context);
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                o.LJI(LJIJJ);
                mgn.triggerNetworkTips(LJIJJ, "inbox_like_list", exc, (C73305Spp) _$_findCachedViewById(R.id.kf_));
            } else {
                C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJI(c73306Spq, new C57032MZw(this));
                c73305Spp.setStatus(c73306Spq);
            }
        }
        C57053MaH.LIZ(0);
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        wl().showPullUpLoadMore();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fragmentConfiguration(GDJ.LJLIL);
        FMX.LJIIL("enter_social_interaction", C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page")));
        activityConfiguration(GDL.LJLIL);
        super.onCreate(bundle);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C3U3 event) {
        o.LJIIIZ(event, "event");
        wl().notifyDataSetChanged();
    }

    @Override // X.LK2
    public final void v0(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<DiggInfo> list, boolean z) {
        int LJIIZILJ;
        int i;
        int LJIIZILJ2;
        List arrayList;
        wl().setShowFooter(true);
        int i2 = 0;
        if (!z) {
            wl().showLoadMoreEmpty();
            wl().setShowFooter(false);
        } else {
            wl().resetLoadMoreState();
        }
        Integer Gl = Gl();
        if (Gl == null || Gl.intValue() != 1) {
            LJIIZILJ = Hl().LJIIZILJ();
        } else {
            LJIIZILJ = Dl().LJIIZILJ();
        }
        if (LJIIZILJ == 0) {
            i = LJZL;
        } else {
            i = 0;
        }
        _$_findCachedViewById(R.id.h58).setPadding(0, i, 0, 0);
        MX7 wl = wl();
        Integer Gl2 = Gl();
        if (Gl2 == null || Gl2.intValue() != 1) {
            LJIIZILJ2 = Hl().LJIIZILJ();
        } else {
            LJIIZILJ2 = Dl().LJIIZILJ();
        }
        wl.LJLILLLLZI = LJIIZILJ2;
        MX7 wl2 = wl();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (DiggInfo diggInfo : list) {
                if (diggInfo.user != null) {
                    arrayList2.add(diggInfo);
                }
            }
            arrayList = ORZ.LLJILJILJ(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        wl2.setData(arrayList);
        this.LJZ = list;
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(8);
        if (list != null) {
            i2 = list.size();
        }
        C57053MaH.LIZ(i2);
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<DiggInfo> list, boolean z) {
        int LJIIZILJ;
        List arrayList;
        if (list == null || list.isEmpty() || !z) {
            wl().showLoadMoreEmpty();
            wl().setShowFooter(false);
        } else {
            wl().resetLoadMoreState();
        }
        MX7 wl = wl();
        Integer Gl = Gl();
        if (Gl == null || Gl.intValue() != 1) {
            LJIIZILJ = Hl().LJIIZILJ();
        } else {
            LJIIZILJ = Dl().LJIIZILJ();
        }
        wl.LJLILLLLZI = LJIIZILJ;
        MX7 wl2 = wl();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (DiggInfo diggInfo : list) {
                if (diggInfo.user != null) {
                    arrayList2.add(diggInfo);
                }
            }
            arrayList = ORZ.LLJILJILJ(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        wl2.addData(arrayList);
        this.LJZ = list;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        C57053MaH.LIZIZ(MXP.DETAIL_TYPE_LIKE_LIST, Al(), (String) this.LJLJJI.getValue());
        Integer Gl = Gl();
        if (Gl != null && Gl.intValue() == 1) {
            ((TextView) _$_findCachedViewById(R.id.lai)).setText(R.string.iyf);
        }
        AbstractC030109x itemAnimator = ((RecyclerView) _$_findCachedViewById(R.id.h5k)).getItemAnimator();
        o.LJII(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((AbstractC28931Bp) itemAnimator).LJI = false;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.h5k);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) _$_findCachedViewById(R.id.h5k)).LJII(new C116644hw(1, (int) KL2.LIZJ(getContext(), 1.0f), 0), -1);
        ((RecyclerView) _$_findCachedViewById(R.id.h5k)).LJIIJJI(new C73379Sr1(getContext()));
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.aej), new ACListenerS29S0100000_9(this, 184));
        String xl = xl();
        if (xl != null && xl.length() != 0) {
            wl().LJLJI = (UrlModel) this.LJLLI.getValue();
            wl().LJLJJI = (String) this.LJLLILLLL.getValue();
            wl().LJLJJL = (String) this.LJLL.getValue();
            MX7 wl = wl();
            AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(this, 1025);
            wl.getClass();
            wl.LJLJJLL = aqS159S0100000_9;
        }
        wl().setLoadMoreListener(this);
        wl().setShowFooter(true);
        wl().showLoadMoreEmpty();
        ((RecyclerView) _$_findCachedViewById(R.id.h5k)).setAdapter(wl());
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LJFF();
        vl();
        UserService.LIZ().LJFF().observe(this, new AObserverS77S0100000_9(this, 25));
        EventBus.LIZJ().LJIILJJIL(this);
    }

    public final void Il(User user, int i, String str) {
        String str2;
        String str3;
        DiggInfo diggInfo;
        String str4;
        String str5;
        Integer Gl = Gl();
        if (Gl == null || Gl.intValue() != 1) {
            str2 = "like";
        } else {
            str2 = "favorite";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", str);
        c188727au.LJIIIZ("enter_from", "notification_page");
        c188727au.LJIIIZ("account_type", str2);
        c188727au.LIZLLL(i, "client_order");
        c188727au.LJIIIZ("tab_name", (String) this.LJLLJ.getValue());
        Long l = null;
        if (user != null) {
            str3 = user.getUid();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("from_user_id", str3);
        c188727au.LJIIIZ("button_type", C221658mv.LIZ(getContext(), user));
        c188727au.LJIIIZ("group_id", xl());
        List<DiggInfo> list = this.LJZ;
        if (list != null) {
            Iterator<DiggInfo> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    diggInfo = it.next();
                    User user2 = diggInfo.user;
                    if (user2 != null) {
                        str4 = user2.getUid();
                    } else {
                        str4 = null;
                    }
                    if (user != null) {
                        str5 = user.getUid();
                    } else {
                        str5 = null;
                    }
                    if (o.LJ(str4, str5)) {
                        break;
                    }
                } else {
                    diggInfo = null;
                    break;
                }
            }
            DiggInfo diggInfo2 = diggInfo;
            if (diggInfo2 != null) {
                l = Long.valueOf(diggInfo2.timestamp);
            }
        }
        c188727au.LJFF(l, "message_time");
        c188727au.LJIIIZ("sort_option_name", (String) this.LJLLLLLL.getValue());
        c188727au.LJIIIZ("notification_tab_name", (String) this.LJLZ.getValue());
        if (C78685UuP.LJJJZ((String) this.LJLLLLLL.getValue())) {
            c188727au.LJI("sort_option_name", (String) this.LJLLLLLL.getValue());
        }
        if (C78685UuP.LJJJZ((String) this.LJLZ.getValue())) {
            c188727au.LJI("notification_tab_name", (String) this.LJLZ.getValue());
        }
        FMX.LJIIL("notification_message_folded_message", c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.rk, viewGroup, false);
        Context context = getContext();
        o.LJI(context);
        LLLLIILL.setPadding(0, C63081OpJ.LJJJJLI(context), 0, 0);
        Context context2 = LLLLIILL.getContext();
        o.LJIIIIZZ(context2, "view.context");
        LLLLIILL.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, context2));
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
