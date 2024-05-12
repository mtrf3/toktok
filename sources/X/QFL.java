package X;

import com.ttnet.org.chromium.net.impl.CronetWebsocketConnection;

/* loaded from: classes12.dex */
public final class QFL implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ CronetWebsocketConnection LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                this.LJLJJL.LIZIZ.LJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
            } catch (Exception e) {
                C78939UyV.LJII("Exception in callback: ", e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public QFL(CronetWebsocketConnection cronetWebsocketConnection, String str, long j, long j2, boolean z) {
        this.LJLJJL = cronetWebsocketConnection;
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = z;
    }
}
