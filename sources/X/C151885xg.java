package X;

import Y.ALAdapterS1S0100000_2;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151885xg extends RelativeLayout {
    public static final int LJLZ = C17N.LJIILL(52.0d);
    public static final int LJZ = C17N.LJIILL(166.0d);
    public static final int LJZI = C17N.LJIILL(14.0d);
    public static final int LJZL;
    public static final int LL;
    public static final int LLD;
    public final C151555x9 LJLIL;
    public final float LJLILLLLZI;
    public final List<Integer> LJLJI;
    public final List<Integer> LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public InterfaceC151945xm LJLJLJ;
    public InterfaceC151945xm LJLJLLL;
    public InterfaceC151935xl LJLL;
    public boolean LJLLI;
    public final View LJLLILLLL;
    public final View LJLLJ;
    public final View LJLLL;
    public C270714l LJLLLL;
    public final FrameLayout LJLLLLLL;

    static {
        int LJIILL = C17N.LJIILL(20.0d);
        LJZL = LJIILL;
        LL = LJIILL / 2;
        LLD = C17N.LJIILL(15.0d);
    }

    private final int getMinControlHeight() {
        return LJZ;
    }

    public final int getControlAreaHeight() {
        return this.LJLJJL;
    }

    public final View getControlLayout() {
        return this.LJLLL;
    }

    public final FrameLayout getGrabberView() {
        return this.LJLLLLLL;
    }

    public final View getNavBarLayout() {
        return this.LJLLILLLL;
    }

    public final View getPreviewLayout() {
        return this.LJLLJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C151885xg(C151555x9 c151555x9) {
        super(c151555x9.LIZ, null, 0);
        int i;
        int i2;
        new LinkedHashMap();
        this.LJLIL = c151555x9;
        this.LJLILLLLZI = 0.75f;
        this.LJLJI = new ArrayList();
        this.LJLJJI = new ArrayList();
        this.LJLJJL = -1;
        this.LJLLI = true;
        if (!c151555x9.LIZLLL.isEmpty()) {
            if (!c151555x9.LJII) {
                Integer LJI = C79045V0n.LJI(R.attr.d4, c151555x9.LIZ);
                if (LJI != null) {
                    i2 = LJI.intValue();
                } else {
                    i2 = 0;
                }
                setBackgroundColor(i2);
            }
            if (c151555x9.LIZIZ.isExist$tools_creative_ui_release()) {
                EnumC151645xI enumC151645xI = c151555x9.LIZIZ;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, LJLZ);
                View view = c151555x9.LJ;
                view = view == null ? new FrameLayout(getContext()) : view;
                if (enumC151645xI.isInTop$tools_creative_ui_release()) {
                    addView(view, layoutParams);
                } else if (enumC151645xI.isInBottom$tools_creative_ui_release()) {
                    layoutParams.addRule(12);
                    addView(view, layoutParams);
                }
                if (view.getId() == -1) {
                    view.setId(View.generateViewId());
                }
                this.LJLLILLLL = view;
            }
            View view2 = c151555x9.LJI;
            view2 = view2 == null ? new FrameLayout(getContext()) : view2;
            C151915xj c151915xj = (C151915xj) ORZ.LJLLLL(c151555x9.LIZLLL);
            if (c151915xj != null) {
                i = c151915xj.LIZ;
                if (i < 0) {
                    i = (int) (c151915xj.LIZIZ * getHeight());
                }
            } else {
                i = 0;
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, i);
            layoutParams2.addRule(12);
            if (c151555x9.LIZIZ.isInBottom$tools_creative_ui_release()) {
                layoutParams2.bottomMargin = LJLZ;
            }
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            addView(view2, layoutParams2);
            this.LJLLL = view2;
            if (c151555x9.LIZJ == EnumC151655xJ.VARIABLE) {
                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.azd, this, false);
                o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.FrameLayout");
                FrameLayout frameLayout = (FrameLayout) LLLLIILL;
                int i3 = LJZI;
                int i4 = LLD;
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (i4 * 2) + i3);
                ViewGroup.LayoutParams layoutParams4 = frameLayout.findViewById(R.id.dy2).getLayoutParams();
                o.LJII(layoutParams4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ((FrameLayout.LayoutParams) layoutParams4).gravity = 17;
                layoutParams3.addRule(2, view2.getId());
                int i5 = -i4;
                layoutParams3.bottomMargin = i5;
                layoutParams3.topMargin = i5;
                frameLayout.setId(View.generateViewId());
                addView(frameLayout, layoutParams3);
                this.LJLLLLLL = frameLayout;
            }
            View view3 = c151555x9.LJFF;
            view3 = view3 == null ? new FrameLayout(getContext()) : view3;
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
            if (c151555x9.LIZIZ.isInTop$tools_creative_ui_release()) {
                View view4 = this.LJLLILLLL;
                if (view4 != null) {
                    layoutParams5.addRule(3, view4.getId());
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            if (c151555x9.LIZJ.needGrabber$tools_creative_ui_release()) {
                FrameLayout frameLayout2 = this.LJLLLLLL;
                if (frameLayout2 != null) {
                    layoutParams5.addRule(2, frameLayout2.getId());
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                layoutParams5.addRule(2, view2.getId());
            }
            addView(view3, layoutParams5);
            this.LJLLJ = view3;
            if (c151555x9.LIZJ.needGrabber$tools_creative_ui_release()) {
                this.LJLLLL = C270714l.LJIIJ(this, new AbstractC270614k() { // from class: X.5xh
                    @Override // X.AbstractC270614k
                    public final int getViewVerticalDragRange(View child) {
                        o.LJIIIZ(child, "child");
                        return C151885xg.this.getMeasuredHeight() - child.getMeasuredHeight();
                    }

                    @Override // X.AbstractC270614k
                    public final void onViewDragStateChanged(int i6) {
                        super.onViewDragStateChanged(i6);
                        if (i6 == 1) {
                            C151885xg c151885xg = C151885xg.this;
                            c151885xg.LJLJL = c151885xg.LJLJJL;
                            InterfaceC151935xl interfaceC151935xl = c151885xg.LJLL;
                            if (interfaceC151935xl != null) {
                                interfaceC151935xl.LIZ(1);
                            }
                        }
                    }

                    @Override // X.AbstractC270614k
                    public final boolean tryCaptureView(View child, int i6) {
                        o.LJIIIZ(child, "child");
                        C151885xg c151885xg = C151885xg.this;
                        if (!c151885xg.LJLLI) {
                            return false;
                        }
                        return o.LJ(child, c151885xg.getGrabberView());
                    }

                    @Override // X.AbstractC270614k
                    public final int clampViewPositionVertical(View child, int i6, int i7) {
                        o.LJIIIZ(child, "child");
                        int height = C151885xg.this.getHeight() - ((Number) ORZ.LLFF(C151885xg.this.LJLJI)).intValue();
                        int i8 = C151885xg.LJZI;
                        int i9 = C151885xg.LLD;
                        int i10 = C151885xg.LJZL;
                        int i11 = ((height - i8) - i9) - i10;
                        int height2 = (((C151885xg.this.getHeight() - ((Number) ORZ.LJLLJ(C151885xg.this.LJLJI)).intValue()) - i8) - i9) + i10;
                        if (C151885xg.this.LJLIL.LIZIZ.isInBottom$tools_creative_ui_release()) {
                            int i12 = C151885xg.LJLZ;
                            i11 -= i12;
                            height2 -= i12;
                        }
                        return Math.min(height2, Math.max(i11, i6));
                    }

                    @Override // X.AbstractC270614k
                    public final void onViewReleased(View releasedChild, float f, float f2) {
                        final int height;
                        int height2;
                        o.LJIIIZ(releasedChild, "releasedChild");
                        super.onViewReleased(releasedChild, f, f2);
                        if (!o.LJ(releasedChild, C151885xg.this.getGrabberView())) {
                            return;
                        }
                        int LIZJ = C151885xg.LIZJ(C151885xg.this.getControlLayout().getHeight(), C151885xg.this.LJLJI);
                        int indexOf = ((ArrayList) C151885xg.this.LJLJJI).indexOf(Integer.valueOf(LIZJ));
                        if (indexOf > 0) {
                            C151885xg.this.LJLJJLL = indexOf;
                        }
                        C151885xg c151885xg = C151885xg.this;
                        c151885xg.LJLJJL = LIZJ;
                        if (c151885xg.LJLIL.LIZIZ.isInTop$tools_creative_ui_release()) {
                            height = (C151885xg.this.getPreviewLayout().getHeight() + C151885xg.LJLZ) - C151885xg.LLD;
                        } else {
                            height = C151885xg.this.getPreviewLayout().getHeight() - C151885xg.LLD;
                        }
                        if (C151885xg.this.LJLIL.LIZIZ.isInBottom$tools_creative_ui_release()) {
                            height2 = C151885xg.this.getHeight() - C151885xg.LJLZ;
                        } else {
                            height2 = C151885xg.this.getHeight();
                        }
                        final int i6 = ((height2 - LIZJ) - C151885xg.LJZI) - C151885xg.LLD;
                        InterfaceC151935xl interfaceC151935xl = C151885xg.this.LJLL;
                        if (interfaceC151935xl != null) {
                            interfaceC151935xl.LIZ(2);
                        }
                        final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        final C151885xg c151885xg2 = C151885xg.this;
                        ofFloat.setDuration(300L);
                        ofFloat.setInterpolator(C18950ol.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.5xi
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator it) {
                                o.LJIIIZ(it, "it");
                                C151885xg.this.LIZIZ((int) ((ofFloat.getAnimatedFraction() * (i6 - r1)) + height));
                            }
                        });
                        ofFloat.addListener(new ALAdapterS1S0100000_2(c151885xg2, 29));
                        ofFloat.start();
                    }

                    @Override // X.AbstractC270614k
                    public final void onViewPositionChanged(View changedView, int i6, int i7, int i8, int i9) {
                        boolean z;
                        o.LJIIIZ(changedView, "changedView");
                        super.onViewPositionChanged(changedView, i6, i7, i8, i9);
                        C151885xg.this.LIZIZ(i7);
                        int i10 = C151885xg.LIZ(C151885xg.this.getControlLayout()).height;
                        int LIZJ = C151885xg.LIZJ(i10, C151885xg.this.LJLJI);
                        StringBuilder LJ = C7MY.LJ("controlHeight ", i10, " lastClosestControlHeight ");
                        C15890jp.LIZIZ(LJ, C151885xg.this.LJLJL, " curClosestHeight ", LIZJ, " vibrator ");
                        if (LIZJ != C151885xg.this.LJLJL) {
                            z = true;
                        } else {
                            z = false;
                        }
                        LJ.append(z);
                        X1D.LIZIZ(LJ);
                        C151885xg c151885xg = C151885xg.this;
                        if (LIZJ != c151885xg.LJLJL) {
                            c151885xg.LJLJL = LIZJ;
                            new C61996OUu(c151885xg.LJLIL.LIZ).LIZ(0);
                        }
                        int i11 = i10 - i9;
                        int intValue = ((Number) ORZ.LJLLJ(C151885xg.this.LJLJI)).intValue();
                        int i12 = C151885xg.LL;
                        int i13 = intValue - i12;
                        if (i11 <= i13 && i13 <= i10 && i9 > 0) {
                            C151885xg c151885xg2 = C151885xg.this;
                            c151885xg2.getClass();
                            new C61996OUu(c151885xg2.LJLIL.LIZ).LIZ(0);
                            return;
                        }
                        int i14 = i10 + i9;
                        int intValue2 = ((Number) ORZ.LLFF(C151885xg.this.LJLJI)).intValue() + i12;
                        if (i14 > intValue2 || intValue2 > i10 || i9 >= 0) {
                            return;
                        }
                        C151885xg c151885xg3 = C151885xg.this;
                        c151885xg3.getClass();
                        new C61996OUu(c151885xg3.LJLIL.LIZ).LIZ(0);
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The controlAreaHeight of TTKCreationCanvasViewConfig is empty");
    }

    public static RelativeLayout.LayoutParams LIZ(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        return (RelativeLayout.LayoutParams) layoutParams;
    }

    public final void LIZIZ(int i) {
        RelativeLayout.LayoutParams LIZ = LIZ(this.LJLLL);
        int height = (getHeight() - i) - LJZI;
        int i2 = LLD;
        LIZ.height = height - i2;
        if (this.LJLIL.LIZIZ.isInBottom$tools_creative_ui_release()) {
            LIZ.height -= LJLZ;
        }
        RelativeLayout.LayoutParams LIZ2 = LIZ(this.LJLLJ);
        LIZ2.height = i + i2;
        if (this.LJLIL.LIZIZ.isInTop$tools_creative_ui_release()) {
            LIZ2.height -= LJLZ;
        }
        requestLayout();
        InterfaceC151945xm interfaceC151945xm = this.LJLJLJ;
        if (interfaceC151945xm != null) {
            interfaceC151945xm.LIZ(LIZ(this.LJLLJ).height);
        }
        InterfaceC151945xm interfaceC151945xm2 = this.LJLJLLL;
        if (interfaceC151945xm2 != null) {
            interfaceC151945xm2.LIZ(LIZ(this.LJLLL).height);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            C270714l c270714l = this.LJLLLL;
            if (c270714l != null) {
                return c270714l.LJIJJ(motionEvent);
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        C270714l c270714l = this.LJLLLL;
        if (c270714l == null) {
            return super.onTouchEvent(event);
        }
        c270714l.LJIILIIL(event);
        return true;
    }

    public final void setControlHeightChangeListener(InterfaceC151945xm interfaceC151945xm) {
        this.LJLJLLL = interfaceC151945xm;
    }

    public final void setDraggable(boolean z) {
        this.LJLLI = z;
    }

    public final void setGrabberViewStateChangeListener(InterfaceC151935xl interfaceC151935xl) {
        this.LJLL = interfaceC151935xl;
    }

    public final void setPreviewHeightChangeListener(InterfaceC151945xm interfaceC151945xm) {
        this.LJLJLJ = interfaceC151945xm;
    }

    public static int LIZJ(int i, List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return i;
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                int intValue = ((Number) next).intValue();
                if (i3 >= arrayList.size()) {
                    return intValue;
                }
                if (Math.abs(i - intValue) <= Math.abs(i - ((Number) ListProtector.get(arrayList, i3)).intValue())) {
                    return intValue;
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return ((Number) ORZ.LLFF(arrayList)).intValue();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != 0) {
            ((ArrayList) this.LJLJI).clear();
            C151915xj c151915xj = (C151915xj) ORZ.LJLLLLLL(this.LJLJJLL, this.LJLIL.LIZLLL);
            if (c151915xj != null) {
                int i5 = c151915xj.LIZ;
                if (i5 < 0) {
                    i5 = (int) (i2 * c151915xj.LIZIZ);
                }
                this.LJLJJL = i5;
            }
            for (C151915xj c151915xj2 : this.LJLIL.LIZLLL) {
                int i6 = c151915xj2.LIZ;
                if (i6 < 0) {
                    int i7 = (int) (i2 * c151915xj2.LIZIZ);
                    ((ArrayList) this.LJLJJI).add(Integer.valueOf(i7));
                    int minControlHeight = getMinControlHeight();
                    if (i7 <= ((int) (getHeight() * this.LJLILLLLZI)) && minControlHeight <= i7) {
                        ((ArrayList) this.LJLJI).add(Integer.valueOf(i7));
                    }
                } else {
                    ((ArrayList) this.LJLJJI).add(Integer.valueOf(i6));
                    int i8 = c151915xj2.LIZ;
                    int minControlHeight2 = getMinControlHeight();
                    if (i8 <= ((int) (getHeight() * this.LJLILLLLZI)) && minControlHeight2 <= i8) {
                        ((ArrayList) this.LJLJI).add(Integer.valueOf(c151915xj2.LIZ));
                    }
                }
            }
            C40675Fxn.LJJLIIIIJ(this.LJLJI);
            C151915xj c151915xj3 = (C151915xj) ORZ.LJLLLLLL(this.LJLJJLL, this.LJLIL.LIZLLL);
            if (c151915xj3 != null && c151915xj3.LIZ < 0) {
                RelativeLayout.LayoutParams LIZ = LIZ(this.LJLLL);
                int i9 = this.LJLJJL;
                LIZ.height = i9;
                InterfaceC151945xm interfaceC151945xm = this.LJLJLLL;
                if (interfaceC151945xm != null) {
                    interfaceC151945xm.LIZ(i9);
                }
                requestLayout();
            }
            int i10 = i2 - this.LJLJJL;
            if (this.LJLIL.LIZIZ.isExist$tools_creative_ui_release()) {
                i10 -= LJLZ;
            }
            if (this.LJLIL.LIZJ.needGrabber$tools_creative_ui_release()) {
                i10 -= LJZI;
            }
            InterfaceC151945xm interfaceC151945xm2 = this.LJLJLJ;
            if (interfaceC151945xm2 != null) {
                interfaceC151945xm2.LIZ(i10);
            }
        }
    }
}
