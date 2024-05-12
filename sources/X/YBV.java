package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YBV extends YBU {
    @Override // X.YBU
    public final void LJII() {
        int measureText;
        int i;
        int i2;
        int measureText2;
        int i3;
        int measureText3;
        int i4;
        int measureText4;
        int i5;
        int i6;
        super.LJII();
        int i7 = 0;
        if (getLeftContentGravity() == 1) {
            Bitmap leftBitmap = getLeftBitmap();
            if (leftBitmap != null) {
                measureText4 = leftBitmap.getWidth();
            } else {
                measureText4 = (int) getTextLeftPaint().measureText(getLeftCircleText());
            }
            setLeftBitmapW(measureText4);
            setLeftP(getPaddingLeft());
            getLeftRect().left = getLeftP();
            getLeftRect().right = getLeftBitmapW() + getLeftRect().left;
            Rect leftRect = getLeftRect();
            float totalHeight = getTotalHeight();
            Bitmap leftBitmap2 = getLeftBitmap();
            if (leftBitmap2 != null) {
                i5 = leftBitmap2.getHeight();
            } else {
                i5 = 0;
            }
            leftRect.top = (int) ((totalHeight - i5) / 2);
            Rect leftRect2 = getLeftRect();
            int i8 = getLeftRect().top;
            Bitmap leftBitmap3 = getLeftBitmap();
            if (leftBitmap3 != null) {
                i6 = leftBitmap3.getHeight();
            } else {
                i6 = 0;
            }
            leftRect2.bottom = i8 + i6;
        } else {
            Bitmap leftBitmap4 = getLeftBitmap();
            if (leftBitmap4 != null) {
                measureText = leftBitmap4.getWidth();
            } else {
                measureText = (int) getTextLeftPaint().measureText(getLeftCircleText());
            }
            setLeftBitmapW(measureText);
            float f = 2;
            setLeftP((int) ((getLeftWidth() - (getTextLeftPaint().measureText(getMLeftText()) + (getTextDis() + getLeftBitmapW()))) / f));
            getLeftRect().left = getLeftP();
            getLeftRect().right = getLeftBitmapW() + getLeftRect().left;
            Rect leftRect3 = getLeftRect();
            float totalHeight2 = getTotalHeight();
            Bitmap leftBitmap5 = getLeftBitmap();
            if (leftBitmap5 != null) {
                i = leftBitmap5.getHeight();
            } else {
                i = 0;
            }
            leftRect3.top = (int) ((totalHeight2 - i) / f);
            Rect leftRect4 = getLeftRect();
            int i9 = getLeftRect().top;
            Bitmap leftBitmap6 = getLeftBitmap();
            if (leftBitmap6 != null) {
                i2 = leftBitmap6.getHeight();
            } else {
                i2 = 0;
            }
            leftRect4.bottom = i9 + i2;
        }
        if (getRightContentGravity() == 2) {
            Bitmap rightBitmap = getRightBitmap();
            if (rightBitmap != null) {
                measureText3 = rightBitmap.getWidth();
            } else {
                measureText3 = (int) getTextRightPaint().measureText(getRightCircleText());
            }
            setRightBitmapW(measureText3);
            setRightP((int) (getTotalWidth() - ((getTextRightPaint().measureText(getMRightText()) + (getTextDis() + getRightBitmapW())) + getPaddingRight())));
            getRightRect().left = getRightP();
            getRightRect().right = getRightBitmapW() + getRightRect().left;
            Rect rightRect = getRightRect();
            float totalHeight3 = getTotalHeight();
            Bitmap rightBitmap2 = getRightBitmap();
            if (rightBitmap2 != null) {
                i4 = rightBitmap2.getHeight();
            } else {
                i4 = 0;
            }
            rightRect.top = (int) ((totalHeight3 - i4) / 2);
            Rect rightRect2 = getRightRect();
            int i10 = getRightRect().top;
            Bitmap rightBitmap3 = getRightBitmap();
            if (rightBitmap3 != null) {
                i7 = rightBitmap3.getHeight();
            }
            rightRect2.bottom = i10 + i7;
            return;
        }
        Bitmap rightBitmap4 = getRightBitmap();
        if (rightBitmap4 != null) {
            measureText2 = rightBitmap4.getWidth();
        } else {
            measureText2 = (int) getTextRightPaint().measureText(getRightCircleText());
        }
        setRightBitmapW(measureText2);
        float f2 = 2;
        setRightP((int) ((((((getTotalWidth() - getLeftWidth()) - getWidthCaps()) - getCaps()) - (getTextRightPaint().measureText(getMRightText()) + (getTextDis() + getRightBitmapW()))) / f2) + getCaps() + getWidthCaps() + getLeftWidth()));
        getRightRect().left = getRightP();
        getRightRect().right = getRightBitmapW() + getRightRect().left;
        Rect rightRect3 = getRightRect();
        float totalHeight4 = getTotalHeight();
        Bitmap rightBitmap5 = getRightBitmap();
        if (rightBitmap5 != null) {
            i3 = rightBitmap5.getHeight();
        } else {
            i3 = 0;
        }
        rightRect3.top = (int) ((totalHeight4 - i3) / f2);
        Rect rightRect4 = getRightRect();
        int i11 = getRightRect().top;
        Bitmap rightBitmap6 = getRightBitmap();
        if (rightBitmap6 != null) {
            i7 = rightBitmap6.getHeight();
        }
        rightRect4.bottom = i11 + i7;
    }

    @Override // X.YBU
    public float getNewLeftWidth() {
        int measureText;
        int measureText2;
        float totalWidth = (((getTotalWidth() - getCaps()) - getWidthCaps()) * ((float) getLeftPercent())) / ((float) (getRightPercent() + getLeftPercent()));
        float totalWidth2 = (((getTotalWidth() - getCaps()) - getWidthCaps()) * ((float) getRightPercent())) / ((float) (getRightPercent() + getLeftPercent()));
        if (getLeftPercent() > getRightPercent()) {
            Bitmap rightBitmap = getRightBitmap();
            if (rightBitmap != null) {
                measureText2 = rightBitmap.getWidth();
            } else {
                measureText2 = (int) getTextRightPaint().measureText(getRightCircleText());
            }
            setRightBitmapW(measureText2);
            return (getTotalWidth() - Math.max(Math.max(totalWidth2, 0.0f), (getWidthCaps() + (getTextRightPaint().measureText(getMRightText()) + (getTextDis() + getRightBitmapW()))) + getPaddingRight())) - getCaps();
        }
        if (getLeftPercent() >= getRightPercent()) {
            return totalWidth;
        }
        Bitmap leftBitmap = getLeftBitmap();
        if (leftBitmap != null) {
            measureText = leftBitmap.getWidth();
        } else {
            measureText = (int) getTextLeftPaint().measureText(getLeftCircleText());
        }
        setLeftBitmapW(measureText);
        return Math.max(Math.max(totalWidth, 0.0f), getTextLeftPaint().measureText(getMLeftText()) + getTextDis() + getLeftBitmapW() + getPaddingLeft());
    }

    @Override // X.YBU, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        getTextLeftPaint().setTextSkewX(0.0f);
        getTextLeftPaint().setTypeface(C8HI.LIZJ().LIZLLL("regular"));
        Bitmap leftBitmap = getLeftBitmap();
        if (leftBitmap != null) {
            canvas.drawBitmap(leftBitmap, (Rect) null, getLeftRect(), getTextLeftPaint());
        }
        Paint.FontMetrics fontMetrics = getTextLeftPaint().getFontMetrics();
        float abs = Math.abs(fontMetrics.ascent) + fontMetrics.descent;
        getTextLeftPaint().setTypeface(C8HI.LIZJ().LIZLLL("bold"));
        float f = 2;
        float f2 = 4;
        float f3 = abs / f2;
        canvas.drawText(getLeftCircleText(), ((getLeftBitmapW() - getTextLeftPaint().measureText(getLeftCircleText())) / f) + getLeftP(), (getHeight() / 2) + f3, getTextLeftPaint());
        getTextLeftPaint().setTextSkewX(-0.15f);
        canvas.drawText(getMLeftText(), getTextDis() + getLeftBitmapW() + getLeftP(), (getHeight() / 2) + f3, getTextLeftPaint());
        getTextRightPaint().setTextSkewX(0.0f);
        getTextRightPaint().setTypeface(C8HI.LIZJ().LIZLLL("regular"));
        Bitmap rightBitmap = getRightBitmap();
        if (rightBitmap != null) {
            canvas.drawBitmap(rightBitmap, (Rect) null, getRightRect(), getTextRightPaint());
        }
        Paint.FontMetrics fontMetrics2 = getTextRightPaint().getFontMetrics();
        float abs2 = Math.abs(fontMetrics2.ascent) + fontMetrics2.descent;
        getTextRightPaint().setTypeface(C8HI.LIZJ().LIZLLL("bold"));
        float f4 = abs2 / f2;
        canvas.drawText(getRightCircleText(), ((getRightBitmapW() - getTextRightPaint().measureText(getRightCircleText())) / f) + getRightP(), (getHeight() / 2) + f4, getTextRightPaint());
        getTextRightPaint().setTextSkewX(-0.15f);
        canvas.drawText(getMRightText(), getTextDis() + getRightBitmapW() + getRightP(), (getHeight() / 2) + f4, getTextRightPaint());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YBV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        LJ(context, attributeSet);
    }

    @Override // X.YBU
    public final void LJ(Context context, AttributeSet attributeSet) {
        float f;
        int i;
        o.LJIIIZ(context, "context");
        super.LJ(context, attributeSet);
        TypedArray typedArray = getTypedArray();
        float f2 = 0.0f;
        if (typedArray != null) {
            f = typedArray.getDimension(4, LIZIZ(18.0f));
        } else {
            f = 0.0f;
        }
        TypedArray typedArray2 = getTypedArray();
        if (typedArray2 != null) {
            f2 = typedArray2.getDimension(3, LIZIZ(18.0f));
        }
        TypedArray typedArray3 = getTypedArray();
        int i2 = 0;
        if (typedArray3 != null) {
            i = typedArray3.getResourceId(5, R.drawable.d9u);
        } else {
            i = 0;
        }
        setLeftBitmap(YBU.LIZ(BitmapFactory.decodeResource(getResources(), i), f, f2));
        TypedArray typedArray4 = getTypedArray();
        if (typedArray4 != null) {
            i2 = typedArray4.getResourceId(7, R.drawable.d9u);
        }
        setRightBitmap(YBU.LIZ(BitmapFactory.decodeResource(getResources(), i2), f, f2));
        setBitmapWidth(f);
        setBitmapHeight(f2);
        TypedArray typedArray5 = getTypedArray();
        if (typedArray5 != null) {
            typedArray5.recycle();
        }
    }
}
