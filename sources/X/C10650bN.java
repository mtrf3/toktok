package X;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: X.0bN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10650bN {
    public static LocaleList LIZIZ() {
        return LocaleList.getAdjustedDefault();
    }

    public static LocaleList LIZJ() {
        return LocaleList.getDefault();
    }

    public static LocaleList LIZ(Locale... localeArr) {
        return new LocaleList(localeArr);
    }
}
