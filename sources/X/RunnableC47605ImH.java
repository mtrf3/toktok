package X;

import com.bytedance.vcloud.abrmodule.IABRModule;

/* renamed from: X.ImH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47605ImH implements Runnable {
    public InterfaceC47775Ip1 LJLIL;
    public IABRModule LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLIL != null) {
                try {
                    C78253UnR.LJI("TTVideoEngine", "MyReleaseRunnable release");
                    this.LJLIL.release();
                    this.LJLIL = null;
                    IABRModule iABRModule = this.LJLILLLLZI;
                    if (iABRModule != null) {
                        iABRModule.release();
                        this.LJLILLLLZI = null;
                    }
                } catch (Exception e) {
                    C78253UnR.LIZLLL("TTVideoEngine", e.toString());
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47605ImH(InterfaceC47775Ip1 interfaceC47775Ip1, IABRModule iABRModule) {
        this.LJLIL = interfaceC47775Ip1;
        this.LJLILLLLZI = iABRModule;
    }
}
