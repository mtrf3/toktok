package X;

import android.graphics.Paint;

/* renamed from: X.150, reason: invalid class name */
/* loaded from: classes.dex */
public enum AnonymousClass150 {
    Miter,
    Round,
    Bevel;

    public Paint.Join toPaintJoin() {
        int i = C272014y.LIZIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }
        return Paint.Join.BEVEL;
    }

    public static AnonymousClass150 valueOf(String str) {
        return (AnonymousClass150) V0N.LJJJ(AnonymousClass150.class, str);
    }
}
