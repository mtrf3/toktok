package X;

/* renamed from: X.VAu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79312VAu {
    public final /* synthetic */ C79313VAv LIZ;

    public C79312VAu(C79313VAv c79313VAv) {
        this.LIZ = c79313VAv;
    }

    public final void LIZ(VBD vbd) {
        if (this.LIZ.LIZ == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreconnResultCallBack, host: ");
        LIZ.append(vbd.LIZ);
        LIZ.append("ip: ");
        LIZ.append(vbd.LIZJ);
        LIZ.append(" ret: ");
        UFE.LIZLLL(LIZ, vbd.LIZIZ, LIZ);
        VAD vad = this.LIZ.LIZ;
        vad.p5 = vbd.LIZIZ;
        vad.q5 = vbd.LIZ;
        vad.r5 = vbd.LIZJ;
    }
}
