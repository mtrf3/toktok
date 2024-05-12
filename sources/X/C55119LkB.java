package X;

import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;

/* renamed from: X.LkB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55119LkB implements InterfaceC55739LuB {
    @Override // X.InterfaceC55739LuB
    public final boolean isNewUser() {
        return false;
    }

    @Override // X.InterfaceC55739LuB
    public final void LJJJLZIJ(Fragment fragment) {
        RecommendFeedFragmentPanel recommendFeedFragmentPanel;
        C73340SqO.LJIJJLI().getClass();
        if (!(fragment instanceof FeedRecommendFragment) || (recommendFeedFragmentPanel = ((FeedRecommendFragment) fragment).LJLL) == null || recommendFeedFragmentPanel.getAdapter() == null) {
            return;
        }
        InterfaceC55062LjG adapter = recommendFeedFragmentPanel.getAdapter();
        SystemClock.elapsedRealtime();
        if (adapter.Q8() != null) {
            Aweme aweme = null;
            for (Aweme aweme2 : adapter.Q8()) {
                if (aweme2.getAwemeType() == 329) {
                    aweme = aweme2;
                }
            }
            if (aweme != null) {
                int indexOf = adapter.Q8().indexOf(aweme);
                recommendFeedFragmentPanel.getAdapter().LJ(indexOf);
                recommendFeedFragmentPanel.getViewPager().setmCurItem(-1);
                recommendFeedFragmentPanel.setCurrentItem(indexOf, false);
            }
        }
        SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC55739LuB
    public final void LJII(String str, boolean z) {
        if (z) {
            C56662Kg.LIZ().LIZJ("cold_boot_aweme_splash_init", false);
        } else {
            C56662Kg.LIZ().LJFF("cold_boot_aweme_splash_init", false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0282  */
    @Override // X.InterfaceC55739LuB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJLI(androidx.fragment.app.Fragment r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55119LkB.LJIJJLI(androidx.fragment.app.Fragment, boolean):boolean");
    }
}
