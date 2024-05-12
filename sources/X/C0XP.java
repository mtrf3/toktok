package X;

import android.text.Layout;
import kotlin.jvm.internal.o;

/* renamed from: X.0XP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XP {
    public static final Layout.Alignment LIZ;
    public static final Layout.Alignment LIZIZ;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (o.LJ(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (o.LJ(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        LIZ = alignment;
        LIZIZ = alignment2;
    }
}
