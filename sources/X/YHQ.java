package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YHQ implements YHM {
    public final /* synthetic */ YHZ LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ YHK LIZJ;
    public final /* synthetic */ InterfaceC87131YHn LIZLLL;

    @Override // X.YHM
    public final void LIZIZ(InterfaceC87130YHm result) {
        o.LJIIIZ(result, "result");
        this.LIZ.LJLJI.remove(result.getToken());
        try {
            this.LIZLLL.LIZ(new C87125YHh(result.LIZ().LJI, result.LIZ().LJIIIIZZ));
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            InterfaceC87131YHn interfaceC87131YHn = this.LIZLLL;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            interfaceC87131YHn.onFailed(message);
        }
    }

    @Override // X.YHM
    public final void LIZ(int i, String errorMsg, InterfaceC87130YHm chain) {
        o.LJIIIZ(errorMsg, "errorMsg");
        o.LJIIIZ(chain, "chain");
        this.LIZ.LJLJI.remove(chain.getToken());
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("status", "request_failed");
        c188727au.LIZLLL(i, "err_code");
        c188727au.LJIIIZ("err_msg", errorMsg);
        c188727au.LJ(System.currentTimeMillis() - this.LIZIZ, "duration");
        YHS yhs = YHS.LIZ;
        YHK yhk = this.LIZJ;
        yhs.getClass();
        YHS.LIZJ(c188727au, yhk);
        InterfaceC87131YHn interfaceC87131YHn = this.LIZLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("error code ");
        LIZ.append(i);
        LIZ.append(", error msg ");
        LIZ.append(errorMsg);
        interfaceC87131YHn.onFailed(X1D.LIZIZ(LIZ));
    }

    public YHQ(YHZ yhz, long j, YHK yhk, InterfaceC87131YHn interfaceC87131YHn) {
        this.LIZ = yhz;
        this.LIZIZ = j;
        this.LIZJ = yhk;
        this.LIZLLL = interfaceC87131YHn;
    }
}
