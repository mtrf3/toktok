package X;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Ph2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65116Ph2 {
    public final ReentrantLock LIZ;
    public final Condition LIZIZ;

    public C65116Ph2() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZ = reentrantLock;
        this.LIZIZ = reentrantLock.newCondition();
    }
}
