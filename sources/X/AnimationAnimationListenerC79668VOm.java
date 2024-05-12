package X;

import android.graphics.Rect;
import android.view.animation.Animation;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.lang.ref.WeakReference;

/* renamed from: X.VOm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class AnimationAnimationListenerC79668VOm implements Animation.AnimationListener {
    public final WeakReference<C79669VOn> LIZ;
    public final String LIZIZ;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        LynxUI LJI;
        C79669VOn c79669VOn = this.LIZ.get();
        if (c79669VOn == null || (LJI = c79669VOn.LJI()) == null) {
            return;
        }
        T t = LJI.mView;
        c79669VOn.LJII(this.LIZIZ);
        String str = this.LIZIZ;
        if (str == "layout-animation-create" || str == "layout-animation-update") {
            if (animation instanceof VOS) {
                c79669VOn.LJIL.remove(LJI.getSign());
                return;
            } else {
                if (!(animation instanceof C79674VOs) || !c79669VOn.LJJI) {
                    return;
                }
                if (t != 0) {
                    t.setLayerType(0, null);
                }
                c79669VOn.LJJI = false;
                return;
            }
        }
        if (str != "layout-animation-delete") {
            return;
        }
        if ((animation instanceof C79674VOs) && c79669VOn.LJJI) {
            t.setLayerType(0, null);
            c79669VOn.LJJI = false;
        }
        LJI.updateLayout(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, new Rect());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        LynxUI LJI;
        C79669VOn c79669VOn = this.LIZ.get();
        if (c79669VOn == null || (LJI = c79669VOn.LJI()) == null) {
            return;
        }
        T t = LJI.mView;
        C79667VOl.LIZ(LJI, "animationstart", this.LIZIZ);
        String str = this.LIZIZ;
        if (str == "layout-animation-create" || str == "layout-animation-update") {
            if (animation instanceof VOS) {
                c79669VOn.LJIL.put(LJI.getSign(), animation);
                return;
            } else {
                if (!(animation instanceof C79674VOs) || t.getLayerType() != 0) {
                    return;
                }
                c79669VOn.LJJI = true;
                t.setLayerType(2, null);
                return;
            }
        }
        if (str != "layout-animation-delete" || !(animation instanceof C79674VOs) || t.getLayerType() != 0) {
            return;
        }
        c79669VOn.LJJI = true;
        t.setLayerType(2, null);
    }

    public AnimationAnimationListenerC79668VOm(C79669VOn c79669VOn, String str) {
        this.LIZ = new WeakReference<>(c79669VOn);
        this.LIZIZ = str;
    }
}
