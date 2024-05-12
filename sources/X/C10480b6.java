package X;

import android.graphics.Paint;
import android.text.Layout;
import kotlin.jvm.internal.o;

/* renamed from: X.0b6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10480b6 {
    public static final float LIZ(Layout layout, int i, Paint paint) {
        boolean z;
        float abs;
        float width;
        o.LJIIIZ(layout, "<this>");
        o.LJIIIZ(paint, "paint");
        float lineLeft = layout.getLineLeft(i);
        if (layout.getEllipsisCount(i) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null || C10470b5.LIZ[paragraphAlignment.ordinal()] != 1) {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        } else {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        }
        return width + abs;
    }

    public static final float LIZIZ(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        o.LJIIIZ(layout, "<this>");
        o.LJIIIZ(paint, "paint");
        if (layout.getEllipsisCount(i) > 0 && layout.getParagraphDirection(i) == -1 && layout.getWidth() < layout.getLineRight(i)) {
            float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
            Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
            if (paragraphAlignment == null || C10470b5.LIZ[paragraphAlignment.ordinal()] != 1) {
                width = layout.getWidth() - layout.getLineRight(i);
                width2 = layout.getWidth() - measureText;
            } else {
                width = layout.getWidth() - layout.getLineRight(i);
                width2 = (layout.getWidth() - measureText) / 2.0f;
            }
            return width - width2;
        }
        return 0.0f;
    }
}
