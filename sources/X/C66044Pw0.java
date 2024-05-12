package X;

/* renamed from: X.Pw0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66044Pw0 implements InterfaceC66069PwP {
    public final /* synthetic */ RunnableC66042Pvy LIZ;

    public C66044Pw0(RunnableC66042Pvy runnableC66042Pvy) {
        this.LIZ = runnableC66042Pvy;
    }

    @Override // X.InterfaceC66069PwP
    public final void LIZ(String str, String str2, boolean z) {
        if (z) {
            C66043Pvz.LIZIZ = this.LIZ.LJLJI;
            InterfaceC66048Pw4 LIZJ = C66043Pvz.LIZJ();
            if (LIZJ != null) {
                LIZJ.putLong("alog_last_upload_time", C66043Pvz.LIZIZ);
            }
            InterfaceC66048Pw4 LIZJ2 = C66043Pvz.LIZJ();
            if (LIZJ2 != null) {
                LIZJ2.remove("alog_last_request_start_time");
            }
            InterfaceC66048Pw4 LIZJ3 = C66043Pvz.LIZJ();
            if (LIZJ3 != null) {
                LIZJ3.remove("alog_last_request_end_time");
            }
        }
        C66059PwF.LIZIZ(C66043Pvz.LIZIZ(str, str2));
    }
}
