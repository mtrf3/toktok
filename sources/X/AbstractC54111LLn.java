package X;

import Y.ALAdapterS7S0200000_9;
import Y.AUListenerS97S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LLn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC54111LLn {
    public final C54113LLp LIZ;
    public L7P LIZIZ;
    public final PreDrawableInflate LIZJ;
    public final LH4 LIZLLL;
    public LH5 LJ;
    public boolean LJFF;
    public int LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;

    public void LIZ(InterfaceC88472Yns<? super Context, ? extends View> viewCreateLogic) {
        o.LJIIIZ(viewCreateLogic, "viewCreateLogic");
    }

    public abstract void LIZJ(int i, boolean z);

    public abstract ImageView LJ();

    public abstract ImageView LJFF();

    public abstract ImageView LJI();

    public abstract ImageView LJII();

    public abstract TuxTextView LJIIIIZZ();

    public View LJIIL() {
        return null;
    }

    public int LJIILIIL(boolean z) {
        return z ? 93 : 92;
    }

    public abstract void LJIILL();

    public abstract void LJIILLIIL();

    public abstract void LJIIZILJ();

    public abstract void LJIJJ();

    public abstract void LJIL(L7P l7p);

    public abstract void LJJI();

    public abstract boolean LJJII(LH5 lh5, L7P l7p, boolean z);

    public abstract void LJJIII();

    public final void LJIIIZ() {
        if (this.LJII) {
            return;
        }
        ImageView LJI = LJI();
        if (LJI != null) {
            C54113LLp c54113LLp = this.LIZ;
            c54113LLp.getClass();
            c54113LLp.LJLJJI = LJI;
            c54113LLp.addView(LJI);
        }
        this.LJII = true;
    }

    public final void LJIIJ() {
        if (this.LJIIIZ) {
            return;
        }
        ImageView LJII = LJII();
        if (LJII != null) {
            LJII.setVisibility(8);
            C54113LLp c54113LLp = this.LIZ;
            c54113LLp.getClass();
            c54113LLp.LJLJLJ = LJII;
            c54113LLp.addView(LJII);
            ImageView imageView = c54113LLp.LJLJJLL;
            if (imageView != null) {
                imageView.bringToFront();
            }
            TextView textView = c54113LLp.LJLJL;
            if (textView != null) {
                textView.bringToFront();
            }
        }
        this.LJIIIZ = true;
    }

    public final void LJIIJJI() {
        if (this.LJIIIIZZ) {
            return;
        }
        TuxTextView LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            C54113LLp c54113LLp = this.LIZ;
            c54113LLp.getClass();
            c54113LLp.LJLJJL = LJIIIIZZ;
            c54113LLp.addView(LJIIIIZZ);
        }
        this.LJIIIIZZ = true;
    }

    public final boolean LJIILJJIL() {
        if (this.LJ == LH5.SELECT) {
            return true;
        }
        return false;
    }

    public void LJIJ() {
        LJIIJ();
        LJIIIZ();
        C54113LLp c54113LLp = this.LIZ;
        c54113LLp.setTabRefreshVisibility(0);
        ImageView imageView = c54113LLp.LJLJLJ;
        if (imageView != null) {
            imageView.setLayerType(2, null);
        }
        c54113LLp.setTabIconVisibility(8);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -360.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new AUListenerS97S0100000_9(this, 61));
        ofFloat.addListener(new ALAdapterS7S0200000_9(this, ofFloat, 4));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.addUpdateListener(new AUListenerS97S0100000_9(this, 60));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat2, ofFloat);
        animatorSet.start();
    }

    public void LJIJI() {
        LJIIJ();
        LJIIIZ();
        C54113LLp c54113LLp = this.LIZ;
        c54113LLp.setTabRefreshVisibility(8);
        c54113LLp.setTabRefreshAlpha(1.0f);
        c54113LLp.setTabIconVisibility(0);
    }

    public final void LJIJJLI() {
        if (LJIILJJIL()) {
            return;
        }
        LJJ(LH5.SELECT);
        if (this.LJFF) {
            if (LJJII(this.LJ, this.LIZIZ, false)) {
                LJJIII();
                return;
            }
            return;
        }
        LJIILL();
    }

    public final void LJJIFFI() {
        if (!LJIILJJIL()) {
            return;
        }
        LJJ(LH5.UNSELECT);
        if (this.LJFF) {
            if (LJJII(this.LJ, this.LIZIZ, false)) {
                LJJIII();
                return;
            }
            return;
        }
        LJIIZILJ();
    }

    public AbstractC54111LLn(C54113LLp c54113LLp) {
        this.LIZ = c54113LLp;
        this.LJ = c54113LLp.getIconData().LJFF;
        C36093EEn.LIZ.getClass();
        this.LIZJ = (PreDrawableInflate) C36093EEn.LJI(PreDrawableInflate.class);
        LH4 iconData = c54113LLp.getIconData();
        this.LIZLLL = iconData;
        Integer num = iconData.LIZLLL.LJ;
        if (num != null) {
            c54113LLp.setId(num.intValue());
        }
        LJJ(iconData.LJFF);
        this.LIZIZ = iconData.LJ;
    }

    public final void LIZIZ(float f) {
        C54113LLp c54113LLp = this.LIZ;
        c54113LLp.setTabIconScaleX(f);
        c54113LLp.setTabIconScaleY(f);
        c54113LLp.setAvatarImageViewScaleX(f);
        c54113LLp.setAvatarImageViewScaleY(f);
        c54113LLp.setRedViewScaleX(f);
        c54113LLp.setRedViewScaleY(f);
    }

    public final void LIZLLL(boolean z) {
        int i;
        LJIIJ();
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "materialIconTab.context");
        if (z) {
            i = R.attr.dj;
        } else {
            i = R.attr.go;
        }
        Integer LJI = C79045V0n.LJI(i, context);
        if (LJI != null) {
            this.LIZ.setTabRefreshIconColor(LJI.intValue());
        }
    }

    public final void LJJ(LH5 value) {
        boolean z;
        o.LJIIIZ(value, "value");
        if (this.LJ != value) {
            this.LJ = value;
            C54113LLp c54113LLp = this.LIZ;
            if (value == LH5.SELECT) {
                z = true;
            } else {
                z = false;
            }
            c54113LLp.setSelected(z);
        }
    }
}
