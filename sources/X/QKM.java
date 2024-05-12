package X;

/* loaded from: classes12.dex */
public final class QKM implements QJU {
    public final /* synthetic */ C66800QJo LIZ;

    public QKM(C66800QJo c66800QJo) {
        this.LIZ = c66800QJo;
    }

    @Override // X.QJU
    public final void LIZIZ(C66799QJn c66799QJn) {
        C66800QJo c66800QJo = this.LIZ;
        synchronized (c66800QJo.LIZ) {
            c66800QJo.LIZIZ = true;
            c66800QJo.LIZ.notifyAll();
        }
    }
}
