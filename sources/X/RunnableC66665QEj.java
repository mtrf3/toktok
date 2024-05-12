package X;

import com.ttnet.org.chromium.net.impl.CronetUploadDataStream;

/* renamed from: X.QEj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class RunnableC66665QEj implements Runnable {
    public final /* synthetic */ CronetUploadDataStream LJLIL;

    public final void LIZ() {
        synchronized (this.LJLIL.LJLL) {
            CronetUploadDataStream cronetUploadDataStream = this.LJLIL;
            if (cronetUploadDataStream.LJLLI == 0) {
                return;
            }
            cronetUploadDataStream.LLLLZIL(3);
            CronetUploadDataStream cronetUploadDataStream2 = this.LJLIL;
            if (cronetUploadDataStream2.LJLJLLL != null) {
                cronetUploadDataStream2.LJLLILLLL = 0;
                try {
                    cronetUploadDataStream2.LJLJI.LJIJJ();
                    CronetUploadDataStream cronetUploadDataStream3 = this.LJLIL;
                    cronetUploadDataStream3.LJLILLLLZI.LIZIZ(cronetUploadDataStream3, cronetUploadDataStream3.LJLJLLL);
                    return;
                } catch (Exception e) {
                    this.LJLIL.LLLZI(e);
                    return;
                }
            }
            throw new IllegalStateException("Unexpected readData call. Buffer is null");
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC66665QEj(CronetUploadDataStream cronetUploadDataStream) {
        this.LJLIL = cronetUploadDataStream;
    }
}
