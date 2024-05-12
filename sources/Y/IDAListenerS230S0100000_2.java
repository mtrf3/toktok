package Y;

import X.DialogC134805Qu;
import X.InterfaceC1278950f;
import X.InterfaceC134705Qk;
import android.view.View;
import android.view.animation.Animation;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDAListenerS230S0100000_2 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(IDAListenerS230S0100000_2 iDAListenerS230S0100000_2, Animation animation) {
    }

    public static final void onAnimationStart$0(IDAListenerS230S0100000_2 iDAListenerS230S0100000_2, Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animation);
                return;
            case 1:
                o.LJIIIZ(animation, "animation");
                return;
            case 2:
                onAnimationEnd$2(this, animation);
                return;
            case 3:
                onAnimationEnd$3(this, animation);
                return;
            case 4:
                onAnimationEnd$4(this, animation);
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
                o.LJIIIZ(animation, "animation");
                return;
            case 2:
                o.LJIIIZ(animation, "animation");
                return;
            case 3:
                o.LJIIIZ(animation, "animation");
                return;
            case 4:
                o.LJIIIZ(animation, "animation");
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
                o.LJIIIZ(animation, "animation");
                return;
            case 3:
                onAnimationStart$3(this, animation);
                return;
            case 4:
                o.LJIIIZ(animation, "animation");
                return;
            default:
                return;
        }
    }

    public IDAListenerS230S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(IDAListenerS230S0100000_2 iDAListenerS230S0100000_2, Animation animation) {
        InterfaceC1278950f interfaceC1278950f = ((EditorProScene) iDAListenerS230S0100000_2.l0).previewPanel;
        if (interfaceC1278950f != null) {
            interfaceC1278950f.ol0(false);
        }
    }

    public static final void onAnimationEnd$2(IDAListenerS230S0100000_2 iDAListenerS230S0100000_2, Animation animation) {
        o.LJIIIZ(animation, "animation");
        ((View) iDAListenerS230S0100000_2.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$3(IDAListenerS230S0100000_2 iDAListenerS230S0100000_2, Animation animation) {
        o.LJIIIZ(animation, "animation");
        InterfaceC134705Qk interfaceC134705Qk = ((DialogC134805Qu) iDAListenerS230S0100000_2.l0).LJLLLL;
        if (interfaceC134705Qk != null) {
            interfaceC134705Qk.LLLLLZIL(null, true);
        }
    }

    public static final void onAnimationEnd$4(IDAListenerS230S0100000_2 iDAListenerS230S0100000_2, Animation animation) {
        View view;
        o.LJIIIZ(animation, "animation");
        InterfaceC134705Qk interfaceC134705Qk = ((DialogC134805Qu) iDAListenerS230S0100000_2.l0).LJLLLLLL;
        if (interfaceC134705Qk == null || (view = interfaceC134705Qk.getView()) == null) {
            return;
        }
        view.setVisibility(8);
    }

    public static final void onAnimationStart$1(IDAListenerS230S0100000_2 iDAListenerS230S0100000_2, Animation animation) {
        o.LJIIIZ(animation, "animation");
        ((View) iDAListenerS230S0100000_2.l0).setVisibility(0);
    }

    public static final void onAnimationStart$3(IDAListenerS230S0100000_2 iDAListenerS230S0100000_2, Animation animation) {
        View view;
        o.LJIIIZ(animation, "animation");
        InterfaceC134705Qk interfaceC134705Qk = ((DialogC134805Qu) iDAListenerS230S0100000_2.l0).LJLLLLLL;
        if (interfaceC134705Qk == null || (view = interfaceC134705Qk.getView()) == null) {
            return;
        }
        view.setVisibility(0);
    }
}
