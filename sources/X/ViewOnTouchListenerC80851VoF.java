package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.VoF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnTouchListenerC80851VoF implements View.OnTouchListener, InterfaceC80853VoH {
    public final float[] LJLIL;
    public final RectF LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public final long LJLJJL;
    public final boolean LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public final ScaleGestureDetectorOnScaleGestureListenerC80852VoG LJLL;
    public final C16230kN LJLLI;
    public final Interpolator LJLLILLLL;
    public RunnableC80849VoD LJLLJ;
    public final WeakReference<VA9<V92>> LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public final Matrix LJLZ;

    public final void LJII() {
        VA9<V92> LJFF = LJFF();
        if (LJFF != null) {
            Context context = LJFF.getContext();
            o.LJIIIIZZ(context, "it.context");
            Object LLILL = C16880lQ.LLILL(context, "window");
            o.LJII(LLILL, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) LLILL).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int i = (int) (((displayMetrics.heightPixels * 1.0f) / this.LJLJLJ) * this.LJLJLLL);
            int i2 = displayMetrics.widthPixels;
            if (i < i2) {
                float f = (i2 * 1.0f) / i;
                if (f > 1.0f) {
                    LIZLLL();
                    RectF LJ = LJ(this.LJLZ);
                    if (LJ != null) {
                        this.LJLJI = 1.0f * f;
                        this.LJLJJI = 3.0f * f;
                        VA9<V92> LJFF2 = LJFF();
                        if (LJFF2 != null) {
                            LJFF2.post(new RunnableC80850VoE(this, f, f, LJ.centerX(), 0.0f));
                        }
                    }
                }
            }
        }
        this.LJLZ.reset();
        LIZLLL();
        VA9<V92> LJFF3 = LJFF();
        if (LJFF3 != null) {
            LJFF3.invalidate();
        }
    }

    @Override // X.InterfaceC80853VoH
    public final void onScaleEnd() {
        VA9<V92> LJFF;
        VA9<V92> LJFF2;
        VA9<V92> LJFF3;
        if ((LJI() < this.LJLJI || LJI() > this.LJLJJI) && (LJFF = LJFF()) != null) {
            Context context = LJFF.getContext();
            o.LJIIIIZZ(context, "it.context");
            new C61995OUt(context);
            LJFF.performHapticFeedback(0);
        }
        if (LJI() < this.LJLJI) {
            LIZLLL();
            RectF LJ = LJ(this.LJLZ);
            if (LJ != null && (LJFF3 = LJFF()) != null) {
                LJFF3.post(new RunnableC80850VoE(this, LJI(), this.LJLJI, LJ.centerX(), LJ.centerY()));
            }
        }
        if (LJI() > this.LJLJJI) {
            LIZLLL();
            RectF LJ2 = LJ(this.LJLZ);
            if (LJ2 != null && (LJFF2 = LJFF()) != null) {
                LJFF2.post(new RunnableC80850VoE(this, LJI(), this.LJLJJI, LJ2.centerX(), LJ2.centerY()));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r1 < r4) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL() {
        /*
            r9 = this;
            android.graphics.Matrix r0 = r9.LJLZ
            android.graphics.RectF r5 = r9.LJ(r0)
            r4 = 0
            if (r5 != 0) goto La
            return r4
        La:
            float r8 = r5.height()
            float r7 = r5.width()
            X.VA9 r2 = r9.LJFF()
            if (r2 == 0) goto L87
            int r1 = r2.getHeight()
            int r0 = r2.getPaddingTop()
            int r1 = r1 - r0
            int r0 = r2.getPaddingBottom()
            int r1 = r1 - r0
        L26:
            float r3 = (float) r1
            r2 = 0
            r6 = 2
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L6c
            float r3 = r3 - r8
            float r0 = (float) r6
            float r3 = r3 / r0
            float r0 = r5.top
            float r3 = r3 - r0
            r0 = 5
            r9.LJLJL = r0
        L36:
            X.VA9 r1 = r9.LJFF()
            if (r1 == 0) goto L4a
            int r4 = r1.getWidth()
            int r0 = r1.getPaddingLeft()
            int r4 = r4 - r0
            int r0 = r1.getPaddingRight()
            int r4 = r4 - r0
        L4a:
            float r4 = (float) r4
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 > 0) goto L5d
            float r4 = r4 - r7
            float r0 = (float) r6
            float r4 = r4 / r0
            float r1 = r5.left
        L54:
            float r2 = r4 - r1
        L56:
            android.graphics.Matrix r0 = r9.LJLZ
            r0.postTranslate(r2, r3)
            r0 = 1
            return r0
        L5d:
            float r1 = r5.left
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L65
            float r2 = -r1
            goto L56
        L65:
            float r1 = r5.right
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L56
            goto L54
        L6c:
            float r1 = r5.top
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L77
            float r3 = -r1
            r0 = 3
            r9.LJLJL = r0
            goto L36
        L77:
            float r1 = r5.bottom
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L82
            float r3 = r3 - r1
            r0 = 4
            r9.LJLJL = r0
            goto L36
        L82:
            r0 = -1
            r9.LJLJL = r0
            r3 = 0
            goto L36
        L87:
            r1 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC80851VoF.LIZLLL():boolean");
    }

    public final VA9<V92> LJFF() {
        return this.LJLLL.get();
    }

    public final float LJI() {
        this.LJLZ.getValues(this.LJLIL);
        float pow = (float) Math.pow(this.LJLIL[0], 2.0d);
        this.LJLZ.getValues(this.LJLIL);
        return (float) Math.sqrt(pow + ((float) Math.pow(this.LJLIL[3], 2.0d)));
    }

    public ViewOnTouchListenerC80851VoF(VA9<V92> draweeView) {
        o.LJIIIZ(draweeView, "draweeView");
        this.LJLIL = new float[9];
        this.LJLILLLLZI = new RectF();
        this.LJLJI = 1.0f;
        this.LJLJJI = 3.0f;
        this.LJLJJL = 200L;
        this.LJLJJLL = true;
        this.LJLJL = 5;
        this.LJLJLJ = -1;
        this.LJLJLLL = -1;
        this.LJLLILLLL = new AccelerateDecelerateInterpolator();
        this.LJLZ = new Matrix();
        this.LJLLL = new WeakReference<>(draweeView);
        draweeView.getHierarchy().LJIILJJIL(InterfaceC78716Uuu.LJJL);
        draweeView.setOnTouchListener(this);
        Context context = draweeView.getContext();
        o.LJIIIIZZ(context, "draweeView.context");
        this.LJLL = new ScaleGestureDetectorOnScaleGestureListenerC80852VoG(context, this);
        C16230kN c16230kN = new C16230kN(draweeView.getContext(), new C72810Shq(this, draweeView));
        this.LJLLI = c16230kN;
        c16230kN.LIZIZ(new GestureDetectorOnDoubleTapListenerC80854VoI());
    }

    public final RectF LJ(Matrix matrix) {
        V92 hierarchy;
        if (LJFF() != null) {
            int i = this.LJLJLLL;
            if (i == -1 && this.LJLJLJ == -1) {
                return null;
            }
            this.LJLILLLLZI.set(0.0f, 0.0f, i, this.LJLJLJ);
            VA9<V92> LJFF = LJFF();
            if (LJFF != null && (hierarchy = LJFF.getHierarchy()) != null) {
                hierarchy.LJIIJ(this.LJLILLLLZI);
            }
            matrix.mapRect(this.LJLILLLLZI);
            return this.LJLILLLLZI;
        }
        return null;
    }

    @Override // X.InterfaceC80853VoH
    public final void LIZ(float f, float f2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        VA9<V92> LJFF = LJFF();
        if (LJFF != null) {
            RunnableC80849VoD runnableC80849VoD = new RunnableC80849VoD(this, LJFF.getContext());
            this.LJLLJ = runnableC80849VoD;
            VA9<V92> LJFF2 = LJFF();
            if (LJFF2 != null) {
                i = (LJFF2.getWidth() - LJFF2.getPaddingLeft()) - LJFF2.getPaddingRight();
            } else {
                i = 0;
            }
            VA9<V92> LJFF3 = LJFF();
            if (LJFF3 != null) {
                i2 = (LJFF3.getHeight() - LJFF3.getPaddingTop()) - LJFF3.getPaddingBottom();
            } else {
                i2 = 0;
            }
            int i7 = (int) f;
            int i8 = (int) f2;
            LIZLLL();
            RectF LJ = LJ(this.LJLZ);
            if (LJ != null) {
                int LJJIIZ = O6R.LJJIIZ(-LJ.left);
                float f3 = i;
                if (f3 < LJ.width()) {
                    i4 = O6R.LJJIIZ(LJ.width() - f3);
                    i3 = 0;
                } else {
                    i3 = LJJIIZ;
                    i4 = LJJIIZ;
                }
                int LJJIIZ2 = O6R.LJJIIZ(-LJ.top);
                float f4 = i2;
                if (f4 < LJ.height()) {
                    i6 = O6R.LJJIIZ(LJ.height() - f4);
                    i5 = 0;
                } else {
                    i5 = LJJIIZ2;
                    i6 = LJJIIZ2;
                }
                runnableC80849VoD.LJLILLLLZI = LJJIIZ;
                runnableC80849VoD.LJLJI = LJJIIZ2;
                if (LJJIIZ != i4 || LJJIIZ2 != i6) {
                    runnableC80849VoD.LJLIL.fling(LJJIIZ, LJJIIZ2, i7, i8, i3, i4, i5, i6, 0, 0);
                }
            }
            LJFF.post(this.LJLLJ);
        }
    }

    @Override // X.InterfaceC80853VoH
    public final void LIZIZ(float f, float f2) {
        ViewParent parent;
        VA9<V92> LJFF;
        if (LJFF() != null && !this.LJLL.LJLJJLL.isInProgress()) {
            this.LJLZ.postTranslate(f, f2);
            if (LIZLLL() && (LJFF = LJFF()) != null) {
                LJFF.invalidate();
            }
            VA9<V92> LJFF2 = LJFF();
            if (LJFF2 != null && (parent = LJFF2.getParent()) != null && this.LJLLLL) {
                this.LJLLLL = false;
                if (this.LJLJJLL && !this.LJLL.LJLJJLL.isInProgress()) {
                    int i = this.LJLJL;
                    if (i != 5) {
                        if (i == 3) {
                            if (f2 < 1.0f) {
                                return;
                            }
                        } else if (i != 4 || f2 > -1.0f) {
                            return;
                        }
                    }
                    parent.requestDisallowInterceptTouchEvent(false);
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        VelocityTracker velocityTracker;
        int i;
        ViewParent parent;
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        int actionMasked = event.getActionMasked();
        boolean z = false;
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && (parent = v.getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        } else {
            this.LJLLLL = true;
            ViewParent parent2 = v.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
            RunnableC80849VoD runnableC80849VoD = this.LJLLJ;
            if (runnableC80849VoD != null) {
                runnableC80849VoD.LJLIL.abortAnimation();
            }
            this.LJLLJ = null;
        }
        ScaleGestureDetectorOnScaleGestureListenerC80852VoG scaleGestureDetectorOnScaleGestureListenerC80852VoG = this.LJLL;
        scaleGestureDetectorOnScaleGestureListenerC80852VoG.getClass();
        scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJJLL.onTouchEvent(event);
        int actionMasked2 = event.getActionMasked();
        if (scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLLI && (actionMasked2 == 1 || actionMasked2 == 3 || actionMasked2 == 6)) {
            scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLLI = false;
            scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJL.onScaleEnd();
        }
        if (actionMasked2 != 0) {
            if (actionMasked2 != 1 && actionMasked2 != 3) {
                if (actionMasked2 == 6) {
                    int actionIndex = event.getActionIndex();
                    if (event.getPointerId(actionIndex) == scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLL) {
                        if (actionIndex == 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLL = event.getPointerId(i);
                        scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLIL = event.getX();
                        scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLILLLLZI = event.getY();
                    }
                }
            } else {
                scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLL = -1;
            }
        } else {
            scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLL = event.getPointerId(0);
        }
        int i2 = scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLL;
        if (i2 == -1) {
            i2 = 0;
        }
        event.findPointerIndex(i2);
        if (actionMasked2 != 0) {
            if (actionMasked2 != 1) {
                if (actionMasked2 != 2) {
                    if (actionMasked2 != 3) {
                        if (actionMasked2 == 5) {
                            scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJLLL = false;
                            scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJI = false;
                            float x = event.getX();
                            float y = event.getY();
                            float f = x - scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLIL;
                            float f2 = y - scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLILLLLZI;
                            if (scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJLLL) {
                                if (!scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJI) {
                                    if (Math.sqrt((f2 * f2) + (f * f)) >= scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJJI) {
                                        z = true;
                                    }
                                    scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJI = z;
                                }
                                if (scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJI) {
                                    scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJL.LIZIZ(f, f2);
                                    scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLIL = x;
                                    scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLILLLLZI = y;
                                    VelocityTracker velocityTracker2 = scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJLJ;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(event);
                                    }
                                }
                            }
                        }
                    } else {
                        VelocityTracker velocityTracker3 = scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJLJ;
                        if (velocityTracker3 != null) {
                            velocityTracker3.recycle();
                        }
                        scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJLJ = null;
                    }
                } else {
                    float x2 = event.getX();
                    float y2 = event.getY();
                    float f3 = x2 - scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLIL;
                    float f4 = y2 - scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLILLLLZI;
                    if (scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJLLL) {
                        if (!scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJI) {
                            if (Math.sqrt((f4 * f4) + (f3 * f3)) >= scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJJI) {
                                z = true;
                            }
                            scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJI = z;
                        }
                        if (scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJI) {
                            scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJL.LIZIZ(f3, f4);
                            scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLIL = x2;
                            scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLILLLLZI = y2;
                            VelocityTracker velocityTracker4 = scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJLJ;
                            if (velocityTracker4 != null) {
                                velocityTracker4.addMovement(event);
                            }
                        }
                    }
                }
            } else {
                if (scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJI && (velocityTracker = scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJLJ) != null) {
                    scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLIL = event.getX();
                    scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLILLLLZI = event.getY();
                    velocityTracker.addMovement(event);
                    velocityTracker.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker.getXVelocity();
                    float yVelocity = velocityTracker.getYVelocity();
                    float abs = Math.abs(xVelocity);
                    float abs2 = Math.abs(yVelocity);
                    if (abs < abs2) {
                        abs = abs2;
                    }
                    if (abs >= scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJJL) {
                        scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJL.LIZ(-xVelocity, -yVelocity);
                    }
                }
                VelocityTracker velocityTracker5 = scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJLJ;
                if (velocityTracker5 != null) {
                    velocityTracker5.recycle();
                }
                scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJLJ = null;
            }
        } else {
            VelocityTracker obtain = VelocityTracker.obtain();
            scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJLJ = obtain;
            if (obtain != null) {
                obtain.addMovement(event);
            }
            scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLIL = event.getX();
            scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLILLLLZI = event.getY();
            scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJI = false;
            scaleGestureDetectorOnScaleGestureListenerC80852VoG.LJLJLLL = true;
        }
        this.LJLLI.LIZ(event);
        return true;
    }

    @Override // X.InterfaceC80853VoH
    public final void LIZJ(float f, float f2, float f3) {
        VA9<V92> LJFF;
        if ((LJI() < this.LJLJI || LJI() > this.LJLJJI) && !this.LJLLLLLL) {
            VA9<V92> LJFF2 = LJFF();
            if (LJFF2 != null) {
                Context context = LJFF2.getContext();
                o.LJIIIIZZ(context, "it.context");
                new C61995OUt(context);
                LJFF2.performHapticFeedback(0);
            }
            this.LJLLLLLL = true;
        }
        if (LJI() > 0.7f || f > 1.0f) {
            if (LJI() < this.LJLJJI || f < 1.0f) {
                this.LJLZ.postScale(f, f, f2, f3);
                if (LIZLLL() && (LJFF = LJFF()) != null) {
                    LJFF.invalidate();
                }
            }
        }
    }
}
