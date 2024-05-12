package X;

import android.os.Build;
import android.text.TextPaint;

/* renamed from: X.0gH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13690gH {
    public int LIZ;
    public int LIZIZ;

    public C13690gH(TextPaint textPaint) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.LIZ = 1;
            this.LIZIZ = 1;
        } else {
            this.LIZIZ = 0;
            this.LIZ = 0;
        }
    }
}
