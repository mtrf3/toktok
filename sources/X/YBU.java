package X;

import Y.ALAdapterS12S0100000_15;
import Y.AUListenerS102S0100000_15;
import Y.AUListenerS75S0101000_15;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class YBU extends View {
    public static final /* synthetic */ int LLJI = 0;
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final Path LJLJI;
    public final Path LJLJJI;
    public final Path LJLJJL;
    public final Paint LJLJJLL;
    public final Paint LJLJL;
    public final Paint LJLJLJ;
    public final Paint LJLJLLL;
    public final Paint LJLL;
    public float LJLLI;
    public long LJLLILLLL;
    public long LJLLJ;
    public float LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public float LJZ;
    public String LJZI;
    public String LJZL;
    public long LL;
    public String LLD;
    public String LLF;
    public long LLFF;
    public TypedArray LLFFF;
    public int LLFII;
    public int LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public final double LLIIIILZ;
    public LinearGradient LLIIIJ;
    public LinearGradient LLIIIL;
    public Bitmap LLIIIZ;
    public Bitmap LLIIJI;
    public String LLIIJLIL;
    public String LLIIL;
    public final Rect LLIILII;
    public final Rect LLIILZL;
    public float LLIIZ;
    public int LLIL;
    public int LLILII;
    public int LLILIL;
    public int LLILL;
    public float LLILLIZIL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final PaintFlagsDrawFilter LLJ;

    public float getNewLeftWidth() {
        return 0.0f;
    }

    public void LJII() {
        if (!this.LLIIII && !this.LLII) {
            return;
        }
        this.LLII = false;
        this.LLIIII = false;
        if (!this.LLIZ || this.LJLLI <= 0.0f) {
            this.LJLLI = getNewLeftWidth();
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.LJLLL + this.LJLLI, 0.0f, this.LLFII, this.LLFZ, Shader.TileMode.CLAMP);
        this.LLIIIJ = linearGradient;
        this.LJLJJLL.setShader(linearGradient);
        float f = 255;
        this.LJLJJLL.setAlpha((int) (this.LLILLIZIL * f));
        this.LJLJLLL.setAlpha((int) (this.LLILLIZIL * f));
        LinearGradient linearGradient2 = new LinearGradient(this.LJLLI, 0.0f, this.LJLLLLLL, 0.0f, this.LLI, this.LLIFFJFJJ, Shader.TileMode.CLAMP);
        this.LLIIIL = linearGradient2;
        this.LJLJL.setShader(linearGradient2);
        this.LJLJL.setAlpha((int) (this.LLILLJJLI * f));
        this.LJLL.setAlpha((int) (this.LLILLJJLI * f));
    }

    public final String getAccessibilityContentDescription() {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        Resources resources = getContext().getResources();
        long j = this.LL;
        int i2 = Integer.MAX_VALUE;
        if (j > 2147483647L) {
            i = Integer.MAX_VALUE;
        } else {
            i = (int) j;
        }
        LIZ.append(resources.getQuantityString(R.plurals.k_, i, this.LJZL, this.LLIIJLIL));
        LIZ.append(", ");
        Resources resources2 = getContext().getResources();
        long j2 = this.LLFF;
        if (j2 <= 2147483647L) {
            i2 = (int) j2;
        }
        LIZ.append(resources2.getQuantityString(R.plurals.k_, i2, this.LLF, this.LLIIL));
        return X1D.LIZIZ(LIZ);
    }

    public final float getBitmapHeight() {
        return this.LLILZ;
    }

    public final float getBitmapWidth() {
        return this.LLILLL;
    }

    public final float getCaps() {
        return this.LJLLLL;
    }

    public final Bitmap getLeftBitmap() {
        return this.LLIIIZ;
    }

    public final int getLeftBitmapW() {
        return this.LLILIL;
    }

    public final String getLeftCircleText() {
        return this.LLIIJLIL;
    }

    public final int getLeftContentGravity() {
        return this.LLILZIL;
    }

    public final int getLeftP() {
        return this.LLIL;
    }

    public final long getLeftPercent() {
        return this.LJLLILLLL;
    }

    public final Rect getLeftRect() {
        return this.LLIILII;
    }

    public final float getLeftWidth() {
        return this.LJLLI;
    }

    public final String getMLeftText() {
        return this.LJZI;
    }

    public final String getMRightText() {
        return this.LLD;
    }

    public final PaintFlagsDrawFilter getMSetfil() {
        return this.LLJ;
    }

    public final Bitmap getRightBitmap() {
        return this.LLIIJI;
    }

    public final int getRightBitmapW() {
        return this.LLILL;
    }

    public final String getRightCircleText() {
        return this.LLIIL;
    }

    public final int getRightContentGravity() {
        return this.LLILZLL;
    }

    public final int getRightP() {
        return this.LLILII;
    }

    public final long getRightPercent() {
        return this.LJLLJ;
    }

    public final Rect getRightRect() {
        return this.LLIILZL;
    }

    public final float getTextDis() {
        return this.LLIIZ;
    }

    public final Paint getTextLeftPaint() {
        return this.LJLJLLL;
    }

    public final Paint getTextRightPaint() {
        return this.LJLL;
    }

    public final float getTotalHeight() {
        return this.LJLZ;
    }

    public final float getTotalWidth() {
        return this.LJLLLLLL;
    }

    public final TypedArray getTypedArray() {
        return this.LLFFF;
    }

    public final float getWidthCaps() {
        return this.LJLLL;
    }

    public static String LIZLLL(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 3) {
            String substring = str.substring(0, 4);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (ujb.o.LJJJJ(substring, ".", false)) {
                String substring2 = substring.substring(0, 3);
                o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring2;
            }
            return substring;
        }
        return str;
    }

    public final int LIZIZ(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final String LIZJ(long j) {
        int i = this.LJLIL;
        if (j >= i) {
            long j2 = j * 1;
            long j3 = i * 999;
            if (j > j3) {
                j2 = j3 * 1;
            }
            String LIZIZ = Q8U.LIZIZ(new Object[]{Double.valueOf((j2 * 1.0d) / i)}, 1, "%.3f", "format(format, *args)");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LIZLLL(LIZIZ));
            LIZ.append('m');
            return X1D.LIZIZ(LIZ);
        }
        int i2 = this.LJLILLLLZI;
        if (j >= i2) {
            String LIZIZ2 = Q8U.LIZIZ(new Object[]{Double.valueOf((j * 1.0d) / i2)}, 1, "%.3f", "format(format, *args)");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZLLL(LIZIZ2));
            LIZ2.append('k');
            return X1D.LIZIZ(LIZ2);
        }
        return String.valueOf(j);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        canvas.setDrawFilter(this.LLJ);
        LJII();
        Path path = this.LJLJI;
        path.reset();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(this.LJLLI + this.LJLLL, 0.0f);
        path.lineTo(this.LJLLI, this.LJLZ);
        path.lineTo(0.0f, this.LJLZ);
        path.close();
        Path path2 = this.LJLJJI;
        path2.reset();
        path2.moveTo(this.LJLLI + this.LJLLL + this.LJLLLL, 0.0f);
        path2.lineTo(this.LJLLLLLL, 0.0f);
        path2.lineTo(this.LJLLLLLL, this.LJLZ);
        path2.lineTo(this.LJLLI + this.LJLLLL, this.LJLZ);
        path2.close();
        canvas.drawPath(this.LJLJI, this.LJLJJLL);
        canvas.drawPath(this.LJLJJI, this.LJLJL);
        if (!this.LLIZLLLIL) {
            return;
        }
        float LIZIZ = LIZIZ(5.0f);
        Path path3 = this.LJLJJL;
        path3.reset();
        path3.moveTo(0.0f, 0.0f);
        path3.lineTo(LIZIZ, 0.0f);
        path3.lineTo(0.0f, LIZIZ);
        path3.close();
        this.LJLJLJ.setShader(this.LLIIIJ);
        float f = 255;
        this.LJLJLJ.setAlpha((int) (this.LLILLIZIL * f));
        this.LJLJLJ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
        canvas.drawPath(this.LJLJJL, this.LJLJLJ);
        Path path4 = this.LJLJJL;
        path4.reset();
        path4.moveTo(0.0f, this.LJLZ - LIZIZ);
        path4.lineTo(0.0f, this.LJLZ);
        path4.lineTo(LIZIZ, this.LJLZ);
        path4.close();
        canvas.drawPath(this.LJLJJL, this.LJLJLJ);
        Path path5 = this.LJLJJL;
        path5.reset();
        path5.moveTo(this.LJLLLLLL - LIZIZ, 0.0f);
        path5.lineTo(this.LJLLLLLL, 0.0f);
        path5.lineTo(this.LJLLLLLL, LIZIZ);
        path5.close();
        this.LJLJLJ.setShader(this.LLIIIL);
        this.LJLJLJ.setAlpha((int) (this.LLILLJJLI * f));
        canvas.drawPath(this.LJLJJL, this.LJLJLJ);
        Path path6 = this.LJLJJL;
        path6.reset();
        path6.moveTo(this.LJLLLLLL, this.LJLZ - LIZIZ);
        path6.lineTo(this.LJLLLLLL, this.LJLZ);
        path6.lineTo(this.LJLLLLLL - LIZIZ, this.LJLZ);
        path6.close();
        canvas.drawPath(this.LJLJJL, this.LJLJLJ);
        this.LJLJLJ.setXfermode(null);
    }

    public final void setBitmapHeight(float f) {
        this.LLILZ = f;
    }

    public final void setBitmapWidth(float f) {
        this.LLILLL = f;
    }

    public final void setCaps(float f) {
        this.LJLLLL = f;
    }

    public final void setCircleBitmap(int i) {
        if (i <= 0) {
            return;
        }
        Bitmap LIZ = LIZ(BitmapFactory.decodeResource(getResources(), i), LIZIZ(18.0f), LIZIZ(18.0f));
        this.LLIIIZ = LIZ;
        this.LLIIJI = LIZ;
        LJFF(this.LLIIJLIL, this.LLIIL);
    }

    public final void setDrawRadius(boolean z) {
        this.LLIZLLLIL = z;
        postInvalidate();
    }

    public final void setLeftBitmap(Bitmap bitmap) {
        this.LLIIIZ = bitmap;
    }

    public final void setLeftBitmapW(int i) {
        this.LLILIL = i;
    }

    public final void setLeftCircleText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LLIIJLIL = str;
    }

    public final void setLeftContentGravity(int i) {
        this.LLILZIL = i;
    }

    public final void setLeftP(int i) {
        this.LLIL = i;
    }

    public final void setLeftPercent(long j) {
        this.LJLLILLLL = j;
    }

    public final void setLeftWidth(float f) {
        this.LJLLI = f;
    }

    public final void setMLeftText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJZI = str;
    }

    public final void setMRightText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LLD = str;
    }

    public final void setRightBitmap(Bitmap bitmap) {
        this.LLIIJI = bitmap;
    }

    public final void setRightBitmapW(int i) {
        this.LLILL = i;
    }

    public final void setRightCircleText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LLIIL = str;
    }

    public final void setRightContentGravity(int i) {
        this.LLILZLL = i;
    }

    public final void setRightP(int i) {
        this.LLILII = i;
    }

    public final void setRightPercent(long j) {
        this.LJLLJ = j;
    }

    public final void setScaleSize(int i) {
        if (i <= 0) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.1f, 1.0f);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new AUListenerS75S0101000_15(i, this, 1));
        ofFloat.start();
    }

    public final void setTextDis(float f) {
        this.LLIIZ = f;
    }

    public final void setTotalHeight(float f) {
        this.LJLZ = f;
    }

    public final void setTotalWidth(float f) {
        this.LJLLLLLL = f;
    }

    public final void setTypedArray(TypedArray typedArray) {
        this.LLFFF = typedArray;
    }

    public final void setWidthCaps(float f) {
        this.LJLLL = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YBU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public void LJ(Context context, AttributeSet attributeSet) {
        o.LJIIIZ(context, "context");
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.yy, R.attr.a0m, R.attr.a1c, R.attr.a2p, R.attr.a2q, R.attr.a2t, R.attr.a2u, R.attr.a2w, R.attr.a2x, R.attr.anv, R.attr.anw, R.attr.ao0, R.attr.ao1, R.attr.ao2, R.attr.ao3, R.attr.b80, R.attr.b81, R.attr.b83, R.attr.b84, R.attr.b85, R.attr.b86, R.attr.bf1, R.attr.bxn});
            this.LJLLL = obtainStyledAttributes.getDimension(22, 10.0f);
            this.LJLLLL = obtainStyledAttributes.getDimension(2, 1.0f);
            obtainStyledAttributes.getDimension(21, LIZIZ(1.0f));
            this.LJZ = obtainStyledAttributes.getDimension(1, 14.0f);
            String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 14);
            String str = "";
            if (LLLZLZ == null) {
                LLLZLZ = "";
            }
            this.LJZI = LLLZLZ;
            String LLLZLZ2 = C16880lQ.LLLZLZ(obtainStyledAttributes, 20);
            if (LLLZLZ2 != null) {
                str = LLLZLZ2;
            }
            this.LLD = str;
            int color = obtainStyledAttributes.getColor(13, -65536);
            this.LLFII = color;
            this.LLFZ = obtainStyledAttributes.getColor(10, color);
            int color2 = obtainStyledAttributes.getColor(19, -16776961);
            this.LLI = color2;
            this.LLIFFJFJJ = obtainStyledAttributes.getColor(16, color2);
            String LLLZLZ3 = C16880lQ.LLLZLZ(obtainStyledAttributes, 6);
            if (LLLZLZ3 == null) {
                LLLZLZ3 = "1";
            }
            this.LLIIJLIL = LLLZLZ3;
            String LLLZLZ4 = C16880lQ.LLLZLZ(obtainStyledAttributes, 8);
            if (LLLZLZ4 == null) {
                LLLZLZ4 = "2";
            }
            this.LLIIL = LLLZLZ4;
            this.LLILZIL = obtainStyledAttributes.getInt(9, 0);
            this.LLILZLL = obtainStyledAttributes.getInt(15, 0);
            this.LLIIZ = obtainStyledAttributes.getDimension(0, 10.0f);
            this.LLFFF = obtainStyledAttributes;
            this.LJLLILLLL = 1L;
            this.LJLLJ = 1L;
            setLayerType(1, null);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        Paint paint = this.LJLJJLL;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint2 = this.LJLJL;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint3 = this.LJLJLJ;
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint4 = this.LJLJLLL;
        paint4.setAntiAlias(true);
        paint4.setColor(-1);
        paint4.setTextSize(this.LJZ);
        paint4.setTextSkewX(0.0f);
        Paint paint5 = this.LJLL;
        paint5.setAntiAlias(true);
        paint5.setColor(-1);
        paint5.setTextSize(this.LJZ);
        paint5.setTextSkewX(0.0f);
        this.LJLJJLL.setPathEffect(new CornerPathEffect(LIZIZ(5.0f)));
        this.LJLJL.setPathEffect(new CornerPathEffect(LIZIZ(5.0f)));
        this.LJLJLJ.setPathEffect(new CornerPathEffect(LIZIZ(2.0f)));
    }

    public final void LJFF(String leftText, String rightText) {
        o.LJIIIZ(leftText, "leftText");
        o.LJIIIZ(rightText, "rightText");
        if (!CC4.LIZIZ(leftText) || !CC4.LIZIZ(rightText)) {
            this.LLIIIZ = null;
            this.LLIIJI = null;
            this.LLIIZ = LIZIZ(6.0f);
        }
        this.LLIIJLIL = leftText;
        this.LLIIL = rightText;
        postInvalidate();
    }

    public final void LJI(long j, long j2) {
        this.LJZL = LIZJ(j);
        this.LL = j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("x ");
        LIZ.append(this.LJZL);
        this.LJZI = X1D.LIZIZ(LIZ);
        this.LLF = LIZJ(j2);
        this.LLFF = j2;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("x ");
        LIZ2.append(this.LLF);
        this.LLD = X1D.LIZIZ(LIZ2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLLLLLL = getMeasuredWidth();
        this.LJLZ = getMeasuredHeight();
        this.LJLLL = (float) ((r1 * 1.0f) / Math.tan(this.LLIIIILZ));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YBU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = 1000000;
        this.LJLILLLLZI = 1000;
        this.LJLJI = new Path();
        this.LJLJJI = new Path();
        this.LJLJJL = new Path();
        this.LJLJJLL = new Paint();
        this.LJLJL = new Paint();
        this.LJLJLJ = new Paint();
        this.LJLJLLL = new Paint();
        this.LJLL = new Paint();
        this.LJLLILLLL = 1L;
        this.LJLLJ = 1L;
        this.LJLLL = 20.0f;
        this.LJLLLL = 8.0f;
        LIZIZ(1.0f);
        this.LJLLLLLL = 188.0f;
        this.LJLZ = 30.0f;
        this.LJZ = 20.0f;
        this.LJZI = "";
        this.LJZL = CardStruct.IStatusCode.DEFAULT;
        this.LLD = "";
        this.LLF = CardStruct.IStatusCode.DEFAULT;
        this.LLII = true;
        this.LLIIII = true;
        this.LLIIIILZ = 45.0d;
        this.LLIIJLIL = "1";
        this.LLIIL = "2";
        this.LLIILII = new Rect();
        this.LLIILZL = new Rect();
        this.LLILLIZIL = 1.0f;
        this.LLILLJJLI = 1.0f;
        this.LLILLL = 1.0f;
        this.LLILZ = 1.0f;
        this.LLILZIL = 0;
        this.LLILZLL = 0;
        this.LLJ = new PaintFlagsDrawFilter(0, 2);
        LJ(context, attributeSet);
    }

    public static Bitmap LIZ(Bitmap bitmap, float f, float f2) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postScale((f * 1.0f) / bitmap.getWidth(), (f2 * 1.0f) / bitmap.getHeight());
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public final void LJIIIIZZ(long j, long j2, long j3) {
        if (j <= 0 && j2 <= 0) {
            this.LJLLILLLL = 1L;
            this.LJLLJ = 1L;
            this.LLIIII = true;
            this.LJLLI = getNewLeftWidth();
            postInvalidate();
            return;
        }
        this.LJLLILLLL = j;
        this.LJLLJ = j2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.LJLLI, getNewLeftWidth());
        ofFloat.setDuration(j3);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addListener(new ALAdapterS12S0100000_15(this, 21));
        ofFloat.addUpdateListener(new AUListenerS102S0100000_15(this, 22));
        ofFloat.start();
    }
}
