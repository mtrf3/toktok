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
import com.bytedance.android.livesdk.liveroom.LiveVerticalViewPager$SavedState;
import com.bytedance.android.livesdk.livesetting.feed.LiveLandscapeInnerFeedSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveGestureOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAdjustScrollConfigSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveScrollAngleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import o3.h0;

/* renamed from: X.VnN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80797VnN extends ViewGroup {
    public static final int[] LLJJ = {R.attr.layout_gravity};
    public static final IDComparatorS42S0000000_14 LLJJI = new IDComparatorS42S0000000_14(1);
    public static final InterpolatorC80820Vnk LLJJIII = new InterpolatorC80820Vnk();
    public static final Field LLJJIJI;
    public float LJLIL;
    public boolean LJLILLLLZI;
    public final ArrayList<C80814Vne> LJLJI;
    public final C80814Vne LJLJJI;
    public final Rect LJLJJL;
    public PagerAdapter LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public Parcelable LJLJLLL;
    public ClassLoader LJLL;
    public Scroller LJLLI;
    public boolean LJLLILLLL;
    public C80823Vnn LJLLJ;
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
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public int LLIIJI;
    public VelocityTracker LLIIJLIL;
    public int LLIIL;
    public int LLIILII;
    public int LLIILZL;
    public int LLIIZ;
    public double LLIL;
    public Boolean LLILII;
    public boolean LLILIL;
    public long LLILL;
    public C57736MlI LLILLIZIL;
    public C57736MlI LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public C0C3 LLIZLLLIL;
    public Method LLJ;
    public BVZ LLJI;
    public boolean LLJIJIL;
    public InterfaceC28613BKv LLJILJIL;
    public final ARunnableS50S0100000_14 LLJILJILJ;
    public int LLJILLL;

    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            LLJJIJI = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean LJJ() {
        this.LLIIJI = -1;
        this.LLFFF = false;
        this.LLFII = false;
        VelocityTracker velocityTracker = this.LLIIJLIL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.LLIIJLIL = null;
        }
        C57736MlI c57736MlI = this.LLILLIZIL;
        c57736MlI.LIZ.onRelease();
        boolean isFinished = c57736MlI.LIZ.isFinished();
        C57736MlI c57736MlI2 = this.LLILLJJLI;
        c57736MlI2.LIZ.onRelease();
        return isFinished | c57736MlI2.LIZ.isFinished();
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
                if (!LJIIZILJ(currY)) {
                    this.LJLLI.abortAnimation();
                    scrollTo(currX, 0);
                }
            }
            C16300kU.LJIIJ(this);
            return;
        }
        LJ(true);
    }

    public void setOnAdapterChangeListener(InterfaceC80830Vnu interfaceC80830Vnu) {
    }

    public void setOverScrollListener(InterfaceC80831Vnv interfaceC80831Vnv) {
    }

    private int getScrollAngle() {
        LandscapeWatchLiveGestureOpt landscapeWatchLiveGestureOpt = LandscapeWatchLiveGestureOpt.INSTANCE;
        if (!landscapeWatchLiveGestureOpt.getEnableScrollAngleOpt()) {
            return LiveScrollAngleSetting.INSTANCE.getValue();
        }
        return landscapeWatchLiveGestureOpt.getScrollAngle();
    }

    public final void LIZJ() {
        if (this.LLFFF) {
            return;
        }
        this.LLILIL = true;
        setScrollState(1);
        this.LLIIII = 0.0f;
        this.LLIIIJ = 0.0f;
        VelocityTracker velocityTracker = this.LLIIJLIL;
        if (velocityTracker == null) {
            this.LLIIJLIL = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.LLIIJLIL.addMovement(obtain);
        obtain.recycle();
        this.LLILL = uptimeMillis;
    }

    public final void LJFF() {
        boolean z;
        int count = this.LJLJJLL.getCount();
        if (this.LJLJI.size() < (this.LLFF * 2) + 1 && this.LJLJI.size() < count) {
            z = true;
        } else {
            z = false;
        }
        int i = this.LJLJL;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.LJLJI.size()) {
            C80814Vne c80814Vne = (C80814Vne) ListProtector.get(this.LJLJI, i2);
            int LJIIL = this.LJLJJLL.LJIIL(c80814Vne.LIZ);
            if (LJIIL != -1) {
                if (LJIIL == -2) {
                    ListProtector.remove(this.LJLJI, i2);
                    i2--;
                    if (!z2) {
                        this.LJLJJLL.LJJIFFI(this);
                        z2 = true;
                    }
                    this.LJLJJLL.LJIIIZ(c80814Vne.LIZIZ, this, c80814Vne.LIZ);
                    int i3 = this.LJLJL;
                    if (i3 == c80814Vne.LIZIZ) {
                        i = Math.max(0, Math.min(i3, (-1) + count));
                    }
                } else {
                    int i4 = c80814Vne.LIZIZ;
                    if (i4 != LJIIL) {
                        if (i4 == this.LJLJL) {
                            i = LJIIL;
                        }
                        c80814Vne.LIZIZ = LJIIL;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.LJLJJLL.LJIIJJI(this);
        }
        Collections.sort(this.LJLJI, LLJJI);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C80805VnV c80805VnV = (C80805VnV) getChildAt(i5).getLayoutParams();
                if (!c80805VnV.LIZ) {
                    c80805VnV.LIZJ = 0.0f;
                }
            }
            LJJIFFI(i, false, true, 0);
            requestLayout();
        }
    }

    public final void LJII() {
        if (this.LLILIL) {
            if (this.LJLJJLL != null) {
                VelocityTracker velocityTracker = this.LLIIJLIL;
                velocityTracker.computeCurrentVelocity(1000, this.LLIILII);
                int yVelocity = (int) velocityTracker.getYVelocity(this.LLIIJI);
                this.LLF = true;
                int clientHeight = getClientHeight();
                int scrollY = getScrollY();
                C80814Vne LJIIL = LJIIL();
                LJJIFFI(LJI(LJIIL.LIZIZ, ((scrollY / clientHeight) - LJIIL.LJ) / LJIIL.LIZLLL, yVelocity, (int) (this.LLIIII - this.LLIIIJ)), true, true, yVelocity);
            }
            this.LLFFF = false;
            this.LLFII = false;
            VelocityTracker velocityTracker2 = this.LLIIJLIL;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.LLIIJLIL = null;
            }
            this.LLILIL = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public final boolean LJIILLIIL() {
        PagerAdapter pagerAdapter = this.LJLJJLL;
        if (pagerAdapter == null || this.LJLJL >= pagerAdapter.getCount() - 1) {
            return false;
        }
        int i = this.LJLJL + 1;
        this.LLF = false;
        LJJIFFI(i, true, false, 0);
        return true;
    }

    public final void LJIJI() {
        LJIJJ(this.LJLJL);
    }

    public final void LJJIIJ() {
        if (LiveScrollAngleSetting.INSTANCE.getValue() > 0) {
            this.LLIL = Math.tan(Math.toRadians(90 - (r0 / 2)));
            this.LLILII = Boolean.TRUE;
        } else {
            this.LLILII = Boolean.FALSE;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C80805VnV();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.LLJILJILJ);
        Scroller scroller = this.LJLLI;
        if (scroller != null && !scroller.isFinished()) {
            this.LJLLI.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public final C80814Vne LJIIL() {
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
        C80814Vne c80814Vne = null;
        float f4 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.LJLJI.size()) {
            C80814Vne c80814Vne2 = (C80814Vne) ListProtector.get(this.LJLJI, i3);
            if (!z && c80814Vne2.LIZIZ != (i = i2 + 1)) {
                c80814Vne2 = this.LJLJJI;
                c80814Vne2.LJ = f3 + f4 + f2;
                c80814Vne2.LIZIZ = i;
                c80814Vne2.LIZLLL = this.LJLJJLL.LJIILJJIL(i);
                i3--;
            }
            f3 = c80814Vne2.LJ;
            float f5 = c80814Vne2.LIZLLL + f3 + f2;
            if (z || f >= f3) {
                if (f < f5 || i3 == this.LJLJI.size() - 1) {
                    return c80814Vne2;
                }
                i2 = c80814Vne2.LIZIZ;
                f4 = c80814Vne2.LIZLLL;
                i3++;
                z = false;
                c80814Vne = c80814Vne2;
            } else {
                return c80814Vne;
            }
        }
        return c80814Vne;
    }

    public final void LJJIII() {
        if (getScrollAngle() > 0) {
            this.LLIL = Math.tan(Math.toRadians(90 - (r0 / 2)));
            this.LLILII = Boolean.TRUE;
        } else {
            this.LLILII = Boolean.FALSE;
        }
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
        this.LLILZIL = true;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        LiveVerticalViewPager$SavedState liveVerticalViewPager$SavedState = new LiveVerticalViewPager$SavedState(super.onSaveInstanceState());
        liveVerticalViewPager$SavedState.LJLIL = this.LJLJL;
        PagerAdapter pagerAdapter = this.LJLJJLL;
        if (pagerAdapter != null) {
            liveVerticalViewPager$SavedState.LJLILLLLZI = pagerAdapter.LJIJJ();
        }
        return liveVerticalViewPager$SavedState;
    }

    public PagerAdapter getAdapter() {
        return this.LJLJJLL;
    }

    public int getCurrentItem() {
        return this.LJLJL;
    }

    public float getInitialMotionY() {
        return this.LLIIIJ;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(int r7) {
        /*
            r6 = this;
            android.view.View r5 = r6.findFocus()
            r3 = 1
            r2 = 0
            if (r5 != r6) goto L84
        L8:
            r5 = 0
        L9:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r4 = r0.findNextFocus(r6, r5, r7)
            r1 = 130(0x82, float:1.82E-43)
            r0 = 33
            if (r4 == 0) goto L69
            if (r4 == r5) goto L69
            if (r7 != r0) goto L49
            android.graphics.Rect r0 = r6.LJLJJL
            android.graphics.Rect r0 = r6.LJIIIZ(r0, r4)
            int r1 = r0.top
            android.graphics.Rect r0 = r6.LJLJJL
            android.graphics.Rect r0 = r6.LJIIIZ(r0, r5)
            int r0 = r0.top
            if (r5 == 0) goto L44
            if (r1 < r0) goto L44
            int r0 = r6.LJLJL
            if (r0 <= 0) goto L78
            int r0 = r0 - r3
            r6.LLF = r2
            r6.LJJIFFI(r0, r3, r2, r2)
        L39:
            r2 = r3
        L3a:
            if (r2 == 0) goto L43
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r0)
        L43:
            return r2
        L44:
            boolean r2 = r4.requestFocus()
            goto L3a
        L49:
            if (r7 != r1) goto L43
            android.graphics.Rect r0 = r6.LJLJJL
            android.graphics.Rect r0 = r6.LJIIIZ(r0, r4)
            int r1 = r0.bottom
            android.graphics.Rect r0 = r6.LJLJJL
            android.graphics.Rect r0 = r6.LJIIIZ(r0, r5)
            int r0 = r0.bottom
            if (r5 == 0) goto L64
            if (r1 > r0) goto L64
            boolean r2 = r6.LJIILLIIL()
            goto L3a
        L64:
            boolean r2 = r4.requestFocus()
            goto L3a
        L69:
            if (r7 == r0) goto L6d
            if (r7 != r3) goto L7a
        L6d:
            int r0 = r6.LJLJL
            if (r0 <= 0) goto L78
            int r0 = r0 - r3
            r6.LLF = r2
            r6.LJJIFFI(r0, r3, r2, r2)
            goto L39
        L78:
            r3 = 0
            goto L39
        L7a:
            if (r7 == r1) goto L7f
            r0 = 2
            if (r7 != r0) goto L43
        L7f:
            boolean r2 = r6.LJIILLIIL()
            goto L3a
        L84:
            if (r5 == 0) goto L9
            android.view.ViewParent r1 = r5.getParent()
        L8a:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L97
            if (r1 != r6) goto L92
            goto L9
        L92:
            android.view.ViewParent r1 = r1.getParent()
            goto L8a
        L97:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = X.C16880lQ.LJLLJ(r0)
            r4.append(r0)
            android.view.ViewParent r1 = r5.getParent()
        Lab:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lc4
            java.lang.String r0 = " => "
            r4.append(r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = X.C16880lQ.LJLLJ(r0)
            r4.append(r0)
            android.view.ViewParent r1 = r1.getParent()
            goto Lab
        Lc4:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            r1.append(r0)
            java.lang.String r0 = r4.toString()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "LiveVerticalViewPager"
            X.C0NB.LJ(r0, r1)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80797VnN.LIZIZ(int):boolean");
    }

    public final void LJ(boolean z) {
        boolean z2;
        if (this.LLJILLL == 2) {
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
                        LJIIZILJ(currY);
                    }
                }
            } else if (this.LJLLI.getCurrY() != getScrollY()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DmtViewPager completeScroll mScroller.getCurrY() != getScrollY() ");
                LIZ.append(this.LJLLI.getCurrY() - getScrollY());
                C0NB.LJ("slide_log", X1D.LIZIZ(LIZ));
                scrollTo(this.LJLLI.getCurrX(), this.LJLLI.getCurrY());
                TimeUnit unit = TimeUnit.MILLISECONDS;
                o.LJIIIZ(unit, "unit");
                AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
                o.LJIIIIZZ(abstractC73946T0k, "computation()");
                new C73453SsD(Math.max(0L, 300L), Math.max(0L, 300L), unit, abstractC73946T0k).LJJJ(C73969T1h.LIZIZ()).LIZ(new C80803VnT(this));
            }
        } else {
            z2 = false;
        }
        this.LLF = false;
        for (int i = 0; i < this.LJLJI.size(); i++) {
            C80814Vne c80814Vne = (C80814Vne) ListProtector.get(this.LJLJI, i);
            if (c80814Vne.LIZJ) {
                c80814Vne.LIZJ = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                C16300kU.LJIIL(this, this.LLJILJILJ);
            } else {
                this.LLJILJILJ.run();
            }
        }
    }

    public final void LJIIIIZZ(float f) {
        if (this.LLILIL) {
            if (this.LJLJJLL == null) {
                return;
            }
            this.LLIIII += f;
            float scrollY = getScrollY() - f;
            float clientHeight = getClientHeight();
            float f2 = this.LJZ * clientHeight;
            float f3 = this.LJZI * clientHeight;
            C80814Vne c80814Vne = (C80814Vne) ListProtector.get(this.LJLJI, 0);
            C80814Vne c80814Vne2 = (C80814Vne) ListProtector.get(this.LJLJI, r1.size() - 1);
            if (c80814Vne.LIZIZ != 0) {
                f2 = c80814Vne.LJ * clientHeight;
            }
            if (c80814Vne2.LIZIZ != this.LJLJJLL.getCount() - 1) {
                f3 = c80814Vne2.LJ * clientHeight;
            }
            if (scrollY < f2) {
                scrollY = f2;
            } else if (scrollY > f3) {
                scrollY = f3;
            }
            int i = (int) scrollY;
            this.LLIIII = (scrollY - i) + this.LLIIII;
            scrollTo(getScrollX(), i);
            LJIIZILJ(i);
            MotionEvent obtain = MotionEvent.obtain(this.LLILL, SystemClock.uptimeMillis(), 2, 0.0f, this.LLIIII, 0);
            this.LLIIJLIL.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public final C80814Vne LJIIJJI(View view) {
        for (int i = 0; i < this.LJLJI.size(); i++) {
            C80814Vne c80814Vne = (C80814Vne) ListProtector.get(this.LJLJI, i);
            if (this.LJLJJLL.LJIIZILJ(view, c80814Vne.LIZ)) {
                return c80814Vne;
            }
        }
        return null;
    }

    public final C80814Vne LJIILIIL(int i) {
        for (int i2 = 0; i2 < this.LJLJI.size(); i2++) {
            C80814Vne c80814Vne = (C80814Vne) ListProtector.get(this.LJLJI, i2);
            if (c80814Vne.LIZIZ == i) {
                return c80814Vne;
            }
        }
        return null;
    }

    public final void LJIILL(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LLIIJI) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LLIIII = motionEvent.getY(i);
            this.LLIIJI = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.LLIIJLIL;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean LJIIZILJ(int i) {
        if (this.LJLJI.size() == 0) {
            if (this.LLILZIL) {
                return false;
            }
            this.LLILZLL = false;
            LJIILJJIL(0, 0.0f, 0);
            if (this.LLILZLL) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C80814Vne LJIIL = LJIIL();
        int clientHeight = getClientHeight();
        int i2 = this.LJLLL;
        int i3 = clientHeight + i2;
        float f = i2;
        float f2 = clientHeight;
        int i4 = LJIIL.LIZIZ;
        float f3 = ((i / f2) - LJIIL.LJ) / (LJIIL.LIZLLL + (f / f2));
        this.LLILZLL = false;
        LJIILJJIL(i4, f3, (int) (i3 * f3));
        if (this.LLILZLL) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean LJIJ(float f) {
        boolean z;
        boolean z2;
        float f2 = (this.LLIIII - f) * this.LJLIL;
        this.LLIIII = f;
        float scrollY = getScrollY() + f2;
        float clientHeight = getClientHeight();
        float f3 = this.LJZ * clientHeight;
        float f4 = this.LJZI * clientHeight;
        boolean z3 = false;
        C80814Vne c80814Vne = (C80814Vne) ListProtector.get(this.LJLJI, 0);
        ArrayList<C80814Vne> arrayList = this.LJLJI;
        C80814Vne c80814Vne2 = (C80814Vne) AnonymousClass028.LIZIZ(arrayList, 1, arrayList);
        if (c80814Vne.LIZIZ != 0) {
            f3 = c80814Vne.LJ * clientHeight;
            z = false;
        } else {
            z = true;
        }
        if (c80814Vne2.LIZIZ != this.LJLJJLL.getCount() - 1) {
            f4 = c80814Vne2.LJ * clientHeight;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollY < f3) {
            if (z) {
                this.LLILLIZIL.LIZ.onPull(Math.abs(f3 - scrollY) / clientHeight);
                z3 = true;
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z2) {
                this.LLILLJJLI.LIZ.onPull(Math.abs(scrollY - f4) / clientHeight);
                z3 = true;
            }
            scrollY = f4;
        }
        int i = (int) scrollY;
        this.LLII = (scrollY - i) + this.LLII;
        if (this.LJLILLLLZI) {
            scrollTo(getScrollX(), i);
            LJIIZILJ(i);
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00f9, code lost:
    
        if (r3 >= r17.LJLJI.size()) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00fb, code lost:
    
        r7 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0103, code lost:
    
        r7 = (X.C80814Vne) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0105, code lost:
    
        if (r6 <= r7.LIZIZ) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x010f, code lost:
    
        if (r3 >= (r17.LJLJI.size() - 1)) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0111, code lost:
    
        r3 = r3 + 1;
        r7 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x011e, code lost:
    
        if (r6 >= r7.LIZIZ) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0120, code lost:
    
        r1 = r1 + (r17.LJLJJLL.LJIILJJIL(r6) + r9);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x012b, code lost:
    
        r7.LJ = r1;
        r1 = r1 + (r7.LIZLLL + r9);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x021a, code lost:
    
        if (r7 <= r0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x021c, code lost:
    
        r6 = r17.LJLJI.size() - 1;
        r3 = r11.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0226, code lost:
    
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x022a, code lost:
    
        if (r7 < r8.LIZIZ) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x022c, code lost:
    
        if (r6 < 0) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x022e, code lost:
    
        r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0236, code lost:
    
        r1 = (X.C80814Vne) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0238, code lost:
    
        if (r7 >= r1.LIZIZ) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x023a, code lost:
    
        if (r6 <= 0) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x023c, code lost:
    
        r6 = r6 - 1;
        r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0249, code lost:
    
        if (r7 <= r1.LIZIZ) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x024b, code lost:
    
        r3 = r3 - (r17.LJLJJLL.LJIILJJIL(r7) + r9);
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0256, code lost:
    
        r3 = r3 - (r1.LIZLLL + r9);
        r1.LJ = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x025d, code lost:
    
        r7 = r17.LJLJI.size();
        r11 = r8.LJ;
        r1 = r8.LIZIZ;
        r12 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0269, code lost:
    
        if (r1 != 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x026b, code lost:
    
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x026c, code lost:
    
        r17.LJZ = r0;
        r6 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0272, code lost:
    
        if (r1 != r6) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0274, code lost:
    
        r0 = (r8.LIZLLL + r11) - 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0278, code lost:
    
        r17.LJZI = r0;
        r3 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x027c, code lost:
    
        if (r3 < 0) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x027e, code lost:
    
        r2 = (X.C80814Vne) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0286, code lost:
    
        r1 = r2.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0288, code lost:
    
        if (r12 <= r1) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x028a, code lost:
    
        r11 = r11 - (r17.LJLJJLL.LJIILJJIL(r12) + r9);
        r12 = r12 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0296, code lost:
    
        r11 = r11 - (r2.LIZLLL + r9);
        r2.LJ = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x029c, code lost:
    
        if (r1 != 0) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x029e, code lost:
    
        r17.LJZ = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02a0, code lost:
    
        r3 = r3 - 1;
        r12 = r12 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02ad, code lost:
    
        r3 = (r8.LJ + r8.LIZLLL) + r9;
        r11 = r8.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02b5, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02b7, code lost:
    
        if (r10 >= r7) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02b9, code lost:
    
        r2 = (X.C80814Vne) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02c1, code lost:
    
        r0 = r2.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02c3, code lost:
    
        if (r11 >= r0) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02c5, code lost:
    
        r3 = r3 + (r17.LJLJJLL.LJIILJJIL(r11) + r9);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02d1, code lost:
    
        if (r0 != r6) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02d3, code lost:
    
        r17.LJZI = (r2.LIZLLL + r3) - 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02d9, code lost:
    
        r2.LJ = r3;
        r3 = r3 + (r2.LIZLLL + r9);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x02a5, code lost:
    
        r0 = Float.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x02a9, code lost:
    
        r0 = -3.4028235E38f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0134, code lost:
    
        r9 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x01a4, code lost:
    
        if (r6 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x01a8, code lost:
    
        if (r14 != r6.LIZIZ) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x01aa, code lost:
    
        r15 = r15 + r6.LIZLLL;
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x01af, code lost:
    
        if (r13 < 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x01b1, code lost:
    
        r6 = (X.C80814Vne) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x01ba, code lost:
    
        r15 = r15 + LIZ(r14, r13 + 1).LIZLLL;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x01c5, code lost:
    
        if (r13 < 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x01c7, code lost:
    
        r6 = (X.C80814Vne) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r1 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x01f8, code lost:
    
        r1 = (getPaddingLeft() / r7) + (2.0f - r8.LIZLLL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0206, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0216, code lost:
    
        if (r8 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        r13 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        if (r13 < 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        r6 = (X.C80814Vne) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        r7 = getClientHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        if (r7 > 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        r14 = r17.LJLJL - 1;
        r15 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        if (r14 < 0) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (r15 < r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r14 >= r10) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (r6 != null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01d4, code lost:
    
        if (r14 != r6.LIZIZ) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d8, code lost:
    
        if (r6.LIZJ != false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01da, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.remove(r17.LJLJI, r13);
        r17.LJLJJLL.LJIIIZ(r14, r17, r6.LIZ);
        r13 = r13 - 1;
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ea, code lost:
    
        if (r13 < 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d0, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f4, code lost:
    
        r14 = r14 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ec, code lost:
    
        r6 = (X.C80814Vne) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        r3 = r8.LIZLLL;
        r10 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        if (r3 >= 2.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b1, code lost:
    
        if (r10 >= r17.LJLJI.size()) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b3, code lost:
    
        r13 = (X.C80814Vne) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bb, code lost:
    
        if (r7 > 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bd, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00be, code lost:
    
        r7 = r17.LJLJL + 1;
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c3, code lost:
    
        if (r7 >= r12) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c7, code lost:
    
        if (r3 < r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c9, code lost:
    
        if (r7 <= r9) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cb, code lost:
    
        if (r13 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0170, code lost:
    
        if (r7 != r13.LIZIZ) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0174, code lost:
    
        if (r13.LIZJ != false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0176, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.remove(r17.LJLJI, r6);
        r17.LJLJJLL.LJIIIZ(r7, r17, r13.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0188, code lost:
    
        if (r6 >= r17.LJLJI.size()) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016c, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0192, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018a, code lost:
    
        r13 = (X.C80814Vne) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0136, code lost:
    
        if (r13 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013a, code lost:
    
        if (r7 != r13.LIZIZ) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013c, code lost:
    
        r3 = r3 + r13.LIZLLL;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0147, code lost:
    
        if (r6 >= r17.LJLJI.size()) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0149, code lost:
    
        r13 = (X.C80814Vne) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0152, code lost:
    
        r0 = LIZ(r7, r6);
        r6 = r6 + 1;
        r3 = r3 + r0.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0161, code lost:
    
        if (r6 >= r17.LJLJI.size()) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0163, code lost:
    
        r13 = (X.C80814Vne) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLJI, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0196, code lost:
    
        r1 = (getPaddingRight() / r7) + 2.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a1, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00cd, code lost:
    
        r13 = r17.LJLJJLL.getCount();
        r1 = getClientHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00d7, code lost:
    
        if (r1 <= 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00d9, code lost:
    
        r9 = r17.LJLLL / r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00de, code lost:
    
        if (r11 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00e0, code lost:
    
        r7 = r11.LIZIZ;
        r0 = r8.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00e4, code lost:
    
        if (r7 >= r0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00e6, code lost:
    
        r1 = (r11.LJ + r11.LIZLLL) + r9;
        r6 = r7 + 1;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00f1, code lost:
    
        if (r6 > r8.LIZIZ) goto L217;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(int r18) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80797VnN.LJIJJ(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C80814Vne LJIIJJI;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (LJIIJJI = LJIIJJI(childAt)) != null && LJIIJJI.LIZIZ == this.LJLJL) {
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
        if ((layoutParams instanceof C80805VnV) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean LIZIZ;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            LIZIZ = LIZIZ(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            LIZIZ = LIZIZ(1);
                        }
                    }
                } else {
                    LIZIZ = LIZIZ(66);
                }
            } else {
                LIZIZ = LIZIZ(17);
            }
            if (LIZIZ) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C80814Vne LJIIJJI;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (LJIIJJI = LJIIJJI(childAt)) != null && LJIIJJI.LIZIZ == this.LJLJL && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        PagerAdapter pagerAdapter;
        try {
            super.draw(canvas);
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.LJLJJLL) != null && pagerAdapter.getCount() > 1)) {
                if (!this.LLILLIZIL.LIZ.isFinished()) {
                    int save = canvas.save();
                    int height = getHeight();
                    int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    canvas.translate(getPaddingLeft(), this.LJZ * height);
                    this.LLILLIZIL.LIZ.setSize(width, height);
                    z = this.LLILLIZIL.LIZ.draw(canvas);
                    canvas.restoreToCount(save);
                    if (!this.LLILLL) {
                        this.LLILLL = true;
                    }
                } else {
                    z = false;
                }
                if (!this.LLILLJJLI.LIZ.isFinished()) {
                    int save2 = canvas.save();
                    int height2 = getHeight();
                    int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    canvas.rotate(180.0f);
                    canvas.translate((-width2) - getPaddingLeft(), (-(this.LJZI + 1.0f)) * height2);
                    this.LLILLJJLI.LIZ.setSize(width2, height2);
                    z |= this.LLILLJJLI.LIZ.draw(canvas);
                    canvas.restoreToCount(save2);
                    if (!this.LLILZ) {
                        this.LLILZ = true;
                    }
                }
                if (z) {
                    C16300kU.LJIIJ(this);
                    return;
                }
            } else {
                this.LLILLIZIL.LIZ.finish();
                this.LLILLJJLI.LIZ.finish();
            }
            if (this.LLILLL) {
                this.LLILLL = false;
            }
            if (this.LLILZ) {
                this.LLILZ = false;
            }
        } catch (Throwable th) {
            C0NB.LJI("LiveVerticalViewPager", th);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C80805VnV(getContext(), attributeSet);
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
            C80814Vne c80814Vne = (C80814Vne) ListProtector.get(this.LJLJI, 0);
            float f3 = c80814Vne.LJ;
            int size = this.LJLJI.size();
            int i3 = ((C80814Vne) ListProtector.get(this.LJLJI, size - 1)).LIZIZ;
            for (int i4 = c80814Vne.LIZIZ; i4 < i3; i4++) {
                while (true) {
                    i = c80814Vne.LIZIZ;
                    if (i4 <= i || i2 >= size) {
                        break;
                    }
                    i2++;
                    c80814Vne = (C80814Vne) ListProtector.get(this.LJLJI, i2);
                }
                if (i4 == i) {
                    float f4 = c80814Vne.LJ;
                    float f5 = c80814Vne.LIZLLL;
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
        C80797VnN c80797VnN;
        if (!isEnabled()) {
            return false;
        }
        InterfaceC28613BKv interfaceC28613BKv = this.LLJILJIL;
        if (interfaceC28613BKv != null) {
            C28604BKm c28604BKm = (C28604BKm) interfaceC28613BKv;
            if (motionEvent.getAction() == 0) {
                c28604BKm.LIZ = motionEvent.getY();
                C80797VnN c80797VnN2 = c28604BKm.LIZIZ.LLF;
                if (c80797VnN2 != null) {
                    c80797VnN2.setCanFastSwipe(false);
                }
            } else if (motionEvent.getAction() == 2 && c28604BKm.LIZIZ.Al(motionEvent.getY() - c28604BKm.LIZ) && (c80797VnN = c28604BKm.LIZIZ.LLF) != null) {
                c80797VnN.requestDisallowInterceptTouchEvent(true);
                return false;
            }
        }
        try {
        } catch (IllegalArgumentException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (this.LLILIL) {
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
                if (action != 2) {
                    if (action == 6) {
                        LJIILL(motionEvent);
                    }
                } else {
                    int i = this.LLIIJI;
                    if (i != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        float y = motionEvent.getY(findPointerIndex);
                        float f2 = y - this.LLIIII;
                        float abs = Math.abs(f2);
                        float x = motionEvent.getX(findPointerIndex);
                        float abs2 = Math.abs(x - this.LLIIIILZ);
                        if (f2 != 0.0f) {
                            float f3 = this.LLIIII;
                            if ((f3 >= this.LLI || f2 <= 0.0f) && ((f3 <= getHeight() - this.LLI || f2 >= 0.0f) && LIZLLL(this, false, (int) f2, (int) x, (int) y))) {
                                this.LLII = x;
                                this.LLIIII = y;
                                this.LLFII = true;
                                return false;
                            }
                        }
                        float f4 = this.LLIFFJFJJ;
                        if (abs > f4 && abs > abs2 * this.LLIL) {
                            if (this.LLJIJIL) {
                                return false;
                            }
                            BVZ bvz = this.LLJI;
                            if (bvz != null && ((C28265B7l) bvz).LIZ(f2)) {
                                this.LLJIJIL = true;
                                return false;
                            }
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
                        } else if (abs2 > f4 && (!this.LLILII.booleanValue() || (this.LLILII.booleanValue() && abs <= abs2 * this.LLIL))) {
                            this.LLFII = true;
                        }
                        if (this.LLFFF && LJIJ(y)) {
                            C16300kU.LJIIJ(this);
                        }
                    }
                }
            } else {
                this.LLII = motionEvent.getX();
                this.LLIIIILZ = motionEvent.getX();
                this.LLIIII = motionEvent.getY();
                this.LLIIIJ = motionEvent.getY();
                this.LLIIJI = motionEvent.getPointerId(0);
                this.LLFII = false;
                this.LJLLILLLL = true;
                this.LJLLI.computeScrollOffset();
                if (this.LLJILLL == 2 && Math.abs(this.LJLLI.getFinalY() - this.LJLLI.getCurrY()) > this.LLIIZ) {
                    this.LJLLI.abortAnimation();
                    this.LLF = false;
                    LJIJI();
                    this.LLFFF = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    LJ(false);
                    this.LLFFF = false;
                    this.LLJIJIL = false;
                }
            }
            if (this.LLIIJLIL == null) {
                this.LLIIJLIL = VelocityTracker.obtain();
            }
            this.LLIIJLIL.addMovement(motionEvent);
            return this.LLFFF;
        }
        LJJ();
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof LiveVerticalViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        LiveVerticalViewPager$SavedState liveVerticalViewPager$SavedState = (LiveVerticalViewPager$SavedState) parcelable;
        super.onRestoreInstanceState(liveVerticalViewPager$SavedState.getSuperState());
        PagerAdapter pagerAdapter = this.LJLJJLL;
        if (pagerAdapter != null) {
            pagerAdapter.LJIJI(liveVerticalViewPager$SavedState.LJLILLLLZI, liveVerticalViewPager$SavedState.LJLJI);
            LJJIFFI(liveVerticalViewPager$SavedState.LJLIL, false, true, 0);
        } else {
            this.LJLJLJ = liveVerticalViewPager$SavedState.LJLIL;
            this.LJLJLLL = liveVerticalViewPager$SavedState.LJLILLLLZI;
            this.LJLL = liveVerticalViewPager$SavedState.LJLJI;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        boolean z;
        boolean z2;
        float f;
        C80797VnN c80797VnN;
        if (!isEnabled()) {
            return false;
        }
        InterfaceC28613BKv interfaceC28613BKv = this.LLJILJIL;
        if (interfaceC28613BKv != null) {
            C28604BKm c28604BKm = (C28604BKm) interfaceC28613BKv;
            if (c28604BKm.LIZIZ.Al(motionEvent.getY() - c28604BKm.LIZ)) {
                if (motionEvent.getAction() == 2) {
                    return false;
                }
                if (motionEvent.getAction() == 1 && (c80797VnN = c28604BKm.LIZIZ.LLF) != null) {
                    c80797VnN.setCanFastSwipe(true);
                }
            }
        }
        try {
        } catch (IllegalArgumentException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (this.LLILIL) {
            return true;
        }
        if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && (pagerAdapter = this.LJLJJLL) != null && pagerAdapter.getCount() != 0) {
            if (this.LLIIJLIL == null) {
                this.LLIIJLIL = VelocityTracker.obtain();
            }
            this.LLIIJLIL.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.LJLLI.abortAnimation();
                this.LLF = false;
                LJIJI();
                this.LLIIIILZ = motionEvent.getX();
                this.LLII = motionEvent.getX();
                this.LLIIII = motionEvent.getY();
                this.LLIIIJ = motionEvent.getY();
                this.LLIIJI = motionEvent.getPointerId(0);
            } else {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            if (action != 5) {
                                if (action == 6) {
                                    LJIILL(motionEvent);
                                    this.LLIIII = motionEvent.getY(motionEvent.findPointerIndex(this.LLIIJI));
                                }
                            } else {
                                int actionIndex = motionEvent.getActionIndex();
                                this.LLIIII = motionEvent.getY(actionIndex);
                                this.LLIIJI = motionEvent.getPointerId(actionIndex);
                            }
                        } else if (this.LLFFF) {
                            LJJI(this.LJLJL, true, 0, false);
                            z = LJJ();
                        }
                    } else {
                        if (!this.LLFFF) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.LLIIJI);
                            if (findPointerIndex == -1) {
                                z = LJJ();
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
                            z = false | LJIJ(motionEvent.getY(motionEvent.findPointerIndex(this.LLIIJI)));
                        }
                    }
                } else if (this.LLFFF) {
                    VelocityTracker velocityTracker = this.LLIIJLIL;
                    velocityTracker.computeCurrentVelocity(1000, this.LLIILII);
                    int yVelocity = (int) velocityTracker.getYVelocity(this.LLIIJI);
                    if (LiveLandscapeInnerFeedSetting.INSTANCE.isEnable() && this.LLIIIZ) {
                        yVelocity = 0;
                    }
                    this.LLF = true;
                    int clientHeight = getClientHeight();
                    int scrollY = getScrollY();
                    C80814Vne LJIIL = LJIIL();
                    float f3 = clientHeight;
                    int i = LJIIL.LIZIZ;
                    float f4 = ((scrollY / f3) - LJIIL.LJ) / (LJIIL.LIZLLL + (this.LJLLL / f3));
                    int y2 = (int) (motionEvent.getY(motionEvent.findPointerIndex(this.LLIIJI)) - this.LLIIIJ);
                    if (this.LLIIIL) {
                        int LJI = LJI(i, f4, yVelocity, y2);
                        if (Math.abs(LJI - this.LJLJL) > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        LJJIFFI(LJI, true, true, yVelocity);
                        LJIL(z2, yVelocity, f4, y2);
                    }
                    boolean LJJ = LJJ();
                    this.LLIIIL = true;
                    this.LLIIIZ = false;
                    z = LJJ;
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
                LLJJIJI.set(pagerAdapter2, null);
                this.LJLJJLL.LJJIFFI(this);
                for (int i = 0; i < this.LJLJI.size(); i++) {
                    C80814Vne c80814Vne = (C80814Vne) ListProtector.get(this.LJLJI, i);
                    this.LJLJJLL.LJIIIZ(c80814Vne.LIZIZ, this, c80814Vne.LIZ);
                }
                this.LJLJJLL.LJIIJJI(this);
                this.LJLJI.clear();
                int i2 = 0;
                while (i2 < getChildCount()) {
                    if (!((C80805VnV) getChildAt(i2).getLayoutParams()).LIZ) {
                        try {
                            if (C78996UzQ.LJJIIJZLJL(getChildAt(i2))) {
                                C78996UzQ.LJI();
                            }
                        } catch (Throwable unused) {
                        }
                        removeViewAt(i2);
                        i2--;
                    }
                    i2++;
                }
                this.LJLJL = 0;
                scrollTo(0, 0);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        this.LJLJJLL = pagerAdapter;
        if (pagerAdapter != null) {
            if (this.LJLLJ == null) {
                this.LJLLJ = new C80823Vnn(this);
            }
            try {
                LLJJIJI.set(this.LJLJJLL, this.LJLLJ);
                this.LLF = false;
                boolean z = this.LLILZIL;
                this.LLILZIL = true;
                this.LJLJJLL.getCount();
                if (this.LJLJLJ >= 0) {
                    this.LJLJJLL.LJIJI(this.LJLJLLL, this.LJLL);
                    LJJIFFI(this.LJLJLJ, false, true, 0);
                    this.LJLJLJ = -1;
                    this.LJLJLLL = null;
                    this.LJLL = null;
                    return;
                }
                if (!z) {
                    LJIJI();
                } else {
                    requestLayout();
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public void setCanFastSwipe(boolean z) {
        this.LLIIIZ = z;
    }

    public void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (this.LLJ == null) {
            try {
                this.LLJ = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e) {
                C0NB.LJFF("LiveVerticalViewPager", "Can't find setChildrenDrawingOrderEnabled", e);
            }
        }
        try {
            this.LLJ.invoke(this, Boolean.valueOf(z));
        } catch (Exception e2) {
            C0NB.LJFF("LiveVerticalViewPager", "Error changing children drawing order", e2);
        }
    }

    public void setCurrentItem(int i) {
        this.LLF = false;
        LJJIFFI(i, !this.LLILZIL, false, 0);
    }

    public void setCurrentItemWithDefaultVelocity(int i) {
        this.LLF = false;
        LJJIFFI(i, true, true, 1);
    }

    public void setIsCanChangePage(boolean z) {
        this.LLIIIL = z;
    }

    public void setLandscapeFeedSlideInterceptor(InterfaceC28613BKv interfaceC28613BKv) {
        this.LLJILJIL = interfaceC28613BKv;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Requested offscreen page limit ");
            LIZ.append(i);
            LIZ.append(" too small; defaulting to ");
            LIZ.append(1);
            C0NB.LJIIL("LiveVerticalViewPager", X1D.LIZIZ(LIZ));
            i = 1;
        }
        if (i != this.LLFF) {
            this.LLFF = i;
            LJIJI();
        }
    }

    public void setOnPageChangeListener(C0C3 c0c3) {
        this.LLIZLLLIL = c0c3;
    }

    public void setOnSlideInterceptor(BVZ bvz) {
        this.LLJI = bvz;
    }

    public void setPageMargin(int i) {
        int i2 = this.LJLLL;
        this.LJLLL = i;
        int height = getHeight();
        LJIJJLI(height, height, i, i2);
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
        if (this.LLJILLL == i) {
            return;
        }
        this.LLJILLL = i;
        C0C3 c0c3 = this.LLIZLLLIL;
        if (c0c3 != null) {
            c0c3.onPageScrollStateChanged(i);
        }
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

    public C80797VnN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = 1.0f;
        this.LJLILLLLZI = true;
        this.LJLJI = new ArrayList<>();
        this.LJLJJI = new C80814Vne();
        this.LJLJJL = new Rect();
        this.LJLJLJ = -1;
        this.LJLJLLL = null;
        this.LJLL = null;
        this.LJZ = -3.4028235E38f;
        this.LJZI = Float.MAX_VALUE;
        this.LLFF = 1;
        this.LLIIIL = true;
        this.LLIIIZ = false;
        this.LLIIJI = -1;
        this.LLIL = 2.0d;
        this.LLILII = Boolean.FALSE;
        this.LLILLL = false;
        this.LLILZ = false;
        this.LLILZIL = true;
        this.LLJIJIL = false;
        this.LLJILJILJ = new ARunnableS50S0100000_14(this, 9);
        this.LLJILLL = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.LJLLI = new Scroller(context2, LLJJIII);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.LLIFFJFJJ = viewConfiguration.getScaledPagingTouchSlop();
        LiveAdjustScrollConfigSetting liveAdjustScrollConfigSetting = LiveAdjustScrollConfigSetting.INSTANCE;
        this.LLIIL = (int) (liveAdjustScrollConfigSetting.getValue().getMinFlingVelocity() * f);
        this.LLIILII = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LLILLIZIL = new C57736MlI(context2, this, 0);
        this.LLILLJJLI = new C57736MlI(context2, this, 1);
        this.LLIILZL = (int) (liveAdjustScrollConfigSetting.getValue().getMinDistanceForFling() * f);
        this.LLIIZ = (int) (2.0f * f);
        this.LLFZ = (int) (f * 16.0f);
        LJJIIJ();
        h0.LJIJI(this, new C80799VnP(this));
        if (C16300kU.LIZJ(this) == 0) {
            C16300kU.LJIJ(this, 1);
        }
        C16360ka.LJIJJ(this, new C80312VfY(this, context2));
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() || ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLiveInhouse()) {
            setId(com.zhiliaoapp.musically.R.id.ncx);
        }
    }

    public final C80814Vne LIZ(int i, int i2) {
        C80814Vne c80814Vne = new C80814Vne();
        c80814Vne.LIZIZ = i;
        c80814Vne.LIZ = this.LJLJJLL.LJIILLIIL(i, this);
        c80814Vne.LIZLLL = this.LJLJJLL.LJIILJJIL(i);
        if (i2 < 0 || i2 >= this.LJLJI.size()) {
            this.LJLJI.add(c80814Vne);
        } else {
            ListProtector.add(this.LJLJI, i2, c80814Vne);
        }
        return c80814Vne;
    }

    public final Rect LJIIIZ(Rect rect, View view) {
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

    public final boolean LJIIJ(int i, int i2) {
        if (Math.abs((int) (i * this.LJLIL)) > this.LLIILZL && Math.abs(i2) > this.LLIIL && this.LJLIL >= 1.0d) {
            return true;
        }
        return false;
    }

    public final void LJJII(float f, boolean z) {
        this.LJLIL = Math.max(f, 0.5f);
        this.LJLILLLLZI = z;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return ((C80805VnV) ((View) ListProtector.get(null, i2)).getLayoutParams()).LJFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80797VnN.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C80814Vne LJIIJJI;
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
            if (childAt.getVisibility() == 0 && (LJIIJJI = LJIIJJI(childAt)) != null && LJIIJJI.LIZIZ == this.LJLJL && childAt.requestFocus(i, rect)) {
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
    public final void LJIILJJIL(int r10, float r11, int r12) {
        /*
            r9 = this;
            int r0 = r9.LLIZ
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
            X.VnV r1 = (X.C80805VnV) r1
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
            X.0C3 r0 = r9.LLIZLLLIL
            if (r0 == 0) goto L73
            r0.onPageScrolled(r10, r11, r12)
        L73:
            r0 = 1
            r9.LLILZLL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80797VnN.LJIILJJIL(int, float, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C80814Vne LJIIJJI;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (LJIIJJI = LJIIJJI(childAt)) != null && LJIIJJI.LIZIZ == this.LJLJL) {
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
        C80805VnV c80805VnV = (C80805VnV) layoutParams;
        boolean z = c80805VnV.LIZ;
        c80805VnV.LIZ = z;
        if (this.LL) {
            if (!z) {
                c80805VnV.LIZLLL = true;
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i, layoutParams);
    }

    public final int LJI(int i, float f, int i2, int i3) {
        if (LJIIJ(i3, i2)) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            float turnPageValue = LiveAdjustScrollConfigSetting.INSTANCE.getValue().getTurnPageValue();
            if (turnPageValue > 0.0f && turnPageValue < 1.0f) {
                if (i >= this.LJLJL) {
                    turnPageValue = 1.0f - turnPageValue;
                }
            } else if (i >= this.LJLJL) {
                turnPageValue = 0.6f;
            } else {
                turnPageValue = 0.4f;
            }
            i = (int) (i + f + turnPageValue);
        }
        if (this.LJLJI.size() > 0) {
            return Math.max(((C80814Vne) ListProtector.get(this.LJLJI, 0)).LIZIZ, Math.min(i, ((C80814Vne) ListProtector.get(this.LJLJI, r1.size() - 1)).LIZIZ));
        }
        return i;
    }

    public final void LJIJJLI(int i, int i2, int i3, int i4) {
        float f;
        if (i2 > 0 && !this.LJLJI.isEmpty()) {
            if (!this.LJLLI.isFinished()) {
                this.LJLLI.setFinalY(getCurrentItem() * getClientHeight());
                return;
            }
            scrollTo(getScrollX(), (int) ((getScrollY() / (((i2 - getPaddingTop()) - getPaddingBottom()) + i4)) * (((i - getPaddingTop()) - getPaddingBottom()) + i3)));
            return;
        }
        C80814Vne LJIILIIL = LJIILIIL(this.LJLJL);
        if (LJIILIIL != null) {
            f = Math.min(LJIILIIL.LJ, this.LJZI);
        } else {
            f = 0.0f;
        }
        int paddingTop = (int) (f * ((i - getPaddingTop()) - getPaddingBottom()));
        if (paddingTop == getScrollY()) {
            return;
        }
        LJ(false);
        scrollTo(getScrollX(), paddingTop);
    }

    public final void LJIL(boolean z, int i, float f, int i2) {
        Room room;
        C28246B6s c28246B6s = (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
        if (c28246B6s != null && (room = c28246B6s.LIZIZ) != null && c28246B6s.LJFF != null) {
            long id = room.getId();
            long longValue = c28246B6s.LIZJ.longValue();
            BJL bjl = c28246B6s.LJFF;
            C38995FSd.LIZJ().submit(new UFD(this, i2, i, id, longValue, bjl.LJ, bjl.LIZIZ, bjl.LIZ, f, z));
        }
    }

    public final void LJJI(int i, boolean z, int i2, boolean z2) {
        int i3;
        C0C3 c0c3;
        int scrollY;
        int abs;
        C0C3 c0c32;
        C80814Vne LJIILIIL = LJIILIIL(i);
        if (LJIILIIL != null) {
            i3 = (int) (Math.max(this.LJZ, Math.min(LJIILIIL.LJ, this.LJZI)) * getClientHeight());
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
                    LJ(false);
                    LJIJI();
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
            if (z2 && (c0c32 = this.LLIZLLLIL) != null) {
                c0c32.onPageSelected(i);
                return;
            }
            return;
        }
        if (z2 && (c0c3 = this.LLIZLLLIL) != null) {
            c0c3.onPageSelected(i);
        }
        LJ(false);
        scrollTo(0, i3);
        LJIIZILJ(i3);
    }

    public final void LJJIFFI(int i, boolean z, boolean z2, int i2) {
        C0C3 c0c3;
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
                ((C80814Vne) ListProtector.get(this.LJLJI, i5)).LIZJ = true;
            }
        }
        if (this.LJLJL != i) {
            z3 = true;
        }
        if (this.LLILZIL) {
            this.LJLJL = i;
            if (z3 && (c0c3 = this.LLIZLLLIL) != null) {
                c0c3.onPageSelected(i);
            }
            requestLayout();
            return;
        }
        LJIJJ(i);
        LJJI(i, z, i2, z3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            int i5 = this.LJLLL;
            LJIJJLI(i2, i4, i5, i5);
        }
    }

    public static boolean LIZLLL(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i3 + scrollY;
                if (i5 >= childAt.getTop() && i5 < childAt.getBottom() && (i4 = i2 + scrollX) >= childAt.getLeft() && i4 < childAt.getRight() && LIZLLL(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C80797VnN.onLayout(boolean, int, int, int, int):void");
    }
}
