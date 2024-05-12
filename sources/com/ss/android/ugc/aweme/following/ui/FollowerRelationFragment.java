package com.ss.android.ugc.aweme.following.ui;

import X.C117374j7;
import X.C221108m2;
import X.C53299Kvv;
import X.C53797L9l;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72905SjN;
import X.C72909SjR;
import X.C72912SjU;
import X.C72913SjV;
import X.C72914SjW;
import X.C72915SjX;
import X.C72919Sjb;
import X.C73156SnQ;
import X.C73305Spp;
import X.C73306Spq;
import X.C73343SqR;
import X.C73345SqT;
import X.C73353Sqb;
import X.C77266UUc;
import X.C8DP;
import X.C8VV;
import X.InterfaceC72447Sbz;
import X.InterfaceC92693kP;
import X.QD3;
import X.QX2;
import X.TBT;
import Y.AObserverS72S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS13S1101000_4;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import ujb.s;

/* loaded from: classes13.dex */
public final class FollowerRelationFragment extends BaseRelationFragment {
    public final lifecycleAwareLazy LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public FollowListAdapter LJLLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int Al() {
        return R.layout.c4c;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int Dl() {
        return R.string.pfo;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
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

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public FollowerRelationFragment() {
        AqS194S0100000_12 aqS194S0100000_12 = new AqS194S0100000_12(this, 127);
        C65776Prg LIZ = C65352Pkq.LIZ(FollowerRelationViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 579);
        this.LJLLI = new lifecycleAwareLazy(this, aqS162S0100000_12, new AqS72S0400000_12(this, aqS162S0100000_12, LIZ, aqS194S0100000_12, 16));
        C65776Prg LIZ2 = C65352Pkq.LIZ(FollowRelationTabViewModel.class);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ2, LIZ2, 141));
        this.LJLLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 578));
        this.LJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 577));
    }

    public final FollowerRelationViewModel Ml() {
        return (FollowerRelationViewModel) this.LJLLI.getValue();
    }

    public final InterfaceC72447Sbz Nl() {
        return (InterfaceC72447Sbz) this.LJLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void Jl() {
        InterfaceC72447Sbz Nl = Nl();
        if (Nl != null) {
            Nl.k0();
        }
        C73345SqT LIZ = C73353Sqb.LIZ();
        if (!LIZ.LIZLLL) {
            C73343SqR.LJFF(LIZ, LIZ.LJFF(), 7);
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void LJ() {
        Ml().LJLLL.refresh();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void LJJIJL() {
        InterfaceC72447Sbz Nl = Nl();
        if (Nl != null) {
            Nl.qy();
        }
        C73353Sqb.LIZ().LJII();
        C73353Sqb.LIZ().LJIIIZ(0L);
    }

    public final boolean Ol() {
        return ((Boolean) withState(Ml(), C72912SjU.LJLIL)).booleanValue();
    }

    public final void Pl() {
        ((C73305Spp) _$_findCachedViewById(R.id.kfg)).setVisibility(0);
        ((C73305Spp) _$_findCachedViewById(R.id.kfg)).setStatus((C73306Spq) this.LJLJLJ.getValue());
        if (C53299Kvv.LIZJ()) {
            ((C73305Spp) _$_findCachedViewById(R.id.kfg)).setLayoutVariant(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final String getEnterFrom() {
        if (Hl()) {
            return "fans";
        }
        return "other_fans";
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC92693kP interfaceC92693kP;
        super.onDestroy();
        String str = this.LJLILLLLZI;
        if (C53299Kvv.LIZ() == 3 && (interfaceC92693kP = (InterfaceC92693kP) ((Map) C53797L9l.LIZ.getValue()).get(str)) != null) {
            interfaceC92693kP.dispose();
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int wl() {
        if (Hl()) {
            return R.string.gki;
        }
        return R.string.gkj;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int xl() {
        Hl();
        return R.string.gkh;
    }

    @QD3
    public final void onAntiCrawlerEvent(QX2 event) {
        o.LJIIIZ(event, "event");
        String str = event.LJLIL;
        if (str != null) {
            if (s.LJJJLZIJ(str, "/aweme/v1/user/follower/list/?", false) || s.LJJJLZIJ(str, "/aweme/v1/user/following/list/?", false)) {
                EventBus.LIZJ().LIZIZ(event);
                LJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String str;
        String str2;
        int i2;
        String string;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (((Boolean) this.LJLLJ.getValue()).booleanValue()) {
            C8VV.LIZ(this, false, new AqS170S0100000_4(this, 872));
        }
        mo49getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.LLJJIII(1);
        ((RecyclerView) _$_findCachedViewById(R.id.j_9)).setLayoutManager(wrapLinearLayoutManager);
        ((RecyclerView) _$_findCachedViewById(R.id.j_9)).setItemAnimator(new C117374j7());
        C8DP.LIZ(8, (RecyclerView) _$_findCachedViewById(R.id.j_9));
        FollowListAdapter followListAdapter = new FollowListAdapter(this, "follower_relation", Hl(), ((FollowRelationTabViewModel) this.LJLLILLLL.getValue()).LJLJJLL);
        String str3 = this.LJLJJL;
        o.LJIIIZ(str3, "<set-?>");
        followListAdapter.LJLJLLL = str3;
        this.LJLLLL = followListAdapter;
        followListAdapter.setLoadEmptyText((CharSequence) null);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.j_9);
        FollowListAdapter followListAdapter2 = this.LJLLLL;
        if (followListAdapter2 != null) {
            recyclerView.setAdapter(followListAdapter2);
            FollowListAdapter followListAdapter3 = this.LJLLLL;
            if (followListAdapter3 != null) {
                followListAdapter3.setLoadMoreListener(new AqS162S0100000_12(this, 991));
                RecyclerView rv_list = (RecyclerView) _$_findCachedViewById(R.id.j_9);
                o.LJIIIIZZ(rv_list, "rv_list");
                new C72919Sjb(rv_list, new C72913SjV(this));
                FollowerRelationViewModel Ml = Ml();
                User user = this.LJLJI;
                if (user != null) {
                    i = user.historyMaxFollowerCount;
                } else {
                    i = -1;
                }
                Bundle arguments = getArguments();
                if (arguments != null) {
                    str = arguments.getString("nid");
                } else {
                    str = null;
                }
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    str2 = arguments2.getString("notice_uids");
                } else {
                    str2 = null;
                }
                String str4 = ((FollowRelationTabViewModel) this.LJLLILLLL.getValue()).LJLJJLL;
                Bundle arguments3 = getArguments();
                if (arguments3 != null && (string = arguments3.getString("merge_count")) != null) {
                    i2 = CastIntegerProtector.parseInt(string);
                } else {
                    i2 = 0;
                }
                Context context = getContext();
                Ml.LJLJL = i;
                Ml.LJLJLJ = str;
                Ml.LJLJLLL = str2;
                Ml.LJLL = str4;
                Ml.LJLLI = context;
                if (o.LJ(str4, "push")) {
                    Ml.withState(new AqS13S1101000_4(Ml, i, str2, 1));
                } else {
                    Ml.withState(new C72905SjN(str, Ml, i, str2, i2));
                }
                ListMiddleware<FollowerRelationState, Object, C72909SjR> listMiddleware = Ml().LJLLL;
                FollowListAdapter followListAdapter4 = this.LJLLLL;
                if (followListAdapter4 != null) {
                    ListMiddleware.LJIIIIZZ(listMiddleware, this, followListAdapter4, false, new C72914SjW(new AqS178S0100000_12(this, 324), new AqS194S0100000_12(this, 155), new AqS194S0100000_12(this, 156)), new C72915SjX(new AqS178S0100000_12(this, 329), new AqS194S0100000_12(this, 158), new AqS194S0100000_12(this, 160)), new AqS194S0100000_12(this, 161), new AqS186S0100000_4(this, 241), new AqS194S0100000_12(this, 163), 268);
                    C73156SnQ.LJIIIIZZ(this, Ml(), new TBT() { // from class: X.SjY
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((FollowerRelationState) obj).getListState();
                        }
                    }, new AqS194S0100000_12(this, 154));
                    if (!this.LJLJJI) {
                        Ml().LJLLL.refresh();
                    }
                    if (Hl()) {
                        C77266UUc.LIZIZ.getRelationService().LJ().observe(this, new AObserverS72S0100000_4(this, 24));
                    }
                    InterfaceC72447Sbz Nl = Nl();
                    RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.j_9);
                    if (Nl != null && recyclerView2 != null) {
                        Nl.lp(recyclerView2);
                    }
                    C73353Sqb.LIZ().LJII();
                    C73353Sqb.LIZ().LJIIIZ(0L);
                    return;
                }
                o.LJIJI("mFollowerListAdapter");
                throw null;
            }
            o.LJIJI("mFollowerListAdapter");
            throw null;
        }
        o.LJIJI("mFollowerListAdapter");
        throw null;
    }
}
