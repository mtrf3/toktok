package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FWd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39099FWd {
    public static final String LIZ;
    public static final C62822Ol8 LIZIZ;

    public static String LIZIZ() {
        return (String) LIZIZ.getValue();
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ = JBR.LJFF(LIZ2, EFJ.LIZJ, "/aweme/v2/feed/", LIZ2);
        LIZIZ = C221108m2.LIZIZ(C64840Pca.LJLIL);
    }

    public static String LIZ() {
        String string = IOK.LIZLLL().getString("key_cookie_feed_url", "");
        o.LJIIIIZZ(string, "keva.getString(KEY_COOKIE_FEED_URL, \"\")");
        if (o.LJ(string, LIZIZ())) {
            String string2 = IOK.LIZLLL().getString("key_cookie_feed", "");
            o.LJIIIIZZ(string2, "keva.getString(KEY_COOKIE_FEED, \"\")");
            return string2;
        }
        return null;
    }

    public static void LIZJ(String uri, String str) {
        o.LJIIIZ(uri, "uri");
        IOK.LIZLLL().storeString("key_cookie_feed_url", uri);
        IOK.LIZLLL().storeString("key_cookie_feed", str);
    }
}
