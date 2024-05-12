package X;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* renamed from: X.G4o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C40930G4o extends TBS implements InterfaceC88472Yns<InterfaceC12390eB, C76800UCe> {
    public C40930G4o(C40932G4q c40932G4q) {
        super(1, c40932G4q, C40932G4q.class, "onDetach", "onDetach(Lcom/bytedance/analytics/IBTMPageNode;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC12390eB interfaceC12390eB) {
        InterfaceC12390eB p0 = interfaceC12390eB;
        o.LJIIIZ(p0, "p0");
        this.receiver.getClass();
        ReentrantLock reentrantLock = C40932G4q.LIZIZ;
        reentrantLock.lock();
        try {
            C40932G4q.LIZ.getClass();
            reentrantLock.unlock();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
