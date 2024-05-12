package X;

import com.bytedance.keva.Keva;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.FjY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39792FjY {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(DJ6.LJLIL);

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static String LIZIZ() {
        C43286Gyo.LIZ.getClass();
        String format = new SimpleDateFormat("dd-MM-yyyy", new Locale(C87093YGb.LIZ(), C85990Xow.LIZ())).format(new Date());
        o.LJIIIIZZ(format, "sdf.format(Date())");
        return format;
    }
}
