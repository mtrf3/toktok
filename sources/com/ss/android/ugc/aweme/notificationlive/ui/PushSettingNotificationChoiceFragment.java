package com.ss.android.ugc.aweme.notificationlive.ui;

import X.C117374j7;
import X.C19N;
import X.C26073ALd;
import X.C26412AYe;
import X.C26413AYf;
import X.C61878OQg;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72909SjR;
import X.C81334Vw2;
import X.HG3;
import X.RBX;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.following.ui.BaseRelationFragment;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS64S0400000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PushSettingNotificationChoiceFragment extends BaseRelationFragment {
    public final User LJLLI;
    public boolean LJLLILLLL;
    public final lifecycleAwareLazy LJLLJ;
    public PushSettingFollowListAdapter LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int Al() {
        return R.layout.c4u;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int Dl() {
        return R.string.pfn;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
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
        return false;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int wl() {
        return R.string.gkx;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int xl() {
        return R.string.gks;
    }

    public PushSettingNotificationChoiceFragment() {
        User user;
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null) {
            user = ((RBX) LJIILL).getCurUser();
        } else {
            user = null;
        }
        this.LJLLI = user;
        AqS186S0100000_4 aqS186S0100000_4 = new AqS186S0100000_4(this, 126);
        C65776Prg LIZ = C65352Pkq.LIZ(PushSettingNotificationChoiceViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 488);
        this.LJLLJ = new lifecycleAwareLazy(this, aqS154S0100000_4, new AqS64S0400000_4(this, aqS154S0100000_4, LIZ, aqS186S0100000_4, 14));
    }

    public final PushSettingNotificationChoiceViewModel Ml() {
        return (PushSettingNotificationChoiceViewModel) this.LJLLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void LJ() {
        Ml().LJLL.refresh();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        boolean z;
        super.onResume();
        LiveOuterService.LJJJLL().LJJIZ().LJJJZ().getClass();
        if (C26073ALd.LIZ() && C26073ALd.LIZLLL()) {
            z = true;
        } else {
            z = false;
        }
        PushSettingNotificationChoiceViewModel Ml = Ml();
        Ml.getClass();
        Ml.setState(new AqS9S0010000_4(z, 63));
        if (Ml().LJLJLLL) {
            Ml().LJLL.LJIIIZ(C61878OQg.INSTANCE);
            Ml().LJLL.refresh();
            Ml().LJLJLLL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((C81334Vw2) _$_findCachedViewById(R.id.kb5)).setEnabled(false);
        mo49getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.LLJJIII(1);
        ((RecyclerView) _$_findCachedViewById(R.id.j_9)).setLayoutManager(wrapLinearLayoutManager);
        ((RecyclerView) _$_findCachedViewById(R.id.j_9)).setItemAnimator(new C117374j7());
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("enter_from")) == null) {
            str = "settings_page";
        }
        PushSettingFollowListAdapter pushSettingFollowListAdapter = new PushSettingFollowListAdapter(this, str);
        o.LJIIIZ(this.LJLJJL, "<set-?>");
        this.LJLLL = pushSettingFollowListAdapter;
        pushSettingFollowListAdapter.setLoadEmptyText((CharSequence) null);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.j_9);
        PushSettingFollowListAdapter pushSettingFollowListAdapter2 = this.LJLLL;
        if (pushSettingFollowListAdapter2 != null) {
            recyclerView.setAdapter(pushSettingFollowListAdapter2);
            PushSettingFollowListAdapter pushSettingFollowListAdapter3 = this.LJLLL;
            if (pushSettingFollowListAdapter3 != null) {
                pushSettingFollowListAdapter3.setLoadMoreListener(new AqS154S0100000_4(this, 1231));
                ListMiddleware<NotificationChoiceState, Object, C72909SjR> listMiddleware = Ml().LJLL;
                PushSettingFollowListAdapter pushSettingFollowListAdapter4 = this.LJLLL;
                if (pushSettingFollowListAdapter4 != null) {
                    ListMiddleware.LJIIIIZZ(listMiddleware, this, pushSettingFollowListAdapter4, false, new C26412AYe(new AqS170S0100000_4(this, 1447), new AqS186S0100000_4(this, 326), new AqS186S0100000_4(this, 327)), new C26413AYf(new AqS170S0100000_4(this, 1449), new AqS186S0100000_4(this, 328), new AqS186S0100000_4(this, 329)), new AqS186S0100000_4(this, 330), null, null, 908);
                    if (!this.LJLJJI) {
                        Ml().LJLL.refresh();
                    }
                    Integer LIZIZ = C19N.LIZIZ(view, "view.context", R.attr.c9);
                    if (LIZIZ != null) {
                        view.setBackgroundColor(LIZIZ.intValue());
                        return;
                    }
                    return;
                }
                o.LJIJI("mPushSettingFollowListAdapter");
                throw null;
            }
            o.LJIJI("mPushSettingFollowListAdapter");
            throw null;
        }
        o.LJIJI("mPushSettingFollowListAdapter");
        throw null;
    }
}
