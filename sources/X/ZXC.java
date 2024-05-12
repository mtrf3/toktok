package X;

import Y.IDAListenerS240S0100000_24;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.HashSet;

/* loaded from: classes29.dex */
public final class ZXC implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ DialogC90914ZmA LJLIL;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.LJLIL.LLI.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        DialogC90914ZmA dialogC90914ZmA = this.LJLIL;
        java.util.Set<ZY4> set = dialogC90914ZmA.LLIIII;
        if (set != null && ((HashSet) set).size() != 0) {
            IDAListenerS240S0100000_24 iDAListenerS240S0100000_24 = new IDAListenerS240S0100000_24(dialogC90914ZmA, 0);
            int firstVisiblePosition = dialogC90914ZmA.LLI.getFirstVisiblePosition();
            boolean z = false;
            for (int i = 0; i < dialogC90914ZmA.LLI.getChildCount(); i++) {
                View childAt = dialogC90914ZmA.LLI.getChildAt(i);
                if (((HashSet) dialogC90914ZmA.LLIIII).contains(dialogC90914ZmA.LLIFFJFJJ.getItem(firstVisiblePosition + i))) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(dialogC90914ZmA.LLJILJILJ);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    if (!z) {
                        alphaAnimation.setAnimationListener(iDAListenerS240S0100000_24);
                        z = true;
                    }
                    childAt.clearAnimation();
                    childAt.startAnimation(alphaAnimation);
                }
            }
            return;
        }
        dialogC90914ZmA.LJJI(true);
    }

    public ZXC(DialogC90914ZmA dialogC90914ZmA) {
        this.LJLIL = dialogC90914ZmA;
    }
}
