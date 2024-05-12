package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.JyB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50891JyB {
    public static boolean LIZ(Boolean bool, String str) {
        boolean z = false;
        Keva repoFromSp = KevaImpl.getRepoFromSp(EF7.LIZIZ(), "music_sp", 0);
        if (bool != null) {
            z = bool.booleanValue();
        }
        return repoFromSp.getBoolean(str, z);
    }

    public static String LIZIZ(String str, String str2) {
        Keva repoFromSp = KevaImpl.getRepoFromSp(EF7.LIZIZ(), "music_sp", 0);
        if (str2 == null) {
            str2 = "";
        }
        String string = repoFromSp.getString(str, str2);
        o.LJIIIIZZ(string, "keva.getString(key, default ?: \"\")");
        return string;
    }

    public static void LIZJ(String str, Object obj) {
        Keva repoFromSp = KevaImpl.getRepoFromSp(EF7.LIZIZ(), "music_sp", 0);
        if (obj instanceof String) {
            repoFromSp.storeString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            repoFromSp.storeBoolean(str, ((Boolean) obj).booleanValue());
        } else {
            repoFromSp.storeString(str, JsonParseUtils.LIZLLL(obj));
        }
    }
}
