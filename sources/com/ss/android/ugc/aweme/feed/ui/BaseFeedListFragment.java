package com.ss.android.ugc.aweme.feed.ui;

import X.C141335gf;
import X.C2K0;
import X.C2MA;
import X.C3C5;
import X.C55096Ljo;
import X.C55230Lly;
import X.C76800UCe;
import X.KR8;
import X.L2H;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.fragment.IHomeFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class BaseFeedListFragment extends FeedFragment {
    public HomeFeedComponent LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    public abstract HomeFeedComponent Gl();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    public final HomeFeedComponent Hl() {
        if (this.LJLJL == null) {
            if (L2H.LIZ()) {
                HomeFeedComponent homeFeedComponent = null;
                C2K0 LIZ = C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), IFeedFragmentAbility.class, null);
                if (!(LIZ instanceof IHomeFeedFragmentAbility)) {
                    LIZ = null;
                }
                IHomeFeedFragmentAbility iHomeFeedFragmentAbility = (IHomeFeedFragmentAbility) LIZ;
                if (iHomeFeedFragmentAbility instanceof HomeFeedComponent) {
                    homeFeedComponent = (HomeFeedComponent) iHomeFeedFragmentAbility;
                }
                this.LJLJL = homeFeedComponent;
            } else {
                HomeFeedComponent Gl = Gl();
                Gl.LJLJJL = this;
                this.LJLJL = Gl;
            }
        }
        return this.LJLJL;
    }

    public final ILoadMoreAbility PZ() {
        HomeFeedComponent Hl = Hl();
        if (Hl != null) {
            return Hl.LJLJLLL;
        }
        return null;
    }

    public final IPageStateAbility RP() {
        HomeFeedComponent Hl = Hl();
        if (Hl != null) {
            return Hl.LJLJLJ;
        }
        return null;
    }

    public final IRefreshAbility YE() {
        HomeFeedComponent Hl = Hl();
        if (Hl != null) {
            return Hl.LJLL;
        }
        return null;
    }

    public final C2MA m30() {
        HomeFeedComponent Hl = Hl();
        if (Hl != null) {
            return Hl.m30();
        }
        return null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        RootPanelComponent LIZIZ = KR8.LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.LLLIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        RootPanelComponent LIZIZ = KR8.LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.LJLLILLLL();
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        HomeFeedComponent Hl;
        o.LJIIIZ(activity, "activity");
        KR8.LJIIIIZZ(this);
        if (!L2H.LIZ() && (Hl = Hl()) != null && !L2H.LIZ()) {
            Hl.x3(this);
        }
        RootPanelComponent LIZIZ = KR8.LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.j(activity, this);
        }
        super.onAttach(activity);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RootPanelComponent LIZIZ = KR8.LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.N1(bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public boolean ub(boolean z) {
        IRefreshAbility YE = YE();
        if (YE != null) {
            return YE.ub(z);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RootPanelComponent LIZIZ = KR8.LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.LJJJJI(view, bundle);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        try {
            C3C5.m7constructorimpl(C76800UCe.LIZ);
            return null;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return null;
        }
    }
}
