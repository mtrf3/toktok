package X;

import android.net.Network;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: X.Yia, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class RunnableC88144Yia implements Runnable {
    public final /* synthetic */ Network LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C88145Yib LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            InterfaceC88142YiY interfaceC88142YiY = this.LJLJI.LIZIZ.LIZLLL;
            ((C88141YiX) interfaceC88142YiY).LIZ.LJ(NetworkChangeNotifierAutoDetect.LJ(this.LJLIL), this.LJLILLLLZI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC88144Yia(C88145Yib c88145Yib, Network network, boolean z) {
        this.LJLJI = c88145Yib;
        this.LJLIL = network;
        this.LJLILLLLZI = z;
    }
}
