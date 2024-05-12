package X;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Pwt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66099Pwt implements InterfaceC37636Eps {
    public final C66100Pwu LIZ;
    public final C44378HbK LIZIZ;
    public final C68148Qoq LIZJ;
    public volatile boolean LJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final C66110Px4 LJFF = new C66110Px4(this);
    public final C66111Px5 LJI = new C66111Px5(this);

    public final void LIZIZ() {
        if (this.LIZLLL.getAndSet(false)) {
            ((InterfaceC37628Epk) this.LIZJ.LJLIL).LIZIZ(this);
        }
    }

    public final void LIZ(C66101Pwv c66101Pwv) {
        if (!this.LIZLLL.get()) {
            new IOException("Session is closed");
            ((InterfaceC37628Epk) this.LIZJ.LJLIL).LIZIZ(this);
            return;
        }
        C44378HbK c44378HbK = this.LIZIZ;
        C66111Px5 c66111Px5 = this.LJI;
        synchronized (c44378HbK) {
            try {
                c66101Pwv.LIZIZ((BufferedOutputStream) c44378HbK.LJLIL);
                ((BufferedOutputStream) c44378HbK.LJLIL).flush();
                c66111Px5.getClass();
            } catch (IOException unused) {
                C66099Pwt c66099Pwt = c66111Px5.LIZ;
                ((InterfaceC37628Epk) c66099Pwt.LIZJ.LJLIL).LIZIZ(c66099Pwt);
            }
        }
    }

    public C66099Pwt(C39718FiM c39718FiM, OutputStream outputStream, C68148Qoq c68148Qoq) {
        this.LIZ = new C66100Pwu(c39718FiM);
        this.LIZIZ = new C44378HbK(outputStream);
        this.LIZJ = c68148Qoq;
    }
}
