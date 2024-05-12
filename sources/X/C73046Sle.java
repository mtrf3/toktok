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
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import q03.IDaS489S0100000_12;

/* renamed from: X.Sle, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73046Sle extends FrameLayout {
    public InterfaceC73048Slg LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public EnumC63858P4k LJLJJL;
    public IQ9 LJLJJLL;
    public Integer LJLJL;
    public Float LJLJLJ;
    public final java.util.Map<Integer, View> LJLJLLL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJLLL;
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

    public final void LIZLLL() {
        this.LJLJJI = true;
        C243149gU.LIZJ((ConstraintLayout) LIZ(R.id.bs8), new ALAdapterS9S0100000_12(this, 4), new AUListenerS99S0100000_12(this, 13));
    }

    public final void LJFF() {
        C243149gU.LIZJ((ConstraintLayout) LIZ(R.id.bs8), new ALAdapterS9S0100000_12(this, 5), new AUListenerS99S0100000_12(this, 14));
    }

    public final void LJI() {
        IPW ipw;
        if (!this.LJLJI) {
            IQ9 iq9 = this.LJLJJLL;
            if (iq9 != null) {
                ipw = iq9.LJIILL;
            } else {
                ipw = null;
            }
            if (ipw == IPW.PLAYER_IDLE || this.LJLJJL == EnumC63858P4k.FULL_SCREEN) {
                LJ(0);
                return;
            }
        }
        ((ImageView) LIZ(R.id.hro)).setVisibility(8);
    }

    public final void LIZJ() {
        int visibility = LIZ(R.id.nk).getVisibility();
        float alpha = LIZ(R.id.bs8).getAlpha();
        Integer num = this.LJLJL;
        if (num == null || visibility != num.intValue() || !o.LIZJ(this.LJLJLJ, alpha)) {
            this.LJLJL = Integer.valueOf(visibility);
            this.LJLJLJ = Float.valueOf(alpha);
            InterfaceC73048Slg interfaceC73048Slg = this.LJLIL;
            if (interfaceC73048Slg != null) {
                interfaceC73048Slg.LJI();
            }
        }
    }

    public final EnumC63858P4k getDisplayMode() {
        return this.LJLJJL;
    }

    public final boolean getNeedShowMask() {
        return this.LJLJJI;
    }

    public final InterfaceC73048Slg getOnPlayerActionBarListener() {
        return this.LJLIL;
    }

    public final IQ9 getPlayer() {
        return this.LJLJJLL;
    }

    public final void LIZIZ(long j) {
        if (this.LJLJJL == EnumC63858P4k.PREVIEW) {
            return;
        }
        ARunnableS15S0300000_4 aRunnableS15S0300000_4 = new ARunnableS15S0300000_4((ConstraintLayout) LIZ(R.id.bs8), (ValueAnimator.AnimatorUpdateListener) new AUListenerS99S0100000_12(this, 12), (Animator.AnimatorListener) new ALAdapterS9S0100000_12(this, 3), 12);
        C243149gU.LIZIZ = aRunnableS15S0300000_4;
        C243149gU.LIZ().removeCallbacksAndMessages(null);
        C243149gU.LIZ().postDelayed(aRunnableS15S0300000_4, j);
    }

    public final void LJ(int i) {
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

    public final void setCustomSliding(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setDisplayMode(EnumC63858P4k enumC63858P4k) {
        o.LJIIIZ(enumC63858P4k, "<set-?>");
        this.LJLJJL = enumC63858P4k;
    }

    public final void setLoading(boolean z) {
        this.LJLJI = z;
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

    public final void setOnPlayerActionBarListener(InterfaceC73048Slg interfaceC73048Slg) {
        this.LJLIL = interfaceC73048Slg;
    }

    public final void setPlayer(IQ9 iq9) {
        this.LJLJJLL = iq9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73046Sle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJLLL = C62850Ola.LJFF(context, "context");
        this.LJLJJI = true;
        this.LJLJJL = EnumC63858P4k.PREVIEW;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.a32, this, true);
        ((AbstractC019505v) LIZ(R.id.hrz)).setReferencedIds(new int[]{R.id.hs4, R.id.hs5});
        ((C1AH) LIZ(R.id.hrz)).setVisibility(8);
        ((AbstractC019505v) LIZ(R.id.n5m)).setReferencedIds(new int[]{R.id.n5n, R.id.hs8, R.id.hs9});
        ((C1AH) LIZ(R.id.n5m)).setVisibility(8);
        ((AbstractC019505v) LIZ(R.id.n7j)).setReferencedIds(new int[]{R.id.n7k, R.id.hs_, R.id.hsa});
        ((C1AH) LIZ(R.id.n7j)).setVisibility(8);
        View play_side = LIZ(R.id.hs3);
        o.LJIIIIZZ(play_side, "play_side");
        C16880lQ.LJIIJ(new IDaS489S0100000_12(this, 4), play_side);
        ((C81239VuV) LIZ(R.id.k4q)).setOnSeekBarChangeListener(new C73047Slf(this));
        View slider_custom_icon = LIZ(R.id.k4s);
        o.LJIIIIZZ(slider_custom_icon, "slider_custom_icon");
        C16880lQ.LJIIJ(new IDaS489S0100000_12(this, 5), slider_custom_icon);
        View video_retry_mask = LIZ(R.id.n7k);
        o.LJIIIIZZ(video_retry_mask, "video_retry_mask");
        C16880lQ.LJIIJ(new IDaS489S0100000_12(this, 6), video_retry_mask);
        ((AbsSeekBar) LIZ(R.id.k4q)).setMax(10000);
        ((ProgressBar) LIZ(R.id.k4r)).setMax(10000);
        LIZ(R.id.k4q).setOnTouchListener(new IDTListenerS120S0100000_12(this, 12));
        LIZ(R.id.bs8).setOnTouchListener(new IDTListenerS120S0100000_12(this, 13));
    }
}
