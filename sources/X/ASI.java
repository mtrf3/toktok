package X;

import Y.ALAdapterS3S0100000_4;
import Y.AUListenerS93S0100000_4;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ASI extends FrameLayout {
    public final C252709vu LJLIL;
    public final C252709vu LJLILLLLZI;
    public C235119Kp LJLJI;
    public final ValueAnimator LJLJJI;

    public final int getCurrentNavBarBackgroundColor() {
        return this.LJLIL.getNavBackgroundColor$tux_theme_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLJJI.cancel();
    }

    public final void setNavActions(C235119Kp c235119Kp) {
        if (this.LJLJJI.isRunning()) {
            this.LJLJJI.cancel();
        }
        if (c235119Kp == null) {
            this.LJLIL.setVisibility(8);
            this.LJLILLLLZI.setVisibility(8);
        } else if (this.LJLJI == null) {
            this.LJLIL.setVisibility(0);
            this.LJLIL.setNavActions(c235119Kp);
            this.LJLILLLLZI.setVisibility(8);
        } else {
            this.LJLIL.setVisibility(0);
            this.LJLILLLLZI.setVisibility(0);
            this.LJLIL.setAlpha(0.0f);
            this.LJLILLLLZI.setAlpha(1.0f);
            this.LJLIL.setNavActions(c235119Kp);
            C235119Kp c235119Kp2 = this.LJLJI;
            if (c235119Kp2 != null) {
                this.LJLILLLLZI.setNavActions(c235119Kp2);
            }
            this.LJLJJI.start();
        }
        this.LJLJI = c235119Kp;
    }

    public final void setNavBarBackgroundColor(int i) {
        this.LJLIL.setNavBackground(i);
        this.LJLILLLLZI.setNavBackground(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ASI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C252709vu c252709vu = new C252709vu(context, null, 6);
        this.LJLIL = c252709vu;
        C252709vu c252709vu2 = new C252709vu(context, null, 6);
        this.LJLILLLLZI = c252709vu2;
        addView(c252709vu2);
        addView(c252709vu);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(0f, 1f)");
        this.LJLJJI = ofFloat;
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new AUListenerS93S0100000_4(this, 21));
        ofFloat.addListener(new ALAdapterS3S0100000_4(this, 10));
    }
}
