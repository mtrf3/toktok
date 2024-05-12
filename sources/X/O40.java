package X;

import com.bytedance.forest.model.Request;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O40 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(O4X.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(O4Y.LJLIL);

    public static O47 LIZJ() {
        return (O47) LIZ.getValue();
    }

    public static String LIZ(Request request) {
        o.LJIIJ(request, "request");
        if (request.getGeckoModel().L()) {
            String url = request.getUrl();
            if (url.length() == 0) {
                return null;
            }
            StringBuilder LJFF = C72972SkS.LJFF(url, '-');
            LJFF.append(request.getOnlyLocal());
            LJFF.append('-');
            LJFF.append(request.getDisableCdn());
            return X1D.LIZIZ(LJFF);
        }
        return request.getGeckoModel().toString();
    }

    public static O4O LIZIZ(C61295O3v response) {
        O4O remove;
        o.LJIIJ(response, "response");
        if (response.LJZI.getEnableRequestReuse()) {
            O47 o47 = (O47) LIZIZ.getValue();
            o47.getClass();
            String LIZ2 = LIZ(response.LJZI);
            if (LIZ2 != null && (remove = o47.LIZ.remove(LIZ2)) != null && remove.LJIILL()) {
                C61325O4z.LJ(new AqS157S0200000_10(response, remove, 37));
                return remove;
            }
        }
        O47 LIZJ = LIZJ();
        LIZJ.getClass();
        String LIZ3 = LIZ(response.LJZI);
        if (LIZ3 == null) {
            return null;
        }
        return LIZJ.LIZ.get(LIZ3);
    }

    public static void LIZLLL(C61295O3v response) {
        o.LJIIJ(response, "response");
        O47 LIZJ = LIZJ();
        LIZJ.getClass();
        String LIZ2 = LIZ(response.LJZI);
        if (LIZ2 != null) {
            LIZJ.LIZ(LIZ2);
        }
    }

    public static void LJFF(C61295O3v response) {
        o.LJIIJ(response, "response");
        O47 LIZJ = LIZJ();
        LIZJ.getClass();
        if (o.LJ(response.LLD, "memory") || o.LJ(response.LLD, "builtin")) {
            return;
        }
        String LIZ2 = LIZ(response.LJZI);
        if (LIZ2 == null || LIZ2.length() == 0) {
            C39930Flm.LIZ("MemoryManager", "updateByteArrayCache: cache key is empty or data is empty");
            return;
        }
        String filePath = response.getFilePath();
        if ((filePath == null || filePath.length() == 0) && (!o.LJ(response.LLD, "cdn"))) {
            C39930Flm.LIZ("MemoryManager", "updateByteArrayCache: filePath is empty");
            return;
        }
        String filePath2 = response.getFilePath();
        if (filePath2 == null || filePath2.length() == 0) {
            LIZJ.LIZ(LIZ2);
            LIZJ.LIZIZ.put(LIZ2, response);
            return;
        }
        try {
            O4G o4g = new O4G(LIZJ, LIZ2, response.getFilePath());
            LIZJ.LIZ(LIZ2);
            LIZJ.LIZIZ.put(LIZ2, response);
            synchronized (LIZJ) {
                LIZJ.LIZJ.put(LIZ2, o4g);
            }
        } catch (Throwable th) {
            C39930Flm.LIZIZ("MemoryManager", "error in MemoryUtils", th);
        }
    }

    public static void LJ(C61295O3v response, O4O o4o) {
        o.LJIIJ(response, "response");
        if (response.LJZI.isPreload()) {
            ((O47) LIZIZ.getValue()).LIZIZ(response, o4o);
        } else {
            LIZJ().LIZIZ(response, o4o);
        }
    }
}
