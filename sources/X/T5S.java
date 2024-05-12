package X;

import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes13.dex */
public final class T5S extends TextPaint {
    public final void LIZ(int i) {
        T5V LIZIZ = UYR.LIZIZ(i, true);
        setTextSize(C32151Nz.LJIIZILJ(Integer.valueOf(LIZIZ.LJLIL)));
        Typeface LIZIZ2 = C61589OFd.LIZIZ(LIZIZ.LJLJI);
        if (LIZIZ2 != null) {
            setTypeface(LIZIZ2);
        }
        setLetterSpacing(LIZIZ.LJLJJI);
    }
}
