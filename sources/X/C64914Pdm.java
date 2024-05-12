package X;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Pdm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64914Pdm {
    public final ReentrantLock LIZ;
    public final Condition LIZIZ;

    public C64914Pdm() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZ = reentrantLock;
        this.LIZIZ = reentrantLock.newCondition();
    }
}
