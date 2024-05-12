package X;

import Y.ALAdapterS9S0100000_12;
import Y.ARunnableS15S0300000_4;
import Y.AUListenerS99S0100000_12;
import Y.IDTListenerS120S0100000_12;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Sll, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73053Sll extends FrameLayout {
    public InterfaceC73056Slo LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public C27609AsX LJLJLJ;
    public TuxTextView LJLJLLL;
    public TuxTextView LJLL;
    public Integer LJLLI;
    public Float LJLLILLLL;
    public final java.util.Map<Integer, View> LJLLJ;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLLJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LJ() {
        this.LJLJJI = true;
        if (this.LJLJJL) {
            ARunnableS15S0300000_4 aRunnableS15S0300000_4 = new ARunnableS15S0300000_4((ConstraintLayout) LIZ(R.id.bs8), (ValueAnimator.AnimatorUpdateListener) new AUListenerS99S0100000_12(this, 21), (Animator.AnimatorListener) new ALAdapterS9S0100000_12(this, 13), 10);
            C73057Slp.LIZIZ = aRunnableS15S0300000_4;
            C73057Slp.LIZ().removeCallbacksAndMessages(null);
            C73057Slp.LIZ().postDelayed(aRunnableS15S0300000_4, 0L);
            return;
        }
        LIZ(R.id.bs8).setVisibility(0);
        LIZ(R.id.bs8).setAlpha(1.0f);
        if (this.LJLJJLL) {
            LIZIZ(3000L);
        }
        LIZLLL();
    }

    public final void LIZLLL() {
        int visibility = LIZ(R.id.bs8).getVisibility();
        float alpha = LIZ(R.id.bs8).getAlpha();
        Integer num = this.LJLLI;
        if (num == null || visibility != num.intValue() || !o.LIZJ(this.LJLLILLLL, alpha)) {
            this.LJLLI = Integer.valueOf(visibility);
            this.LJLLILLLL = Float.valueOf(alpha);
            InterfaceC73056Slo interfaceC73056Slo = this.LJLIL;
            if (interfaceC73056Slo != null) {
                interfaceC73056Slo.LJI(alpha, visibility);
            }
        }
    }

    public final TuxTextView getCurTimeView() {
        return this.LJLJLLL;
    }

    public final boolean getHideMiddleWhenPlaying() {
        return this.LJLJL;
    }

    public final C27609AsX getMiddleAction() {
        return this.LJLJLJ;
    }

    public final boolean getNeedAnimation() {
        return this.LJLJJL;
    }

    public final boolean getNeedHide() {
        return this.LJLJJLL;
    }

    public final boolean getNeedShowMask() {
        return this.LJLJJI;
    }

    public final InterfaceC73056Slo getOnPlayerActionBarListener() {
        return this.LJLIL;
    }

    public final TuxTextView getTotalDurationView() {
        return this.LJLL;
    }

    public final void LIZIZ(long j) {
        if (!this.LJLJJLL) {
            return;
        }
        if (this.LJLJJL) {
            LIZJ(j);
            return;
        }
        this.LJLJJI = false;
        LIZ(R.id.bs8).setAlpha(0.0f);
        LIZLLL();
    }

    public final void LIZJ(long j) {
        ARunnableS15S0300000_4 aRunnableS15S0300000_4 = new ARunnableS15S0300000_4(LIZ(R.id.bs8), (Object) new AUListenerS99S0100000_12(this, 15), (Object) new ALAdapterS9S0100000_12(this, 6), 9);
        C73057Slp.LIZIZ = aRunnableS15S0300000_4;
        C73057Slp.LIZ().removeCallbacksAndMessages(null);
        C73057Slp.LIZ().postDelayed(aRunnableS15S0300000_4, j);
    }

    public final void LJFF(int i) {
        OSJ osj;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    osj = new OSJ(8, 8, 8);
                } else {
                    osj = new OSJ(8, 8, 0);
                }
            } else {
                osj = new OSJ(8, 0, 8);
            }
        } else {
            osj = new OSJ(0, 8, 8);
        }
        int intValue = ((Number) osj.getFirst()).intValue();
        int intValue2 = ((Number) osj.getSecond()).intValue();
        int intValue3 = ((Number) osj.getThird()).intValue();
        ((ImageView) LIZ(R.id.hro)).setVisibility(intValue);
        LIZ(R.id.l7z).setVisibility(intValue2);
        ((C1AH) LIZ(R.id.hrz)).setVisibility(intValue3);
    }

    public final void setCurTimeView(TuxTextView tuxTextView) {
        this.LJLJLLL = tuxTextView;
    }

    public final void setCurrentProgress(String curTime) {
        o.LJIIIZ(curTime, "curTime");
        TuxTextView tuxTextView = this.LJLJLLL;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(curTime);
    }

    public final void setCustomSliding(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setHideMiddleWhenPlaying(boolean z) {
        this.LJLJL = z;
    }

    public final void setLoading(boolean z) {
        this.LJLJI = z;
    }

    public final void setMiddleAction(C27609AsX c27609AsX) {
        this.LJLJLJ = c27609AsX;
        View slider_custom_icon = LIZ(R.id.k4s);
        o.LJIIIIZZ(slider_custom_icon, "slider_custom_icon");
        C29306Beo.LJJJLL(slider_custom_icon, 500L, new AqS178S0100000_12(this, 496));
    }

    public final void setNeedAnimation(boolean z) {
        this.LJLJJL = z;
    }

    public final void setNeedHide(boolean z) {
        this.LJLJJLL = z;
    }

    public final void setNeedShowMask(boolean z) {
        this.LJLJJI = z;
    }

    public final void setNetSpeed(int i) {
        TextView textView = (TextView) LIZ(R.id.hs5);
        StringBuilder LIZ = X1D.LIZ();
        if (i < 0) {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append(" KB/s");
        textView.setText(X1D.LIZIZ(LIZ));
    }

    public final void setOnPlayerActionBarListener(InterfaceC73056Slo interfaceC73056Slo) {
        this.LJLIL = interfaceC73056Slo;
    }

    public final void setTotalDuration(String totalDuration) {
        o.LJIIIZ(totalDuration, "totalDuration");
        TuxTextView tuxTextView = this.LJLL;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(totalDuration);
    }

    public final void setTotalDurationView(TuxTextView tuxTextView) {
        this.LJLL = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73053Sll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLLJ = C62850Ola.LJFF(context, "context");
        this.LJLJJL = true;
        this.LJLJJLL = true;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bqj, this, true);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_3pt_refresh;
        Integer valueOf = Integer.valueOf(R.attr.dj);
        c2068389v.LJ = valueOf;
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(32));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(32));
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "this.context");
        ((ImageView) LIZ(R.id.hs_)).setImageDrawable(c2068389v.LIZ(context2));
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_large_no_video;
        c2068389v2.LJ = valueOf;
        c2068389v2.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
        c2068389v2.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "this.context");
        ((ImageView) LIZ(R.id.hs8)).setImageDrawable(c2068389v2.LIZ(context3));
        View play_side = LIZ(R.id.hs3);
        o.LJIIIIZZ(play_side, "play_side");
        C29306Beo.LJJJLL(play_side, 500L, new AqS178S0100000_12(this, 494));
        ((C81239VuV) LIZ(R.id.k4q)).setOnSeekBarChangeListener(new C73055Sln(this));
        ((AbsSeekBar) LIZ(R.id.k4q)).setMax(10000);
        LIZ(R.id.k4q).setOnTouchListener(new IDTListenerS120S0100000_12(this, 8));
        View LIZ = LIZ(R.id.l7z);
        if (LIZ != null) {
            this.LJLJLLL = (TuxTextView) LIZ.findViewById(R.id.c0t);
            this.LJLL = (TuxTextView) LIZ.findViewById(R.id.lii);
        }
        ((AbstractC019505v) LIZ(R.id.hrz)).setReferencedIds(new int[]{R.id.hs4, R.id.hs5});
        ((C1AH) LIZ(R.id.hrz)).setVisibility(8);
        ((AbstractC019505v) LIZ(R.id.n5m)).setReferencedIds(new int[]{R.id.n5n, R.id.hs8, R.id.hs9});
        ((C1AH) LIZ(R.id.n5m)).setVisibility(8);
        ((AbstractC019505v) LIZ(R.id.n7j)).setReferencedIds(new int[]{R.id.n7k, R.id.hs_, R.id.hsa});
        View video_retry_mask = LIZ(R.id.n7k);
        o.LJIIIIZZ(video_retry_mask, "video_retry_mask");
        C29306Beo.LJJJLL(video_retry_mask, 500L, new AqS178S0100000_12(this, 495));
        View slider_custom_icon = LIZ(R.id.k4s);
        o.LJIIIIZZ(slider_custom_icon, "slider_custom_icon");
        C29306Beo.LJJJLL(slider_custom_icon, 500L, new AqS178S0100000_12(this, 496));
        LIZ(R.id.bs8).setOnTouchListener(new IDTListenerS120S0100000_12(this, 9));
    }
}
