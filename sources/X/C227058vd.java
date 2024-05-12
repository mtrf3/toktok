package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import java.lang.reflect.Field;

/* renamed from: X.8vd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227058vd {
    public static final Field LIZ;
    public static final Field LIZIZ;

    static {
        try {
            Field declaredField = StaticLayout.class.getDeclaredField("mLines");
            LIZ = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = StaticLayout.class.getDeclaredField("mColumns");
            LIZIZ = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZ(Layout layout, CharSequence charSequence) {
        int lineCount;
        int i;
        int ellipsisStart;
        if (layout == null || TextUtils.isEmpty(charSequence) || (lineCount = layout.getLineCount()) == 0 || (ellipsisStart = layout.getEllipsisStart(lineCount - 1)) < 0 || !Character.isLowSurrogate(charSequence.charAt(ellipsisStart))) {
            return;
        }
        int i2 = ellipsisStart + 1;
        if (!(layout instanceof StaticLayout)) {
            return;
        }
        try {
            ((int[]) LIZ.get(layout))[(((Integer) LIZIZ.get(layout)).intValue() * i) + 5] = i2;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
