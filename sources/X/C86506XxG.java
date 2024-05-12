package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.XxG, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86506XxG {
    public static final CopyOnWriteArrayList<InterfaceC86533Xxh> LIZ = new CopyOnWriteArrayList<>();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C58303MuR.LJLIL);

    public static ConcurrentHashMap LIZ() {
        return (ConcurrentHashMap) LIZIZ.getValue();
    }

    public static void LIZJ(EnumC86518XxS trigger, boolean z) {
        o.LJIIIZ(trigger, "trigger");
        Iterator<InterfaceC86533Xxh> it = LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIIJ(trigger, z);
        }
    }

    public static void LIZLLL(int i, InnerPushMessage innerPushMessage) {
        List list = (List) LIZ().get(Integer.valueOf(i));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC86533Xxh) it.next()).LIZJ(innerPushMessage);
            }
        }
        Iterator<InterfaceC86533Xxh> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(innerPushMessage);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    public static void LJ(InterfaceC86533Xxh observer, int[] iArr) {
        o.LJIIIZ(observer, "observer");
        boolean z = false;
        if (iArr == null || iArr.length == 0) {
            CopyOnWriteArrayList<InterfaceC86533Xxh> copyOnWriteArrayList = LIZ;
            if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                Iterator<InterfaceC86533Xxh> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (o.LJ(it.next(), observer)) {
                        break;
                    }
                }
            }
            LIZ.add(observer);
        } else {
            for (int i : iArr) {
                ?? r2 = (List) LIZ().get(Integer.valueOf(i));
                if (r2 == 0 || r2.isEmpty()) {
                    r2 = new ArrayList();
                    r2.add(observer);
                } else {
                    if (!(r2 instanceof Collection) || !r2.isEmpty()) {
                        Iterator it2 = r2.iterator();
                        while (it2.hasNext()) {
                            if (o.LJ(it2.next(), observer)) {
                                break;
                            }
                        }
                    }
                    r2.add(observer);
                }
                LIZ().put(Integer.valueOf(i), r2);
            }
        }
        if (C86499Xx9.LIZ != 0) {
            EnumC86518XxS enumC86518XxS = EnumC86518XxS.COLD_START;
            if (C86499Xx9.LIZ == 1) {
                z = true;
            }
            LIZJ(enumC86518XxS, z);
        }
    }

    public static void LIZIZ(int i, InnerPushMessage innerPushMessage, boolean z, String str) {
        List list = (List) LIZ().get(Integer.valueOf(i));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC86533Xxh) it.next()).LJII(innerPushMessage, z, str);
            }
        }
        Iterator<InterfaceC86533Xxh> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJII(innerPushMessage, z, str);
        }
    }
}
