package X;

import Y.ARunnableS12S0101000_8;
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
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager$SavedState;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import o3.h0;

/* renamed from: X.VnK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80794VnK extends AbstractC55113Lk5 {
    public static final int[] LLIZ = {R.attr.layout_gravity};
    public static final Field LLIZLLLIL;
    public boolean LJLIL;
    public int LJLILLLLZI;
    public final ArrayList<C80816Vng> LJLJI;
    public final C80816Vng LJLJJI;
    public final Rect LJLJJL;
    public PagerAdapter LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public Parcelable LJLJLLL;
    public ClassLoader LJLL;
    public Scroller LJLLI;
    public boolean LJLLILLLL;
    public C80819Vnj LJLLJ;
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
    public final ARunnableS12S0101000_8 LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;

    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            LLIZLLLIL = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
        } catch (NoSuchFieldException unused) {
        }
    }

    public final boolean LJJIII() {
        this.LLIIIL = -1;
        this.LLFFF = false;
        this.LLFII = false;
        VelocityTracker velocityTracker = this.LLIIIZ;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.LLIIIZ = null;
        }
        C07Q c07q = this.LLIL;
        o.LJI(c07q);
        boolean LJI = c07q.LJI();
        C07Q c07q2 = this.LLILII;
        o.LJI(c07q2);
        return LJI | c07q2.LJI();
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.LJLLILLLL = true;
        Scroller scroller = this.LJLLI;
        o.LJI(scroller);
        if (!scroller.isFinished()) {
            Scroller scroller2 = this.LJLLI;
            o.LJI(scroller2);
            if (scroller2.computeScrollOffset()) {
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                Scroller scroller3 = this.LJLLI;
                o.LJI(scroller3);
                int currX = scroller3.getCurrX();
                Scroller scroller4 = this.LJLLI;
                o.LJI(scroller4);
                int currY = scroller4.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (!LJIL(currY)) {
                        Scroller scroller5 = this.LJLLI;
                        o.LJI(scroller5);
                        scroller5.abortAnimation();
                        scrollTo(currX, 0);
                    }
                }
                C16300kU.LJIIJ(this);
                return;
            }
        }
        LJIIL(true);
    }

    public final void setOnAdapterChangeListener(IOM iom) {
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
            o.LJI(velocityTracker);
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        VelocityTracker velocityTracker2 = this.LLIIIZ;
        o.LJI(velocityTracker2);
        velocityTracker2.addMovement(obtain);
        obtain.recycle();
        this.LLIIZ = uptimeMillis;
        return true;
    }

    @Override // X.InterfaceC92113jT
    public final void LIZLLL() {
        if (this.LLIILZL) {
            if (this.LJLJJLL != null) {
                VelocityTracker velocityTracker = this.LLIIIZ;
                o.LJI(velocityTracker);
                velocityTracker.computeCurrentVelocity(1000, this.LLIIJLIL);
                int yVelocity = (int) velocityTracker.getYVelocity(this.LLIIIL);
                this.LLF = true;
                int clientHeight = getClientHeight();
                int scrollY = getScrollY();
                C80816Vng LJIIZILJ = LJIIZILJ();
                o.LJI(LJIIZILJ);
                LJJIIJZLJL(LJIILJJIL(LJIIZILJ.LIZIZ, ((scrollY / clientHeight) - LJIIZILJ.LJ) / LJIIZILJ.LIZLLL, yVelocity, (int) (this.LLIIII - this.LLIIIJ)), true, true, yVelocity);
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
        "No fake drag in progress. Call beginFakeDrag first.".toString();
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0076, code lost:
    
        if (r3 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80794VnK.LJIILIIL():void");
    }

    public final boolean LJIJJLI() {
        PagerAdapter pagerAdapter = this.LJLJJLL;
        if (pagerAdapter != null) {
            int i = this.LJLJL;
            Integer valueOf = Integer.valueOf(pagerAdapter.getCount());
            o.LJI(valueOf);
            if (i < valueOf.intValue() - 1) {
                int i2 = this.LJLJL + 1;
                this.LLF = false;
                LJJIIJZLJL(i2, true, false, 0);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C80804VnU();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.LLILZ);
        Scroller scroller = this.LJLLI;
        if (scroller != null && !scroller.isFinished()) {
            Scroller scroller2 = this.LJLLI;
            o.LJI(scroller2);
            scroller2.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    private final int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public final C80816Vng LJIIZILJ() {
        float f;
        float f2;
        int i;
        Float f3;
        int clientHeight = getClientHeight();
        float f4 = 0.0f;
        if (clientHeight > 0) {
            f = getScrollY() / clientHeight;
            f2 = this.LJLLL / clientHeight;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C80816Vng c80816Vng = null;
        float f5 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.LJLJI.size()) {
            Object obj = ListProtector.get(this.LJLJI, i3);
            o.LJIIIIZZ(obj, "mItems[i]");
            C80816Vng c80816Vng2 = (C80816Vng) obj;
            if (!z && c80816Vng2.LIZIZ != (i = i2 + 1)) {
                c80816Vng2 = this.LJLJJI;
                c80816Vng2.LJ = f4 + f5 + f2;
                c80816Vng2.LIZIZ = i;
                PagerAdapter pagerAdapter = this.LJLJJLL;
                if (pagerAdapter != null) {
                    f3 = Float.valueOf(pagerAdapter.LJIILJJIL(i));
                } else {
                    f3 = null;
                }
                o.LJI(f3);
                c80816Vng2.LIZLLL = f3.floatValue();
                i3--;
            }
            f4 = c80816Vng2.LJ;
            float f6 = c80816Vng2.LIZLLL + f4 + f2;
            if (z || f >= f4) {
                if (f < f6 || i3 == this.LJLJI.size() - 1) {
                    return c80816Vng2;
                }
                i2 = c80816Vng2.LIZIZ;
                f5 = c80816Vng2.LIZLLL;
                i3++;
                c80816Vng = c80816Vng2;
                z = false;
            } else {
                return c80816Vng;
            }
        }
        return c80816Vng;
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
        verticalViewPager$SavedState.position = this.LJLJL;
        PagerAdapter pagerAdapter = this.LJLJJLL;
        if (pagerAdapter != null) {
            verticalViewPager$SavedState.adapterState = pagerAdapter.LJIJJ();
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

    public final int getExpectedAdapterCount() {
        return this.LJLILLLLZI;
    }

    public final int getOffscreenPageLimit() {
        return this.LLFF;
    }

    public final int getPageMargin() {
        return this.LJLLL;
    }

    private final void setScrollingCacheEnabled(boolean z) {
        if (this.LLD != z) {
            this.LLD = z;
        }
    }

    @Override // X.InterfaceC92113jT
    public final void LJFF(float f) {
        Integer num;
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
                Object obj = ListProtector.get(this.LJLJI, 0);
                o.LJIIIIZZ(obj, "mItems[0]");
                C80816Vng c80816Vng = (C80816Vng) obj;
                Object obj2 = ListProtector.get(this.LJLJI, r1.size() - 1);
                o.LJIIIIZZ(obj2, "mItems[mItems.size - 1]");
                C80816Vng c80816Vng2 = (C80816Vng) obj2;
                if (c80816Vng.LIZIZ != 0) {
                    f2 = c80816Vng.LJ * clientHeight;
                }
                int i = c80816Vng2.LIZIZ;
                PagerAdapter pagerAdapter = this.LJLJJLL;
                if (pagerAdapter != null) {
                    num = Integer.valueOf(pagerAdapter.getCount());
                } else {
                    num = null;
                }
                o.LJI(num);
                if (i != num.intValue() - 1) {
                    f3 = c80816Vng2.LJ * clientHeight;
                }
                if (scrollY < f2) {
                    scrollY = f2;
                } else if (scrollY > f3) {
                    scrollY = f3;
                }
                int i2 = (int) scrollY;
                this.LLIIII = (scrollY - i2) + this.LLIIII;
                scrollTo(getScrollX(), i2);
                LJIL(i2);
                MotionEvent obtain = MotionEvent.obtain(this.LLIIZ, SystemClock.uptimeMillis(), 2, 0.0f, this.LLIIII, 0);
                if (this.LLIIIZ == null) {
                    this.LLIIIZ = VelocityTracker.obtain();
                }
                VelocityTracker velocityTracker = this.LLIIIZ;
                if (velocityTracker == null) {
                    return;
                }
                o.LJI(velocityTracker);
                velocityTracker.addMovement(obtain);
                obtain.recycle();
                return;
            } catch (Exception e) {
                C36922EeM.LJFF(e);
                return;
            }
        }
        "No fake drag in progress. Call beginFakeDrag first.".toString();
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // X.AbstractC55114Lk6
    public final void LJI(C0C3 c0c3) {
        List<C0C3> list = this.LLILLJJLI;
        o.LJI(list);
        ((ArrayList) list).add(c0c3);
    }

    @Override // X.AbstractC55114Lk6
    public final void LJII(C0C3 listener) {
        o.LJIIIZ(listener, "listener");
        List<C0C3> list = this.LLILLJJLI;
        if (list != null) {
            ((ArrayList) list).remove(listener);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
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
            if (r4 != r6) goto L85
        L8:
            r4 = 0
        L9:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r5 = r0.findNextFocus(r6, r4, r7)
            r1 = 130(0x82, float:1.82E-43)
            r0 = 33
            if (r5 == 0) goto L60
            if (r5 == r4) goto L60
            if (r7 == r0) goto L3c
            if (r7 == r1) goto L1e
        L1d:
            return r2
        L1e:
            android.graphics.Rect r0 = r6.LJLJJL
            android.graphics.Rect r0 = r6.LJIILL(r0, r5)
            int r1 = r0.bottom
            android.graphics.Rect r0 = r6.LJLJJL
            android.graphics.Rect r0 = r6.LJIILL(r0, r4)
            int r0 = r0.bottom
            if (r4 == 0) goto L37
            if (r1 > r0) goto L37
            boolean r2 = r6.LJIJJLI()
            goto L6f
        L37:
            boolean r2 = r5.requestFocus()
            goto L6f
        L3c:
            android.graphics.Rect r0 = r6.LJLJJL
            android.graphics.Rect r0 = r6.LJIILL(r0, r5)
            int r1 = r0.top
            android.graphics.Rect r0 = r6.LJLJJL
            android.graphics.Rect r0 = r6.LJIILL(r0, r4)
            int r0 = r0.top
            if (r4 == 0) goto L5b
            if (r1 < r0) goto L5b
            int r0 = r6.LJLJL
            if (r0 <= 0) goto L79
            int r0 = r0 - r3
            r6.LLF = r2
            r6.LJJIIJZLJL(r0, r3, r2, r2)
            goto L6e
        L5b:
            boolean r2 = r5.requestFocus()
            goto L6f
        L60:
            if (r7 == r0) goto L64
            if (r7 != r3) goto L7b
        L64:
            int r0 = r6.LJLJL
            if (r0 <= 0) goto L79
            int r0 = r0 - r3
            r6.LLF = r2
            r6.LJJIIJZLJL(r0, r3, r2, r2)
        L6e:
            r2 = r3
        L6f:
            if (r2 == 0) goto L1d
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r0)
            goto L1d
        L79:
            r3 = 0
            goto L6e
        L7b:
            if (r7 == r1) goto L80
            r0 = 2
            if (r7 != r0) goto L1d
        L80:
            boolean r2 = r6.LJIJJLI()
            goto L6f
        L85:
            if (r4 == 0) goto L9
            android.view.ViewParent r1 = r4.getParent()
        L8b:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L98
            if (r1 != r6) goto L93
            goto L9
        L93:
            android.view.ViewParent r1 = r1.getParent()
            goto L8b
        L98:
            java.lang.Class r0 = r4.getClass()
            X.C16880lQ.LJLLJ(r0)
            android.view.ViewParent r1 = r4.getParent()
        La3:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L8
            java.lang.Class r0 = r1.getClass()
            X.C16880lQ.LJLLJ(r0)
            android.view.ViewParent r1 = r1.getParent()
            goto La3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80794VnK.LJIIJ(int):boolean");
    }

    public final void LJIIL(boolean z) {
        boolean z2;
        if (this.LLILZIL == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            o.LJI(this.LJLLI);
            if (!r0.isFinished()) {
                Scroller scroller = this.LJLLI;
                o.LJI(scroller);
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                Scroller scroller2 = this.LJLLI;
                o.LJI(scroller2);
                int currX = scroller2.getCurrX();
                Scroller scroller3 = this.LJLLI;
                o.LJI(scroller3);
                int currY = scroller3.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        LJIL(currY);
                    }
                }
            }
        } else {
            z2 = false;
        }
        this.LLF = false;
        int size = this.LJLJI.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(this.LJLJI, i);
            o.LJIIIIZZ(obj, "mItems[i]");
            C80816Vng c80816Vng = (C80816Vng) obj;
            if (c80816Vng.LIZJ) {
                c80816Vng.LIZJ = false;
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

    public final C80816Vng LJIILLIIL(View view) {
        int size = this.LJLJI.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(this.LJLJI, i);
            o.LJIIIIZZ(obj, "mItems[i]");
            C80816Vng c80816Vng = (C80816Vng) obj;
            PagerAdapter pagerAdapter = this.LJLJJLL;
            if (pagerAdapter != null) {
                o.LJI(view);
                Object obj2 = c80816Vng.LIZ;
                o.LJI(obj2);
                if (pagerAdapter.LJIIZILJ(view, obj2)) {
                    return c80816Vng;
                }
            }
        }
        return null;
    }

    public final C80816Vng LJIJ(int i) {
        int size = this.LJLJI.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ListProtector.get(this.LJLJI, i2);
            o.LJIIIIZZ(obj, "mItems[i]");
            C80816Vng c80816Vng = (C80816Vng) obj;
            if (c80816Vng.LIZIZ == i) {
                return c80816Vng;
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
                o.LJI(velocityTracker);
                velocityTracker.clear();
            }
        }
    }

    public final boolean LJIL(int i) {
        if (this.LJLJI.size() == 0) {
            if (this.LLILIL) {
                return false;
            }
            this.LLILL = false;
            LJIJI(0, 0.0f, 0);
            if (this.LLILL) {
                return false;
            }
            "onPageScrolled did not call superclass implementation".toString();
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C80816Vng LJIIZILJ = LJIIZILJ();
        int clientHeight = getClientHeight();
        int i2 = this.LJLLL;
        int i3 = clientHeight + i2;
        float f = i2;
        float f2 = clientHeight;
        o.LJI(LJIIZILJ);
        int i4 = LJIIZILJ.LIZIZ;
        float f3 = ((i / f2) - LJIIZILJ.LJ) / (LJIIZILJ.LIZLLL + (f / f2));
        this.LLILL = false;
        LJIJI(i4, f3, (int) (i3 * f3));
        if (this.LLILL) {
            return true;
        }
        "onPageScrolled did not call superclass implementation".toString();
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean LJJ(float f) {
        boolean z;
        Integer num;
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
        Object obj = ListProtector.get(this.LJLJI, 0);
        o.LJIIIIZZ(obj, "mItems[0]");
        C80816Vng c80816Vng = (C80816Vng) obj;
        ArrayList<C80816Vng> arrayList = this.LJLJI;
        Object obj2 = ListProtector.get(arrayList, arrayList.size() - 1);
        o.LJIIIIZZ(obj2, "mItems[mItems.size - 1]");
        C80816Vng c80816Vng2 = (C80816Vng) obj2;
        if (c80816Vng.LIZIZ != 0) {
            f3 = c80816Vng.LJ * clientHeight;
            z = false;
        } else {
            z = true;
        }
        int i = c80816Vng2.LIZIZ;
        PagerAdapter pagerAdapter = this.LJLJJLL;
        if (pagerAdapter != null) {
            num = Integer.valueOf(pagerAdapter.getCount());
        } else {
            num = null;
        }
        o.LJI(num);
        if (i != num.intValue() - 1) {
            f4 = c80816Vng2.LJ * clientHeight;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollY < f3) {
            if (z) {
                C07Q c07q = this.LLIL;
                o.LJI(c07q);
                c07q.LJ(Math.abs(f3 - scrollY) / clientHeight);
                z3 = true;
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z2) {
                C07Q c07q2 = this.LLILII;
                o.LJI(c07q2);
                c07q2.LJ(Math.abs(scrollY - f4) / clientHeight);
                z3 = true;
            }
            scrollY = f4;
        }
        int i2 = (int) scrollY;
        this.LLII = (scrollY - i2) + this.LLII;
        scrollTo(getScrollX(), i2);
        LJIL(i2);
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e0, code lost:
    
        if (r4 >= r17.LJLJI.size()) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e2, code lost:
    
        r13 = (X.C80816Vng) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x021a, code lost:
    
        r1 = (getPaddingRight() / r12) + 2.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0225, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0132, code lost:
    
        r0 = r17.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0134, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0136, code lost:
    
        r14 = java.lang.Integer.valueOf(r0.getCount());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x013e, code lost:
    
        r1 = getClientHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0142, code lost:
    
        if (r1 <= 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0144, code lost:
    
        r8 = r17.LJLLL / r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0149, code lost:
    
        if (r7 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x014b, code lost:
    
        r4 = r7.LIZIZ;
        r0 = r10.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x014f, code lost:
    
        if (r4 >= r0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0151, code lost:
    
        r1 = (r7.LJ + r7.LIZLLL) + r8;
        r4 = r4 + 1;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x015c, code lost:
    
        if (r4 > r10.LIZIZ) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0164, code lost:
    
        if (r3 >= r17.LJLJI.size()) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0166, code lost:
    
        r7 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x016e, code lost:
    
        r7 = (X.C80816Vng) r7;
        kotlin.jvm.internal.o.LJI(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0173, code lost:
    
        if (r4 <= r7.LIZIZ) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x017d, code lost:
    
        if (r3 >= (r17.LJLJI.size() - 1)) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x017f, code lost:
    
        r3 = r3 + 1;
        r7 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x018c, code lost:
    
        if (r4 >= r7.LIZIZ) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x018e, code lost:
    
        r0 = r17.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0190, code lost:
    
        if (r0 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0192, code lost:
    
        r0 = java.lang.Float.valueOf(r0.LJIILJJIL(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x019a, code lost:
    
        kotlin.jvm.internal.o.LJI(r0);
        r1 = r1 + (r0.floatValue() + r8);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01a6, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01a8, code lost:
    
        r7.LJ = r1;
        r1 = r1 + (r7.LIZLLL + r8);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02a6, code lost:
    
        if (r4 <= r0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02a8, code lost:
    
        r3 = r17.LJLJI.size() - 1;
        r1 = r7.LJ;
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02b5, code lost:
    
        if (r4 < r10.LIZIZ) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02b7, code lost:
    
        if (r3 < 0) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02b9, code lost:
    
        r7 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02c1, code lost:
    
        r7 = (X.C80816Vng) r7;
        kotlin.jvm.internal.o.LJI(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02c6, code lost:
    
        if (r4 >= r7.LIZIZ) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02c8, code lost:
    
        if (r3 <= 0) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02ca, code lost:
    
        r3 = r3 - 1;
        r7 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02d7, code lost:
    
        if (r4 <= r7.LIZIZ) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02d9, code lost:
    
        r0 = r17.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02db, code lost:
    
        if (r0 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02dd, code lost:
    
        r0 = java.lang.Float.valueOf(r0.LJIILJJIL(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02e5, code lost:
    
        kotlin.jvm.internal.o.LJI(r0);
        r1 = r1 - (r0.floatValue() + r8);
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02f1, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02f3, code lost:
    
        r1 = r1 - (r7.LIZLLL + r8);
        r7.LJ = r1;
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02fc, code lost:
    
        r7 = r17.LJLJI.size();
        r12 = r10.LJ;
        r1 = r10.LIZIZ;
        r13 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0308, code lost:
    
        if (r1 != 0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x030a, code lost:
    
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x030b, code lost:
    
        r17.LJZ = r0;
        kotlin.jvm.internal.o.LJI(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0316, code lost:
    
        if (r1 != (r14.intValue() - 1)) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0318, code lost:
    
        r1 = (r10.LJ + r10.LIZLLL) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x031f, code lost:
    
        r17.LJZI = r1;
        r11 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0325, code lost:
    
        if (r11 < 0) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0327, code lost:
    
        r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r11);
        kotlin.jvm.internal.o.LJIIIIZZ(r2, "mItems[i]");
        r2 = (X.C80816Vng) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0332, code lost:
    
        r1 = r2.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0334, code lost:
    
        if (r13 <= r1) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0336, code lost:
    
        r0 = r17.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0338, code lost:
    
        if (r0 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x033a, code lost:
    
        r0 = java.lang.Float.valueOf(r0.LJIILJJIL(r13));
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0345, code lost:
    
        kotlin.jvm.internal.o.LJI(r0);
        r12 = r12 - (r0.floatValue() + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x034f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0351, code lost:
    
        r12 = r12 - (r2.LIZLLL + r8);
        r2.LJ = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0357, code lost:
    
        if (r1 != 0) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0359, code lost:
    
        r17.LJZ = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x035b, code lost:
    
        r11 = r11 - 1;
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0368, code lost:
    
        r2 = (r10.LJ + r10.LIZLLL) + r8;
        r12 = r10.LIZIZ + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0372, code lost:
    
        if (r9 >= r7) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0374, code lost:
    
        r11 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r9);
        kotlin.jvm.internal.o.LJIIIIZZ(r11, "mItems[i]");
        r11 = (X.C80816Vng) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x037f, code lost:
    
        r1 = r11.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0381, code lost:
    
        if (r12 >= r1) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0383, code lost:
    
        r0 = r17.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0385, code lost:
    
        if (r0 == null) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0387, code lost:
    
        r1 = r12 + 1;
        r0 = java.lang.Float.valueOf(r0.LJIILJJIL(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0391, code lost:
    
        kotlin.jvm.internal.o.LJI(r0);
        r2 = r2 + (r0.floatValue() + r8);
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x039c, code lost:
    
        r1 = r12;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03a4, code lost:
    
        if (r1 != (r14.intValue() - 1)) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03a6, code lost:
    
        r17.LJZI = (r11.LIZLLL + r2) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03ad, code lost:
    
        r11.LJ = r2;
        r2 = r2 + (r11.LIZLLL + r8);
        r9 = r9 + 1;
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03b8, code lost:
    
        r2 = r10.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03ba, code lost:
    
        if (r2 == null) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03bc, code lost:
    
        r1 = r17.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03be, code lost:
    
        if (r1 == null) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03c0, code lost:
    
        r1.LJIL(r17.LJLJL, r17, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0360, code lost:
    
        r1 = Float.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0364, code lost:
    
        r0 = -3.4028235E38f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x01b1, code lost:
    
        r8 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x01b3, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0228, code lost:
    
        if (r4 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x022c, code lost:
    
        if (r14 != r4.LIZIZ) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x022e, code lost:
    
        r15 = r15 + r4.LIZLLL;
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0233, code lost:
    
        if (r13 < 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0235, code lost:
    
        r4 = (X.C80816Vng) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x023e, code lost:
    
        r15 = r15 + LJIIIZ(r14, r13 + 1).LIZLLL;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0249, code lost:
    
        if (r13 < 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x024b, code lost:
    
        r4 = (X.C80816Vng) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0281, code lost:
    
        r1 = (getPaddingLeft() / r12) + (2.0f - r10.LIZLLL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x028f, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x02a2, code lost:
    
        if (r10 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00de, code lost:
    
        if (r1 == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e0, code lost:
    
        r13 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
    
        if (r13 < 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e4, code lost:
    
        r4 = (X.C80816Vng) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ec, code lost:
    
        r12 = getClientHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f2, code lost:
    
        if (r12 > 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f4, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f5, code lost:
    
        r14 = r17.LJLJL - 1;
        r15 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
    
        if ((-1) >= r14) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fe, code lost:
    
        if (r15 < r1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0100, code lost:
    
        if (r14 >= r9) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
    
        if (r4 != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0258, code lost:
    
        if (r14 != r4.LIZIZ) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x025c, code lost:
    
        if (r4.LIZJ != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x025e, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.remove(r17.LJLJI, r13);
        r3 = r17.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0265, code lost:
    
        if (r3 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0267, code lost:
    
        r0 = r4.LIZ;
        kotlin.jvm.internal.o.LJI(r0);
        r3.LJIIIZ(r14, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x026f, code lost:
    
        r13 = r13 - 1;
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0273, code lost:
    
        if (r13 < 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0254, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x027d, code lost:
    
        r14 = r14 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0275, code lost:
    
        r4 = (X.C80816Vng) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0104, code lost:
    
        r3 = r10.LIZLLL;
        r9 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010a, code lost:
    
        if (r3 >= 2.0f) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0112, code lost:
    
        if (r9 >= r17.LJLJI.size()) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0114, code lost:
    
        r13 = (X.C80816Vng) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011c, code lost:
    
        if (r12 > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011e, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011f, code lost:
    
        r12 = r17.LJLJL + 1;
        r11 = r11.intValue();
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0128, code lost:
    
        if (r12 >= r11) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012c, code lost:
    
        if (r3 < r1) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012e, code lost:
    
        if (r12 <= r8) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0130, code lost:
    
        if (r13 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ef, code lost:
    
        if (r12 != r13.LIZIZ) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f3, code lost:
    
        if (r13.LIZJ != false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f5, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.remove(r17.LJLJI, r4);
        r14 = r17.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01fc, code lost:
    
        if (r14 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01fe, code lost:
    
        r0 = r13.LIZ;
        kotlin.jvm.internal.o.LJI(r0);
        r14.LJIIIZ(r12, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x020c, code lost:
    
        if (r4 >= r17.LJLJI.size()) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01eb, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0216, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x020e, code lost:
    
        r13 = (X.C80816Vng) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b5, code lost:
    
        if (r13 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b9, code lost:
    
        if (r12 != r13.LIZIZ) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01bb, code lost:
    
        r3 = r3 + r13.LIZLLL;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c6, code lost:
    
        if (r4 >= r17.LJLJI.size()) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c8, code lost:
    
        r13 = (X.C80816Vng) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d1, code lost:
    
        r0 = LJIIIZ(r12, r4);
        r4 = r4 + 1;
        r3 = r3 + r0.LIZLLL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(int r18) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80794VnK.LJJI(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> views) {
        C80816Vng LJIILLIIL;
        o.LJIIIZ(views, "views");
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (LJIILLIIL = LJIILLIIL(childAt)) != null && LJIILLIIL.LIZIZ == this.LJLJL) {
                childAt.addTouchables(views);
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
        } else if (i <= 0 || scrollY >= ((int) (clientHeight * this.LJZI))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        o.LJIIIZ(p, "p");
        if ((p instanceof C80804VnU) && super.checkLayoutParams(p)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent event) {
        boolean LJIIJ;
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
                            LJIIJ = LJIIJ(2);
                        } else if (event.hasModifiers(1)) {
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
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        C80816Vng LJIILLIIL;
        o.LJIIIZ(event, "event");
        if (event.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(event);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (LJIILLIIL = LJIILLIIL(childAt)) != null && LJIILLIIL.LIZIZ == this.LJLJL && childAt.dispatchPopulateAccessibilityEvent(event)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (this.LJLIL && super.dispatchTouchEvent(ev)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r0.intValue() > 1) goto L13;
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
            super.draw(r9)     // Catch: java.lang.Exception -> L9
            goto Ld
        L9:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        Ld:
            int r0 = r8.getOverScrollMode()
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L2c
            if (r0 != r6) goto Lc0
            androidx.viewpager.widget.PagerAdapter r0 = r8.LJLJJLL
            if (r0 == 0) goto Lc0
            int r0 = r0.getCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.jvm.internal.o.LJI(r0)
            int r0 = r0.intValue()
            if (r0 <= r6) goto Lc0
        L2c:
            X.07Q r0 = r8.LLIL
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.LIZLLL()
            if (r0 != 0) goto L6e
            int r5 = r9.save()
            int r4 = r8.getHeight()
            int r3 = r8.getWidth()
            int r0 = r8.getPaddingLeft()
            int r3 = r3 - r0
            int r0 = r8.getPaddingRight()
            int r3 = r3 - r0
            int r0 = r8.getPaddingLeft()
            float r2 = (float) r0
            float r1 = r8.LJZ
            float r0 = (float) r4
            float r1 = r1 * r0
            r9.translate(r2, r1)
            X.07Q r0 = r8.LLIL
            kotlin.jvm.internal.o.LJI(r0)
            r0.LJII(r3, r4)
            X.07Q r0 = r8.LLIL
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.LIZ(r9)
            r7 = r7 | r0
            r9.restoreToCount(r5)
        L6e:
            X.07Q r0 = r8.LLILII
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.LIZLLL()
            if (r0 != 0) goto Lba
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
            float r1 = r8.LJZI
            float r0 = (float) r6
            float r1 = r1 + r0
            float r1 = -r1
            float r0 = (float) r5
            float r1 = r1 * r0
            r9.translate(r2, r1)
            X.07Q r0 = r8.LLILII
            kotlin.jvm.internal.o.LJI(r0)
            r0.LJII(r4, r5)
            X.07Q r0 = r8.LLILII
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.LIZ(r9)
            r7 = r7 | r0
            r9.restoreToCount(r3)
        Lba:
            if (r7 == 0) goto Lbf
            X.C16300kU.LJIIJ(r8)
        Lbf:
            return
        Lc0:
            X.07Q r0 = r8.LLIL
            kotlin.jvm.internal.o.LJI(r0)
            r0.LIZIZ()
            X.07Q r0 = r8.LLILII
            kotlin.jvm.internal.o.LJI(r0)
            r0.LIZIZ()
            goto Lbf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80794VnK.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        o.LJIIIZ(attrs, "attrs");
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        return new C80804VnU(context, attrs);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        Float f;
        float floatValue;
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if (this.LJLLL > 0 && this.LJLLLL != null && this.LJLJI.size() > 0 && this.LJLJJLL != null) {
            int scrollY = getScrollY();
            float height = getHeight();
            float f2 = this.LJLLL / height;
            int i2 = 0;
            Object obj = ListProtector.get(this.LJLJI, 0);
            o.LJIIIIZZ(obj, "mItems[0]");
            C80816Vng c80816Vng = (C80816Vng) obj;
            float f3 = c80816Vng.LJ;
            int size = this.LJLJI.size();
            int i3 = ((C80816Vng) ListProtector.get(this.LJLJI, size - 1)).LIZIZ;
            for (int i4 = c80816Vng.LIZIZ; i4 < i3; i4++) {
                while (true) {
                    i = c80816Vng.LIZIZ;
                    if (i4 <= i || i2 >= size) {
                        break;
                    }
                    i2++;
                    Object obj2 = ListProtector.get(this.LJLJI, i2);
                    o.LJIIIIZZ(obj2, "mItems[++itemIndex]");
                    c80816Vng = (C80816Vng) obj2;
                }
                if (i4 == i) {
                    float f4 = c80816Vng.LJ;
                    float f5 = c80816Vng.LIZLLL;
                    floatValue = (f4 + f5) * height;
                    f3 = f4 + f5 + f2;
                } else {
                    PagerAdapter pagerAdapter = this.LJLJJLL;
                    if (pagerAdapter != null) {
                        f = Float.valueOf(pagerAdapter.LJIILJJIL(i4));
                    } else {
                        f = null;
                    }
                    o.LJI(f);
                    floatValue = (f.floatValue() + f3) * height;
                    f3 = f.floatValue() + f2 + f3;
                }
                if (this.LJLLL + floatValue > scrollY) {
                    Drawable drawable = this.LJLLLL;
                    o.LJI(drawable);
                    drawable.setBounds(this.LJLLLLLL, (int) floatValue, this.LJLZ, (int) (this.LJLLL + floatValue + 0.5f));
                    Drawable drawable2 = this.LJLLLL;
                    o.LJI(drawable2);
                    drawable2.draw(canvas);
                }
                if (floatValue > scrollY + r10) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        float f;
        o.LJIIIZ(ev, "ev");
        try {
        } catch (IllegalArgumentException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (this.LLIILZL) {
            return false;
        }
        int action = ev.getAction() & 255;
        if (action != 1 && action != 3) {
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
                        LJIJJ(ev);
                    }
                } else {
                    int i = this.LLIIIL;
                    if (i != -1) {
                        int findPointerIndex = ev.findPointerIndex(i);
                        float y = ev.getY(findPointerIndex);
                        float f2 = y - this.LLIIII;
                        float abs = Math.abs(f2);
                        float x = ev.getX(findPointerIndex);
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
                        if (this.LLFFF && LJJ(y)) {
                            C16300kU.LJIIJ(this);
                        }
                    }
                }
            } else {
                this.LLII = ev.getX();
                this.LLIIIILZ = ev.getX();
                this.LLIIII = ev.getY();
                this.LLIIIJ = ev.getY();
                this.LLIIIL = ev.getPointerId(0);
                this.LLFII = false;
                this.LJLLILLLL = true;
                Scroller scroller = this.LJLLI;
                o.LJI(scroller);
                scroller.computeScrollOffset();
                if (this.LLILZIL == 2) {
                    Scroller scroller2 = this.LJLLI;
                    o.LJI(scroller2);
                    int finalY = scroller2.getFinalY();
                    Scroller scroller3 = this.LJLLI;
                    o.LJI(scroller3);
                    if (Math.abs(finalY - scroller3.getCurrY()) > this.LLIILII) {
                        Scroller scroller4 = this.LJLLI;
                        o.LJI(scroller4);
                        scroller4.abortAnimation();
                        this.LLF = false;
                        LJJI(this.LJLJL);
                        this.LLFFF = true;
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        setScrollState(1);
                    }
                }
                LJIIL(false);
                this.LLFFF = false;
            }
            if (this.LLIIIZ == null) {
                this.LLIIIZ = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker = this.LLIIIZ;
            o.LJI(velocityTracker);
            velocityTracker.addMovement(ev);
            return this.LLFFF;
        }
        LJJIII();
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        o.LJIIIZ(state, "state");
        if (!(state instanceof VerticalViewPager$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        VerticalViewPager$SavedState verticalViewPager$SavedState = (VerticalViewPager$SavedState) state;
        super.onRestoreInstanceState(verticalViewPager$SavedState.getSuperState());
        PagerAdapter pagerAdapter = this.LJLJJLL;
        if (pagerAdapter != null) {
            pagerAdapter.LJIJI(verticalViewPager$SavedState.adapterState, verticalViewPager$SavedState.loader);
            LJJIIJZLJL(verticalViewPager$SavedState.position, false, true, 0);
        } else {
            this.LJLJLJ = verticalViewPager$SavedState.position;
            this.LJLJLLL = verticalViewPager$SavedState.adapterState;
            this.LJLL = verticalViewPager$SavedState.loader;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        Integer num;
        PagerAdapter pagerAdapter;
        PagerAdapter pagerAdapter2;
        float f;
        o.LJIIIZ(ev, "ev");
        try {
        } catch (IllegalArgumentException e) {
            C16880lQ.LLLLIIL(e);
        } catch (IllegalStateException e2) {
            PagerAdapter pagerAdapter3 = this.LJLJJLL;
            if (pagerAdapter3 != null) {
                num = Integer.valueOf(pagerAdapter3.getCount());
            } else {
                num = null;
            }
            int i = this.LJLILLLLZI;
            if ((num == null || num.intValue() != i) && (pagerAdapter = this.LJLJJLL) != null) {
                pagerAdapter.notifyDataSetChanged();
            }
            C16880lQ.LLLLIIL(e2);
        }
        if (this.LLIILZL) {
            return true;
        }
        boolean z = false;
        if ((ev.getAction() != 0 || ev.getEdgeFlags() == 0) && (pagerAdapter2 = this.LJLJJLL) != null && pagerAdapter2.getCount() != 0) {
            if (this.LLIIIZ == null) {
                this.LLIIIZ = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker = this.LLIIIZ;
            o.LJI(velocityTracker);
            velocityTracker.addMovement(ev);
            int action = ev.getAction() & 255;
            if (action == 0) {
                Scroller scroller = this.LJLLI;
                o.LJI(scroller);
                scroller.abortAnimation();
                this.LLF = false;
                LJJI(this.LJLJL);
                this.LLII = ev.getX();
                this.LLIIIILZ = ev.getX();
                this.LLIIII = ev.getY();
                this.LLIIIJ = ev.getY();
                this.LLIIIL = ev.getPointerId(0);
            } else {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            if (action != 5) {
                                if (action == 6) {
                                    LJIJJ(ev);
                                    this.LLIIII = ev.getY(ev.findPointerIndex(this.LLIIIL));
                                }
                            } else {
                                int actionIndex = ev.getActionIndex();
                                this.LLIIII = ev.getY(actionIndex);
                                this.LLIIIL = ev.getPointerId(actionIndex);
                            }
                        } else if (this.LLFFF) {
                            LJJIIJ(this.LJLJL, true, 0, false);
                            z = LJJIII();
                        }
                    } else {
                        if (!this.LLFFF) {
                            int findPointerIndex = ev.findPointerIndex(this.LLIIIL);
                            if (findPointerIndex == -1) {
                                z = LJJIII();
                            } else {
                                float y = ev.getY(findPointerIndex);
                                float abs = Math.abs(y - this.LLIIII);
                                float x = ev.getX(findPointerIndex);
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
                            z |= LJJ(ev.getY(ev.findPointerIndex(this.LLIIIL)));
                        }
                    }
                } else if (this.LLFFF) {
                    VelocityTracker velocityTracker2 = this.LLIIIZ;
                    o.LJI(velocityTracker2);
                    velocityTracker2.computeCurrentVelocity(1000, this.LLIIJLIL);
                    int yVelocity = (int) velocityTracker2.getYVelocity(this.LLIIIL);
                    this.LLF = true;
                    int clientHeight = getClientHeight();
                    int scrollY = getScrollY();
                    C80816Vng LJIIZILJ = LJIIZILJ();
                    if (LJIIZILJ != null) {
                        float f3 = clientHeight;
                        LJJIIJZLJL(LJIILJJIL(LJIIZILJ.LIZIZ, ((scrollY / f3) - LJIIZILJ.LJ) / (LJIIZILJ.LIZLLL + (this.LJLLL / f3)), yVelocity, (int) (ev.getY(ev.findPointerIndex(this.LLIIIL)) - this.LLIIIJ)), true, true, yVelocity);
                    }
                    z = LJJIII();
                }
                if (z) {
                    C16300kU.LJIIJ(this);
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        o.LJIIIZ(view, "view");
        if (this.LL) {
            if (C78996UzQ.LJJIIJZLJL(view)) {
                C78996UzQ.LJI();
            }
            removeViewInLayout(view);
            return;
        }
        super.removeView(view);
    }

    public final void setAdapter(PagerAdapter adapter) {
        Integer num;
        o.LJIIIZ(adapter, "adapter");
        PagerAdapter pagerAdapter = this.LJLJJLL;
        if (pagerAdapter != null) {
            try {
                Field field = LLIZLLLIL;
                if (field != null) {
                    field.set(pagerAdapter, null);
                }
            } catch (IllegalAccessException unused) {
            }
            PagerAdapter pagerAdapter2 = this.LJLJJLL;
            if (pagerAdapter2 != null) {
                pagerAdapter2.LJJIFFI(this);
            }
            int size = this.LJLJI.size();
            for (int i = 0; i < size; i++) {
                Object obj = ListProtector.get(this.LJLJI, i);
                o.LJIIIIZZ(obj, "mItems[i]");
                C80816Vng c80816Vng = (C80816Vng) obj;
                PagerAdapter pagerAdapter3 = this.LJLJJLL;
                if (pagerAdapter3 != null) {
                    int i2 = c80816Vng.LIZIZ;
                    Object obj2 = c80816Vng.LIZ;
                    o.LJI(obj2);
                    pagerAdapter3.LJIIIZ(i2, this, obj2);
                }
            }
            PagerAdapter pagerAdapter4 = this.LJLJJLL;
            if (pagerAdapter4 != null) {
                pagerAdapter4.LJIIJJI(this);
            }
            this.LJLJI.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i3).getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager.LayoutParams");
                if (!((C80804VnU) layoutParams).LIZ) {
                    try {
                        if (C78996UzQ.LJJIIJZLJL(getChildAt(i3))) {
                            C78996UzQ.LJI();
                        }
                    } catch (Throwable unused2) {
                    }
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.LJLJL = 0;
            scrollTo(0, 0);
        }
        this.LJLJJLL = adapter;
        this.LJLILLLLZI = 0;
        if (this.LJLLJ == null) {
            this.LJLLJ = new C80819Vnj(this);
        }
        PagerAdapter pagerAdapter5 = this.LJLJJLL;
        C80819Vnj c80819Vnj = this.LJLLJ;
        try {
            Field field2 = LLIZLLLIL;
            if (field2 != null) {
                field2.set(pagerAdapter5, c80819Vnj);
            }
        } catch (IllegalAccessException unused3) {
        }
        this.LLF = false;
        boolean z = this.LLILIL;
        this.LLILIL = true;
        PagerAdapter pagerAdapter6 = this.LJLJJLL;
        if (pagerAdapter6 != null) {
            num = Integer.valueOf(pagerAdapter6.getCount());
        } else {
            num = null;
        }
        o.LJI(num);
        this.LJLILLLLZI = num.intValue();
        if (this.LJLJLJ >= 0) {
            PagerAdapter pagerAdapter7 = this.LJLJJLL;
            if (pagerAdapter7 != null) {
                pagerAdapter7.LJIJI(this.LJLJLLL, this.LJLL);
            }
            LJJIIJZLJL(this.LJLJLJ, false, true, 0);
            this.LJLJLJ = -1;
            this.LJLJLLL = null;
            this.LJLL = null;
            return;
        }
        if (!z) {
            LJJI(this.LJLJL);
        } else {
            requestLayout();
        }
    }

    public final void setCanTouch(boolean z) {
        this.LJLIL = z;
    }

    public final void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (this.LLILLL == null) {
            try {
                Class TYPE = Boolean.TYPE;
                o.LJIIIIZZ(TYPE, "TYPE");
                this.LLILLL = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", TYPE);
            } catch (NoSuchMethodException unused) {
            }
        }
        try {
            Method method = this.LLILLL;
            o.LJI(method);
            method.invoke(this, Boolean.valueOf(z));
        } catch (Exception unused2) {
        }
    }

    public final void setCurrentItem(int i) {
        this.LLF = false;
        LJJIIJZLJL(i, !this.LLILIL, false, 0);
    }

    public final void setCurrentItemWithDefaultVelocity(int i) {
        this.LLF = false;
        LJJIIJZLJL(i, true, true, 1);
    }

    public final void setDisableScroll(boolean z) {
        this.LLILZLL = z;
    }

    public final void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.LLFF) {
            this.LLFF = i;
            LJJI(this.LJLJL);
        }
    }

    public final void setPageMargin(int i) {
        int i2 = this.LJLLL;
        this.LJLLL = i;
        int height = getHeight();
        LJJII(height, height, i, i2);
        requestLayout();
    }

    public final void setPageMarginDrawable(Drawable drawable) {
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

    public final void setScrollState(int i) {
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

    public final void setScroller(Scroller scroller) {
        this.LJLLI = scroller;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable who) {
        o.LJIIIZ(who, "who");
        if (super.verifyDrawable(who) || who == this.LJLLLL) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        o.LJIIIZ(p, "p");
        return new C80804VnU();
    }

    public final void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80794VnK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        this.LJLJI = new ArrayList<>();
        this.LJLJJI = new C80816Vng();
        this.LJLJJL = new Rect();
        this.LJLJLJ = -1;
        this.LJZ = -3.4028235E38f;
        this.LJZI = Float.MAX_VALUE;
        this.LLFF = 1;
        this.LLIIIL = -1;
        this.LLILIL = true;
        this.LLILLJJLI = new ArrayList();
        this.LLILZ = new ARunnableS12S0101000_8(1, this, 40);
        this.LJLIL = true;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.LJLLI = new Scroller(context2, InterpolatorC80824Vno.LIZ);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.LLIFFJFJJ = viewConfiguration.getScaledPagingTouchSlop();
        this.LLIIJI = (int) (LiveChatShowDelayForHotLiveSetting.DEFAULT * f);
        this.LLIIJLIL = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LLIL = new C07Q(context2);
        this.LLILII = new C07Q(context2);
        this.LLIIL = (int) (25 * f);
        this.LLIILII = (int) (2 * f);
        this.LLFZ = (int) (16 * f);
        h0.LJIJI(this, new C80798VnO(this));
        if (C16300kU.LIZJ(this) == 0) {
            C16300kU.LJIJ(this, 1);
        }
        C16360ka.LJIJJ(this, new C80310VfW(this));
    }

    public final C80816Vng LJIIIZ(int i, int i2) {
        Object obj;
        C80816Vng c80816Vng = new C80816Vng();
        c80816Vng.LIZIZ = i;
        PagerAdapter pagerAdapter = this.LJLJJLL;
        Float f = null;
        if (pagerAdapter != null) {
            obj = pagerAdapter.LJIILLIIL(i, this);
        } else {
            obj = null;
        }
        c80816Vng.LIZ = obj;
        PagerAdapter pagerAdapter2 = this.LJLJJLL;
        if (pagerAdapter2 != null) {
            f = Float.valueOf(pagerAdapter2.LJIILJJIL(i));
        }
        o.LJI(f);
        c80816Vng.LIZLLL = f.floatValue();
        if (i2 < 0 || i2 >= this.LJLJI.size()) {
            this.LJLJI.add(c80816Vng);
        } else {
            ListProtector.add(this.LJLJI, i2, c80816Vng);
        }
        return c80816Vng;
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
        o.LJI(null);
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
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
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager.LayoutParams");
                C80804VnU c80804VnU = (C80804VnU) layoutParams;
                if (c80804VnU.LIZ) {
                    int i6 = c80804VnU.LIZIZ;
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
                    int i10 = ((ViewGroup.LayoutParams) c80804VnU).width;
                    if (i10 != -2) {
                        if (i10 == -1) {
                            i10 = measuredWidth;
                        }
                        i3 = 1073741824;
                    } else {
                        i10 = measuredWidth;
                    }
                    int i11 = ((ViewGroup.LayoutParams) c80804VnU).height;
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
        this.LJZL = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
        this.LL = true;
        LJJI(this.LJLJL);
        this.LL = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager.LayoutParams");
                C80804VnU c80804VnU2 = (C80804VnU) layoutParams2;
                if (!c80804VnU2.LIZ) {
                    childAt2.measure(this.LJZL, View.MeasureSpec.makeMeasureSpec((int) (paddingTop * c80804VnU2.LIZJ), 1073741824));
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C80816Vng LJIILLIIL;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(int r10, float r11, int r12) {
        /*
            r9 = this;
            int r0 = r9.LLILLIZIL
            if (r0 <= 0) goto L71
            int r8 = r9.getScrollY()
            int r5 = r9.getPaddingTop()
            int r7 = r9.getPaddingBottom()
            int r6 = r9.getHeight()
            int r4 = r9.getChildCount()
            r3 = 0
        L19:
            if (r3 >= r4) goto L71
            android.view.View r2 = r9.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager.LayoutParams"
            kotlin.jvm.internal.o.LJII(r1, r0)
            X.VnU r1 = (X.C80804VnU) r1
            boolean r0 = r1.LIZ
            if (r0 != 0) goto L31
        L2e:
            int r3 = r3 + 1
            goto L19
        L31:
            int r0 = r1.LIZIZ
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r1 == r0) goto L55
            r0 = 48
            if (r1 == r0) goto L4f
            r0 = 80
            if (r1 == r0) goto L62
            r0 = r5
        L42:
            int r5 = r5 + r8
            int r1 = r2.getTop()
            int r5 = r5 - r1
            if (r5 == 0) goto L4d
            r2.offsetTopAndBottom(r5)
        L4d:
            r5 = r0
            goto L2e
        L4f:
            int r0 = r2.getHeight()
            int r0 = r0 + r5
            goto L42
        L55:
            int r0 = r2.getMeasuredHeight()
            int r0 = r6 - r0
            int r0 = r0 / 2
            int r1 = java.lang.Math.max(r0, r5)
            goto L6e
        L62:
            int r1 = r6 - r7
            int r0 = r2.getMeasuredHeight()
            int r1 = r1 - r0
            int r0 = r2.getMeasuredHeight()
            int r7 = r7 + r0
        L6e:
            r0 = r5
            r5 = r1
            goto L42
        L71:
            java.util.List<X.0C3> r0 = r9.LLILLJJLI
            if (r0 == 0) goto L95
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L95
            java.util.List<X.0C3> r0 = r9.LLILLJJLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L85:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r1.next()
            X.0C3 r0 = (X.C0C3) r0
            r0.onPageScrolled(r10, r11, r12)
            goto L85
        L95:
            r0 = 1
            r9.LLILL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80794VnK.LJIJI(int, float, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> views, int i, int i2) {
        C80816Vng LJIILLIIL;
        o.LJIIIZ(views, "views");
        int size = views.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (LJIILLIIL = LJIILLIIL(childAt)) != null && LJIILLIIL.LIZIZ == this.LJLJL) {
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
        C80804VnU c80804VnU = (C80804VnU) params;
        boolean z = c80804VnU.LIZ;
        c80804VnU.LIZ = z;
        if (this.LL) {
            if (!z) {
                c80804VnU.LIZLLL = true;
                addViewInLayout(child, i, params);
                return;
            } else {
                "Cannot add pager decor view during layout".toString();
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
        }
        super.addView(child, i, params);
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
            Object obj = ListProtector.get(this.LJLJI, 0);
            o.LJIIIIZZ(obj, "mItems[0]");
            Object obj2 = ListProtector.get(this.LJLJI, r1.size() - 1);
            o.LJIIIIZZ(obj2, "mItems[mItems.size - 1]");
            return Math.max(((C80816Vng) obj).LIZIZ, Math.min(i, ((C80816Vng) obj2).LIZIZ));
        }
        return i;
    }

    public final void LJJII(int i, int i2, int i3, int i4) {
        float f;
        if (i2 > 0 && !this.LJLJI.isEmpty()) {
            Scroller scroller = this.LJLLI;
            o.LJI(scroller);
            if (!scroller.isFinished()) {
                Scroller scroller2 = this.LJLLI;
                o.LJI(scroller2);
                scroller2.setFinalY(getCurrentItem() * getClientHeight());
                return;
            } else {
                scrollTo(getScrollX(), (int) ((getScrollY() / (((i2 - getPaddingTop()) - getPaddingBottom()) + i4)) * (((i - getPaddingTop()) - getPaddingBottom()) + i3)));
                return;
            }
        }
        C80816Vng LJIJ = LJIJ(this.LJLJL);
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

    public final void LJJIIJ(int i, boolean z, int i2, boolean z2) {
        int i3;
        List<C0C3> list;
        int scrollY;
        Float f;
        int abs;
        List<C0C3> list2;
        C80816Vng LJIJ = LJIJ(i);
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
                        Scroller scroller2 = this.LJLLI;
                        o.LJI(scroller2);
                        scrollY = scroller2.getCurrY();
                    } else {
                        Scroller scroller3 = this.LJLLI;
                        o.LJI(scroller3);
                        scrollY = scroller3.getStartY();
                    }
                    Scroller scroller4 = this.LJLLI;
                    o.LJI(scroller4);
                    scroller4.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollY = getScrollY();
                }
                int scrollX = getScrollX();
                int i4 = -scrollX;
                int i5 = i3 - scrollY;
                if (i4 == 0 && i5 == 0) {
                    LJIIL(false);
                    LJJI(this.LJLJL);
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientHeight = getClientHeight();
                    int i6 = clientHeight / 2;
                    float f2 = clientHeight;
                    float f3 = i6;
                    float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f2) - 0.5f) * 0.4712389f)) * f3) + f3;
                    int abs2 = Math.abs(i2);
                    if (abs2 > 0) {
                        abs = Math.round(Math.abs(sin / abs2) * 1000) * 4;
                    } else {
                        PagerAdapter pagerAdapter = this.LJLJJLL;
                        if (pagerAdapter != null) {
                            f = Float.valueOf(pagerAdapter.LJIILJJIL(this.LJLJL));
                        } else {
                            f = null;
                        }
                        o.LJI(f);
                        abs = (int) (((Math.abs(i4) / ((f.floatValue() * f2) + this.LJLLL)) + 1) * 100);
                    }
                    int min = Math.min(abs, 600);
                    this.LJLLILLLL = false;
                    Scroller scroller5 = this.LJLLI;
                    o.LJI(scroller5);
                    scroller5.startScroll(scrollX, scrollY, i4, i5, min);
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
        LJIL(i3);
    }

    public final void LJJIIJZLJL(int i, boolean z, boolean z2, int i2) {
        Integer num;
        List<C0C3> list;
        PagerAdapter pagerAdapter = this.LJLJJLL;
        boolean z3 = false;
        if (pagerAdapter != null) {
            Integer num2 = null;
            Integer valueOf = Integer.valueOf(pagerAdapter.getCount());
            o.LJI(valueOf);
            if (valueOf.intValue() > 0) {
                if (!z2 && this.LJLJL == i && this.LJLJI.size() != 0) {
                    setScrollingCacheEnabled(false);
                    return;
                }
                if (i < 0) {
                    i = 0;
                } else {
                    PagerAdapter pagerAdapter2 = this.LJLJJLL;
                    if (pagerAdapter2 != null) {
                        num = Integer.valueOf(pagerAdapter2.getCount());
                    } else {
                        num = null;
                    }
                    o.LJI(num);
                    if (i >= num.intValue()) {
                        PagerAdapter pagerAdapter3 = this.LJLJJLL;
                        if (pagerAdapter3 != null) {
                            num2 = Integer.valueOf(pagerAdapter3.getCount());
                        }
                        o.LJI(num2);
                        i = num2.intValue() - 1;
                    }
                }
                int i3 = this.LLFF;
                int i4 = this.LJLJL;
                if (i > i4 + i3 || i < i4 - i3) {
                    int size = this.LJLJI.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        ((C80816Vng) ListProtector.get(this.LJLJI, i5)).LIZJ = true;
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
                LJJI(i);
                LJJIIJ(i, z, i2, z3);
                return;
            }
        }
        setScrollingCacheEnabled(false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            int i5 = this.LJLLL;
            LJJII(i2, i4, i5, i5);
        }
    }

    public final boolean LJIIJJI(View v, boolean z, int i, int i2, int i3) {
        int i4;
        o.LJIIIZ(v, "v");
        if (v instanceof ViewGroup) {
            int scrollX = v.getScrollX();
            int scrollY = v.getScrollY();
            ViewGroup viewGroup = (ViewGroup) v;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i3 + scrollY;
                if (i5 >= childAt.getTop() && i5 < childAt.getBottom() && (i4 = i2 + scrollX) >= childAt.getLeft() && i4 < childAt.getRight() && LJIIJJI(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z && v.canScrollVertically(-i)) {
            return true;
        }
        return false;
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
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80794VnK.onLayout(boolean, int, int, int, int):void");
    }
}
