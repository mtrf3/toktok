package X;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.0XD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XD {
    public static final BoringLayout.Metrics LIZIZ(CharSequence text, TextPaint paint, TextDirectionHeuristic textDir) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        o.LJIIIZ(textDir, "textDir");
        if (textDir.isRtl(text, 0, text.length())) {
            return null;
        }
        return BoringLayout.isBoring(text, paint, null);
    }

    public static final BoringLayout LIZ(CharSequence text, TextPaint paint, int i, Layout.Alignment alignment, float f, float f2, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        o.LJIIIZ(alignment, "alignment");
        o.LJIIIZ(metrics, "metrics");
        return new BoringLayout(text, paint, i, alignment, f, f2, metrics, z, truncateAt, i2);
    }
}
