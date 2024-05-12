package X;

import Y.ACListenerS31S0101000_14;
import Y.IDLListenerS199S0100000_14;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip$SavedState;
import java.util.Locale;

/* renamed from: X.Vm4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80716Vm4 extends HorizontalScrollView {
    public static final int[] LLIIII = {R.attr.textSize, R.attr.textColor};
    public final LinearLayout.LayoutParams LJLIL;
    public final LinearLayout.LayoutParams LJLILLLLZI;
    public final C80717Vm5 LJLJI;
    public C0C3 LJLJJI;
    public final LinearLayout LJLJJL;
    public ViewPager LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public float LJLJLLL;
    public final Paint LJLL;
    public final Paint LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public int LJZI;
    public int LJZL;
    public int LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public ColorStateList LLFFF;
    public int LLFII;
    public int LLFZ;
    public final Locale LLI;
    public int LLIFFJFJJ;
    public int LLII;

    public final void LIZJ() {
        for (int i = 0; i < this.LJLJL; i++) {
            View childAt = this.LJLJJL.getChildAt(i);
            childAt.setBackgroundResource(this.LLFZ);
            Object tag = childAt.getTag();
            if (tag instanceof C80718Vm6) {
                C80718Vm6 c80718Vm6 = (C80718Vm6) tag;
                c80718Vm6.LIZ.setTextSize(0, this.LLFF);
                c80718Vm6.LIZ.setTypeface(C8HI.LIZJ().LIZLLL("regular"));
                c80718Vm6.LIZ.setTextColor(this.LLFFF);
                if (this.LJZ) {
                    c80718Vm6.LIZ.setAllCaps(true);
                }
            }
        }
    }

    public void setIconResId(int i) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final Parcelable onSaveInstanceState() {
        LivePagerSlidingTabStrip$SavedState livePagerSlidingTabStrip$SavedState = new LivePagerSlidingTabStrip$SavedState(super.onSaveInstanceState());
        livePagerSlidingTabStrip$SavedState.LJLIL = this.LJLJLJ;
        return livePagerSlidingTabStrip$SavedState;
    }

    public int getDividerColor() {
        return this.LJLLLLLL;
    }

    public int getDividerPadding() {
        return this.LLD;
    }

    public int getIndicatorColor() {
        return this.LJLLL;
    }

    public int getIndicatorHeight() {
        return this.LJZL;
    }

    public int getIndicatorWidth() {
        return this.LJLLILLLL;
    }

    public int getScrollOffset() {
        return this.LJZI;
    }

    public boolean getShouldExpand() {
        return this.LJLZ;
    }

    public int getTabBackground() {
        return this.LLFZ;
    }

    public int getTabPaddingLeftRight() {
        return this.LLF;
    }

    public LinearLayout getTabsContainer() {
        return this.LJLJJL;
    }

    public ColorStateList getTextColor() {
        return this.LLFFF;
    }

    public int getTextSize() {
        return this.LLFF;
    }

    public int getUnderlineColor() {
        return this.LJLLLL;
    }

    public int getUnderlineHeight() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (isInEditMode() || this.LJLJL == 0) {
            return;
        }
        int height = getHeight();
        this.LJLL.setColor(this.LJLLL);
        View childAt = this.LJLJJL.getChildAt(this.LJLJLJ);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.LJLJLLL > 0.0f && (i = this.LJLJLJ) < this.LJLJL - 1) {
            View childAt2 = this.LJLJJL.getChildAt(i + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f = this.LJLJLLL;
            left = C06420Na.LIZIZ(1.0f, f, left, left2 * f);
            right = C06420Na.LIZIZ(1.0f, f, right, right2 * f);
        }
        int i2 = this.LJLLILLLL;
        if (i2 != 0) {
            float f2 = ((right - left) - i2) / 2.0f;
            left += f2;
            right -= f2;
        }
        int i3 = this.LJLLJ;
        if (i3 > 0 && Build.VERSION.SDK_INT > 21) {
            int i4 = height - this.LJZL;
            int i5 = this.LLIFFJFJJ;
            canvas.drawRoundRect(left, i4 - i5, right, height - i5, i3, i3, this.LJLL);
        } else {
            int i6 = height - this.LJZL;
            int i7 = this.LLIFFJFJJ;
            canvas.drawRect(left, i6 - i7, right, height - i7, this.LJLL);
        }
        this.LJLL.setColor(this.LJLLLL);
        canvas.drawRect(0.0f, height - this.LL, this.LJLJJL.getWidth(), height, this.LJLL);
        this.LJLLI.setColor(this.LJLLLLLL);
        for (int i8 = 0; i8 < this.LJLJL - 1; i8++) {
            View childAt3 = this.LJLJJL.getChildAt(i8);
            canvas.drawLine(childAt3.getRight(), this.LLD, childAt3.getRight(), height - this.LLD, this.LJLLI);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        LivePagerSlidingTabStrip$SavedState livePagerSlidingTabStrip$SavedState = (LivePagerSlidingTabStrip$SavedState) parcelable;
        super.onRestoreInstanceState(livePagerSlidingTabStrip$SavedState.getSuperState());
        this.LJLJLJ = livePagerSlidingTabStrip$SavedState.LJLIL;
        requestLayout();
    }

    public void setAllCaps(boolean z) {
        this.LJZ = z;
    }

    public void setDividerColor(int i) {
        this.LJLLLLLL = i;
        invalidate();
    }

    public void setDividerColorResource(int i) {
        this.LJLLLLLL = getResources().getColor(i);
        invalidate();
    }

    public void setDividerPadding(int i) {
        this.LLD = i;
        invalidate();
    }

    public void setIndicatorBottomMargin(int i) {
        this.LLIFFJFJJ = i;
    }

    public void setIndicatorColor(int i) {
        this.LJLLL = i;
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        this.LJLLL = getResources().getColor(i);
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.LJZL = i;
        invalidate();
    }

    public void setIndicatorRadius(int i) {
        this.LJLLJ = i;
        LIZJ();
    }

    public void setIndicatorWidth(int i) {
        this.LJLLILLLL = i;
        LIZJ();
    }

    public void setOnPageChangeListener(C0C3 c0c3) {
        this.LJLJJI = c0c3;
    }

    public void setScrollOffset(int i) {
        this.LJZI = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.LJLZ = z;
        requestLayout();
    }

    public void setTabBackground(int i) {
        this.LLFZ = i;
    }

    public void setTabPaddingLeftRight(int i) {
        this.LLF = i;
        LIZJ();
    }

    public void setTextColor(int i) {
        this.LLFFF = ColorStateList.valueOf(i);
        LIZJ();
    }

    public void setTextColorResource(int i) {
        this.LLFFF = getResources().getColorStateList(i);
        LIZJ();
    }

    public void setTextSelectedStyle(int i) {
        this.LLII = i;
    }

    public void setTextSize(int i) {
        this.LLFF = i;
        LIZJ();
    }

    public void setUnderlineColor(int i) {
        this.LJLLLL = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i) {
        this.LJLLLL = getResources().getColor(i);
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        this.LL = i;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.LJLJJLL = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.LJLJI);
            this.LJLJJL.removeAllViews();
            this.LJLJL = this.LJLJJLL.getAdapter().getCount();
            for (int i = 0; i < this.LJLJL; i++) {
                if (this.LJLJJLL.getAdapter() instanceof InterfaceC80719Vm7) {
                    InterfaceC80719Vm7 interfaceC80719Vm7 = (InterfaceC80719Vm7) this.LJLJJLL.getAdapter();
                    getContext();
                    LIZ(i, interfaceC80719Vm7.LIZJ(i));
                } else if (this.LJLJJLL.getAdapter() instanceof InterfaceC80720Vm8) {
                    int LIZ = ((InterfaceC80720Vm8) this.LJLJJLL.getAdapter()).LIZ();
                    ImageButton imageButton = new ImageButton(getContext());
                    imageButton.setImageResource(LIZ);
                    LIZ(i, imageButton);
                } else {
                    CharSequence LJIILIIL = this.LJLJJLL.getAdapter().LJIILIIL(i);
                    if (LJIILIIL != null) {
                        String charSequence = LJIILIIL.toString();
                        C80718Vm6 c80718Vm6 = new C80718Vm6();
                        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), com.zhiliaoapp.musically.R.layout.d8k, null, false);
                        c80718Vm6.LIZ = (TextView) LLLLIILL.findViewById(com.zhiliaoapp.musically.R.id.text);
                        View findViewById = LLLLIILL.findViewById(com.zhiliaoapp.musically.R.id.cf5);
                        c80718Vm6.LIZIZ = findViewById;
                        findViewById.setVisibility(8);
                        c80718Vm6.LIZ.setText(charSequence);
                        c80718Vm6.LIZ.setGravity(17);
                        c80718Vm6.LIZ.setSingleLine();
                        LLLLIILL.setTag(c80718Vm6);
                        LIZ(i, LLLLIILL);
                    }
                }
            }
            LIZJ();
            getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS199S0100000_14(this, 0));
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter INSTANCE.");
    }

    public C80716Vm4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJI = new C80717Vm5(this);
        this.LJLJLJ = 0;
        this.LJLJLLL = 0.0f;
        this.LJLLILLLL = 0;
        this.LJLLJ = 0;
        this.LJLLL = 16737894;
        this.LJLLLL = 436207616;
        this.LJLLLLLL = 436207616;
        this.LJLZ = false;
        this.LJZ = true;
        this.LJZI = 52;
        this.LJZL = 8;
        this.LL = 2;
        this.LLD = 12;
        this.LLF = 24;
        this.LLFF = 12;
        this.LLFFF = ColorStateList.valueOf(16737894);
        this.LLFII = 0;
        this.LLFZ = com.zhiliaoapp.musically.R.drawable.c_x;
        this.LLIFFJFJJ = 0;
        this.LLII = 0;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.LJLJJL = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.LJZI = (int) TypedValue.applyDimension(1, this.LJZI, displayMetrics);
        this.LJZL = (int) TypedValue.applyDimension(1, this.LJZL, displayMetrics);
        this.LL = (int) TypedValue.applyDimension(1, this.LL, displayMetrics);
        this.LLD = (int) TypedValue.applyDimension(1, this.LLD, displayMetrics);
        this.LLF = (int) TypedValue.applyDimension(1, this.LLF, displayMetrics);
        int applyDimension = (int) TypedValue.applyDimension(1, 1, displayMetrics);
        this.LLFF = (int) TypedValue.applyDimension(2, this.LLFF, displayMetrics);
        this.LJLLILLLL = (int) TypedValue.applyDimension(1, this.LJLLILLLL, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LLIIII);
        this.LLFF = obtainStyledAttributes.getDimensionPixelSize(0, this.LLFF);
        this.LLFFF = obtainStyledAttributes.getColorStateList(1);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{com.zhiliaoapp.musically.R.attr.bgv, com.zhiliaoapp.musically.R.attr.bgw, com.zhiliaoapp.musically.R.attr.bgx, com.zhiliaoapp.musically.R.attr.bgy, com.zhiliaoapp.musically.R.attr.bgz, com.zhiliaoapp.musically.R.attr.bh0, com.zhiliaoapp.musically.R.attr.bh1, com.zhiliaoapp.musically.R.attr.bh2, com.zhiliaoapp.musically.R.attr.bh3, com.zhiliaoapp.musically.R.attr.bh4, com.zhiliaoapp.musically.R.attr.bh5, com.zhiliaoapp.musically.R.attr.bh6, com.zhiliaoapp.musically.R.attr.bh7, com.zhiliaoapp.musically.R.attr.bh8, com.zhiliaoapp.musically.R.attr.bh9, com.zhiliaoapp.musically.R.attr.bh_});
        this.LJLLL = obtainStyledAttributes2.getColor(3, this.LJLLL);
        this.LJLLLL = obtainStyledAttributes2.getColor(14, this.LJLLLL);
        this.LJLLLLLL = obtainStyledAttributes2.getColor(1, this.LJLLLLLL);
        this.LJZL = obtainStyledAttributes2.getDimensionPixelSize(4, this.LJZL);
        this.LL = obtainStyledAttributes2.getDimensionPixelSize(15, this.LL);
        this.LLD = obtainStyledAttributes2.getDimensionPixelSize(2, this.LLD);
        this.LLF = obtainStyledAttributes2.getDimensionPixelSize(7, this.LLF);
        this.LLFZ = obtainStyledAttributes2.getResourceId(0, this.LLFZ);
        this.LJLZ = obtainStyledAttributes2.getBoolean(9, this.LJLZ);
        this.LJZI = obtainStyledAttributes2.getDimensionPixelSize(8, this.LJZI);
        this.LJZ = obtainStyledAttributes2.getBoolean(10, this.LJZ);
        this.LLFF = obtainStyledAttributes2.getDimensionPixelSize(12, this.LLFF);
        this.LLFFF = obtainStyledAttributes2.getColorStateList(11);
        this.LJLLILLLL = obtainStyledAttributes2.getDimensionPixelSize(6, this.LJLLILLLL);
        this.LJLLJ = obtainStyledAttributes2.getDimensionPixelSize(5, 0);
        obtainStyledAttributes2.recycle();
        Paint paint = new Paint();
        this.LJLL = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.LJLLI = paint2;
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(applyDimension);
        this.LJLIL = new LinearLayout.LayoutParams(-2, -1);
        this.LJLILLLLZI = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.LLI == null) {
            this.LLI = getResources().getConfiguration().locale;
        }
        if (this.LLFFF == null) {
            this.LLFFF = ColorStateList.valueOf(16737894);
        }
    }

    public final void LIZ(int i, View view) {
        LinearLayout.LayoutParams layoutParams;
        view.setFocusable(true);
        C16880lQ.LJIIJ(new ACListenerS31S0101000_14(i, this, 0), view);
        int i2 = this.LLF;
        view.setPadding(i2, 0, i2, 0);
        if (CCJ.LIZ(getContext())) {
            int i3 = this.LLF;
            view.setPaddingRelative(i3, 0, i3, 0);
        }
        LinearLayout linearLayout = this.LJLJJL;
        if (this.LJLZ) {
            layoutParams = this.LJLILLLLZI;
        } else {
            layoutParams = this.LJLIL;
        }
        linearLayout.addView(view, i, layoutParams);
    }

    public final void LIZIZ(int i, int i2) {
        int left;
        if (this.LJLJL == 0) {
            return;
        }
        if (CCJ.LIZ(getContext())) {
            left = this.LJLJJL.getChildAt(i).getLeft() - i2;
        } else {
            left = this.LJLJJL.getChildAt(i).getLeft() + i2;
        }
        if (i > 0 || i2 > 0) {
            left -= this.LJZI;
        }
        if (left != this.LLFII) {
            this.LLFII = left;
            scrollTo(left, 0);
        }
    }

    public final void LIZLLL(int i, boolean z) {
        int childCount = this.LJLJJL.getChildCount();
        if (childCount == 0 || i < 0 || i >= childCount) {
            return;
        }
        View childAt = this.LJLJJL.getChildAt(i);
        childAt.setSelected(z);
        Object tag = childAt.getTag();
        if (!(tag instanceof C80718Vm6)) {
            return;
        }
        C80718Vm6 c80718Vm6 = (C80718Vm6) tag;
        if (this.LLII != 1) {
            return;
        }
        if (z) {
            c80718Vm6.LIZ.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        } else {
            c80718Vm6.LIZ.setTypeface(C8HI.LIZJ().LIZLLL("regular"));
        }
    }
}
