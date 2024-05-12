package X;

import com.bytedance.retrofit2.SsHttpCall;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QFv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66703QFv implements Runnable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ InterfaceC37276Ek4 LJLILLLLZI;
    public final /* synthetic */ C64797Pbt LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ C66698QFq LJLJJL;

    public final void LIZ() {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("image_size", this.LJLIL);
            try {
                InterfaceC37276Ek4 interfaceC37276Ek4 = this.LJLILLLLZI;
                if (interfaceC37276Ek4 instanceof InterfaceC37818Eso) {
                    ((InterfaceC37818Eso) interfaceC37276Ek4).doCollect();
                }
                Object obj = this.LJLJI.LIZ.LJFF;
                if (obj instanceof C64672PZs) {
                    this.LJLJJL.LJLIL = (C64672PZs) obj;
                }
            } catch (Throwable unused) {
            }
            C66698QFq c66698QFq = this.LJLJJL;
            C66699QFr c66699QFr = c66698QFq.LJLL;
            C66704QFw c66704QFw = c66698QFq.LJLJI;
            String str = this.LJLJJI;
            boolean z = c66698QFq.LJLJJL;
            List<EJ6> list = this.LJLJI.LIZ.LIZLLL;
            long j = this.LJLIL;
            c66699QFr.getClass();
            C66699QFr.LJFF(c66704QFw, str, z, list, j);
            if (this.LJLJJL.LJLIL != null) {
                long currentTimeMillis = System.currentTimeMillis();
                C66698QFq c66698QFq2 = this.LJLJJL;
                C66704QFw c66704QFw2 = c66698QFq2.LJLJI;
                C64672PZs c64672PZs = c66698QFq2.LJLIL;
                c66704QFw2.LJII = c64672PZs.LJ;
                c66704QFw2.LJIIIIZZ = currentTimeMillis;
                c64672PZs.LJI = c66698QFq2.LJLILLLLZI;
                c64672PZs.LJII = currentTimeMillis;
                C66699QFr.LJIIJ(c64672PZs, this.LJLJI.LIZ.LIZLLL, c66698QFq2.LJLJJLL, null);
                C66698QFq c66698QFq3 = this.LJLJJL;
                C66699QFr c66699QFr2 = c66698QFq3.LJLL;
                C64672PZs c64672PZs2 = c66698QFq3.LJLIL;
                c66699QFr2.getClass();
                JSONObject jSONObject2 = c64672PZs2.LJJ;
                if (jSONObject2 != null) {
                    Object remove = jSONObject2.remove("retryCount");
                    if (remove instanceof Integer) {
                        i = ((Integer) remove).intValue();
                        C66704QFw c66704QFw3 = this.LJLJJL.LJLJI;
                        int i2 = c66704QFw3.LJIIJJI + i;
                        c66704QFw3.LJIIJJI = i2;
                        jSONObject.put("retryCount", i2);
                    }
                }
                i = 0;
                C66704QFw c66704QFw32 = this.LJLJJL.LJLJI;
                int i22 = c66704QFw32.LJIIJJI + i;
                c66704QFw32.LJIIJJI = i22;
                jSONObject.put("retryCount", i22);
            }
            QGL qgl = new QGL(0);
            C64797Pbt c64797Pbt = this.LJLJI;
            qgl.LIZ = c64797Pbt;
            C36910EeA c36910EeA = c64797Pbt.LIZ;
            qgl.LIZJ = c36910EeA.LIZ;
            jSONObject.put("http_status", c36910EeA.LIZIZ);
            jSONObject.put("requestId", this.LJLJJL.LJLJI.LIZ());
            C66698QFq c66698QFq4 = this.LJLJJL;
            C66699QFr c66699QFr3 = c66698QFq4.LJLL;
            C66704QFw c66704QFw4 = c66698QFq4.LJLJI;
            c66699QFr3.getClass();
            C66699QFr.LJIILJJIL(jSONObject, c66704QFw4);
            QG3 qg3 = C66699QFr.LIZIZ;
            if (qg3 != null) {
                C66698QFq c66698QFq5 = this.LJLJJL;
                C66704QFw c66704QFw5 = c66698QFq5.LJLJI;
                long j2 = c66704QFw5.LJIIIIZZ;
                long j3 = c66704QFw5.LJI;
                qg3.LIZIZ(j2 - j3, j3, qgl, c66698QFq5.LJLIL, jSONObject);
            }
            C66698QFq c66698QFq6 = this.LJLJJL;
            C66699QFr c66699QFr4 = c66698QFq6.LJLL;
            C66704QFw c66704QFw6 = c66698QFq6.LJLJI;
            long j4 = c66704QFw6.LJIIIIZZ - c66704QFw6.LJI;
            c66699QFr4.getClass();
            C66699QFr.LJIILIIL(c66704QFw6, true, j4);
        } catch (JSONException unused2) {
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

    public RunnableC66703QFv(C66698QFq c66698QFq, long j, SsHttpCall ssHttpCall, C64797Pbt c64797Pbt, String str) {
        this.LJLJJL = c66698QFq;
        this.LJLIL = j;
        this.LJLILLLLZI = ssHttpCall;
        this.LJLJI = c64797Pbt;
        this.LJLJJI = str;
    }
}
