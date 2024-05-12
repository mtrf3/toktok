package X;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes16.dex */
public class XFO implements InterfaceC47978IsI {
    public volatile C9B5 LIZ;
    public final /* synthetic */ XFL LIZIZ;

    @Override // X.InterfaceC47978IsI
    public final void execute() {
        if (this.LIZIZ.LJI > 0) {
            ((ReentrantLock) this.LIZIZ.LIZJ).lock();
            this.LIZ = C9B5.GET_HEADER_SIZE_DONE;
            this.LIZIZ.LIZLLL.signalAll();
            ((ReentrantLock) this.LIZIZ.LIZJ).unlock();
            return;
        }
        this.LIZ = C9B5.GET_HEADER_SIZE_WAIT;
    }

    public XFO(XFL xfl) {
        this.LIZIZ = xfl;
    }
}
