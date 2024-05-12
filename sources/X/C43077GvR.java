package X;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.GvR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43077GvR {
    public static String LIZ(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(simpleDateFormat.format(time));
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }
}
