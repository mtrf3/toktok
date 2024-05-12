package com.ss.android.ugc.aweme.audiomode.fullepisodev2.notification;

import X.C16880lQ;
import X.C221108m2;
import X.C5H3;
import X.C80071Vbf;
import X.C81177VtV;
import X.C81178VtW;
import X.C81179VtX;
import X.C84763XOl;
import X.EF7;
import X.InterfaceC63764P0u;
import X.InterfaceC80020Vaq;
import X.InterfaceC81172VtQ;
import X.X1D;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class IActivityMonitorImpl implements InterfaceC80020Vaq, InterfaceC63764P0u {
    public final C5H3 listeners$delegate = C221108m2.LIZIZ(C81177VtV.LJLIL);

    private final void printLog(String str) {
    }

    private final C80071Vbf<InterfaceC81172VtQ> getListeners() {
        return (C80071Vbf) this.listeners$delegate.getValue();
    }

    @Override // X.InterfaceC80020Vaq
    public void pullAppToForeground() {
        boolean z = C84763XOl.LJIIJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pullAppToForeground: isAppBackground(");
        LIZ.append(z);
        LIZ.append(')');
        printLog(X1D.LIZIZ(LIZ));
        if (z) {
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
            if (launchIntentForPackage != null) {
                C16880lQ.LIZJ(LIZIZ, launchIntentForPackage);
            } else {
                printLog("Pull app to foreground failed.");
            }
        }
    }

    public IActivityMonitorImpl() {
        ActivityStack.addAppBackGroundListener(this);
    }

    @Override // X.InterfaceC80020Vaq
    public boolean isAppBackground() {
        return ActivityStack.isAppBackGround();
    }

    @Override // X.InterfaceC63764P0u
    public void onAppBackground() {
        getListeners().LIZIZ(C81178VtW.LJLIL);
    }

    @Override // X.InterfaceC63764P0u
    public void onAppForeground() {
        getListeners().LIZIZ(C81179VtX.LJLIL);
    }

    @Override // X.InterfaceC80020Vaq
    public void addAppVisibilityChangeListener(InterfaceC81172VtQ listener) {
        o.LJIIIZ(listener, "listener");
        getListeners().LIZ(listener);
    }

    @Override // X.InterfaceC80020Vaq
    public void removeAppVisibilityChangeListener(InterfaceC81172VtQ listener) {
        o.LJIIIZ(listener, "listener");
        getListeners().LIZJ(listener);
    }
}
