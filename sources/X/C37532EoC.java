package X;

/* renamed from: X.EoC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37532EoC implements InterfaceC37524Eo4 {
    public final /* synthetic */ C37531EoB LIZIZ;

    public C37532EoC(C37531EoB c37531EoB) {
        this.LIZIZ = c37531EoB;
    }

    @Override // X.InterfaceC37524Eo4
    public final void LIZ(long j, String str) {
        String str2;
        C60737Nsb c60737Nsb = this.LIZIZ.LIZ;
        if (c60737Nsb != null) {
            str2 = c60737Nsb.containerId;
        } else {
            str2 = null;
        }
        FD5.LJIIJ(str2, Long.valueOf(j), str);
    }
}
