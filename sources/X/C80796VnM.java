package X;

import Y.ARunnableS10S0101000_6;
import Y.ARunnableS2S0111000_14;
import Y.ARunnableS50S0100000_14;
import Y.IDComparatorS42S0000000_14;
import Y.IDRunnableS6S0101000;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.PathInterpolator;
import android.widget.Scroller;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager$SavedState;
import com.ss.android.ugc.aweme.feed.VideoViewCellRootView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import o3.h0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VnM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80796VnM extends AbstractC55113Lk5 implements InterfaceC80793VnJ {
    public static final int[] LLLIL = {R.attr.layout_gravity};
    public static final IDComparatorS42S0000000_14 LLLILZ = new IDComparatorS42S0000000_14(3);
    public static final InterpolatorC80821Vnl LLLILZJ = new InterpolatorC80821Vnl();
    public static final C80810Vna LLLILZLLLI = new C80810Vna();
    public static final Field LLLIZZ;
    public boolean LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public boolean LJLJJL;
    public InterfaceC80828Vns LJLJJLL;
    public final C57132Mb LJLJL;
    public C4VP LJLJLJ;
    public int LJLJLLL;
    public final ArrayList<C80815Vnf> LJLL;
    public final C80815Vnf LJLLI;
    public final Rect LJLLILLLL;
    public PagerAdapter LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public Parcelable LJLLLLLL;
    public ClassLoader LJLZ;
    public Scroller LJZ;
    public boolean LJZI;
    public C80809VnZ LJZL;
    public int LL;
    public Drawable LLD;
    public int LLF;
    public int LLFF;
    public float LLFFF;
    public float LLFII;
    public int LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public int LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public int LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public float LLIILII;
    public float LLIILZL;
    public float LLIIZ;
    public float LLIL;
    public long LLILII;
    public int LLILIL;
    public VelocityTracker LLILL;
    public int LLILLIZIL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public long LLILZLL;
    public C07Q LLIZ;
    public C07Q LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public final List<C0C3> LLJILJIL;
    public InterfaceC96833r5 LLJILJILJ;
    public InterfaceC778333r LLJILLL;
    public C0C4 LLJJ;
    public Method LLJJI;
    public final C80811Vnb LLJJIII;
    public final C80802VnS LLJJIJI;
    public int LLJJIJIIJIL;
    public ArrayList<View> LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public Handler LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C80770Vmw LLJLL;
    public final II5 LLJLLIL;
    public final II6 LLJLLL;
    public final II4 LLJZ;
    public float LLJZIJLIL;
    public boolean LLL;
    public final ARunnableS50S0100000_14 LLLF;
    public final Runnable LLLFF;
    public final Runnable LLLFFI;
    public int LLLFZ;
    public C4VQ LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public JSONObject LLLIIIIL;
    public boolean LLLIIIL;
    public int LLLIIL;
    public C80829Vnt LLLIILIL;

    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            LLLIZZ = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    public final void LJJIJIIJI() {
        boolean z;
        this.LLJJL = 1;
        LJJIIJZLJL(this.LJLLL, true);
        FN6.LIZJ(new ARunnableS50S0100000_14(this, 59));
        int i = C34947Dnb.LIZIZ;
        if (i == 1) {
            if (!FN6.LIZJ(this.LLLFF)) {
                this.LLJJL = 0;
                this.LLLFF.run();
                return;
            }
            return;
        }
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z || i == 3) {
            Message obtain = Message.obtain(getMainHander(), this.LLLFF);
            if (i == 3 && Build.VERSION.SDK_INT >= 22) {
                obtain.setAsynchronous(true);
            }
            getMainHander().sendMessage(obtain);
            return;
        }
        if (i == 4) {
            postOnAnimation(new IDRunnableS6S0101000(4, this, 1));
        } else {
            postOnAnimation(this.LLLFF);
        }
    }

    public final boolean LJJIJLIJ() {
        this.LLILIL = -1;
        this.LLIIIL = false;
        this.LLIIIZ = false;
        VelocityTracker velocityTracker = this.LLILL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.LLILL = null;
        }
        return this.LLIZ.LJI() | this.LLIZLLLIL.LJI();
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.LJZI = true;
        if (!this.LJZ.isFinished() && this.LJZ.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.LJZ.getCurrX();
            int currY = this.LJZ.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!LJJIII(currY)) {
                    this.LJZ.abortAnimation();
                    scrollTo(currX, 0);
                }
            }
            C16300kU.LJIIJ(this);
            return;
        }
        LJIILJJIL(true);
    }

    public void setOnAdapterChangeListener(VLC vlc) {
    }

    private Handler getMainHander() {
        if (this.LLJL == null) {
            this.LLJL = new Handler(C16880lQ.LLJJJJ());
        }
        return this.LLJL;
    }

    @Override // X.InterfaceC92113jT
    public final boolean LIZJ() {
        if (this.LLIIIL) {
            return false;
        }
        this.LLILZIL = true;
        setScrollState(1);
        this.LLIL = 0.0f;
        this.LLIILZL = 0.0f;
        VelocityTracker velocityTracker = this.LLILL;
        if (velocityTracker == null) {
            this.LLILL = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.LLILL.addMovement(obtain);
        obtain.recycle();
        this.LLILZLL = uptimeMillis;
        return true;
    }

    @Override // X.InterfaceC92113jT
    public final void LIZLLL() {
        if (this.LLILZIL) {
            this.LLILZIL = false;
            if (this.LJLLJ != null) {
                VelocityTracker velocityTracker = this.LLILL;
                velocityTracker.computeCurrentVelocity(1000, this.LLILLJJLI);
                int yVelocity = (int) velocityTracker.getYVelocity(this.LLILIL);
                this.LLIIIILZ = true;
                int clientHeight = getClientHeight();
                int scrollY = getScrollY();
                C80815Vnf LJIJI = LJIJI();
                if (LJIJI != null) {
                    LJJJI(LJIILLIIL(LJIJI.LIZIZ, ((scrollY / clientHeight) - LJIJI.LJ) / LJIJI.LIZLLL, yVelocity, (int) (this.LLIILZL - this.LLIL)), true, true, yVelocity);
                }
            }
            this.LLIIIL = false;
            this.LLIIIZ = false;
            VelocityTracker velocityTracker2 = this.LLILL;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.LLILL = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public final void LJIILL() {
        boolean z;
        PagerAdapter pagerAdapter = this.LJLLJ;
        if (pagerAdapter == null) {
            return;
        }
        int count = pagerAdapter.getCount();
        this.LJLJLLL = count;
        if (this.LJLL.size() < (this.LLIIIJ * 2) + 1 && this.LJLL.size() < count) {
            z = true;
        } else {
            z = false;
        }
        int i = this.LJLLL;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.LJLL.size()) {
            C80815Vnf c80815Vnf = (C80815Vnf) ListProtector.get(this.LJLL, i2);
            int LJIIL = this.LJLLJ.LJIIL(c80815Vnf.LIZ);
            StringBuilder LJ = C7MY.LJ("dataSetChanged newPos = ", LJIIL, " mItems.size() = ");
            LJ.append(this.LJLL.size());
            String LIZIZ = X1D.LIZIZ(LJ);
            if (C187857Yv.LIZ >= 2) {
                C36922EeM.LIZLLL(3, "FeedNotOnRenderFirstFrameLog", LIZIZ);
            }
            if (LJIIL != -1) {
                if (LJIIL == -2) {
                    ListProtector.remove(this.LJLL, i2);
                    i2--;
                    if (!z2) {
                        this.LJLLJ.LJJIFFI(this);
                        z2 = true;
                    }
                    this.LJLLJ.LJIIIZ(c80815Vnf.LIZIZ, this, c80815Vnf.LIZ);
                    int i3 = this.LJLLL;
                    if (i3 == c80815Vnf.LIZIZ) {
                        i = Math.max(0, Math.min(i3, (-1) + count));
                    }
                } else {
                    int i4 = c80815Vnf.LIZIZ;
                    if (i4 != LJIIL) {
                        if (i4 == this.LJLLL) {
                            i = LJIIL;
                        }
                        c80815Vnf.LIZIZ = LJIIL;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.LJLLJ.LJIIJJI(this);
        }
        Collections.sort(this.LJLL, LLLILZ);
        if (z) {
            if (this.LLJLIL) {
                this.LLJLILLLLZIIL = true;
                i = 0;
            }
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C80806VnW c80806VnW = (C80806VnW) getChildAt(i5).getLayoutParams();
                if (!c80806VnW.LIZ) {
                    c80806VnW.LIZJ = 0.0f;
                }
            }
            LJJJI(i, false, true, 0);
            requestLayout();
        }
    }

    public final void LJIJJLI() {
        this.LLJJJJLIIL = C34947Dnb.LIZ;
        if (C51919KZf.LIZ) {
            int i = C51917KZd.LIZ;
            if (i > 200) {
                i = 200;
            } else if (i < 30) {
                i = 30;
            }
            this.LLJJLIIIJLLLLLLLZ = i;
        }
        this.LJLIL = true;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        if (((Boolean) DTZ.LIZJ.getValue()).booleanValue()) {
            PathInterpolator LIZIZ = C18950ol.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f);
            o.LJIIIIZZ(LIZIZ, "create(\n        0.33f, 0.86f, 0.2f, 1f\n    )");
            this.LJZ = new Scroller(context, LIZIZ);
        } else {
            this.LJZ = new Scroller(context, LLLILZJ);
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.LLIIL = viewConfiguration.getScaledPagingTouchSlop();
        this.LJLJJI = viewConfiguration.getScaledTouchSlop();
        this.LLILLIZIL = (int) (400.0f * f);
        this.LLILLJJLI = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LLIZ = new C07Q(context);
        this.LLIZLLLIL = new C07Q(context);
        this.LLILLL = (int) (25.0f * f);
        this.LLILZ = (int) (2.0f * f);
        this.LLIIJI = (int) (f * 16.0f);
        h0.LJIJI(this, new C80800VnQ(this));
        if (C16300kU.LIZJ(this) == 0) {
            C16300kU.LJIJ(this, 1);
        }
        C16360ka.LJIJJ(this, new C80309VfV(this));
    }

    public final void LJJIIZ() {
        LJJIIJZLJL(this.LJLLL, false);
    }

    public final boolean LJJIIZI() {
        int count;
        int i;
        PagerAdapter pagerAdapter = this.LJLLJ;
        int i2 = 0;
        if (pagerAdapter == null || (count = pagerAdapter.getCount()) == 0 || (i = this.LJLLL) == count - 1) {
            return false;
        }
        int i3 = i + 1;
        C80815Vnf LJIJJ = LJIJJ(i3);
        if (LJIJJ != null && LJIJJ.LIZIZ == i3) {
            return false;
        }
        while (i2 < this.LJLL.size() && ((C80815Vnf) ListProtector.get(this.LJLL, i2)).LIZIZ < this.LJLLL) {
            i2++;
        }
        LJIIJ(i3, i2 + 1);
        if (this.LLLIIL == 2) {
            if (this.LLLIILIL == null) {
                this.LLLIILIL = new C80829Vnt();
            }
            this.LLLIILIL.LIZIZ = true;
        }
        return true;
    }

    public final void LJJIJIIJIL() {
        int i;
        PagerAdapter pagerAdapter = this.LJLLJ;
        if (pagerAdapter == null || pagerAdapter.getCount() == 0 || (i = this.LJLLL) == 0) {
            return;
        }
        int i2 = i - 1;
        C80815Vnf LJIJJ = LJIJJ(i2);
        if (LJIJJ != null && LJIJJ.LIZIZ == i2) {
            return;
        }
        int i3 = 0;
        while (i3 < this.LJLL.size() && ((C80815Vnf) ListProtector.get(this.LJLL, i3)).LIZIZ < this.LJLLL) {
            i3++;
        }
        LJIIJ(i2, i3);
        if (this.LLLIIL != 2) {
            return;
        }
        if (this.LLLIILIL == null) {
            this.LLLIILIL = new C80829Vnt();
        }
        this.LLLIILIL.LIZ = true;
    }

    public final void LJJJJI() {
        if (this.LLJJIJIIJIL != 0) {
            ArrayList<View> arrayList = this.LLJJIJIL;
            if (arrayList == null) {
                this.LLJJIJIL = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.LLJJIJIL.add(getChildAt(i));
            }
            Collections.sort(this.LLJJIJIL, LLLILZLLLI);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C80806VnW();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.LLLF);
        removeCallbacks(this.LLLFF);
        removeCallbacks(this.LLLFFI);
        Handler handler = this.LLJL;
        if (handler != null) {
            handler.removeCallbacks(this.LLLFF);
        }
        this.LLJJL = 0;
        Scroller scroller = this.LJZ;
        if (scroller != null && !scroller.isFinished()) {
            this.LJZ.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public final C80815Vnf LJIJI() {
        float f;
        float f2;
        int i;
        float LJIILJJIL;
        int clientHeight = getClientHeight();
        float f3 = 0.0f;
        if (clientHeight > 0) {
            f = getScrollY() / clientHeight;
            f2 = this.LL / clientHeight;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C80815Vnf c80815Vnf = null;
        float f4 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.LJLL.size()) {
            C80815Vnf c80815Vnf2 = (C80815Vnf) ListProtector.get(this.LJLL, i3);
            if (!z && c80815Vnf2.LIZIZ != (i = i2 + 1)) {
                c80815Vnf2 = this.LJLLI;
                c80815Vnf2.LJ = f3 + f4 + f2;
                c80815Vnf2.LIZIZ = i;
                PagerAdapter pagerAdapter = this.LJLLJ;
                if (pagerAdapter == null) {
                    LJIILJJIL = 1.0f;
                } else {
                    LJIILJJIL = pagerAdapter.LJIILJJIL(i);
                }
                c80815Vnf2.LIZLLL = LJIILJJIL;
                i3--;
            }
            f3 = c80815Vnf2.LJ;
            float f5 = c80815Vnf2.LIZLLL + f3 + f2;
            if (z || f >= f3) {
                if (f < f5 || i3 == this.LJLL.size() - 1) {
                    return c80815Vnf2;
                }
                i2 = c80815Vnf2.LIZIZ;
                f4 = c80815Vnf2.LIZLLL;
                i3++;
                z = false;
                c80815Vnf = c80815Vnf2;
            } else {
                return c80815Vnf;
            }
        }
        return c80815Vnf;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.LLD;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJ = true;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        VerticalViewPager$SavedState verticalViewPager$SavedState = new VerticalViewPager$SavedState(super.onSaveInstanceState());
        verticalViewPager$SavedState.LJLIL = this.LJLLL;
        PagerAdapter pagerAdapter = this.LJLLJ;
        if (pagerAdapter != null) {
            verticalViewPager$SavedState.LJLILLLLZI = pagerAdapter.LJIJJ();
        }
        return verticalViewPager$SavedState;
    }

    @Override // X.InterfaceC92113jT
    public final boolean LIZ() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC55113Lk5
    public final boolean LJIIIIZZ() {
        return this.LLLIIII;
    }

    @Override // X.AbstractC55114Lk6
    public PagerAdapter getAdapter() {
        return this.LJLLJ;
    }

    @Override // X.AbstractC55114Lk6
    public int getCurrentItem() {
        return this.LJLLL;
    }

    public int getExpectedAdapterCount() {
        return this.LJLJLLL;
    }

    public int getOffscreenPageLimit() {
        return this.LLIIIJ;
    }

    public int getPageMargin() {
        return this.LL;
    }

    public int getScrollState() {
        return this.LLLFZ;
    }

    public C80796VnM(Context context) {
        super(context);
        this.LJLILLLLZI = -1.0f;
        this.LJLJI = -1.0f;
        this.LJLJL = new C57132Mb(this);
        this.LJLL = new ArrayList<>();
        this.LJLLI = new C80815Vnf();
        this.LJLLILLLL = new Rect();
        this.LJLLLL = -1;
        this.LJLLLLLL = null;
        this.LJLZ = null;
        this.LLFFF = -3.4028235E38f;
        this.LLFII = Float.MAX_VALUE;
        this.LLIIII = false;
        this.LLIIIJ = 1;
        this.LLILIL = -1;
        this.LLJ = true;
        this.LLJILJIL = new CopyOnWriteArrayList();
        this.LLJJIII = new C80811Vnb(this);
        this.LLJJIJI = new C80802VnS(this);
        this.LLJJJ = 0;
        this.LLJJJIL = 600;
        this.LLJJJJ = false;
        this.LLJJJJJIL = false;
        this.LLJJJJLIIL = false;
        this.LLJJL = 0;
        this.LLJJLIIIJLLLLLLLZ = 100;
        this.LLJL = null;
        this.LLJLIL = false;
        this.LLJLILLLLZIIL = false;
        new ArrayList();
        this.LLJLL = new C80770Vmw(this);
        this.LLJLLIL = new II5(this);
        this.LLJLLL = new II6(this);
        this.LLJZ = new II4();
        this.LLJZIJLIL = 0.0f;
        this.LLL = true;
        this.LLLF = new ARunnableS50S0100000_14(this, 58);
        this.LLLFF = new ARunnableS10S0101000_6(3, this, 8);
        this.LLLFFI = new RunnableC51615KNn(2, this);
        this.LLLFZ = 0;
        this.LLLII = false;
        this.LLLIIII = false;
        this.LLLIIIIL = null;
        this.LLLIIIL = false;
        LJIJJLI();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.LLIFFJFJJ != z) {
            this.LLIFFJFJJ = z;
        }
    }

    @Override // X.InterfaceC80793VnJ
    public final View LIZIZ(int i) {
        return getChildAt(i);
    }

    @Override // X.InterfaceC80793VnJ
    public final boolean LJ(View view) {
        C80815Vnf LJIJ = LJIJ(view);
        if (LJIJ == null || LJIJ.LIZIZ == this.LJLLL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC92113jT
    public final void LJFF(float f) {
        if (this.LLILZIL) {
            if (this.LJLLJ == null) {
                return;
            }
            InterfaceC80828Vns interfaceC80828Vns = this.LJLJJLL;
            if (interfaceC80828Vns != null) {
                if (f < 0.0f) {
                    interfaceC80828Vns.LIZIZ();
                } else if (f > 0.0f) {
                    interfaceC80828Vns.LIZJ();
                }
            }
            try {
                this.LLIILZL += f;
                float scrollY = getScrollY() - f;
                float clientHeight = getClientHeight();
                float f2 = this.LLFFF * clientHeight;
                float f3 = this.LLFII * clientHeight;
                C80815Vnf c80815Vnf = (C80815Vnf) ListProtector.get(this.LJLL, 0);
                C80815Vnf c80815Vnf2 = (C80815Vnf) ListProtector.get(this.LJLL, r1.size() - 1);
                if (c80815Vnf.LIZIZ != 0) {
                    f2 = c80815Vnf.LJ * clientHeight;
                }
                if (c80815Vnf2.LIZIZ != this.LJLLJ.getCount() - 1) {
                    f3 = c80815Vnf2.LJ * clientHeight;
                }
                if (scrollY < f2) {
                    scrollY = f2;
                } else if (scrollY > f3) {
                    scrollY = f3;
                }
                int i = (int) scrollY;
                this.LLIILZL = (scrollY - i) + this.LLIILZL;
                scrollTo(getScrollX(), i);
                LJJIII(i);
                MotionEvent obtain = MotionEvent.obtain(this.LLILZLL, SystemClock.uptimeMillis(), 2, 0.0f, this.LLIILZL, 0);
                if (this.LLILL == null) {
                    this.LLILL = VelocityTracker.obtain();
                }
                VelocityTracker velocityTracker = this.LLILL;
                if (velocityTracker == null) {
                    return;
                }
                velocityTracker.addMovement(obtain);
                obtain.recycle();
                return;
            } catch (Exception e) {
                C36922EeM.LJFF(e);
                PEH.LIZLLL(e, "VerticalViewPager");
                return;
            }
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // X.AbstractC55114Lk6
    public final void LJI(C0C3 c0c3) {
        if (c0c3 == null) {
            return;
        }
        if (c0c3 instanceof InterfaceC57182Mg) {
            ListProtector.add(this.LLJILJIL, 0, c0c3);
        } else {
            this.LLJILJIL.add(c0c3);
        }
    }

    @Override // X.AbstractC55114Lk6
    public final void LJII(C0C3 c0c3) {
        List<C0C3> list = this.LLJILJIL;
        if (list != null) {
            list.remove(c0c3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJJI(int r7) {
        /*
            r6 = this;
            android.view.View r4 = r6.findFocus()
            r2 = 1
            r3 = 0
            if (r4 != r6) goto La0
        L8:
            r4 = 0
        L9:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r5 = r0.findNextFocus(r6, r4, r7)
            r1 = 130(0x82, float:1.82E-43)
            r0 = 33
            if (r5 == 0) goto L77
            if (r5 == r4) goto L77
            if (r7 != r0) goto L47
            android.graphics.Rect r0 = r6.LJLLILLLL
            android.graphics.Rect r0 = r6.LJIIZILJ(r0, r5)
            int r1 = r0.top
            android.graphics.Rect r0 = r6.LJLLILLLL
            android.graphics.Rect r0 = r6.LJIIZILJ(r0, r4)
            int r0 = r0.top
            if (r4 == 0) goto L42
            if (r1 < r0) goto L42
            int r0 = r6.LJLLL
            if (r0 <= 0) goto L9e
            int r0 = r0 - r2
            r6.LJJJ(r0, r2)
        L37:
            r3 = r2
        L38:
            if (r3 == 0) goto L41
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r0)
        L41:
            return r3
        L42:
            boolean r3 = r5.requestFocus()
            goto L38
        L47:
            if (r7 != r1) goto L41
            android.graphics.Rect r0 = r6.LJLLILLLL
            android.graphics.Rect r0 = r6.LJIIZILJ(r0, r5)
            int r1 = r0.bottom
            android.graphics.Rect r0 = r6.LJLLILLLL
            android.graphics.Rect r0 = r6.LJIIZILJ(r0, r4)
            int r0 = r0.bottom
            if (r4 == 0) goto L72
            if (r1 > r0) goto L72
            androidx.viewpager.widget.PagerAdapter r0 = r6.LJLLJ
            if (r0 == 0) goto L9e
            int r1 = r6.LJLLL
            int r0 = r0.getCount()
            int r0 = r0 - r2
            if (r1 >= r0) goto L9e
            int r0 = r6.LJLLL
            int r0 = r0 + 1
            r6.LJJJ(r0, r2)
            goto L37
        L72:
            boolean r3 = r5.requestFocus()
            goto L38
        L77:
            if (r7 == r0) goto L7b
            if (r7 != r2) goto L84
        L7b:
            int r0 = r6.LJLLL
            if (r0 <= 0) goto L9e
            int r0 = r0 - r2
            r6.LJJJ(r0, r2)
            goto L37
        L84:
            if (r7 == r1) goto L89
            r0 = 2
            if (r7 != r0) goto L41
        L89:
            androidx.viewpager.widget.PagerAdapter r0 = r6.LJLLJ
            if (r0 == 0) goto L9e
            int r1 = r6.LJLLL
            int r0 = r0.getCount()
            int r0 = r0 - r2
            if (r1 >= r0) goto L9e
            int r0 = r6.LJLLL
            int r0 = r0 + 1
            r6.LJJJ(r0, r2)
            goto L37
        L9e:
            r2 = 0
            goto L37
        La0:
            if (r4 == 0) goto L9
            android.view.ViewParent r1 = r4.getParent()
        La6:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lb3
            if (r1 != r6) goto Lae
            goto L9
        Lae:
            android.view.ViewParent r1 = r1.getParent()
            goto La6
        Lb3:
            java.lang.Class r0 = r4.getClass()
            X.C16880lQ.LJLLJ(r0)
            android.view.ViewParent r1 = r4.getParent()
        Lbe:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L8
            java.lang.Class r0 = r1.getClass()
            X.C16880lQ.LJLLJ(r0)
            android.view.ViewParent r1 = r1.getParent()
            goto Lbe
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80796VnM.LJIIJJI(int):boolean");
    }

    public final boolean LJIILIIL(int i) {
        C80815Vnf c80815Vnf;
        int i2;
        Object obj;
        C80802VnS c80802VnS = this.LLJJIJI;
        c80802VnS.getClass();
        if (!C2Q3.LIZ) {
            return false;
        }
        int i3 = 0;
        while (true) {
            if (i3 < c80802VnS.LIZJ.LJLL.size()) {
                if (((C80815Vnf) ListProtector.get(c80802VnS.LIZJ.LJLL, i3)).LIZIZ == i) {
                    c80815Vnf = (C80815Vnf) ListProtector.get(c80802VnS.LIZJ.LJLL, i3);
                    break;
                }
                i3++;
            } else {
                c80815Vnf = null;
                break;
            }
        }
        C80815Vnf c80815Vnf2 = c80802VnS.LIZ;
        if (c80815Vnf2 == null || c80815Vnf == null || (i2 = c80815Vnf2.LIZIZ) != i || c80815Vnf.LIZIZ != i2 || (obj = c80815Vnf.LIZ) != c80815Vnf2.LIZ || c80802VnS.LIZJ.LJLLJ.LJIIL(obj) != i) {
            return false;
        }
        return true;
    }

    public final void LJIILJJIL(boolean z) {
        boolean z2;
        if (this.LLLFZ == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.LJZ.isFinished()) {
                this.LJZ.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.LJZ.getCurrX();
                int currY = this.LJZ.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        LJJIII(currY);
                    }
                }
            } else if (this.LJZ.getCurrY() != getScrollY()) {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("realY:");
                    LIZ.append(getScrollY());
                    LIZ.append(",expectY:");
                    LIZ.append(this.LJZ.getCurrY());
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("try fix->");
                    LIZ2.append(LIZIZ);
                    C36922EeM.LIZLLL(5, "VerticalViewPager", X1D.LIZIZ(LIZ2));
                } catch (Exception e) {
                    PEH.LIZJ(e);
                    C36922EeM.LIZ(e);
                }
                scrollTo(this.LJZ.getCurrX(), this.LJZ.getCurrY());
            }
        } else {
            z2 = false;
        }
        this.LLIIIILZ = false;
        for (int i = 0; i < this.LJLL.size(); i++) {
            C80815Vnf c80815Vnf = (C80815Vnf) ListProtector.get(this.LJLL, i);
            if (c80815Vnf.LIZJ) {
                c80815Vnf.LIZJ = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                C16300kU.LJIIL(this, this.LLLF);
            } else {
                this.LLLF.run();
            }
        }
    }

    public final C80815Vnf LJIJ(View view) {
        for (int i = 0; i < this.LJLL.size(); i++) {
            C80815Vnf c80815Vnf = (C80815Vnf) ListProtector.get(this.LJLL, i);
            if (this.LJLLJ.LJIIZILJ(view, c80815Vnf.LIZ)) {
                return c80815Vnf;
            }
        }
        return null;
    }

    public final C80815Vnf LJIJJ(int i) {
        for (int i2 = 0; i2 < this.LJLL.size(); i2++) {
            C80815Vnf c80815Vnf = (C80815Vnf) ListProtector.get(this.LJLL, i2);
            if (c80815Vnf.LIZIZ == i) {
                return c80815Vnf;
            }
        }
        return null;
    }

    public final boolean LJJ(int i) {
        int i2 = this.LLLIIL;
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            if (this.LLLIILIL == null) {
                return true;
            }
            if (i < 0) {
                return !r0.LIZ;
            }
            if (i > 0) {
                return !r0.LIZIZ;
            }
            return false;
        }
        return false;
    }

    public final void LJJII(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LLILIL) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LLIILZL = motionEvent.getY(i);
            this.LLILIL = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.LLILL;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean LJJIII(int i) {
        if (this.LJLL.size() == 0) {
            if (this.LLJ) {
                return false;
            }
            this.LLJI = false;
            LJJIFFI(0, 0.0f, 0);
            if (this.LLJI) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C80815Vnf LJIJI = LJIJI();
        int clientHeight = getClientHeight();
        int i2 = this.LL;
        int i3 = clientHeight + i2;
        float f = i2;
        float f2 = clientHeight;
        int i4 = LJIJI.LIZIZ;
        float f3 = ((i / f2) - LJIJI.LJ) / (LJIJI.LIZLLL + (f / f2));
        this.LLJI = false;
        LJJIFFI(i4, f3, (int) (i3 * f3));
        if (this.LLJI) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean LJJIIJ(float f) {
        boolean z;
        boolean z2;
        float f2 = this.LLIILZL - f;
        this.LLIILZL = f;
        float scrollY = getScrollY() + f2;
        float clientHeight = getClientHeight();
        float f3 = this.LLFFF * clientHeight;
        float f4 = this.LLFII * clientHeight;
        boolean z3 = false;
        if (this.LJLL.size() <= 0) {
            return false;
        }
        C80815Vnf c80815Vnf = (C80815Vnf) ListProtector.get(this.LJLL, 0);
        ArrayList<C80815Vnf> arrayList = this.LJLL;
        C80815Vnf c80815Vnf2 = (C80815Vnf) AnonymousClass028.LIZIZ(arrayList, 1, arrayList);
        if (c80815Vnf.LIZIZ != 0) {
            f3 = c80815Vnf.LJ * clientHeight;
            z = false;
        } else {
            z = true;
        }
        if (c80815Vnf2.LIZIZ != this.LJLLJ.getCount() - 1) {
            f4 = c80815Vnf2.LJ * clientHeight;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollY < f3) {
            if (z) {
                this.LLIZ.LJ(Math.abs(f3 - scrollY) / clientHeight);
                z3 = true;
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z2) {
                this.LLIZLLLIL.LJ(Math.abs(scrollY - f4) / clientHeight);
                z3 = true;
            }
            scrollY = f4;
        }
        int i = (int) scrollY;
        this.LLIILII = (scrollY - i) + this.LLIILII;
        scrollTo(getScrollX(), i);
        LJJIII(i);
        return z3;
    }

    public final void LJJIJ(float f) {
        int i = this.LLLIIL;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (f < 0.0f) {
                C80829Vnt c80829Vnt = this.LLLIILIL;
                if (c80829Vnt != null && c80829Vnt.LIZIZ) {
                    return;
                }
                LJJIIZI();
                return;
            }
            if (f <= 0.0f) {
                return;
            }
            C80829Vnt c80829Vnt2 = this.LLLIILIL;
            if (c80829Vnt2 != null && c80829Vnt2.LIZ) {
                return;
            }
            LJJIJIIJIL();
            return;
        }
        if (f < 0.0f) {
            LJJIIZI();
        } else {
            if (f <= 0.0f) {
                return;
            }
            LJJIJIIJIL();
        }
    }

    public final void LJJIJL(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C80815Vnf LJIJ;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (LJIJ = LJIJ(childAt)) != null && LJIJ.LIZIZ == this.LJLLL) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        int count;
        if (this.LJLLJ == null) {
            return false;
        }
        InterfaceC80828Vns interfaceC80828Vns = this.LJLJJLL;
        if (interfaceC80828Vns != null && interfaceC80828Vns.LIZ()) {
            if (i < 0) {
                this.LJLJJLL.LIZJ();
            } else if (i > 0) {
                this.LJLJJLL.LIZIZ();
            }
        }
        if (LJJ(i)) {
            if (i < 0) {
                if (this.LJLLL <= 0) {
                    return false;
                }
                return true;
            }
            PagerAdapter pagerAdapter = this.LJLLJ;
            if (pagerAdapter == null) {
                count = 0;
            } else {
                count = pagerAdapter.getCount();
            }
            if (this.LJLLL >= count - 1) {
                return false;
            }
            return true;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i < 0) {
            if (scrollY <= ((int) (clientHeight * this.LLFFF))) {
                return false;
            }
            return true;
        }
        if (i <= 0 || scrollY >= ((int) (clientHeight * this.LLFII))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C80806VnW) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.LLJLL.LIZIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean LJIIJJI;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            LJIIJJI = LJIIJJI(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            LJIIJJI = LJIIJJI(1);
                        }
                    }
                } else {
                    LJIIJJI = LJIIJJI(66);
                }
            } else {
                LJIIJJI = LJIIJJI(17);
            }
            if (LJIIJJI) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C80815Vnf LJIJ;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (LJIJ = LJIJ(childAt)) != null && LJIJ.LIZIZ == this.LJLLL && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x004d, code lost:
    
        if (r7 != 3) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9 A[LOOP:0: B:16:0x00c7->B:17:0x00c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2 A[LOOP:1: B:20:0x00e0->B:21:0x00e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0117  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80796VnM.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        try {
            super.draw(canvas);
        } catch (Exception e) {
            C36922EeM.LJFF(e);
            PEH.LIZLLL(e, "VerticalViewPager");
        }
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.LJLLJ) != null && pagerAdapter.getCount() > 1)) {
            C07Q c07q = this.LLIZ;
            if (c07q != null && !c07q.LIZLLL()) {
                int save = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate(getPaddingLeft(), this.LLFFF * height);
                this.LLIZ.LJII(width, height);
                z = false | this.LLIZ.LIZ(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.LLIZLLLIL.LIZLLL()) {
                int save2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((-width2) - getPaddingLeft(), (-(this.LLFII + 1.0f)) * height2);
                this.LLIZLLLIL.LJII(width2, height2);
                z |= this.LLIZLLLIL.LIZ(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                C16300kU.LJIIJ(this);
                return;
            }
            return;
        }
        C07Q c07q2 = this.LLIZ;
        if (c07q2 != null) {
            c07q2.LIZIZ();
        }
        C07Q c07q3 = this.LLIZLLLIL;
        if (c07q3 == null) {
            return;
        }
        c07q3.LIZIZ();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C80806VnW(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.LL > 0 && this.LLD != null && this.LJLL.size() > 0 && this.LJLLJ != null) {
            int scrollY = getScrollY();
            float height = getHeight();
            float f2 = this.LL / height;
            int i2 = 0;
            C80815Vnf c80815Vnf = (C80815Vnf) ListProtector.get(this.LJLL, 0);
            float f3 = c80815Vnf.LJ;
            int size = this.LJLL.size();
            int i3 = ((C80815Vnf) ListProtector.get(this.LJLL, size - 1)).LIZIZ;
            for (int i4 = c80815Vnf.LIZIZ; i4 < i3; i4++) {
                while (true) {
                    i = c80815Vnf.LIZIZ;
                    if (i4 <= i || i2 >= size) {
                        break;
                    }
                    i2++;
                    c80815Vnf = (C80815Vnf) ListProtector.get(this.LJLL, i2);
                }
                if (i4 == i) {
                    float f4 = c80815Vnf.LJ;
                    float f5 = c80815Vnf.LIZLLL;
                    f = (f4 + f5) * height;
                    f3 = f4 + f5 + f2;
                } else {
                    float LJIILJJIL = this.LJLLJ.LJIILJJIL(i4);
                    f = (f3 + LJIILJJIL) * height;
                    f3 = LJIILJJIL + f2 + f3;
                }
                int i5 = this.LL;
                if (i5 + f > scrollY) {
                    this.LLD.setBounds(this.LLF, (int) f, this.LLFF, (int) (i5 + f + 0.5f));
                    this.LLD.draw(canvas);
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
        if (this.LLLIIII) {
            return false;
        }
        try {
        } catch (IllegalArgumentException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (this.LLILZIL) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.LLIIIL) {
                    return true;
                }
                if (this.LLIIIZ) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        LJJII(motionEvent);
                    }
                } else {
                    int i = this.LLILIL;
                    if (i != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        float y = motionEvent.getY(findPointerIndex);
                        float f2 = y - this.LLIILZL;
                        float abs = Math.abs(f2);
                        float x = motionEvent.getX(findPointerIndex);
                        float abs2 = Math.abs(x - this.LLIIZ);
                        if (f2 != 0.0f) {
                            float f3 = this.LLIILZL;
                            if ((f3 >= this.LLIIJLIL || f2 <= 0.0f) && ((f3 <= getHeight() - this.LLIIJLIL || f2 >= 0.0f) && LJIIL(this, false, (int) f2, (int) x, (int) y))) {
                                this.LLIILII = x;
                                this.LLIILZL = y;
                                this.LLIIIZ = true;
                                return false;
                            }
                        }
                        float f4 = this.LLJZIJLIL;
                        if (f4 <= 0.0f) {
                            f4 = 1.0f;
                        }
                        int i2 = this.LLIIL;
                        if (abs > i2 && abs * f4 > abs2) {
                            this.LLIIIL = true;
                            LJJIJ(f2);
                            LJJIJL(true);
                            setScrollState(1);
                            if (f2 > 0.0f) {
                                f = this.LLIL + this.LLIIL;
                            } else {
                                f = this.LLIL - this.LLIIL;
                            }
                            this.LLIILZL = f;
                            this.LLIILII = x;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > i2) {
                            this.LLIIIZ = true;
                        }
                        if (this.LLIIIL && LJJIIJ(y)) {
                            C16300kU.LJIIJ(this);
                        }
                    }
                }
            } else {
                this.LLIILII = motionEvent.getX();
                this.LLIIZ = motionEvent.getX();
                motionEvent.getRawX();
                this.LLIILZL = motionEvent.getY();
                this.LLIL = motionEvent.getY();
                motionEvent.getY();
                this.LLILIL = motionEvent.getPointerId(0);
                this.LLIIIZ = false;
                if (this.LLLIIIL && C48622J6k.LIZIZ) {
                    this.LLILII = System.currentTimeMillis();
                }
                this.LJZI = true;
                this.LJZ.computeScrollOffset();
                if (this.LLLFZ == 2 && Math.abs(this.LJZ.getFinalY() - this.LJZ.getCurrY()) > this.LLILZ) {
                    this.LJZ.abortAnimation();
                    this.LLIIIILZ = false;
                    LJJIIZ();
                    this.LLIIIL = true;
                    LJJIJL(true);
                    setScrollState(1);
                } else {
                    LJIILJJIL(false);
                    this.LLIIIL = false;
                }
            }
            if (this.LLILL == null) {
                this.LLILL = VelocityTracker.obtain();
            }
            this.LLILL.addMovement(motionEvent);
            return this.LLIIIL;
        }
        LJJIJLIJ();
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
        PagerAdapter pagerAdapter = this.LJLLJ;
        if (pagerAdapter != null) {
            pagerAdapter.LJIJI(verticalViewPager$SavedState.LJLILLLLZI, verticalViewPager$SavedState.LJLJI);
            LJJJI(verticalViewPager$SavedState.LJLIL, false, true, 0);
        } else {
            this.LJLLLL = verticalViewPager$SavedState.LJLIL;
            this.LJLLLLLL = verticalViewPager$SavedState.LJLILLLLZI;
            this.LJLZ = verticalViewPager$SavedState.LJLJI;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        boolean LJJIJLIJ;
        C4VQ c4vq;
        int i;
        int i2;
        float f;
        int i3;
        float f2;
        if (this.LLLIIII) {
            return false;
        }
        try {
        } catch (IllegalArgumentException e) {
            PEH.LIZJ(e);
            C36922EeM.LIZ(e);
        } catch (IllegalStateException e2) {
            if (this.LJLLJ.getCount() != this.LJLJLLL) {
                this.LJLLJ.notifyDataSetChanged();
            }
            PEH.LIZJ(e2);
            C36922EeM.LIZ(e2);
        }
        if (this.LLILZIL) {
            return true;
        }
        if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && (pagerAdapter = this.LJLLJ) != null && pagerAdapter.getCount() != 0) {
            if (this.LLILL == null) {
                this.LLILL = VelocityTracker.obtain();
            }
            this.LLILL.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            if (action != 5) {
                                if (action == 6) {
                                    LJJII(motionEvent);
                                    this.LLIILZL = motionEvent.getY(motionEvent.findPointerIndex(this.LLILIL));
                                }
                            } else {
                                int actionIndex = motionEvent.getActionIndex();
                                this.LLIILZL = motionEvent.getY(actionIndex);
                                this.LLILIL = motionEvent.getPointerId(actionIndex);
                            }
                        } else if (this.LLIIIL) {
                            LJJIZ(this.LJLLL, true, 0, false);
                            LJJIJLIJ = LJJIJLIJ();
                        }
                    } else {
                        C4VQ c4vq2 = this.LLLI;
                        if (c4vq2 != null && ((OBN) c4vq2).LIZIZ(true)) {
                            return false;
                        }
                        if (!this.LLIIIL) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.LLILIL);
                            if (findPointerIndex == -1) {
                                LJJIJLIJ = LJJIJLIJ();
                            } else {
                                float y = motionEvent.getY(findPointerIndex);
                                float f3 = y - this.LLIILZL;
                                float abs = Math.abs(f3);
                                float x = motionEvent.getX(findPointerIndex);
                                float abs2 = Math.abs(x - this.LLIILII);
                                float f4 = this.LLJZIJLIL;
                                if (f4 <= 0.0f) {
                                    f4 = 1.0f;
                                }
                                if (abs > this.LLIIL && abs * f4 > abs2) {
                                    this.LLIIIL = true;
                                    LJJIJ(f3);
                                    LJJIJL(true);
                                    float f5 = this.LLIL;
                                    if (y - f5 > 0.0f) {
                                        f2 = f5 + this.LLIIL;
                                    } else {
                                        f2 = f5 - this.LLIIL;
                                    }
                                    this.LLIILZL = f2;
                                    this.LLIILII = x;
                                    setScrollState(1);
                                    setScrollingCacheEnabled(true);
                                    ViewParent parent = getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            }
                        }
                        if (this.LLIIIL) {
                            float y2 = motionEvent.getY(motionEvent.findPointerIndex(this.LLILIL));
                            if (this.LLIIII) {
                                float f6 = this.LLIL;
                                if (y2 - f6 > 0.0f) {
                                    f = f6 + this.LLIIL;
                                } else {
                                    f = f6 - this.LLIIL;
                                }
                                if (y2 - f > this.LLIIL && (i3 = this.LJLLL) != 0) {
                                    this.LLJILLL.LIZ(i3);
                                }
                            }
                            LJJIJLIJ = false | LJJIIJ(y2);
                        }
                    }
                } else if (this.LLIIIL) {
                    VelocityTracker velocityTracker = this.LLILL;
                    velocityTracker.computeCurrentVelocity(1000, this.LLILLJJLI);
                    int yVelocity = (int) velocityTracker.getYVelocity(this.LLILIL);
                    this.LLIIIILZ = true;
                    int clientHeight = getClientHeight();
                    int scrollY = getScrollY();
                    C80815Vnf LJIJI = LJIJI();
                    if (LJIJI != null) {
                        float f7 = clientHeight;
                        int i4 = LJIJI.LIZIZ;
                        float f8 = ((scrollY / f7) - LJIJI.LJ) / (LJIJI.LIZLLL + (this.LL / f7));
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.LLILIL);
                        float y3 = motionEvent.getY(findPointerIndex2);
                        int LJIILLIIL = LJIILLIIL(i4, f8, yVelocity, (int) (y3 - this.LLIL));
                        if (this.LLLI != null) {
                            boolean LIZLLL = C61780OMm.LIZLLL();
                            boolean z = !OMU.LIZ.isEmpty();
                            if ((LIZLLL || z) && LJIILLIIL != (i2 = this.LJLLL)) {
                                LJIILLIIL = ((OBN) this.LLLI).LIZLLL(LJIILLIIL, i2, i4, yVelocity);
                            }
                        }
                        C4VQ c4vq3 = this.LLLI;
                        if (c4vq3 != null && C63081OpJ.LLFZ(((OBN) c4vq3).LIZ.getCurrentAweme()) && LJIILLIIL != (i = this.LJLLL)) {
                            LJIILLIIL = ((OBN) this.LLLI).LIZJ(LJIILLIIL, i, yVelocity);
                        }
                        C4VQ c4vq4 = this.LLLI;
                        if (c4vq4 != null && ((OBN) c4vq4).LIZIZ(false)) {
                            LJIILLIIL = i4;
                        }
                        if (LJIILLIIL > i4 && (c4vq = this.LLLI) != null) {
                            ((OBN) c4vq).LIZ();
                        }
                        if (this.LLLIIIL && (C48622J6k.LIZIZ || LPO.LIZ())) {
                            LJJJIL(this.LLIIZ, this.LLIL, motionEvent.getX(findPointerIndex2), y3, this.LLILII, System.currentTimeMillis());
                        }
                        LJJJI(LJIILLIIL, true, true, yVelocity);
                    }
                    LJJIJLIJ = LJJIJLIJ();
                }
                if (LJJIJLIJ) {
                    C16300kU.LJIIJ(this);
                }
            } else {
                this.LJZ.abortAnimation();
                this.LLIIIILZ = false;
                LJJIIZ();
                this.LLIILII = motionEvent.getX();
                this.LLIIZ = motionEvent.getX();
                this.LLIILZL = motionEvent.getY();
                this.LLIL = motionEvent.getY();
                this.LLILIL = motionEvent.getPointerId(0);
                if (this.LLLIIIL && C48622J6k.LIZIZ) {
                    this.LLILII = System.currentTimeMillis();
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.LLI) {
            if (C78996UzQ.LJJIIJZLJL(view)) {
                C78996UzQ.LJI();
            }
            removeViewInLayout(view);
            return;
        }
        super.removeView(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.LJLJJL = z;
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.LJLLJ;
        if (pagerAdapter2 != null) {
            try {
                Field field = LLLIZZ;
                if (field != null) {
                    field.set(pagerAdapter2, null);
                }
            } catch (IllegalAccessException unused) {
            }
            this.LJLLJ.LJJIFFI(this);
            for (int i = 0; i < this.LJLL.size(); i++) {
                C80815Vnf c80815Vnf = (C80815Vnf) ListProtector.get(this.LJLL, i);
                this.LJLLJ.LJIIIZ(c80815Vnf.LIZIZ, this, c80815Vnf.LIZ);
            }
            this.LJLLJ.LJIIJJI(this);
            this.LJLL.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C80806VnW) getChildAt(i2).getLayoutParams()).LIZ) {
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
            this.LJLLL = 0;
            scrollTo(0, 0);
        }
        this.LJLLJ = pagerAdapter;
        this.LJLJLLL = 0;
        if (pagerAdapter != null) {
            if (this.LJZL == null) {
                this.LJZL = new C80809VnZ(this);
            }
            PagerAdapter pagerAdapter3 = this.LJLLJ;
            C80809VnZ c80809VnZ = this.LJZL;
            try {
                Field field2 = LLLIZZ;
                if (field2 != null) {
                    field2.set(pagerAdapter3, c80809VnZ);
                }
            } catch (IllegalAccessException unused3) {
            }
            this.LLIIIILZ = false;
            boolean z = this.LLJ;
            this.LLJ = true;
            this.LJLJLLL = this.LJLLJ.getCount();
            if (this.LJLLLL >= 0) {
                this.LJLLJ.LJIJI(this.LJLLLLLL, this.LJLZ);
                LJJJI(this.LJLLLL, false, true, 0);
                this.LJLLLL = -1;
                this.LJLLLLLL = null;
                this.LJLZ = null;
                return;
            }
            if (!z) {
                LJJIIZ();
            } else {
                requestLayout();
            }
        }
    }

    public void setCanTouch(boolean z) {
        this.LJLIL = z;
    }

    public void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (this.LLJJI == null) {
            try {
                this.LLJJI = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
        }
        try {
            this.LLJJI.invoke(this, Boolean.valueOf(z));
        } catch (Exception unused2) {
        }
    }

    public void setCurrentItem(int i) {
        this.LLIIIILZ = false;
        LJJJI(i, !this.LLJ, false, 0);
    }

    public void setCurrentItemWithDefaultVelocity(int i) {
        this.LLIIIILZ = false;
        LJJJI(i, true, true, 1);
    }

    public void setDisableScroll(boolean z) {
        this.LLLIIII = z;
    }

    public void setEnableRefreshOpt(boolean z) {
        this.LLJLIL = z;
    }

    public void setEndScrollDelayTime(int i) {
        this.LLJJJ = i;
    }

    public void setFixDispatchFirstSelected(boolean z) {
        this.LLJJIII.LIZ = z;
    }

    public void setIsChangingTrending(boolean z) {
        this.LLJJJJJIL = z;
    }

    public void setIsDownGradeViewOpt1Open(boolean z) {
        this.LLIIII = z;
    }

    public void setIsTriggerByAutoPlay(boolean z) {
        this.LLJJJJ = z;
    }

    public void setMaxSettleDuration(int i) {
        this.LLJJJIL = i;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.LLIIIJ) {
            this.LLIIIJ = i;
            LJJIIZ();
        }
    }

    public void setOffscreenPageLimitEnableOpt(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.LLIIIJ) {
            this.LLIIIJ = i;
            LJJIIJZLJL(this.LJLLL, true);
        }
    }

    public void setOnPageSelectedInvokeListener(C4VP c4vp) {
        this.LJLJLJ = c4vp;
    }

    public void setOnUserSwipeUpListener(C4VQ c4vq) {
        this.LLLI = c4vq;
    }

    public void setPageMargin(int i) {
        int i2 = this.LL;
        this.LL = i;
        int height = getHeight();
        LJJIJIL(height, height, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.LLD = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setPopulateType(int i) {
        if (i != this.LLLIIL && i >= 0 && i <= 2) {
            this.LLLIIL = i;
        }
    }

    public void setPreDispatchTouchCallback(InterfaceC80828Vns interfaceC80828Vns) {
        this.LJLJJLL = interfaceC80828Vns;
    }

    public void setScrollState(int i) {
        boolean z;
        int i2;
        if (this.LLLFZ == i) {
            return;
        }
        this.LLLFZ = i;
        if (this.LLJJ != null) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (z) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
                getChildAt(i3).setLayerType(i2, null);
            }
        }
        List<C0C3> list = this.LLJILJIL;
        if (list != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.LLJILJIL).iterator();
            while (it.hasNext()) {
                ((C0C3) it.next()).onPageScrollStateChanged(i);
            }
        }
        if (i == 0) {
            if (((Boolean) C2LQ.LIZ.getValue()).booleanValue() || C46284IEm.LIZ() || C2302691y.LIZ()) {
                C2KO LIZIZ = C2KN.LIZIZ("task_type_feed_on_idle");
                synchronized (LIZIZ) {
                    Iterator<C56162Ii> it2 = LIZIZ.LIZ.iterator();
                    while (it2.hasNext()) {
                        C56162Ii pendingTask = it2.next();
                        o.LJIIIIZZ(pendingTask, "pendingTask");
                        LIZIZ.LIZ(pendingTask);
                    }
                    LIZIZ.LIZ.clear();
                    LIZIZ.LIZJ = false;
                }
            }
        } else {
            if (i == 1) {
                C80770Vmw c80770Vmw = this.LLJLL;
                if (c80770Vmw.LIZ()) {
                    c80770Vmw.LJFF();
                    return;
                }
                return;
            }
            if (i != 0) {
                return;
            }
        }
        C80770Vmw c80770Vmw2 = this.LLJLL;
        if (!c80770Vmw2.LIZ()) {
            return;
        }
        if (c80770Vmw2.LJII != VIQ.NOT_OPT) {
            return;
        }
        c80770Vmw2.LJII = VIQ.WAIT_OPT;
    }

    public void setScroller(Scroller scroller) {
        this.LJZ = scroller;
    }

    public void setSlideAngle(int i) {
        if (i <= 0) {
            this.LLJZIJLIL = 0.0f;
            return;
        }
        this.LLJZIJLIL = (float) (((float) Math.cos(Math.toRadians(r5))) / Math.sin(Math.toRadians(i)));
    }

    public void setmCurItem(int i) {
        this.LJLLL = i;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.LLD) {
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

    public C80796VnM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLILLLLZI = -1.0f;
        this.LJLJI = -1.0f;
        this.LJLJL = new C57132Mb(this);
        this.LJLL = new ArrayList<>();
        this.LJLLI = new C80815Vnf();
        this.LJLLILLLL = new Rect();
        this.LJLLLL = -1;
        this.LJLLLLLL = null;
        this.LJLZ = null;
        this.LLFFF = -3.4028235E38f;
        this.LLFII = Float.MAX_VALUE;
        this.LLIIII = false;
        this.LLIIIJ = 1;
        this.LLILIL = -1;
        this.LLJ = true;
        this.LLJILJIL = new CopyOnWriteArrayList();
        this.LLJJIII = new C80811Vnb(this);
        this.LLJJIJI = new C80802VnS(this);
        this.LLJJJ = 0;
        this.LLJJJIL = 600;
        this.LLJJJJ = false;
        this.LLJJJJJIL = false;
        this.LLJJJJLIIL = false;
        this.LLJJL = 0;
        this.LLJJLIIIJLLLLLLLZ = 100;
        this.LLJL = null;
        this.LLJLIL = false;
        this.LLJLILLLLZIIL = false;
        new ArrayList();
        this.LLJLL = new C80770Vmw(this);
        this.LLJLLIL = new II5(this);
        this.LLJLLL = new II6(this);
        this.LLJZ = new II4();
        this.LLJZIJLIL = 0.0f;
        this.LLL = true;
        this.LLLF = new ARunnableS50S0100000_14(this, 58);
        this.LLLFF = new IDRunnableS6S0101000(4, this, 13);
        this.LLLFFI = new IDRunnableS6S0101000(7, this, 14);
        this.LLLFZ = 0;
        this.LLLII = false;
        this.LLLIIII = false;
        this.LLLIIIIL = null;
        this.LLLIIIL = false;
        LJIJJLI();
    }

    public final C80815Vnf LJIIJ(int i, int i2) {
        C80815Vnf c80815Vnf = new C80815Vnf();
        c80815Vnf.LIZIZ = i;
        Object LJIILLIIL = this.LJLLJ.LJIILLIIL(i, this);
        if (this.LLLII && (LJIILLIIL instanceof VideoViewCellRootView)) {
            ((View) LJIILLIIL).setBackground(null);
        }
        c80815Vnf.LIZ = LJIILLIIL;
        c80815Vnf.LIZLLL = this.LJLLJ.LJIILJJIL(i);
        if (i2 < 0 || i2 >= this.LJLL.size()) {
            this.LJLL.add(c80815Vnf);
        } else {
            ListProtector.add(this.LJLL, i2, c80815Vnf);
        }
        return c80815Vnf;
    }

    public final Rect LJIIZILJ(Rect rect, View view) {
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

    public final void LJIL(int i, boolean z) {
        List<C0C3> list;
        C80770Vmw c80770Vmw = this.LLJLL;
        if (!c80770Vmw.LJFF) {
            int i2 = c80770Vmw.LJIIJ;
            if (i2 == -1) {
                c80770Vmw.LJIIJ = i;
            } else if (i2 != i) {
                c80770Vmw.LJFF = true;
            }
        }
        if (z && (list = this.LLJILJIL) != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            this.LLJJIJI.LIZ(i);
            if (this.LJLJLJ != null) {
                int size = ((CopyOnWriteArrayList) this.LLJILJIL).size();
                ILX ilx = C2NL.LIZ;
                ilx.LJIJJ = size;
                ilx.LIZ(ILW.PAGE_SELECT_VIEWPAGER_TOTAL);
            }
            Iterator it = ((CopyOnWriteArrayList) this.LLJILJIL).iterator();
            while (it.hasNext()) {
                ((C0C3) it.next()).onPageSelected(i);
            }
            if (this.LJLJLJ != null) {
                C2NL.LIZ.LIZIZ(ILW.PAGE_SELECT_VIEWPAGER_TOTAL);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0152, code lost:
    
        if (r13 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0156, code lost:
    
        if (r12 != r13.LIZIZ) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0158, code lost:
    
        r8 = r8 + r13.LIZLLL;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0163, code lost:
    
        if (r10 >= r17.LJLL.size()) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0165, code lost:
    
        r13 = (X.C80815Vnf) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLL, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0173, code lost:
    
        if (LJJ(1) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0175, code lost:
    
        r0 = r17.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0177, code lost:
    
        if (r0 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0179, code lost:
    
        r0 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x017b, code lost:
    
        r8 = r8 + r0;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0184, code lost:
    
        if (r10 >= r17.LJLL.size()) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0186, code lost:
    
        r13 = (X.C80815Vnf) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLL, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x018f, code lost:
    
        r0 = r0.LJIILJJIL(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0194, code lost:
    
        r0 = LJIIJ(r12, r10);
        r10 = r10 + 1;
        r8 = r8 + r0.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01a3, code lost:
    
        if (r10 >= r17.LJLL.size()) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01a5, code lost:
    
        r13 = (X.C80815Vnf) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLL, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01d8, code lost:
    
        r1 = (getPaddingRight() / r10) + r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e3, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00e7, code lost:
    
        r0 = r17.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00e9, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00eb, code lost:
    
        r13 = r0.getCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00ef, code lost:
    
        r1 = getClientHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00f3, code lost:
    
        if (r1 <= 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00f5, code lost:
    
        r10 = r17.LL / r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00fa, code lost:
    
        if (r5 == null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00fc, code lost:
    
        r1 = r5.LIZIZ;
        r0 = r3.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0100, code lost:
    
        if (r1 >= r0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0102, code lost:
    
        r7 = (r5.LJ + r5.LIZLLL) + r10;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0109, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x010d, code lost:
    
        if (r1 > r3.LIZIZ) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0115, code lost:
    
        if (r5 >= r17.LJLL.size()) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0117, code lost:
    
        r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLL, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x011f, code lost:
    
        r8 = (X.C80815Vnf) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0121, code lost:
    
        if (r1 <= r8.LIZIZ) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x012b, code lost:
    
        if (r5 >= (r17.LJLL.size() - 1)) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x012d, code lost:
    
        r5 = r5 + 1;
        r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLL, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x013a, code lost:
    
        if (r1 >= r8.LIZIZ) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x013c, code lost:
    
        r7 = r7 + (r17.LJLLJ.LJIILJJIL(r1) + r10);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0147, code lost:
    
        r8.LJ = r7;
        r7 = r7 + (r8.LIZLLL + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x028e, code lost:
    
        if (r1 <= r0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0290, code lost:
    
        r8 = r17.LJLL.size() - 1;
        r7 = r5.LJ;
        r5 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x029e, code lost:
    
        if (r5 < r3.LIZIZ) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02a0, code lost:
    
        if (r8 < 0) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02a2, code lost:
    
        r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLL, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02aa, code lost:
    
        r1 = (X.C80815Vnf) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ac, code lost:
    
        if (r5 >= r1.LIZIZ) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02ae, code lost:
    
        if (r8 <= 0) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02b0, code lost:
    
        r8 = r8 - 1;
        r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLL, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02bd, code lost:
    
        if (r5 <= r1.LIZIZ) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02bf, code lost:
    
        r7 = r7 - (r17.LJLLJ.LJIILJJIL(r5) + r10);
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02ca, code lost:
    
        r7 = r7 - (r1.LIZLLL + r10);
        r1.LJ = r7;
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02d3, code lost:
    
        r8 = r17.LJLL.size();
        r11 = r3.LJ;
        r1 = r3.LIZIZ;
        r12 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02df, code lost:
    
        if (r1 != 0) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02e1, code lost:
    
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02e2, code lost:
    
        r17.LLFFF = r0;
        r7 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02e6, code lost:
    
        if (r1 != r7) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02e8, code lost:
    
        r1 = (r3.LIZLLL + r11) - 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02ee, code lost:
    
        r17.LLFII = r1;
        r5 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02f2, code lost:
    
        if (r5 < 0) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02f4, code lost:
    
        r2 = (X.C80815Vnf) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLL, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02fc, code lost:
    
        r1 = r2.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02fe, code lost:
    
        if (r12 <= r1) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0300, code lost:
    
        r11 = r11 - (r17.LJLLJ.LJIILJJIL(r12) + r10);
        r12 = r12 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x030c, code lost:
    
        r11 = r11 - (r2.LIZLLL + r10);
        r2.LJ = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0312, code lost:
    
        if (r1 != 0) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0314, code lost:
    
        r17.LLFFF = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0316, code lost:
    
        r5 = r5 - 1;
        r12 = r12 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0323, code lost:
    
        r5 = (r3.LJ + r3.LIZLLL) + r10;
        r11 = r3.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x032b, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x032d, code lost:
    
        if (r9 >= r8) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x032f, code lost:
    
        r2 = (X.C80815Vnf) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLL, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0337, code lost:
    
        r0 = r2.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0339, code lost:
    
        if (r11 >= r0) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x033b, code lost:
    
        r5 = r5 + (r17.LJLLJ.LJIILJJIL(r11) + r10);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0347, code lost:
    
        if (r0 != r7) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0349, code lost:
    
        r17.LLFII = (r2.LIZLLL + r5) - 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0351, code lost:
    
        r2.LJ = r5;
        r5 = r5 + (r2.LIZLLL + r10);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x035a, code lost:
    
        r1 = r3.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x035e, code lost:
    
        if ((r1 instanceof android.widget.FrameLayout) == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0366, code lost:
    
        if (((android.view.View) r1).isLayoutRequested() == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0368, code lost:
    
        requestLayout();
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x043c, code lost:
    
        if (r0.LIZIZ == r17.LJLLL) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x031b, code lost:
    
        r1 = Float.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x031f, code lost:
    
        r0 = -3.4028235E38f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x014e, code lost:
    
        r10 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0150, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x01e6, code lost:
    
        if (r19 == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x01ea, code lost:
    
        r0 = r17.LLJJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x01ec, code lost:
    
        if (r0 <= 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x01ee, code lost:
    
        r17.LLJJL = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x01f4, code lost:
    
        if (r9 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x01f8, code lost:
    
        if (r1 != r9.LIZIZ) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x01fa, code lost:
    
        r15 = r15 + r9.LIZLLL;
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x01ff, code lost:
    
        if (r13 < 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0201, code lost:
    
        r9 = (X.C80815Vnf) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLL, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x020f, code lost:
    
        if (LJJ(-1) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0211, code lost:
    
        r0 = r17.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0213, code lost:
    
        if (r0 != null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0215, code lost:
    
        r0 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0217, code lost:
    
        r15 = r15 + r0;
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x021a, code lost:
    
        if (r13 < 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x021c, code lost:
    
        r9 = (X.C80815Vnf) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLL, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0225, code lost:
    
        r0 = r0.LJIILJJIL(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x022a, code lost:
    
        r15 = r15 + LJIIJ(r1, r13 + 1).LIZLLL;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0235, code lost:
    
        if (r13 < 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0237, code lost:
    
        r9 = (X.C80815Vnf) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLL, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0268, code lost:
    
        r8 = (r16 - r3.LIZLLL) + (getPaddingLeft() / r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x00a3, code lost:
    
        r16 = 2.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x027a, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x028a, code lost:
    
        if (r3 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        if (r1 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        r13 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0089, code lost:
    
        if (r13 < 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        r9 = (X.C80815Vnf) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLL, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        r10 = getClientHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        if (r17.LLII == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009d, code lost:
    
        if (r17.LLIIIJ > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
    
        if (r17.LLIIIL == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0276, code lost:
    
        r16 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
    
        if (r10 > 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
    
        r8 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
    
        r1 = r17.LJLLL - 1;
        r15 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ad, code lost:
    
        if (r1 < 0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b1, code lost:
    
        if (r15 < r8) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b3, code lost:
    
        if (r1 >= r12) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b5, code lost:
    
        if (r9 != null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0244, code lost:
    
        if (r1 != r9.LIZIZ) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0248, code lost:
    
        if (r9.LIZJ != false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x024a, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.remove(r17.LJLL, r13);
        r17.LJLLJ.LJIIIZ(r1, r17, r9.LIZ);
        r13 = r13 - 1;
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x025a, code lost:
    
        if (r13 < 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0240, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0264, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x025c, code lost:
    
        r9 = (X.C80815Vnf) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLL, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b7, code lost:
    
        r8 = r3.LIZLLL;
        r9 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bd, code lost:
    
        if (r17.LLJJJJLIIL != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c3, code lost:
    
        if (r8 >= 2.0f) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00cb, code lost:
    
        if (r9 >= r17.LJLL.size()) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00cd, code lost:
    
        r13 = (X.C80815Vnf) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLL, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d5, code lost:
    
        if (r10 > 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d7, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d8, code lost:
    
        r12 = r17.LJLLL + 1;
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00dd, code lost:
    
        if (r12 >= r7) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e1, code lost:
    
        if (r8 < r1) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e3, code lost:
    
        if (r12 <= r11) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e5, code lost:
    
        if (r13 != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b2, code lost:
    
        if (r12 != r13.LIZIZ) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b6, code lost:
    
        if (r13.LIZJ != false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b8, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.remove(r17.LJLL, r10);
        r17.LJLLJ.LJIIIZ(r12, r17, r13.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ca, code lost:
    
        if (r10 >= r17.LJLL.size()) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ae, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d4, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cc, code lost:
    
        r13 = (X.C80815Vnf) com.bytedance.mt.protector.impl.collections.ListProtector.get(r17.LJLL, r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80796VnM.LJJIIJZLJL(int, boolean):void");
    }

    public final void LJJJ(int i, boolean z) {
        this.LLIIIILZ = false;
        LJJJI(i, z, false, 0);
    }

    public final void LJJJJ(boolean z, C0C4 c0c4) {
        boolean z2 = false;
        int i = 1;
        if (this.LLJJ == null) {
            z2 = true;
        }
        this.LLJJ = c0c4;
        setChildrenDrawingOrderEnabledCompat(true);
        if (z) {
            i = 2;
        }
        this.LLJJIJIIJIL = i;
        if (z2) {
            LJJIIZ();
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        if (this.LLJJIJIIJIL == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C80806VnW) ((View) ListProtector.get(this.LLJJIJIL, i2)).getLayoutParams()).LJFF;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C80806VnW c80806VnW;
        C80806VnW c80806VnW2;
        boolean z;
        int i3;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        int measuredHeight = getMeasuredHeight();
        this.LLIIJLIL = Math.min(measuredHeight / 10, this.LLIIJI);
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
            if (childAt.getVisibility() != 8 && (c80806VnW2 = (C80806VnW) childAt.getLayoutParams()) != null && c80806VnW2.LIZ) {
                int i6 = c80806VnW2.LIZIZ;
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
                int i10 = ((ViewGroup.LayoutParams) c80806VnW2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = measuredWidth;
                    }
                    i3 = 1073741824;
                } else {
                    i10 = measuredWidth;
                }
                int i11 = ((ViewGroup.LayoutParams) c80806VnW2).height;
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
        this.LLFZ = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
        this.LLI = true;
        LJJIIZ();
        this.LLI = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c80806VnW = (C80806VnW) childAt2.getLayoutParams()) == null || !c80806VnW.LIZ)) {
                childAt2.measure(this.LLFZ, View.MeasureSpec.makeMeasureSpec((int) (paddingTop * c80806VnW.LIZJ), 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C80815Vnf LJIJ;
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
            if (childAt.getVisibility() == 0 && (LJIJ = LJIJ(childAt)) != null && LJIJ.LIZIZ == this.LJLLL && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    public final void LJJI(float f, int i, int i2) {
        List<C0C3> list = this.LLJILJIL;
        if (list != null && !list.isEmpty()) {
            Iterator<C0C3> it = this.LLJILJIL.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i, f, i2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(final int r12, final float r13, final int r14) {
        /*
            r11 = this;
            int r0 = r11.LLJIJIL
            r4 = 2
            r6 = 0
            if (r0 <= 0) goto L6d
            int r10 = r11.getScrollY()
            int r7 = r11.getPaddingTop()
            int r9 = r11.getPaddingBottom()
            int r8 = r11.getHeight()
            int r5 = r11.getChildCount()
            r3 = 0
        L1b:
            if (r3 >= r5) goto L6d
            android.view.View r2 = r11.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            X.VnW r1 = (X.C80806VnW) r1
            boolean r0 = r1.LIZ
            if (r0 != 0) goto L2e
        L2b:
            int r3 = r3 + 1
            goto L1b
        L2e:
            int r0 = r1.LIZIZ
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r1 == r0) goto L52
            r0 = 48
            if (r1 == r0) goto L4c
            r0 = 80
            if (r1 == r0) goto L5e
            r0 = r7
        L3f:
            int r7 = r7 + r10
            int r1 = r2.getTop()
            int r7 = r7 - r1
            if (r7 == 0) goto L4a
            r2.offsetTopAndBottom(r7)
        L4a:
            r7 = r0
            goto L2b
        L4c:
            int r0 = r2.getHeight()
            int r0 = r0 + r7
            goto L3f
        L52:
            int r0 = r2.getMeasuredHeight()
            int r0 = r8 - r0
            int r0 = r0 / r4
            int r1 = java.lang.Math.max(r0, r7)
            goto L6a
        L5e:
            int r1 = r8 - r9
            int r0 = r2.getMeasuredHeight()
            int r1 = r1 - r0
            int r0 = r2.getMeasuredHeight()
            int r9 = r9 + r0
        L6a:
            r0 = r7
            r7 = r1
            goto L3f
        L6d:
            int r0 = X.C51921KZh.LIZ
            r5 = 1
            if (r0 != r4) goto Lc0
            android.os.Handler r1 = r11.getMainHander()
            X.Vnr r0 = new X.Vnr
            r0.<init>()
            android.os.Message r2 = android.os.Message.obtain(r1, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 < r0) goto L88
            r2.setAsynchronous(r5)
        L88:
            android.os.Handler r0 = r11.getMainHander()
            r0.sendMessageAtFrontOfQueue(r2)
        L8f:
            X.0C4 r0 = r11.LLJJ
            if (r0 == 0) goto Lc4
            int r4 = r11.getScrollY()
            int r3 = r11.getChildCount()
        L9b:
            if (r6 >= r3) goto Lc4
            android.view.View r2 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            X.VnW r0 = (X.C80806VnW) r0
            boolean r0 = r0.LIZ
            if (r0 == 0) goto Lae
        Lab:
            int r6 = r6 + 1
            goto L9b
        Lae:
            int r0 = r2.getTop()
            int r0 = r0 - r4
            float r1 = (float) r0
            int r0 = r11.getClientHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            X.0C4 r0 = r11.LLJJ
            r0.LIZ(r2, r1)
            goto Lab
        Lc0:
            r11.LJJI(r13, r12, r14)
            goto L8f
        Lc4:
            r11.LLJI = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80796VnM.LJJIFFI(int, float, int):void");
    }

    public final void LJJIL(int i, int i2, int i3) {
        C4VQ c4vq;
        if (i > i2 && (c4vq = this.LLLI) != null) {
            ((OBN) c4vq).LIZ();
        }
        LJJJI(i, true, true, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C80815Vnf LJIJ;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (LJIJ = LJIJ(childAt)) != null && LJIJ.LIZIZ == this.LJLLL) {
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
        C80806VnW c80806VnW = (C80806VnW) layoutParams;
        boolean z = c80806VnW.LIZ;
        c80806VnW.LIZ = z;
        if (this.LLI) {
            if (!z) {
                c80806VnW.LIZLLL = true;
                addViewInLayout(view, i, layoutParams);
            } else {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
        } else {
            super.addView(view, i, layoutParams);
        }
        C80770Vmw c80770Vmw = this.LLJLL;
        if (!c80770Vmw.LIZ()) {
            return;
        }
        if (c80770Vmw.LJII != VIQ.NOT_OPT) {
            return;
        }
        c80770Vmw.LJII = VIQ.WAIT_OPT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r8 > 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (r8 > 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIILLIIL(int r6, float r7, int r8, int r9) {
        /*
            r5 = this;
            X.LFH r0 = X.LFH.LIZIZ
            X.LEp r0 = r0.LIZLLL()
            X.LEh r0 = r0.LJIILLIIL()
            boolean r0 = r0.LJJIII()
            r3 = 0
            r2 = 1
            if (r0 != 0) goto Lb9
            X.Ol8 r0 = X.II7.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb9
            X.Ol8 r0 = X.C35723E0h.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb9
            r0 = 1
        L2f:
            r4 = 1053609165(0x3ecccccd, float:0.4)
            if (r0 == 0) goto L76
            int r1 = java.lang.Math.abs(r9)
            int r0 = r5.LLILLL
            if (r1 <= r0) goto L6b
            int r1 = java.lang.Math.abs(r8)
            int r0 = r5.LLILLIZIL
            if (r1 <= r0) goto L6b
            if (r8 <= 0) goto L9d
        L46:
            java.util.ArrayList<X.Vnf> r0 = r5.LJLL
            int r0 = r0.size()
            if (r0 <= 0) goto L6a
            java.util.ArrayList<X.Vnf> r0 = r5.LJLL
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            X.Vnf r1 = (X.C80815Vnf) r1
            java.util.ArrayList<X.Vnf> r0 = r5.LJLL
            java.lang.Object r0 = X.AnonymousClass028.LIZIZ(r0, r2, r0)
            X.Vnf r0 = (X.C80815Vnf) r0
            int r1 = r1.LIZIZ
            int r0 = r0.LIZIZ
            int r0 = java.lang.Math.min(r6, r0)
            int r6 = java.lang.Math.max(r1, r0)
        L6a:
            return r6
        L6b:
            int r0 = r5.LJLLL
            if (r6 < r0) goto L72
            r4 = 1058642330(0x3f19999a, float:0.6)
        L72:
            float r1 = (float) r6
            float r1 = r1 + r7
            float r1 = r1 + r4
            goto Lb7
        L76:
            int r1 = java.lang.Math.abs(r9)
            X.II5 r0 = r5.LLJLLIL
            java.lang.Object r0 = r0.LIZ()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r1 <= r0) goto La0
            int r1 = java.lang.Math.abs(r8)
            X.II6 r0 = r5.LLJLLL
            java.lang.Object r0 = r0.LIZ()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r1 <= r0) goto La0
            if (r8 <= 0) goto L9d
            goto L46
        L9d:
            int r6 = r6 + 1
            goto L46
        La0:
            int r0 = r5.LJLLL
            if (r6 < r0) goto La7
            r4 = 1058642330(0x3f19999a, float:0.6)
        La7:
            X.II4 r0 = r5.LLJZ
            java.lang.Object r0 = r0.LIZ()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float r0 = r0 + r4
            float r1 = (float) r6
            float r1 = r1 + r7
            float r1 = r1 + r0
        Lb7:
            int r6 = (int) r1
            goto L46
        Lb9:
            r0 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80796VnM.LJIILLIIL(int, float, int, int):int");
    }

    public final void LJJIJIL(int i, int i2, int i3, int i4) {
        float f;
        C80815Vnf LJIJJ;
        boolean z = false;
        if (i2 > 0 && !this.LJLL.isEmpty()) {
            if (!this.LJZ.isFinished()) {
                int clientHeight = getClientHeight();
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZIZ("recommend_fix_splash_bug", 1.5d) > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    z = true;
                }
                if (z) {
                    int finalY = this.LJZ.getFinalY() / i2;
                    int i5 = finalY * clientHeight;
                    C80815Vnf LJIJJ2 = LJIJJ(this.LJLLL);
                    if (LJIJJ2 != null) {
                        int i6 = (int) (LJIJJ2.LJ * clientHeight);
                        C36922EeM.LIZLLL(4, "VerticalViewPager_YCH", C48263Iwt.LIZLLL("use itemInfo to calculate final y after = ", i6, " before= ", i5));
                        i5 = i6;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("getCurItem = ");
                    LIZ.append(getCurrentItem());
                    LIZ.append("current scroll y = ");
                    LIZ.append(getScrollY());
                    LIZ.append("finalY = ");
                    LIZ.append(getCurrentItem() * getClientHeight());
                    LIZ.append("trueCount = ");
                    LIZ.append(finalY);
                    LIZ.append("newY = ");
                    LIZ.append(i5);
                    C36922EeM.LIZLLL(4, "VerticalViewPager_YCH", X1D.LIZIZ(LIZ));
                    this.LJZ.setFinalY(i5);
                    return;
                }
                C36922EeM.LIZLLL(4, "VerticalViewPager", "use origin logic");
                this.LJZ.setFinalY(getCurrentItem() * clientHeight);
                return;
            }
            int scrollY = (int) ((getScrollY() / (((i2 - getPaddingTop()) - getPaddingBottom()) + i4)) * (((i - getPaddingTop()) - getPaddingBottom()) + i3));
            if (this.LLLFZ == 0 && (LJIJJ = LJIJJ(this.LJLLL)) != null) {
                scrollY = (int) (LJIJJ.LJ * getClientHeight());
            }
            scrollTo(getScrollX(), scrollY);
            return;
        }
        C80815Vnf LJIJJ3 = LJIJJ(this.LJLLL);
        if (LJIJJ3 != null) {
            f = Math.min(LJIJJ3.LJ, this.LLFII);
        } else {
            f = 0.0f;
        }
        int paddingTop = (int) (f * ((i - getPaddingTop()) - getPaddingBottom()));
        if (paddingTop == getScrollY()) {
            return;
        }
        LJIILJJIL(false);
        scrollTo(getScrollX(), paddingTop);
    }

    public final void LJJIZ(int i, boolean z, int i2, boolean z2) {
        int LIZIZ;
        int i3;
        int scrollY;
        float f;
        int abs;
        boolean booleanValue;
        Field field;
        List<C0C3> list;
        C80815Vnf LJIJJ = LJIJJ(i);
        C0NU c0nu = C0NU.TT_FEED_SCROLL;
        if (C58122Pw.LIZ) {
            LIZIZ = ((Number) C53033Krd.LIZ.getValue()).intValue();
        } else {
            LIZIZ = Q7K.LIZIZ("vboost_feed_scroll_opt_time", ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        C01H.LIZIZ(c0nu, LIZIZ);
        if (LJIJJ != null) {
            i3 = (int) (Math.max(this.LLFFF, Math.min(LJIJJ.LJ, this.LLFII)) * getClientHeight());
        } else {
            i3 = 0;
        }
        if (z2 && (list = this.LLJILJIL) != null) {
            ((CopyOnWriteArrayList) list).isEmpty();
        }
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.LJZ;
                if (scroller != null && !scroller.isFinished()) {
                    if (this.LJZI) {
                        scrollY = this.LJZ.getCurrY();
                    } else {
                        scrollY = this.LJZ.getStartY();
                    }
                    this.LJZ.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollY = getScrollY();
                }
                int scrollX = getScrollX();
                int i4 = -scrollX;
                int i5 = i3 - scrollY;
                if (i4 == 0 && i5 == 0) {
                    LJIILJJIL(false);
                    LJJIIZ();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientHeight = getClientHeight();
                    float f2 = clientHeight;
                    float f3 = clientHeight / 2;
                    float sin = (((float) Math.sin((float) ((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f2) - 0.5f) * 0.4712389167638204d))) * f3) + f3;
                    int abs2 = Math.abs(i2);
                    if (abs2 > 0) {
                        abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                    } else {
                        PagerAdapter pagerAdapter = this.LJLLJ;
                        if (pagerAdapter != null) {
                            f = pagerAdapter.LJIILJJIL(this.LJLLL);
                        } else {
                            f = 1.0f;
                        }
                        abs = (int) (((Math.abs(i4) / ((f2 * f) + this.LL)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(abs, this.LLJJJIL);
                    int i6 = this.LLJJLIIIJLLLLLLLZ;
                    if (i6 != 100) {
                        min = (int) ((i6 / 100.0d) * min);
                    }
                    this.LJZI = false;
                    if (((Boolean) DTZ.LIZJ.getValue()).booleanValue()) {
                        Boolean bool = C37117EhV.LIZIZ;
                        if (bool != null) {
                            booleanValue = bool.booleanValue();
                        } else {
                            booleanValue = ((Boolean) C37117EhV.LIZ.getValue()).booleanValue();
                        }
                        if (booleanValue) {
                            if (((Boolean) C57902Pa.LIZIZ.getValue()).booleanValue()) {
                                min = ((Number) C57902Pa.LIZ.getValue()).intValue();
                            } else {
                                min = ((Number) DTZ.LIZIZ.getValue()).intValue();
                            }
                        }
                    }
                    if (this.LLJJJJ) {
                        min = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
                    }
                    if (this.LLJJJJJIL) {
                        min = LiveChatShowDelayForHotLiveSetting.DEFAULT;
                    }
                    this.LJZ.startScroll(scrollX, scrollY, i4, i5, min);
                    C16300kU.LJIIJ(this);
                }
            }
            if (C51785KUb.LIZ) {
                if (C51785KUb.LIZJ) {
                    Choreographer choreographer = FN6.LIZJ;
                    if (choreographer != null && (field = FN6.LJ) != null) {
                        try {
                            Object obj = field.get(choreographer);
                            o.LJII(obj, "null cannot be cast to non-null type kotlin.Boolean");
                            if (((Boolean) obj).booleanValue()) {
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                Message obtain = Message.obtain(getMainHander(), new ARunnableS2S0111000_14(this, i, z2, 1));
                if (C51785KUb.LIZIZ == 1 && Build.VERSION.SDK_INT >= 22) {
                    obtain.setAsynchronous(true);
                }
                getMainHander().sendMessageAtFrontOfQueue(obtain);
                return;
            }
            LJIL(i, z2);
            return;
        }
        LJIL(i, z2);
        LJIILJJIL(false);
        scrollTo(0, i3);
        LJJIII(i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJI(int r11, boolean r12, boolean r13, int r14) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80796VnM.LJJJI(int, boolean, boolean, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            int i5 = this.LL;
            LJJIJIL(i2, i4, i5, i5);
        }
    }

    public final boolean LJIIL(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if ((!C46380IIe.LIZ || childAt.getVisibility() == 0) && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && (i5 = i2 + scrollX) >= childAt.getLeft() && i5 < childAt.getRight() && LJIIL(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
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
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80796VnM.onLayout(boolean, int, int, int, int):void");
    }

    public final void LJJJIL(float f, float f2, float f3, float f4, long j, long j2) {
        try {
            if (this.LLLIIIIL == null) {
                this.LLLIIIIL = new JSONObject();
            }
            this.LLLIIIIL.put("downX", f);
            this.LLLIIIIL.put("downY", f2);
            this.LLLIIIIL.put("upX", f3);
            this.LLLIIIIL.put("upY", f4);
            this.LLLIIIIL.put("downTimeMs", j);
            this.LLLIIIIL.put("upTimeMs", j2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
