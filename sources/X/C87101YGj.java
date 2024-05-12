package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.YGj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87101YGj extends C87107YGp {
    public List<? extends Animator> LIZLLL;

    @Override // X.AbstractC87105YGn
    public final void LIZIZ() {
        float f;
        long j;
        AwemePlayFunModel awemePlayFunModel = this.LIZ.LIZLLL;
        if (awemePlayFunModel != null) {
            f = awemePlayFunModel.getEndDuration();
        } else {
            f = 0.0f;
        }
        float f2 = f * 1000;
        PointF LIZ = this.LIZ.LIZ();
        C87104YGm c87104YGm = new C87104YGm();
        c87104YGm.LIZ = f2;
        PointF pointF = new PointF(this.LIZ.LJFF.getTranslationX(), this.LIZ.LJFF.getTranslationY());
        c87104YGm.LIZIZ = pointF.x;
        c87104YGm.LIZJ = pointF.y;
        PointF pointF2 = new PointF(LIZ.x, LIZ.y);
        c87104YGm.LJFF = pointF2.x;
        c87104YGm.LJI = pointF2.y;
        C87108YGq LIZ2 = c87104YGm.LIZ();
        C87098YGg c87098YGg = this.LIZ;
        View target = c87098YGg.LJFF;
        C87113YGv playFunParam = c87098YGg.LIZIZ;
        o.LJIIIZ(target, "target");
        o.LJIIIZ(playFunParam, "playFunParam");
        target.setPivotX(playFunParam.LIZ / 2.0f);
        target.setPivotY(playFunParam.LIZ / 2.0f);
        Path path = new Path();
        path.moveTo(LIZ2.LIZIZ, LIZ2.LIZJ);
        float f3 = LIZ2.LIZIZ;
        float f4 = LIZ2.LJFF;
        float f5 = 2;
        float f6 = LIZ2.LIZJ;
        float f7 = LIZ2.LJI;
        path.cubicTo((f3 + f4) / f5, f6, f4, (f6 + f7) / f5, f4, f7);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(target, "translationX", "translationY", path);
        o.LJIIIIZZ(ofFloat, "ofFloat(target, TRANSLAT…N_X, TRANSLATION_Y, path)");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(target, "scaleX", target.getScaleX(), playFunParam.LIZLLL);
        o.LJIIIIZZ(ofFloat2, "ofFloat(target, SCALE_X,…playFunParam.widgetScale)");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(target, "ScaleY", target.getScaleY(), playFunParam.LIZLLL);
        o.LJIIIIZZ(ofFloat3, "ofFloat(target, SCALE_Y,…playFunParam.widgetScale)");
        AnimatorSet animatorSet = new AnimatorSet();
        float f8 = LIZ2.LIZ;
        if (f8 > 0.0f) {
            j = f8;
        } else {
            j = 400;
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(new SJI());
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        LJI(animatorSet);
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.start();
        }
        long j2 = f2 / 2;
        View target2 = this.LIZ.LJ;
        o.LJIIIZ(target2, "target");
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(target2, "alpha", 1.0f, 0.0f);
        ofFloat4.setDuration(j2);
        ofFloat4.start();
        View target3 = this.LIZ.LJI;
        o.LJIIIZ(target3, "target");
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(target3, "alpha", 1.0f, 0.0f);
        ofFloat5.setDuration(200L);
        ofFloat5.start();
        List<? extends Animator> LJJIJIIJI = C47261Igj.LJJIJIIJI(ofFloat4, ofFloat5);
        o.LJI(LJJIJIIJI);
        this.LIZLLL = LJJIJIIJI;
        this.LIZ.getClass();
        this.LIZ.getClass();
    }

    @Override // X.AbstractC87105YGn
    public final void LJ() {
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.cancel();
        }
        LJI(null);
        LJII(new C87111YGt());
        this.LIZLLL = null;
        this.LIZ.getClass();
    }

    @Override // X.C87107YGp, X.AbstractC87105YGn
    public final void LIZLLL() {
        super.LIZLLL();
        LJII(new C87110YGs());
        this.LIZ.getClass();
    }

    @Override // X.C87107YGp, X.AbstractC87105YGn
    public final void LJFF() {
        super.LJFF();
        LJII(new C87112YGu());
        this.LIZ.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87101YGj(C87098YGg stateContext) {
        super(stateContext);
        o.LJIIIZ(stateContext, "stateContext");
    }

    public final void LJII(InterfaceC87116YGy interfaceC87116YGy) {
        List<? extends Animator> list = this.LIZLLL;
        if (list != null) {
            for (Animator animator : list) {
                if (animator != null) {
                    interfaceC87116YGy.LIZ(animator);
                }
            }
        }
    }
}
