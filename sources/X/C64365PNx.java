package X;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: X.PNx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64365PNx {
    public static final C64366PNy LIZ;
    public static final C64366PNy LIZIZ;
    public static final C64366PNy LIZJ;

    static {
        new C64366PNy("-_.*", true);
        LIZ = new C64366PNy("-_.!~*'()@:$&,;=", false);
        new C64366PNy("-_.!~*'()@:$&,;=+/?", false);
        LIZIZ = new C64366PNy("-_.!~*'():$&,;=", false);
        LIZJ = new C64366PNy("-_.!~*'()@:$,;/?:", false);
    }

    public static String LIZ(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
