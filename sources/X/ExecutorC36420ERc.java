package X;

import Y.ARunnableS42S0100000_6;
import android.os.Handler;
import android.os.Message;
import java.util.LinkedList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AqS156S0100000_6;

/* renamed from: X.ERc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ExecutorC36420ERc implements Executor {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C36422ERe.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C36421ERd.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS156S0100000_6(this, 171));

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.util.LinkedList] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (((Boolean) C53186Ku6.LIZLLL.getValue()).booleanValue()) {
            LinkedList linkedList = (LinkedList) this.LJLILLLLZI.getValue();
            synchronized (linkedList) {
                linkedList.addLast(runnable);
            }
            if (linkedList.size() > 20) {
                Message obtain = Message.obtain();
                C68322mC c68322mC = new C68322mC();
                synchronized (linkedList) {
                    c68322mC.element = new LinkedList(linkedList);
                    linkedList.clear();
                }
                obtain.obj = new ARunnableS42S0100000_6(c68322mC, 169);
                ((Handler) this.LJLJI.getValue()).sendMessage(obtain);
                return;
            }
            return;
        }
        Message obtain2 = Message.obtain();
        obtain2.obj = runnable;
        ((Handler) this.LJLJI.getValue()).sendMessage(obtain2);
    }
}
