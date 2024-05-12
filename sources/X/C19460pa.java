package X;

import com.bytedance.ies.ugc.ttkvstorageapi.IUserAccount;
import com.bytedance.ies.ugc.ttkvstorageimpl.settings.TTKVStorageSettings;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.0pa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19460pa {
    public static IUserAccount LIZ;
    public static C52962KqU LIZIZ;

    public static final boolean LIZLLL() {
        if (LIZIZ == null) {
            LIZIZ = TTKVStorageSettings.LIZ().getSettings();
        }
        C52962KqU c52962KqU = LIZIZ;
        if (c52962KqU != null) {
            return c52962KqU.LJLIL;
        }
        return false;
    }

    public static final boolean LJ() {
        if (LIZIZ == null) {
            LIZIZ = TTKVStorageSettings.LIZ().getSettings();
        }
        C52962KqU c52962KqU = LIZIZ;
        if (c52962KqU != null) {
            return c52962KqU.LJLJI;
        }
        return true;
    }

    public static final int LIZJ(C09560Zc kvRepoConfig) {
        o.LJIIIZ(kvRepoConfig, "kvRepoConfig");
        if ((kvRepoConfig.LIZ.getValue() & EnumC09550Zb.SINGLE_PROCESS.getValue()) == 1) {
            return 0;
        }
        if ((kvRepoConfig.LJ instanceof C32661Py) && (kvRepoConfig.LIZ.getValue() & EnumC09550Zb.MULTI_PROCESS.getValue()) == 2) {
            return 1;
        }
        if (!(kvRepoConfig.LJ instanceof C1Q0) || (kvRepoConfig.LIZ.getValue() & EnumC09550Zb.MULTI_PROCESS.getValue()) != 2) {
            return 0;
        }
        return 4;
    }

    public static final C17920n6 LIZ(String str, C09170Xp c09170Xp, String repoName) {
        o.LJIIIZ(repoName, "repoName");
        C17940n8 c17940n8 = new C17940n8();
        c17940n8.LIZ = EnumC17880n2.KV;
        if (str == null) {
            str = "global";
        }
        c17940n8.LIZIZ = new C17900n4(str, C17960nA.LIZJ);
        if (c09170Xp != null) {
            c17940n8.LIZ(c09170Xp.LIZ("/"));
        }
        c17940n8.LIZ("kv");
        c17940n8.LIZLLL = repoName;
        return new C17920n6(c17940n8);
    }

    public static final String LIZIZ(String str, C09170Xp c09170Xp, EnumC10900bm repoType, String repoName) {
        String LIZIZ2;
        String str2;
        o.LJIIIZ(repoType, "repoType");
        o.LJIIIZ(repoName, "repoName");
        if (str == null && c09170Xp == null) {
            return null;
        }
        int i = C19450pZ.LIZ[repoType.ordinal()];
        String str3 = "";
        if (i != 1) {
            if (i == 2) {
                StringBuilder sb = new StringBuilder();
                if (str == null || (str2 = C42398GkU.LIZIZ(str, '.')) == null) {
                    str2 = "";
                }
                sb.append(str2);
                if (c09170Xp != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(c09170Xp.LIZ("."));
                    LIZ2.append('.');
                    String LIZIZ3 = X1D.LIZIZ(LIZ2);
                    if (LIZIZ3 != null) {
                        str3 = LIZIZ3;
                    }
                }
                String lowerCase = str3.toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                sb.append(lowerCase);
                sb.append(repoName);
                return sb.toString();
            }
            throw new C162476Zf();
        }
        if (str != null && (LIZIZ2 = C42398GkU.LIZIZ(str, '/')) != null) {
            str3 = LIZIZ2;
        }
        String str4 = "/";
        if (c09170Xp != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(c09170Xp.LIZ("/"));
            LIZ3.append('/');
            String LIZIZ4 = X1D.LIZIZ(LIZ3);
            if (LIZIZ4 != null) {
                str4 = LIZIZ4;
            }
        }
        String lowerCase2 = str4.concat("kv/keva/").toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return str3.concat(lowerCase2);
    }
}
