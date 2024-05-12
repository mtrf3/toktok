package X;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.0XC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XC {
    public static final /* synthetic */ int LIZ = 0;

    public static BoringLayout LIZ(CharSequence text, C17650mf paint, int i, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        boolean z2;
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        o.LJIIIZ(alignment, "alignment");
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (i2 >= 0) {
                return C0XD.LIZ(text, paint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2);
            }
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }
}
