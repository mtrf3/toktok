package X;

import android.text.TextUtils;
import com.bytedance.push.PushBody;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QRE implements Runnable {
    public final /* synthetic */ PushBody LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ QRC LJLJJI;

    public final void LIZ() {
        Object obj;
        if (this.LJLIL != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("rule_id", this.LJLIL.id);
                jSONObject.put("rule_id64", this.LJLIL.rid64);
                jSONObject.put("sender", this.LJLILLLLZI);
                jSONObject.put("push_sdk_version", String.valueOf(30204));
                jSONObject.put("push_sdk_version_name", "3.2.4-alpha.29");
                jSONObject.put("ttpush_sec_target_uid", this.LJLIL.targetSecUid);
                this.LJLJJI.getClass();
                jSONObject.put("local_sec_uid", QRC.LIZLLL());
                QRC qrc = this.LJLJJI;
                String str = this.LJLIL.targetSecUid;
                qrc.getClass();
                String str2 = "1";
                if (QRC.LJFF(str)) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("is_self", obj);
                jSONObject.put("client_time", System.currentTimeMillis());
                if (!this.LJLJI) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("real_filter", str2);
                if (!TextUtils.isEmpty(this.LJLIL.groupId)) {
                    jSONObject.put("ttpush_group_id", this.LJLIL.groupId);
                }
                this.LJLJJI.LIZIZ.getClass();
                R39.LIZJ("push_show_ug", jSONObject);
                HG3 hg3 = QRM.LJIIIIZZ.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("push_show_ug:");
                LIZ.append(jSONObject);
                X1D.LIZIZ(LIZ);
                hg3.getClass();
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
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

    public QRE(QRC qrc, PushBody pushBody, int i, boolean z) {
        this.LJLJJI = qrc;
        this.LJLIL = pushBody;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }
}
