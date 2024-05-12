package X;

import com.google.gson.Gson;
import com.google.gson.g;
import com.google.gson.j;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Dgo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34526Dgo {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C33945DTx.LJLIL);
    public static final long LIZIZ = ((Number) C34525Dgn.LIZ.getValue()).longValue();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C33970DUw.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C33971DUx.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(DX2.LJLIL);

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZ(String url) {
        o.LJIIIZ(url, "url");
        C34527Dgp c34527Dgp = C34527Dgp.LIZ;
        if (!C34527Dgp.LIZLLL) {
            synchronized (c34527Dgp) {
                if (!C34527Dgp.LIZLLL) {
                    g gVar = (g) C34527Dgp.LIZIZ.getValue();
                    if (gVar != null) {
                        Iterator<j> it = gVar.iterator();
                        while (it.hasNext()) {
                            j next = it.next();
                            HashMap<String, Boolean> hashMap = C34527Dgp.LIZJ;
                            Object LIZJ2 = new Gson().LIZJ(next, String.class);
                            o.LJIIIIZZ(LIZJ2, "Gson().fromJson(elem, String::class.java)");
                            hashMap.put(LIZJ2, Boolean.TRUE);
                        }
                    }
                    C34527Dgp.LIZLLL = true;
                }
            }
        }
        if (C34527Dgp.LIZJ.get(url) != null) {
            return true;
        }
        return false;
    }
}
