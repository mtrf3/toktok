package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YBW extends YBU {
    @Override // X.YBU
    public float getNewLeftWidth() {
        float totalWidth = (((getTotalWidth() - getCaps()) - getWidthCaps()) * ((float) getLeftPercent())) / ((float) (getRightPercent() + getLeftPercent()));
        float totalWidth2 = (((getTotalWidth() - getCaps()) - getWidthCaps()) * ((float) getRightPercent())) / ((float) (getRightPercent() + getLeftPercent()));
        if (getLeftPercent() > getRightPercent()) {
            setRightBitmapW(LIZIZ(46.0f));
            return (getTotalWidth() - Math.max(Math.max(totalWidth2, 0.0f), (getWidthCaps() + (getTextRightPaint().measureText(getMRightText()) + (getTextDis() + getRightBitmapW()))) + getPaddingRight())) - getCaps();
        }
        if (getLeftPercent() >= getRightPercent()) {
            return totalWidth;
        }
        setLeftBitmapW(LIZIZ(46.0f));
        return Math.max(Math.max(totalWidth, 0.0f), getTextLeftPaint().measureText(getMLeftText()) + getTextDis() + getLeftBitmapW() + getPaddingLeft());
    }

    @Override // X.YBU
    public final void LJII() {
        super.LJII();
    }

    @Override // X.YBU, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YBW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        LJ(context, attributeSet);
    }

    @Override // X.YBU
    public final void LJ(Context context, AttributeSet attributeSet) {
        o.LJIIIZ(context, "context");
        super.LJ(context, attributeSet);
        if (o.LJ(context.getResources().getConfiguration().locale.getLanguage(), "ar") || C012403c.LIZ(context) == 1) {
            setScaleX(-1.0f);
        }
        TypedArray typedArray = getTypedArray();
        if (typedArray != null) {
            typedArray.recycle();
        }
    }
}
