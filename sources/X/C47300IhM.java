package X;

import Y.ACallableS109S0100000_6;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.j;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS3S1010000_8;
import kotlin.jvm.internal.AqS46S1000000_8;
import kotlin.jvm.internal.AqS75S1100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.IhM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47300IhM {
    public static final C47300IhM LIZ = new C47300IhM();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C47299IhL.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C47298IhK.LJLIL);
    public static final ConcurrentHashMap<String, Object> LIZLLL = new ConcurrentHashMap<>();
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C47301IhN.LJLIL);
    public static final ConcurrentHashMap<String, Boolean> LJFF = new ConcurrentHashMap<>();
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C47297IhJ.LJLIL);
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C47284Ih6.LJLIL);

    public static List LIZ() {
        return (List) LJII.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object LIZIZ(String str, boolean z) {
        boolean z2;
        Object obj;
        T t;
        T t2;
        boolean z3 = false;
        if (str == null || str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return null;
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZLLL;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 == null) {
            int LIZ2 = C47303IhP.LIZ();
            if (LIZ2 == 1) {
                if (str == null || str.length() == 0) {
                    z3 = true;
                }
                if (z3) {
                    obj2 = null;
                } else {
                    try {
                        obj2 = new AqS46S1000000_8(str, 0).invoke();
                    } catch (Throwable unused) {
                        obj2 = null;
                    }
                }
                if (!LJFF.contains(str)) {
                    C10K.LIZJ(new ACallableS109S0100000_6(new AqS3S1010000_8(str, z, 0), 22));
                }
            } else if (LIZ2 == 2) {
                C68322mC c68322mC = new C68322mC();
                if (str == null || str.length() == 0) {
                    z3 = true;
                }
                if (z3) {
                    t = 0;
                } else {
                    try {
                        t = new AqS46S1000000_8(str, 0).invoke();
                    } catch (Throwable unused2) {
                        t = 0;
                    }
                }
                c68322mC.element = t;
                if (t == 0) {
                    Object LIZJ2 = LIZJ(str, z);
                    if (LIZJ2 != null) {
                        t2 = LIZJ2.toString();
                    } else {
                        t2 = 0;
                    }
                    c68322mC.element = t2;
                    C10K.LIZJ(new ACallableS109S0100000_6(new AqS75S1100000_8(str, (String) c68322mC, (C68322mC<String>) 13), 22));
                } else if (!LJFF.contains(str)) {
                    C10K.LIZJ(new ACallableS109S0100000_6(new AqS3S1010000_8(str, z, 1), 22));
                }
                obj2 = c68322mC.element;
            } else if (LIZ2 == 3) {
                obj2 = LIZJ(str, z);
                if (!LJFF.contains(str)) {
                    C10K.LIZJ(new ACallableS109S0100000_6(new AqS75S1100000_8(str, obj2, 14), 22));
                }
            } else {
                obj2 = LIZJ(str, z);
            }
        }
        if (!concurrentHashMap.containsKey(str)) {
            if (obj2 == null) {
                obj = "--KEVA_EMPTY_OBJECT--";
            } else {
                obj = obj2;
            }
            concurrentHashMap.put(str, obj);
        }
        if (o.LJ(obj2, "--KEVA_EMPTY_OBJECT--")) {
            return null;
        }
        return obj2;
    }

    public static Object LIZJ(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        j LIZIZ2 = FH3.LIZLLL.LIZIZ(str);
        if (z && LIZIZ2 != null) {
            return GsonProtectorUtils.toJson(C78983UzD.LJJL(), (Object) LIZIZ2);
        }
        return LIZIZ2;
    }

    public static void LIZLLL(String str, String str2) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LJFF;
        if (concurrentHashMap.contains(str)) {
            return;
        }
        if (str2 == null) {
            Object value = LJ.getValue();
            o.LJIIIIZZ(value, "<get-keva>(...)");
            ((Keva) value).storeString(str, "--KEVA_EMPTY_OBJECT--");
        } else {
            Object value2 = LJ.getValue();
            o.LJIIIIZZ(value2, "<get-keva>(...)");
            ((Keva) value2).storeString(str, str2);
        }
        concurrentHashMap.put(str, Boolean.TRUE);
    }
}
