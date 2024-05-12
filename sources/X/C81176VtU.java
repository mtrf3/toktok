package X;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* renamed from: X.VtU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81176VtU implements InterfaceC80020Vaq, InterfaceC63764P0u {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C81180VtY.LJLIL);

    @Override // X.InterfaceC63764P0u
    public final void onAppBackground() {
        ((C80071Vbf) this.LJLIL.getValue()).LIZIZ(C81181VtZ.LJLIL);
    }

    @Override // X.InterfaceC63764P0u
    public final void onAppForeground() {
        ((C80071Vbf) this.LJLIL.getValue()).LIZIZ(C81182Vta.LJLIL);
    }

    @Override // X.InterfaceC80020Vaq
    public final void pullAppToForeground() {
        boolean z = C84763XOl.LJIIJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pullAppToForeground: isAppBackground(");
        LIZ.append(z);
        LIZ.append(')');
        X1D.LIZIZ(LIZ);
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
            if (launchIntentForPackage == null) {
                return;
            }
            C16880lQ.LIZJ(LIZIZ, launchIntentForPackage);
        }
    }

    public C81176VtU() {
        ActivityStack.addAppBackGroundListener(this);
    }

    @Override // X.InterfaceC80020Vaq
    public final boolean isAppBackground() {
        return ActivityStack.isAppBackGround();
    }

    @Override // X.InterfaceC80020Vaq
    public final void addAppVisibilityChangeListener(InterfaceC81172VtQ listener) {
        o.LJIIIZ(listener, "listener");
        ((C80071Vbf) this.LJLIL.getValue()).LIZ(listener);
    }

    @Override // X.InterfaceC80020Vaq
    public final void removeAppVisibilityChangeListener(InterfaceC81172VtQ listener) {
        o.LJIIIZ(listener, "listener");
        ((C80071Vbf) this.LJLIL.getValue()).LIZJ(listener);
    }
}
