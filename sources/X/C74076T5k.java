package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* renamed from: X.T5k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74076T5k {
    public static StaticLayout LIZ(CharSequence charSequence, int i, TextPaint textPaint, int i2, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i3, TextDirectionHeuristic textDirectionHeuristic) {
        int i4 = i3;
        if (i4 == -1 && textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return new StaticLayout(charSequence, 0, i, textPaint, i2, alignment, f, f2, z);
        }
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor constructor = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            Object[] objArr = new Object[13];
            objArr[0] = charSequence;
            objArr[1] = 0;
            objArr[2] = Integer.valueOf(i);
            objArr[3] = textPaint;
            objArr[4] = Integer.valueOf(i2);
            objArr[5] = alignment;
            objArr[6] = textDirectionHeuristic;
            objArr[7] = Float.valueOf(f);
            objArr[8] = Float.valueOf(f2);
            objArr[9] = Boolean.valueOf(z);
            objArr[10] = truncateAt;
            objArr[11] = Integer.valueOf(i2);
            if (i4 == -1) {
                i4 = Integer.MAX_VALUE;
            }
            objArr[12] = Integer.valueOf(i4);
            return (StaticLayout) constructor.newInstance(objArr);
        } catch (Throwable unused) {
            return new StaticLayout(charSequence, 0, i, textPaint, i2, alignment, f, f2, z);
        }
    }
}
