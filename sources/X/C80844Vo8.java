package X;

import Y.ARunnableS18S0101000_14;
import Y.ARunnableS50S0100000_14;
import Y.IDDListenerS395S0100000_14;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.HorizontalScrollView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vo8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80844Vo8 extends HorizontalScrollView {
    public static final int LJZL = C60996Nwm.LIZIZ(EF7.LIZIZ());
    public static final int LL = ViewConfiguration.getMaximumFlingVelocity();
    public static final int LLD = (int) KL2.LIZJ(EF7.LIZIZ(), 500.0f);
    public static final int LLF = (int) KL2.LIZJ(EF7.LIZIZ(), 8.0f);
    public boolean LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public final List<C80845Vo9> LJLJJLL;
    public VelocityTracker LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public long LJLLJ;
    public boolean LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public Runnable LJZ;
    public InterfaceC54208LPg LJZI;

    @Override // android.widget.HorizontalScrollView
    public final void fling(int i) {
    }

    public void setOnFeedScrollListener(InterfaceC80847VoB interfaceC80847VoB) {
    }

    public void setOnFlingToIndexListener(InterfaceC80848VoC interfaceC80848VoC) {
    }

    public void setOnPageChangeListener(InterfaceC80846VoA interfaceC80846VoA) {
    }

    public String getCurrentItemName() {
        if (((ArrayList) this.LJLJJLL).isEmpty()) {
            return "";
        }
        return ((C80845Vo9) ListProtector.get(this.LJLJJLL, this.LJLLLL)).LIZ;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LJLJL = VelocityTracker.obtain();
    }

    public int getCurrentItem() {
        return this.LJLLLL;
    }

    private void setCurrentItem(int i) {
        LIZJ(i, true);
    }

    public final boolean LIZ(int i) {
        if (((ArrayList) this.LJLJJLL).isEmpty() || i >= ((ArrayList) this.LJLJJLL).size()) {
            return false;
        }
        return ((C80845Vo9) ListProtector.get(this.LJLJJLL, i)).LIZIZ;
    }

    public final boolean LIZIZ(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        Runnable runnable;
        int findPointerIndex = motionEvent.findPointerIndex(this.LJLJLJ);
        if (findPointerIndex == -1) {
            return false;
        }
        int x = (int) motionEvent.getX(findPointerIndex);
        int abs = Math.abs(x - this.LJLILLLLZI);
        int i2 = LJZL;
        if (abs <= i2) {
            z = true;
        } else {
            z = false;
        }
        int i3 = x - this.LJLILLLLZI;
        if (i3 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            return false;
        }
        int i4 = this.LJLJJI - i3;
        int i5 = this.LJLLLL;
        if (i5 <= 0) {
            i = i5;
        } else {
            i = i5 - 1;
        }
        int i6 = this.LJLJI;
        if (i5 < i6) {
            i6 = i5 + 1;
        }
        if (i4 >= 0 && LIZ(i)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i4 <= this.LJLJI * i2 && LIZ(i6)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2) {
            z4 = z3;
        }
        if (!z3 && !this.LJLLLLLL && (runnable = this.LJZ) != null) {
            this.LJLLLLLL = true;
            runnable.run();
        }
        if (!z4) {
            return false;
        }
        try {
            if (!super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C36922EeM.LJFF(e);
            return false;
        }
    }

    @Override // android.widget.HorizontalScrollView
    public final int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (this.LJLIL) {
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        }
        return 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LJLLI) {
            return false;
        }
        if (this.LJLLL) {
            return true;
        }
        if (this.LJLLJ != 0 && System.currentTimeMillis() - this.LJLLJ < 150) {
            return this.LJLZ;
        }
        if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
            return false;
        }
        this.LJLZ = false;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    this.LJLZ = true;
                } else {
                    float LIZ = C47959Irz.LIZ(motionEvent, this.LJLJLLL);
                    float LIZIZ = C1I1.LIZIZ(motionEvent, this.LJLL);
                    float f = LLF;
                    if ((LIZ > f || LIZIZ > f) && this.LJLLILLLL) {
                        if (LIZ - LIZIZ >= 0.0f) {
                            this.LJLZ = true;
                        } else {
                            this.LJLZ = false;
                        }
                        this.LJLLILLLL = false;
                    }
                }
            } else {
                this.LJLZ = false;
            }
        } else {
            this.LJLJLLL = (int) motionEvent.getX();
            this.LJLL = (int) motionEvent.getY();
            this.LJLJLJ = motionEvent.getPointerId(0);
            this.LJLILLLLZI = (int) motionEvent.getX();
            this.LJLJJI = getScrollX();
            super.onTouchEvent(motionEvent);
            this.LJLLILLLL = true;
        }
        return this.LJLZ;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        if (!this.LJLLI) {
            return false;
        }
        int action = motionEvent.getAction();
        if (this.LJLJL == null) {
            this.LJLJL = VelocityTracker.obtain();
        }
        this.LJLJL.addMovement(motionEvent);
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    return LIZIZ(motionEvent);
                }
            }
            int x = (int) motionEvent.getX();
            VelocityTracker velocityTracker = this.LJLJL;
            if (x <= this.LJLJLLL) {
                z = true;
            } else {
                z = false;
            }
            velocityTracker.computeCurrentVelocity(1000, LL);
            float xVelocity = velocityTracker.getXVelocity(this.LJLJLJ);
            int scrollX = getScrollX();
            int i2 = LJZL;
            int i3 = scrollX % i2;
            if (i3 == 0) {
                InterfaceC54208LPg interfaceC54208LPg = this.LJZI;
                if (interfaceC54208LPg != null && z) {
                    interfaceC54208LPg.LIZ();
                }
            } else {
                int scrollX2 = getScrollX() / i2;
                if (Math.abs(xVelocity) >= LLD ? xVelocity < 0.0f : i3 > i2 / 2) {
                    i = 1;
                } else {
                    i = 0;
                }
                LIZJ(C78609UtB.LJJIIZ(scrollX2 + i, 0, this.LJLJI), true);
                VelocityTracker velocityTracker2 = this.LJLJL;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                    this.LJLJL.recycle();
                    this.LJLJL = null;
                }
            }
            boolean LIZIZ = LIZIZ(motionEvent);
            this.LJLLLLLL = false;
            return LIZIZ;
        }
        this.LJLJLJ = motionEvent.getPointerId(0);
        this.LJLILLLLZI = (int) motionEvent.getX();
        this.LJLJJI = getScrollX();
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            setScrollX(this.LJLLLL * LJZL);
        }
    }

    public void setCanScroll(boolean z) {
        this.LJLLI = z;
    }

    public void setCanScrollToProfile(boolean z) {
        for (int i = 0; i < ((ArrayList) this.LJLJJLL).size(); i++) {
            C80845Vo9 c80845Vo9 = (C80845Vo9) ListProtector.get(this.LJLJJLL, i);
            if (TextUtils.equals(c80845Vo9.LIZ, "page_profile")) {
                c80845Vo9.LIZIZ = z;
                return;
            }
        }
    }

    public void setOnFlingEndListener(InterfaceC54208LPg interfaceC54208LPg) {
        this.LJZI = interfaceC54208LPg;
    }

    public void setOverScrollLeftAction(Runnable runnable) {
        this.LJZ = runnable;
    }

    public void setScrowToChildWhenRequestChildFocus(boolean z) {
        this.LJLIL = z;
    }

    public void setCurrentItem(String str) {
        LIZLLL(str, true);
    }

    public C80844Vo8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = true;
        this.LJLJJLL = new ArrayList(5);
        this.LJLLI = false;
        this.LJLLILLLL = false;
        this.LJLLL = false;
        this.LJLLLL = 0;
        this.LJLZ = false;
        getViewTreeObserver().addOnPreDrawListener(new IDDListenerS395S0100000_14(this, 3));
    }

    public final void LIZJ(int i, boolean z) {
        if (z) {
            if (i != this.LJLLLL || getScrollX() != LJZL * i) {
                post(new ARunnableS18S0101000_14(i, this, 26));
                this.LJLLL = true;
                postDelayed(new ARunnableS50S0100000_14(this, 255), 150L);
                return;
            }
            return;
        }
        if (i == this.LJLLLL) {
            return;
        }
        this.LJLLLL = i;
        if (!this.LJLJJL) {
            return;
        }
        setScrollX(i * LJZL);
    }

    public final void LIZLLL(String str, boolean z) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= ((ArrayList) this.LJLJJLL).size()) {
                break;
            }
            if (TextUtils.equals(str, ((C80845Vo9) ListProtector.get(this.LJLJJLL, i2)).LIZ)) {
                i = i2;
                break;
            }
            i2++;
        }
        LIZJ(i, z);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (view2 != null && view2.getTag() != null) {
            Object tag = view2.getTag();
            if ((tag instanceof String) && TextUtils.equals((String) tag, "relation_search_tag")) {
                super.requestChildFocus(view, view2);
                return;
            }
        }
        if (!TextUtils.equals(getCurrentItemName(), "page_feed")) {
            super.requestChildFocus(view, view2);
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        if ((-i) != LJZL) {
            super.scrollBy(i, i2);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }
}
