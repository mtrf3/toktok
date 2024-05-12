package X;

import Y.IDRunnableS88S0100000_29;
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
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager$SavedState;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import o3.h0;

/* renamed from: X.ZtO, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public class C91362ZtO extends AbstractC55114Lk6 implements InterfaceC92113jT {
    public static final int[] LLILZ = {R.attr.layout_gravity};
    public int LJLIL;
    public final ArrayList<C91144Zps> LJLILLLLZI;
    public final C91144Zps LJLJI;
    public final Rect LJLJJI;
    public PagerAdapter LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public Parcelable LJLJLJ;
    public ClassLoader LJLJLLL;
    public C91245ZrV LJLL;
    public C91147Zpv LJLLI;
    public int LJLLILLLL;
    public Drawable LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public int LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public boolean LL;
    public int LLD;
    public boolean LLF;
    public boolean LLFF;
    public int LLFFF;
    public int LLFII;
    public int LLFZ;
    public float LLI;
    public float LLIFFJFJJ;
    public float LLII;
    public float LLIIII;
    public int LLIIIILZ;
    public VelocityTracker LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public int LLIIJI;
    public int LLIIJLIL;
    public boolean LLIIL;
    public long LLIILII;
    public C07Q LLIILZL;
    public C07Q LLIIZ;
    public boolean LLIL;
    public boolean LLILII;
    public int LLILIL;
    public final List<C0C3> LLILL;
    public Method LLILLIZIL;
    public final Runnable LLILLJJLI;
    public int LLILLL;

    public final void LJIILJJIL() {
        this.LLF = false;
        this.LLFF = false;
        VelocityTracker velocityTracker = this.LLIIIJ;
        if (velocityTracker != null) {
            o.LJI(velocityTracker);
            velocityTracker.recycle();
            this.LLIIIJ = null;
        }
    }

    public final void setOnAdapterChangeListener(InterfaceC91146Zpu interfaceC91146Zpu) {
    }

    @Override // X.InterfaceC92113jT
    public boolean LIZJ() {
        if (this.LLF) {
            return false;
        }
        this.LLIIL = true;
        setScrollState(1);
        this.LLIFFJFJJ = 0.0f;
        this.LLIIII = 0.0f;
        VelocityTracker velocityTracker = this.LLIIIJ;
        if (velocityTracker == null) {
            this.LLIIIJ = VelocityTracker.obtain();
        } else {
            o.LJI(velocityTracker);
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        VelocityTracker velocityTracker2 = this.LLIIIJ;
        o.LJI(velocityTracker2);
        velocityTracker2.addMovement(obtain);
        obtain.recycle();
        this.LLIILII = uptimeMillis;
        return true;
    }

    @Override // X.InterfaceC92113jT
    public final void LIZLLL() {
        if (!this.LLIIL) {
            C78983UzD.LJIILL("No fake drag in progress. Call beginFakeDrag first.");
            return;
        }
        VelocityTracker velocityTracker = this.LLIIIJ;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.LLIIIZ);
            int yVelocity = (int) velocityTracker.getYVelocity(this.LLIIIILZ);
            this.LL = true;
            int clientHeight = getClientHeight();
            int scrollY = getScrollY();
            C91144Zps LJIIZILJ = LJIIZILJ();
            o.LJI(LJIIZILJ);
            LJJIIJ(LJIILIIL(LJIIZILJ.LIZIZ, ((scrollY / clientHeight) - LJIIZILJ.LJ) / LJIIZILJ.LIZLLL, yVelocity, (int) (this.LLIFFJFJJ - this.LLIIII)), true, true, yVelocity);
        }
        LJIILJJIL();
        this.LLIIL = false;
    }

    public final void LJIIL() {
        boolean z;
        PagerAdapter pagerAdapter = this.LJLJJL;
        o.LJI(pagerAdapter);
        int count = pagerAdapter.getCount();
        this.LJLIL = count;
        if (this.LJLILLLLZI.size() < (this.LLD * 2) + 1 && this.LJLILLLLZI.size() < count) {
            z = true;
        } else {
            z = false;
        }
        int i = this.LJLJJLL;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.LJLILLLLZI.size()) {
            Object obj = ListProtector.get(this.LJLILLLLZI, i2);
            o.LJIIIIZZ(obj, "mItems[i]");
            C91144Zps c91144Zps = (C91144Zps) obj;
            PagerAdapter pagerAdapter2 = this.LJLJJL;
            o.LJI(pagerAdapter2);
            Object obj2 = c91144Zps.LIZ;
            o.LJI(obj2);
            int LJIIL = pagerAdapter2.LJIIL(obj2);
            if (LJIIL != -1) {
                if (LJIIL == -2) {
                    ListProtector.remove(this.LJLILLLLZI, i2);
                    int i3 = i2 - 1;
                    if (!z2) {
                        PagerAdapter pagerAdapter3 = this.LJLJJL;
                        o.LJI(pagerAdapter3);
                        pagerAdapter3.LJJIFFI(this);
                        z2 = true;
                    }
                    PagerAdapter pagerAdapter4 = this.LJLJJL;
                    o.LJI(pagerAdapter4);
                    int i4 = c91144Zps.LIZIZ;
                    Object obj3 = c91144Zps.LIZ;
                    o.LJI(obj3);
                    pagerAdapter4.LJIIIZ(i4, this, obj3);
                    int i5 = this.LJLJJLL;
                    if (i5 == c91144Zps.LIZIZ) {
                        i = Math.max(0, Math.min(i5, (-1) + count));
                    }
                    i2 = i3 + 1;
                    z = true;
                } else {
                    int i6 = c91144Zps.LIZIZ;
                    if (i6 != LJIIL) {
                        if (i6 == this.LJLJJLL) {
                            i = LJIIL;
                        }
                        c91144Zps.LIZIZ = LJIIL;
                        z = true;
                    }
                }
            }
            i2++;
        }
        if (z2) {
            PagerAdapter pagerAdapter5 = this.LJLJJL;
            o.LJI(pagerAdapter5);
            pagerAdapter5.LJIIJJI(this);
        }
        Collections.sort(this.LJLILLLLZI, C91141Zpp.LJLIL);
        if (z) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i7).getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager.LayoutParams");
                C91145Zpt c91145Zpt = (C91145Zpt) layoutParams;
                if (!c91145Zpt.LIZ) {
                    c91145Zpt.LIZJ = 0.0f;
                }
            }
            LJJIIJ(i, false, true, 0);
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        C91245ZrV c91245ZrV = this.LJLL;
        o.LJI(c91245ZrV);
        if (!c91245ZrV.isFinished()) {
            C91245ZrV c91245ZrV2 = this.LJLL;
            o.LJI(c91245ZrV2);
            if (c91245ZrV2.computeScrollOffset()) {
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                C91245ZrV c91245ZrV3 = this.LJLL;
                o.LJI(c91245ZrV3);
                int currX = c91245ZrV3.getCurrX();
                C91245ZrV c91245ZrV4 = this.LJLL;
                o.LJI(c91245ZrV4);
                int currY = c91245ZrV4.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (!LJIL(currY)) {
                        C91245ZrV c91245ZrV5 = this.LJLL;
                        o.LJI(c91245ZrV5);
                        c91245ZrV5.abortAnimation();
                        scrollTo(currX, 0);
                    }
                }
                C16300kU.LJIIJ(this);
                return;
            }
        }
        LJIIJJI(true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C91145Zpt();
    }

    @Override // X.AbstractC55114Lk6
    public PagerAdapter getAdapter() {
        PagerAdapter pagerAdapter = this.LJLJJL;
        o.LJI(pagerAdapter);
        return pagerAdapter;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.LLILLJJLI);
        super.onDetachedFromWindow();
    }

    private final int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public final C91144Zps LJIIZILJ() {
        float f;
        float f2;
        int i;
        int clientHeight = getClientHeight();
        float f3 = 0.0f;
        if (clientHeight > 0) {
            f = getScrollY() / clientHeight;
            f2 = this.LJLLILLLL / clientHeight;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C91144Zps c91144Zps = null;
        float f4 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.LJLILLLLZI.size()) {
            Object obj = ListProtector.get(this.LJLILLLLZI, i3);
            o.LJIIIIZZ(obj, "mItems[i]");
            C91144Zps c91144Zps2 = (C91144Zps) obj;
            if (!z && c91144Zps2.LIZIZ != (i = i2 + 1)) {
                c91144Zps2 = this.LJLJI;
                c91144Zps2.LJ = f3 + f4 + f2;
                c91144Zps2.LIZIZ = i;
                PagerAdapter pagerAdapter = this.LJLJJL;
                o.LJI(pagerAdapter);
                c91144Zps2.LIZLLL = pagerAdapter.LJIILJJIL(c91144Zps2.LIZIZ);
                i3--;
            }
            f3 = c91144Zps2.LJ;
            float f5 = c91144Zps2.LIZLLL + f3 + f2;
            if (z || f >= f3) {
                if (f < f5 || i3 == this.LJLILLLLZI.size() - 1) {
                    return c91144Zps2;
                }
                i2 = c91144Zps2.LIZIZ;
                f4 = c91144Zps2.LIZLLL;
                i3++;
                z = false;
                c91144Zps = c91144Zps2;
            } else {
                return c91144Zps;
            }
        }
        return c91144Zps;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.LJLLJ;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLIL = true;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        MDVerticalViewPager$SavedState mDVerticalViewPager$SavedState = new MDVerticalViewPager$SavedState(super.onSaveInstanceState());
        mDVerticalViewPager$SavedState.position = this.LJLJJLL;
        PagerAdapter pagerAdapter = this.LJLJJL;
        if (pagerAdapter != null) {
            o.LJI(pagerAdapter);
            mDVerticalViewPager$SavedState.adapterState = pagerAdapter.LJIJJ();
        }
        return mDVerticalViewPager$SavedState;
    }

    @Override // X.InterfaceC92113jT
    public final boolean LIZ() {
        return this.LLIIL;
    }

    @Override // X.AbstractC55114Lk6
    public int getCurrentItem() {
        return this.LJLJJLL;
    }

    public final boolean getMFakeDragging() {
        return this.LLIIL;
    }

    public final int getOffscreenPageLimit() {
        return this.LLD;
    }

    public final int getPageMargin() {
        return this.LJLLILLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91362ZtO(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj);
        new LinkedHashMap();
        this.LJLILLLLZI = new ArrayList<>();
        this.LJLJI = new C91144Zps();
        this.LJLJJI = new Rect();
        this.LJLJL = -1;
        this.LJLLLLLL = -3.4028235E38f;
        this.LJLZ = Float.MAX_VALUE;
        this.LLD = 2;
        this.LLIIIILZ = -1;
        this.LLIL = true;
        this.LLILL = new ArrayList();
        this.LLILLJJLI = new IDRunnableS88S0100000_29(this, 19);
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        this.LJLL = new C91245ZrV(context, new InterpolatorC91243ZrT(new InterpolatorC91244ZrU()));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.LLFZ = viewConfiguration.getScaledPagingTouchSlop();
        this.LLIIIL = (int) (LiveChatShowDelayForHotLiveSetting.DEFAULT * f);
        this.LLIIIZ = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LLIILZL = new C07Q(context);
        this.LLIIZ = new C07Q(context);
        this.LLIIJI = (int) (25 * f);
        this.LLIIJLIL = (int) (2 * f);
        this.LLFFF = (int) (16 * f);
        h0.LJIJI(this, new C91361ZtN(this));
        if (C16300kU.LIZJ(this) == 0) {
            C16300kU.LJIJ(this, 1);
        }
    }

    private final void setScrollingCacheEnabled(boolean z) {
        if (this.LJZL != z) {
            this.LJZL = z;
        }
    }

    @Override // X.InterfaceC92113jT
    public void LJFF(float f) {
        if (!this.LLIIL) {
            C78983UzD.LJIILL("No fake drag in progress. Call beginFakeDrag first.");
            return;
        }
        this.LLIFFJFJJ += f;
        float scrollY = getScrollY() - f;
        float clientHeight = getClientHeight();
        float f2 = this.LJLLLLLL * clientHeight;
        float f3 = this.LJLZ * clientHeight;
        Object obj = ListProtector.get(this.LJLILLLLZI, 0);
        o.LJIIIIZZ(obj, "mItems[0]");
        C91144Zps c91144Zps = (C91144Zps) obj;
        Object obj2 = ListProtector.get(this.LJLILLLLZI, r1.size() - 1);
        o.LJIIIIZZ(obj2, "mItems[mItems.size - 1]");
        C91144Zps c91144Zps2 = (C91144Zps) obj2;
        if (c91144Zps.LIZIZ != 0) {
            f2 = c91144Zps.LJ * clientHeight;
        }
        int i = c91144Zps2.LIZIZ;
        o.LJI(this.LJLJJL);
        if (i != r0.getCount() - 1) {
            f3 = c91144Zps2.LJ * clientHeight;
        }
        if (scrollY < f2) {
            scrollY = f2;
        } else if (scrollY > f3) {
            scrollY = f3;
        }
        int i2 = (int) scrollY;
        this.LLIFFJFJJ += scrollY - i2;
        scrollTo(getScrollX(), i2);
        LJIL(i2);
        MotionEvent obtain = MotionEvent.obtain(this.LLIILII, SystemClock.uptimeMillis(), 2, 0.0f, this.LLIFFJFJJ, 0);
        VelocityTracker velocityTracker = this.LLIIIJ;
        if (velocityTracker != null) {
            o.LJI(velocityTracker);
            velocityTracker.addMovement(obtain);
        }
        obtain.recycle();
    }

    @Override // X.AbstractC55114Lk6
    public final void LJI(C0C3 c0c3) {
        List<C0C3> list = this.LLILL;
        o.LJI(list);
        ((ArrayList) list).add(c0c3);
    }

    @Override // X.AbstractC55114Lk6
    public final void LJII(C0C3 listener) {
        o.LJIIIZ(listener, "listener");
        List<C0C3> list = this.LLILL;
        o.LJI(list);
        ((ArrayList) list).remove(listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(int r7) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91362ZtO.LJIIIZ(int):boolean");
    }

    public final void LJIIJJI(boolean z) {
        boolean z2;
        if (this.LLILLL == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            C91245ZrV c91245ZrV = this.LJLL;
            o.LJI(c91245ZrV);
            c91245ZrV.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            C91245ZrV c91245ZrV2 = this.LJLL;
            o.LJI(c91245ZrV2);
            int currX = c91245ZrV2.getCurrX();
            C91245ZrV c91245ZrV3 = this.LJLL;
            o.LJI(c91245ZrV3);
            int currY = c91245ZrV3.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        } else {
            z2 = false;
        }
        this.LL = false;
        int size = this.LJLILLLLZI.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(this.LJLILLLLZI, i);
            o.LJIIIIZZ(obj, "mItems[i]");
            C91144Zps c91144Zps = (C91144Zps) obj;
            if (c91144Zps.LIZJ) {
                c91144Zps.LIZJ = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                C16300kU.LJIIL(this, this.LLILLJJLI);
            } else {
                ((IDRunnableS88S0100000_29) this.LLILLJJLI).run();
            }
        }
    }

    public final C91144Zps LJIILLIIL(View view) {
        int size = this.LJLILLLLZI.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(this.LJLILLLLZI, i);
            o.LJIIIIZZ(obj, "mItems[i]");
            C91144Zps c91144Zps = (C91144Zps) obj;
            PagerAdapter pagerAdapter = this.LJLJJL;
            o.LJI(pagerAdapter);
            o.LJI(view);
            Object obj2 = c91144Zps.LIZ;
            o.LJI(obj2);
            if (pagerAdapter.LJIIZILJ(view, obj2)) {
                return c91144Zps;
            }
        }
        return null;
    }

    public final C91144Zps LJIJ(int i) {
        int size = this.LJLILLLLZI.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ListProtector.get(this.LJLILLLLZI, i2);
            o.LJIIIIZZ(obj, "mItems[i]");
            C91144Zps c91144Zps = (C91144Zps) obj;
            if (c91144Zps.LIZIZ == i) {
                return c91144Zps;
            }
        }
        return null;
    }

    public final boolean LJIJI(int i) {
        if (this.LJLJJL == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i < 0) {
            if (scrollY <= ((int) (clientHeight * this.LJLLLLLL))) {
                return false;
            }
        } else if (i <= 0 || scrollY >= ((int) (clientHeight * this.LJLZ))) {
            return false;
        }
        return true;
    }

    public final void LJIJJLI(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LLIIIILZ) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LLIFFJFJJ = motionEvent.getY(i);
            this.LLIIIILZ = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.LLIIIJ;
            if (velocityTracker != null) {
                o.LJI(velocityTracker);
                velocityTracker.clear();
            }
        }
    }

    public final boolean LJIL(int i) {
        if (this.LJLILLLLZI.size() == 0) {
            this.LLILII = false;
            LJIJJ(0, 0.0f, 0);
            if (this.LLILII) {
                return false;
            }
            "onPageScrolled did not call superclass implementation".toString();
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C91144Zps LJIIZILJ = LJIIZILJ();
        int clientHeight = getClientHeight();
        int i2 = this.LJLLILLLL;
        int i3 = clientHeight + i2;
        float f = i2;
        float f2 = clientHeight;
        o.LJI(LJIIZILJ);
        int i4 = LJIIZILJ.LIZIZ;
        float f3 = ((i / f2) - LJIIZILJ.LJ) / (LJIIZILJ.LIZLLL + (f / f2));
        this.LLILII = false;
        LJIJJ(i4, f3, (int) (i3 * f3));
        if (this.LLILII) {
            return true;
        }
        "onPageScrolled did not call superclass implementation".toString();
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean LJJ(float f) {
        boolean z;
        boolean z2;
        float f2 = this.LLIFFJFJJ - f;
        this.LLIFFJFJJ = f;
        float scrollY = getScrollY() + f2;
        float clientHeight = getClientHeight();
        float f3 = this.LJLLLLLL * clientHeight;
        float f4 = this.LJLZ * clientHeight;
        boolean z3 = false;
        Object obj = ListProtector.get(this.LJLILLLLZI, 0);
        o.LJIIIIZZ(obj, "mItems[0]");
        C91144Zps c91144Zps = (C91144Zps) obj;
        ArrayList<C91144Zps> arrayList = this.LJLILLLLZI;
        Object obj2 = ListProtector.get(arrayList, arrayList.size() - 1);
        o.LJIIIIZZ(obj2, "mItems[mItems.size - 1]");
        C91144Zps c91144Zps2 = (C91144Zps) obj2;
        if (c91144Zps.LIZIZ != 0) {
            f3 = c91144Zps.LJ * clientHeight;
            z = false;
        } else {
            z = true;
        }
        int i = c91144Zps2.LIZIZ;
        PagerAdapter pagerAdapter = this.LJLJJL;
        o.LJI(pagerAdapter);
        if (i != pagerAdapter.getCount() - 1) {
            f4 = c91144Zps2.LJ * clientHeight;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollY < f3) {
            if (z) {
                C07Q c07q = this.LLIILZL;
                o.LJI(c07q);
                c07q.LJ(Math.abs(f3 - scrollY) / clientHeight);
                z3 = true;
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z2) {
                C07Q c07q2 = this.LLIIZ;
                o.LJI(c07q2);
                c07q2.LJ(Math.abs(scrollY - f4) / clientHeight);
                z3 = true;
            }
            scrollY = f4;
        }
        int i2 = (int) scrollY;
        this.LLI += scrollY - i2;
        scrollTo(getScrollX(), i2);
        LJIL(i2);
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r1 == r0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(int r18) {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91362ZtO.LJJI(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> views) {
        C91144Zps LJIILLIIL;
        o.LJIIIZ(views, "views");
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (LJIILLIIL = LJIILLIIL(childAt)) != null && LJIILLIIL.LIZIZ == this.LJLJJLL) {
                childAt.addTouchables(views);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        o.LJIIIZ(p, "p");
        if ((p instanceof C91145Zpt) && super.checkLayoutParams(p)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent event) {
        boolean LJIIIZ;
        o.LJIIIZ(event, "event");
        if (super.dispatchKeyEvent(event)) {
            return true;
        }
        if (event.getAction() == 0) {
            int keyCode = event.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (event.hasNoModifiers()) {
                            LJIIIZ = LJIIIZ(2);
                        } else if (event.hasModifiers(1)) {
                            LJIIIZ = LJIIIZ(1);
                        }
                    }
                } else {
                    LJIIIZ = LJIIIZ(66);
                }
            } else {
                LJIIIZ = LJIIIZ(17);
            }
            if (LJIIIZ) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        C91144Zps LJIILLIIL;
        o.LJIIIZ(event, "event");
        if (event.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(event);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (LJIILLIIL = LJIILLIIL(childAt)) != null && LJIILLIIL.LIZIZ == this.LJLJJLL && childAt.dispatchPopulateAccessibilityEvent(event)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r0.getCount() > 1) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            super.draw(r9)
            int r0 = r8.getOverScrollMode()
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L1f
            if (r0 != r6) goto Lb3
            androidx.viewpager.widget.PagerAdapter r0 = r8.LJLJJL
            if (r0 == 0) goto Lb3
            kotlin.jvm.internal.o.LJI(r0)
            int r0 = r0.getCount()
            if (r0 <= r6) goto Lb3
        L1f:
            X.07Q r0 = r8.LLIILZL
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.LIZLLL()
            if (r0 != 0) goto L61
            int r5 = r9.save()
            int r4 = r8.getHeight()
            int r3 = r8.getWidth()
            int r0 = r8.getPaddingLeft()
            int r3 = r3 - r0
            int r0 = r8.getPaddingRight()
            int r3 = r3 - r0
            int r0 = r8.getPaddingLeft()
            float r2 = (float) r0
            float r1 = r8.LJLLLLLL
            float r0 = (float) r4
            float r1 = r1 * r0
            r9.translate(r2, r1)
            X.07Q r0 = r8.LLIILZL
            kotlin.jvm.internal.o.LJI(r0)
            r0.LJII(r3, r4)
            X.07Q r0 = r8.LLIILZL
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.LIZ(r9)
            r7 = r7 | r0
            r9.restoreToCount(r5)
        L61:
            X.07Q r0 = r8.LLIIZ
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.LIZLLL()
            if (r0 != 0) goto Lad
            int r3 = r9.save()
            int r5 = r8.getHeight()
            int r4 = r8.getWidth()
            int r0 = r8.getPaddingLeft()
            int r4 = r4 - r0
            int r0 = r8.getPaddingRight()
            int r4 = r4 - r0
            r0 = 1127481344(0x43340000, float:180.0)
            r9.rotate(r0)
            int r1 = -r4
            int r0 = r8.getPaddingLeft()
            int r1 = r1 - r0
            float r2 = (float) r1
            float r1 = r8.LJLZ
            float r0 = (float) r6
            float r1 = r1 + r0
            float r1 = -r1
            float r0 = (float) r5
            float r1 = r1 * r0
            r9.translate(r2, r1)
            X.07Q r0 = r8.LLIIZ
            kotlin.jvm.internal.o.LJI(r0)
            r0.LJII(r4, r5)
            X.07Q r0 = r8.LLIIZ
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.LIZ(r9)
            r7 = r7 | r0
            r9.restoreToCount(r3)
        Lad:
            if (r7 == 0) goto Lb2
            X.C16300kU.LJIIJ(r8)
        Lb2:
            return
        Lb3:
            X.07Q r0 = r8.LLIILZL
            kotlin.jvm.internal.o.LJI(r0)
            r0.LIZIZ()
            X.07Q r0 = r8.LLIIZ
            kotlin.jvm.internal.o.LJI(r0)
            r0.LIZIZ()
            goto Lb2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91362ZtO.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        o.LJIIIZ(attrs, "attrs");
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        return new C91145Zpt(context, attrs);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if (this.LJLLILLLL > 0 && this.LJLLJ != null && this.LJLILLLLZI.size() > 0 && this.LJLJJL != null) {
            int scrollY = getScrollY();
            float height = getHeight();
            float f2 = this.LJLLILLLL / height;
            int i2 = 0;
            Object obj = ListProtector.get(this.LJLILLLLZI, 0);
            o.LJIIIIZZ(obj, "mItems[0]");
            C91144Zps c91144Zps = (C91144Zps) obj;
            float f3 = c91144Zps.LJ;
            int size = this.LJLILLLLZI.size();
            int i3 = ((C91144Zps) ListProtector.get(this.LJLILLLLZI, size - 1)).LIZIZ;
            for (int i4 = c91144Zps.LIZIZ; i4 < i3; i4++) {
                while (true) {
                    i = c91144Zps.LIZIZ;
                    if (i4 <= i || i2 >= size) {
                        break;
                    }
                    i2++;
                    Object obj2 = ListProtector.get(this.LJLILLLLZI, i2);
                    o.LJIIIIZZ(obj2, "mItems[++itemIndex]");
                    c91144Zps = (C91144Zps) obj2;
                }
                if (i4 == i) {
                    float f4 = c91144Zps.LJ;
                    float f5 = c91144Zps.LIZLLL;
                    f = (f4 + f5) * height;
                    f3 = f4 + f5 + f2;
                } else {
                    PagerAdapter pagerAdapter = this.LJLJJL;
                    o.LJI(pagerAdapter);
                    float LJIILJJIL = pagerAdapter.LJIILJJIL(i4);
                    f = (f3 + LJIILJJIL) * height;
                    f3 += LJIILJJIL + f2;
                }
                if (this.LJLLILLLL + f > scrollY) {
                    Drawable drawable = this.LJLLJ;
                    o.LJI(drawable);
                    drawable.setBounds(this.LJLLL, (int) f, this.LJLLLL, (int) (this.LJLLILLLL + f + 0.5f));
                    Drawable drawable2 = this.LJLLJ;
                    o.LJI(drawable2);
                    drawable2.draw(canvas);
                }
                if (f > scrollY + r10) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        float f;
        o.LJIIIZ(ev, "ev");
        int action = ev.getAction() & 255;
        if (action != 1 && action != 3) {
            if (action != 0) {
                if (this.LLF) {
                    return true;
                }
                if (this.LLFF) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        LJIJJLI(ev);
                    }
                } else {
                    int i = this.LLIIIILZ;
                    if (i != -1) {
                        int findPointerIndex = ev.findPointerIndex(i);
                        float y = ev.getY(findPointerIndex);
                        float f2 = y - this.LLIFFJFJJ;
                        float abs = Math.abs(f2);
                        float x = ev.getX(findPointerIndex);
                        float abs2 = Math.abs(x - this.LLII);
                        if (f2 != 0.0f) {
                            float f3 = this.LLIFFJFJJ;
                            if ((f3 >= this.LLFII || f2 <= 0.0f) && ((f3 <= getHeight() - this.LLFII || f2 >= 0.0f) && LJIIJ(this, false, (int) f2, (int) x, (int) y))) {
                                this.LLI = x;
                                this.LLIFFJFJJ = y;
                                this.LLFF = true;
                                return false;
                            }
                        }
                        float f4 = this.LLFZ;
                        if (abs > f4 && abs * 0.5f > abs2) {
                            this.LLF = true;
                            setScrollState(1);
                            if (f2 > 0.0f) {
                                f = this.LLIIII + this.LLFZ;
                            } else {
                                f = this.LLIIII - this.LLFZ;
                            }
                            this.LLIFFJFJJ = f;
                            this.LLI = x;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f4) {
                            this.LLFF = true;
                        }
                        if (this.LLF && LJJ(y)) {
                            C16300kU.LJIIJ(this);
                        }
                    }
                }
            } else {
                this.LLII = ev.getX();
                float y2 = ev.getY();
                this.LLIIII = y2;
                this.LLI = this.LLII;
                this.LLIFFJFJJ = y2;
                this.LLIIIILZ = ev.getPointerId(0);
                this.LLFF = false;
                C91245ZrV c91245ZrV = this.LJLL;
                o.LJI(c91245ZrV);
                c91245ZrV.computeScrollOffset();
                if (this.LLILLL == 2) {
                    C91245ZrV c91245ZrV2 = this.LJLL;
                    o.LJI(c91245ZrV2);
                    int finalY = c91245ZrV2.getFinalY();
                    C91245ZrV c91245ZrV3 = this.LJLL;
                    o.LJI(c91245ZrV3);
                    if (Math.abs(finalY - c91245ZrV3.getCurrY()) > this.LLIIJLIL) {
                        C91245ZrV c91245ZrV4 = this.LJLL;
                        o.LJI(c91245ZrV4);
                        c91245ZrV4.abortAnimation();
                        this.LL = false;
                        LJJI(this.LJLJJLL);
                        this.LLF = true;
                        setScrollState(1);
                    }
                }
                LJIIJJI(false);
                this.LLF = false;
            }
            if (this.LLIIIJ == null) {
                this.LLIIIJ = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker = this.LLIIIJ;
            o.LJI(velocityTracker);
            velocityTracker.addMovement(ev);
            return this.LLF;
        }
        this.LLF = false;
        this.LLFF = false;
        this.LLIIIILZ = -1;
        VelocityTracker velocityTracker2 = this.LLIIIJ;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.LLIIIJ = null;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        o.LJIIIZ(state, "state");
        if (!(state instanceof MDVerticalViewPager$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        MDVerticalViewPager$SavedState mDVerticalViewPager$SavedState = (MDVerticalViewPager$SavedState) state;
        super.onRestoreInstanceState(mDVerticalViewPager$SavedState.getSuperState());
        PagerAdapter pagerAdapter = this.LJLJJL;
        if (pagerAdapter != null) {
            o.LJI(pagerAdapter);
            pagerAdapter.LJIJI(mDVerticalViewPager$SavedState.adapterState, mDVerticalViewPager$SavedState.loader);
            LJJIIJ(mDVerticalViewPager$SavedState.position, false, true, 0);
        } else {
            this.LJLJL = mDVerticalViewPager$SavedState.position;
            this.LJLJLJ = mDVerticalViewPager$SavedState.adapterState;
            this.LJLJLLL = mDVerticalViewPager$SavedState.loader;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        PagerAdapter pagerAdapter;
        boolean LJI;
        boolean LJI2;
        boolean z;
        float f;
        o.LJIIIZ(ev, "ev");
        if (this.LLIIL) {
            return true;
        }
        if ((ev.getAction() == 0 && ev.getEdgeFlags() != 0) || (pagerAdapter = this.LJLJJL) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.LLIIIJ == null) {
            this.LLIIIJ = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.LLIIIJ;
        o.LJI(velocityTracker);
        velocityTracker.addMovement(ev);
        int action = ev.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                LJIJJLI(ev);
                                this.LLIFFJFJJ = ev.getY(ev.findPointerIndex(this.LLIIIILZ));
                            }
                        } else {
                            int actionIndex = ev.getActionIndex();
                            this.LLIFFJFJJ = ev.getY(actionIndex);
                            this.LLIIIILZ = ev.getPointerId(actionIndex);
                        }
                    } else if (this.LLF) {
                        LJJIII(this.LJLJJLL, true, 0, false);
                        this.LLIIIILZ = -1;
                        LJIILJJIL();
                        C07Q c07q = this.LLIILZL;
                        o.LJI(c07q);
                        LJI = c07q.LJI();
                        C07Q c07q2 = this.LLIIZ;
                        o.LJI(c07q2);
                        LJI2 = c07q2.LJI();
                        z = LJI | LJI2;
                    }
                } else {
                    if (!this.LLF) {
                        int findPointerIndex = ev.findPointerIndex(this.LLIIIILZ);
                        float y = ev.getY(findPointerIndex);
                        float abs = Math.abs(y - this.LLIFFJFJJ);
                        float x = ev.getX(findPointerIndex);
                        float abs2 = Math.abs(x - this.LLI);
                        float f2 = this.LLFZ;
                        if (abs > f2 && abs > abs2) {
                            this.LLF = true;
                            float f3 = this.LLIIII;
                            if (y - f3 > 0.0f) {
                                f = f3 + f2;
                            } else {
                                f = f3 - f2;
                            }
                            this.LLIFFJFJJ = f;
                            this.LLI = x;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                        }
                    }
                    if (this.LLF) {
                        z = false | LJJ(ev.getY(ev.findPointerIndex(this.LLIIIILZ)));
                    }
                }
            } else if (this.LLF) {
                VelocityTracker velocityTracker2 = this.LLIIIJ;
                o.LJI(velocityTracker2);
                velocityTracker2.computeCurrentVelocity(1000, this.LLIIIZ);
                int yVelocity = (int) velocityTracker2.getYVelocity(this.LLIIIILZ);
                this.LL = true;
                int clientHeight = getClientHeight();
                int scrollY = getScrollY();
                C91144Zps LJIIZILJ = LJIIZILJ();
                o.LJI(LJIIZILJ);
                LJJIIJ(LJIILIIL(LJIIZILJ.LIZIZ, ((scrollY / clientHeight) - LJIIZILJ.LJ) / LJIIZILJ.LIZLLL, yVelocity, (int) (ev.getY(ev.findPointerIndex(this.LLIIIILZ)) - this.LLIIII)), true, true, yVelocity);
                this.LLIIIILZ = -1;
                LJIILJJIL();
                C07Q c07q3 = this.LLIILZL;
                o.LJI(c07q3);
                LJI = c07q3.LJI();
                C07Q c07q4 = this.LLIIZ;
                o.LJI(c07q4);
                LJI2 = c07q4.LJI();
                z = LJI | LJI2;
            }
            if (z) {
                C16300kU.LJIIJ(this);
            }
        } else {
            C91245ZrV c91245ZrV = this.LJLL;
            o.LJI(c91245ZrV);
            c91245ZrV.abortAnimation();
            this.LL = false;
            LJJI(this.LJLJJLL);
            this.LLII = ev.getX();
            float y2 = ev.getY();
            this.LLIIII = y2;
            this.LLI = this.LLII;
            this.LLIFFJFJJ = y2;
            this.LLIIIILZ = ev.getPointerId(0);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        o.LJIIIZ(view, "view");
        if (this.LJZI) {
            if (C78996UzQ.LJJIIJZLJL(view)) {
                C78996UzQ.LJI();
            }
            removeViewInLayout(view);
            return;
        }
        super.removeView(view);
    }

    public final void setAdapter(PagerAdapter adapter) {
        o.LJIIIZ(adapter, "adapter");
        PagerAdapter pagerAdapter = this.LJLJJL;
        if (pagerAdapter != null) {
            C91147Zpv c91147Zpv = this.LJLLI;
            o.LJI(c91147Zpv);
            pagerAdapter.LJJII(c91147Zpv);
            PagerAdapter pagerAdapter2 = this.LJLJJL;
            o.LJI(pagerAdapter2);
            pagerAdapter2.LJJIFFI(this);
            int size = this.LJLILLLLZI.size();
            for (int i = 0; i < size; i++) {
                Object obj = ListProtector.get(this.LJLILLLLZI, i);
                o.LJIIIIZZ(obj, "mItems[i]");
                C91144Zps c91144Zps = (C91144Zps) obj;
                PagerAdapter pagerAdapter3 = this.LJLJJL;
                o.LJI(pagerAdapter3);
                int i2 = c91144Zps.LIZIZ;
                Object obj2 = c91144Zps.LIZ;
                o.LJI(obj2);
                pagerAdapter3.LJIIIZ(i2, this, obj2);
            }
            PagerAdapter pagerAdapter4 = this.LJLJJL;
            o.LJI(pagerAdapter4);
            pagerAdapter4.LJIIJJI(this);
            this.LJLILLLLZI.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i3).getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager.LayoutParams");
                if (!((C91145Zpt) layoutParams).LIZ) {
                    try {
                        if (C78996UzQ.LJJIIJZLJL(getChildAt(i3))) {
                            C78996UzQ.LJI();
                        }
                    } catch (Throwable unused) {
                    }
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.LJLJJLL = 0;
            scrollTo(0, 0);
        }
        this.LJLJJL = adapter;
        this.LJLIL = 0;
        if (this.LJLLI == null) {
            this.LJLLI = new C91147Zpv(this);
        }
        PagerAdapter pagerAdapter5 = this.LJLJJL;
        o.LJI(pagerAdapter5);
        C91147Zpv c91147Zpv2 = this.LJLLI;
        o.LJI(c91147Zpv2);
        pagerAdapter5.LJIJ(c91147Zpv2);
        this.LL = false;
        boolean z = this.LLIL;
        this.LLIL = true;
        PagerAdapter pagerAdapter6 = this.LJLJJL;
        o.LJI(pagerAdapter6);
        this.LJLIL = pagerAdapter6.getCount();
        if (this.LJLJL >= 0) {
            PagerAdapter pagerAdapter7 = this.LJLJJL;
            o.LJI(pagerAdapter7);
            pagerAdapter7.LJIJI(this.LJLJLJ, this.LJLJLLL);
            LJJIIJ(this.LJLJL, false, true, 0);
            this.LJLJL = -1;
            this.LJLJLJ = null;
            this.LJLJLLL = null;
            return;
        }
        if (!z) {
            LJJI(this.LJLJJLL);
        } else {
            requestLayout();
        }
    }

    public final void setAutoScroll(Boolean bool) {
        C91245ZrV c91245ZrV = this.LJLL;
        o.LJI(c91245ZrV);
        o.LJI(bool);
        boolean booleanValue = bool.booleanValue();
        c91245ZrV.LIZJ = booleanValue;
        c91245ZrV.LIZ.LIZJ = booleanValue;
    }

    public final void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (this.LLILLIZIL == null) {
            try {
                Class TYPE = Boolean.TYPE;
                o.LJIIIIZZ(TYPE, "TYPE");
                this.LLILLIZIL = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", TYPE);
            } catch (NoSuchMethodException unused) {
            }
        }
        try {
            Method method = this.LLILLIZIL;
            o.LJI(method);
            method.invoke(this, Boolean.valueOf(z));
        } catch (Exception unused2) {
        }
    }

    public final void setCurrentItem(int i) {
        this.LL = false;
        LJJIIJ(i, !this.LLIL, false, 0);
    }

    public final void setMFakeDragging(boolean z) {
        this.LLIIL = z;
    }

    public final void setOffscreenPageLimit(int i) {
        if (i < 2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Requested offscreen page limit ");
            LIZ.append(i);
            LIZ.append(" too small; defaulting to 2");
            X1D.LIZIZ(LIZ);
            i = 2;
        }
        if (i != this.LLD) {
            this.LLD = i;
            LJJI(this.LJLJJLL);
        }
    }

    public final void setPageMargin(int i) {
        int i2 = this.LJLLILLLL;
        this.LJLLILLLL = i;
        int height = getHeight();
        LJJII(height, height, i, i2);
        requestLayout();
    }

    public final void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.LJLLJ = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public final void setScrollState(int i) {
        if (this.LLILLL == i) {
            return;
        }
        this.LLILLL = i;
        List<C0C3> list = this.LLILL;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) this.LLILL).iterator();
            while (it.hasNext()) {
                ((C0C3) it.next()).onPageScrollStateChanged(i);
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable who) {
        o.LJIIIZ(who, "who");
        if (super.verifyDrawable(who) || who == this.LJLLJ) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        o.LJIIIZ(p, "p");
        return new C91145Zpt(p);
    }

    public final void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    public final C91144Zps LJIIIIZZ(int i, int i2) {
        C91144Zps c91144Zps = new C91144Zps();
        c91144Zps.LIZIZ = i;
        PagerAdapter pagerAdapter = this.LJLJJL;
        o.LJI(pagerAdapter);
        c91144Zps.LIZ = pagerAdapter.LJIILLIIL(i, this);
        PagerAdapter pagerAdapter2 = this.LJLJJL;
        o.LJI(pagerAdapter2);
        c91144Zps.LIZLLL = pagerAdapter2.LJIILJJIL(i);
        if (i2 < 0 || i2 >= this.LJLILLLLZI.size()) {
            this.LJLILLLLZI.add(c91144Zps);
        } else {
            ListProtector.add(this.LJLILLLLZI, i2, c91144Zps);
        }
        return c91144Zps;
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
            rect.left += view2.getLeft();
            rect.right += view2.getRight();
            rect.top += view2.getTop();
            rect.bottom += view2.getBottom();
            parent = view2.getParent();
        }
        return rect;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        o.LJI(null);
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        int measuredHeight = getMeasuredHeight();
        this.LLFII = Math.min(measuredHeight / 10, this.LLFFF);
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
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager.LayoutParams");
                C91145Zpt c91145Zpt = (C91145Zpt) layoutParams;
                if (c91145Zpt.LIZ) {
                    int i6 = c91145Zpt.LIZIZ;
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
                    int i10 = ((ViewGroup.LayoutParams) c91145Zpt).width;
                    if (i10 != -2) {
                        if (i10 == -1) {
                            i10 = measuredWidth;
                        }
                        i3 = 1073741824;
                    } else {
                        i10 = measuredWidth;
                    }
                    int i11 = ((ViewGroup.LayoutParams) c91145Zpt).height;
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
            }
            i4++;
        }
        this.LJZ = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
        this.LJZI = true;
        LJJI(this.LJLJJLL);
        this.LJZI = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager.LayoutParams");
                C91145Zpt c91145Zpt2 = (C91145Zpt) layoutParams2;
                if (!c91145Zpt2.LIZ) {
                    childAt2.measure(this.LJZ, View.MeasureSpec.makeMeasureSpec((int) (paddingTop * c91145Zpt2.LIZJ), 1073741824));
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C91144Zps LJIILLIIL;
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
            if (childAt.getVisibility() == 0 && (LJIILLIIL = LJIILLIIL(childAt)) != null && LJIILLIIL.LIZIZ == this.LJLJJLL && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIJJ(int r10, float r11, int r12) {
        /*
            r9 = this;
            int r0 = r9.LLILIL
            if (r0 <= 0) goto L70
            int r8 = r9.getScrollY()
            int r5 = r9.getPaddingTop()
            int r7 = r9.getPaddingBottom()
            int r6 = r9.getHeight()
            int r4 = r9.getChildCount()
            r3 = 0
        L19:
            if (r3 >= r4) goto L70
            android.view.View r2 = r9.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager.LayoutParams"
            kotlin.jvm.internal.o.LJII(r1, r0)
            X.Zpt r1 = (X.C91145Zpt) r1
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L4b
            int r0 = r1.LIZIZ
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r1 == r0) goto L54
            r0 = 48
            if (r1 == r0) goto L4e
            r0 = 80
            if (r1 == r0) goto L61
            r0 = r5
        L3f:
            int r5 = r5 + r8
            int r1 = r2.getTop()
            int r5 = r5 - r1
            if (r5 == 0) goto L4a
            r2.offsetTopAndBottom(r5)
        L4a:
            r5 = r0
        L4b:
            int r3 = r3 + 1
            goto L19
        L4e:
            int r0 = r2.getHeight()
            int r0 = r0 + r5
            goto L3f
        L54:
            int r0 = r2.getMeasuredHeight()
            int r0 = r6 - r0
            int r0 = r0 / 2
            int r1 = java.lang.Math.max(r0, r5)
            goto L6d
        L61:
            int r1 = r6 - r7
            int r0 = r2.getMeasuredHeight()
            int r1 = r1 - r0
            int r0 = r2.getMeasuredHeight()
            int r7 = r7 + r0
        L6d:
            r0 = r5
            r5 = r1
            goto L3f
        L70:
            java.util.List<X.0C3> r0 = r9.LLILL
            if (r0 == 0) goto L94
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L94
            java.util.List<X.0C3> r0 = r9.LLILL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L84:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r1.next()
            X.0C3 r0 = (X.C0C3) r0
            r0.onPageScrolled(r10, r11, r12)
            goto L84
        L94:
            r0 = 1
            r9.LLILII = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91362ZtO.LJIJJ(int, float, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> views, int i, int i2) {
        C91144Zps LJIILLIIL;
        o.LJIIIZ(views, "views");
        int size = views.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (LJIILLIIL = LJIILLIIL(childAt)) != null && LJIILLIIL.LIZIZ == this.LJLJJLL) {
                    childAt.addFocusables(views, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != views.size()) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        views.add(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i, ViewGroup.LayoutParams params) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(params, "params");
        if (!checkLayoutParams(params)) {
            params = generateLayoutParams(params);
        }
        C91145Zpt c91145Zpt = (C91145Zpt) params;
        boolean z = c91145Zpt.LIZ;
        c91145Zpt.LIZ = z;
        if (this.LJZI) {
            if (!z) {
                c91145Zpt.LIZLLL = true;
                addViewInLayout(child, i, params);
                return;
            } else {
                "Cannot add pager decor view during layout".toString();
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
        }
        super.addView(child, i, params);
    }

    public final int LJIILIIL(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) > this.LLIIJI && Math.abs(i2) > this.LLIIIL) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            if (i >= this.LJLJJLL) {
                f2 = 0.51f;
            } else {
                f2 = 0.49f;
            }
            i = (int) (i + f + f2);
        }
        if (this.LJLILLLLZI.size() > 0) {
            Object obj = ListProtector.get(this.LJLILLLLZI, 0);
            o.LJIIIIZZ(obj, "mItems[0]");
            Object obj2 = ListProtector.get(this.LJLILLLLZI, r1.size() - 1);
            o.LJIIIIZZ(obj2, "mItems[mItems.size - 1]");
            return Math.max(((C91144Zps) obj).LIZIZ, Math.min(i, ((C91144Zps) obj2).LIZIZ));
        }
        return i;
    }

    public final void LJJII(int i, int i2, int i3, int i4) {
        float f;
        if (i2 > 0 && !this.LJLILLLLZI.isEmpty()) {
            int scrollY = (int) ((getScrollY() / (((i2 - getPaddingTop()) - getPaddingBottom()) + i4)) * (((i - getPaddingTop()) - getPaddingBottom()) + i3));
            scrollTo(getScrollX(), scrollY);
            C91245ZrV c91245ZrV = this.LJLL;
            o.LJI(c91245ZrV);
            if (!c91245ZrV.isFinished()) {
                C91245ZrV c91245ZrV2 = this.LJLL;
                o.LJI(c91245ZrV2);
                int duration = c91245ZrV2.getDuration();
                C91245ZrV c91245ZrV3 = this.LJLL;
                o.LJI(c91245ZrV3);
                int timePassed = duration - c91245ZrV3.timePassed();
                C91144Zps LJIJ = LJIJ(this.LJLJJLL);
                C91245ZrV c91245ZrV4 = this.LJLL;
                o.LJI(c91245ZrV4);
                o.LJI(LJIJ);
                c91245ZrV4.startScroll(0, scrollY, 0, (int) (LJIJ.LJ * i), timePassed);
                return;
            }
            return;
        }
        C91144Zps LJIJ2 = LJIJ(this.LJLJJLL);
        if (LJIJ2 != null) {
            f = Math.min(LJIJ2.LJ, this.LJLZ);
        } else {
            f = 0.0f;
        }
        int paddingTop = (int) (f * ((i - getPaddingTop()) - getPaddingBottom()));
        if (paddingTop == getScrollY()) {
            return;
        }
        LJIIJJI(false);
        scrollTo(getScrollX(), paddingTop);
    }

    public final void LJJIII(int i, boolean z, int i2, boolean z2) {
        int i3;
        List<C0C3> list;
        int abs;
        List<C0C3> list2;
        C91144Zps LJIJ = LJIJ(i);
        if (LJIJ != null) {
            i3 = (int) (getClientHeight() * Math.max(this.LJLLLLLL, Math.min(LJIJ.LJ, this.LJLZ)));
        } else {
            i3 = 0;
        }
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int i4 = -scrollX;
                int i5 = i3 - scrollY;
                if (i4 == 0 && i5 == 0) {
                    LJIIJJI(false);
                    LJJI(this.LJLJJLL);
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientHeight = getClientHeight();
                    int i6 = clientHeight / 2;
                    float f = clientHeight;
                    float f2 = i6;
                    float sin = f2 + (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.4712389f)) * f2);
                    int abs2 = Math.abs(i2);
                    if (abs2 > 0) {
                        abs = Math.round(1000 * Math.abs(sin / abs2)) * 4;
                    } else {
                        PagerAdapter pagerAdapter = this.LJLJJL;
                        o.LJI(pagerAdapter);
                        abs = (int) (((Math.abs(i4) / ((f * pagerAdapter.LJIILJJIL(this.LJLJJLL)) + this.LJLLILLLL)) + 1) * 100);
                    }
                    int min = Math.min(abs, 600);
                    C91245ZrV c91245ZrV = this.LJLL;
                    o.LJI(c91245ZrV);
                    c91245ZrV.startScroll(scrollX, scrollY, i4, i5, min);
                    C16300kU.LJIIJ(this);
                }
            }
            if (z2 && (list2 = this.LLILL) != null && !((ArrayList) list2).isEmpty()) {
                Iterator it = ((ArrayList) this.LLILL).iterator();
                while (it.hasNext()) {
                    ((C0C3) it.next()).onPageSelected(i);
                }
                return;
            }
            return;
        }
        if (z2 && (list = this.LLILL) != null && !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) this.LLILL).iterator();
            while (it2.hasNext()) {
                ((C0C3) it2.next()).onPageSelected(i);
            }
        }
        LJIIJJI(false);
        C91245ZrV c91245ZrV2 = this.LJLL;
        o.LJI(c91245ZrV2);
        c91245ZrV2.abortAnimation();
        scrollTo(0, i3);
        LJIL(i3);
    }

    public final void LJJIIJ(int i, boolean z, boolean z2, int i2) {
        List<C0C3> list;
        PagerAdapter pagerAdapter = this.LJLJJL;
        boolean z3 = false;
        if (pagerAdapter != null) {
            o.LJI(pagerAdapter);
            if (pagerAdapter.getCount() > 0) {
                if (!z2 && this.LJLJJLL == i && this.LJLILLLLZI.size() != 0) {
                    setScrollingCacheEnabled(false);
                    return;
                }
                if (i < 0) {
                    i = 0;
                } else {
                    PagerAdapter pagerAdapter2 = this.LJLJJL;
                    o.LJI(pagerAdapter2);
                    if (i >= pagerAdapter2.getCount()) {
                        PagerAdapter pagerAdapter3 = this.LJLJJL;
                        o.LJI(pagerAdapter3);
                        i = pagerAdapter3.getCount() - 1;
                    }
                }
                int i3 = this.LLD;
                int i4 = this.LJLJJLL;
                if (i > i4 + i3 || i < i4 - i3) {
                    int size = this.LJLILLLLZI.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        ((C91144Zps) ListProtector.get(this.LJLILLLLZI, i5)).LIZJ = true;
                    }
                }
                if (this.LJLJJLL != i) {
                    z3 = true;
                }
                if (this.LLIL) {
                    this.LJLJJLL = i;
                    if (z3 && (list = this.LLILL) != null && !((ArrayList) list).isEmpty()) {
                        Iterator it = ((ArrayList) this.LLILL).iterator();
                        while (it.hasNext()) {
                            ((C0C3) it.next()).onPageSelected(i);
                        }
                    }
                    requestLayout();
                    return;
                }
                LJJI(i);
                LJJIII(i, z, i2, z3);
                return;
            }
        }
        setScrollingCacheEnabled(false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            int i5 = this.LJLLILLLL;
            LJJII(i2, i4, i5, i5);
        }
    }

    public final boolean LJIIJ(View v, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        o.LJIIIZ(v, "v");
        if (v instanceof ViewGroup) {
            int scrollX = v.getScrollX();
            int scrollY = v.getScrollY();
            ViewGroup viewGroup = (ViewGroup) v;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View child = viewGroup.getChildAt(childCount);
                o.LJIIIIZZ(child, "child");
                if ((child.getVisibility() == 0 || child.getVisibility() == 4) && (i4 = i3 + scrollY) >= child.getTop() && i4 < child.getBottom() && (i5 = i2 + scrollX) >= child.getLeft() && i5 < child.getRight() && LJIIJ(child, true, i, i5 - child.getLeft(), i4 - child.getTop())) {
                    return true;
                }
            }
        }
        if (!z || !v.canScrollVertically(-i)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91362ZtO.onLayout(boolean, int, int, int, int):void");
    }
}
