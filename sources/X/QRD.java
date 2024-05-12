package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QRD implements Runnable {
    public final /* synthetic */ JSONObject LJLIL = null;
    public final /* synthetic */ boolean LJLILLLLZI = true;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ QRC LJLJJLL;

    public final void LIZ() {
        JSONObject jSONObject = this.LJLIL;
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (!QSB.LIZ() || !TextUtils.isEmpty(jSONObject.optString("rule_id64"))) {
            if (this.LJLILLLLZI) {
                jSONObject.put("click_position", "notify");
            } else {
                jSONObject.put("click_position", "alert");
            }
            jSONObject.put("ttpush_sec_target_uid", this.LJLJI);
            this.LJLJJLL.getClass();
            jSONObject.put("local_sec_uid", QRC.LIZLLL());
            jSONObject.put("client_time", System.currentTimeMillis());
            jSONObject.put("real_filter", CardStruct.IStatusCode.DEFAULT);
            jSONObject.put("rule_id", this.LJLJJI);
            jSONObject.put("push_sdk_version", String.valueOf(30204));
            jSONObject.put("push_sdk_version_name", "3.2.4-alpha.29");
            if (!TextUtils.isEmpty(this.LJLJJL)) {
                jSONObject.put("ttpush_group_id", this.LJLJJL);
            }
            synchronized (this.LJLJJLL.LJ) {
                if (((ArrayList) this.LJLJJLL.LJ).contains(Long.valueOf(this.LJLJJI))) {
                    HG3 hg3 = QRM.LJIIIIZZ.LIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("double click:");
                    LIZ.append(jSONObject);
                    X1D.LIZIZ(LIZ);
                    hg3.getClass();
                    return;
                }
                ((ArrayList) this.LJLJJLL.LJ).add(Long.valueOf(this.LJLJJI));
                this.LJLJJLL.LIZIZ.getClass();
                R39.LIZJ("push_click", jSONObject);
                QRM qrm = QRM.LJIIIIZZ;
                HG3 hg32 = qrm.LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("push_click:");
                LIZ2.append(jSONObject);
                X1D.LIZIZ(LIZ2);
                hg32.getClass();
                if (this.LJLJJI <= 0) {
                    HG3 hg33 = qrm.LIZ;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("error ruleId:");
                    LIZ3.append(this.LJLJJI);
                    X1D.LIZIZ(LIZ3);
                    hg33.getClass();
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("rule_id64 is empty，please set effective rule_id64 for push click event !!");
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

    public QRD(QRC qrc, String str, long j, String str2) {
        this.LJLJJLL = qrc;
        this.LJLJI = str;
        this.LJLJJI = j;
        this.LJLJJL = str2;
    }
}
