package X;

import Y.ARunnableS50S0100000_14;
import Y.IDComparatorS42S0000000_14;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Scroller;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager$SavedState;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o3.h0;

/* renamed from: X.VnL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80795VnL extends AbstractC55113Lk5 {
    public static final int[] LLIZ = {R.attr.layout_gravity};
    public static final IDComparatorS42S0000000_14 LLIZLLLIL = new IDComparatorS42S0000000_14(5);
    public static final InterpolatorC80822Vnm LLJ = new InterpolatorC80822Vnm();
    public static final Field LLJI;
    public boolean LJLIL;
    public int LJLILLLLZI;
    public final ArrayList<C80817Vnh> LJLJI;
    public final C80817Vnh LJLJJI;
    public final Rect LJLJJL;
    public PagerAdapter LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public Parcelable LJLJLLL;
    public ClassLoader LJLL;
    public Scroller LJLLI;
    public boolean LJLLILLLL;
    public C80825Vnp LJLLJ;
    public int LJLLL;
    public Drawable LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public float LJZ;
    public float LJZI;
    public int LJZL;
    public boolean LL;
    public boolean LLD;
    public boolean LLF;
    public int LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public int LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public float LLII;
    public float LLIIII;
    public float LLIIIILZ;
    public float LLIIIJ;
    public int LLIIIL;
    public VelocityTracker LLIIIZ;
    public int LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public int LLIILII;
    public boolean LLIILZL;
    public long LLIIZ;
    public C07Q LLIL;
    public C07Q LLILII;
    public boolean LLILIL;
    public boolean LLILL;
    public int LLILLIZIL;
    public final List<C0C3> LLILLJJLI;
    public Method LLILLL;
    public final ARunnableS50S0100000_14 LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;

    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            LLJI = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    public final boolean LJJII() {
        this.LLIIIL = -1;
        this.LLFFF = false;
        this.LLFII = false;
        VelocityTracker velocityTracker = this.LLIIIZ;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.LLIIIZ = null;
        }
        return this.LLIL.LJI() | this.LLILII.LJI();
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.LJLLILLLL = true;
        if (!this.LJLLI.isFinished() && this.LJLLI.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.LJLLI.getCurrX();
            int currY = this.LJLLI.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!LJIJJLI(currY)) {
                    this.LJLLI.abortAnimation();
                    scrollTo(currX, 0);
                }
            }
            C16300kU.LJIIJ(this);
            return;
        }
        LJIIL(true);
    }

    public void setOnAdapterChangeListener(InterfaceC80837Vo1 interfaceC80837Vo1) {
    }

    @Override // X.InterfaceC92113jT
    public final boolean LIZJ() {
        if (this.LLFFF) {
            return false;
        }
        this.LLIILZL = true;
        setScrollState(1);
        this.LLIIIJ = 0.0f;
        this.LLIIII = 0.0f;
        VelocityTracker velocityTracker = this.LLIIIZ;
        if (velocityTracker == null) {
            this.LLIIIZ = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.LLIIIZ.addMovement(obtain);
        obtain.recycle();
        this.LLIIZ = uptimeMillis;
        return true;
    }

    @Override // X.InterfaceC92113jT
    public final void LIZLLL() {
        if (this.LLIILZL) {
            if (this.LJLJJLL != null) {
                VelocityTracker velocityTracker = this.LLIIIZ;
                velocityTracker.computeCurrentVelocity(1000, this.LLIIJLIL);
                int yVelocity = (int) velocityTracker.getYVelocity(this.LLIIIL);
                this.LLF = true;
                int clientHeight = getClientHeight();
                int scrollY = getScrollY();
                C80817Vnh LJIIZILJ = LJIIZILJ();
                LJJIIJ(LJIILJJIL(LJIIZILJ.LIZIZ, ((scrollY / clientHeight) - LJIIZILJ.LJ) / LJIIZILJ.LIZLLL, yVelocity, (int) (this.LLIIII - this.LLIIIJ)), true, true, yVelocity);
            }
            this.LLFFF = false;
            this.LLFII = false;
            VelocityTracker velocityTracker2 = this.LLIIIZ;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.LLIIIZ = null;
            }
            this.LLIILZL = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public final void LJIILIIL() {
        boolean z;
        int count = this.LJLJJLL.getCount();
        this.LJLILLLLZI = count;
        if (this.LJLJI.size() < (this.LLFF * 2) + 1 && this.LJLJI.size() < count) {
            z = true;
        } else {
            z = false;
        }
        int i = this.LJLJL;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.LJLJI.size()) {
            C80817Vnh c80817Vnh = (C80817Vnh) ListProtector.get(this.LJLJI, i2);
            int LJIIL = this.LJLJJLL.LJIIL(c80817Vnh.LIZ);
            if (LJIIL != -1) {
                if (LJIIL == -2) {
                    ListProtector.remove(this.LJLJI, i2);
                    i2--;
                    if (!z2) {
                        this.LJLJJLL.LJJIFFI(this);
                        z2 = true;
                    }
                    this.LJLJJLL.LJIIIZ(c80817Vnh.LIZIZ, this, c80817Vnh.LIZ);
                    int i3 = this.LJLJL;
                    if (i3 == c80817Vnh.LIZIZ) {
                        i = Math.max(0, Math.min(i3, (-1) + count));
                    }
                } else {
                    int i4 = c80817Vnh.LIZIZ;
                    if (i4 != LJIIL) {
                        if (i4 == this.LJLJL) {
                            i = LJIIL;
                        }
                        c80817Vnh.LIZIZ = LJIIL;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.LJLJJLL.LJIIJJI(this);
        }
        Collections.sort(this.LJLJI, LLIZLLLIL);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C80807VnX c80807VnX = (C80807VnX) getChildAt(i5).getLayoutParams();
                if (!c80807VnX.LIZ) {
                    c80807VnX.LIZJ = 0.0f;
                }
            }
            LJJIIJ(i, false, true, 0);
            requestLayout();
        }
    }

    public final void LJJI() {
        LJJ(this.LJLJL);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C80807VnX();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.LLILZ);
        Scroller scroller = this.LJLLI;
        if (scroller != null && !scroller.isFinished()) {
            this.LJLLI.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public final C80817Vnh LJIIZILJ() {
        float f;
        float f2;
        int i;
        int clientHeight = getClientHeight();
        float f3 = 0.0f;
        if (clientHeight > 0) {
            f = getScrollY() / clientHeight;
            f2 = this.LJLLL / clientHeight;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C80817Vnh c80817Vnh = null;
        float f4 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.LJLJI.size()) {
            C80817Vnh c80817Vnh2 = (C80817Vnh) ListProtector.get(this.LJLJI, i3);
            if (!z && c80817Vnh2.LIZIZ != (i = i2 + 1)) {
                c80817Vnh2 = this.LJLJJI;
                c80817Vnh2.LJ = f3 + f4 + f2;
                c80817Vnh2.LIZIZ = i;
                c80817Vnh2.LIZLLL = this.LJLJJLL.LJIILJJIL(i);
                i3--;
            }
            f3 = c80817Vnh2.LJ;
            float f5 = c80817Vnh2.LIZLLL + f3 + f2;
            if (z || f >= f3) {
                if (f < f5 || i3 == this.LJLJI.size() - 1) {
                    return c80817Vnh2;
                }
                i2 = c80817Vnh2.LIZIZ;
                f4 = c80817Vnh2.LIZLLL;
                i3++;
                z = false;
                c80817Vnh = c80817Vnh2;
            } else {
                return c80817Vnh;
            }
        }
        return c80817Vnh;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.LJLLLL;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILIL = true;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        VerticalViewPager$SavedState verticalViewPager$SavedState = new VerticalViewPager$SavedState(super.onSaveInstanceState());
        verticalViewPager$SavedState.LJLIL = this.LJLJL;
        PagerAdapter pagerAdapter = this.LJLJJLL;
        if (pagerAdapter != null) {
            verticalViewPager$SavedState.LJLILLLLZI = pagerAdapter.LJIJJ();
        }
        return verticalViewPager$SavedState;
    }

    @Override // X.InterfaceC92113jT
    public final boolean LIZ() {
        return this.LLIILZL;
    }

    @Override // X.AbstractC55113Lk5
    public final boolean LJIIIIZZ() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC55114Lk6
    public PagerAdapter getAdapter() {
        return this.LJLJJLL;
    }

    @Override // X.AbstractC55114Lk6
    public int getCurrentItem() {
        return this.LJLJL;
    }

    public int getExpectedAdapterCount() {
        return this.LJLILLLLZI;
    }

    public int getOffscreenPageLimit() {
        return this.LLFF;
    }

    public int getPageMargin() {
        return this.LJLLL;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.LLD != z) {
            this.LLD = z;
        }
    }

    @Override // X.InterfaceC92113jT
    public final void LJFF(float f) {
        if (this.LLIILZL) {
            if (this.LJLJJLL == null) {
                return;
            }
            try {
                this.LLIIII += f;
                float scrollY = getScrollY() - f;
                float clientHeight = getClientHeight();
                float f2 = this.LJZ * clientHeight;
                float f3 = this.LJZI * clientHeight;
                C80817Vnh c80817Vnh = (C80817Vnh) ListProtector.get(this.LJLJI, 0);
                C80817Vnh c80817Vnh2 = (C80817Vnh) ListProtector.get(this.LJLJI, r1.size() - 1);
                if (c80817Vnh.LIZIZ != 0) {
                    f2 = c80817Vnh.LJ * clientHeight;
                }
                if (c80817Vnh2.LIZIZ != this.LJLJJLL.getCount() - 1) {
                    f3 = c80817Vnh2.LJ * clientHeight;
                }
                if (scrollY < f2) {
                    scrollY = f2;
                } else if (scrollY > f3) {
                    scrollY = f3;
                }
                int i = (int) scrollY;
                this.LLIIII = (scrollY - i) + this.LLIIII;
                scrollTo(getScrollX(), i);
                LJIJJLI(i);
                MotionEvent obtain = MotionEvent.obtain(this.LLIIZ, SystemClock.uptimeMillis(), 2, 0.0f, this.LLIIII, 0);
                if (this.LLIIIZ == null) {
                    this.LLIIIZ = VelocityTracker.obtain();
                }
                VelocityTracker velocityTracker = this.LLIIIZ;
                if (velocityTracker == null) {
                    return;
                }
                velocityTracker.addMovement(obtain);
                obtain.recycle();
                return;
            } catch (Exception e) {
                C36922EeM.LJFF(e);
                return;
            }
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // X.AbstractC55114Lk6
    public final void LJI(C0C3 c0c3) {
        ((ArrayList) this.LLILLJJLI).add(c0c3);
    }

    @Override // X.AbstractC55114Lk6
    public final void LJII(C0C3 c0c3) {
        List<C0C3> list = this.LLILLJJLI;
        if (list != null) {
            ((ArrayList) list).remove(c0c3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJ(int r7) {
        /*
            r6 = this;
            android.view.View r4 = r6.findFocus()
            r3 = 1
            r2 = 0
            if (r4 != r6) goto La8
        L8:
            r4 = 0
        L9:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r5 = r0.findNextFocus(r6, r4, r7)
            r1 = 130(0x82, float:1.82E-43)
            r0 = 33
            if (r5 == 0) goto L7b
            if (r5 == r4) goto L7b
            if (r7 != r0) goto L49
            android.graphics.Rect r0 = r6.LJLJJL
            android.graphics.Rect r0 = r6.LJIILL(r0, r5)
            int r1 = r0.top
            android.graphics.Rect r0 = r6.LJLJJL
            android.graphics.Rect r0 = r6.LJIILL(r0, r4)
            int r0 = r0.top
            if (r4 == 0) goto L44
            if (r1 < r0) goto L44
            int r0 = r6.LJLJL
            if (r0 <= 0) goto La6
            int r0 = r0 - r3
            r6.LLF = r2
            r6.LJJIIJ(r0, r3, r2, r2)
        L39:
            r2 = r3
        L3a:
            if (r2 == 0) goto L43
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r0)
        L43:
            return r2
        L44:
            boolean r2 = r5.requestFocus()
            goto L3a
        L49:
            if (r7 != r1) goto L43
            android.graphics.Rect r0 = r6.LJLJJL
            android.graphics.Rect r0 = r6.LJIILL(r0, r5)
            int r1 = r0.bottom
            android.graphics.Rect r0 = r6.LJLJJL
            android.graphics.Rect r0 = r6.LJIILL(r0, r4)
            int r0 = r0.bottom
            if (r4 == 0) goto L76
            if (r1 > r0) goto L76
            androidx.viewpager.widget.PagerAdapter r0 = r6.LJLJJLL
            if (r0 == 0) goto La6
            int r1 = r6.LJLJL
            int r0 = r0.getCount()
            int r0 = r0 - r3
            if (r1 >= r0) goto La6
            int r0 = r6.LJLJL
            int r0 = r0 + 1
            r6.LLF = r2
            r6.LJJIIJ(r0, r3, r2, r2)
            goto L39
        L76:
            boolean r2 = r5.requestFocus()
            goto L3a
        L7b:
            if (r7 == r0) goto L7f
            if (r7 != r3) goto L8a
        L7f:
            int r0 = r6.LJLJL
            if (r0 <= 0) goto La6
            int r0 = r0 - r3
            r6.LLF = r2
            r6.LJJIIJ(r0, r3, r2, r2)
            goto L39
        L8a:
            if (r7 == r1) goto L8f
            r0 = 2
            if (r7 != r0) goto L43
        L8f:
            androidx.viewpager.widget.PagerAdapter r0 = r6.LJLJJLL
            if (r0 == 0) goto La6
            int r1 = r6.LJLJL
            int r0 = r0.getCount()
            int r0 = r0 - r3
            if (r1 >= r0) goto La6
            int r0 = r6.LJLJL
            int r0 = r0 + 1
            r6.LLF = r2
            r6.LJJIIJ(r0, r3, r2, r2)
            goto L39
        La6:
            r3 = 0
            goto L39
        La8:
            if (r4 == 0) goto L9
            android.view.ViewParent r1 = r4.getParent()
        Lae:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lbb
            if (r1 != r6) goto Lb6
            goto L9
        Lb6:
            android.view.ViewParent r1 = r1.getParent()
            goto Lae
        Lbb:
            java.lang.Class r0 = r4.getClass()
            X.C16880lQ.LJLLJ(r0)
            android.view.ViewParent r1 = r4.getParent()
        Lc6:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L8
            java.lang.Class r0 = r1.getClass()
            X.C16880lQ.LJLLJ(r0)
            android.view.ViewParent r1 = r1.getParent()
            goto Lc6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80795VnL.LJIIJ(int):boolean");
    }

    public final void LJIIL(boolean z) {
        boolean z2;
        if (this.LLILZIL == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.LJLLI.isFinished()) {
                this.LJLLI.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.LJLLI.getCurrX();
                int currY = this.LJLLI.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        LJIJJLI(currY);
                    }
                }
            }
        } else {
            z2 = false;
        }
        this.LLF = false;
        for (int i = 0; i < this.LJLJI.size(); i++) {
            C80817Vnh c80817Vnh = (C80817Vnh) ListProtector.get(this.LJLJI, i);
            if (c80817Vnh.LIZJ) {
                c80817Vnh.LIZJ = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                C16300kU.LJIIL(this, this.LLILZ);
            } else {
                this.LLILZ.run();
            }
        }
    }

    public final C80817Vnh LJIILLIIL(View view) {
        for (int i = 0; i < this.LJLJI.size(); i++) {
            C80817Vnh c80817Vnh = (C80817Vnh) ListProtector.get(this.LJLJI, i);
            if (this.LJLJJLL.LJIIZILJ(view, c80817Vnh.LIZ)) {
                return c80817Vnh;
            }
        }
        return null;
    }

    public final C80817Vnh LJIJ(int i) {
        for (int i2 = 0; i2 < this.LJLJI.size(); i2++) {
            C80817Vnh c80817Vnh = (C80817Vnh) ListProtector.get(this.LJLJI, i2);
            if (c80817Vnh.LIZIZ == i) {
                return c80817Vnh;
            }
        }
        return null;
    }

    public final void LJIJJ(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LLIIIL) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LLIIII = motionEvent.getY(i);
            this.LLIIIL = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.LLIIIZ;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean LJIJJLI(int i) {
        if (this.LJLJI.size() == 0) {
            if (this.LLILIL) {
                return false;
            }
            this.LLILL = false;
            LJIJI(0, 0.0f, 0);
            if (this.LLILL) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C80817Vnh LJIIZILJ = LJIIZILJ();
        int clientHeight = getClientHeight();
        int i2 = this.LJLLL;
        int i3 = clientHeight + i2;
        float f = i2;
        float f2 = clientHeight;
        int i4 = LJIIZILJ.LIZIZ;
        float f3 = ((i / f2) - LJIIZILJ.LJ) / (LJIIZILJ.LIZLLL + (f / f2));
        this.LLILL = false;
        LJIJI(i4, f3, (int) (i3 * f3));
        if (this.LLILL) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean LJIL(float f) {
        boolean z;
        boolean z2;
        float f2 = this.LLIIII - f;
        this.LLIIII = f;
        float scrollY = getScrollY() + f2;
        float clientHeight = getClientHeight();
        float f3 = this.LJZ * clientHeight;
        float f4 = this.LJZI * clientHeight;
        boolean z3 = false;
        if (this.LJLJI.size() <= 0) {
            return false;
        }
        C80817Vnh c80817Vnh = (C80817Vnh) ListProtector.get(this.LJLJI, 0);
        ArrayList<C80817Vnh> arrayList = this.LJLJI;
        C80817Vnh c80817Vnh2 = (C80817Vnh) AnonymousClass028.LIZIZ(arrayList, 1, arrayList);
        if (c80817Vnh.LIZIZ != 0) {
            f3 = c80817Vnh.LJ * clientHeight;
            z = false;
        } else {
            z = true;
        }
        if (c80817Vnh2.LIZIZ != this.LJLJJLL.getCount() - 1) {
            f4 = c80817Vnh2.LJ * clientHeight;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollY < f3) {
            if (z) {
                this.LLIL.LJ(Math.abs(f3 - scrollY) / clientHeight);
                z3 = true;
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z2) {
                this.LLILII.LJ(Math.abs(scrollY - f4) / clientHeight);
                z3 = true;
            }
            scrollY = f4;
        }
        int i = (int) scrollY;
        this.LLII = (scrollY - i) + this.LLII;
        scrollTo(getScrollX(), i);
        LJIJJLI(i);
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00d6, code lost:
    
        if (r5 > r8.LIZIZ) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00de, code lost:
    
        if (r3 >= r17.LJLJI.size()) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00e0, code lost:
    
        r7 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00e8, code lost:
    
        r7 = (X.C80817Vnh) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00ea, code lost:
    
        if (r5 <= r7.LIZIZ) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00f4, code lost:
    
        if (r3 >= (r17.LJLJI.size() - 1)) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00f6, code lost:
    
        r3 = r3 + 1;
        r7 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0103, code lost:
    
        if (r5 >= r7.LIZIZ) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0105, code lost:
    
        r1 = r1 + (r17.LJLJJLL.LJIILJJIL(r5) + r9);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0110, code lost:
    
        r7.LJ = r1;
        r1 = r1 + (r7.LIZLLL + r9);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01ff, code lost:
    
        if (r7 <= r0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0201, code lost:
    
        r5 = r17.LJLJI.size() - 1;
        r3 = r3.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x020b, code lost:
    
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x020f, code lost:
    
        if (r7 < r8.LIZIZ) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0211, code lost:
    
        if (r5 < 0) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0213, code lost:
    
        r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x021b, code lost:
    
        r1 = (X.C80817Vnh) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x021d, code lost:
    
        if (r7 >= r1.LIZIZ) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x021f, code lost:
    
        if (r5 <= 0) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0221, code lost:
    
        r5 = r5 - 1;
        r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x022e, code lost:
    
        if (r7 <= r1.LIZIZ) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0230, code lost:
    
        r3 = r3 - (r17.LJLJJLL.LJIILJJIL(r7) + r9);
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x023b, code lost:
    
        r3 = r3 - (r1.LIZLLL + r9);
        r1.LJ = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0242, code lost:
    
        r7 = r17.LJLJI.size();
        r11 = r8.LJ;
        r1 = r8.LIZIZ;
        r12 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x024e, code lost:
    
        if (r1 != 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0250, code lost:
    
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0251, code lost:
    
        r17.LJZ = r0;
        r5 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0257, code lost:
    
        if (r1 != r5) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0259, code lost:
    
        r0 = (r8.LIZLLL + r11) - 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x025d, code lost:
    
        r17.LJZI = r0;
        r3 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0261, code lost:
    
        if (r3 < 0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0263, code lost:
    
        r2 = (X.C80817Vnh) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x026b, code lost:
    
        r1 = r2.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x026d, code lost:
    
        if (r12 <= r1) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x026f, code lost:
    
        r11 = r11 - (r17.LJLJJLL.LJIILJJIL(r12) + r9);
        r12 = r12 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x027b, code lost:
    
        r11 = r11 - (r2.LIZLLL + r9);
        r2.LJ = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0281, code lost:
    
        if (r1 != 0) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0283, code lost:
    
        r17.LJZ = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0285, code lost:
    
        r3 = r3 - 1;
        r12 = r12 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0292, code lost:
    
        r3 = (r8.LJ + r8.LIZLLL) + r9;
        r11 = r8.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x029a, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x029c, code lost:
    
        if (r10 >= r7) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x029e, code lost:
    
        r2 = (X.C80817Vnh) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02a6, code lost:
    
        r0 = r2.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02a8, code lost:
    
        if (r11 >= r0) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02aa, code lost:
    
        r3 = r3 + (r17.LJLJJLL.LJIILJJIL(r11) + r9);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02b6, code lost:
    
        if (r0 != r5) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02b8, code lost:
    
        r17.LJZI = (r2.LIZLLL + r3) - 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02be, code lost:
    
        r2.LJ = r3;
        r3 = r3 + (r2.LIZLLL + r9);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x028a, code lost:
    
        r0 = Float.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x028e, code lost:
    
        r0 = -3.4028235E38f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0119, code lost:
    
        r9 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0189, code lost:
    
        if (r13 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x018d, code lost:
    
        if (r14 != r13.LIZIZ) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x018f, code lost:
    
        r15 = r15 + r13.LIZLLL;
        r12 = r12 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0194, code lost:
    
        if (r12 < 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0196, code lost:
    
        r13 = (X.C80817Vnh) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x019f, code lost:
    
        r15 = r15 + LJIIIZ(r14, r12 + 1).LIZLLL;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01aa, code lost:
    
        if (r12 < 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01ac, code lost:
    
        r13 = (X.C80817Vnh) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01dd, code lost:
    
        r5 = (2.0f - r8.LIZLLL) + (getPaddingLeft() / r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01eb, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x01fb, code lost:
    
        if (r8 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r1 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        r12 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r12 < 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        r13 = (X.C80817Vnh) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        r9 = getClientHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r9 > 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        r5 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r14 = r17.LJLJL - 1;
        r15 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        if (r14 < 0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (r15 < r5) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        if (r14 >= r10) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
    
        if (r13 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b9, code lost:
    
        if (r14 != r13.LIZIZ) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01bd, code lost:
    
        if (r13.LIZJ != false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01bf, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.remove(r17.LJLJI, r12);
        r17.LJLJJLL.LJIIIZ(r14, r17, r13.LIZ);
        r12 = r12 - 1;
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01cf, code lost:
    
        if (r12 < 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b5, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d9, code lost:
    
        r14 = r14 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d1, code lost:
    
        r13 = (X.C80817Vnh) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0088, code lost:
    
        r5 = r8.LIZLLL;
        r10 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
    
        if (r5 >= 2.0f) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0096, code lost:
    
        if (r10 >= r17.LJLJI.size()) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0098, code lost:
    
        r13 = (X.C80817Vnh) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a0, code lost:
    
        if (r9 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a2, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        r12 = r17.LJLJL + 1;
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a8, code lost:
    
        if (r12 >= r7) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ac, code lost:
    
        if (r5 < r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ae, code lost:
    
        if (r12 <= r11) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b0, code lost:
    
        if (r13 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0155, code lost:
    
        if (r12 != r13.LIZIZ) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0159, code lost:
    
        if (r13.LIZJ != false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015b, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.remove(r17.LJLJI, r9);
        r17.LJLJJLL.LJIIIZ(r12, r17, r13.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016d, code lost:
    
        if (r9 >= r17.LJLJI.size()) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0151, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0177, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016f, code lost:
    
        r13 = (X.C80817Vnh) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011b, code lost:
    
        if (r13 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011f, code lost:
    
        if (r12 != r13.LIZIZ) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0121, code lost:
    
        r5 = r5 + r13.LIZLLL;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012c, code lost:
    
        if (r9 >= r17.LJLJI.size()) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012e, code lost:
    
        r13 = (X.C80817Vnh) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0137, code lost:
    
        r0 = LJIIIZ(r12, r9);
        r9 = r9 + 1;
        r5 = r5 + r0.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0146, code lost:
    
        if (r9 >= r17.LJLJI.size()) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0148, code lost:
    
        r13 = (X.C80817Vnh) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x017b, code lost:
    
        r1 = (getPaddingRight() / r9) + 2.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0186, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00b2, code lost:
    
        r13 = r17.LJLJJLL.getCount();
        r1 = getClientHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00bc, code lost:
    
        if (r1 <= 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00be, code lost:
    
        r9 = r17.LJLLL / r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00c3, code lost:
    
        if (r3 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00c5, code lost:
    
        r7 = r3.LIZIZ;
        r0 = r8.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00c9, code lost:
    
        if (r7 >= r0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00cb, code lost:
    
        r1 = (r3.LJ + r3.LIZLLL) + r9;
        r5 = r7 + 1;
        r3 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(int r18) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80795VnL.LJJ(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C80817Vnh LJIILLIIL;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (LJIILLIIL = LJIILLIIL(childAt)) != null && LJIILLIIL.LIZIZ == this.LJLJL) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (this.LJLJJLL == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i < 0) {
            if (scrollY <= ((int) (clientHeight * this.LJZ))) {
                return false;
            }
            return true;
        }
        if (i <= 0 || scrollY >= ((int) (clientHeight * this.LJZI))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C80807VnX) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean LJIIJ;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            LJIIJ = LJIIJ(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            LJIIJ = LJIIJ(1);
                        }
                    }
                } else {
                    LJIIJ = LJIIJ(66);
                }
            } else {
                LJIIJ = LJIIJ(17);
            }
            if (LJIIJ) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C80817Vnh LJIILLIIL;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (LJIILLIIL = LJIILLIIL(childAt)) != null && LJIILLIIL.LIZIZ == this.LJLJL && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LJLIL && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        try {
            super.draw(canvas);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.LJLJJLL) != null && pagerAdapter.getCount() > 1)) {
            if (!this.LLIL.LIZLLL()) {
                int save = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate(getPaddingLeft(), this.LJZ * height);
                this.LLIL.LJII(width, height);
                z = false | this.LLIL.LIZ(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.LLILII.LIZLLL()) {
                int save2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((-width2) - getPaddingLeft(), (-(this.LJZI + 1.0f)) * height2);
                this.LLILII.LJII(width2, height2);
                z |= this.LLILII.LIZ(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                C16300kU.LJIIJ(this);
                return;
            }
            return;
        }
        this.LLIL.LIZIZ();
        this.LLILII.LIZIZ();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C80807VnX(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.LJLLL > 0 && this.LJLLLL != null && this.LJLJI.size() > 0 && this.LJLJJLL != null) {
            int scrollY = getScrollY();
            float height = getHeight();
            float f2 = this.LJLLL / height;
            int i2 = 0;
            C80817Vnh c80817Vnh = (C80817Vnh) ListProtector.get(this.LJLJI, 0);
            float f3 = c80817Vnh.LJ;
            int size = this.LJLJI.size();
            int i3 = ((C80817Vnh) ListProtector.get(this.LJLJI, size - 1)).LIZIZ;
            for (int i4 = c80817Vnh.LIZIZ; i4 < i3; i4++) {
                while (true) {
                    i = c80817Vnh.LIZIZ;
                    if (i4 <= i || i2 >= size) {
                        break;
                    }
                    i2++;
                    c80817Vnh = (C80817Vnh) ListProtector.get(this.LJLJI, i2);
                }
                if (i4 == i) {
                    float f4 = c80817Vnh.LJ;
                    float f5 = c80817Vnh.LIZLLL;
                    f = (f4 + f5) * height;
                    f3 = f4 + f5 + f2;
                } else {
                    float LJIILJJIL = this.LJLJJLL.LJIILJJIL(i4);
                    f = (f3 + LJIILJJIL) * height;
                    f3 = LJIILJJIL + f2 + f3;
                }
                int i5 = this.LJLLL;
                if (i5 + f > scrollY) {
                    this.LJLLLL.setBounds(this.LJLLLLLL, (int) f, this.LJLZ, (int) (i5 + f + 0.5f));
                    this.LJLLLL.draw(canvas);
                }
                if (f > scrollY + r8) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        try {
        } catch (IllegalArgumentException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (this.LLIILZL) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.LLFFF) {
                    return true;
                }
                if (this.LLFII) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        LJIJJ(motionEvent);
                    }
                } else {
                    int i = this.LLIIIL;
                    if (i != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        float y = motionEvent.getY(findPointerIndex);
                        float f2 = y - this.LLIIII;
                        float abs = Math.abs(f2);
                        float x = motionEvent.getX(findPointerIndex);
                        float abs2 = Math.abs(x - this.LLIIIILZ);
                        if (f2 != 0.0f) {
                            float f3 = this.LLIIII;
                            if ((f3 >= this.LLI || f2 <= 0.0f) && ((f3 <= getHeight() - this.LLI || f2 >= 0.0f) && LJIIJJI(this, false, (int) f2, (int) x, (int) y))) {
                                this.LLII = x;
                                this.LLIIII = y;
                                this.LLFII = true;
                                return false;
                            }
                        }
                        float f4 = this.LLIFFJFJJ;
                        if (abs > f4 && abs * 0.5f > abs2) {
                            this.LLFFF = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            if (f2 > 0.0f) {
                                f = this.LLIIIJ + this.LLIFFJFJJ;
                            } else {
                                f = this.LLIIIJ - this.LLIFFJFJJ;
                            }
                            this.LLIIII = f;
                            this.LLII = x;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f4) {
                            this.LLFII = true;
                        }
                        if (this.LLFFF && LJIL(y)) {
                            C16300kU.LJIIJ(this);
                        }
                    }
                }
            } else {
                this.LLII = motionEvent.getX();
                this.LLIIIILZ = motionEvent.getX();
                this.LLIIII = motionEvent.getY();
                this.LLIIIJ = motionEvent.getY();
                this.LLIIIL = motionEvent.getPointerId(0);
                this.LLFII = false;
                this.LJLLILLLL = true;
                this.LJLLI.computeScrollOffset();
                if (this.LLILZIL == 2 && Math.abs(this.LJLLI.getFinalY() - this.LJLLI.getCurrY()) > this.LLIILII) {
                    this.LJLLI.abortAnimation();
                    this.LLF = false;
                    LJJI();
                    this.LLFFF = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    LJIIL(false);
                    this.LLFFF = false;
                }
            }
            if (this.LLIIIZ == null) {
                this.LLIIIZ = VelocityTracker.obtain();
            }
            this.LLIIIZ.addMovement(motionEvent);
            return this.LLFFF;
        }
        LJJII();
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof VerticalViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        VerticalViewPager$SavedState verticalViewPager$SavedState = (VerticalViewPager$SavedState) parcelable;
        super.onRestoreInstanceState(verticalViewPager$SavedState.getSuperState());
        PagerAdapter pagerAdapter = this.LJLJJLL;
        if (pagerAdapter != null) {
            pagerAdapter.LJIJI(verticalViewPager$SavedState.LJLILLLLZI, verticalViewPager$SavedState.LJLJI);
            LJJIIJ(verticalViewPager$SavedState.LJLIL, false, true, 0);
        } else {
            this.LJLJLJ = verticalViewPager$SavedState.LJLIL;
            this.LJLJLLL = verticalViewPager$SavedState.LJLILLLLZI;
            this.LJLL = verticalViewPager$SavedState.LJLJI;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        boolean LJJII;
        float f;
        try {
        } catch (IllegalArgumentException e) {
            C16880lQ.LLLLIIL(e);
        } catch (IllegalStateException e2) {
            if (this.LJLJJLL.getCount() != this.LJLILLLLZI) {
                this.LJLJJLL.notifyDataSetChanged();
            }
            C16880lQ.LLLLIIL(e2);
        }
        if (this.LLIILZL) {
            return true;
        }
        if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && (pagerAdapter = this.LJLJJLL) != null && pagerAdapter.getCount() != 0) {
            if (this.LLIIIZ == null) {
                this.LLIIIZ = VelocityTracker.obtain();
            }
            this.LLIIIZ.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.LJLLI.abortAnimation();
                this.LLF = false;
                LJJI();
                this.LLII = motionEvent.getX();
                this.LLIIIILZ = motionEvent.getX();
                this.LLIIII = motionEvent.getY();
                this.LLIIIJ = motionEvent.getY();
                this.LLIIIL = motionEvent.getPointerId(0);
            } else {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            if (action != 5) {
                                if (action == 6) {
                                    LJIJJ(motionEvent);
                                    this.LLIIII = motionEvent.getY(motionEvent.findPointerIndex(this.LLIIIL));
                                }
                            } else {
                                int actionIndex = motionEvent.getActionIndex();
                                this.LLIIII = motionEvent.getY(actionIndex);
                                this.LLIIIL = motionEvent.getPointerId(actionIndex);
                            }
                        } else if (this.LLFFF) {
                            LJJIII(this.LJLJL, true, 0, false);
                            LJJII = LJJII();
                        }
                    } else {
                        if (!this.LLFFF) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.LLIIIL);
                            if (findPointerIndex == -1) {
                                LJJII = LJJII();
                            } else {
                                float y = motionEvent.getY(findPointerIndex);
                                float abs = Math.abs(y - this.LLIIII);
                                float x = motionEvent.getX(findPointerIndex);
                                float abs2 = Math.abs(x - this.LLII);
                                if (abs > this.LLIFFJFJJ && abs > abs2) {
                                    this.LLFFF = true;
                                    ViewParent parent = getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                    float f2 = this.LLIIIJ;
                                    if (y - f2 > 0.0f) {
                                        f = f2 + this.LLIFFJFJJ;
                                    } else {
                                        f = f2 - this.LLIFFJFJJ;
                                    }
                                    this.LLIIII = f;
                                    this.LLII = x;
                                    setScrollState(1);
                                    setScrollingCacheEnabled(true);
                                    ViewParent parent2 = getParent();
                                    if (parent2 != null) {
                                        parent2.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            }
                        }
                        if (this.LLFFF) {
                            LJJII = false | LJIL(motionEvent.getY(motionEvent.findPointerIndex(this.LLIIIL)));
                        }
                    }
                } else if (this.LLFFF) {
                    VelocityTracker velocityTracker = this.LLIIIZ;
                    velocityTracker.computeCurrentVelocity(1000, this.LLIIJLIL);
                    int yVelocity = (int) velocityTracker.getYVelocity(this.LLIIIL);
                    this.LLF = true;
                    int clientHeight = getClientHeight();
                    int scrollY = getScrollY();
                    C80817Vnh LJIIZILJ = LJIIZILJ();
                    if (LJIIZILJ != null) {
                        float f3 = clientHeight;
                        LJJIIJ(LJIILJJIL(LJIIZILJ.LIZIZ, ((scrollY / f3) - LJIIZILJ.LJ) / (LJIIZILJ.LIZLLL + (this.LJLLL / f3)), yVelocity, (int) (motionEvent.getY(motionEvent.findPointerIndex(this.LLIIIL)) - this.LLIIIJ)), true, true, yVelocity);
                    }
                    LJJII = LJJII();
                }
                if (LJJII) {
                    C16300kU.LJIIJ(this);
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.LL) {
            if (C78996UzQ.LJJIIJZLJL(view)) {
                C78996UzQ.LJI();
            }
            removeViewInLayout(view);
            return;
        }
        super.removeView(view);
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.LJLJJLL;
        if (pagerAdapter2 != null) {
            try {
                Field field = LLJI;
                if (field != null) {
                    field.set(pagerAdapter2, null);
                }
            } catch (IllegalAccessException unused) {
            }
            this.LJLJJLL.LJJIFFI(this);
            for (int i = 0; i < this.LJLJI.size(); i++) {
                C80817Vnh c80817Vnh = (C80817Vnh) ListProtector.get(this.LJLJI, i);
                this.LJLJJLL.LJIIIZ(c80817Vnh.LIZIZ, this, c80817Vnh.LIZ);
            }
            this.LJLJJLL.LJIIJJI(this);
            this.LJLJI.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C80807VnX) getChildAt(i2).getLayoutParams()).LIZ) {
                    try {
                        if (C78996UzQ.LJJIIJZLJL(getChildAt(i2))) {
                            C78996UzQ.LJI();
                        }
                    } catch (Throwable unused2) {
                    }
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.LJLJL = 0;
            scrollTo(0, 0);
        }
        this.LJLJJLL = pagerAdapter;
        this.LJLILLLLZI = 0;
        if (pagerAdapter != null) {
            if (this.LJLLJ == null) {
                this.LJLLJ = new C80825Vnp(this);
            }
            PagerAdapter pagerAdapter3 = this.LJLJJLL;
            C80825Vnp c80825Vnp = this.LJLLJ;
            try {
                Field field2 = LLJI;
                if (field2 != null) {
                    field2.set(pagerAdapter3, c80825Vnp);
                }
            } catch (IllegalAccessException unused3) {
            }
            this.LLF = false;
            boolean z = this.LLILIL;
            this.LLILIL = true;
            this.LJLILLLLZI = this.LJLJJLL.getCount();
            if (this.LJLJLJ >= 0) {
                this.LJLJJLL.LJIJI(this.LJLJLLL, this.LJLL);
                LJJIIJ(this.LJLJLJ, false, true, 0);
                this.LJLJLJ = -1;
                this.LJLJLLL = null;
                this.LJLL = null;
                return;
            }
            if (!z) {
                LJJI();
            } else {
                requestLayout();
            }
        }
    }

    public void setCanTouch(boolean z) {
        this.LJLIL = z;
    }

    public void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (this.LLILLL == null) {
            try {
                this.LLILLL = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
        }
        try {
            this.LLILLL.invoke(this, Boolean.valueOf(z));
        } catch (Exception unused2) {
        }
    }

    public void setCurrentItem(int i) {
        this.LLF = false;
        LJJIIJ(i, !this.LLILIL, false, 0);
    }

    public void setCurrentItemWithDefaultVelocity(int i) {
        this.LLF = false;
        LJJIIJ(i, true, true, 1);
    }

    public void setDisableScroll(boolean z) {
        this.LLILZLL = z;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.LLFF) {
            this.LLFF = i;
            LJJI();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.LJLLL;
        this.LJLLL = i;
        int height = getHeight();
        LJJIFFI(height, height, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.LJLLLL = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.LLILZIL == i) {
            return;
        }
        this.LLILZIL = i;
        List<C0C3> list = this.LLILLJJLI;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) this.LLILLJJLI).iterator();
            while (it.hasNext()) {
                ((C0C3) it.next()).onPageScrollStateChanged(i);
            }
        }
    }

    public void setScroller(Scroller scroller) {
        this.LJLLI = scroller;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.LJLLLL) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    public C80795VnL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJI = new ArrayList<>();
        this.LJLJJI = new C80817Vnh();
        this.LJLJJL = new Rect();
        this.LJLJLJ = -1;
        this.LJLJLLL = null;
        this.LJLL = null;
        this.LJZ = -3.4028235E38f;
        this.LJZI = Float.MAX_VALUE;
        this.LLFF = 1;
        this.LLIIIL = -1;
        this.LLILIL = true;
        this.LLILLJJLI = new ArrayList();
        this.LLILZ = new ARunnableS50S0100000_14(this, 104);
        this.LLILZIL = 0;
        this.LLILZLL = false;
        this.LJLIL = true;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.LJLLI = new Scroller(context2, LLJ);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.LLIFFJFJJ = viewConfiguration.getScaledPagingTouchSlop();
        this.LLIIJI = (int) (400.0f * f);
        this.LLIIJLIL = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LLIL = new C07Q(context2);
        this.LLILII = new C07Q(context2);
        this.LLIIL = (int) (25.0f * f);
        this.LLIILII = (int) (2.0f * f);
        this.LLFZ = (int) (f * 16.0f);
        h0.LJIJI(this, new C80801VnR(this));
        if (C16300kU.LIZJ(this) == 0) {
            C16300kU.LJIJ(this, 1);
        }
        C16360ka.LJIJJ(this, new C80311VfX(this));
    }

    public final C80817Vnh LJIIIZ(int i, int i2) {
        C80817Vnh c80817Vnh = new C80817Vnh();
        c80817Vnh.LIZIZ = i;
        c80817Vnh.LIZ = this.LJLJJLL.LJIILLIIL(i, this);
        c80817Vnh.LIZLLL = this.LJLJJLL.LJIILJJIL(i);
        if (i2 < 0 || i2 >= this.LJLJI.size()) {
            this.LJLJI.add(c80817Vnh);
        } else {
            ListProtector.add(this.LJLJI, i2, c80817Vnh);
        }
        return c80817Vnh;
    }

    public final Rect LJIILL(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        Object parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            View view2 = (View) parent;
            rect.left = view2.getLeft() + rect.left;
            rect.right = view2.getRight() + rect.right;
            rect.top = view2.getTop() + rect.top;
            rect.bottom = view2.getBottom() + rect.bottom;
            parent = view2.getParent();
        }
        return rect;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return ((C80807VnX) ((View) ListProtector.get(null, i2)).getLayoutParams()).LJFF;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C80807VnX c80807VnX;
        C80807VnX c80807VnX2;
        boolean z;
        int i3;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        int measuredHeight = getMeasuredHeight();
        this.LLI = Math.min(measuredHeight / 10, this.LLFZ);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            int i5 = 1073741824;
            boolean z2 = true;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c80807VnX2 = (C80807VnX) childAt.getLayoutParams()) != null && c80807VnX2.LIZ) {
                int i6 = c80807VnX2.LIZIZ;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                if (i8 == 48 || i8 == 80) {
                    z = true;
                } else {
                    z = false;
                }
                if (i7 != 3 && i7 != 5) {
                    z2 = false;
                }
                int i9 = LiveLayoutPreloadThreadPriority.DEFAULT;
                if (z) {
                    i3 = 1073741824;
                } else {
                    if (z2) {
                        i9 = 1073741824;
                    }
                    i3 = LiveLayoutPreloadThreadPriority.DEFAULT;
                }
                int i10 = ((ViewGroup.LayoutParams) c80807VnX2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = measuredWidth;
                    }
                    i3 = 1073741824;
                } else {
                    i10 = measuredWidth;
                }
                int i11 = ((ViewGroup.LayoutParams) c80807VnX2).height;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingTop;
                    }
                } else {
                    i11 = paddingTop;
                    i5 = i9;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i3), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z) {
                    paddingTop -= childAt.getMeasuredHeight();
                } else if (z2) {
                    measuredWidth -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.LJZL = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
        this.LL = true;
        LJJI();
        this.LL = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c80807VnX = (C80807VnX) childAt2.getLayoutParams()) == null || !c80807VnX.LIZ)) {
                childAt2.measure(this.LJZL, View.MeasureSpec.makeMeasureSpec((int) (paddingTop * c80807VnX.LIZJ), 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C80817Vnh LJIILLIIL;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            childCount = -1;
            i3 = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (LJIILLIIL = LJIILLIIL(childAt)) != null && LJIILLIIL.LIZIZ == this.LJLJL && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(int r10, float r11, int r12) {
        /*
            r9 = this;
            int r0 = r9.LLILLIZIL
            if (r0 <= 0) goto L6c
            int r8 = r9.getScrollY()
            int r5 = r9.getPaddingTop()
            int r7 = r9.getPaddingBottom()
            int r6 = r9.getHeight()
            int r4 = r9.getChildCount()
            r3 = 0
        L19:
            if (r3 >= r4) goto L6c
            android.view.View r2 = r9.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            X.VnX r1 = (X.C80807VnX) r1
            boolean r0 = r1.LIZ
            if (r0 != 0) goto L2c
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            int r0 = r1.LIZIZ
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r1 == r0) goto L50
            r0 = 48
            if (r1 == r0) goto L4a
            r0 = 80
            if (r1 == r0) goto L5d
            r0 = r5
        L3d:
            int r5 = r5 + r8
            int r1 = r2.getTop()
            int r5 = r5 - r1
            if (r5 == 0) goto L48
            r2.offsetTopAndBottom(r5)
        L48:
            r5 = r0
            goto L29
        L4a:
            int r0 = r2.getHeight()
            int r0 = r0 + r5
            goto L3d
        L50:
            int r0 = r2.getMeasuredHeight()
            int r0 = r6 - r0
            int r0 = r0 / 2
            int r1 = java.lang.Math.max(r0, r5)
            goto L69
        L5d:
            int r1 = r6 - r7
            int r0 = r2.getMeasuredHeight()
            int r1 = r1 - r0
            int r0 = r2.getMeasuredHeight()
            int r7 = r7 + r0
        L69:
            r0 = r5
            r5 = r1
            goto L3d
        L6c:
            java.util.List<X.0C3> r0 = r9.LLILLJJLI
            if (r0 == 0) goto L90
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L90
            java.util.List<X.0C3> r0 = r9.LLILLJJLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L80:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r1.next()
            X.0C3 r0 = (X.C0C3) r0
            r0.onPageScrolled(r10, r11, r12)
            goto L80
        L90:
            r0 = 1
            r9.LLILL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80795VnL.LJIJI(int, float, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C80817Vnh LJIILLIIL;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (LJIILLIIL = LJIILLIIL(childAt)) != null && LJIILLIIL.LIZIZ == this.LJLJL) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C80807VnX c80807VnX = (C80807VnX) layoutParams;
        boolean z = c80807VnX.LIZ;
        c80807VnX.LIZ = z;
        if (this.LL) {
            if (!z) {
                c80807VnX.LIZLLL = true;
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i, layoutParams);
    }

    public final int LJIILJJIL(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) > this.LLIIL && Math.abs(i2) > this.LLIIJI) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            if (i >= this.LJLJL) {
                f2 = 0.6f;
            } else {
                f2 = 0.4f;
            }
            i = (int) (i + f + f2);
        }
        if (this.LJLJI.size() > 0) {
            return Math.max(((C80817Vnh) ListProtector.get(this.LJLJI, 0)).LIZIZ, Math.min(i, ((C80817Vnh) ListProtector.get(this.LJLJI, r1.size() - 1)).LIZIZ));
        }
        return i;
    }

    public final void LJJIFFI(int i, int i2, int i3, int i4) {
        float f;
        if (i2 > 0 && !this.LJLJI.isEmpty()) {
            if (!this.LJLLI.isFinished()) {
                this.LJLLI.setFinalY(getCurrentItem() * getClientHeight());
                return;
            }
            scrollTo(getScrollX(), (int) ((getScrollY() / (((i2 - getPaddingTop()) - getPaddingBottom()) + i4)) * (((i - getPaddingTop()) - getPaddingBottom()) + i3)));
            return;
        }
        C80817Vnh LJIJ = LJIJ(this.LJLJL);
        if (LJIJ != null) {
            f = Math.min(LJIJ.LJ, this.LJZI);
        } else {
            f = 0.0f;
        }
        int paddingTop = (int) (f * ((i - getPaddingTop()) - getPaddingBottom()));
        if (paddingTop == getScrollY()) {
            return;
        }
        LJIIL(false);
        scrollTo(getScrollX(), paddingTop);
    }

    public final void LJJIII(int i, boolean z, int i2, boolean z2) {
        int i3;
        List<C0C3> list;
        int scrollY;
        int abs;
        List<C0C3> list2;
        C80817Vnh LJIJ = LJIJ(i);
        if (LJIJ != null) {
            i3 = (int) (Math.max(this.LJZ, Math.min(LJIJ.LJ, this.LJZI)) * getClientHeight());
        } else {
            i3 = 0;
        }
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.LJLLI;
                if (scroller != null && !scroller.isFinished()) {
                    if (this.LJLLILLLL) {
                        scrollY = this.LJLLI.getCurrY();
                    } else {
                        scrollY = this.LJLLI.getStartY();
                    }
                    this.LJLLI.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollY = getScrollY();
                }
                int scrollX = getScrollX();
                int i4 = -scrollX;
                int i5 = i3 - scrollY;
                if (i4 == 0 && i5 == 0) {
                    LJIIL(false);
                    LJJI();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientHeight = getClientHeight();
                    float f = clientHeight;
                    float f2 = clientHeight / 2;
                    float sin = (((float) Math.sin((float) ((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.4712389167638204d))) * f2) + f2;
                    int abs2 = Math.abs(i2);
                    if (abs2 > 0) {
                        abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                    } else {
                        abs = (int) (((Math.abs(i4) / ((this.LJLJJLL.LJIILJJIL(this.LJLJL) * f) + this.LJLLL)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(abs, 600);
                    this.LJLLILLLL = false;
                    this.LJLLI.startScroll(scrollX, scrollY, i4, i5, min);
                    C16300kU.LJIIJ(this);
                }
            }
            if (z2 && (list2 = this.LLILLJJLI) != null && !((ArrayList) list2).isEmpty()) {
                Iterator it = ((ArrayList) this.LLILLJJLI).iterator();
                while (it.hasNext()) {
                    ((C0C3) it.next()).onPageSelected(i);
                }
                return;
            }
            return;
        }
        if (z2 && (list = this.LLILLJJLI) != null && !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
            while (it2.hasNext()) {
                ((C0C3) it2.next()).onPageSelected(i);
            }
        }
        LJIIL(false);
        scrollTo(0, i3);
        LJIJJLI(i3);
    }

    public final void LJJIIJ(int i, boolean z, boolean z2, int i2) {
        List<C0C3> list;
        PagerAdapter pagerAdapter = this.LJLJJLL;
        boolean z3 = false;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.LJLJL == i && this.LJLJI.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.LJLJJLL.getCount()) {
            i = this.LJLJJLL.getCount() - 1;
        }
        int i3 = this.LLFF;
        int i4 = this.LJLJL;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.LJLJI.size(); i5++) {
                ((C80817Vnh) ListProtector.get(this.LJLJI, i5)).LIZJ = true;
            }
        }
        if (this.LJLJL != i) {
            z3 = true;
        }
        if (this.LLILIL) {
            this.LJLJL = i;
            if (z3 && (list = this.LLILLJJLI) != null && !((ArrayList) list).isEmpty()) {
                Iterator it = ((ArrayList) this.LLILLJJLI).iterator();
                while (it.hasNext()) {
                    ((C0C3) it.next()).onPageSelected(i);
                }
            }
            requestLayout();
            return;
        }
        LJJ(i);
        LJJIII(i, z, i2, z3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            int i5 = this.LJLLL;
            LJJIFFI(i2, i4, i5, i5);
        }
    }

    public final boolean LJIIJJI(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i3 + scrollY;
                if (i5 >= childAt.getTop() && i5 < childAt.getBottom() && (i4 = i2 + scrollX) >= childAt.getLeft() && i4 < childAt.getRight() && LJIIJJI(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z && view.canScrollVertically(-i)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80795VnL.onLayout(boolean, int, int, int, int):void");
    }
}
