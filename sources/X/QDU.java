package X;

/* loaded from: classes12.dex */
public final class QDU implements InterfaceC66631QDb<byte[]> {
    public final /* synthetic */ C49932Jii LIZ;
    public final /* synthetic */ QDT LIZIZ;

    @Override // X.InterfaceC66631QDb
    public final void LIZ(InterfaceC66632QDc<byte[]> interfaceC66632QDc) {
        this.LIZIZ.LIZ();
        QDT qdt = this.LIZIZ;
        if (qdt.LJLLILLLL != 0) {
            interfaceC66632QDc.onComplete();
            return;
        }
        qdt.LJLLILLLL = 1;
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (true) {
            try {
                int LJ = this.LIZIZ.LJ();
                if (LJ < 0) {
                    interfaceC66632QDc.onComplete();
                    try {
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                byte[] bArr = new byte[LJ];
                QDT qdt2 = this.LIZIZ;
                System.arraycopy(qdt2.LJLJJI, qdt2.LJLJJL, bArr, 0, LJ);
                long currentTimeMillis2 = System.currentTimeMillis();
                interfaceC66632QDc.onNext(bArr);
                i = (int) ((System.currentTimeMillis() - currentTimeMillis2) + i);
                QDT qdt3 = this.LIZIZ;
                qdt3.LJLJJL += LJ;
                C49932Jii c49932Jii = this.LIZ;
                C49935Jil c49935Jil = new C49935Jil(currentTimeMillis, qdt3.LJLLL, qdt3.LJLLJ, i);
                synchronized (c49932Jii) {
                    c49932Jii.LIZ.add(c49935Jil);
                }
            } catch (Throwable th) {
                try {
                    interfaceC66632QDc.onFailed(th);
                    try {
                        C64718Pac.LJ(this.LIZIZ.LJLIL);
                        return;
                    } catch (Throwable unused2) {
                        return;
                    }
                } finally {
                    try {
                        C64718Pac.LJ(this.LIZIZ.LJLIL);
                    } catch (Throwable unused3) {
                    }
                }
            }
        }
    }

    public QDU(QDT qdt, C49932Jii c49932Jii) {
        this.LIZIZ = qdt;
        this.LIZ = c49932Jii;
    }
}
