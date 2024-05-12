package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.EIf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36189EIf {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C36190EIg.LJLIL);

    public static Keva LIZJ() {
        return (Keva) LIZ.getValue();
    }

    public static String LIZ() {
        String string = LIZJ().getString("client_hash_value", "");
        o.LJIIIIZZ(string, "KEVA.getString(CLIENT_HASH_VALUE_KEY, \"\")");
        return string;
    }

    public static String LIZIZ() {
        String string = LIZJ().getString("feature_update_version", "");
        o.LJIIIIZZ(string, "KEVA.getString(FEATURE_UPDATE_VERSION_KEY, \"\")");
        return string;
    }
}
