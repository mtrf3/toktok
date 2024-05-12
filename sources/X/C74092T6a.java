package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.T6a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74092T6a implements T6Y {
    public final ViewGroup LIZ;
    public final ViewGroup LIZIZ;
    public final C48358IyQ LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    @Override // X.T6Y
    public final void LIZ() {
        this.LIZIZ.setVisibility(8);
        this.LJ = false;
    }

    @Override // X.T6Y
    public final void LIZIZ() {
        if (!this.LJ || !this.LIZLLL) {
            return;
        }
        this.LIZJ.LIZIZ(C47264Igm.LJLIL);
        ViewGroup viewGroup = this.LIZIZ;
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation LIZIZ = C62850Ola.LIZIZ(1.0f, 0.0f, 200L);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.setDuration(300L);
        animationSet.addAnimation(LIZIZ);
        animationSet.setFillAfter(false);
        viewGroup.startAnimation(animationSet);
        this.LIZIZ.setVisibility(8);
        this.LIZLLL = false;
    }

    public final void LIZLLL() {
        if (this.LJ && !this.LIZLLL) {
            this.LIZIZ.setVisibility(0);
            ViewGroup viewGroup = this.LIZIZ;
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(-0.5f, 1.0f);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(translateAnimation);
            animationSet.setDuration(300L);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setFillAfter(false);
            viewGroup.startAnimation(animationSet);
            this.LIZLLL = true;
            this.LIZJ.LIZ(C47263Igl.LJLIL);
        }
    }

    @Override // X.T6Y
    public final void start() {
        this.LIZJ.LIZ(C47263Igl.LJLIL);
    }

    @Override // X.T6Y
    public final void stop() {
        this.LIZJ.LIZIZ(C47264Igm.LJLIL);
    }

    @Override // X.T6Y
    public final void LIZJ() {
        LIZLLL();
    }

    @Override // X.T6Y
    public final void LJJIJL() {
        LIZLLL();
    }

    public C74092T6a(Context context, ViewGroup viewGroup) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(viewGroup, "viewGroup");
        this.LIZ = viewGroup;
        this.LJ = true;
        View findViewById = viewGroup.findViewById(R.id.kdb);
        o.LJIIIIZZ(findViewById, "this.viewGroup.findViewById(R.id.start_record)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        this.LIZIZ = viewGroup2;
        this.LIZJ = new C48358IyQ(context, viewGroup2);
        this.LIZLLL = true;
    }
}
