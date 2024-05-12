package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.0QZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0QZ {
    public static final <T> T LIZ(C1JY c1jy, C07270Qh<T> key) {
        o.LJIIIZ(c1jy, "<this>");
        o.LJIIIZ(key, "key");
        C48611vV defaultValue = C48611vV.LJLIL;
        o.LJIIIZ(defaultValue, "defaultValue");
        T t = (T) ((LinkedHashMap) c1jy.LJLIL).get(key);
        if (t == null) {
            return (T) defaultValue.invoke();
        }
        return t;
    }
}
