package com.ss.android.ugc.aweme.search.pages.result.usersearch.core.ui;

import X.AbstractC49793JgT;
import X.C1A7;
import X.C31633CbF;
import X.C49396Ja4;
import X.C49815Jgp;
import X.C49917JiT;
import X.C50605JtZ;
import X.C77266UUc;
import X.InterfaceC51691KQl;
import X.InterfaceC57288Me4;
import X.JZU;
import X.QD3;
import android.view.View;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchUserFragment extends SearchOriginalFragment<SearchUser> implements InterfaceC57288Me4 {
    public InterfaceC51691KQl LLJJL;
    public final Map<Integer, View> LLJL = new LinkedHashMap();
    public final boolean LLJJLIIIJLLLLLLLZ = true;

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String Jl() {
        return "user";
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC57288Me4
    public final void onResponseSuccess(FollowStatus followStatus) {
    }

    public SearchUserFragment() {
        this.LJLLLLLL = C50605JtZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void ym() {
        this.LLILL = new C49396Ja4(this.LJLLILLLL, Ll(), new JZU(this), this, "search_result");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void zm() {
        this.LLJJJJJIL = new C49815Jgp();
        tn().LJJI(this);
        InterfaceC51691KQl followPresenter = C77266UUc.LIZIZ.getFollowPresenter();
        this.LLJJL = followPresenter;
        o.LJI(followPresenter);
        followPresenter.LJIIIIZZ(this);
        C49917JiT<?> tn = tn();
        tn.LJLJJL = this;
        T t = tn.LJLIL;
        if (t != 0) {
            ((AbstractC49793JgT) t).LJLJL = sa();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC51691KQl interfaceC51691KQl = this.LLJJL;
        if (interfaceC51691KQl != null) {
            o.LJI(interfaceC51691KQl);
            interfaceC51691KQl.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final boolean wl() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC57288Me4
    public final void onFollowFail(Exception exc) {
        if (!isViewValid()) {
            return;
        }
        C1A7.LJIJJLI(getContext(), exc, R.string.gjc);
    }

    @QD3
    public final void onFollowStatus(FollowStatusEvent event) {
        o.LJIIIZ(event, "event");
        pn(event.status);
    }

    @Override // X.InterfaceC57288Me4
    public final void onFollowSuccess(FollowStatus followStatus) {
        isViewValid();
    }

    @QD3
    public final void onProfileFollowEvent(C31633CbF event) {
        o.LJIIIZ(event, "event");
        Object obj = event.LJLILLLLZI;
        if (!(obj instanceof User)) {
            return;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
        new FollowStatus();
        ((User) obj).getUid();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC223218pR
    public final void j0(List<? extends SearchUser> list, boolean z) {
        super.j0(list, ((C49815Jgp) tn()).LJIILLIIL());
    }
}
