package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Vkx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80647Vkx extends LinearLayout {
    public final Scroller LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public VelocityTracker LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public View LJLLLL;
    public ViewPager LJLLLLLL;
    public J2H LJLZ;
    public int LJZ;
    public final int LJZI;
    public boolean LJZL;
    public boolean LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public int LLFFF;
    public int LLFII;
    public boolean LLFZ;
    public int LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public InterfaceC80650Vl0 LLIIII;
    public final OGF LLIIIILZ;
    public boolean LLIIIJ;

    @Override // android.view.View
    public final void computeScroll() {
        int i;
        if (this.LJLIL.computeScrollOffset()) {
            int currY = this.LJLIL.getCurrY();
            if (this.LJLZ == J2H.UP) {
                if (this.LLFII >= this.LLFF) {
                    int finalY = this.LJLIL.getFinalY() - currY;
                    int duration = this.LJLIL.getDuration() - this.LJLIL.timePassed();
                    OGF ogf = this.LLIIIILZ;
                    Scroller scroller = this.LJLIL;
                    if (scroller == null) {
                        i = 0;
                    } else if (this.LJZI >= 14) {
                        i = (int) scroller.getCurrVelocity();
                    } else {
                        i = finalY / duration;
                    }
                    View LIZ = ogf.LIZ();
                    if (LIZ instanceof AbsListView) {
                        AbsListView absListView = (AbsListView) LIZ;
                        if (ogf.LIZJ >= 21) {
                            absListView.fling(i);
                        } else {
                            absListView.smoothScrollBy(finalY, duration);
                        }
                    } else if (LIZ instanceof ScrollView) {
                        ((ScrollView) LIZ).fling(i);
                    } else if (LIZ instanceof RecyclerView) {
                        ((RecyclerView) LIZ).LJJJI(0, i);
                    } else if (LIZ instanceof WebView) {
                        ((WebView) LIZ).flingScroll(0, i);
                    }
                    this.LJLIL.forceFinished(true);
                    return;
                }
                scrollTo(0, currY);
            } else {
                if (this.LLIIIILZ.LIZIZ()) {
                    scrollTo(0, getScrollY() + (currY - this.LLD));
                    if (this.LLFII <= this.LLF) {
                        this.LJLIL.forceFinished(true);
                        if ((getParent() instanceof C80896Voy) && this.LLIFFJFJJ) {
                            float currVelocity = this.LJLIL.getCurrVelocity();
                            if (currVelocity > 0.0f) {
                                currVelocity = -currVelocity;
                            }
                            ((C80896Voy) getParent()).LJ(currVelocity);
                            return;
                        }
                        return;
                    }
                }
                invalidate();
            }
            this.LLD = currY;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        View view = this.LJLLLL;
        if (view != null && !view.isClickable()) {
            this.LJLLLL.setClickable(true);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof ViewPager)) {
                this.LJLLLLLL = (ViewPager) childAt;
            }
        }
        super.onFinishInflate();
    }

    public int getCurScrollY() {
        return this.LLFII;
    }

    public OGF getHelper() {
        return this.LLIIIILZ;
    }

    public int getMaxY() {
        return this.LLFF;
    }

    public int getMinY() {
        return this.LLF;
    }

    public int getTabsMarginTop() {
        return this.LLFFF;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        View LIZ;
        if (i < 0) {
            if (getScrollY() > this.LLF) {
                return true;
            }
            return false;
        }
        if (i > 0 && (LIZ = this.LLIIIILZ.LIZ()) != null) {
            if (LIZ.canScrollVertically(i) || getScrollY() < this.LLFF) {
                return true;
            }
            return false;
        }
        return super.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        J2H j2h;
        int i;
        try {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int abs = (int) Math.abs(x - this.LJLILLLLZI);
            int abs2 = (int) Math.abs(y - this.LJLJI);
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            InterfaceC80650Vl0 interfaceC80650Vl0 = this.LLIIII;
                            if (interfaceC80650Vl0 != null) {
                                interfaceC80650Vl0.onScrollEnd();
                            }
                            if (this.LL && this.LLFZ && (abs > (i = this.LJLJL) || abs2 > i)) {
                                int action2 = motionEvent.getAction();
                                motionEvent.setAction(3);
                                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                                motionEvent.setAction(action2);
                                return dispatchTouchEvent;
                            }
                        }
                    } else {
                        if (this.LJLJJLL == null) {
                            this.LJLJJLL = VelocityTracker.obtain();
                        }
                        this.LJLJJLL.addMovement(motionEvent);
                        float f = this.LJLJJL - y;
                        InterfaceC80650Vl0 interfaceC80650Vl02 = this.LLIIII;
                        if (interfaceC80650Vl02 != null) {
                            interfaceC80650Vl02.onScrolled(this.LJLJJI - x, f);
                        }
                        if (this.LJZL) {
                            int i2 = this.LJLJL;
                            if (abs > i2 && abs > abs2) {
                                this.LJZL = false;
                                this.LL = false;
                            } else if (abs2 > i2 && abs2 > abs) {
                                this.LJZL = false;
                                this.LL = true;
                            }
                        }
                        if (this.LL && abs2 > this.LJLJL && abs2 > abs && (this.LLFII < this.LLFF || this.LLIIIILZ.LIZIZ())) {
                            ViewPager viewPager = this.LJLLLLLL;
                            if (viewPager != null) {
                                viewPager.requestDisallowInterceptTouchEvent(true);
                            }
                            scrollBy(0, (int) (f + 0.5f));
                        }
                        this.LJLJJI = x;
                        this.LJLJJL = y;
                        this.LJLLILLLL = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        this.LJLLJ = (int) (this.LJLLILLLL - this.LJLL);
                        float f2 = (int) (rawY - this.LJLLI);
                        this.LJLLL = f2;
                        if (Math.abs(f2) > this.LLI) {
                            Math.abs(this.LJLLL);
                            Math.abs(this.LJLLJ);
                        }
                    }
                } else {
                    InterfaceC80650Vl0 interfaceC80650Vl03 = this.LLIIII;
                    if (interfaceC80650Vl03 != null) {
                        interfaceC80650Vl03.onScrollEnd();
                    }
                    if (this.LL && abs2 > abs && abs2 > this.LJLJL) {
                        this.LJLJJLL.computeCurrentVelocity(1000, this.LJLJLLL);
                        float f3 = -this.LJLJJLL.getYVelocity();
                        if (Math.abs(f3) > this.LJLJLJ) {
                            if (f3 > 0.0f) {
                                j2h = J2H.UP;
                            } else {
                                j2h = J2H.DOWN;
                            }
                            this.LJLZ = j2h;
                            if (j2h != J2H.UP || this.LLFII < this.LLFF) {
                                this.LJLIL.fling(0, getScrollY(), 0, (int) f3, 0, 0, -2147483647, Integer.MAX_VALUE);
                                this.LLIFFJFJJ = true;
                                this.LJLIL.computeScrollOffset();
                                this.LLD = getScrollY();
                                invalidate();
                            }
                        }
                        if (this.LLFZ || this.LLFII < this.LLFF) {
                            int action3 = motionEvent.getAction();
                            motionEvent.setAction(3);
                            boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                            motionEvent.setAction(action3);
                            return dispatchTouchEvent2;
                        }
                    }
                }
            } else {
                this.LJLL = motionEvent.getRawX();
                this.LJLLI = motionEvent.getRawY();
                this.LJZL = true;
                this.LL = true;
                this.LJLILLLLZI = x;
                this.LJLJI = y;
                this.LJLJJI = x;
                this.LJLJJL = y;
                getScrollY();
                if (((int) y) + getScrollY() <= this.LJZ) {
                    z = true;
                } else {
                    z = false;
                }
                this.LLFZ = z;
                VelocityTracker velocityTracker = this.LJLJJLL;
                if (velocityTracker == null) {
                    this.LJLJJLL = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                this.LJLJJLL.addMovement(motionEvent);
                this.LJLIL.forceFinished(true);
                this.LLIFFJFJJ = false;
            }
            super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            C16880lQ.LLLLIIL(e);
        }
        return true;
    }

    public void setCanScrollUp(boolean z) {
        if (this.LLII == z) {
            return;
        }
        this.LLII = z;
        if (z) {
            this.LLFF = this.LJZ - this.LLFFF;
            return;
        }
        if (this.LLFII != 0) {
            scrollTo(0, 0);
        }
        this.LLFF = 0;
    }

    public void setMaxScrollHeight(int i) {
        int min = Math.min(i, this.LJZ - this.LLFFF);
        this.LLFF = min;
        this.LLFF = Math.max(min, 0);
    }

    public void setMinY(int i) {
        this.LLF = i;
    }

    public void setOnScrollListener(InterfaceC80650Vl0 interfaceC80650Vl0) {
        this.LLIIII = interfaceC80650Vl0;
    }

    public void setScrollMinY(int i) {
        this.LLI = i;
    }

    public void setTabsMarginTop(int i) {
        this.LLFFF = i;
    }

    public C80647Vkx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLI = 10;
        this.LLII = true;
        this.LLIIIILZ = new OGF();
        this.LJLIL = new Scroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LJLJL = viewConfiguration.getScaledTouchSlop();
        this.LJLJLJ = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LJLJLLL = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LJZI = Build.VERSION.SDK_INT;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bha});
        this.LLFFF = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View childAt = getChildAt(0);
        this.LJLLLL = childAt;
        if (childAt != null) {
            measureChildWithMargins(childAt, i, 0, 0, 0);
            this.LJZ = this.LJLLLL.getMeasuredHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((this.LJZ - this.LLFFF) + View.MeasureSpec.getSize(i2), 1073741824));
        if (!this.LLIIIJ) {
            this.LLFF = this.LJZ - this.LLFFF;
            this.LLIIIJ = true;
        }
        if (!this.LLII) {
            this.LLFF = 0;
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        int scrollY = getScrollY();
        if (scrollY + i2 < 0) {
            i2 /= 3;
        }
        int i3 = i2 + scrollY;
        int i4 = this.LLFF;
        if (i3 >= i4 || i3 <= (i4 = this.LLF)) {
            i3 = i4;
        }
        super.scrollBy(i, i3 - scrollY);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        int i3 = this.LLFF;
        if (i2 >= i3) {
            i2 = i3;
        } else {
            int i4 = this.LLF;
            if (i2 <= i4) {
                i2 = i4;
            }
        }
        this.LLFII = i2;
        InterfaceC80650Vl0 interfaceC80650Vl0 = this.LLIIII;
        if (interfaceC80650Vl0 != null) {
            interfaceC80650Vl0.onScroll(i2, i3);
        }
        super.scrollTo(i, i2);
    }
}
