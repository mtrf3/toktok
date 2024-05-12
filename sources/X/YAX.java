package X;

import Y.IDTListenerS123S0100000_15;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YAX implements T6Y {
    public final Context LIZ;
    public final ViewGroup LIZIZ;
    public final boolean LIZJ;
    public final ViewGroup LIZLLL;
    public final ViewGroup LJ;
    public final T2U LJFF;
    public final C82815Wep LJI;
    public final YAV LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;

    @Override // X.T6Y
    public final void LIZ() {
    }

    @Override // X.T6Y
    public final void LIZIZ() {
        if (!this.LJIIIZ && !this.LJIIJ) {
            this.LIZLLL.clearAnimation();
            this.LJFF.LIZIZ(T2T.LJLIL);
            this.LJIIJ = true;
            if (!C53093Ksb.LIZJ()) {
                this.LJI.LIZIZ(new AqS165S0100000_15(this, 842));
            }
        }
    }

    public final void LIZLLL() {
        if (this.LJIIIZ && !this.LJIIJJI) {
            this.LIZLLL.clearAnimation();
            this.LJIIJJI = true;
            YAV yav = this.LJII;
            AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(this, 839);
            if (yav.LIZJ.getAnimation() != null) {
                yav.LIZJ.clearAnimation();
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(yav.LIZ, R.anim.bp);
            loadAnimation.setInterpolator(C55953Lxd.LJI());
            loadAnimation.setAnimationListener(new YAW(yav, aqS165S0100000_15));
            yav.LIZJ.startAnimation(loadAnimation);
        }
    }

    @Override // X.T6Y
    public final void start() {
        if (C53093Ksb.LIZIZ() && !this.LJIIIZ) {
            View findViewById = this.LIZLLL.findViewById(R.id.kdi);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            this.LJFF.LIZ(T2S.LJLIL);
        }
    }

    @Override // X.T6Y
    public final void stop() {
        if (!C53093Ksb.LIZIZ() || this.LJIIIZ) {
            return;
        }
        this.LJFF.LIZIZ(T2T.LJLIL);
    }

    @Override // X.T6Y
    public final void LIZJ() {
        LIZLLL();
    }

    @Override // X.T6Y
    public final void LJJIJL() {
        LIZLLL();
    }

    public YAX(Context context, ViewGroup viewGroup, boolean z) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(viewGroup, "viewGroup");
        this.LIZ = context;
        this.LIZIZ = viewGroup;
        this.LIZJ = z;
        this.LJIIIIZZ = true;
        View findViewById = viewGroup.findViewById(R.id.kdb);
        o.LJIIIIZZ(findViewById, "this.viewGroup.findViewById(R.id.start_record)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        this.LIZLLL = viewGroup2;
        if (z) {
            this.LJ = (ViewGroup) viewGroup.findViewById(R.id.d5x);
        }
        this.LJFF = new T2U(context, viewGroup2);
        this.LJI = new C82815Wep(context, viewGroup2);
        this.LJII = new YAV(context, viewGroup2);
        viewGroup2.setOnTouchListener(new IDTListenerS123S0100000_15(this, 1));
    }
}
