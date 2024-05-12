package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: X.VQb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79709VQb extends AnimatorListenerAdapter {
    public static final java.util.Map<String, Object> LJLILLLLZI;
    public final WeakReference<C79714VQg> LJLIL;

    static {
        HashMap hashMap = new HashMap();
        LJLILLLLZI = hashMap;
        hashMap.put("animation_type", "keyframe-animation");
        hashMap.put("animation_name", "");
    }

    public C79709VQb(C79714VQg c79714VQg) {
        this.LJLIL = new WeakReference<>(c79714VQg);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        if (animator != null) {
            C16880lQ.LJLJJI(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        String str;
        int i;
        super.onAnimationEnd(animator);
        C79714VQg c79714VQg = this.LJLIL.get();
        if (c79714VQg == null) {
            return;
        }
        C79713VQf c79713VQf = c79714VQg.LJIIIIZZ;
        if (c79713VQf != null) {
            str = c79713VQf.LJLIL;
        } else {
            str = "";
        }
        if (c79714VQg.LJII == VR0.RUNNING) {
            LynxUI LJI = c79714VQg.LJI();
            LIZIZ(LJI, "animationend", str);
            if (LJI != null) {
                LJI.onAnimationEnd(str);
            }
            c79714VQg.LJII = VR0.IDLE;
        }
        if (c79713VQf != null && (i = c79713VQf.LJLLILLLL) != 1 && i != 3) {
            c79714VQg.LJIIIZ();
        }
        c79714VQg.LJI = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        String str;
        super.onAnimationRepeat(animator);
        C79714VQg c79714VQg = this.LJLIL.get();
        if (c79714VQg == null) {
            return;
        }
        C79713VQf c79713VQf = c79714VQg.LJIIIIZZ;
        if (c79713VQf != null) {
            str = c79713VQf.LJLIL;
        } else {
            str = "";
        }
        LIZIZ(c79714VQg.LJI(), "animationiteration", str);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
    }

    public static void LIZIZ(LynxUI lynxUI, String str, String str2) {
        if (lynxUI != null && lynxUI.getEvents() != null && lynxUI.getEvents().containsKey(str)) {
            java.util.Map<String, Object> map = LJLILLLLZI;
            ((HashMap) map).put("animation_name", str2);
            lynxUI.mContext.LJLJJL.LIZIZ(new VNN(lynxUI.getSign(), str, map));
        }
    }
}
