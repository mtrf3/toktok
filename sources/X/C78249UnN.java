package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;

/* renamed from: X.UnN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78249UnN {
    public static Bitmap LIZ(MaskSrc maskSrc) {
        if (TextUtils.isEmpty(maskSrc.getText())) {
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setStyle(Paint.Style.FILL);
        if (maskSrc.isBold()) {
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
        if (maskSrc.getTextSize() <= 0) {
            maskSrc.setTextSize(36);
        }
        textPaint.setTextSize(maskSrc.getTextSize() * 0.6f);
        if (TextUtils.isEmpty(maskSrc.getTextColor())) {
            maskSrc.setTextColor("#FF000000");
        }
        textPaint.setColor(ColorProtector.parseColor(maskSrc.getTextColor()));
        Rect rect = new Rect();
        textPaint.getTextBounds(maskSrc.getText(), 0, maskSrc.getText().length(), rect);
        int width = rect.width();
        int height = rect.height();
        rect.set(0, 0, width, height);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        createBitmap.eraseColor(0);
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        int centerY = rect.centerY();
        int i = fontMetricsInt.bottom;
        canvas.drawText(maskSrc.getText(), rect.centerX(), (((i - fontMetricsInt.top) / 2) + centerY) - i, textPaint);
        return createBitmap;
    }
}
