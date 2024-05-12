package X;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class AG7 extends AbstractC65781Prl implements InterfaceC65784Pro<ReentrantLock> {
    public static final AG7 LJLIL = new AG7();

    public AG7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ReentrantLock invoke() {
        return new ReentrantLock();
    }
}
