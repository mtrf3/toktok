package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.DuN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35367DuN {
    public static final Keva LIZ;

    static {
        Keva repo = Keva.getRepo("smart_check_roma");
        o.LJIIIIZZ(repo, "getRepo(\"smart_check_roma\")");
        LIZ = repo;
    }

    public static String LIZ(int i) {
        Keva keva = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("roma_rule_");
        LIZ2.append(i);
        String string = keva.getString(X1D.LIZIZ(LIZ2), "");
        o.LJIIIIZZ(string, "romaKV.getString(KEY_ROMA_RULE + \"_\" + source, \"\")");
        return string;
    }
}
