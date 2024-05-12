package X;

import Y.ARunnableS50S0100000_14;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.W0e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81584W0e implements InterfaceC81592W0m {
    public static final /* synthetic */ int LJLJL = 0;
    public final Effect LJLIL;
    public View LJLILLLLZI;
    public FrameLayout LJLJI;
    public View LJLJJI;
    public boolean LJLJJL;
    public final ARunnableS50S0100000_14 LJLJJLL;

    @Override // X.InterfaceC81592W0m
    public final boolean isShowing() {
        return this.LJLJJL;
    }

    public C81584W0e(Effect mEffect) {
        o.LJIIIZ(mEffect, "mEffect");
        this.LJLIL = mEffect;
        this.LJLJJLL = new ARunnableS50S0100000_14(this, 184);
    }

    @Override // X.InterfaceC81592W0m
    public final void LIZ(FrameLayout frameLayout) {
        View view;
        TextView textView;
        if (frameLayout == null) {
            return;
        }
        this.LJLJI = frameLayout;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(frameLayout.getContext()), R.layout.bn5, frameLayout, false);
        this.LJLILLLLZI = LLLLIILL;
        FrameLayout frameLayout2 = this.LJLJI;
        if (frameLayout2 != null) {
            frameLayout2.addView(LLLLIILL);
        }
        View view2 = this.LJLILLLLZI;
        W5G w5g = null;
        if (view2 != null) {
            view = view2.findViewById(R.id.dc7);
        } else {
            view = null;
        }
        this.LJLJJI = view;
        View view3 = this.LJLILLLLZI;
        if (view3 != null && (textView = (TextView) view3.findViewById(R.id.kir)) != null) {
            String hint = this.LJLIL.getHint();
            if (hint == null) {
                hint = "";
            }
            textView.setText(hint);
        }
        View view4 = this.LJLILLLLZI;
        if (view4 != null) {
            w5g = (W5G) view4.findViewById(R.id.kis);
        }
        C162696a1.LIZLLL(8, w5g);
        View view5 = this.LJLJJI;
        if (view5 != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            view5.startAnimation(alphaAnimation);
        }
        View view6 = this.LJLJJI;
        if (view6 != null) {
            view6.postDelayed(this.LJLJJLL, 5000L);
        }
        this.LJLJJL = true;
    }

    @Override // X.InterfaceC81592W0m
    public final void LJJLIIIJL(boolean z) {
        View view = this.LJLJJI;
        if (view != null) {
            view.removeCallbacks(this.LJLJJLL);
        }
        FrameLayout frameLayout = this.LJLJI;
        if (frameLayout != null) {
            C16880lQ.LJLLLL(this.LJLILLLLZI, frameLayout);
        }
        this.LJLJJL = false;
    }
}
