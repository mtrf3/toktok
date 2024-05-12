package X;

import com.ss.android.common.lib.AppLogNewUtils;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QUb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67073QUb implements Runnable {
    public final /* synthetic */ C67087QUp LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C67074QUc LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ Object[] LJLJJL;

    public RunnableC67073QUb(C67087QUp c67087QUp, long j, C67074QUc c67074QUc, int i, Object[] objArr) {
        this.LJLIL = c67087QUp;
        this.LJLILLLLZI = j;
        this.LJLJI = c67074QUc;
        this.LJLJJI = i;
        this.LJLJJL = objArr;
    }

    public final void LIZ() {
        C67087QUp c67087QUp = this.LJLIL;
        long j = this.LJLILLLLZI;
        C67074QUc c67074QUc = this.LJLJI;
        int i = this.LJLJJI;
        c67087QUp.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("business", j);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        try {
            jSONObject.put("cursor", c67074QUc.LJ);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        byte[] bArr = c67074QUc.LIZ;
        o.LJFF(bArr, "data.data");
        C77413UZt.LJJIII("data_md5", C73994T2g.LJIIL(new String(bArr, PVC.LIZ)), jSONObject);
        try {
            AppLogNewUtils.onEventV3("sync_sdk_submit", jSONObject);
        } catch (Throwable unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("time_consuming", System.currentTimeMillis() - c67074QUc.LIZLLL);
        jSONObject2.put("submit_cnt", i);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("business", j);
        PV6.LIZIZ("sync_sdk_submit_data", jSONObject3, jSONObject2, null, 8);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notify ->>>>>> business=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", data=");
        LIZ.append(this.LJLJI);
        LIZ.append(" to ");
        LIZ.append(this.LJLJJL);
        C66629QCz.LIZJ(X1D.LIZIZ(LIZ));
        for (Object obj : this.LJLJJL) {
            if (obj != null) {
                try {
                    ((InterfaceC67072QUa) obj).LIZ(this.LJLJI);
                } catch (Exception e3) {
                    C16880lQ.LLLLIIL(e3);
                    this.LJLIL.LJLJI.getClass();
                    QUP LIZJ = QUU.LIZJ();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("crash when dispatch to business ");
                    LIZ2.append(this.LJLILLLLZI);
                    LIZ2.append(", listener = ");
                    LIZ2.append(obj);
                    LIZJ.ensureNotReachHere(e3, X1D.LIZIZ(LIZ2));
                }
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.sync.interfaze.OnDataUpdateListener");
                break;
            }
            C16880lQ.LLLLIIL(e3);
            this.LJLIL.LJLJI.getClass();
            QUP LIZJ2 = QUU.LIZJ();
            StringBuilder LIZ22 = X1D.LIZ();
            LIZ22.append("crash when dispatch to business ");
            LIZ22.append(this.LJLILLLLZI);
            LIZ22.append(", listener = ");
            LIZ22.append(obj);
            LIZJ2.ensureNotReachHere(e3, X1D.LIZIZ(LIZ22));
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
