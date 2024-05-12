package com.ss.android.ugc.aweme.feed.ui;

import X.ActivityC45651qj;
import X.C38816FLg;
import X.C54029LIj;
import X.C54153LNd;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55406Loo;
import X.LIJ;
import Y.ARunnableS12S0100100_3;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tiktok.homepage.mainfragment.XTabAbility;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;

/* loaded from: classes10.dex */
public abstract class FeedFragment extends AmeBaseFragment {
    public final String LJLIL = "FeedFragment";
    public long LJLILLLLZI = -1;
    public String LJLJI;
    public int LJLJJI;
    public AbsFragment LJLJJL;
    public String LJLJJLL;

    public abstract void Gz();

    public String getEnterFrom() {
        return null;
    }

    public void rY(KeyEvent keyEvent) {
    }

    public abstract boolean ub(boolean z);

    public XTabAbility vl() {
        return null;
    }

    public void Al() {
        boolean z;
        if (!getUserVisibleHint()) {
            return;
        }
        if (C54153LNd.LIZ(mo49getActivity()) || (this instanceof LIJ) || "homepage_nearby".equals(this.LJLJI) || "homepage_explore".equals(this.LJLJI)) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJLILLLLZI == -1 && z) {
            this.LJLILLLLZI = System.currentTimeMillis();
        }
    }

    public void Dl() {
        if (getUserVisibleHint() && this.LJLILLLLZI != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJLILLLLZI;
            if (currentTimeMillis > 0) {
                C38816FLg.LJ(new ARunnableS12S0100100_3(this, currentTimeMillis, 1));
            }
            this.LJLILLLLZI = -1L;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Dl();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Al();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    public final void qQ(boolean z) {
        MainPageBusinessAbility mainPageBusinessAbility;
        if (!getUserVisibleHint()) {
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (!(mo49getActivity instanceof ActivityC45651qj) || (mainPageBusinessAbility = (MainPageBusinessAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(mo49getActivity, null), MainPageBusinessAbility.class, null)) == null) {
            return;
        }
        mainPageBusinessAbility.qQ(false);
    }

    public void wl(boolean z) {
        Dl();
    }

    public final void xl(long j) {
        int i;
        if (TextUtils.equals(this.LJLJI, "homepage_friends")) {
            i = C54029LIj.LIZIZ.LJIILIIL();
        } else {
            i = 0;
        }
        C55406Loo c55406Loo = new C55406Loo();
        c55406Loo.LJJL = String.valueOf(j);
        c55406Loo.LJJLIIIJLLLLLLLZ = i;
        c55406Loo.LIZLLL = this.LJLJI;
        c55406Loo.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.LJLJJI = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 0);
        this.LJLJI = arguments.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_hot");
        arguments.getString("extra_follow_type", "extra_follow_type_follow");
    }
}
