package X;

import Y.IDAListenerS69S0100000;
import Y.IDUListenerS263S0100000;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

@C0C0
/* renamed from: X.0KV, reason: invalid class name */
/* loaded from: classes.dex */
public class C0KV extends HorizontalScrollView {
    public static final C43051mX LLILZ = new C43051mX(16);
    public final ArrayList<C0KT> LJLIL;
    public C0KT LJLILLLLZI;
    public final RectF LJLJI;
    public final C0KS LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public final int LJLLI;
    public ColorStateList LJLLILLLL;
    public ColorStateList LJLLJ;
    public ColorStateList LJLLL;
    public final ColorStateList LJLLLL;
    public final ColorStateList LJLLLLLL;
    public Drawable LJLZ;
    public final float LJZ;
    public final float LJZI;
    public final int LJZL;
    public int LL;
    public final int LLD;
    public final int LLF;
    public final int LLFF;
    public final int LLFFF;
    public int LLFII;
    public final int LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public C0KN LLIIIJ;
    public final ArrayList<C0KN> LLIIIL;
    public C30201Gm LLIIIZ;
    public ValueAnimator LLIIJI;
    public ViewPager LLIIJLIL;
    public PagerAdapter LLIIL;
    public C0KP LLIILII;
    public C30191Gl LLIILZL;
    public C30181Gk LLIIZ;
    public boolean LLIL;
    public final C1UB LLILII;
    public boolean LLILIL;
    public final Rect LLILL;
    public C0KO LLILLIZIL;
    public final SparseBooleanArray LLILLJJLI;
    public boolean LLILLL;

