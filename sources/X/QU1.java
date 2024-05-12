package X;

/* loaded from: classes12.dex */
public final class QU1 implements QTC<Void> {
    public final /* synthetic */ QU0 LIZ;

    public QU1(QU0 qu0) {
        this.LIZ = qu0;
    }

    @Override // X.QTC
    public final void LIZ(Void r5) {
        long j = QUW.LIZJ(this.LIZ.LJLIL).LIZIZ().eventSendDelay * 1000;
        this.LIZ.LJLILLLLZI.sendMessageDelayed(this.LIZ.LJLILLLLZI.obtainMessage(102), j);
    }
}
