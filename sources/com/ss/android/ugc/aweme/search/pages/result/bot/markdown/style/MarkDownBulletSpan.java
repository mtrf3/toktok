package com.ss.android.ugc.aweme.search.pages.result.bot.markdown.style;

import X.C0EH;
import X.C32151Nz;
import X.C8FK;
import X.X1D;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.BulletSpan;

/* loaded from: classes4.dex */
public class MarkDownBulletSpan extends BulletSpan implements C8FK {
    public static final float BULLET_RADIUS;
    public static final Path CIRCLE_BULLET_PATH;
    public static final Path RECT_BULLET_PATH;
    public final int mBulletColor;
    public final String mIndex;
    public final int mLevel;
    public int mMargin;
    public int mPointIndex;
    public int orderIndexMargin;
    public static final int TAB = C32151Nz.LJIILLIIL(8);
    public static final int GAP_WIDTH = C32151Nz.LJIILLIIL(8);
    public static final int GAP_WIDTH_ORDER = C32151Nz.LJIILLIIL(12);
    public static final int GAP_WIDTH_ONE_NUM = C32151Nz.LJIILLIIL(8);

    @Override // X.C8FK
    public final int LIZLLL() {
        return getLeadingMargin(true);
    }

    static {
        float LJIILLIIL = C32151Nz.LJIILLIIL(Double.valueOf(1.5d));
        BULLET_RADIUS = LJIILLIIL;
        Path path = new Path();
        RECT_BULLET_PATH = path;
        float f = -LJIILLIIL;
        path.addRect(f, f, LJIILLIIL, LJIILLIIL, Path.Direction.CW);
        Path path2 = new Path();
        CIRCLE_BULLET_PATH = path2;
        path2.addCircle(0.0f, 0.0f, LJIILLIIL, Path.Direction.CW);
    }

    @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        if (this.mPointIndex > 0) {
            int i = TAB;
            this.mMargin = C0EH.LIZ(this.mLevel, 1, GAP_WIDTH_ORDER + this.orderIndexMargin + (((int) BULLET_RADIUS) * 2), i);
        } else {
            int i2 = TAB;
            this.mMargin = C0EH.LIZ(this.mLevel, 1, GAP_WIDTH + this.orderIndexMargin + (((int) BULLET_RADIUS) * 2), i2);
        }
        return this.mMargin;
    }

    public MarkDownBulletSpan(int i, int i2, int i3) {
        super(GAP_WIDTH, i2);
        this.mPointIndex = i3;
        this.mLevel = i;
        if (i3 > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(String.valueOf(i3));
            LIZ.append('.');
            this.mIndex = X1D.LIZIZ(LIZ);
            if (i3 >= 10) {
                this.orderIndexMargin = ((int) Math.log10(i3)) * GAP_WIDTH_ONE_NUM;
            }
        } else {
            this.mIndex = null;
        }
        this.mBulletColor = i2;
    }

    @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Paint.Style style;
        Path path;
        if (((Spanned) charSequence).getSpanStart(this) != i6) {
            return;
        }
        int color = paint.getColor();
        paint.setColor(this.mBulletColor);
        String str = this.mIndex;
        if (str != null) {
            canvas.drawText(str, ((i + this.mMargin) - (GAP_WIDTH_ORDER + this.orderIndexMargin)) - (BULLET_RADIUS * 2.0f), i4, paint);
        } else {
            float f = ((paint.getFontMetrics().bottom - paint.getFontMetrics().top) * 0.5f) + i3;
            Paint.Style style2 = paint.getStyle();
            if (this.mLevel == 1) {
                style = Paint.Style.STROKE;
            } else {
                style = Paint.Style.FILL;
            }
            paint.setStyle(style);
            if (!canvas.isHardwareAccelerated()) {
                if (this.mLevel >= 2) {
                    path = RECT_BULLET_PATH;
                } else {
                    path = CIRCLE_BULLET_PATH;
                }
                canvas.save();
                canvas.translate((i + this.mMargin) - GAP_WIDTH, f);
                canvas.drawPath(path, paint);
                canvas.restore();
            } else {
                canvas.drawCircle((i + this.mMargin) - GAP_WIDTH, f, BULLET_RADIUS, paint);
            }
            paint.setStyle(style2);
        }
        paint.setColor(color);
    }
}
