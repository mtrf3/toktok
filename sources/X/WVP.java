package X;

import Y.ARunnableS50S0100000_14;
import Y.AUListenerS97S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WVP extends FrameLayout implements View.OnTouchListener {
    public WVW LJLIL;
    public WVQ LJLILLLLZI;
    public EnumC35441DvZ LJLJI;
    public final long LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public long LJLJLJ;
    public long LJLJLLL;
    public boolean LJLL;
    public final Integer LJLLI;
    public boolean LJLLILLLL;
    public long LJLLJ;
    public ScaleGestureDetector LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public WXG LJLZ;
    public final int[] LJZ;
    public final ARunnableS50S0100000_14 LJZI;
    public final float LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final float LLF;
    public float LLFF;
    public final float LLFFF;
    public final C62822Ol8 LLFII;
    public final float LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final float LLIIIL;
    public final int LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final float LLIIJLIL;
    public final C62822Ol8 LLIIL;

    private final Paint getIDleInnerPaint() {
        return (Paint) this.LLD.getValue();
    }

    private final Paint getIDleOuterPaint() {
        return (Paint) this.LLFII.getValue();
    }

    private final Paint getLockCirclePaint() {
        return (Paint) this.LLIIIILZ.getValue();
    }

    private final Paint getProgressBgPaint() {
        return (Paint) this.LLIFFJFJJ.getValue();
    }

    private final Paint getProgressPaint() {
        return (Paint) this.LLI.getValue();
    }

    private final Paint getRecordingInnerPaint() {
        return (Paint) this.LLIIII.getValue();
    }

    private final Paint getRecordingOuterCirclePaint() {
        return (Paint) this.LLII.getValue();
    }

    private final RectF getRecordingProgressOvalRectF() {
        return (RectF) this.LLIIL.getValue();
    }

    private final Paint getRecordingRoundRectPaint() {
        return (Paint) this.LLIIIJ.getValue();
    }

    private final float getViewY() {
        float f;
        View view;
        if (((Boolean) C52505Kj7.LIZ.getValue()).booleanValue()) {
            Object parent = getParent();
            if ((parent instanceof View) && (view = (View) parent) != null) {
                f = view.getY();
            } else {
                f = 0.0f;
            }
            return getY() + f;
        }
        return getY();
    }

    public final LinearGradient getBaseCircleGradient() {
        return (LinearGradient) this.LL.getValue();
    }

    public final float getRecordingOuterCircleWidth() {
        return ((Number) this.LLIIJI.getValue()).floatValue();
    }

    public final WVW getListener() {
        return this.LJLIL;
    }

    public final EnumC35441DvZ getRecordingMode() {
        return this.LJLJI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float recordingOuterCircleWidth;
        if (canvas == null) {
            return;
        }
        int i = WVR.LIZ[this.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.LJLJLLL;
            float f = ((float) uptimeMillis) / this.LLIIIZ;
            if (f <= 1.0f) {
                double d = f;
                double d2 = 1 - d;
                double d3 = d * d;
                double d4 = d2 * d2;
                double d5 = 3;
                f = (float) ((d3 * d * 1.0d) + C67399Qcl.LIZ(d5, d2, d3, 1.0d, C67399Qcl.LIZ(d4, d5, d, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, d4 * d2 * LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)));
            }
            if (f < 1.0f) {
                float f2 = 1;
                recordingOuterCircleWidth = (((this.LLIIIL - f2) * f) + f2) * this.LLFF;
            } else {
                recordingOuterCircleWidth = getRecordingOuterCircleWidth();
            }
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, recordingOuterCircleWidth, getRecordingOuterCirclePaint());
            if (!this.LJLL) {
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, recordingOuterCircleWidth - (this.LLFZ / 2), getProgressBgPaint());
            }
            if (uptimeMillis <= this.LLIIIZ) {
                float f3 = this.LLFF;
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, (((this.LJZL / 2) - f3) * f) + f3, getIDleInnerPaint());
            } else if (this.LJLJI == EnumC35441DvZ.LONG_PRESS_RECORDING) {
                if (uptimeMillis <= r4 * 2) {
                    canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.LLIIJLIL, getRecordingInnerPaint());
                } else {
                    canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.LLIIJLIL, getRecordingInnerPaint());
                }
            }
            if (f >= 1.0f) {
                canvas.drawArc(getRecordingProgressOvalRectF(), -90.0f, (this.LJLJJL / 100) * 360, false, getProgressPaint());
                return;
            } else {
                invalidate();
                return;
            }
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.LLFF, getIDleInnerPaint());
        float f4 = 2;
        float f5 = this.LLFFF / f4;
        canvas.drawOval(new RectF(f5, f5, getWidth() - (this.LLFFF / f4), getHeight() - (this.LLFFF / f4)), getIDleOuterPaint());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector;
        WVW wvw;
        if (motionEvent == null || !isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 5) {
                            if (motionEvent.getPointerCount() == 2) {
                                this.LJLLLL = 1;
                            } else if (motionEvent.getPointerCount() > 2) {
                                this.LJLLLL = 2;
                            }
                        }
                    }
                } else {
                    this.LJLJL = motionEvent.getY() - this.LJLJJLL;
                    motionEvent.getX();
                    int i = this.LJLLLL;
                    if (i == 0 || i == 1) {
                        if (C52264KfE.LIZ) {
                            WVW wvw2 = this.LJLIL;
                            if (wvw2 != null) {
                                wvw2.LLJJJJLIIL(-this.LJLJL, getViewY());
                            }
                        } else {
                            WVW wvw3 = this.LJLIL;
                            if (wvw3 != null) {
                                wvw3.LLJJJJLIIL(-motionEvent.getY(), getViewY());
                            }
                        }
                    }
                }
            }
            int i2 = WVR.LIZ[this.LJLILLLLZI.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 && this.LJLJI == EnumC35441DvZ.LONG_PRESS_RECORDING && (wvw = this.LJLIL) != null) {
                    wvw.LLJJJJJIL();
                }
            } else if (SystemClock.uptimeMillis() - this.LJLJLJ <= this.LJLJJI) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.92f, 1.0f);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new AUListenerS97S0100000_9(this, 64));
                ofFloat.start();
                WVW wvw4 = this.LJLIL;
                if (wvw4 != null) {
                    wvw4.LJJJJIZL();
                }
                removeCallbacks(this.LJZI);
            }
            int i3 = this.LJLLLL;
            if ((i3 == 0 || i3 == 1) && this.LJLLILLLL) {
                setHasBeenMoveScaled(false);
                WVW wvw5 = this.LJLIL;
                if (wvw5 != null) {
                    wvw5.LJJIJIIJIL();
                }
            }
        } else {
            motionEvent.getX();
            this.LJLJJLL = motionEvent.getY();
            this.LJLJLJ = SystemClock.uptimeMillis();
            if (WVR.LIZ[this.LJLILLLLZI.ordinal()] != 1) {
                return false;
            }
            postDelayed(this.LJZI, this.LJLJJI);
        }
        if (this.LJLLL != null && System.currentTimeMillis() - this.LJLLJ >= 300 && (scaleGestureDetector = this.LJLLL) != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setCanTouch(boolean z) {
        this.LJLLLLLL = z;
    }

    public final void setCurrentScaleMode(int i) {
        this.LJLLLL = i;
    }

    public final void setGestureListener(WXG wxg) {
        this.LJLZ = wxg;
    }

    public final void setHasBeenMoveScaled(boolean z) {
        this.LJLLILLLL = z;
        this.LJLLJ = System.currentTimeMillis();
    }

    public final void setListener(WVW wvw) {
        this.LJLIL = wvw;
    }

    public final void setNowStoryCombine(boolean z) {
        this.LJLL = z;
    }

    public final void setRecordingMode(EnumC35441DvZ mode) {
        o.LJIIIZ(mode, "mode");
        this.LJLJI = mode;
        invalidate();
    }

    public final void setScaleGestureDetector(ScaleGestureDetector scaleDetector) {
        o.LJIIIZ(scaleDetector, "scaleDetector");
        this.LJLLL = scaleDetector;
    }

    public final void setState(WVQ state) {
        o.LJIIIZ(state, "state");
        setStateInternal(state);
    }

    public final void setStateInternal(WVQ wvq) {
        this.LJLILLLLZI = wvq;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = WVQ.IDLE;
        this.LJLJI = EnumC35441DvZ.LONG_PRESS_RECORDING;
        this.LJLJJI = 150L;
        this.LJLLI = C79045V0n.LJI(R.attr.eb, context);
        this.LJLLLLLL = true;
        this.LJZ = new int[]{0, 0};
        this.LJZI = new ARunnableS50S0100000_14(this, 253);
        setOnTouchListener(this);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "getContext()");
        this.LJZL = C74275TDb.LIZIZ(context2, 36.0f);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "getContext()");
        C74275TDb.LIZIZ(context3, 4.0f);
        this.LL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1029));
        this.LLD = C221108m2.LIZIZ(new AqS156S0100000_6(this, 165));
        float LJI = SFS.LJI(31.0d);
        this.LLF = LJI;
        this.LLFF = LJI;
        this.LLFFF = SFS.LJI(4.0d);
        this.LLFII = C221108m2.LIZIZ(new AqS156S0100000_6(this, 166));
        this.LLFZ = SFS.LJI(6.0d);
        this.LLI = C221108m2.LIZIZ(new AqS156S0100000_6(this, 168));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 167));
        this.LLII = C221108m2.LIZIZ(new AqS153S0200000_6(this, context, 33));
        this.LLIIII = C221108m2.LIZIZ(new AqS156S0100000_6(this, 169));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS152S0100000_2(context, 1059));
        this.LLIIIJ = C221108m2.LIZIZ(new AqS152S0100000_2(context, 1060));
        this.LLIIIL = 1.87f;
        this.LLIIIZ = 350;
        this.LLIIJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1030));
        this.LLIIJLIL = SFS.LJI(18.0d);
        SFS.LJI(5.0d);
        this.LLIIL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 170));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        if (!this.LJLLLLLL || this.LJLZ == null || event.getPointerCount() != 2) {
            return false;
        }
        int action = event.getAction() & 255;
        if (action != 2) {
            if (action != 5) {
                if (action == 6) {
                    WXG wxg = this.LJLZ;
                    if (wxg != null) {
                        wxg.LLLLLZL(event, this.LJZ);
                    }
                    WXG wxg2 = this.LJLZ;
                    if (wxg2 != null) {
                        wxg2.LLLLLZ(event, this.LJZ);
                    }
                }
            } else {
                WXG wxg3 = this.LJLZ;
                if (wxg3 != null) {
                    wxg3.LLLLZI(event, this.LJZ);
                }
                WXG wxg4 = this.LJLZ;
                if (wxg4 != null) {
                    wxg4.LLLLLLZZ(event, this.LJZ);
                }
            }
        } else {
            WXG wxg5 = this.LJLZ;
            if (wxg5 != null) {
                wxg5.LLLLZ(event, this.LJZ);
            }
        }
        return false;
    }
}
