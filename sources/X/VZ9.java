package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.lynx.tasm.behavior.ui.swiper.XSwiperUI;

/* loaded from: classes15.dex */
public final class VZ9 extends FrameLayout implements VPU {
    public final VZA LJLIL;
    public final LinearLayout LJLILLLLZI;
    public final int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public VOV LJLJLJ;

    public final void LIZ() {
        View view = new View(getContext());
        view.setClickable(false);
        int i = this.LJLJI;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        if (this.LJLJL == 1) {
            int i2 = this.LJLJI / 2;
            layoutParams.bottomMargin = i2;
            layoutParams.topMargin = i2;
        } else {
            int i3 = this.LJLJI / 2;
            layoutParams.rightMargin = i3;
            layoutParams.leftMargin = i3;
        }
        this.LJLILLLLZI.addView(view, layoutParams);
        int childCount = this.LJLILLLLZI.getChildCount();
        int i4 = this.LJLJJI;
        if (childCount == i4) {
            view.setBackground(LIZIZ(i4));
        } else {
            view.setBackground(LIZIZ(this.LJLJJL));
        }
    }

    public final void LIZJ() {
        for (int childCount = this.LJLILLLLZI.getChildCount() - 1; childCount > -1; childCount--) {
            View childAt = this.LJLILLLLZI.getChildAt(childCount);
            if (childCount == this.LJLJJLL) {
                childAt.setBackground(LIZIZ(this.LJLJJI));
            } else {
                childAt.setBackground(LIZIZ(this.LJLJJL));
            }
        }
    }

    public VZA getViewPager() {
        return this.LJLIL;
    }

    public VZ9(Context context) {
        super(context, null);
        this.LJLJJI = XSwiperUI.LLIIII;
        this.LJLJJL = XSwiperUI.LLIIIILZ;
        this.LJLJI = (int) V9Y.LIZ(7.0f);
        VZA vza = new VZA(context);
        this.LJLIL = vza;
        addView(vza, new FrameLayout.LayoutParams(-1, -1));
        this.LJLILLLLZI = new LinearLayout(context);
        LIZLLL(0);
    }

    public static final GradientDrawable LIZIZ(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    public final void LIZLLL(int i) {
        FrameLayout.LayoutParams layoutParams;
        if (i == 1) {
            this.LJLILLLLZI.setGravity(16);
            this.LJLILLLLZI.setOrientation(1);
            layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.rightMargin = (int) V9Y.LIZ(10.0f);
            layoutParams.gravity = 8388629;
        } else {
            this.LJLILLLLZI.setGravity(17);
            this.LJLILLLLZI.setOrientation(0);
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = (int) V9Y.LIZ(10.0f);
            layoutParams.gravity = 81;
        }
        addView(this.LJLILLLLZI, layoutParams);
        int childCount = this.LJLILLLLZI.getChildCount();
        this.LJLILLLLZI.removeAllViews();
        for (int i2 = 0; i2 < childCount; i2++) {
            LIZ();
        }
        LIZJ();
    }

    @Override // X.VPU
    public final void bindDrawChildHook(VOV vov) {
        this.LJLJLJ = vov;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.LJLJLJ.beforeDispatchDraw(canvas);
        super.dispatchDraw(canvas);
    }

    public void setIsRtl(boolean z) {
        if (z) {
            C16310kV.LJIIIZ(this.LJLILLLLZI, 1);
        } else {
            C16310kV.LJIIIZ(this.LJLILLLLZI, 0);
        }
        this.LJLIL.setIsRTL(z);
    }

    public void setOrientation(int i) {
        this.LJLJL = i;
        LinearLayout linearLayout = this.LJLILLLLZI;
        if (linearLayout != null) {
            if (C78996UzQ.LJJIIJZLJL(linearLayout)) {
                C78996UzQ.LJI();
            }
            removeView(linearLayout);
            LIZLLL(i);
        }
        getViewPager().setOrientation(i);
    }

    public void setSelected(int i) {
        this.LJLJJLL = i;
        LIZJ();
    }

    public void setSelectedColor(int i) {
        this.LJLJJI = i;
        for (int childCount = this.LJLILLLLZI.getChildCount() - 1; childCount > -1; childCount--) {
            if (childCount == this.LJLJJLL) {
                this.LJLILLLLZI.getChildAt(childCount).setBackground(LIZIZ(this.LJLJJI));
                return;
            }
        }
    }

    public void setUnSelectedColor(int i) {
        this.LJLJJL = i;
        for (int childCount = this.LJLILLLLZI.getChildCount() - 1; childCount > -1; childCount--) {
            if (childCount != this.LJLJJLL) {
                this.LJLILLLLZI.getChildAt(childCount).setBackground(LIZIZ(this.LJLJJL));
            }
        }
    }
}
