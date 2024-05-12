package X;

import com.bytedance.lynx.hybrid.prefetch.worker.Worker;
import org.json.JSONObject;

/* renamed from: X.ErY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37740ErY implements Runnable {
    public final /* synthetic */ Worker LJLIL;

    public RunnableC37740ErY(Worker worker) {
        this.LJLIL = worker;
    }

    public final void LIZ() {
        EnumC37741ErZ enumC37741ErZ;
        InterfaceC37747Erf interfaceC37747Erf = this.LJLIL.LIZJ;
        if (!(interfaceC37747Erf instanceof C38504F9g)) {
            interfaceC37747Erf = null;
        }
        C38504F9g c38504F9g = (C38504F9g) interfaceC37747Erf;
        if (c38504F9g != null && (enumC37741ErZ = c38504F9g.LIZLLL) != EnumC37741ErZ.Unusable && enumC37741ErZ != EnumC37741ErZ.Terminate) {
            C38504F9g.LJIIJ(c38504F9g, -999, "prefetch time out", null, 4);
            Worker worker = this.LJLIL;
            C38097ExJ.LIZIZ("hybrid_prefetch_worker_finish", worker.LJFF.LIZJ.LJIIJ, worker.LIZLLL, new JSONObject().put("success", 0).put("errorMsg", "prefetch time out").put("errorCode", -999));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
