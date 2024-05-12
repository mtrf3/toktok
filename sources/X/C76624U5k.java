package X;

import Y.ARunnableS49S0100000_13;
import Y.AfS1S0100200_13;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAnchorSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.U5k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76624U5k extends FrameLayout {
    public final C2A3 LJLIL;
    public final C2A3 LJLILLLLZI;
    public final ImageView LJLJI;
    public long LJLJJI;
    public int LJLJJL;
    public final U1E LJLJJLL;
    public AbstractC76627U5n LJLJL;
    public View.OnClickListener LJLJLJ;

    public final long getRematchBtnShowDuration() {
        return this.LJLJJI;
    }

    public final void LIZ(long j) {
        C73411SrX c73411SrX;
        animate().cancel();
        setVisibility(0);
        setScaleX(0.0f);
        setScaleY(0.0f);
        setAlpha(0.0f);
        ImageView imageView = this.LJLJI;
        if (imageView != null) {
            imageView.animate().cancel();
            ImageView imageView2 = this.LJLJI;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
                ImageView imageView3 = this.LJLJI;
                if (imageView3 != null) {
                    imageView3.setTranslationX(0.0f);
                    U1E u1e = this.LJLJJLL;
                    C73411SrX c73411SrX2 = u1e.LIZ;
                    if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = u1e.LIZ) != null) {
                        c73411SrX.dispose();
                    }
                    animate().setDuration(200L).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(new C35321a4()).start();
                    AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(this, 63);
                    ImageView imageView4 = this.LJLJI;
                    if (imageView4 != null) {
                        imageView4.postDelayed(new ARunnableS49S0100000_13(aqS163S0100000_13, 28), 500L);
                        this.LJLJJI = j;
                        U1E u1e2 = this.LJLJJLL;
                        u1e2.getClass();
                        long j2 = (j - 0) + 1;
                        if (j2 <= 0) {
                            return;
                        }
                        u1e2.LIZ = (C73411SrX) TMC.LJIL(0L, 1L, TimeUnit.SECONDS).LJJLIIIJ(j2).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS1S0100200_13(u1e2, j, 0), C28244B6q.LJLIL);
                        return;
                    }
                    o.LJIJI("rematchSweepView");
                    throw null;
                }
                o.LJIJI("rematchSweepView");
                throw null;
            }
            o.LJIJI("rematchSweepView");
            throw null;
        }
        o.LJIJI("rematchSweepView");
        throw null;
    }

    public final void setCountDownListener(AbstractC76627U5n listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJL = listener;
    }

    public final void setMaxWidth(int i) {
        this.LJLJJL = i;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        C2A3 c2a3 = this.LJLIL;
        if (c2a3 != null) {
            c2a3.setLayoutParams(layoutParams);
        } else {
            o.LJIJI("rematchTipsView");
            throw null;
        }
    }

    public final void setOnRematchClickListener(View.OnClickListener onClickListener) {
        this.LJLJLJ = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76624U5k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        a1.LJFF(context, "context");
        U1E u1e = new U1E();
        this.LJLJJLL = u1e;
        C76625U5l c76625U5l = new C76625U5l(this);
        C76626U5m c76626U5m = new C76626U5m(this);
        C16880lQ.LLLZIIL(R.layout.dg6, C16880lQ.LLZIL(context), this);
        View findViewById = findViewById(R.id.av6);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.btn_battle_rematch_tips)");
        this.LJLIL = (C2A3) findViewById;
        View findViewById2 = findViewById(R.id.av1);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.btn_battle_rematch_countdown)");
        this.LJLILLLLZI = (C2A3) findViewById2;
        View findViewById3 = findViewById(R.id.av5);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.btn_battle_rematch_sweep)");
        this.LJLJI = (ImageView) findViewById3;
        u1e.LIZIZ = c76625U5l;
        setOnClickListener(new ViewOnClickListenerC13880ga(c76626U5m));
        if (LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled()) {
            i = R.drawable.cjc;
        } else {
            i = R.drawable.cjb;
        }
        setBackgroundResource(i);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if ((mode != Integer.MIN_VALUE && mode != 0) || (i3 = this.LJLJJL) <= 0 || size <= i3) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, LiveLayoutPreloadThreadPriority.DEFAULT), i2);
        }
    }
}
