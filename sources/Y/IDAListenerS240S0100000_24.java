package Y;

import X.C90591Zgx;
import X.DialogC90863ZlL;
import X.DialogC90914ZmA;
import X.ZX6;
import X.ZX7;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes29.dex */
public class IDAListenerS240S0100000_24 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationEnd$1(IDAListenerS240S0100000_24 iDAListenerS240S0100000_24, Animation animation) {
    }

    public static final void onAnimationRepeat$0(IDAListenerS240S0100000_24 iDAListenerS240S0100000_24, Animation animation) {
    }

    public static final void onAnimationRepeat$1(IDAListenerS240S0100000_24 iDAListenerS240S0100000_24, Animation animation) {
    }

    public static final void onAnimationRepeat$2(IDAListenerS240S0100000_24 iDAListenerS240S0100000_24, Animation animation) {
    }

    public static final void onAnimationStart$0(IDAListenerS240S0100000_24 iDAListenerS240S0100000_24, Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animation);
                return;
            case 1:
                onAnimationEnd$1(this, animation);
                return;
            case 2:
                onAnimationEnd$2(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animation);
                return;
            case 1:
                onAnimationRepeat$1(this, animation);
                return;
            case 2:
                onAnimationRepeat$2(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animation);
                return;
            case 1:
                onAnimationStart$1(this, animation);
                return;
            case 2:
                onAnimationStart$2(this, animation);
                return;
            default:
                return;
        }
    }

    public IDAListenerS240S0100000_24(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(IDAListenerS240S0100000_24 iDAListenerS240S0100000_24, Animation animation) {
        ((DialogC90914ZmA) iDAListenerS240S0100000_24.l0).LJJI(true);
    }

    public static final void onAnimationEnd$2(IDAListenerS240S0100000_24 iDAListenerS240S0100000_24, Animation animation) {
        DialogC90863ZlL dialogC90863ZlL = ((C90591Zgx) iDAListenerS240S0100000_24.l0).LJLL;
        dialogC90863ZlL.LLD = false;
        dialogC90863ZlL.LJJIIJ();
    }

    public static final void onAnimationStart$1(IDAListenerS240S0100000_24 iDAListenerS240S0100000_24, Animation animation) {
        ZX7 zx7 = ((DialogC90914ZmA) iDAListenerS240S0100000_24.l0).LLI;
        Iterator it = ((ArrayList) zx7.LJLIL).iterator();
        while (it.hasNext()) {
            ZX6 zx6 = (ZX6) it.next();
            if (!zx6.LJIIJ) {
                zx6.LJIIIZ = zx7.getDrawingTime();
                zx6.LJIIJ = true;
            }
        }
        DialogC90914ZmA dialogC90914ZmA = (DialogC90914ZmA) iDAListenerS240S0100000_24.l0;
        dialogC90914ZmA.LLI.postDelayed(dialogC90914ZmA.LLJJIJIIJIL, dialogC90914ZmA.LLJILJIL);
    }

    public static final void onAnimationStart$2(IDAListenerS240S0100000_24 iDAListenerS240S0100000_24, Animation animation) {
        ((C90591Zgx) iDAListenerS240S0100000_24.l0).LJLL.LLD = true;
    }
}
