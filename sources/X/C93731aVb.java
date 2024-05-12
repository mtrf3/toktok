package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.o;

/* renamed from: X.aVb, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93731aVb {
    public static final SimpleDateFormat LIZ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static final String LIZ() {
        String format = LIZ.format(new Date());
        o.LJIIIIZZ(format, "df.format(Date())");
        return format;
    }
}
