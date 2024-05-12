package X;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class F9C {
    public static final List<String> LIZ;
    public static final StringBuilder LIZIZ;
    public static final Formatter LIZJ;

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C16880lQ.LLLLLLLLLL().getPath());
        LIZ2.append("/VESDK_Demo/");
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LIZIZ2);
        LIZ3.append("veimage/");
        X1D.LIZIZ(LIZ3);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(LIZIZ2);
        LIZ4.append("resource/");
        String LIZIZ3 = X1D.LIZIZ(LIZ4);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(LIZIZ3);
        LIZ5.append("filter/");
        X1D.LIZIZ(LIZ5);
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append(LIZIZ3);
        LIZ6.append("stickers/");
        X1D.LIZIZ(LIZ6);
        LIZ = new ArrayList();
        C1JX.LJIIIIZZ(LIZIZ2, "object_tracking/");
        int i = 1;
        while (true) {
            ((ArrayList) LIZ).add(KMP.LJ("Filter_0", i));
            while (true) {
                i++;
                if (i <= 19) {
                    if (i < 10) {
                        break;
                    }
                    ((ArrayList) LIZ).add(KMP.LJ("Filter_", i));
                } else {
                    new ArrayList();
                    StringBuilder sb = new StringBuilder();
                    LIZIZ = sb;
                    LIZJ = new Formatter(sb, Locale.US);
                    return;
                }
            }
        }
    }

    public static String LIZ(int i) {
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 / 3600;
        LIZIZ.setLength(0);
        if (i5 > 0) {
            return LIZJ.format("%d:%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3)).toString();
        }
        return LIZJ.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3)).toString();
    }
}
