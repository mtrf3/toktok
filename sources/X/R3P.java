package X;

import java.util.Calendar;

/* loaded from: classes12.dex */
public final class R3P {
    public static String LIZ(long j) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis <= 0) {
            return "";
        }
        if (timeInMillis < 86400000) {
            return "0d";
        }
        if (timeInMillis < 604800000) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(timeInMillis / 86400000);
            LIZ.append('d');
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(timeInMillis / 604800000);
        LIZ2.append('w');
        return X1D.LIZIZ(LIZ2);
    }
}
