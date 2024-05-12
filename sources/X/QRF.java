package X;

import com.bytedance.push.PushBody;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QRF implements Runnable {
    public final /* synthetic */ PushBody LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ QRC LJLJJI;

    public final void LIZ() {
        if (this.LJLIL != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("rule_id", this.LJLIL.id);
                jSONObject.put("rule_id64", this.LJLIL.rid64);
                jSONObject.put("sender", this.LJLILLLLZI);
                jSONObject.put("push_sdk_version", String.valueOf(30204));
                jSONObject.put("push_sdk_version_name", "3.2.4-alpha.29");
                jSONObject.put("reason", this.LJLJI);
                this.LJLJJI.LIZIZ.getClass();
                R39.LIZJ("push_discard_msg", jSONObject);
                HG3 hg3 = QRM.LJIIIIZZ.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" onEventDiscardMsg reason ");
                LIZ.append(this.LJLJI);
                X1D.LIZIZ(LIZ);
                hg3.getClass();
            } catch (Throwable unused) {
            }
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

    public QRF(QRC qrc, PushBody pushBody, int i, String str) {
        this.LJLJJI = qrc;
        this.LJLIL = pushBody;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
    }
}
