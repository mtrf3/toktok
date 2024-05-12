package com.ss.android.ugc.aweme.friendstab.preload;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C54029LIj;
import X.C62822Ol8;
import X.C73411SrX;
import X.HG3;
import X.LAG;
import X.LI7;
import X.LID;
import X.LIE;
import X.LTD;
import X.RBX;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;

/* loaded from: classes10.dex */
public final class FriendsFeedPreloadPolling implements GenericLifecycleObserver {
    public static C73411SrX LJLILLLLZI;
    public static final FriendsFeedPreloadPolling LJLIL = new FriendsFeedPreloadPolling();
    public static final C62822Ol8 LJLJI = C221108m2.LIZIZ(LAG.LJLIL);
    public static final C62822Ol8 LJLJJI = C221108m2.LIZIZ(LIE.LJLIL);
    public static final C62822Ol8 LJLJJL = C221108m2.LIZIZ(LID.LJLIL);
    public static boolean LJLJJLL = true;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            onForeground();
        }
    }

    public final boolean LIZ() {
        long j = LTD.LJLILLLLZI;
        if (j == 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis > LIZIZ() || LIZIZ() - currentTimeMillis <= 10000) {
            return false;
        }
        return true;
    }

    public final long LIZIZ() {
        return ((Number) LJLJI.getValue()).longValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onForeground() {
        if (LJLJJLL) {
            LJLJJLL = false;
            return;
        }
        if (((RBX) HG3.LJIILL()).isLogin() && !((Boolean) LJLJJI.getValue()).booleanValue() && ((Boolean) LJLJJL.getValue()).booleanValue() && !LIZ()) {
            ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
            if (LIZLLL != null) {
                try {
                    if (Hox.LJLLI.LIZ(LIZLLL).Ja("FRIENDS_FEED") != null) {
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            C54029LIj.LIZIZ.LJJIIZI(LI7.COMPENSATE_BY_FOREGROUND.getScene(), "");
        }
    }
}
