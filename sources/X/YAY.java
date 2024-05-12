package X;

import Y.ARunnableS51S0100000_15;
import Y.IDTListenerS123S0100000_15;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes16.dex */
public class YAY extends ViewGroup {
    public static final String LLI = C16880lQ.LJLLJ(SwipeRefreshLayout.class);
    public static final int[] LLIFFJFJJ = {R.attr.enabled};
    public View LJLIL;
    public int LJLILLLLZI;
    public InterfaceC86939YAd LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public final int LJLJJLL;
    public float LJLJL;
    public final int LJLJLJ;
    public int LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public boolean LJLLILLLL;
    public int LJLLJ;
    public boolean LJLLL;
    public final DecelerateInterpolator LJLLLL;
    public View LJLLLLLL;
    public int LJLZ;
    public EnumC84367X9f LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public final C86937YAb LL;
    public final C86938YAc LLD;
    public final YAZ LLF;
    public final C86936YAa LLFF;
    public final ARunnableS51S0100000_15 LLFFF;
    public final ARunnableS51S0100000_15 LLFII;
    public final ARunnableS51S0100000_15 LLFZ;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
    }

    public final void LIZIZ() {
        if (this.LJLIL == null) {
            if (getChildCount() <= 2 || isInEditMode()) {
                View childAt = getChildAt(1);
                this.LJLIL = childAt;
                if (childAt != null) {
                    childAt.setOnTouchListener(new IDTListenerS123S0100000_15(this, 0));
                }
                this.LJLILLLLZI = getPaddingTop() + this.LJLIL.getTop();
            } else {
                throw new IllegalStateException("SwipeRefreshLayout can only host two children");
            }
        }
        if (this.LJLJL == -1.0f && getParent() != null && ((View) getParent()).getHeight() > 0) {
            this.LJLJL = (int) Math.min(((View) getParent()).getHeight() * 0.6f, getResources().getDisplayMetrics().density * 120.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.LLFZ);
        removeCallbacks(this.LLFFF);
        removeCallbacks(this.LLFII);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.LLFFF);
        removeCallbacks(this.LLFZ);
        removeCallbacks(this.LLFII);
    }

    public final void LIZJ(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LJLLJ) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LJLLI = motionEvent.getY(i);
            this.LJLLJ = motionEvent.getPointerId(i);
        }
    }

    public final void LIZLLL(int i) {
        View view = this.LJLIL;
        if (view != null) {
            int top = view.getTop();
            float f = i;
            float f2 = this.LJLJL;
            if (f > f2) {
                i = ((int) f2) + (((int) (f - f2)) / 2);
            } else if (i < 0) {
                i = 0;
            }
            setTargetOffsetTopAndBottom(i - top);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJZL) {
            return false;
        }
        LIZIZ();
        int actionMasked = motionEvent.getActionMasked();
        if (this.LJLLL && actionMasked == 0) {
            this.LJLLL = false;
        }
        if (!isEnabled() || this.LJLLL || this.LJLIL.canScrollVertically(-1)) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            LIZJ(motionEvent);
                        }
                    }
                } else {
                    int i = this.LJLLJ;
                    if (i == -1) {
                        C0NB.LJ(LLI, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        C0NB.LJ(LLI, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y = motionEvent.getY(findPointerIndex);
                    if (y - this.LJLL > this.LJLJJLL) {
                        this.LJLLI = y;
                        this.LJLLILLLL = true;
                    }
                }
            }
            this.LJLLILLLL = false;
            this.LJLLJ = -1;
        } else {
            float y2 = motionEvent.getY();
            this.LJLL = y2;
            this.LJLLI = y2;
            this.LJLLJ = motionEvent.getPointerId(0);
            this.LJLLILLLL = false;
        }
        return this.LJLLILLLL;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        if (this.LJZL) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.LJLLL && actionMasked == 0) {
            this.LJLLL = false;
        }
        if (!isEnabled() || this.LJLLL || this.LJLIL.canScrollVertically(-1)) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                LIZJ(motionEvent);
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.LJLLI = motionEvent.getY(actionIndex);
                            this.LJLLJ = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        removeCallbacks(this.LLFZ);
                        postDelayed(this.LLFZ, 300L);
                        this.LJLLILLLL = false;
                        this.LJLLJ = -1;
                        return false;
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.LJLLJ);
                    if (findPointerIndex < 0) {
                        C0NB.LJ(LLI, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y = motionEvent.getY(findPointerIndex);
                    float f = y - this.LJLL;
                    if (!this.LJLLILLLL && f > this.LJLJJLL) {
                        this.LJLLILLLL = true;
                    }
                    if (this.LJLLILLLL) {
                        InterfaceC86939YAd interfaceC86939YAd = this.LJLJI;
                        if (interfaceC86939YAd != null) {
                            interfaceC86939YAd.LIZJ();
                        }
                        if (f > this.LJLJL) {
                            if (this.LJZ == EnumC84367X9f.NORMAL) {
                                this.LJZ = EnumC84367X9f.LOOSEN;
                                InterfaceC86939YAd interfaceC86939YAd2 = this.LJLJI;
                                if (interfaceC86939YAd2 != null) {
                                    interfaceC86939YAd2.LIZIZ();
                                }
                            }
                            LIZLLL((int) f);
                        } else {
                            if (this.LJZ == EnumC84367X9f.LOOSEN) {
                                this.LJZ = EnumC84367X9f.NORMAL;
                            }
                            LIZLLL((int) f);
                            if (this.LJLLI > y && (view = this.LJLIL) != null && view.getTop() == getPaddingTop()) {
                                removeCallbacks(this.LLFZ);
                            }
                        }
                        this.LJLLI = y;
                    }
                }
            } else {
                if (this.LJZ == EnumC84367X9f.LOOSEN) {
                    removeCallbacks(this.LLFZ);
                    this.LLFII.run();
                    setRefreshing(true);
                    this.LJZI = true;
                    InterfaceC86939YAd interfaceC86939YAd3 = this.LJLJI;
                    if (interfaceC86939YAd3 != null) {
                        interfaceC86939YAd3.LJ();
                    }
                } else {
                    removeCallbacks(this.LLFZ);
                    postDelayed(this.LLFZ, 300L);
                }
                this.LJLLILLLL = false;
                this.LJLLJ = -1;
                return false;
            }
        } else {
            float y2 = motionEvent.getY();
            this.LJLL = y2;
            this.LJLLI = y2;
            this.LJLLJ = motionEvent.getPointerId(0);
            this.LJLLILLLL = false;
        }
        return true;
    }

    public void setOnRefreshListener(InterfaceC86939YAd interfaceC86939YAd) {
        this.LJLJI = interfaceC86939YAd;
    }

    public void setRefreshing(boolean z) {
        if (this.LJLJJL != z) {
            LIZIZ();
            this.LJLJJL = z;
        }
    }

    public void setTargetOffsetTopAndBottom(int i) {
        View view = this.LJLIL;
        if (view != null) {
            view.offsetTopAndBottom(i);
        }
        this.LJLLLLLL.offsetTopAndBottom(i);
        this.LJLJLLL = this.LJLIL.getTop();
        invalidate();
    }

    public void setmIsDisable(boolean z) {
        this.LJZL = z;
    }

    public YAY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJL = -1.0f;
        this.LJLLJ = -1;
        this.LJZ = EnumC84367X9f.NORMAL;
        this.LL = new C86937YAb(this);
        this.LLD = new C86938YAc(this);
        this.LLF = new YAZ(this);
        this.LLFF = new C86936YAa(this);
        this.LLFFF = new ARunnableS51S0100000_15(this, 13);
        this.LLFII = new ARunnableS51S0100000_15(this, 14);
        this.LLFZ = new ARunnableS51S0100000_15(this, 15);
        this.LJLJJLL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJLJLJ = getResources().getInteger(R.integer.config_mediumAnimTime);
        this.LJLLLL = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LLIFFJFJJ);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    public final void LIZ(int i, YAZ yaz) {
        this.LJLJJI = i;
        this.LL.reset();
        this.LL.setDuration(this.LJLJLJ);
        this.LL.setAnimationListener(yaz);
        this.LL.setInterpolator(this.LJLLLL);
        View view = this.LJLIL;
        if (view != null) {
            view.startAnimation(this.LL);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() > 1) {
            if (getChildCount() <= 2 || isInEditMode()) {
                if (this.LJLLLLLL == null) {
                    View childAt = getChildAt(0);
                    this.LJLLLLLL = childAt;
                    measureChild(childAt, i, i2);
                    View view = this.LJLLLLLL;
                    if (view != null) {
                        this.LJLZ = view.getMeasuredHeight();
                    }
                    this.LJLJL = this.LJLZ;
                }
                getChildAt(1).measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
                return;
            }
            throw new IllegalStateException("SwipeRefreshLayout can only host two children");
        }
        throw new IllegalStateException("SwipeRefreshLayout must have the headerview and contentview");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0 || getChildCount() == 1) {
            return;
        }
        View childAt = getChildAt(1);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop() + this.LJLJLLL;
        int paddingLeft2 = ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft;
        childAt.layout(paddingLeft, paddingTop, paddingLeft2, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        View view = this.LJLLLLLL;
        if (view == null) {
            return;
        }
        view.layout(paddingLeft, paddingTop - this.LJLZ, paddingLeft2, paddingTop);
    }
}
