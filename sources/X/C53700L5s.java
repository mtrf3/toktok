package X;

import Y.AfS53S0100000_1;
import Y.IDuS320S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.L5s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53700L5s extends FrameLayout {
    public float LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public AqS175S0100000_9 LJLJJL;
    public C73411SrX LJLJJLL;
    public C2315096s LJLJL;
    public float LJLJLJ;
    public int LJLJLLL;
    public final Paint LJLL;
    public EnumC53704L5w LJLLI;
    public ValueAnimator LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public EnumC53701L5t LJLLLL;
    public final RectF LJLLLLLL;
    public final RectF LJLZ;
    public float LJZ;
    public LinearGradient LJZI;
    public LinearGradient LJZL;
    public final int LL;
    public final int LLD;
    public final int LLF;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53700L5s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    private final int getGray() {
        if (this.LJLLI == EnumC53704L5w.CONST) {
            return this.LLD;
        }
        return this.LL;
    }

    public final float getBackgroundAlpha() {
        return this.LJLJLJ;
    }

    public final EnumC53701L5t getMode() {
        return this.LJLLLL;
    }

    public final Paint getPaint() {
        return this.LJLL;
    }

    public final float getProgress() {
        return this.LJLLJ;
    }

    public final float getRadius() {
        return this.LJZ;
    }

    public final float getRingWidth() {
        return this.LJLIL;
    }

    public final EnumC53704L5w getThemeType() {
        return this.LJLLI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int height;
        if (canvas == null) {
            return;
        }
        switch (C53702L5u.LIZ[this.LJLLLL.ordinal()]) {
            case 1:
                super.dispatchDraw(canvas);
                return;
            case 2:
                this.LJLL.setStyle(Paint.Style.STROKE);
                this.LJLL.setShader(null);
                this.LJLL.setColor(getGray());
                canvas.drawArc(this.LJLLLLLL, 0.0f, 360.0f, false, this.LJLL);
                this.LJLL.setShader(this.LJZI);
                this.LJLL.setColor(-16777216);
                canvas.drawArc(this.LJLLLLLL, -90.0f, this.LJLLL * 360.0f, false, this.LJLL);
                break;
            case 3:
                this.LJLL.setShader(this.LJZI);
                this.LJLL.setStyle(Paint.Style.STROKE);
                this.LJLL.setColor(-16777216);
                canvas.drawArc(this.LJLLLLLL, -90.0f, 360.0f, false, this.LJLL);
                break;
            case 4:
                this.LJLL.setShader(this.LJZI);
                this.LJLL.setStyle(Paint.Style.FILL);
                this.LJLL.setColor(-16777216);
                if (getWidth() < getHeight()) {
                    height = getWidth();
                } else {
                    height = getHeight();
                }
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, height / 2.0f, this.LJLL);
                break;
            case 5:
                this.LJLL.setStyle(Paint.Style.STROKE);
                this.LJLL.setShader(null);
                this.LJLL.setColor(getGray());
                canvas.drawArc(this.LJLLLLLL, -90.0f, 360.0f, false, this.LJLL);
                break;
            case 6:
                this.LJLL.setStyle(Paint.Style.STROKE);
                this.LJLL.setShader(null);
                this.LJLL.setColor(this.LLF);
                canvas.drawArc(this.LJLLLLLL, -90.0f, 360.0f, false, this.LJLL);
                break;
            case 7:
                this.LJLL.setShader(this.LJZI);
                this.LJLL.setStyle(Paint.Style.FILL);
                this.LJLL.setColor(-16777216);
                this.LJLL.setAlpha(this.LJLJLLL);
                RectF rectF = this.LJLZ;
                float f = this.LJZ;
                canvas.drawRoundRect(rectF, f, f, this.LJLL);
                break;
            case 8:
                this.LJLL.setShader(this.LJZL);
                this.LJLL.setStyle(Paint.Style.FILL);
                this.LJLL.setColor(-16777216);
                RectF rectF2 = this.LJLZ;
                float f2 = this.LJZ;
                canvas.drawRoundRect(rectF2, f2, f2, this.LJLL);
                this.LJLL.setShader(null);
                this.LJLL.setColor(ColorProtector.parseColor("#33000000"));
                RectF rectF3 = this.LJLZ;
                float f3 = this.LJZ;
                canvas.drawRoundRect(rectF3, f3, f3, this.LJLL);
                break;
            case 9:
                this.LJLL.setShader(null);
                this.LJLL.setStyle(Paint.Style.FILL);
                this.LJLL.setColor(ColorProtector.parseColor("#80009CB0"));
                RectF rectF4 = this.LJLZ;
                float f4 = this.LJZ;
                canvas.drawRoundRect(rectF4, f4, f4, this.LJLL);
                break;
        }
        super.dispatchDraw(canvas);
    }

    public final void setBackgroundAlpha(float f) {
        int LJJIIZ;
        this.LJLJLJ = f;
        if (f < 0.0f) {
            LJJIIZ = 0;
        } else if (f > 1.0f) {
            LJJIIZ = 255;
        } else {
            LJJIIZ = O6R.LJJIIZ(f * 255);
        }
        this.LJLJLLL = LJJIIZ;
        invalidate();
    }

    public final void setMode(EnumC53701L5t value) {
        o.LJIIIZ(value, "value");
        if (this.LJLLLL == value) {
            return;
        }
        this.LJLLLL = value;
        C73411SrX c73411SrX = this.LJLJJLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLJJLL = null;
        this.LJLJJL = null;
        if (this.LJLLLL == EnumC53701L5t.PRORGRESS) {
            setProgress(0.0f);
            this.LJLJJLL = (C73411SrX) AbstractC73672Svk.LJIIJ(new IDuS320S0100000_9(this, 6)).LJIIJJI(300L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0100000_1(this, 39), new InterfaceC64592gB() { // from class: X.3Wn
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
        EnumC53701L5t enumC53701L5t = EnumC53701L5t.BREATH;
        if (value == enumC53701L5t) {
            if (this.LJLJL == null) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                C2315096s c2315096s = new C2315096s(context, null, 0);
                c2315096s.setTag(enumC53701L5t);
                this.LJLJL = c2315096s;
            }
            addView(this.LJLJL, new FrameLayout.LayoutParams(-1, -1));
        } else if (indexOfChild(this.LJLJL) >= 0) {
            C2315096s c2315096s2 = this.LJLJL;
            if (c2315096s2 != null && c2315096s2.LJLILLLLZI) {
                c2315096s2.pause();
            }
            C2315096s c2315096s3 = this.LJLJL;
            if (C78996UzQ.LJJIIJZLJL(c2315096s3)) {
                C78996UzQ.LJI();
            }
            removeView(c2315096s3);
        }
        invalidate();
    }

    public final void setProgress(float f) {
        this.LJLLJ = f;
        if (this.LJLLLL != EnumC53701L5t.PRORGRESS) {
            return;
        }
        if (f < this.LJLLL) {
            ValueAnimator valueAnimator = this.LJLLILLLL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.LJLLILLLL;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator3 = this.LJLLILLLL;
            if (valueAnimator3 != null) {
                C16880lQ.LJLJL(valueAnimator3);
            }
            float f2 = this.LJLLJ;
            if (f2 == 0.0f) {
                this.LJLLL = f2;
                invalidate();
                return;
            }
            return;
        }
        AqS175S0100000_9 aqS175S0100000_9 = this.LJLJJL;
        if (aqS175S0100000_9 != null) {
            aqS175S0100000_9.invoke(Float.valueOf(f));
        }
    }

    public final void setRadius(float f) {
        this.LJZ = f;
        invalidate();
    }

    public final void setRingWidth(float f) {
        this.LJLIL = f;
        this.LJLL.setStrokeWidth(f);
        LIZ(getWidth(), getHeight());
        invalidate();
    }

    public final void setThemeType(EnumC53704L5w enumC53704L5w) {
        o.LJIIIZ(enumC53704L5w, "<set-?>");
        this.LJLLI = enumC53704L5w;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        C2315096s c2315096s;
        super.setVisibility(i);
        if (i != 0 && (c2315096s = this.LJLJL) != null && c2315096s.LJLILLLLZI) {
            c2315096s.pause();
        }
    }

    public final void LIZ(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        RectF rectF = this.LJLLLLLL;
        float f = this.LJLIL;
        rectF.left = f / 2.0f;
        rectF.top = (f / 2.0f) + 0.0f;
        float f2 = i;
        rectF.right = f2 - (f / 2.0f);
        float f3 = i2;
        rectF.bottom = f3 - (f / 2.0f);
        RectF rectF2 = this.LJLZ;
        rectF2.left = 0.0f;
        rectF2.top = 0.0f;
        rectF2.right = f2;
        rectF2.bottom = f3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C53700L5s(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53700L5s.<init>(android.content.Context, android.util.AttributeSet, int):void");
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
                int i7 = this.LJLILLLLZI;
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
                                i7 = this.LJLJJI;
                            }
                        } else {
                            i7 = this.LJLJI;
                        }
                    }
                }
            }
            float[] fArr = new float[3];
            int i8 = 0;
            loop2: while (true) {
                float f = 0.0f;
                while (true) {
                    fArr[i8] = f;
                    i8++;
                    f = 1.0f;
                    if (i8 >= 3) {
                        break loop2;
                    }
                    if (i8 == 0) {
                        break;
                    }
                    if (i8 != 1) {
                        if (i8 != 2) {
                            break;
                        }
                    } else {
                        f = 0.5f;
                    }
                }
            }
            this.LJZI = new LinearGradient(0.0f, 0.0f, width, height, iArr, fArr, Shader.TileMode.CLAMP);
            float width2 = getWidth();
            float height2 = getHeight();
            int[] iArr2 = new int[3];
            int i9 = 0;
            loop4: while (true) {
                int i10 = this.LJLILLLLZI;
                while (true) {
                    iArr2[i9] = i10;
                    i9++;
                    if (i9 >= 3) {
                        break loop4;
                    }
                    if (i9 != 0) {
                        if (i9 != 1) {
                            if (i9 != 2) {
                                i10 = 0;
                            } else {
                                i10 = this.LJLJJI;
                            }
                        } else {
                            i10 = this.LJLJI;
                        }
                    }
                }
            }
            float[] fArr2 = new float[3];
            while (true) {
                float f2 = 0.0f;
                while (true) {
                    fArr2[i5] = f2;
                    i5++;
                    if (i5 < 3) {
                        if (i5 == 0) {
                            break;
                        }
                        if (i5 != 1) {
                            if (i5 != 2) {
                                break;
                            } else {
                                f2 = 1.0f;
                            }
                        } else {
                            f2 = 0.53f;
                        }
                    } else {
                        this.LJZL = new LinearGradient(0.0f, 0.0f, width2, height2, iArr2, fArr2, Shader.TileMode.CLAMP);
                        return;
                    }
                }
            }
        }
    }
}
