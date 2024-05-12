package X;

import android.graphics.Paint;

/* renamed from: X.14z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC272114z {
    Butt,
    Round,
    Unknown;

    public Paint.Cap toPaintCap() {
        int i = C272014y.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
        return Paint.Cap.BUTT;
    }

    public static EnumC272114z valueOf(String str) {
        return (EnumC272114z) V0N.LJJJ(EnumC272114z.class, str);
    }
}
