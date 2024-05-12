package X;

import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.0jC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15500jC {
    public static final SimpleDateFormat LIZ = new SimpleDateFormat("yyyy-MM-dd");

    public static boolean LIZ(long j) {
        SimpleDateFormat simpleDateFormat = LIZ;
        return simpleDateFormat.format(new Date(j)).equals(simpleDateFormat.format(new Date()));
    }
}
