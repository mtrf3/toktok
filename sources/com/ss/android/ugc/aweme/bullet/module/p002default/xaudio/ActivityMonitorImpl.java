package com.ss.android.ugc.aweme.bullet.module.p002default.xaudio;

import X.C16880lQ;
import X.C221108m2;
import X.C5H3;
import X.C80071Vbf;
import X.C81173VtR;
import X.C81174VtS;
import X.C81175VtT;
import X.EF7;
import X.InterfaceC63764P0u;
import X.InterfaceC80020Vaq;
import X.InterfaceC81172VtQ;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class ActivityMonitorImpl implements InterfaceC80020Vaq, InterfaceC63764P0u {
    public final C5H3 mListeners$delegate = C221108m2.LIZIZ(C81173VtR.LJLIL);

    private final C80071Vbf<InterfaceC81172VtQ> getMListeners() {
        return (C80071Vbf) this.mListeners$delegate.getValue();
    }

    public ActivityMonitorImpl() {
        ActivityStack.addAppBackGroundListener(this);
    }

    @Override // X.InterfaceC80020Vaq
    public boolean isAppBackground() {
        return ActivityStack.isAppBackGround();
    }

    @Override // X.InterfaceC63764P0u
    public void onAppBackground() {
        getMListeners().LIZIZ(C81174VtS.LJLIL);
    }

    @Override // X.InterfaceC63764P0u
    public void onAppForeground() {
        getMListeners().LIZIZ(C81175VtT.LJLIL);
    }

    @Override // X.InterfaceC80020Vaq
    public void pullAppToForeground() {
        Context LIZIZ = EF7.LIZIZ();
        Object LLILL = C16880lQ.LLILL(LIZIZ, "activity");
        o.LJII(LLILL, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) LLILL;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            activityManager.moveTaskToFront(topActivity.getTaskId(), 0);
            return;
        }
        Intent launchIntentForPackage = LIZIZ.getPackageManager().getLaunchIntentForPackage(LIZIZ.getPackageName());
        if (launchIntentForPackage == null) {
            return;
        }
        C16880lQ.LIZJ(LIZIZ, launchIntentForPackage);
    }

    @Override // X.InterfaceC80020Vaq
    public void addAppVisibilityChangeListener(InterfaceC81172VtQ listener) {
        o.LJIIIZ(listener, "listener");
        getMListeners().LIZ(listener);
    }

    @Override // X.InterfaceC80020Vaq
    public void removeAppVisibilityChangeListener(InterfaceC81172VtQ listener) {
        o.LJIIIZ(listener, "listener");
        getMListeners().LIZJ(listener);
    }
}
