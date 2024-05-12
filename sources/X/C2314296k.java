package X;

import Y.AUListenerS93S0100000_4;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.96k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2314296k extends FrameLayout implements InterfaceC135405Tc {
    public final ValueAnimator LJLIL;
    public final ValueAnimator LJLILLLLZI;
    public final ValueAnimator LJLJI;
    public final ValueAnimator LJLJJI;
    public final TuxIconView LJLJJL;
    public final TuxIconView LJLJJLL;

    @Override // X.InterfaceC135405Tc
    public final void LIZIZ() {
        this.LJLJI.end();
        this.LJLJJI.end();
        this.LJLIL.start();
        this.LJLILLLLZI.start();
    }

    @Override // X.InterfaceC135405Tc
    public final void LIZJ() {
        this.LJLIL.end();
        this.LJLILLLLZI.end();
        this.LJLJI.start();
        this.LJLJJI.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LJLJI.isRunning()) {
            this.LJLJI.end();
        }
        if (this.LJLJJI.isRunning()) {
            this.LJLJJI.end();
        }
        if (this.LJLIL.isRunning()) {
            this.LJLIL.end();
        }
        if (this.LJLILLLLZI.isRunning()) {
            this.LJLILLLLZI.end();
        }
    }

    @Override // X.InterfaceC135405Tc
    public void setRecordingTintRes(int i) {
        this.LJLJJL.setIconRes(i);
    }

    @Override // X.InterfaceC135405Tc
    public void setStopTintColorRes(int i) {
        this.LJLJJLL.setTintColorRes(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2314296k(Context context, float f) {
        super(context);
        a1.LJFF(context, "context");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.72f);
        this.LJLIL = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.LJLILLLLZI = ofFloat2;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.72f, 1.0f);
        this.LJLJI = ofFloat3;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJLJJI = ofFloat4;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        this.LJLJJLL = tuxIconView;
        tuxIconView.setTintColorRes(R.attr.dj);
        tuxIconView.setIconRes(R.drawable.pg);
        tuxIconView.setIconHeight((int) KL2.LIZJ(context, 15.0f));
        tuxIconView.setIconWidth((int) KL2.LIZJ(context, 15.0f));
        tuxIconView.setAlpha(0.0f);
        int i = (int) f;
        addView(tuxIconView, new FrameLayout.LayoutParams(i, i));
        TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
        this.LJLJJL = tuxIconView2;
        tuxIconView2.setTintColorRes(R.attr.dj);
        tuxIconView2.setIconRes(R.raw.icon_microphone_fill);
        tuxIconView2.setAlpha(1.0f);
        addView(tuxIconView2, new FrameLayout.LayoutParams(i, i));
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(C55953Lxd.LJ());
        ofFloat2.setDuration(150L);
        ofFloat2.setInterpolator(C55953Lxd.LJ());
        ofFloat3.setDuration(150L);
        ofFloat3.setInterpolator(C55953Lxd.LJ());
        ofFloat4.setDuration(150L);
        ofFloat4.setInterpolator(C55953Lxd.LJ());
        ofFloat.addUpdateListener(new AUListenerS93S0100000_4(this, 0));
        ofFloat2.addUpdateListener(new AUListenerS93S0100000_4(this, 1));
        ofFloat3.addUpdateListener(new AUListenerS93S0100000_4(this, 2));
        ofFloat4.addUpdateListener(new AUListenerS93S0100000_4(this, 3));
    }

    @Override // X.InterfaceC135405Tc
    public final void LIZ(int i, int i2) {
        this.LJLJJLL.setIconHeight(i2);
        this.LJLJJLL.setIconWidth(i);
    }
}
