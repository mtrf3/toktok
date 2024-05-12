package X;

import android.animation.Animator;
import android.graphics.Point;
import android.graphics.PointF;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import kotlin.jvm.internal.o;

/* renamed from: X.YGi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87100YGi extends AbstractC87105YGn {
    public Animator LIZJ;
    public Animator LIZLLL;

    @Override // X.AbstractC87105YGn
    public final void LIZIZ() {
        this.LIZ.LIZJ("badge");
        this.LIZ.LJI.setVisibility(8);
        this.LIZ.getClass();
        PointF LIZ = this.LIZ.LIZ();
        float translationY = this.LIZ.LJFF.getTranslationY();
        float f = LIZ.y;
        if (translationY != f) {
            Animator LIZ2 = C81276Vv6.LIZ(this.LIZ.LJFF, f);
            this.LIZLLL = LIZ2;
            LIZ2.start();
        }
        C87098YGg c87098YGg = this.LIZ;
        Point point = new Point((int) this.LIZ.LJFF.getTranslationX(), (int) this.LIZ.LJFF.getTranslationY());
        ViewOnTouchListenerC87097YGf viewOnTouchListenerC87097YGf = c87098YGg.LIZ;
        viewOnTouchListenerC87097YGf.getClass();
        N5U.LIZJ(viewOnTouchListenerC87097YGf.LJLJL, true, "become_widget", point, null);
        DataCenter dataCenter = this.LIZ.LJIIIIZZ;
        if (dataCenter != null) {
            dataCenter.jv0(null, "ON_AD_PLAY_FUN_STATE_WIDGET_SHOW");
        }
    }

    @Override // X.AbstractC87105YGn
    public final boolean LIZJ() {
        return !o.LJ(this.LIZ.LJIIL, "popupmask");
    }

    @Override // X.AbstractC87105YGn
    public final void LJ() {
        super.LJ();
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.cancel();
        }
        this.LIZJ = null;
        Animator animator2 = this.LIZLLL;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LIZLLL = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87100YGi(C87098YGg stateContext) {
        super(stateContext);
        o.LJIIIZ(stateContext, "stateContext");
    }
}
