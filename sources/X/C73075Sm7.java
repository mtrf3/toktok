package X;

import java.util.Locale;

/* renamed from: X.Sm7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73075Sm7 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        int i2 = i % 60;
        int i3 = i / 60;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        if (i4 == 0) {
            if (i5 >= 10) {
                return C63144OqK.LIZIZ(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)}, 2, Locale.ENGLISH, "%02d:%02d", "format(locale, format, *args)");
            }
            return C63144OqK.LIZIZ(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)}, 2, Locale.ENGLISH, "%1d:%02d", "format(locale, format, *args)");
        }
        return C63144OqK.LIZIZ(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)}, 3, Locale.ENGLISH, "%02d:%02d:%02d", "format(locale, format, *args)");
    }
}
