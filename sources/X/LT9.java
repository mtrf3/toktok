package X;

import android.os.Message;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class LT9<V> implements Callable {
    public static final LT9<V> LJLIL = new LT9<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Message obtain = Message.obtain();
        obtain.obj = LT7.LIZLLL;
        obtain.what = 0;
        if (!ENR.LIZ()) {
            LVM LJIJ = LVM.LJIJ();
            if (LJIJ.LJLILLLLZI) {
                LJIJ.LJLJLLL.sendMessage(obtain);
            } else {
                LJIJ.handleMsg(obtain);
            }
        }
        return C76800UCe.LIZ;
    }
}
