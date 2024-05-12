package X;

import com.ttnet.org.chromium.net.NetworkChangeNotifier;

/* renamed from: X.YiZ, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class RunnableC88143YiZ implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C88145Yib LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            InterfaceC88142YiY interfaceC88142YiY = this.LJLILLLLZI.LIZIZ.LIZLLL;
            int i = this.LJLIL;
            NetworkChangeNotifier networkChangeNotifier = ((C88141YiX) interfaceC88142YiY).LIZ;
            networkChangeNotifier.LIZLLL = i;
            networkChangeNotifier.LIZJ(i, networkChangeNotifier.getCurrentDefaultNetId());
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC88143YiZ(C88145Yib c88145Yib, int i) {
        this.LJLILLLLZI = c88145Yib;
        this.LJLIL = i;
    }
}
