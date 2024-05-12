package X;

import Y.ACListenerS34S0100000_14;
import Y.ALAdapterS11S0100000_14;
import Y.ARunnableS50S0100000_14;
import Y.IDAListenerS238S0100000_14;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W0G implements InterfaceC81592W0m {
    public final Effect LJLIL;
    public final ExtraParams LJLILLLLZI;
    public final UYF LJLJI;
    public FrameLayout LJLJJI;
    public View LJLJJL;
    public C0GU<C0GY> LJLJJLL;
    public C29701Eo LJLJL;
    public FrameLayout LJLJLJ;
    public boolean LJLJLLL;
    public View LJLL;
    public boolean LJLLI;
    public final ARunnableS50S0100000_14 LJLLILLLL;
    public final Animation LJLLJ;
    public final W0H LJLLL;
    public final W0I LJLLLL;

    @Override // X.InterfaceC81592W0m
    public final boolean isShowing() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC81592W0m
    public final void LIZ(FrameLayout frameLayout) {
        ExtraParams extraParams;
        ConstraintLayout constraintLayout;
        String str;
        TextView textView;
        if (frameLayout == null || (extraParams = this.LJLILLLLZI) == null || !extraParams.isLottieValid()) {
            return;
        }
        this.LJLJJI = frameLayout;
        boolean z = false;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(frameLayout.getContext()), R.layout.bn4, frameLayout, false);
        this.LJLJJL = LLLLIILL;
        frameLayout.addView(LLLLIILL, 0);
        View view = this.LJLJJL;
        o.LJI(view);
        this.LJLJL = (C29701Eo) view.findViewById(R.id.khs);
        View view2 = this.LJLJJL;
        o.LJI(view2);
        this.LJLJLJ = (FrameLayout) view2.findViewById(R.id.e0y);
        View view3 = this.LJLJJL;
        o.LJI(view3);
        View findViewById = view3.findViewById(R.id.kht);
        this.LJLL = findViewById;
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 41), findViewById);
        }
        C29701Eo c29701Eo = this.LJLJL;
        if (c29701Eo != null) {
            c29701Eo.setRepeatCount(1);
        }
        C29701Eo c29701Eo2 = this.LJLJL;
        if (c29701Eo2 != null) {
            c29701Eo2.addAnimatorListener(new ALAdapterS11S0100000_14(this, 19));
        }
        View view4 = this.LJLJJL;
        if (view4 != null && (textView = (TextView) view4.findViewById(R.id.kir)) != null) {
            String hint = this.LJLIL.getHint();
            if (hint != null && hint.length() > 0) {
                textView.startAnimation(C78605Ut7.LJIILIIL(300L, 0.0f, 1.0f));
                textView.setText(this.LJLIL.getHint());
            } else {
                textView.setText("");
            }
        }
        View view5 = this.LJLJJL;
        ViewGroup.LayoutParams layoutParams = null;
        if (view5 != null) {
            constraintLayout = (ConstraintLayout) view5.findViewById(R.id.btg);
        } else {
            constraintLayout = null;
        }
        if (1 == this.LJLILLLLZI.lottieType) {
            AnonymousClass064 LIZ = C57396Mfo.LIZ(constraintLayout);
            Context context = frameLayout.getContext();
            o.LJIIIIZZ(context, "layout.context");
            LIZ.LJIILL(R.id.e0y).LIZLLL.LJJJJJL = (int) C74275TDb.LIZIZ(context, 240.0f);
            LIZ.LJIJI(R.id.e0y, "4:3");
            LIZ.LIZIZ(constraintLayout);
        }
        if (this.LJLILLLLZI.manualClose == 1) {
            z = true;
        }
        this.LJLJLLL = z;
        Context context2 = frameLayout.getContext();
        o.LJIIIIZZ(context2, "layout.context");
        int LIZIZ = (int) C74275TDb.LIZIZ(context2, 264.0f);
        View view6 = this.LJLJJL;
        if (view6 != null && (layoutParams = view6.getLayoutParams()) != null) {
            layoutParams.height = C81184Vtc.LIZIZ(frameLayout.getContext()) - LIZIZ;
        }
        View view7 = this.LJLJJL;
        if (view7 != null) {
            view7.setLayoutParams(layoutParams);
        }
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
            if (layoutParams2 != null) {
                int LIZIZ2 = C81184Vtc.LIZIZ(frameLayout.getContext()) - LIZIZ;
                Context context3 = frameLayout.getContext();
                o.LJIIIIZZ(context3, "layout.context");
                layoutParams2.height = LIZIZ2 - ((int) C74275TDb.LIZIZ(context3, 112.0f));
            }
            constraintLayout.setLayoutParams(layoutParams2);
        }
        List<String> urlList = C78963Uyt.LJIL(this.LJLIL.getHintFile()).getUrlList();
        if (urlList != null && (str = (String) ORZ.LJLLLL(urlList)) != null) {
            C0GU<C0GY> LJIIIZ = C04650Gf.LJIIIZ(frameLayout.getContext(), str);
            LJIIIZ.LIZIZ(this.LJLLL);
            LJIIIZ.LIZ(this.LJLLLL);
            this.LJLJJLL = LJIIIZ;
        } else {
            FrameLayout frameLayout2 = this.LJLJJI;
            if (frameLayout2 != null) {
                frameLayout2.postDelayed(this.LJLLILLLL, 5000L);
            }
        }
        this.LJLLI = true;
    }

    @Override // X.InterfaceC81592W0m
    public final void LJJLIIIJL(boolean z) {
        FrameLayout frameLayout;
        C0GU<C0GY> c0gu = this.LJLJJLL;
        if (c0gu != null) {
            c0gu.LJII(this.LJLLL);
            c0gu.LJI(this.LJLLLL);
        }
        C29701Eo c29701Eo = this.LJLJL;
        if (c29701Eo != null) {
            c29701Eo.cancelAnimation();
        }
        FrameLayout frameLayout2 = this.LJLJJI;
        if (frameLayout2 != null) {
            frameLayout2.removeCallbacks(this.LJLLILLLL);
        }
        View view = this.LJLJJL;
        if (view != null && (frameLayout = this.LJLJJI) != null) {
            C16880lQ.LJLLLL(view, frameLayout);
        }
        this.LJLLI = false;
    }

    public W0G(Effect faceStickerBean, ExtraParams extra, UYF uyf) {
        o.LJIIIZ(faceStickerBean, "faceStickerBean");
        o.LJIIIZ(extra, "extra");
        this.LJLIL = faceStickerBean;
        this.LJLILLLLZI = extra;
        this.LJLJI = uyf;
        this.LJLLILLLL = new ARunnableS50S0100000_14(this, 100);
        Animation LJIILIIL = C78605Ut7.LJIILIIL(300L, 0.0f, 1.0f);
        LJIILIIL.setFillAfter(true);
        LJIILIIL.setAnimationListener(new IDAListenerS238S0100000_14(this, 4));
        this.LJLLJ = LJIILIIL;
        this.LJLLL = new W0H(this);
        this.LJLLLL = new W0I(this);
    }
}
