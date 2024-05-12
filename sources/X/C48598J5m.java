package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.J5m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48598J5m {
    public static final /* synthetic */ int LIZLLL = 0;
    public final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C48604J5s> LIZIZ = new ConcurrentHashMap<>();
    public boolean LIZJ;

    public final void LIZ() {
        Iterator<Map.Entry<String, C48604J5s>> it = this.LIZIZ.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().getValue().LIZ()) {
                z = true;
            }
        }
        this.LIZJ = z;
    }

    public final ConcurrentHashMap<String, String> LIZLLL() {
        if (this.LIZJ) {
            if (C48602J5q.LIZ) {
                System.currentTimeMillis();
            }
            for (Map.Entry<String, C48604J5s> entry : this.LIZIZ.entrySet()) {
                if (entry.getValue().LIZ()) {
                    String key = entry.getKey();
                    C48604J5s value = entry.getValue();
                    J63 j63 = J64.LIZ;
                    if (j63 == null) {
                        j63 = C48608J5w.LIZ;
                    }
                    String LIZ = j63.LIZ(key);
                    if (LIZ != null && !value.LIZ) {
                        this.LIZ.put(key, LIZ);
                    }
                    value.LIZ = true;
                }
            }
            LIZ();
            if (C48602J5q.LIZ) {
                System.currentTimeMillis();
            }
        }
        return this.LIZ;
    }

    public final String LIZJ(String str) {
        C48604J5s c48604J5s;
        if (str == null) {
            return null;
        }
        String str2 = this.LIZ.get(str);
        if (str2 == null && this.LIZJ && (c48604J5s = this.LIZIZ.get(str)) != null && c48604J5s.LIZ()) {
            J63 j63 = J64.LIZ;
            if (j63 == null) {
                j63 = C48608J5w.LIZ;
            }
            str2 = j63.LIZ(str);
            if (str2 != null && !c48604J5s.LIZ) {
                this.LIZ.put(str, str2);
            }
            c48604J5s.LIZ = true;
            LIZ();
        }
        return str2;
    }

    public final void LIZIZ(String str, C48594J5i c48594J5i) {
        C48604J5s c48604J5s = this.LIZIZ.get(str);
        if (c48604J5s == null) {
            c48604J5s = new C48604J5s();
            this.LIZIZ.put(str, c48604J5s);
        }
        c48604J5s.LIZIZ = c48594J5i;
        if (c48604J5s.LIZ()) {
            this.LIZJ = true;
        }
    }

    public final boolean LJ(String str, String str2) {
        if (str == null || !(!o.LJ(this.LIZ.get(str), str2))) {
            return false;
        }
        this.LIZ.put(str, str2);
        C48604J5s c48604J5s = this.LIZIZ.get(str);
        if (c48604J5s == null) {
            C48604J5s c48604J5s2 = new C48604J5s();
            c48604J5s2.LIZ = true;
            this.LIZIZ.put(str, c48604J5s2);
        } else {
            if (!c48604J5s.LIZ) {
                c48604J5s.LIZ = true;
                LIZ();
            }
            C48594J5i c48594J5i = c48604J5s.LIZIZ;
            if (c48594J5i != null && c48594J5i.LIZ && (c48594J5i.LIZIZ <= 0 || c48604J5s.LIZJ <= 0 || System.currentTimeMillis() - c48604J5s.LIZJ >= c48594J5i.LIZIZ)) {
                c48604J5s.LIZJ = System.currentTimeMillis();
                J63 j63 = J64.LIZ;
                if (j63 == null) {
                    j63 = C48608J5w.LIZ;
                }
                j63.save(str, str2);
            }
        }
        return true;
    }

    public final void LJFF(Object obj, String str) {
        String str2;
        if (obj != null) {
            str2 = obj.toString();
        } else {
            str2 = null;
        }
        LJ(str, str2);
    }
}
