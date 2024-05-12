package X;

import Y.ALAdapterS1S0200000_2;
import Y.AUListenerS66S0101000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;

/* renamed from: X.6Lw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159006Lw extends View {
    public final float LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public Bitmap LJLLLLLL;
    public Bitmap LJLZ;
    public Bitmap LJZ;
    public Bitmap LJZI;
    public Bitmap LJZL;
    public Bitmap LL;
    public Bitmap LLD;
    public Canvas LLF;
    public C159016Lx[] LLFF;
    public C159016Lx[] LLFFF;
    public C159016Lx[] LLFII;
    public XKQ LLFZ;
    public XKQ LLI;
    public XKQ LLIFFJFJJ;
    public XKQ LLII;
    public XKQ LLIIII;
    public boolean LLIIIILZ;

    private final Paint getBallOverlapPaint() {
        return (Paint) this.LJLLI.getValue();
    }

    private final Paint getDotPaint() {
        return (Paint) this.LJLL.getValue();
    }

    private final Paint getGridAlphaPaint() {
        return (Paint) this.LJLLJ.getValue();
    }

    private final Paint getGridMaskPaint() {
        return (Paint) this.LJLLILLLL.getValue();
    }

    private final Paint getLinePaint() {
        return (Paint) this.LJLJLLL.getValue();
    }

    public final void LIZIZ() {
        XKQ xkq = this.LLFZ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        XKQ xkq2 = this.LLI;
        if (xkq2 != null) {
            xkq2.LIZIZ(null);
        }
        XKQ xkq3 = this.LLIFFJFJJ;
        if (xkq3 != null) {
            xkq3.LIZIZ(null);
        }
        XKQ xkq4 = this.LLII;
        if (xkq4 != null) {
            xkq4.LIZIZ(null);
        }
        XKQ xkq5 = this.LLIIII;
        if (xkq5 != null) {
            xkq5.LIZIZ(null);
        }
        setVisibility(4);
    }

    public final InterpolatorC61446O9q getFadeInInterpolator() {
        return (InterpolatorC61446O9q) this.LJLLL.getValue();
    }

    public final InterpolatorC61446O9q getFadeOutInterpolator() {
        return (InterpolatorC61446O9q) this.LJLLLL.getValue();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.LJLLLLLL;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.LJLLLLLL = null;
        Bitmap bitmap2 = this.LJLZ;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.LJLZ = null;
        Bitmap bitmap3 = this.LJZ;
        if (bitmap3 != null) {
            bitmap3.recycle();
        }
        this.LJZ = null;
        Bitmap bitmap4 = this.LJZI;
        if (bitmap4 != null) {
            bitmap4.recycle();
        }
        this.LJZI = null;
        Bitmap bitmap5 = this.LJZL;
        if (bitmap5 != null) {
            bitmap5.recycle();
        }
        this.LJZL = null;
        Bitmap bitmap6 = this.LL;
        if (bitmap6 != null) {
            bitmap6.recycle();
        }
        this.LL = null;
        Bitmap bitmap7 = this.LLD;
        if (bitmap7 != null) {
            bitmap7.recycle();
        }
        this.LLD = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C159016Lx[] c159016LxArr;
        Canvas canvas2;
        Canvas canvas3;
        Bitmap bitmap;
        if (this.LLIIIILZ) {
            c159016LxArr = this.LLFFF;
        } else {
            c159016LxArr = this.LLFF;
        }
        this.LLFII = c159016LxArr;
        Canvas canvas4 = this.LLF;
        if (canvas4 != null) {
            canvas4.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        C159016Lx[] c159016LxArr2 = this.LLFII;
        if (c159016LxArr2 != null) {
            for (C159016Lx c159016Lx : c159016LxArr2) {
                Canvas canvas5 = this.LLF;
                getBallOverlapPaint().setAlpha(c159016Lx.LJLJJI);
                int i = C159026Ly.LIZ[c159016Lx.LJLJI.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4 && (bitmap = this.LJLZ) != null && canvas5 != null) {
                                canvas5.drawBitmap(bitmap, c159016Lx.LJLIL, c159016Lx.LJLILLLLZI, getBallOverlapPaint());
                            }
                        } else {
                            Bitmap bitmap2 = this.LJZ;
                            if (bitmap2 != null && canvas5 != null) {
                                canvas5.drawBitmap(bitmap2, c159016Lx.LJLIL, c159016Lx.LJLILLLLZI, getBallOverlapPaint());
                            }
                        }
                    } else {
                        Bitmap bitmap3 = this.LJLZ;
                        if (bitmap3 != null && canvas5 != null) {
                            canvas5.drawBitmap(bitmap3, c159016Lx.LJLIL, c159016Lx.LJLILLLLZI, getBallOverlapPaint());
                        }
                    }
                } else {
                    Bitmap bitmap4 = this.LJLLLLLL;
                    if (bitmap4 != null && canvas5 != null) {
                        canvas5.drawBitmap(bitmap4, c159016Lx.LJLIL, c159016Lx.LJLILLLLZI, getBallOverlapPaint());
                    }
                }
            }
        }
        Bitmap bitmap5 = this.LL;
        if (bitmap5 != null) {
            Canvas canvas6 = this.LLF;
            if (canvas6 != null) {
                canvas6.drawBitmap(bitmap5, 0.0f, 0.0f, getGridMaskPaint());
            }
            Canvas canvas7 = this.LLF;
            if (canvas7 != null) {
                canvas7.drawBitmap(bitmap5, 0.0f, 0.0f, getGridAlphaPaint());
            }
        }
        if (this.LLIIIILZ) {
            Bitmap bitmap6 = this.LJZI;
            if (bitmap6 != null && (canvas3 = this.LLF) != null) {
                canvas3.drawBitmap(bitmap6, 0.0f, 0.0f, getGridMaskPaint());
            }
            Bitmap bitmap7 = this.LJZL;
            if (bitmap7 != null && (canvas2 = this.LLF) != null) {
                canvas2.drawBitmap(bitmap7, 0.0f, (this.LJLJJLL - this.LJLJJI) * 1.0f, getGridMaskPaint());
            }
        }
        Bitmap bitmap8 = this.LLD;
        if (bitmap8 != null && canvas != null) {
            canvas.drawBitmap(bitmap8, 0.0f, 0.0f, (Paint) null);
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C159006Lw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = 0.08f;
        this.LJLILLLLZI = C7MY.LIZIZ(22);
        this.LJLJI = C7MY.LIZIZ(2);
        this.LJLJJI = C7MY.LIZIZ(60);
        this.LJLJLLL = C221108m2.LIZIZ(C119454mT.LJLIL);
        this.LJLL = C221108m2.LIZIZ(C5UJ.LJLIL);
        this.LJLLI = C221108m2.LIZIZ(C6M1.LJLIL);
        this.LJLLILLLL = C221108m2.LIZIZ(C5UK.LJLIL);
        this.LJLLJ = C221108m2.LIZIZ(C6M0.LJLIL);
        this.LJLLL = C221108m2.LIZIZ(C6M2.LJLIL);
        this.LJLLLL = C221108m2.LIZIZ(C6M3.LJLIL);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size != this.LJLJJL || size2 != this.LJLJJLL) {
            this.LJLJJL = size;
            this.LJLJJLL = size2;
            int i3 = this.LJLILLLLZI;
            this.LJLJL = size2 / i3;
            this.LJLJLJ = size / i3;
            EnumC159036Lz enumC159036Lz = EnumC159036Lz.BIG;
            C159016Lx c159016Lx = new C159016Lx(0.0f, C7MY.LIZIZ(26) * (-1.0f), enumC159036Lz);
            c159016Lx.LJLJJI = 204;
            EnumC159036Lz enumC159036Lz2 = EnumC159036Lz.MID_A;
            C159016Lx c159016Lx2 = new C159016Lx(this.LJLJJL - (C7MY.LIZIZ(123) * 1.0f), C7MY.LIZIZ(20) * (-1.0f), enumC159036Lz2);
            c159016Lx2.LJLJJI = 204;
            EnumC159036Lz enumC159036Lz3 = EnumC159036Lz.SMALL;
            EnumC159036Lz enumC159036Lz4 = EnumC159036Lz.MID_B;
            this.LLFF = new C159016Lx[]{c159016Lx, c159016Lx2, new C159016Lx(this.LJLJJL - (C7MY.LIZIZ(121) * 1.0f), C7MY.LIZIZ(324) * 1.0f, enumC159036Lz3), new C159016Lx(C7MY.LIZIZ(70) * 1.0f, C7MY.LIZIZ(150) * 1.0f, enumC159036Lz4), new C159016Lx(C7MY.LIZIZ(20) * 1.0f, this.LJLJJLL - (C7MY.LIZIZ(154) * 1.0f), enumC159036Lz4)};
            C159016Lx c159016Lx3 = new C159016Lx(0.0f, C7MY.LIZIZ(36) * 1.0f, enumC159036Lz);
            c159016Lx3.LJLJJI = 204;
            C159016Lx c159016Lx4 = new C159016Lx(this.LJLJJL - (C7MY.LIZIZ(131) * 1.0f), C7MY.LIZIZ(32) * 1.0f, enumC159036Lz2);
            c159016Lx4.LJLJJI = 204;
            this.LLFFF = new C159016Lx[]{c159016Lx3, c159016Lx4, new C159016Lx(this.LJLJJL - (C7MY.LIZIZ(121) * 1.0f), C7MY.LIZIZ(396) * 1.0f, enumC159036Lz3), new C159016Lx(C7MY.LIZIZ(70) * 1.0f, C7MY.LIZIZ(214) * 1.0f, enumC159036Lz4), new C159016Lx(C7MY.LIZIZ(20) * 1.0f, this.LJLJJLL - (C7MY.LIZIZ(254) * 1.0f), enumC159036Lz4)};
            Bitmap createBitmap = Bitmap.createBitmap(this.LJLJJL, this.LJLJJI, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            float f = 0.0f;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LJLJJI * 1.0f, 0, -1, Shader.TileMode.CLAMP));
            canvas.drawRect(0.0f, 0.0f, this.LJLJJL * 1.0f, this.LJLJJI * 1.0f, paint);
            this.LJZI = createBitmap;
            Bitmap createBitmap2 = Bitmap.createBitmap(this.LJLJJL, this.LJLJJI, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            Paint paint2 = new Paint();
            paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LJLJJI * 1.0f, -1, 0, Shader.TileMode.CLAMP));
            canvas2.drawRect(0.0f, 0.0f, this.LJLJJL * 1.0f, this.LJLJJI * 1.0f, paint2);
            this.LJZL = createBitmap2;
            Bitmap createBitmap3 = Bitmap.createBitmap(O6R.LJJIIZ(C32151Nz.LJIIZILJ(226)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(226)), Bitmap.Config.ARGB_8888);
            Canvas canvas3 = new Canvas(createBitmap3);
            float LIZIZ = C7MY.LIZIZ(113) * 1.0f;
            Paint paint3 = new Paint();
            paint3.setShader(new RadialGradient(LIZIZ, LIZIZ, LIZIZ, new int[]{-855638017, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            canvas3.drawCircle(LIZIZ, LIZIZ, LIZIZ, paint3);
            this.LJLLLLLL = createBitmap3;
            Bitmap createBitmap4 = Bitmap.createBitmap(O6R.LJJIIZ(C32151Nz.LJIIZILJ(154)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(154)), Bitmap.Config.ARGB_8888);
            Canvas canvas4 = new Canvas(createBitmap4);
            float LIZIZ2 = C7MY.LIZIZ(77) * 1.0f;
            Paint paint4 = new Paint();
            paint4.setShader(new RadialGradient(LIZIZ2, LIZIZ2, LIZIZ2, new int[]{-1, -1, 0}, new float[]{0.0f, 0.25f, 1.0f}, Shader.TileMode.CLAMP));
            canvas4.drawCircle(LIZIZ2, LIZIZ2, LIZIZ2, paint4);
            this.LJLZ = createBitmap4;
            Bitmap createBitmap5 = Bitmap.createBitmap(O6R.LJJIIZ(C32151Nz.LJIIZILJ(132)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(132)), Bitmap.Config.ARGB_8888);
            Canvas canvas5 = new Canvas(createBitmap5);
            float LIZIZ3 = C7MY.LIZIZ(66) * 1.0f;
            Paint paint5 = new Paint();
            paint5.setShader(new RadialGradient(LIZIZ3, LIZIZ3, LIZIZ3, new int[]{-1, -1, 0}, new float[]{0.0f, 0.25f, 1.0f}, Shader.TileMode.CLAMP));
            canvas5.drawCircle(LIZIZ3, LIZIZ3, LIZIZ3, paint5);
            this.LJZ = createBitmap5;
            Bitmap createBitmap6 = Bitmap.createBitmap(this.LJLJJL, this.LJLJJLL, Bitmap.Config.ARGB_8888);
            Canvas canvas6 = new Canvas(createBitmap6);
            int i4 = this.LJLJL;
            int i5 = 0;
            while (i5 < i4) {
                i5++;
                float f2 = this.LJLILLLLZI * i5 * 1.0f;
                f = f;
                canvas6.drawLine(f, f2, this.LJLJJL * 1.0f, f2, getLinePaint());
            }
            int i6 = this.LJLJLJ;
            int i7 = 0;
            while (i7 < i6) {
                i7++;
                float f3 = this.LJLILLLLZI * i7 * 1.0f;
                canvas6.drawLine(f3, f, f3, this.LJLJJLL * 1.0f, getLinePaint());
            }
            int i8 = this.LJLJL;
            int i9 = 0;
            while (i9 < i8) {
                i9++;
                float f4 = this.LJLILLLLZI * i9 * 1.0f;
                int i10 = this.LJLJLJ;
                int i11 = 0;
                while (i11 < i10) {
                    i11++;
                    canvas6.drawCircle(this.LJLILLLLZI * i11 * 1.0f, f4, this.LJLJI * 1.0f, getDotPaint());
                }
            }
            this.LL = createBitmap6;
            Bitmap createBitmap7 = Bitmap.createBitmap(this.LJLJJL, this.LJLJJLL, Bitmap.Config.ARGB_8888);
            this.LLD = createBitmap7;
            if (createBitmap7 != null) {
                this.LLF = new Canvas(createBitmap7);
            }
        }
        UC0.LJJJLZIJ(this, this.LJLIL);
        super.onMeasure(i, i2);
    }

    public final Object LIZ(int i, int i2, int i3, AbstractC65782Prm abstractC65782Prm) {
        InterpolatorC61446O9q fadeOutInterpolator;
        XKS xks = new XKS(1, C78555UsJ.LJJII(abstractC65782Prm));
        xks.LJIIL();
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, i3);
        ofInt.setDuration(800L);
        if (i2 < i3) {
            fadeOutInterpolator = getFadeInInterpolator();
        } else {
            fadeOutInterpolator = getFadeOutInterpolator();
        }
        ofInt.setInterpolator(fadeOutInterpolator);
        ofInt.addListener(new ALAdapterS1S0200000_2(ofInt, xks, 5));
        ofInt.addUpdateListener(new AUListenerS66S0101000_2(i, this, 0));
        ofInt.start();
        Object LJIIJJI = xks.LJIIJJI();
        if (LJIIJJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJIIJJI;
        }
        return C76800UCe.LIZ;
    }
}
