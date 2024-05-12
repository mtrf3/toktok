package X;

import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.settings.PinchToClearModeSettings;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KTY implements View.OnTouchListener {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public EnumC223028p8 LJLJJI;
    public ScaleGestureDetector LJLJJL;
    public ViewGroup LJLJJLL;
    public ViewGroup LJLJL;
    public View LJLJLJ;
    public boolean LJLJLLL;
    public InterfaceC47247IgV LJLL;
    public FrameLayout LJLLI;
    public InterfaceC222998p5 LJLLILLLL;
    public ILJ LJLLJ;
    public PointF LJLLL;
    public PointF LJLLLL;
    public PointF LJLLLLLL;
    public float LJLZ;
    public final ScaleGestureDetectorOnScaleGestureListenerC51759KTb LJZ;

    public final void LIZJ() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator x;
        ViewPropertyAnimator y;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator withStartAction;
        ViewPropertyAnimator withEndAction;
        FrameLayout frameLayout = this.LJLLI;
        if (frameLayout != null && (animate = frameLayout.animate()) != null && (x = animate.x(this.LJLLLLLL.x)) != null && (y = x.y(this.LJLLLLLL.y)) != null && (scaleX = y.scaleX(1.0f)) != null && (scaleY = scaleX.scaleY(1.0f)) != null && (interpolator = scaleY.setInterpolator(new DecelerateInterpolator())) != null && (withStartAction = interpolator.withStartAction(new ARunnableS44S0100000_8(this, 174))) != null && (withEndAction = withStartAction.withEndAction(new ARunnableS44S0100000_8(this, 175))) != null) {
            withEndAction.start();
        }
    }

    public final void LJ() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewPropertyAnimator animate;
        if (!this.LJLJLLL) {
            return;
        }
        FrameLayout frameLayout = this.LJLLI;
        if (frameLayout != null && (animate = frameLayout.animate()) != null) {
            animate.cancel();
        }
        InterfaceC47247IgV interfaceC47247IgV = this.LJLL;
        if (interfaceC47247IgV != null) {
            interfaceC47247IgV.O7();
        }
        View view = this.LJLJLJ;
        if (view != null && (viewGroup2 = this.LJLJL) != null && viewGroup2.indexOfChild(view) != -1 && (viewGroup3 = this.LJLJL) != null) {
            C16880lQ.LJLLL(view, viewGroup3);
        }
        FrameLayout frameLayout2 = this.LJLLI;
        if (frameLayout2 != null) {
            ViewGroup viewGroup4 = this.LJLJL;
            if (viewGroup4 != null && viewGroup4.indexOfChild(frameLayout2) != -1 && (viewGroup = this.LJLJL) != null) {
                C16880lQ.LJLLL(frameLayout2, viewGroup);
            }
            View childAt = frameLayout2.getChildAt(0);
            if (childAt != null) {
                C16880lQ.LJLLLL(childAt, frameLayout2);
                ViewGroup viewGroup5 = this.LJLJJLL;
                if (viewGroup5 != null) {
                    viewGroup5.addView(childAt);
                }
            }
        }
        ViewGroup viewGroup6 = this.LJLJJLL;
        if (viewGroup6 != null) {
            viewGroup6.setVisibility(0);
        }
        this.LJLLI = null;
        this.LJLJLJ = null;
        this.LJLZ = 1.0f;
        this.LJLLLL = new PointF();
        this.LJLLL = new PointF();
        this.LJLJLLL = false;
        this.LJLLJ = ILJ.IDLE;
        InterfaceC222998p5 interfaceC222998p5 = this.LJLLILLLL;
        if (interfaceC222998p5 != null) {
            interfaceC222998p5.LLJLIL();
        }
        ((AbstractC48820JEa) this.LJLJI.getValue()).LJIIJ(C46520INo.LJLIL);
    }

    public KTY() {
        float f;
        float f2;
        if (C52480Kii.LIZ()) {
            f = PinchToClearModeSettings.LIZ().minScale;
        } else {
            f = 1.0f;
        }
        this.LJLIL = f;
        if (C52480Kii.LIZ()) {
            f2 = PinchToClearModeSettings.LIZ().maxScale;
        } else {
            f2 = 4.0f;
        }
        this.LJLILLLLZI = f2;
        this.LJLJI = C221108m2.LIZIZ(JAJ.LJLIL);
        this.LJLJJI = EnumC223028p8.VIDEO;
        this.LJLLJ = ILJ.IDLE;
        this.LJLLL = new PointF();
        this.LJLLLL = new PointF();
        this.LJLLLLLL = new PointF();
        this.LJLZ = 1.0f;
        this.LJZ = new ScaleGestureDetectorOnScaleGestureListenerC51759KTb(this);
    }

    public final void LIZLLL() {
        LJ();
        this.LJLJL = null;
        this.LJLJJLL = null;
        this.LJLL = null;
        this.LJLLILLLL = null;
        this.LJLJJL = null;
        ((AbstractC48820JEa) this.LJLJI.getValue()).LJIIJ(IFC.LJLIL);
    }

    public static void LIZIZ(MotionEvent motionEvent, PointF pointF) {
        if (motionEvent.getPointerCount() == 2) {
            float f = 2;
            pointF.set((motionEvent.getX(1) + motionEvent.getX(0)) / f, (motionEvent.getY(1) + motionEvent.getY(0)) / f);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View childAt;
        ScaleGestureDetector scaleGestureDetector;
        if (!this.LJLJLLL && motionEvent != null && motionEvent.getPointerCount() <= 2 && motionEvent != null && (scaleGestureDetector = this.LJLJJL) != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        Integer num = null;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getActionMasked());
        }
        if (num != null) {
            if (num.intValue() == 5) {
                if (this.LJLLJ == ILJ.IDLE && motionEvent.getPointerCount() == 2) {
                    this.LJLLJ = ILJ.ZOOM;
                    LIZIZ(motionEvent, this.LJLLL);
                    ViewGroup viewGroup = this.LJLJJLL;
                    if (viewGroup != null && (childAt = viewGroup.getChildAt(0)) != null) {
                        InterfaceC222998p5 interfaceC222998p5 = this.LJLLILLLL;
                        if (interfaceC222998p5 != null) {
                            interfaceC222998p5.m();
                        }
                        viewGroup.requestDisallowInterceptTouchEvent(true);
                        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                        this.LJLLI = frameLayout;
                        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
                        if ((childAt instanceof C47689Ind) || (childAt instanceof C47691Inf) || this.LJLJJI == EnumC223028p8.IMAGE) {
                            InterfaceC47247IgV interfaceC47247IgV = this.LJLL;
                            if (interfaceC47247IgV != null) {
                                interfaceC47247IgV.O7();
                            }
                            C16880lQ.LJLLL(childAt, viewGroup);
                            FrameLayout frameLayout2 = this.LJLLI;
                            if (frameLayout2 != null) {
                                frameLayout2.addView(childAt);
                            }
                            viewGroup.getLocationInWindow(new int[2]);
                            PointF pointF = new PointF(r6[0], r6[1]);
                            this.LJLLLLLL = pointF;
                            FrameLayout frameLayout3 = this.LJLLI;
                            if (frameLayout3 != null) {
                                frameLayout3.setX(pointF.x);
                            }
                            FrameLayout frameLayout4 = this.LJLLI;
                            if (frameLayout4 != null) {
                                frameLayout4.setY(this.LJLLLLLL.y);
                            }
                            View view2 = new View(viewGroup.getContext());
                            view2.setBackgroundResource(0);
                            view2.setBackgroundColor(-16777216);
                            view2.setOnTouchListener(KTZ.LJLIL);
                            this.LJLJLJ = view2;
                            ViewGroup viewGroup2 = this.LJLJL;
                            if (viewGroup2 != null) {
                                viewGroup2.addView(view2);
                                viewGroup2.addView(this.LJLLI);
                            }
                            viewGroup.setVisibility(4);
                        }
                    }
                    ((AbstractC48820JEa) this.LJLJI.getValue()).LJIIJ(C51758KTa.LJLIL);
                }
            } else if (num.intValue() == 2) {
                if (this.LJLLJ == ILJ.ZOOM && motionEvent.getPointerCount() == 2) {
                    LIZIZ(motionEvent, this.LJLLLL);
                    PointF pointF2 = this.LJLLLL;
                    float f = pointF2.x;
                    PointF pointF3 = this.LJLLL;
                    float f2 = f - pointF3.x;
                    pointF2.x = f2;
                    float f3 = pointF2.y - pointF3.y;
                    pointF2.y = f3;
                    PointF pointF4 = this.LJLLLLLL;
                    float f4 = f2 + pointF4.x;
                    pointF2.x = f4;
                    pointF2.y = f3 + pointF4.y;
                    FrameLayout frameLayout5 = this.LJLLI;
                    if (frameLayout5 != null) {
                        frameLayout5.setX(f4);
                    }
                    FrameLayout frameLayout6 = this.LJLLI;
                    if (frameLayout6 != null) {
                        frameLayout6.setY(this.LJLLLL.y);
                    }
                }
            } else if (num.intValue() == 1) {
                if (this.LJLLJ == ILJ.ZOOM) {
                    this.LJLLJ = ILJ.IDLE;
                }
                ViewGroup viewGroup3 = this.LJLJJLL;
                if (viewGroup3 != null) {
                    viewGroup3.requestDisallowInterceptTouchEvent(false);
                }
                if (this.LJLJLLL) {
                    return false;
                }
            } else if (num.intValue() == 6) {
                if (this.LJLLJ == ILJ.ZOOM) {
                    LIZJ();
                }
            } else if (num.intValue() == 3 && this.LJLLJ == ILJ.ZOOM) {
                LIZJ();
                ViewGroup viewGroup4 = this.LJLJJLL;
                if (viewGroup4 != null) {
                    viewGroup4.requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        }
        return true;
    }

    public final void LIZ(Context context, ViewGroup viewGroup, ViewGroup viewGroup2, InterfaceC47247IgV interfaceC47247IgV, InterfaceC222998p5 interfaceC222998p5, EnumC223028p8 targetType) {
        ScaleGestureDetector scaleGestureDetector;
        o.LJIIIZ(targetType, "targetType");
        if (this.LJLJL != null && this.LJLJJLL != null && ((this.LJLL != null || this.LJLJJI != EnumC223028p8.VIDEO) && this.LJLLILLLL != null && this.LJLJJL != null)) {
            LIZLLL();
        }
        this.LJLJL = viewGroup;
        this.LJLJJLL = viewGroup2;
        this.LJLL = interfaceC47247IgV;
        this.LJLJJI = targetType;
        this.LJLLILLLL = interfaceC222998p5;
        if (context != null) {
            scaleGestureDetector = new ScaleGestureDetector(context, this.LJZ);
            scaleGestureDetector.setQuickScaleEnabled(false);
        } else {
            scaleGestureDetector = null;
        }
        this.LJLJJL = scaleGestureDetector;
        ((AbstractC48820JEa) this.LJLJI.getValue()).LJIIJ(C223018p7.LJLIL);
    }
}
