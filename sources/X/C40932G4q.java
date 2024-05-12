package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* renamed from: X.G4q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40932G4q {
    public static final C40932G4q LIZ = new C40932G4q();
    public static final ReentrantLock LIZIZ = new ReentrantLock();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C40933G4r.LJLIL);

    public static C40939G4x LIZ(InterfaceC12390eB interfaceC12390eB) {
        o.LJIIIZ(interfaceC12390eB, "<this>");
        ReentrantLock reentrantLock = LIZIZ;
        reentrantLock.lock();
        try {
            LIZ.getClass();
            return (C40939G4x) ((java.util.Map) LIZJ.getValue()).get(LIZIZ(interfaceC12390eB));
        } finally {
            reentrantLock.unlock();
        }
    }

    public static String LIZIZ(InterfaceC12390eB interfaceC12390eB) {
        Object obj;
        Object obj2;
        WeakReference<?> host = interfaceC12390eB.getHost();
        if (host != null && (obj2 = host.get()) != null) {
            obj = Integer.valueOf(obj2.hashCode());
        } else {
            obj = "null";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(obj);
        LIZ2.append('_');
        LIZ2.append(interfaceC12390eB.LIZIZ().LIZIZ);
        return X1D.LIZIZ(LIZ2);
    }
}
