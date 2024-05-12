package X;

import Y.ARunnableS50S0100000_14;
import Y.IDComparatorS42S0000000_14;
import android.R;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.ViewPagerSlideTransitionServiceImpl;
import dmt.viewpager.DmtViewPager$SavedState;
import dmt.viewpager.servie.ViewPagerSlideTransitionService;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AqS73S0000000_6;
import o3.h0;

/* renamed from: X.Vmv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80769Vmv extends ViewGroup implements InterfaceC80793VnJ {
    public static final int[] LLJJIII = {R.attr.layout_gravity};
    public static final IDComparatorS42S0000000_14 LLJJIJI = new IDComparatorS42S0000000_14(8);
    public static final InterpolatorC80787VnD LLJJIJIIJIL = new InterpolatorC80787VnD();
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public final C35805E3l LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public final ArrayList<C80786VnC> LJLJLJ;
    public final C80786VnC LJLJLLL;
    public final Rect LJLL;
    public PagerAdapter LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public Parcelable LJLLL;
    public ClassLoader LJLLLL;
    public Scroller LJLLLLLL;
    public boolean LJLZ;
    public C80792VnI LJZ;
    public int LJZI;
    public Drawable LJZL;
    public int LL;
    public int LLD;
    public float LLF;
    public float LLFF;
    public int LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public int LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public float LLIIIZ;
    public float LLIIJI;
    public float LLIIJLIL;
    public float LLIIL;
    public int LLIILII;
    public VelocityTracker LLIILZL;
    public int LLIIZ;
    public int LLIL;
    public int LLILII;
    public int LLILIL;
    public boolean LLILL;
    public long LLILLIZIL;
    public EdgeEffect LLILLJJLI;
    public EdgeEffect LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public List<C0C3> LLIZ;
    public C0C3 LLIZLLLIL;
    public List<InterfaceC80715Vm3> LLJ;
    public InterfaceC54209LPh LLJI;
    public int LLJIJIL;
    public float LLJILJIL;
    public final C80770Vmw LLJILJILJ;
    public final ARunnableS50S0100000_14 LLJILLL;
    public int LLJJ;
    public boolean LLJJI;

    public final void LJIJ() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        ViewPagerSlideTransitionService LIZIZ = ViewPagerSlideTransitionServiceImpl.LIZIZ();
        if (LIZIZ != null && LIZIZ.isEnable()) {
            this.LJLLLLLL = new Scroller(context, LIZIZ.LIZ());
        } else {
            this.LJLLLLLL = new Scroller(context, LLJJIJIIJIL);
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.LLIIIL = viewConfiguration.getScaledPagingTouchSlop();
        this.LLIIZ = (int) (400.0f * f);
        this.LLIL = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LLILLJJLI = new EdgeEffect(context);
        this.LLILLL = new EdgeEffect(context);
        this.LLILII = (int) (25.0f * f);
        this.LLILIL = (int) (2.0f * f);
        this.LLIIIILZ = (int) (f * 16.0f);
        h0.LJIJI(this, new C80774Vn0(this));
        if (C16300kU.LIZJ(this) == 0) {
            C16300kU.LJIJ(this, 1);
        }
        C16360ka.LJIJJ(this, new C80313VfZ(this));
    }

    public final boolean LJJIIJZLJL() {
        this.LLIILII = -1;
        this.LLII = false;
        this.LLIIII = false;
        VelocityTracker velocityTracker = this.LLIILZL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.LLIILZL = null;
        }
        this.LLILLJJLI.onRelease();
        this.LLILLL.onRelease();
        if (!this.LLILLJJLI.isFinished() && !this.LLILLL.isFinished()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.LJLZ = true;
        if (!this.LJLLLLLL.isFinished() && this.LJLLLLLL.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.LJLLLLLL.getCurrX();
            int currY = this.LJLLLLLL.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!LJJ(currX)) {
                    this.LJLLLLLL.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            C16300kU.LJIIJ(this);
            return;
        }
        LJIIIIZZ(true);
    }

    public void setExpPageOffset(float f) {
    }

    public final void LJIIIZ() {
        boolean z;
        int count = this.LJLLI.getCount();
        this.LJLJL = count;
        if (this.LJLJLJ.size() < (this.LLIFFJFJJ * 2) + 1 && this.LJLJLJ.size() < count) {
            z = true;
        } else {
            z = false;
        }
        int i = this.LJLLILLLL;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.LJLJLJ.size()) {
            C80786VnC c80786VnC = (C80786VnC) ListProtector.get(this.LJLJLJ, i2);
            int LJIIL = this.LJLLI.LJIIL(c80786VnC.LIZ);
            if (LJIIL != -1) {
                if (LJIIL == -2) {
                    ListProtector.remove(this.LJLJLJ, i2);
                    i2--;
                    if (!z2) {
                        this.LJLLI.LJJIFFI(this);
                        z2 = true;
                    }
                    this.LJLLI.LJIIIZ(c80786VnC.LIZIZ, this, c80786VnC.LIZ);
                    int i3 = this.LJLLILLLL;
                    if (i3 == c80786VnC.LIZIZ) {
                        i = Math.max(0, Math.min(i3, (-1) + count));
                    }
                } else {
                    int i4 = c80786VnC.LIZIZ;
                    if (i4 != LJIIL) {
                        if (i4 == this.LJLLILLLL) {
                            i = LJIIL;
                        }
                        c80786VnC.LIZIZ = LJIIL;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.LJLLI.LJIIJJI(this);
        }
        Collections.sort(this.LJLJLJ, LLJJIJI);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C80781Vn7 c80781Vn7 = (C80781Vn7) getChildAt(i5).getLayoutParams();
                if (!c80781Vn7.LIZ) {
                    c80781Vn7.LIZJ = 0.0f;
                }
            }
            LJJIIZI(i, false, true, 0);
            requestLayout();
        }
    }

    public final void LJIIL() {
        if (this.LLILL) {
            if (this.LJLLI != null) {
                VelocityTracker velocityTracker = this.LLIILZL;
                velocityTracker.computeCurrentVelocity(1000, this.LLIL);
                int xVelocity = (int) velocityTracker.getXVelocity(this.LLIILII);
                this.LLI = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C80786VnC LJIILLIIL = LJIILLIIL();
                LJJIIZI(LJIIJ(LJIILLIIL.LIZIZ, ((scrollX / clientWidth) - LJIILLIIL.LJ) / LJIILLIIL.LIZLLL, xVelocity, (int) (this.LLIIIZ - this.LLIIJLIL)), true, true, xVelocity);
            }
            this.LLII = false;
            this.LLIIII = false;
            VelocityTracker velocityTracker2 = this.LLIILZL;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.LLIILZL = null;
            }
            this.LLILL = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public final boolean LJIL() {
        PagerAdapter pagerAdapter = this.LJLLI;
        if (pagerAdapter != null && this.LJLLILLLL < pagerAdapter.getCount() - 1) {
            setCurrentItem(this.LJLLILLLL + 1, true);
            return true;
        }
        return false;
    }

    public final void LJJII() {
        LJJIFFI(this.LJLLILLLL);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C80781Vn7();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.LLJILLL);
        Scroller scroller = this.LJLLLLLL;
        if (scroller != null && !scroller.isFinished()) {
            this.LJLLLLLL.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public final C80786VnC LJIILLIIL() {
        float f;
        float f2;
        int i;
        int clientWidth = getClientWidth();
        float f3 = 0.0f;
        if (clientWidth > 0) {
            f = getScrollX() / clientWidth;
            f2 = this.LJZI / clientWidth;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C80786VnC c80786VnC = null;
        float f4 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.LJLJLJ.size()) {
            C80786VnC c80786VnC2 = (C80786VnC) ListProtector.get(this.LJLJLJ, i3);
            if (!z && c80786VnC2.LIZIZ != (i = i2 + 1)) {
                c80786VnC2 = this.LJLJLLL;
                c80786VnC2.LJ = f3 + f4 + f2;
                c80786VnC2.LIZIZ = i;
                c80786VnC2.LIZLLL = this.LJLLI.LJIILJJIL(i);
                i3--;
            }
            f3 = c80786VnC2.LJ;
            float f5 = c80786VnC2.LIZLLL + f3 + f2;
            if (z || f >= f3) {
                if (f < f5 || i3 == this.LJLJLJ.size() - 1) {
                    return c80786VnC2;
                }
                i2 = c80786VnC2.LIZIZ;
                f4 = c80786VnC2.LIZLLL;
                i3++;
                z = false;
                c80786VnC = c80786VnC2;
            } else {
                return c80786VnC;
            }
        }
        return c80786VnC;
    }

    public final void LJIJI() {
        View view;
        if (getAdapter().getCount() == 3) {
            for (int i = 0; i < this.LJLJLJ.size(); i++) {
                if ((((C80786VnC) ListProtector.get(this.LJLJLJ, i)).LIZ instanceof Fragment) && (view = ((Fragment) ((C80786VnC) ListProtector.get(this.LJLJLJ, i)).LIZ).getView()) != null) {
                    view.getLayoutParams();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.LJZL;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILZ = true;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        DmtViewPager$SavedState dmtViewPager$SavedState = new DmtViewPager$SavedState(super.onSaveInstanceState());
        dmtViewPager$SavedState.LJLIL = this.LJLLILLLL;
        PagerAdapter pagerAdapter = this.LJLLI;
        if (pagerAdapter != null) {
            dmtViewPager$SavedState.LJLILLLLZI = pagerAdapter.LJIJJ();
        }
        return dmtViewPager$SavedState;
    }

    public PagerAdapter getAdapter() {
        return this.LJLLI;
    }

    public int getCurrentItem() {
        return this.LJLLILLLL;
    }

    public int getOffscreenPageLimit() {
        return this.LLIFFJFJJ;
    }

    public int getPageMargin() {
        return this.LJZI;
    }

    public C80769Vmv(Context context) {
        super(context);
        this.LJLILLLLZI = true;
        this.LJLJI = true;
        this.LJLJJI = true;
        this.LJLJJL = new C35805E3l();
        this.LJLJJLL = false;
        this.LJLJLJ = new ArrayList<>();
        this.LJLJLLL = new C80786VnC();
        this.LJLL = new Rect();
        this.LJLLJ = -1;
        this.LJLLL = null;
        this.LJLLLL = null;
        this.LLF = -3.4028235E38f;
        this.LLFF = Float.MAX_VALUE;
        this.LLIFFJFJJ = 1;
        this.LLIILII = -1;
        this.LLILZ = true;
        this.LLJIJIL = -1;
        this.LLJILJIL = 0.0f;
        this.LLJILJILJ = new C80770Vmw(this);
        this.LLJILLL = new ARunnableS50S0100000_14(this, 143);
        this.LLJJ = 0;
        this.LLJJI = true;
        LJIJ();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.LLFZ != z) {
            this.LLFZ = z;
        }
    }

    @Override // X.InterfaceC80793VnJ
    public final View LIZIZ(int i) {
        return getChildAt(i);
    }

    @Override // X.InterfaceC80793VnJ
    public final boolean LJ(View view) {
        C80786VnC LJIILL = LJIILL(view);
        if (LJIILL == null || LJIILL.LIZIZ == this.LJLLILLLL) {
            return true;
        }
        return false;
    }

    public void LJFF(C0C3 c0c3) {
        if (this.LLIZ == null) {
            this.LLIZ = new ArrayList();
        }
        this.LLIZ.add(c0c3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(int r7) {
        /*
            r6 = this;
            android.view.View r3 = r6.findFocus()
            r4 = 1
            r2 = 0
            if (r3 != r6) goto L80
        L8:
            r3 = 0
        L9:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r5 = r0.findNextFocus(r6, r3, r7)
            r1 = 66
            r0 = 17
            if (r5 == 0) goto L67
            if (r5 == r3) goto L67
            if (r7 != r0) goto L47
            android.graphics.Rect r0 = r6.LJLL
            android.graphics.Rect r0 = r6.LJIILJJIL(r0, r5)
            int r1 = r0.left
            android.graphics.Rect r0 = r6.LJLL
            android.graphics.Rect r0 = r6.LJIILJJIL(r0, r3)
            int r0 = r0.left
            if (r3 == 0) goto L42
            if (r1 < r0) goto L42
            int r0 = r6.LJLLILLLL
            if (r0 <= 0) goto L74
            int r0 = r0 - r4
            r6.setCurrentItem(r0, r4)
        L37:
            r2 = r4
        L38:
            if (r2 == 0) goto L41
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r0)
        L41:
            return r2
        L42:
            boolean r2 = r5.requestFocus()
            goto L38
        L47:
            if (r7 != r1) goto L41
            android.graphics.Rect r0 = r6.LJLL
            android.graphics.Rect r0 = r6.LJIILJJIL(r0, r5)
            int r1 = r0.left
            android.graphics.Rect r0 = r6.LJLL
            android.graphics.Rect r0 = r6.LJIILJJIL(r0, r3)
            int r0 = r0.left
            if (r3 == 0) goto L62
            if (r1 > r0) goto L62
            boolean r2 = r6.LJIL()
            goto L38
        L62:
            boolean r2 = r5.requestFocus()
            goto L38
        L67:
            if (r7 == r0) goto L6b
            if (r7 != r4) goto L76
        L6b:
            int r0 = r6.LJLLILLLL
            if (r0 <= 0) goto L74
            int r0 = r0 - r4
            r6.setCurrentItem(r0, r4)
            goto L37
        L74:
            r4 = 0
            goto L37
        L76:
            if (r7 == r1) goto L7b
            r0 = 2
            if (r7 != r0) goto L41
        L7b:
            boolean r2 = r6.LJIL()
            goto L38
        L80:
            if (r3 == 0) goto L9
            android.view.ViewParent r1 = r3.getParent()
        L86:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L93
            if (r1 != r6) goto L8e
            goto L9
        L8e:
            android.view.ViewParent r1 = r1.getParent()
            goto L86
        L93:
            java.lang.Class r0 = r3.getClass()
            X.C16880lQ.LJLLJ(r0)
            android.view.ViewParent r1 = r3.getParent()
        L9e:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L8
            java.lang.Class r0 = r1.getClass()
            X.C16880lQ.LJLLJ(r0)
            android.view.ViewParent r1 = r1.getParent()
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80769Vmv.LJI(int):boolean");
    }

    public final void LJIIIIZZ(boolean z) {
        boolean z2;
        if (this.LLJJ == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.LJLLLLLL.isFinished()) {
                this.LJLLLLLL.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.LJLLLLLL.getCurrX();
                int currY = this.LJLLLLLL.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        LJJ(currX);
                    }
                }
            } else if (this.LJLLLLLL.getCurrX() != getScrollX()) {
                scrollTo(this.LJLLLLLL.getCurrX(), this.LJLLLLLL.getCurrY());
            }
        } else {
            z2 = false;
        }
        this.LLI = false;
        for (int i = 0; i < this.LJLJLJ.size(); i++) {
            C80786VnC c80786VnC = (C80786VnC) ListProtector.get(this.LJLJLJ, i);
            if (c80786VnC.LIZJ) {
                c80786VnC.LIZJ = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                C16300kU.LJIIL(this, this.LLJILLL);
            } else {
                this.LLJILLL.run();
            }
        }
    }

    public final void LJIIJJI(int i) {
        C80770Vmw c80770Vmw = this.LLJILJILJ;
        if (!c80770Vmw.LJFF) {
            int i2 = c80770Vmw.LJIIJ;
            if (i2 == -1) {
                c80770Vmw.LJIIJ = i;
            } else if (i2 != i) {
                c80770Vmw.LJFF = true;
            }
        }
        C0C3 c0c3 = this.LLIZLLLIL;
        if (c0c3 != null) {
            c0c3.onPageSelected(i);
        }
        List<C0C3> list = this.LLIZ;
        if (list != null) {
            int size = ((ArrayList) list).size();
            for (int i3 = 0; i3 < size; i3++) {
                C0C3 c0c32 = (C0C3) ListProtector.get(this.LLIZ, i3);
                if (c0c32 != null) {
                    c0c32.onPageSelected(i);
                }
            }
        }
    }

    public final void LJIILIIL(float f) {
        if (this.LLILL) {
            if (this.LJLLI == null) {
                return;
            }
            this.LLIIIZ += f;
            float scrollX = getScrollX() - f;
            float clientWidth = getClientWidth();
            float f2 = this.LLF * clientWidth;
            float f3 = this.LLFF * clientWidth;
            C80786VnC c80786VnC = (C80786VnC) ListProtector.get(this.LJLJLJ, 0);
            C80786VnC c80786VnC2 = (C80786VnC) ListProtector.get(this.LJLJLJ, r1.size() - 1);
            if (c80786VnC.LIZIZ != 0) {
                f2 = c80786VnC.LJ * clientWidth;
            }
            if (c80786VnC2.LIZIZ != this.LJLLI.getCount() - 1) {
                f3 = c80786VnC2.LJ * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.LLIIIZ = (scrollX - i) + this.LLIIIZ;
            scrollTo(i, getScrollY());
            LJJ(i);
            MotionEvent obtain = MotionEvent.obtain(this.LLILLIZIL, SystemClock.uptimeMillis(), 2, this.LLIIIZ, 0.0f, 0);
            this.LLIILZL.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public final C80786VnC LJIILL(View view) {
        for (int i = 0; i < this.LJLJLJ.size(); i++) {
            C80786VnC c80786VnC = (C80786VnC) ListProtector.get(this.LJLJLJ, i);
            if (this.LJLLI.LJIIZILJ(view, c80786VnC.LIZ)) {
                return c80786VnC;
            }
        }
        return null;
    }

    public final C80786VnC LJIIZILJ(int i) {
        for (int i2 = 0; i2 < this.LJLJLJ.size(); i2++) {
            C80786VnC c80786VnC = (C80786VnC) ListProtector.get(this.LJLJLJ, i2);
            if (c80786VnC.LIZIZ == i) {
                return c80786VnC;
            }
        }
        return null;
    }

    public final void LJIJJLI(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LLIILII) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LLIIIZ = motionEvent.getX(i);
            this.LLIILII = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.LLIILZL;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean LJJ(int i) {
        if (this.LJLJLJ.size() == 0) {
            if (this.LLILZ) {
                return false;
            }
            this.LLILZIL = false;
            LJIJJ(0, 0.0f, 0);
            if (this.LLILZIL) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C80786VnC LJIILLIIL = LJIILLIIL();
        int clientWidth = getClientWidth();
        int i2 = this.LJZI;
        int i3 = clientWidth + i2;
        float f = i2;
        float f2 = clientWidth;
        int i4 = LJIILLIIL.LIZIZ;
        float f3 = ((i / f2) - LJIILLIIL.LJ) / (LJIILLIIL.LIZLLL + (f / f2));
        this.LLILZIL = false;
        LJIJJ(i4, f3, (int) (i3 * f3));
        if (this.LLILZIL) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean LJJI(float f) {
        boolean z;
        boolean z2;
        float f2 = this.LLIIIZ - f;
        this.LLIIIZ = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.LLF * clientWidth;
        float f4 = this.LLFF * clientWidth;
        boolean z3 = false;
        C80786VnC c80786VnC = (C80786VnC) ListProtector.get(this.LJLJLJ, 0);
        ArrayList<C80786VnC> arrayList = this.LJLJLJ;
        C80786VnC c80786VnC2 = (C80786VnC) AnonymousClass028.LIZIZ(arrayList, 1, arrayList);
        if (c80786VnC.LIZIZ != 0) {
            f3 = c80786VnC.LJ * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c80786VnC2.LIZIZ != this.LJLLI.getCount() - 1) {
            f4 = c80786VnC2.LJ * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.LLILLJJLI.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.LLILLL.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.LLIIIZ = (scrollX - i) + this.LLIIIZ;
        scrollTo(i, getScrollY());
        LJJ(i);
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r1 == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x038d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(int r18) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80769Vmv.LJJIFFI(int):void");
    }

    public void LJJIIJ(C0C3 c0c3) {
        List<C0C3> list = this.LLIZ;
        if (list != null) {
            ((ArrayList) list).remove(c0c3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C80786VnC LJIILL;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (LJIILL = LJIILL(childAt)) != null && LJIILL.LIZIZ == this.LJLLILLLL) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.LJLLI == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (clientWidth * this.LLF))) {
                return false;
            }
            return true;
        }
        if (i <= 0 || scrollX >= ((int) (clientWidth * this.LLFF))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C80781Vn7) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.LLJILJILJ.LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
            r4 = this;
            boolean r0 = super.dispatchKeyEvent(r5)
            r3 = 1
            if (r0 != 0) goto L1f
            int r0 = r5.getAction()
            if (r0 != 0) goto L1e
            int r2 = r5.getKeyCode()
            r0 = 21
            r1 = 2
            if (r2 == r0) goto L36
            r0 = 22
            if (r2 == r0) goto L4c
            r0 = 61
            if (r2 == r0) goto L20
        L1e:
            r3 = 0
        L1f:
            return r3
        L20:
            boolean r0 = r5.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r0 = r4.LJI(r1)
            goto L56
        L2b:
            boolean r0 = r5.hasModifiers(r3)
            if (r0 == 0) goto L1e
            boolean r0 = r4.LJI(r3)
            goto L56
        L36:
            boolean r0 = r5.hasModifiers(r1)
            if (r0 == 0) goto L45
            int r0 = r4.LJLLILLLL
            if (r0 <= 0) goto L1e
            int r0 = r0 - r3
            r4.setCurrentItem(r0, r3)
            goto L1f
        L45:
            r0 = 17
            boolean r0 = r4.LJI(r0)
            goto L56
        L4c:
            boolean r0 = r5.hasModifiers(r1)
            if (r0 == 0) goto L59
            boolean r0 = r4.LJIL()
        L56:
            if (r0 == 0) goto L1e
            goto L1f
        L59:
            r0 = 66
            boolean r0 = r4.LJI(r0)
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80769Vmv.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C80786VnC LJIILL;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (LJIILL = LJIILL(childAt)) != null && LJIILL.LIZIZ == this.LJLLILLLL && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1 && !this.LJLILLLLZI) {
            motionEvent.setAction(1);
        }
        if (!this.LJLILLLLZI) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.LJLLI) != null && pagerAdapter.getCount() > 1)) {
            if (!this.LLILLJJLI.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.LLF * width);
                this.LLILLJJLI.setSize(height, width);
                z = false | this.LLILLJJLI.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.LLILLL.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.LLFF + 1.0f)) * width2);
                this.LLILLL.setSize(height2, width2);
                z |= this.LLILLL.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                C16300kU.LJIIJ(this);
                return;
            }
            return;
        }
        this.LLILLJJLI.finish();
        this.LLILLL.finish();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C80781Vn7(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.LJZI > 0 && this.LJZL != null && this.LJLJLJ.size() > 0 && this.LJLLI != null) {
            int scrollX = getScrollX();
            float width = getWidth();
            float f2 = this.LJZI / width;
            int i2 = 0;
            C80786VnC c80786VnC = (C80786VnC) ListProtector.get(this.LJLJLJ, 0);
            float f3 = c80786VnC.LJ;
            int size = this.LJLJLJ.size();
            int i3 = ((C80786VnC) ListProtector.get(this.LJLJLJ, size - 1)).LIZIZ;
            for (int i4 = c80786VnC.LIZIZ; i4 < i3; i4++) {
                while (true) {
                    i = c80786VnC.LIZIZ;
                    if (i4 <= i || i2 >= size) {
                        break;
                    }
                    i2++;
                    c80786VnC = (C80786VnC) ListProtector.get(this.LJLJLJ, i2);
                }
                if (i4 == i) {
                    float f4 = c80786VnC.LJ;
                    float f5 = c80786VnC.LIZLLL;
                    f = (f4 + f5) * width;
                    f3 = f4 + f5 + f2;
                } else {
                    float LJIILJJIL = this.LJLLI.LJIILJJIL(i4);
                    f = (f3 + LJIILJJIL) * width;
                    f3 = LJIILJJIL + f2 + f3;
                }
                if (this.LJZI + f > scrollX) {
                    this.LJZL.setBounds(Math.round(f), this.LL, Math.round(this.LJZI + f), this.LLD);
                    this.LJZL.draw(canvas);
                }
                if (f > scrollX + r9) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            LJJIIJZLJL();
            return false;
        }
        if (action != 0) {
            if (this.LLII) {
                return true;
            }
            if (this.LLIIII) {
                return false;
            }
        }
        if (action != 0) {
            if (action != 2) {
                if (action == 6) {
                    LJIJJLI(motionEvent);
                }
            } else {
                int i = this.LLIILII;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float f2 = x - this.LLIIIZ;
                    float abs = Math.abs(f2);
                    float y = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y - this.LLIIL);
                    if (f2 != 0.0f) {
                        float f3 = this.LLIIIZ;
                        if ((f3 >= this.LLIIIJ || f2 <= 0.0f) && ((f3 <= getWidth() - this.LLIIIJ || f2 >= 0.0f) && LJII(this, false, (int) f2, (int) x, (int) y))) {
                            this.LLIIIZ = x;
                            this.LLIIJI = y;
                            this.LLIIII = true;
                            return false;
                        }
                    }
                    float f4 = this.LLIIIL;
                    if (abs > f4 && abs * 0.5f > abs2) {
                        this.LLII = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        setScrollState(1);
                        if (f2 > 0.0f) {
                            f = this.LLIIJLIL + this.LLIIIL;
                        } else {
                            f = this.LLIIJLIL - this.LLIIIL;
                        }
                        this.LLIIIZ = f;
                        this.LLIIJI = y;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > f4) {
                        this.LLIIII = true;
                    }
                    if (this.LLII && LJJI(x)) {
                        C16300kU.LJIIJ(this);
                    }
                }
            }
        } else {
            float x2 = motionEvent.getX();
            this.LLIIJLIL = x2;
            this.LLIIIZ = x2;
            float y2 = motionEvent.getY();
            this.LLIIL = y2;
            this.LLIIJI = y2;
            this.LLIILII = motionEvent.getPointerId(0);
            this.LLIIII = false;
            this.LJLZ = true;
            this.LJLLLLLL.computeScrollOffset();
            if (this.LLJJ == 2 && Math.abs(this.LJLLLLLL.getFinalX() - this.LJLLLLLL.getCurrX()) > this.LLILIL) {
                this.LJLLLLLL.abortAnimation();
                this.LLI = false;
                LJJII();
                this.LLII = true;
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            } else {
                LJIIIIZZ(false);
                this.LLII = false;
            }
        }
        if (this.LLIILZL == null) {
            this.LLIILZL = VelocityTracker.obtain();
        }
        this.LLIILZL.addMovement(motionEvent);
        return this.LLII;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof DmtViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DmtViewPager$SavedState dmtViewPager$SavedState = (DmtViewPager$SavedState) parcelable;
        super.onRestoreInstanceState(dmtViewPager$SavedState.mSuperState);
        PagerAdapter pagerAdapter = this.LJLLI;
        if (pagerAdapter != null) {
            pagerAdapter.LJIJI(dmtViewPager$SavedState.LJLILLLLZI, dmtViewPager$SavedState.LJLJI);
            LJJIIZI(dmtViewPager$SavedState.LJLIL, false, true, 0);
        } else {
            this.LJLLJ = dmtViewPager$SavedState.LJLIL;
            this.LJLLL = dmtViewPager$SavedState.LJLILLLLZI;
            this.LJLLLL = dmtViewPager$SavedState.LJLJI;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80769Vmv.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.LLFII) {
            if (C78996UzQ.LJJIIJZLJL(view)) {
                C78996UzQ.LJI();
            }
            removeViewInLayout(view);
            return;
        }
        super.removeView(view);
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        boolean isAssignableFrom = C84O.class.isAssignableFrom(getClass());
        if (!isAssignableFrom) {
            C38414F5u c38414F5u = C38413F5t.LIZIZ;
            LJJIIJ(c38414F5u);
            LJFF(c38414F5u);
        }
        if (C38413F5t.LIZ("setDmtViewPagerAdapter") && !isAssignableFrom) {
            try {
                new AqS73S0000000_6(2).invoke();
            } catch (Throwable unused) {
            }
        }
        PagerAdapter pagerAdapter2 = this.LJLLI;
        if (pagerAdapter2 != null) {
            LJJIJ(pagerAdapter2, null);
            this.LJLLI.LJJIFFI(this);
            for (int i = 0; i < this.LJLJLJ.size(); i++) {
                C80786VnC c80786VnC = (C80786VnC) ListProtector.get(this.LJLJLJ, i);
                this.LJLLI.LJIIIZ(c80786VnC.LIZIZ, this, c80786VnC.LIZ);
            }
            this.LJLLI.LJIIJJI(this);
            this.LJLJLJ.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C80781Vn7) getChildAt(i2).getLayoutParams()).LIZ) {
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
            this.LJLLILLLL = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.LJLLI;
        this.LJLLI = pagerAdapter;
        this.LJLJL = 0;
        if (pagerAdapter != null) {
            if (this.LJZ == null) {
                this.LJZ = new C80792VnI(this);
            }
            LJJIJ(this.LJLLI, this.LJZ);
            this.LLI = false;
            boolean z = this.LLILZ;
            this.LLILZ = true;
            this.LJLJL = this.LJLLI.getCount();
            if (this.LJLLJ >= 0) {
                this.LJLLI.LJIJI(this.LJLLL, this.LJLLLL);
                LJJIIZI(this.LJLLJ, false, true, 0);
                this.LJLLJ = -1;
                this.LJLLL = null;
                this.LJLLLL = null;
            } else if (!z) {
                LJJII();
            } else {
                requestLayout();
            }
        }
        List<InterfaceC80715Vm3> list = this.LLJ;
        if (list != null && !((ArrayList) list).isEmpty()) {
            int size = ((ArrayList) this.LLJ).size();
            for (int i3 = 0; i3 < size; i3++) {
                ((InterfaceC80715Vm3) ListProtector.get(this.LLJ, i3)).LIZ(pagerAdapter3, pagerAdapter);
            }
        }
    }

    public void setAllowCreateEndItem(boolean z) {
        this.LLJJI = z;
    }

    public void setCanTouchBeforeScrollIdle(boolean z) {
        this.LJLJI = z;
    }

    public void setCurrentItem(int i) {
        this.LLI = false;
        LJJIIZI(i, !this.LLILZ, false, 0);
    }

    public void setDefaultGutterSize(int i) {
        this.LLIIIILZ = i;
    }

    public void setDragMotionEventListener(InterfaceC54209LPh interfaceC54209LPh) {
        this.LLJI = interfaceC54209LPh;
    }

    public void setExpDuration(int i) {
        this.LLJIJIL = i;
    }

    public void setFlingEnabled(boolean z) {
        C35805E3l c35805E3l = this.LJLJJL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isFlingEnabled: ");
        LIZ.append(this.LJLJJI);
        LIZ.append(",shouldEnableFling:");
        LIZ.append(z);
        c35805E3l.LJIIIZ("DmtviewPgaer", null, X1D.LIZIZ(LIZ));
        this.LJLJJI = z;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.LLIFFJFJJ) {
            this.LLIFFJFJJ = i;
            LJJII();
        }
    }

    public void setOnPageChangeListener(C0C3 c0c3) {
        this.LLIZLLLIL = c0c3;
    }

    public void setOptimizeSlideEnable(boolean z) {
        this.LJLIL = z;
    }

    public void setPageMargin(int i) {
        int i2 = this.LJZI;
        this.LJZI = i;
        int width = getWidth();
        LJJIII(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.LJZL = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setPageOffset(float f) {
        this.LLJILJIL = f;
    }

    public void setScrollState(int i) {
        if (this.LLJJ == i) {
            return;
        }
        this.LLJJ = i;
        if (i == 0) {
            this.LJLILLLLZI = true;
        }
        C0C3 c0c3 = this.LLIZLLLIL;
        if (c0c3 != null) {
            c0c3.onPageScrollStateChanged(i);
        }
        List<C0C3> list = this.LLIZ;
        if (list != null) {
            int size = ((ArrayList) list).size();
            for (int i2 = 0; i2 < size; i2++) {
                C0C3 c0c32 = (C0C3) ListProtector.get(this.LLIZ, i2);
                if (c0c32 != null) {
                    c0c32.onPageScrollStateChanged(i);
                }
            }
        }
        if (i == 1) {
            C80770Vmw c80770Vmw = this.LLJILJILJ;
            if (!c80770Vmw.LIZ()) {
                return;
            }
            c80770Vmw.LJFF();
            return;
        }
        if (i != 0) {
            return;
        }
        C80770Vmw c80770Vmw2 = this.LLJILJILJ;
        if (!c80770Vmw2.LIZ()) {
            return;
        }
        if (c80770Vmw2.LJII != VIQ.NOT_OPT) {
            return;
        }
        c80770Vmw2.LJII = VIQ.WAIT_OPT;
    }

    public void setScroller(Scroller scroller) {
        this.LJLLLLLL = scroller;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.LJZL) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C04270Et.LIZIZ(getContext(), i));
    }

    public C80769Vmv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLILLLLZI = true;
        this.LJLJI = true;
        this.LJLJJI = true;
        this.LJLJJL = new C35805E3l();
        this.LJLJJLL = false;
        this.LJLJLJ = new ArrayList<>();
        this.LJLJLLL = new C80786VnC();
        this.LJLL = new Rect();
        this.LJLLJ = -1;
        this.LJLLL = null;
        this.LJLLLL = null;
        this.LLF = -3.4028235E38f;
        this.LLFF = Float.MAX_VALUE;
        this.LLIFFJFJJ = 1;
        this.LLIILII = -1;
        this.LLILZ = true;
        this.LLJIJIL = -1;
        this.LLJILJIL = 0.0f;
        this.LLJILJILJ = new C80770Vmw(this);
        this.LLJILLL = new ARunnableS50S0100000_14(this, 143);
        this.LLJJ = 0;
        this.LLJJI = true;
        LJIJ();
    }

    public static void LJJIJ(PagerAdapter pagerAdapter, C80792VnI c80792VnI) {
        try {
            Method declaredMethod = PagerAdapter.class.getDeclaredMethod("LJJ", DataSetObserver.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(pagerAdapter, c80792VnI);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final C80786VnC LIZLLL(int i, int i2) {
        C80786VnC c80786VnC = new C80786VnC();
        c80786VnC.LIZIZ = i;
        c80786VnC.LIZ = this.LJLLI.LJIILLIIL(i, this);
        c80786VnC.LIZLLL = this.LJLLI.LJIILJJIL(i);
        if (i2 < 0 || i2 >= this.LJLJLJ.size()) {
            this.LJLJLJ.add(c80786VnC);
        } else {
            ListProtector.add(this.LJLJLJ, i2, c80786VnC);
        }
        return c80786VnC;
    }

    public final Rect LJIILJJIL(Rect rect, View view) {
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

    public final void LJJIJIIJI(int i, int i2) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.LJLLLLLL;
        if (scroller != null && !scroller.isFinished()) {
            if (this.LJLZ) {
                scrollX = this.LJLLLLLL.getCurrX();
            } else {
                scrollX = this.LJLLLLLL.getStartX();
            }
            this.LJLLLLLL.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i3 = i - scrollX;
        int i4 = -scrollY;
        if (i3 == 0 && i4 == 0) {
            LJIIIIZZ(false);
            LJJII();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        float f = clientWidth;
        float f2 = clientWidth / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i3) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i3) / ((this.LJLLI.LJIILJJIL(this.LJLLILLLL) * f) + this.LJZI)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.LJLZ = false;
        ViewPagerSlideTransitionService LIZIZ = ViewPagerSlideTransitionServiceImpl.LIZIZ();
        if (LIZIZ != null && LIZIZ.isEnable()) {
            min = LIZIZ.getDuration();
        }
        int i5 = this.LLJIJIL;
        if (i5 <= 0) {
            i5 = min;
        }
        this.LJLLLLLL.startScroll(scrollX, scrollY, i3, i4, i5);
        C16300kU.LJIIJ(this);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return ((C80781Vn7) ((View) ListProtector.get(null, i2)).getLayoutParams()).LJFF;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C80781Vn7 c80781Vn7;
        C80781Vn7 c80781Vn72;
        boolean z;
        int i3;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.LLIIIJ = Math.min(measuredWidth / 10, this.LLIIIILZ);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            int i5 = 1073741824;
            boolean z2 = true;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c80781Vn72 = (C80781Vn7) childAt.getLayoutParams()) != null && c80781Vn72.LIZ) {
                int i6 = c80781Vn72.LIZIZ;
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
                int i10 = ((ViewGroup.LayoutParams) c80781Vn72).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i3 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) c80781Vn72).height;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = measuredHeight;
                    }
                } else {
                    i11 = measuredHeight;
                    i5 = i9;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i3), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.LLFFF = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.LLFII = true;
        LJJII();
        this.LLFII = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c80781Vn7 = (C80781Vn7) childAt2.getLayoutParams()) == null || !c80781Vn7.LIZ)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c80781Vn7.LIZJ), 1073741824), this.LLFFF);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C80786VnC LJIILL;
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
            if (childAt.getVisibility() == 0 && (LJIILL = LJIILL(childAt)) != null && LJIILL.LIZIZ == this.LJLLILLLL && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    public void setCurrentItem(int i, boolean z) {
        this.LLI = false;
        LJJIIZI(i, z, false, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.LLILZLL
            r3 = 0
            r2 = 1
            if (r0 <= 0) goto L6a
            int r10 = r11.getScrollX()
            int r7 = r11.getPaddingLeft()
            int r9 = r11.getPaddingRight()
            int r8 = r11.getWidth()
            int r6 = r11.getChildCount()
            r5 = 0
        L1b:
            if (r5 >= r6) goto L6a
            android.view.View r4 = r11.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            X.Vn7 r1 = (X.C80781Vn7) r1
            boolean r0 = r1.LIZ
            if (r0 != 0) goto L2e
        L2b:
            int r5 = r5 + 1
            goto L1b
        L2e:
            int r0 = r1.LIZIZ
            r1 = r0 & 7
            if (r1 == r2) goto L4e
            r0 = 3
            if (r1 == r0) goto L48
            r0 = 5
            if (r1 == r0) goto L5b
            r0 = r7
        L3b:
            int r7 = r7 + r10
            int r1 = r4.getLeft()
            int r7 = r7 - r1
            if (r7 == 0) goto L46
            r4.offsetLeftAndRight(r7)
        L46:
            r7 = r0
            goto L2b
        L48:
            int r0 = r4.getWidth()
            int r0 = r0 + r7
            goto L3b
        L4e:
            int r0 = r4.getMeasuredWidth()
            int r0 = r8 - r0
            int r0 = r0 / 2
            int r1 = java.lang.Math.max(r0, r7)
            goto L67
        L5b:
            int r1 = r8 - r9
            int r0 = r4.getMeasuredWidth()
            int r1 = r1 - r0
            int r0 = r4.getMeasuredWidth()
            int r9 = r9 + r0
        L67:
            r0 = r7
            r7 = r1
            goto L3b
        L6a:
            X.0C3 r0 = r11.LLIZLLLIL
            if (r0 == 0) goto L71
            r0.onPageScrolled(r12, r13, r14)
        L71:
            java.util.List<X.0C3> r0 = r11.LLIZ
            if (r0 == 0) goto L8d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
        L7b:
            if (r3 >= r1) goto L8d
            java.util.List<X.0C3> r0 = r11.LLIZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            X.0C3 r0 = (X.C0C3) r0
            if (r0 == 0) goto L8a
            r0.onPageScrolled(r12, r13, r14)
        L8a:
            int r3 = r3 + 1
            goto L7b
        L8d:
            r11.LLILZIL = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80769Vmv.LJIJJ(int, float, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C80786VnC LJIILL;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (LJIILL = LJIILL(childAt)) != null && LJIILL.LIZIZ == this.LJLLILLLL) {
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
        boolean z;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C80781Vn7 c80781Vn7 = (C80781Vn7) layoutParams;
        boolean z2 = c80781Vn7.LIZ;
        if (view.getClass().getAnnotation(InterfaceC80314Vfa.class) != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = z2 | z;
        c80781Vn7.LIZ = z3;
        if (this.LLFII) {
            if (!z3) {
                c80781Vn7.LIZLLL = true;
                addViewInLayout(view, i, layoutParams);
            } else {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
        } else {
            super.addView(view, i, layoutParams);
        }
        C80770Vmw c80770Vmw = this.LLJILJILJ;
        if (!c80770Vmw.LIZ()) {
            return;
        }
        if (c80770Vmw.LJII != VIQ.NOT_OPT) {
            return;
        }
        c80770Vmw.LJII = VIQ.WAIT_OPT;
    }

    public final int LJIIJ(int i, float f, int i2, int i3) {
        if (this.LJLJJI && Math.abs(i3) > this.LLILII && Math.abs(i2) > this.LLIIZ) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            float f2 = 0.4f;
            if (!this.LJLIL ? i < this.LJLLILLLL : i >= this.LJLLILLLL) {
                f2 = 0.6f;
            }
            i += (int) (f + f2 + this.LLJILJIL);
        }
        if (this.LJLJLJ.size() > 0) {
            return Math.max(((C80786VnC) ListProtector.get(this.LJLJLJ, 0)).LIZIZ, Math.min(i, ((C80786VnC) ListProtector.get(this.LJLJLJ, r1.size() - 1)).LIZIZ));
        }
        return i;
    }

    public final void LJJIII(int i, int i2, int i3, int i4) {
        float f;
        if (i2 > 0 && !this.LJLJLJ.isEmpty()) {
            if (!this.LJLLLLLL.isFinished()) {
                this.LJLLLLLL.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
            return;
        }
        C80786VnC LJIIZILJ = LJIIZILJ(this.LJLLILLLL);
        if (LJIIZILJ != null) {
            f = Math.min(LJIIZILJ.LJ, this.LLFF);
        } else {
            f = 0.0f;
        }
        int paddingLeft = (int) (f * ((i - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft == getScrollX()) {
            return;
        }
        LJIIIIZZ(false);
        scrollTo(paddingLeft, getScrollY());
    }

    public final void LJJIIZ(int i, boolean z, int i2, boolean z2) {
        int i3;
        C80786VnC LJIIZILJ = LJIIZILJ(i);
        if (LJIIZILJ != null) {
            i3 = (int) (Math.max(this.LLF, Math.min(LJIIZILJ.LJ, this.LLFF)) * getClientWidth());
        } else {
            i3 = 0;
        }
        if (z) {
            LJJIJIIJI(i3, i2);
            if (z2) {
                LJIIJJI(i);
                return;
            }
            return;
        }
        if (z2) {
            LJIIJJI(i);
        }
        LJIIIIZZ(false);
        scrollTo(i3, 0);
        LJJ(i3);
    }

    public final void LJJIIZI(int i, boolean z, boolean z2, int i2) {
        boolean z3;
        this.LLJILJILJ.LJFF();
        PagerAdapter pagerAdapter = this.LJLLI;
        boolean z4 = false;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.LJLLILLLL == i && this.LJLJLJ.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.LJLLI.getCount()) {
            i = this.LJLLI.getCount() - 1;
        }
        int i3 = this.LLIFFJFJJ;
        int i4 = this.LJLLILLLL;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.LJLJLJ.size(); i5++) {
                ((C80786VnC) ListProtector.get(this.LJLJLJ, i5)).LIZJ = true;
            }
        }
        if (this.LJLLILLLL != i) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.LJLJI || !z) {
            z4 = true;
        }
        this.LJLILLLLZI = z4;
        if (this.LLILZ) {
            this.LJLLILLLL = i;
            if (z3) {
                LJIIJJI(i);
            }
            requestLayout();
            return;
        }
        LJJIFFI(i);
        LJJIIZ(i, z, i2, z3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.LJZI;
            LJJIII(i, i3, i5, i5);
        }
    }

    public boolean LJII(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && LJII(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
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
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80769Vmv.onLayout(boolean, int, int, int, int):void");
    }
}
