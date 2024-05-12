package X;

import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.RyK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71284RyK {
    public static final ConcurrentHashMap<String, C71285RyL> LIZ = new ConcurrentHashMap<>();
    public static final CopyOnWriteArrayList<InterfaceC71288RyO> LIZIZ = new CopyOnWriteArrayList<>();
    public static final String LIZJ = String.valueOf(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());

    public static String LIZ(String str, String key) {
        C71285RyL c71285RyL;
        boolean z;
        String str2 = null;
        if (str == null || (c71285RyL = LIZ.get(str)) == null) {
            return null;
        }
        if (key == null) {
            key = LIZJ;
        }
        o.LJIIIZ(key, "key");
        C71287RyN c71287RyN = c71285RyL.LIZ().get(key);
        if (c71287RyN == null) {
            if (!c71285RyL.LIZJ) {
                return null;
            }
            String string = C66822jm.LIZ.getString(c71285RyL.LIZIZ(key), "");
            o.LJIIIIZZ(string, "ECKV.getString(persistentKey(key), \"\")");
            c71287RyN = new C71287RyN(string, System.currentTimeMillis());
            c71285RyL.LIZ().put(key, c71287RyN);
        }
        if (c71287RyN.LIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            if (c71285RyL.LIZLLL > 0 && System.currentTimeMillis() - c71287RyN.LIZIZ > c71285RyL.LIZLLL) {
                try {
                    c71285RyL.LIZ().remove(key);
                } catch (CancellationException e) {
                    throw e;
                }
            } else if (c71285RyL.LJ) {
                try {
                    str2 = c71285RyL.LIZ().remove(key).LIZ;
                } catch (CancellationException e2) {
                    throw e2;
                }
            } else {
                return c71287RyN.LIZ;
            }
            return str2;
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static void LIZIZ(String str, String key, String str2) {
        if (!C78685UuP.LJJJZ(key)) {
            key = LIZJ;
        }
        Iterator<InterfaceC71288RyO> it = LIZIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().LIZ();
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        if (str == null) {
            return;
        }
        C71285RyL c71285RyL = LIZ.get(str);
        if (str2 == null) {
            if (c71285RyL != null) {
                o.LJIIIZ(key, "key");
                c71285RyL.LIZ().remove(key);
                if (c71285RyL.LIZJ) {
                    C79057V0z.LJJIJIIJIL(C66822jm.LIZ, c71285RyL.LIZIZ(key));
                    return;
                }
                return;
            }
            return;
        }
        if (c71285RyL != null) {
            o.LJIIIZ(key, "key");
            c71285RyL.LIZ().put(key, new C71287RyN(str2, System.currentTimeMillis()));
            if (c71285RyL.LIZJ) {
                C79057V0z.LJJJJJ(C66822jm.LIZ, c71285RyL.LIZIZ(key), str2);
            }
        }
    }
}
