package X;

import Y.AfS56S0100000_4;
import Y.IDuS320S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.L5j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53691L5j extends FrameLayout implements L6R {
    public static final int LJZ = ColorProtector.parseColor("#10B7FF");
    public static final int LJZI = ColorProtector.parseColor("#20D5EC");
    public static final int LJZL = ColorProtector.parseColor("#17E9B6");
    public static final int LL = ColorProtector.parseColor("#FF4C3A");
    public C0GY LJLIL;
    public int LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public L5S LJLJJI;
    public LinearGradient LJLJJL;
    public float LJLJJLL;
    public final Paint LJLJL;
    public EnumC53695L5n LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public AqS175S0100000_9 LJLLI;
    public C73411SrX LJLLILLLL;
    public ValueAnimator LJLLJ;
    public InterfaceC53475Kyl LJLLL;
    public final C53691L5j LJLLLL;
    public final RectF LJLLLLLL;
    public long LJLZ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53691L5j(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53691L5j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // X.L6R
    public void setMine(boolean z) {
    }

    private final C29701Eo getPublishLottieView() {
        return (C29701Eo) this.LJLJI.getValue();
    }

    public final InterfaceC53475Kyl getLightenRatioSet() {
        return this.LJLLL;
    }

    public final C0GY getLottieComposition() {
        return this.LJLIL;
    }

    @Override // X.L6R
    public EnumC53695L5n getMode() {
        return this.LJLJLJ;
    }

    public float getProgress() {
        return this.LJLJLLL;
    }

    public L5S getProgressMode() {
        return this.LJLJJI;
    }

    @Override // X.L6R
    public View getView() {
        return this.LJLLLL;
    }

    private final void setRingWidth(float f) {
        this.LJLJJLL = f;
        this.LJLJL.setStrokeWidth(f);
        LIZ(getWidth(), getHeight());
        invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.draw(canvas);
        if (getMode() != EnumC53695L5n.PROGRESS) {
            getPublishLottieView().cancelAnimation();
            getPublishLottieView().setVisibility(8);
        }
        int i = C53692L5k.LIZIZ[getMode().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || getProgressMode() == L5S.LOTTIE_ANIMATION) {
                        return;
                    }
                    this.LJLJL.setStyle(Paint.Style.STROKE);
                    this.LJLJL.setShader(null);
                    this.LJLJL.setColor(this.LJLILLLLZI);
                    canvas.drawArc(this.LJLLLLLL, 0.0f, 360.0f, false, this.LJLJL);
                    this.LJLJL.setShader(this.LJLJJL);
                    this.LJLJL.setColor(-16777216);
                    canvas.drawArc(this.LJLLLLLL, -90.0f, this.LJLL * 360.0f, false, this.LJLJL);
                    return;
                }
                this.LJLJL.setStyle(Paint.Style.STROKE);
                this.LJLJL.setShader(null);
                this.LJLJL.setColor(LL);
                canvas.drawArc(this.LJLLLLLL, -90.0f, 360.0f, false, this.LJLJL);
                return;
            }
            this.LJLJL.setStyle(Paint.Style.STROKE);
            this.LJLJL.setShader(null);
            this.LJLJL.setColor(this.LJLILLLLZI);
            canvas.drawArc(this.LJLLLLLL, -90.0f, 360.0f, false, this.LJLJL);
            return;
        }
        this.LJLJL.setShader(this.LJLJJL);
        this.LJLJL.setStyle(Paint.Style.STROKE);
        this.LJLJL.setColor(-16777216);
        canvas.drawArc(this.LJLLLLLL, -90.0f, 360.0f, false, this.LJLJL);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (ev.getAction() == 0) {
            this.LJLZ = System.currentTimeMillis();
        }
        if (getMode() != EnumC53695L5n.NONE && ev.getAction() == 1) {
            if (System.currentTimeMillis() - this.LJLZ < ViewConfiguration.getLongPressTimeout()) {
                performClick();
            }
            return true;
        }
        return super.onInterceptTouchEvent(ev);
    }

    public final void setConstTheme(boolean z) {
        int i;
        int i2;
        if (z) {
            i = R.attr.dg;
        } else {
            i = R.attr.dw;
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(i, context);
        if (LJI != null) {
            i2 = LJI.intValue();
        } else {
            i2 = 0;
        }
        this.LJLILLLLZI = i2;
    }

    public final void setLightenRatioSet(InterfaceC53475Kyl value) {
        o.LJIIIZ(value, "value");
        if (o.LJ(this.LJLLL, value)) {
            return;
        }
        this.LJLLL = value;
        invalidate();
    }

    public final void setLottieComposition(C0GY c0gy) {
        this.LJLIL = c0gy;
    }

    @Override // X.L6R
    public void setMode(EnumC53695L5n value) {
        o.LJIIIZ(value, "value");
        if (this.LJLJLJ == value) {
            return;
        }
        this.LJLJLJ = value;
        C73411SrX c73411SrX = this.LJLLILLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLLILLLL = null;
        this.LJLLI = null;
        if (getProgressMode() == L5S.PROGRESS_BAR && value == EnumC53695L5n.PROGRESS) {
            setProgress(0.0f);
            this.LJLLILLLL = (C73411SrX) AbstractC73672Svk.LJIIJ(new IDuS320S0100000_9(this, 5)).LJIIJJI(300L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(this, 69), new InterfaceC64592gB() { // from class: X.9Fe
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
        invalidate();
    }

    @Override // X.L6R
    public void setProgress(float f) {
        C0GY c0gy;
        this.LJLJLLL = f;
        if (this.LJLIL == null) {
            setProgressMode(L5S.LOTTIE_ANIMATION);
        }
        L5S progressMode = getProgressMode();
        if (progressMode != null) {
            int i = C53692L5k.LIZ[progressMode.ordinal()];
            if (i != 1) {
                if (i == 2 && (c0gy = this.LJLIL) != null) {
                    if (f > 0.0f && !getPublishLottieView().isAnimating()) {
                        getPublishLottieView().setVisibility(0);
                        getPublishLottieView().setComposition(c0gy);
                        getPublishLottieView().playAnimation();
                        invalidate();
                    } else if (f == 1.0f) {
                        getPublishLottieView().cancelAnimation();
                        getPublishLottieView().setVisibility(8);
                        invalidate();
                    }
                }
            } else if (f < this.LJLL) {
                ValueAnimator valueAnimator = this.LJLLJ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.LJLLJ;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator3 = this.LJLLJ;
                if (valueAnimator3 != null) {
                    C16880lQ.LJLJL(valueAnimator3);
                }
                if (f == 0.0f) {
                    this.LJLL = f;
                    invalidate();
                }
            }
        }
        AqS175S0100000_9 aqS175S0100000_9 = this.LJLLI;
        if (aqS175S0100000_9 != null) {
            aqS175S0100000_9.invoke(Float.valueOf(this.LJLJLLL));
        }
    }

    @Override // X.L6R
    public void setProgressMode(L5S l5s) {
        this.LJLJJI = l5s;
    }

    public final void LIZ(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        RectF rectF = this.LJLLLLLL;
        float f = this.LJLJJLL;
        rectF.left = f / 2.0f;
        rectF.top = (f / 2.0f) + 0.0f;
        rectF.right = i - (f / 2.0f);
        rectF.bottom = i2 - (f / 2.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setRingWidth(this.LJLLL.LIZIZ() * getMeasuredWidth());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C53691L5j(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 2
            if (r0 == 0) goto L5
            r5 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r4, r0)
            r2 = 0
            r3.<init>(r4, r5, r2)
            r0 = 2130968654(0x7f04004e, float:1.7545968E38)
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r4)
            if (r0 == 0) goto L60
            int r0 = r0.intValue()
        L1b:
            r3.LJLILLLLZI = r0
            kotlin.jvm.internal.AqS156S0200000_9 r1 = new kotlin.jvm.internal.AqS156S0200000_9
            r0 = 43
            r1.<init>(r4, r3, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLJI = r0
            X.L5S r0 = X.L5S.LOTTIE_ANIMATION
            r3.LJLJJI = r0
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            float r0 = r3.LJLJJLL
            r1.setStrokeWidth(r0)
            r0 = 1
            r1.setAntiAlias(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r1.setStrokeCap(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r0)
            r3.LJLJL = r1
            X.L5n r0 = X.EnumC53695L5n.NONE
            r3.LJLJLJ = r0
            X.TMC r0 = new X.TMC
            r0.<init>()
            r3.LJLLL = r0
            r3.LJLLLL = r3
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r3.LJLLLLLL = r0
            r3.setWillNotDraw(r2)
            return
        L60:
            r0 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53691L5j.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZ(i, i2);
        if (i > 0 && i2 > 0) {
            float width = getWidth();
            float height = getHeight();
            int[] iArr = new int[3];
            int i5 = 0;
            int i6 = 0;
            loop0: while (true) {
                int i7 = LJZ;
                while (true) {
                    iArr[i6] = i7;
                    i6++;
                    if (i6 >= 3) {
                        break loop0;
                    }
                    if (i6 != 0) {
                        if (i6 != 1) {
                            if (i6 != 2) {
                                i7 = 0;
                            } else {
                                i7 = LJZL;
                            }
                        } else {
                            i7 = LJZI;
                        }
                    }
                }
            }
            float[] fArr = new float[3];
            do {
                float f = 0.0f;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            f = 1.0f;
                        }
                    } else {
                        f = 0.5f;
                    }
                }
                fArr[i5] = f;
                i5++;
            } while (i5 < 3);
            this.LJLJJL = new LinearGradient(0.0f, 0.0f, width, height, iArr, fArr, Shader.TileMode.CLAMP);
            setRingWidth(this.LJLLL.LIZIZ() * i);
        }
    }
}
