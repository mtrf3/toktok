package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.4IE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4IE {
    public static boolean LIZIZ;
    public static Boolean LIZJ;
    public static final C4IE LIZ = new C4IE();
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<C4IH>> LIZLLL = new ConcurrentHashMap<>();

    public static void LIZ(String uid, C4IH c4ih) {
        o.LJIIIZ(uid, "uid");
        ConcurrentHashMap<String, CopyOnWriteArrayList<C4IH>> concurrentHashMap = LIZLLL;
        if (concurrentHashMap.get(uid) == null) {
            concurrentHashMap.put(uid, new CopyOnWriteArrayList<>());
        }
        CopyOnWriteArrayList<C4IH> copyOnWriteArrayList = concurrentHashMap.get(uid);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(c4ih);
        }
        if (o.LJ(C80763Ey.LIZ(false), uid) && LIZIZ) {
            c4ih.LIZ();
        }
    }

    public static void LIZIZ(Keva keva, boolean z) {
        boolean z2;
        if (!z) {
            LIZIZ = false;
            z2 = true;
        } else {
            z2 = keva.getBoolean("is_chat_function_off", false);
        }
        LIZJ = Boolean.valueOf(z2);
        StringBuilder LJI = JBR.LJI("disable chat config updated isLogin = ", z, " isChatOff = ");
        LJI.append(LIZJ);
        C34B.LJI("ImUnder16Manger", X1D.LIZIZ(LJI));
    }
}
