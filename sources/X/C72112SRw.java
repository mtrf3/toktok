package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.SRw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72112SRw implements Serializable {
    public static final C72113SRx Companion = new C72113SRx();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C72111SRv.LJLIL);

    public final <T> T get(Class<T> key) {
        o.LJIIIZ(key, "key");
        String LJLLILLLL = C16880lQ.LJLLILLLL(key);
        if (LJLLILLLL == null) {
            return null;
        }
        java.util.Map map = (java.util.Map) this.LJLIL.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("com.ss.android.ugc.aweme.utils.ParamsBundle:");
        LIZ.append(LJLLILLLL);
        T t = (T) map.get(X1D.LIZIZ(LIZ));
        if (t == null) {
            return null;
        }
        return t;
    }

    public final <T> T get(String key) {
        o.LJIIIZ(key, "key");
        T t = (T) ((java.util.Map) this.LJLIL.getValue()).get(key);
        if (t == null) {
            return null;
        }
        return t;
    }

    public final <T> T get(Class<T> key, T t) {
        o.LJIIIZ(key, "key");
        T t2 = (T) get(key);
        if (t2 == null) {
            return t;
        }
        return t2;
    }

    public final <T> void put(Class<T> key, T t) {
        o.LJIIIZ(key, "key");
        String LJLLILLLL = C16880lQ.LJLLILLLL(key);
        if (LJLLILLLL != null) {
            java.util.Map map = (java.util.Map) this.LJLIL.getValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("com.ss.android.ugc.aweme.utils.ParamsBundle:");
            LIZ.append(LJLLILLLL);
            map.put(X1D.LIZIZ(LIZ), t);
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can't be the key of ParamBundle");
    }

    public final <T> T get(String key, T t) {
        o.LJIIIZ(key, "key");
        T t2 = (T) get(key);
        if (t2 == null) {
            return t;
        }
        return t2;
    }

    public final <T> void put(String key, T t) {
        o.LJIIIZ(key, "key");
        ((java.util.Map) this.LJLIL.getValue()).put(key, t);
    }
}
