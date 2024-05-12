package X;

import Y.ALAdapterS11S0200000_14;
import Y.ARunnableS25S0300000_14;
import Y.AUListenerS38S0201000_14;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import kotlin.jvm.internal.o;

/* renamed from: X.Wic, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83050Wic extends C82604WbQ implements TKG {
    public TKH LJLIL;
    public boolean LJLILLLLZI;
    public final ViewGroup LJLJI;
    public final View LJLJJI;
    public final View LJLJJL;
    public final long LJLJJLL;
    public final long LJLJL;
    public final Interpolator LJLJLJ;
    public final Interpolator LJLJLLL;
    public final boolean LJLL;
    public final OSZ<String, String> LJLLI;

    @Override // X.TKG
    public final void LIZIZ(C30461Hm c30461Hm) {
        ViewGroup viewGroup;
        ViewParent parent = this.LJLJJI.getParent();
        if (!(parent instanceof ViewGroup) || parent == null) {
            this.LJLJI.removeAllViews();
            this.LJLJI.addView(this.LJLJJI);
            viewGroup = this.LJLJI;
        } else {
            viewGroup = (ViewGroup) parent;
        }
        viewGroup.post(new ARunnableS25S0300000_14(c30461Hm, this, viewGroup, 14));
    }

    @Override // X.TKG
    public final void LIZJ(C30461Hm c30461Hm) {
        String str;
        TKH tkh = this.LJLIL;
        if (tkh != null) {
            tkh.LJ();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.LJLJL);
        o.LJIIIIZZ(duration, "ValueAnimator.ofFloat(0f…on(endTransitionDuration)");
        OSZ<String, String> osz = this.LJLLI;
        if (osz == null || (str = osz.getSecond()) == null) {
            str = "";
        }
        C173216qz.LJ(duration, str, false);
        Interpolator interpolator = this.LJLJLLL;
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.addUpdateListener(new AUListenerS38S0201000_14(c30461Hm, this.LJLJJL.getMeasuredHeight(), this, 2));
        duration.addListener(new ALAdapterS11S0200000_14(this, c30461Hm, 4));
        duration.start();
    }

    @Override // X.TKG
    public final void LJI(TKH tkh) {
        this.LJLIL = tkh;
    }

    @Override // X.C82604WbQ, X.InterfaceC82947Wgx
    public final void LIZ(float f, int i, int i2) {
        this.LJLJJL.setTranslationY(((i - i2) * f) + i2);
        if (this.LJLL) {
            this.LJLJJL.setAlpha(f);
        }
    }

    @Override // X.C82604WbQ, X.InterfaceC82947Wgx
    public final void LJIIIIZZ(float f, int i, int i2) {
        this.LJLJJL.setTranslationY((i2 - i) * f);
        if (this.LJLL) {
            this.LJLJJL.setAlpha(1 - f);
        }
    }

    public C83050Wic(ViewGroup root, View view, View target, long j, long j2, Interpolator interpolator, OSZ osz) {
        o.LJIIIZ(root, "root");
        o.LJIIIZ(target, "target");
        this.LJLJI = root;
        this.LJLJJI = view;
        this.LJLJJL = target;
        this.LJLJJLL = j;
        this.LJLJL = j2;
        this.LJLJLJ = interpolator;
        this.LJLJLLL = null;
        this.LJLL = false;
        this.LJLLI = osz;
        this.LJLILLLLZI = true;
    }
}
