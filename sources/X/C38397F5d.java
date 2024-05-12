package X;

import java.util.TimerTask;

/* renamed from: X.F5d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38397F5d extends TimerTask {
    public final /* synthetic */ C38399F5f LJLIL;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        InterfaceC38409F5p interfaceC38409F5p;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            C38399F5f c38399F5f = this.LJLIL;
            if (currentTimeMillis - c38399F5f.LIZJ > F5T.LIZJ && (interfaceC38409F5p = c38399F5f.LIZ) != null) {
                interfaceC38409F5p.LIZ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public C38397F5d(C38399F5f c38399F5f) {
        this.LJLIL = c38399F5f;
    }
}
