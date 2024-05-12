package X;

import android.animation.Animator;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TgJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75263TgJ implements InterfaceC75260TgG {
    public boolean LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C75265TgL.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C75264TgK.LJLIL);

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // X.InterfaceC75260TgG
    public final void release() {
        this.LJLIL = true;
        LIZIZ().clear();
    }

    public final List<JBM> LIZIZ() {
        return (List) this.LJLILLLLZI.getValue();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        JBM jbm;
        o.LJIIIZ(animation, "animation");
        Iterator<JBM> it = LIZIZ().iterator();
        while (true) {
            if (it.hasNext()) {
                jbm = it.next();
                if (jbm.LIZ == animation) {
                    break;
                }
            } else {
                jbm = null;
                break;
            }
        }
        JBM jbm2 = jbm;
        if (jbm2 != null) {
            InterfaceC75262TgI interfaceC75262TgI = (InterfaceC75262TgI) ((java.util.Map) this.LJLJI.getValue()).remove(jbm2.LIZIZ);
            if (interfaceC75262TgI != null) {
                interfaceC75262TgI.LIZIZ(jbm2);
            }
            LIZIZ().remove(jbm2);
        }
    }

    @Override // X.InterfaceC75260TgG
    public final void LIZ(JBM jbm, InterfaceC75262TgI animationCallBack) {
        o.LJIIIZ(animationCallBack, "animationCallBack");
        if (this.LJLIL) {
            animationCallBack.LIZ(jbm, 3);
        }
        if (jbm.LIZ == null) {
            animationCallBack.LIZ(jbm, 2);
            return;
        }
        String id = jbm.LIZIZ;
        o.LJIIIZ(id, "id");
        Iterator<JBM> it = LIZIZ().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JBM next = it.next();
            if (TextUtils.equals(id, next.LIZIZ)) {
                if (next != null) {
                    animationCallBack.LIZ(jbm, 1);
                    return;
                }
            }
        }
        LIZIZ().add(jbm);
        ((java.util.Map) this.LJLJI.getValue()).put(jbm.LIZIZ, animationCallBack);
        jbm.LIZ.setStartDelay(jbm.LIZJ);
        C16880lQ.LJLJLJ(this, jbm.LIZ);
        jbm.LIZ.addListener(this);
        jbm.LIZ.start();
    }
}
