package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aZh, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93985aZh {
    public static C113624d4 LIZ(String fallbackLanguage) {
        C113624d4 LIZJ;
        o.LJIIIZ(fallbackLanguage, "fallbackLanguage");
        String string = new C93898aYI().LIZ.getString("selected_sauc_language", "");
        o.LJIIIIZZ(string, "keva.getString(SAUC_LANGUAGE, \"\")");
        if (C93935aYt.LIZIZ() > 0 && string.length() > 0 && (LIZJ = C93935aYt.LIZJ(string)) != null) {
            return LIZJ;
        }
        C113624d4 LIZJ2 = C93935aYt.LIZJ(fallbackLanguage);
        if (LIZJ2 != null) {
            new C93898aYI().LIZ.storeString("selected_sauc_language", "");
            return LIZJ2;
        }
        C93935aYt.LJ = "English (United States)";
        C93935aYt.LIZLLL = "English";
        C93935aYt.LJFF = "en";
        C93935aYt.LJI = "en-US";
        return new C113624d4("English", "English (United States)", "en", "en-US");
    }
}
