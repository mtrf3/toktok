package X;

/* loaded from: classes12.dex */
public class QO0 implements O5W {
    public final /* synthetic */ DialogC66909QNt LIZ;

    @Override // X.O5W
    public final void LIZIZ() {
        this.LIZ.LJLJLLL = true;
        QN2.LIZLLL(0, "success");
    }

    public QO0(DialogC66909QNt dialogC66909QNt) {
        this.LIZ = dialogC66909QNt;
    }

    @Override // X.O5W
    public final void LIZ(int i, String str) {
        DialogC66909QNt dialogC66909QNt = this.LIZ;
        dialogC66909QNt.LJLJLLL = false;
        if (!dialogC66909QNt.LJLLI) {
            C79062V1e.LJI("Service error", i, ", Please feed back to us");
        }
        QN2.LIZLLL(i, str);
    }
}
