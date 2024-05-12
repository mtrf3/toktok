package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9U4, reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class C9U4 {
    public final java.util.Map<String, String> LIZ = new LinkedHashMap();
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C2V8.LJLIL);

    public abstract Object LIZLLL(String str);

    public final java.util.Map<Class<? extends Object>, Object> LJ() {
        return (java.util.Map) this.LIZIZ.getValue();
    }

    public C9U4(int i) {
    }

    public final java.util.Map<String, String> LJFF(String... keys) {
        o.LJIIIZ(keys, "keys");
        for (String str : keys) {
            LIZ(LIZLLL(str), str);
        }
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIIZZ(Object context) {
        o.LJIIIZ(context, "context");
        if ((context instanceof Byte) || (context instanceof Short) || (context instanceof Integer) || (context instanceof Long) || (context instanceof Float) || (context instanceof Double) || (context instanceof String)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("withContext() does not support providing a primitive context ");
            LIZ.append(context.getClass());
            LIZ.append(", since getContext() relies on provided values' Class.");
            throw new UnsupportedOperationException(X1D.LIZIZ(LIZ));
        }
        if ((context instanceof List) || (context instanceof java.util.Map)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("withContext() does not support generic class type ");
            LIZ2.append(context.getClass());
            LIZ2.append(" due to type erasure. It could potentially cause problem if you provide multiple of them.");
            throw new UnsupportedOperationException(X1D.LIZIZ(LIZ2));
        }
        LJ().put(context.getClass(), context);
    }

    public final void LJIIIZ(Object... objArr) {
        Iterator it = ((ArrayList) ORY.LJJIJLIJ(objArr)).iterator();
        while (it.hasNext()) {
            LJIIIIZZ(it.next());
        }
    }

    public final void LIZ(Object obj, String key) {
        o.LJIIIZ(key, "key");
        if (obj == null) {
            return;
        }
        this.LIZ.put(key, obj.toString());
    }

    public final void LIZIZ(String str, Number value) {
        o.LJIIIZ(value, "value");
        this.LIZ.put(str, value.toString());
    }

    public final void LIZJ(String str, String value) {
        o.LJIIIZ(value, "value");
        this.LIZ.put(str, value);
    }

    public final void LJI(String str, OSZ<String, ? extends Object>... oszArr) {
        Object second;
        for (OSZ<String, ? extends Object> osz : oszArr) {
            if (osz.getSecond() instanceof H9A) {
                second = LIZLLL(osz.getFirst());
            } else {
                second = osz.getSecond();
            }
            LIZ(second, osz.getFirst());
        }
        FMX.LJIIL(str, this.LIZ);
    }

    public final void LJII(String str, String... key) {
        o.LJIIIZ(key, "key");
        for (String str2 : key) {
            LIZ(LIZLLL(str2), str2);
        }
        FMX.LJIIL(str, this.LIZ);
    }
}