    private int getDefaultHeight() {
        int size = this.LJLIL.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C0KT c0kt = (C0KT) ListProtector.get(this.LJLIL, i);
            if (c0kt != null && c0kt.LIZIZ != null && !TextUtils.isEmpty(c0kt.LIZJ)) {
                if (!this.LLII) {
                    return 72;
                }
            } else {
                i++;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.LLD;
        if (i != -1) {
            return i;
        }
        if (this.LLIFFJFJJ == 0) {
            return this.LLFF;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.LJLJJI.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public final void LJ() {
        int i;
        if (this.LLIFFJFJJ == 0) {
            i = Math.max(0, this.LLFFF - this.LJLJL);
        } else {
            i = 0;
        }
        C16310kV.LJIIJ(this.LJLJJI, i, 0, 0, 0);
        int i2 = this.LLIFFJFJJ;
        if (i2 != 0) {
            if (i2 == 1) {
                this.LJLJJI.setGravity(1);
            }
        } else {
            this.LJLJJI.setGravity(8388611);
        }
        for (int i3 = 0; i3 < this.LJLJJI.getChildCount(); i3++) {
            View childAt = this.LJLJJI.getChildAt(i3);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.LLIFFJFJJ == 1 && this.LLFII == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            childAt.requestLayout();
        }
    }

    public final void LJFF() {
        C0KU c0ku;
        boolean localVisibleRect;
        if (!this.LLILLL || this.LLILLIZIL == null) {
            return;
        }
        for (int i = 0; i < getTabCount(); i++) {
            C0KT LJIIJ = LJIIJ(i);
            if (LJIIJ != null && (c0ku = LJIIJ.LJIIIIZZ) != null && (localVisibleRect = c0ku.getLocalVisibleRect(this.LLILL)) != this.LLILLJJLI.get(i, false)) {
                this.LLILLJJLI.put(i, localVisibleRect);
                if (localVisibleRect) {
                    this.LLILLIZIL.LIZIZ(i);
                } else {
                    this.LLILLIZIL.LIZ();
                }
            }
        }
    }

    public final void LJIIIZ() {
        if (this.LLIIJI == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LLIIJI = valueAnimator;
            valueAnimator.setInterpolator(C80237VeL.LIZIZ);
            this.LLIIJI.setDuration(this.LLFZ);
            this.LLIIJI.addUpdateListener(new IDUListenerS263S0100000(this, 11));
            this.LLIIJI.addListener(new IDAListenerS69S0100000(this, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0KT LJIIJJI() {
        C0KU c0ku;
        C0KT c0kt = (C0KT) LLILZ.LIZIZ();
        if (c0kt == null) {
            c0kt = new C0KT();
        }
        c0kt.LJII = this;
        C1UB c1ub = this.LLILII;
        if (c1ub == null || (c0ku = (C0KU) c1ub.LIZIZ()) == null) {
            c0ku = new C0KU(this, getContext());
        }
        c0ku.setTab(c0kt);
        c0ku.setFocusable(true);
        c0ku.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c0kt.LJ)) {
            c0ku.setContentDescription(c0kt.LIZJ);
        } else {
            c0ku.setContentDescription(c0kt.LJ);
        }
        c0kt.LJIIIIZZ = c0ku;
        return c0kt;
    }

    public final void LJIILIIL() {
        for (int childCount = this.LJLJJI.getChildCount() - 1; childCount >= 0; childCount--) {
            C0KU c0ku = (C0KU) this.LJLJJI.getChildAt(childCount);
            C0KS c0ks = this.LJLJJI;
            try {
                if (C78996UzQ.LJJIIJZLJL(c0ks.getChildAt(childCount))) {
                    C78996UzQ.LJI();
                }
            } catch (Throwable unused) {
            }
            c0ks.removeViewAt(childCount);
            if (c0ku != null) {
                c0ku.setTab(null);
                c0ku.setSelected(false);
                this.LLILII.LIZ(c0ku);
            }
            requestLayout();
        }
        Iterator<C0KT> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            C0KT next = it.next();
            it.remove();
            next.LJII = null;
            next.LJIIIIZZ = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LIZJ = null;
            next.LJ = null;
            next.LJFF = -1;
            next.LJI = null;
            next.LIZLLL = true;
            LLILZ.LIZ(next);
        }
        this.LJLILLLLZI = null;
    }

    public int getSelectedTabPosition() {
        C0KT c0kt = this.LJLILLLLZI;
        if (c0kt != null) {
            return c0kt.LJFF;
        }
        return -1;
    }

    public int getTabCount() {
        return this.LJLIL.size();
    }

    public final void LJIIL() {
        int currentItem;
        LJIILIIL();
        PagerAdapter pagerAdapter = this.LLIIL;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                C0KT LJIIJJI = LJIIJJI();
                LJIIJJI.LIZIZ(this.LLIIL.LJIILIIL(i));
                LIZIZ(this.LJLIL.size(), LJIIJJI, false);
            }
            ViewPager viewPager = this.LLIIJLIL;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                LJIILJJIL(LJIIJ(currentItem), true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLIIJLIL == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                LJIIZILJ((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLIL) {
            setupWithViewPager(null);
            this.LLIL = false;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    public int getTabGravity() {
        return this.LLFII;
    }

    public ColorStateList getTabIconTint() {
        return this.LJLLJ;
    }

    public int getTabIndicatorGravity() {
        return this.LLI;
    }

    public int getTabMaxWidth() {
        return this.LL;
    }

    public int getTabMode() {
        return this.LLIFFJFJJ;
    }

    public ColorStateList getTabRippleColor() {
        return this.LJLLL;
    }

    public Drawable getTabSelectedIndicator() {
        return this.LJLZ;
    }

    public ColorStateList getTabTextColors() {
        return this.LJLLILLLL;
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.LJLJJI.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.LJLJJI.getChildAt(i2);
                boolean z2 = true;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (i2 != i) {
                    z2 = false;
                }
                childAt.setActivated(z2);
            }
        }
    }

    public final void LIZ(C0KN c0kn) {
        if (!this.LLIIIL.contains(c0kn)) {
            this.LLIIIL.add(c0kn);
        }
    }

    public final void LIZJ(View view) {
        if (view instanceof C80264Vem) {
            C0KT LJIIJJI = LJIIJJI();
            view.getClass();
            if (!TextUtils.isEmpty(view.getContentDescription())) {
                LJIIJJI.LJ = view.getContentDescription();
                LJIIJJI.LIZJ();
            }
            LIZIZ(this.LJLIL.size(), LJIIJJI, this.LJLIL.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void LIZLLL(int i) {
        if (i != -1) {
            if (getWindowToken() != null && C16330kX.LIZJ(this)) {
                C0KS c0ks = this.LJLJJI;
                int childCount = c0ks.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (c0ks.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int LJI = LJI(i, 0.0f);
                if (scrollX != LJI) {
                    LJIIIZ();
                    this.LLIIJI.setIntValues(scrollX, LJI);
                    this.LLIIJI.start();
                }
                this.LJLJJI.LIZ(i, this.LLFZ);
                return;
            }
            LJIILLIIL(i, 0.0f, true, true);
        }
    }

    public final int LJIIIIZZ(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public final C0KT LJIIJ(int i) {
        if (i >= 0 && i < getTabCount()) {
            return (C0KT) ListProtector.get(this.LJLIL, i);
        }
        return null;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        LIZJ(view);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C0KU c0ku;
        Drawable drawable;
        for (int i = 0; i < this.LJLJJI.getChildCount(); i++) {
            View childAt = this.LJLJJI.getChildAt(i);
            if ((childAt instanceof C0KU) && (drawable = (c0ku = (C0KU) childAt).LJLJL) != null) {
                drawable.setBounds(c0ku.getLeft(), c0ku.getTop(), c0ku.getRight(), c0ku.getBottom());
                c0ku.LJLJL.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void setInlineLabel(boolean z) {
        if (this.LLII != z) {
            this.LLII = z;
            for (int i = 0; i < this.LJLJJI.getChildCount(); i++) {
                View childAt = this.LJLJJI.getChildAt(i);
                if (childAt instanceof C0KU) {
                    C0KU c0ku = (C0KU) childAt;
                    c0ku.setOrientation(!c0ku.LJLJLLL.LLII ? 1 : 0);
                    TextView textView = c0ku.LJLJJL;
                    if (textView == null && c0ku.LJLJJLL == null) {
                        c0ku.LIZJ(c0ku.LJLILLLLZI, c0ku.LJLJI);
                    } else {
                        c0ku.LIZJ(textView, c0ku.LJLJJLL);
                    }
                }
            }
            LJ();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setOnTabSelectedListener(C0KN c0kn) {
        C0KN c0kn2 = this.LLIIIJ;
        if (c0kn2 != null) {
            this.LLIIIL.remove(c0kn2);
        }
        this.LLIIIJ = c0kn;
        if (c0kn != null) {
            LIZ(c0kn);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        LJIIIZ();
        this.LLIIJI.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C20110qd.LIZ(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        C0KS c0ks = this.LJLJJI;
        if (c0ks.LJLILLLLZI.getColor() != i) {
            c0ks.LJLILLLLZI.setColor(i);
            C16300kU.LJIIJ(c0ks);
        }
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.LLI != i) {
            this.LLI = i;
            C16300kU.LJIIJ(this.LJLJJI);
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        C0KS c0ks = this.LJLJJI;
        if (c0ks.LJLIL != i) {
            c0ks.LJLIL = i;
            C16300kU.LJIIJ(c0ks);
        }
    }

    public void setTabGravity(int i) {
        if (this.LLFII != i) {
            this.LLFII = i;
            LJ();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.LJLLJ != colorStateList) {
            this.LJLLJ = colorStateList;
            int size = this.LJLIL.size();
            for (int i = 0; i < size; i++) {
                ((C0KT) ListProtector.get(this.LJLIL, i)).LIZJ();
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C04330Ez.LIZJ(i, getContext()));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.LLIIII = z;
        C16300kU.LJIIJ(this.LJLJJI);
    }

    public void setTabMode(int i) {
        if (i != this.LLIFFJFJJ) {
            this.LLIFFJFJJ = i;
            LJ();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.LJLLL != colorStateList) {
            this.LJLLL = colorStateList;
            for (int i = 0; i < this.LJLJJI.getChildCount(); i++) {
                View childAt = this.LJLJJI.getChildAt(i);
                if (childAt instanceof C0KU) {
                    ((C0KU) childAt).LIZIZ(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C04330Ez.LIZJ(i, getContext()));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.LJLLILLLL != colorStateList) {
            this.LJLLILLLL = colorStateList;
            int size = this.LJLIL.size();
            for (int i = 0; i < size; i++) {
                ((C0KT) ListProtector.get(this.LJLIL, i)).LIZJ();
            }
        }
    }

    public void setTabVisibilityChangeListener(C0KO c0ko) {
        this.LLILLIZIL = c0ko;
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        LJIILL(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.LLIIIILZ != z) {
            this.LLIIIILZ = z;
            for (int i = 0; i < this.LJLJJI.getChildCount(); i++) {
                View childAt = this.LJLJJI.getChildAt(i);
                if (childAt instanceof C0KU) {
                    ((C0KU) childAt).LIZIZ(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        LJIIZILJ(viewPager, false);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.LJLZ != drawable) {
            this.LJLZ = drawable;
            C16300kU.LJIIJ(this.LJLJJI);
        }
    }

    public C0KV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.bgp);
        int i;
        int i2;
        int i3;
        int i4;
        this.LLILL = new Rect();
        this.LLILLJJLI = new SparseBooleanArray();
        this.LLILLL = false;
        this.LJLIL = new ArrayList<>();
        this.LJLJI = new RectF();
        this.LL = Integer.MAX_VALUE;
        this.LLIIIL = new ArrayList<>();
        this.LLILII = new C1UB(12);
        setHorizontalScrollBarEnabled(false);
        C0KS c0ks = new C0KS(this, context);
        this.LJLJJI = c0ks;
        super.addView(c0ks, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray LIZLLL = C80244VeS.LIZLLL(context, attributeSet, new int[]{R.attr.bfz, R.attr.bg0, R.attr.bg1, R.attr.bg2, R.attr.bg3, R.attr.bg4, R.attr.bg5, R.attr.bg6, R.attr.bg7, R.attr.bg_, R.attr.bga, R.attr.bgb, R.attr.bgc, R.attr.bgd, R.attr.bge, R.attr.bgf, R.attr.bgg, R.attr.bgh, R.attr.bgi, R.attr.bgj, R.attr.bgk, R.attr.bgl, R.attr.bgm, R.attr.bgq, R.attr.bgr, R.attr.bgu}, R.attr.bgp, R.style.y_, 23);
        int dimensionPixelSize = LIZLLL.getDimensionPixelSize(11, -1);
        if (c0ks.LJLIL != dimensionPixelSize) {
            c0ks.LJLIL = dimensionPixelSize;
            C16300kU.LJIIJ(c0ks);
        }
        setSelectedTabIndicator(C80285Vf7.LIZLLL(context, LIZLLL, 5));
        setSelectedTabIndicatorGravity(LIZLLL.getInt(10, 0));
        setTabIndicatorFullWidth(LIZLLL.getBoolean(9, true));
        int dimensionPixelSize2 = LIZLLL.getDimensionPixelSize(16, 0);
        this.LJLL = dimensionPixelSize2;
        this.LJLJLLL = dimensionPixelSize2;
        this.LJLJLJ = dimensionPixelSize2;
        this.LJLJL = dimensionPixelSize2;
        this.LJLJL = LIZLLL.getDimensionPixelSize(19, dimensionPixelSize2);
        this.LJLJLJ = LIZLLL.getDimensionPixelSize(20, dimensionPixelSize2);
        this.LJLJLLL = LIZLLL.getDimensionPixelSize(18, dimensionPixelSize2);
        this.LJLL = LIZLLL.getDimensionPixelSize(17, dimensionPixelSize2);
        int resourceId = LIZLLL.getResourceId(23, R.style.nv);
        this.LJLLI = resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, new int[]{android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.textColorLink, android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, android.R.attr.fontFamily, android.R.attr.textFontWeight, R.attr.ae9, R.attr.aei, R.attr.bhl, R.attr.bih});
        try {
            this.LJZ = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.LJLLILLLL = C80285Vf7.LIZ(context, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (LIZLLL.hasValue(24)) {
                this.LJLLILLLL = C80285Vf7.LIZ(context, LIZLLL, 24);
            }
            if (LIZLLL.hasValue(22)) {
                this.LJLLILLLL = LJII(this.LJLLILLLL.getDefaultColor(), LIZLLL.getColor(22, 0));
            }
            this.LJLLJ = C80285Vf7.LIZ(context, LIZLLL, 3);
            C80250VeY.LIZLLL(LIZLLL.getInt(4, -1), null);
            this.LJLLL = C80285Vf7.LIZ(context, LIZLLL, 21);
            this.LLFZ = LIZLLL.getInt(6, 300);
            this.LLD = LIZLLL.getDimensionPixelSize(14, -1);
            this.LLF = LIZLLL.getDimensionPixelSize(13, -1);
            this.LJZL = LIZLLL.getResourceId(0, 0);
            this.LLFFF = LIZLLL.getDimensionPixelSize(1, 0);
            this.LLIFFJFJJ = LIZLLL.getInt(15, 1);
            this.LLFII = LIZLLL.getInt(2, 0);
            this.LLII = LIZLLL.getBoolean(12, false);
            this.LLIIIILZ = LIZLLL.getBoolean(25, false);
            LIZLLL.recycle();
            Resources resources = getResources();
            this.LJZI = resources.getDimensionPixelSize(R.dimen.mz);
            this.LLFF = resources.getDimensionPixelSize(R.dimen.mx);
            LJ();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bg8, R.attr.bg9, R.attr.bgn, R.attr.bgo, R.attr.bgs, R.attr.bgt}, R.attr.bgp, 0);
            if (obtainStyledAttributes2.hasValue(5)) {
                i = obtainStyledAttributes2.getColor(5, 0);
            } else {
                i = 0;
            }
            if (obtainStyledAttributes2.hasValue(3)) {
                i2 = obtainStyledAttributes2.getColor(3, 0);
            } else {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                this.LJLLLL = LJII(i, i2);
            }
            if (obtainStyledAttributes2.hasValue(4)) {
                i3 = obtainStyledAttributes2.getColor(4, 0);
            } else {
                i3 = 0;
            }
            if (obtainStyledAttributes2.hasValue(2)) {
                i4 = obtainStyledAttributes2.getColor(2, 0);
            } else {
                i4 = 0;
            }
            if (i3 != 0 || i4 != 0) {
                this.LJLLLLLL = LJII(i3, i4);
            }
            this.LJLJJL = obtainStyledAttributes2.getColor(1, 0);
            this.LJLJJLL = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static ColorStateList LJII(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public final int LJI(int i, float f) {
        View view;
        int i2;
        int i3;
        int i4 = 0;
        if (this.LLIFFJFJJ != 0) {
            return 0;
        }
        View childAt = this.LJLJJI.getChildAt(i);
        int i5 = i + 1;
        if (i5 < this.LJLJJI.getChildCount()) {
            view = this.LJLJJI.getChildAt(i5);
        } else {
            view = null;
        }
        if (childAt != null) {
            i2 = childAt.getWidth();
        } else {
            i2 = 0;
        }
        if (view != null) {
            i3 = view.getWidth();
        } else {
            i3 = 0;
        }
        if (childAt != null) {
            i4 = childAt.getLeft();
        }
        int width = ((i2 / 2) + i4) - (getWidth() / 2);
        int i6 = (int) ((i2 + i3) * 0.5f * f);
        if (C16310kV.LIZLLL(this) == 0) {
            return width + i6;
        }
        return width - i6;
    }

    public final void LJIILJJIL(C0KT c0kt, boolean z) {
        int i;
        C0KT c0kt2 = this.LJLILLLLZI;
        if (c0kt2 == c0kt) {
            if (c0kt2 != null) {
                for (int size = this.LLIIIL.size() - 1; size >= 0; size--) {
                    ((C0KN) ListProtector.get(this.LLIIIL, size)).LIZ();
                }
                LIZLLL(c0kt.LJFF);
                return;
            }
            return;
        }
        if (c0kt != null) {
            i = c0kt.LJFF;
        } else {
            i = -1;
        }
        if (z) {
            if ((c0kt2 == null || c0kt2.LJFF == -1) && i != -1) {
                LJIILLIIL(i, 0.0f, true, true);
            } else {
                LIZLLL(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.LJLILLLLZI = c0kt;
        if (c0kt2 != null) {
            for (int size2 = this.LLIIIL.size() - 1; size2 >= 0; size2--) {
                ((C0KN) ListProtector.get(this.LLIIIL, size2)).LIZJ(c0kt2);
            }
        }
        if (c0kt != null) {
            for (int size3 = this.LLIIIL.size() - 1; size3 >= 0; size3--) {
                ((C0KN) ListProtector.get(this.LLIIIL, size3)).LIZIZ(c0kt);
            }
        }
        C0KT c0kt3 = this.LJLILLLLZI;
        Iterator<C0KT> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            C0KT next = it.next();
            boolean z2 = c0kt3.LIZLLL;
            C0KU c0ku = next.LJIIIIZZ;
            if (c0ku != null) {
                if (z2) {
                    ColorStateList colorStateList = c0ku.LJLJLLL.LJLLLL;
                    if (colorStateList != null) {
                        c0ku.LJLILLLLZI.setTextColor(colorStateList);
                    }
                } else {
                    ColorStateList colorStateList2 = c0ku.LJLJLLL.LJLLLLLL;
                    if (colorStateList2 != null) {
                        c0ku.LJLILLLLZI.setTextColor(colorStateList2);
                    }
                }
            }
        }
        if (this.LJLILLLLZI.LIZLLL) {
            setSelectedTabIndicatorColor(this.LJLJJL);
        } else {
            setSelectedTabIndicatorColor(this.LJLJJLL);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0KP] */
    public final void LJIILL(PagerAdapter pagerAdapter, boolean z) {
        C0KP c0kp;
        PagerAdapter pagerAdapter2 = this.LLIIL;
        if (pagerAdapter2 != null && (c0kp = this.LLIILII) != null) {
            pagerAdapter2.LJJII(c0kp);
        }
        this.LLIIL = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.LLIILII == null) {
                this.LLIILII = new DataSetObserver() { // from class: X.0KP
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        C0KV.this.LJIIL();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        C0KV.this.LJIIL();
                    }
                };
            }
            pagerAdapter.LJIJ(this.LLIILII);
        }
        LJIIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0KN, X.1Gm] */
    public final void LJIIZILJ(final ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.LLIIJLIL;
        if (viewPager2 != null) {
            C30191Gl c30191Gl = this.LLIILZL;
            if (c30191Gl != null) {
                viewPager2.removeOnPageChangeListener(c30191Gl);
            }
            C30181Gk c30181Gk = this.LLIIZ;
            if (c30181Gk != null) {
                this.LLIIJLIL.removeOnAdapterChangeListener(c30181Gk);
            }
        }
        C30201Gm c30201Gm = this.LLIIIZ;
        if (c30201Gm != null) {
            this.LLIIIL.remove(c30201Gm);
            this.LLIIIZ = null;
        }
        if (viewPager != null) {
            this.LLIIJLIL = viewPager;
            if (this.LLIILZL == null) {
                this.LLIILZL = new C30191Gl(this);
            }
            C30191Gl c30191Gl2 = this.LLIILZL;
            c30191Gl2.LJLJI = 0;
            c30191Gl2.LJLILLLLZI = 0;
            viewPager.addOnPageChangeListener(c30191Gl2);
            ?? r0 = new C0KN(viewPager) { // from class: X.1Gm
                public final ViewPager LIZ;

                @Override // X.C0KN
                public final void LIZ() {
                }

                @Override // X.C0KN
                public final void LIZJ(C0KT c0kt) {
                }

                {
                    this.LIZ = viewPager;
                }

                @Override // X.C0KN
                public final void LIZIZ(C0KT c0kt) {
                    this.LIZ.setCurrentItem(c0kt.LJFF);
                }
            };
            this.LLIIIZ = r0;
            LIZ(r0);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                LJIILL(adapter, true);
            }
            if (this.LLIIZ == null) {
                this.LLIIZ = new C30181Gk(this);
            }
            C30181Gk c30181Gk2 = this.LLIIZ;
            c30181Gk2.LJLIL = true;
            viewPager.addOnAdapterChangeListener(c30181Gk2);
            LJIILLIIL(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.LLIIJLIL = null;
            LJIILL(null, false);
        }
        this.LLIL = z;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        LIZJ(view);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingBottom = getPaddingBottom() + getPaddingTop() + LJIIIIZZ(getDefaultHeight());
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(i2)), 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.LLF;
            if (i3 <= 0) {
                i3 = size - LJIIIIZZ(56);
            }
            this.LL = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.LLIFFJFJJ;
            if (i4 != 0) {
                if (i4 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        LIZJ(view);
    }

    public final void LIZIZ(int i, C0KT c0kt, boolean z) {
        this.LLILIL = true;
        if (c0kt.LJII == this) {
            c0kt.LJFF = i;
            ListProtector.add(this.LJLIL, i, c0kt);
            int size = this.LJLIL.size();
            while (true) {
                i++;
                if (i >= size) {
                    break;
                } else {
                    ((C0KT) ListProtector.get(this.LJLIL, i)).LJFF = i;
                }
            }
            C0KU c0ku = c0kt.LJIIIIZZ;
            C0KS c0ks = this.LJLJJI;
            int i2 = c0kt.LJFF;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.LLIFFJFJJ == 1 && this.LLFII == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            c0ks.addView(c0ku, i2, layoutParams);
            if (z) {
                c0kt.LIZ();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LIZJ(view);
    }

    public final void LJIILLIIL(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round >= 0 && round < this.LJLJJI.getChildCount()) {
            if (z2) {
                C0KS c0ks = this.LJLJJI;
                ValueAnimator valueAnimator = c0ks.LJLJLLL;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c0ks.LJLJLLL.cancel();
                }
                c0ks.LJLJJI = i;
                c0ks.LJLJJL = f;
                c0ks.LIZJ();
            }
            ValueAnimator valueAnimator2 = this.LLIIJI;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.LLIIJI.cancel();
            }
            scrollTo(LJI(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        LJFF();
    }
}
