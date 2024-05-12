package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.VTb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79787VTb extends ViewGroup {
    public View LJLIL;
    public View LJLILLLLZI;
    public final Rect LJLJI;
    public final Rect LJLJJI;
    public final Rect LJLJJL;
    public final Rect LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public volatile boolean LJLJLLL;
    public volatile boolean LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public float LJLZ;
    public float LJZ;
    public float LJZI;
    public C270714l LJZL;
    public C16230kN LL;
    public InterfaceC79790VTe LLD;
    public final C79788VTc LLF;
    public final C79789VTd LLFF;

    private final int getMainOpenLeft() {
        int i = this.LJLLLLLL;
        if (i != 1) {
            if (i != 2) {
                if (i != 4 && i != 8) {
                    return 0;
                }
                return this.LJLJI.left;
            }
            int i2 = this.LJLJI.left;
            View view = this.LJLILLLLZI;
            if (view != null) {
                return i2 - view.getWidth();
            }
            o.LJIIZILJ();
            throw null;
        }
        int i3 = this.LJLJI.left;
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            return i3 + view2.getWidth();
        }
        o.LJIIZILJ();
        throw null;
    }

    private final int getMainOpenTop() {
        int i = this.LJLLLLLL;
        if (i != 1 && i != 2) {
            if (i != 4) {
                if (i != 8) {
                    return 0;
                }
                int i2 = this.LJLJI.top;
                View view = this.LJLILLLLZI;
                if (view != null) {
                    return i2 - view.getHeight();
                }
                o.LJIIZILJ();
                throw null;
            }
            int i3 = this.LJLJI.top;
            View view2 = this.LJLILLLLZI;
            if (view2 != null) {
                return i3 + view2.getHeight();
            }
            o.LJIIZILJ();
            throw null;
        }
        return this.LJLJI.top;
    }

    private final int getSecOpenLeft() {
        int i;
        if (this.LJLLJ == 0 || (i = this.LJLLLLLL) == 8 || i == 4) {
            return this.LJLJJL.left;
        }
        if (i == 1) {
            int i2 = this.LJLJJL.left;
            View view = this.LJLILLLLZI;
            if (view != null) {
                return view.getWidth() + i2;
            }
            o.LJIIZILJ();
            throw null;
        }
        int i3 = this.LJLJJL.left;
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            return i3 - view2.getWidth();
        }
        o.LJIIZILJ();
        throw null;
    }

    private final int getSecOpenTop() {
        int i;
        if (this.LJLLJ == 0 || (i = this.LJLLLLLL) == 1 || i == 2) {
            return this.LJLJJL.top;
        }
        if (i == 4) {
            int i2 = this.LJLJJL.top;
            View view = this.LJLILLLLZI;
            if (view != null) {
                return view.getHeight() + i2;
            }
            o.LJIIZILJ();
            throw null;
        }
        int i3 = this.LJLJJL.top;
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            return i3 - view2.getHeight();
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // android.view.View
    public final void computeScroll() {
        C270714l c270714l = this.LJZL;
        if (c270714l != null) {
            if (c270714l.LJIIIIZZ()) {
                C16300kU.LJIIJ(this);
                return;
            }
            return;
        }
        o.LJIIZILJ();
        throw null;
    }

    public final int getClosestEdgeDistance() {
        int i = this.LJLLLLLL;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        return 0;
                    }
                    int i2 = this.LJLJI.bottom;
                    View view = this.LJLILLLLZI;
                    if (view != null) {
                        int height = i2 - view.getHeight();
                        int i3 = this.LJLJI.bottom;
                        View view2 = this.LJLIL;
                        if (view2 != null) {
                            int bottom = i3 - view2.getBottom();
                            View view3 = this.LJLIL;
                            if (view3 != null) {
                                return Math.min(bottom, view3.getBottom() - height);
                            }
                            o.LJIIZILJ();
                            throw null;
                        }
                        o.LJIIZILJ();
                        throw null;
                    }
                    o.LJIIZILJ();
                    throw null;
                }
                int i4 = this.LJLJI.top;
                View view4 = this.LJLILLLLZI;
                if (view4 != null) {
                    int height2 = view4.getHeight() + i4;
                    View view5 = this.LJLIL;
                    if (view5 != null) {
                        int bottom2 = view5.getBottom() - height2;
                        View view6 = this.LJLIL;
                        if (view6 != null) {
                            return Math.min(bottom2, height2 - view6.getTop());
                        }
                        o.LJIIZILJ();
                        throw null;
                    }
                    o.LJIIZILJ();
                    throw null;
                }
                o.LJIIZILJ();
                throw null;
            }
            int i5 = this.LJLJI.right;
            View view7 = this.LJLILLLLZI;
            if (view7 != null) {
                int width = i5 - view7.getWidth();
                View view8 = this.LJLIL;
                if (view8 != null) {
                    int right = view8.getRight() - width;
                    int i6 = this.LJLJI.right;
                    View view9 = this.LJLIL;
                    if (view9 != null) {
                        return Math.min(right, i6 - view9.getRight());
                    }
                    o.LJIIZILJ();
                    throw null;
                }
                o.LJIIZILJ();
                throw null;
            }
            o.LJIIZILJ();
            throw null;
        }
        int i7 = this.LJLJI.left;
        View view10 = this.LJLILLLLZI;
        if (view10 != null) {
            int width2 = view10.getWidth() + i7;
            View view11 = this.LJLIL;
            if (view11 != null) {
                int left = view11.getLeft() - this.LJLJI.left;
                View view12 = this.LJLIL;
                if (view12 != null) {
                    return Math.min(left, width2 - view12.getLeft());
                }
                o.LJIIZILJ();
                throw null;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }

    public final int getHalfwayPivotHorizontal() {
        if (this.LJLLLLLL == 1) {
            int i = this.LJLJI.left;
            View view = this.LJLILLLLZI;
            if (view != null) {
                return (view.getWidth() / 2) + i;
            }
            o.LJIIZILJ();
            throw null;
        }
        int i2 = this.LJLJI.right;
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            return i2 - (view2.getWidth() / 2);
        }
        o.LJIIZILJ();
        throw null;
    }

    public final int getHalfwayPivotVertical() {
        if (this.LJLLLLLL == 4) {
            int i = this.LJLJI.top;
            View view = this.LJLILLLLZI;
            if (view != null) {
                return (view.getHeight() / 2) + i;
            }
            o.LJIIZILJ();
            throw null;
        }
        int i2 = this.LJLJI.bottom;
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            return i2 - (view2.getHeight() / 2);
        }
        o.LJIIZILJ();
        throw null;
    }

    public final int getDragEdge() {
        return this.LJLLLLLL;
    }

    public final int getMinFlingVelocity() {
        return this.LJLLI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79787VTb(Context context) {
        super(context);
        o.LJIIJ(context, "context");
        this.LJLJI = new Rect();
        this.LJLJJI = new Rect();
        this.LJLJJL = new Rect();
        this.LJLJJLL = new Rect();
        this.LJLLI = 300;
        this.LJLLJ = 1;
        this.LJLLLLLL = 1;
        this.LJZ = -1.0f;
        this.LJZI = -1.0f;
        this.LLF = new C79788VTc(this, context);
        this.LLFF = new C79789VTd(this);
    }

    public final void LIZ(VRK vrk) {
        View view = this.LJLILLLLZI;
        if (view != null) {
            if (C78996UzQ.LJJIIJZLJL(view)) {
                C78996UzQ.LJI();
            }
            removeView(view);
        }
        this.LJLILLLLZI = vrk;
        addView(vrk, 0);
    }

    public final void LIZIZ(boolean z) {
        this.LJLJLJ = false;
        if (z) {
            this.LJLLILLLL = 1;
            C270714l c270714l = this.LJZL;
            if (c270714l != null) {
                View view = this.LJLIL;
                if (view != null) {
                    Rect rect = this.LJLJI;
                    c270714l.LJIJJLI(rect.left, rect.top, view);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            } else {
                o.LJIIZILJ();
                throw null;
            }
        } else {
            this.LJLLILLLL = 0;
            C270714l c270714l2 = this.LJZL;
            if (c270714l2 != null) {
                c270714l2.LIZ();
                View view2 = this.LJLIL;
                if (view2 != null) {
                    Rect rect2 = this.LJLJI;
                    view2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
                    View view3 = this.LJLILLLLZI;
                    if (view3 != null) {
                        Rect rect3 = this.LJLJJL;
                        view3.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        C16300kU.LJIIJ(this);
    }

    public final void LIZJ(boolean z) {
        this.LJLJLJ = true;
        if (z) {
            this.LJLLILLLL = 3;
            C270714l c270714l = this.LJZL;
            if (c270714l != null) {
                View view = this.LJLIL;
                if (view != null) {
                    Rect rect = this.LJLJJI;
                    c270714l.LJIJJLI(rect.left, rect.top, view);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            } else {
                o.LJIIZILJ();
                throw null;
            }
        } else {
            this.LJLLILLLL = 2;
            C270714l c270714l2 = this.LJZL;
            if (c270714l2 != null) {
                c270714l2.LIZ();
                View view2 = this.LJLIL;
                if (view2 != null) {
                    Rect rect2 = this.LJLJJI;
                    view2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
                    View view3 = this.LJLILLLLZI;
                    if (view3 != null) {
                        Rect rect3 = this.LJLJJLL;
                        view3.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        C16300kU.LJIIJ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79787VTb.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIJ(event, "event");
        C16230kN c16230kN = this.LL;
        if (c16230kN != null) {
            c16230kN.LIZ(event);
            C270714l c270714l = this.LJZL;
            if (c270714l != null) {
                c270714l.LJIILIIL(event);
                return true;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }

    public final void setDragEdge(int i) {
        this.LJLLLLLL = i;
    }

    public final void setLockDrag(boolean z) {
        this.LJLL = z;
    }

    public final void setMinFlingVelocity(int i) {
        this.LJLLI = i;
    }

    public final void setMode$x_element_reveal_view_release(int i) {
        this.LJLLJ = i;
    }

    public final void setSwipeListener(InterfaceC79790VTe interfaceC79790VTe) {
        this.LLD = interfaceC79790VTe;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (getChildCount() >= 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int childCount = getChildCount();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View child = getChildAt(i5);
                measureChild(child, i, i2);
                o.LJFF(child, "child");
                i3 = Math.max(child.getMeasuredWidth(), i3);
                i4 = Math.max(child.getMeasuredHeight(), i4);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, mode);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, mode2);
            int size = View.MeasureSpec.getSize(makeMeasureSpec);
            int size2 = View.MeasureSpec.getSize(makeMeasureSpec2);
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                View child2 = getChildAt(i6);
                o.LJFF(child2, "child");
                ViewGroup.LayoutParams layoutParams2 = child2.getLayoutParams();
                if (layoutParams2 != null) {
                    if (layoutParams2.height == -1) {
                        child2.setMinimumHeight(size2);
                    }
                    if (layoutParams2.width == -1) {
                        child2.setMinimumWidth(size);
                    }
                }
                measureChild(child2, makeMeasureSpec, makeMeasureSpec2);
                i3 = Math.max(child2.getMeasuredWidth(), i3);
                i4 = Math.max(child2.getMeasuredHeight(), i4);
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + i3;
            int paddingBottom = getPaddingBottom() + getPaddingTop() + i4;
            if (mode != 1073741824) {
                if (layoutParams.width == -1) {
                    paddingRight = size;
                }
                if (mode == Integer.MIN_VALUE) {
                    size = Math.min(paddingRight, size);
                } else {
                    size = paddingRight;
                }
            }
            if (mode2 != 1073741824) {
                if (layoutParams.height == -1) {
                    paddingBottom = size2;
                }
                if (mode2 == Integer.MIN_VALUE) {
                    size2 = Math.min(paddingBottom, size2);
                } else {
                    size2 = paddingBottom;
                }
            }
            setMeasuredDimension(size, size2);
            return;
        }
        throw new RuntimeException("Layout must have two children");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int min;
        int min2;
        int min3;
        int min4;
        boolean z2;
        boolean z3;
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        while (i6 < childCount) {
            View child = getChildAt(i6);
            int paddingLeft = getPaddingLeft();
            int max = Math.max((i3 - getPaddingRight()) - i, i5);
            int paddingTop = getPaddingTop();
            int max2 = Math.max((i4 - getPaddingBottom()) - i2, i5);
            o.LJFF(child, "child");
            int measuredHeight = child.getMeasuredHeight();
            int measuredWidth = child.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.height == -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (layoutParams.width == -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                    measuredHeight = max2 - paddingTop;
                    if (layoutParams != null) {
                        layoutParams.height = measuredHeight;
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                if (z3) {
                    measuredWidth = max - paddingLeft;
                    if (layoutParams != null) {
                        layoutParams.width = measuredWidth;
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
            }
            int i7 = this.LJLLLLLL;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 8) {
                            min = 0;
                            min2 = 0;
                            min3 = 0;
                            min4 = 0;
                        } else {
                            min = Math.min(getPaddingLeft(), max);
                            min2 = Math.max(((i4 - measuredHeight) - getPaddingBottom()) - i2, paddingTop);
                            min3 = Math.min(getPaddingLeft() + measuredWidth, max);
                            min4 = Math.max((i4 - getPaddingBottom()) - i2, paddingTop);
                        }
                    }
                } else {
                    min = Math.max(((i3 - measuredWidth) - getPaddingRight()) - i, paddingLeft);
                    min2 = Math.min(getPaddingTop(), max2);
                    min3 = Math.max((i3 - getPaddingRight()) - i, paddingLeft);
                    min4 = Math.min(getPaddingTop() + measuredHeight, max2);
                }
                child.layout(min, min2, min3, min4);
                i6++;
                i5 = 0;
            }
            min = Math.min(getPaddingLeft(), max);
            min2 = Math.min(getPaddingTop(), max2);
            min3 = Math.min(getPaddingLeft() + measuredWidth, max);
            min4 = Math.min(getPaddingTop() + measuredHeight, max2);
            child.layout(min, min2, min3, min4);
            i6++;
            i5 = 0;
        }
        if (this.LJLLJ == 1) {
            int i8 = this.LJLLLLLL;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 4) {
                        if (i8 == 8) {
                            View view = this.LJLILLLLZI;
                            if (view != null) {
                                view.offsetTopAndBottom(view.getHeight());
                            } else {
                                o.LJIIZILJ();
                                throw null;
                            }
                        }
                    } else {
                        View view2 = this.LJLILLLLZI;
                        if (view2 != null) {
                            view2.offsetTopAndBottom(-view2.getHeight());
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                    }
                } else {
                    View view3 = this.LJLILLLLZI;
                    if (view3 != null) {
                        view3.offsetLeftAndRight(view3.getWidth());
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
            } else {
                View view4 = this.LJLILLLLZI;
                if (view4 != null) {
                    view4.offsetLeftAndRight(-view4.getWidth());
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
        }
        Rect rect = this.LJLJI;
        View view5 = this.LJLIL;
        if (view5 != null) {
            int left = view5.getLeft();
            View view6 = this.LJLIL;
            if (view6 != null) {
                int top = view6.getTop();
                View view7 = this.LJLIL;
                if (view7 != null) {
                    int right = view7.getRight();
                    View view8 = this.LJLIL;
                    if (view8 != null) {
                        rect.set(left, top, right, view8.getBottom());
                        Rect rect2 = this.LJLJJL;
                        View view9 = this.LJLILLLLZI;
                        if (view9 != null) {
                            int left2 = view9.getLeft();
                            View view10 = this.LJLILLLLZI;
                            if (view10 != null) {
                                int top2 = view10.getTop();
                                View view11 = this.LJLILLLLZI;
                                if (view11 != null) {
                                    int right2 = view11.getRight();
                                    View view12 = this.LJLILLLLZI;
                                    if (view12 != null) {
                                        rect2.set(left2, top2, right2, view12.getBottom());
                                        Rect rect3 = this.LJLJJI;
                                        int mainOpenLeft = getMainOpenLeft();
                                        int mainOpenTop = getMainOpenTop();
                                        int mainOpenLeft2 = getMainOpenLeft();
                                        View view13 = this.LJLIL;
                                        if (view13 != null) {
                                            int width = view13.getWidth() + mainOpenLeft2;
                                            int mainOpenTop2 = getMainOpenTop();
                                            View view14 = this.LJLIL;
                                            if (view14 != null) {
                                                rect3.set(mainOpenLeft, mainOpenTop, width, view14.getHeight() + mainOpenTop2);
                                                Rect rect4 = this.LJLJJLL;
                                                int secOpenLeft = getSecOpenLeft();
                                                int secOpenTop = getSecOpenTop();
                                                int secOpenLeft2 = getSecOpenLeft();
                                                View view15 = this.LJLILLLLZI;
                                                if (view15 != null) {
                                                    int width2 = view15.getWidth() + secOpenLeft2;
                                                    int secOpenTop2 = getSecOpenTop();
                                                    View view16 = this.LJLILLLLZI;
                                                    if (view16 != null) {
                                                        rect4.set(secOpenLeft, secOpenTop, width2, view16.getHeight() + secOpenTop2);
                                                        if (this.LJLJLJ) {
                                                            LIZJ(false);
                                                        } else {
                                                            LIZIZ(false);
                                                        }
                                                        View view17 = this.LJLIL;
                                                        if (view17 != null) {
                                                            this.LJLLL = view17.getLeft();
                                                            View view18 = this.LJLIL;
                                                            if (view18 != null) {
                                                                this.LJLLLL = view18.getTop();
                                                                return;
                                                            } else {
                                                                o.LJIIZILJ();
                                                                throw null;
                                                            }
                                                        }
                                                        o.LJIIZILJ();
                                                        throw null;
                                                    }
                                                    o.LJIIZILJ();
                                                    throw null;
                                                }
                                                o.LJIIZILJ();
                                                throw null;
                                            }
                                            o.LJIIZILJ();
                                            throw null;
                                        }
                                        o.LJIIZILJ();
                                        throw null;
                                    }
                                    o.LJIIZILJ();
                                    throw null;
                                }
                                o.LJIIZILJ();
                                throw null;
                            }
                            o.LJIIZILJ();
                            throw null;
                        }
                        o.LJIIZILJ();
                        throw null;
                    }
                    o.LJIIZILJ();
                    throw null;
                }
                o.LJIIZILJ();
                throw null;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }
}
