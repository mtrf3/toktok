package X;

import android.graphics.Color;

/* renamed from: X.5Qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134655Qf {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -16777216;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("RGB(");
        double d = 255;
        LIZ2.append(Color.red(i) / d);
        LIZ2.append(", ");
        LIZ2.append(Color.green(i) / d);
        LIZ2.append(", ");
        LIZ2.append(Color.blue(i) / d);
        LIZ2.append(") alpha(");
        LIZ2.append(Color.alpha(i) / d);
        LIZ2.append(')');
        return X1D.LIZIZ(LIZ2);
    }
}
