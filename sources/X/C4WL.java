package X;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: X.4WL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WL extends C3MT {
    public static final C4WL LIZIZ = new C4WL();
    public static final java.util.Map<String, Integer> LIZJ = new ConcurrentHashMap();
    public static final C4WK LIZLLL;
    public static final C4WN LJ;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.4WN] */
    static {
        C4WK LIZIZ2 = C4WK.LIZIZ();
        o.LJIIIIZZ(LIZIZ2, "getInstance()");
        LIZLLL = LIZIZ2;
        final C4WK LIZIZ3 = C4WK.LIZIZ();
        o.LJIIIIZZ(LIZIZ3, "getInstance()");
        LJ = new TBR(LIZIZ3) { // from class: X.4WN
            @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
            public final Object get() {
                C4WK c4wk = (C4WK) this.receiver;
                c4wk.getClass();
                return new HashMap(c4wk.LIZ);
            }
        };
    }

    @Override // X.C3MT
    public final int LIZJ() {
        int i = 0;
        for (Map.Entry entry : ((ConcurrentHashMap) LIZLLL.LIZ).entrySet()) {
            if (((Long) entry.getValue()).longValue() > 0) {
                i = (int) (((Long) entry.getValue()).longValue() + i);
            }
        }
        return i;
    }

    @Override // X.C3MT
    public final java.util.Map<String, Long> LIZLLL() {
        return (java.util.Map) LJ.get();
    }

    @Override // X.C3MT
    public final void LIZIZ() {
        C4WK LIZIZ2 = C4WK.LIZIZ();
        ((ConcurrentHashMap) LIZIZ2.LIZ).clear();
        ((ConcurrentHashMap) LIZIZ2.LIZJ).clear();
        ((ConcurrentHashMap) LIZIZ2.LIZIZ).clear();
    }

    @Override // X.C3MT
    public final void LIZ(InterfaceC83073Nv observer) {
        o.LJIIIZ(observer, "observer");
        C4WK LIZIZ2 = C4WK.LIZIZ();
        LIZIZ2.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UnReadCountHelper addUnreadCountObserver:");
        LIZ.append(observer);
        C63322OtC.LIZ(X1D.LIZIZ(LIZ));
        ((CopyOnWriteArraySet) LIZIZ2.LJ).add(observer);
    }

    @Override // X.C3MT
    public final void LJ(InterfaceC83073Nv observer) {
        o.LJIIIZ(observer, "observer");
        C4WK LIZIZ2 = C4WK.LIZIZ();
        LIZIZ2.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UnReadCountHelper removeUnreadCountObserver:");
        LIZ.append(observer);
        C63322OtC.LIZ(X1D.LIZIZ(LIZ));
        ((CopyOnWriteArraySet) LIZIZ2.LJ).remove(observer);
    }

    @Override // X.C3MT
    public final void LJFF(int i, String uid) {
        o.LJIIIZ(uid, "uid");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZJ;
        Integer num = (Integer) concurrentHashMap.get(uid);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unread count was=");
        LIZ.append(num);
        LIZ.append(", new unread=");
        LIZ.append(i);
        C63322OtC.LJI("UnreadCountModelImpl", X1D.LIZIZ(LIZ), null);
        if (num == null || num.intValue() != i) {
            concurrentHashMap.put(uid, Integer.valueOf(i));
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C110704Wc(uid, i, num, null), 3);
        }
    }
}
