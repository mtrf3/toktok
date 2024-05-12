package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.ZvQ, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91488ZvQ extends FrameLayout implements InterfaceC91366ZtS<C91077Zon>, InterfaceC91083Zot {
    public C91077Zon LJLIL;
    public C91084Zou LJLILLLLZI;
    public boolean LJLJI;
    public TuxTextView LJLJJI;
    public final float LJLJJL;
    public float LJLJJLL;
    public final long LJLJL;
    public final AccelerateDecelerateInterpolator LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;

    private final ValueAnimator getMAlphaInAnimator() {
        return (ValueAnimator) this.LJLL.getValue();
    }

    private final ValueAnimator getMAlphaOutAnimator() {
        return (ValueAnimator) this.LJLLILLLL.getValue();
    }

    private final ValueAnimator getMZoomInAnimator() {
        return (ValueAnimator) this.LJLJLLL.getValue();
    }

    private final ValueAnimator getMZoomOutAnimator() {
        return (ValueAnimator) this.LJLLI.getValue();
    }

    public final void LIZ() {
        if (this.LJLJI) {
            return;
        }
        this.LJLJI = true;
        ValueAnimator mZoomInAnimator = getMZoomInAnimator();
        if (mZoomInAnimator != null) {
            mZoomInAnimator.cancel();
        }
        ValueAnimator mZoomOutAnimator = getMZoomOutAnimator();
        if (mZoomOutAnimator != null) {
            mZoomOutAnimator.cancel();
        }
        ValueAnimator mAlphaInAnimator = getMAlphaInAnimator();
        if (mAlphaInAnimator != null) {
            mAlphaInAnimator.cancel();
        }
        ValueAnimator mAlphaOutAnimator = getMAlphaOutAnimator();
        if (mAlphaOutAnimator != null) {
            mAlphaOutAnimator.cancel();
        }
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(((Number) this.LJLILLLLZI.LJII.getValue()).intValue());
        }
        ValueAnimator mZoomInAnimator2 = getMZoomInAnimator();
        if (mZoomInAnimator2 != null) {
            mZoomInAnimator2.start();
        }
        ValueAnimator mAlphaInAnimator2 = getMAlphaInAnimator();
        if (mAlphaInAnimator2 != null) {
            mAlphaInAnimator2.start();
        }
    }

    public final void LIZIZ() {
        if (!this.LJLJI) {
            return;
        }
        this.LJLJI = false;
        ValueAnimator mZoomInAnimator = getMZoomInAnimator();
        if (mZoomInAnimator != null) {
            mZoomInAnimator.cancel();
        }
        ValueAnimator mZoomOutAnimator = getMZoomOutAnimator();
        if (mZoomOutAnimator != null) {
            mZoomOutAnimator.cancel();
        }
        ValueAnimator mAlphaInAnimator = getMAlphaInAnimator();
        if (mAlphaInAnimator != null) {
            mAlphaInAnimator.cancel();
        }
        ValueAnimator mAlphaOutAnimator = getMAlphaOutAnimator();
        if (mAlphaOutAnimator != null) {
            mAlphaOutAnimator.cancel();
        }
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(this.LJLILLLLZI.LIZ());
        }
        ValueAnimator mZoomOutAnimator2 = getMZoomOutAnimator();
        if (mZoomOutAnimator2 != null) {
            mZoomOutAnimator2.start();
        }
        ValueAnimator mAlphaOutAnimator2 = getMAlphaOutAnimator();
        if (mAlphaOutAnimator2 != null) {
            mAlphaOutAnimator2.start();
        }
    }

    public final C91077Zon getMViewInfo() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91488ZvQ(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLILLLLZI = new C91084Zou();
        this.LJLJJL = 1.0f;
        this.LJLJJLL = 1.0f;
        this.LJLJL = 300L;
        this.LJLJLJ = new AccelerateDecelerateInterpolator();
        this.LJLJLLL = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 60));
        this.LJLL = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 58));
        this.LJLLI = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 61));
        this.LJLLILLLL = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 59));
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        this.LJLJJI = tuxTextView;
        tuxTextView.setMaxLines(2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388611;
        addView(this.LJLJJI, layoutParams);
    }

    @Override // X.InterfaceC91366ZtS
    public final void LJJZZIII(C91077Zon c91077Zon) {
        C91077Zon c91077Zon2 = c91077Zon;
        this.LJLIL = c91077Zon2;
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            tuxTextView.setGravity(8388611);
            tuxTextView.setTextColor(this.LJLILLLLZI.LIZ());
            tuxTextView.setTuxFont(this.LJLILLLLZI.LIZJ);
            int LIZIZ = this.LJLILLLLZI.LIZIZ();
            this.LJLILLLLZI.getClass();
            tuxTextView.setMaxWidth(LIZIZ);
            tuxTextView.setPadding(0, ((Number) this.LJLILLLLZI.LJIIIIZZ.getValue()).intValue(), 0, ((Number) this.LJLILLLLZI.LJIIIIZZ.getValue()).intValue());
            tuxTextView.setShadowLayer(((Number) this.LJLILLLLZI.LJFF.getValue()).floatValue(), 0.0f, ((Number) this.LJLILLLLZI.LJ.getValue()).floatValue(), ((Number) this.LJLILLLLZI.LIZLLL.getValue()).intValue());
        }
        TuxTextView tuxTextView2 = this.LJLJJI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(c91077Zon2.LIZIZ.LIZ);
        }
        if (c91077Zon2.LIZLLL) {
            this.LJLJI = true;
            TuxTextView tuxTextView3 = this.LJLJJI;
            if (tuxTextView3 != null) {
                tuxTextView3.setScaleX(this.LJLJJLL);
                tuxTextView3.setScaleY(this.LJLJJLL);
                tuxTextView3.setTextColor(((Number) this.LJLILLLLZI.LJII.getValue()).intValue());
                setAlpha(1.0f);
                return;
            }
            return;
        }
        this.LJLJI = false;
        TuxTextView tuxTextView4 = this.LJLJJI;
        if (tuxTextView4 == null) {
            return;
        }
        tuxTextView4.setScaleX(this.LJLJJL);
        tuxTextView4.setScaleY(this.LJLJJL);
        tuxTextView4.setTextColor(this.LJLILLLLZI.LIZ());
        setAlpha(0.0f);
    }

    @Override // X.InterfaceC91083Zot
    public void setConfig(C91084Zou config) {
        o.LJIIIZ(config, "config");
        this.LJLILLLLZI = config;
        this.LJLJJLL = config.LIZIZ;
    }

    public final void setMViewInfo(C91077Zon c91077Zon) {
        this.LJLIL = c91077Zon;
    }
}
