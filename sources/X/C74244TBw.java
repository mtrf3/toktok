package X;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import kotlin.jvm.internal.o;

/* renamed from: X.TBw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74244TBw {
    public final C74245TBx LIZ = new C74245TBx();

    public static StaticLayout LIZ(C74244TBw c74244TBw, CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, int i2) {
        int length = ((String) charSequence).length();
        c74244TBw.getClass();
        o.LJIIIZ(textPaint, "textPaint");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) charSequence);
        LIZ.append('-');
        LIZ.append(0);
        LIZ.append('-');
        LIZ.append(length);
        LIZ.append('-');
        LIZ.append(textPaint);
        LIZ.append('-');
        LIZ.append(i);
        LIZ.append('-');
        LIZ.append(alignment);
        LIZ.append('-');
        LIZ.append(f);
        LIZ.append('-');
        LIZ.append(f2);
        LIZ.append('-');
        LIZ.append(true);
        LIZ.append('-');
        LIZ.append(i2);
        LIZ.append('-');
        LIZ.append((Object) null);
        String key = X1D.LIZIZ(LIZ);
        o.LJIIIZ(key, "key");
        StaticLayout staticLayout = c74244TBw.LIZ.get(key);
        if (staticLayout == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = StaticLayout.Builder.obtain(charSequence, 0, length, textPaint, i).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(true).setEllipsizedWidth(i2).setEllipsize(null).build();
            } else {
                staticLayout = new StaticLayout(charSequence, 0, length, textPaint, i, alignment, f, f2, true, null, i2);
            }
            o.LJIIIIZZ(staticLayout, "if (Build.VERSION.SDK_IN…          )\n            }");
        }
        c74244TBw.LIZ.put(key, staticLayout);
        return staticLayout;
    }
}
