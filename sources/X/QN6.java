package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.sec.captcha.SecCaptcha;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QN6 implements QN3 {
    public final /* synthetic */ SecCaptcha LIZ;

    public QN6(SecCaptcha secCaptcha) {
        this.LIZ = secCaptcha;
    }

    @Override // X.QN3
    public final void onEvent(String str, JSONObject jSONObject) {
        String str2;
        AppLogNewUtils.onEventV3(str, jSONObject);
        Integer num = null;
        try {
            str2 = JSONObjectProtectorUtils.getString(jSONObject, "key");
        } catch (JSONException unused) {
            str2 = null;
        }
        if (o.LJ(str2, "load_webview")) {
            try {
                num = Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject, "result"));
            } catch (JSONException unused2) {
            }
            if (num == null || num.intValue() != 0) {
                QNA qna = this.LIZ.LJLJL;
                if (qna != null) {
                    qna.LIZJ();
                    return;
                }
                return;
            }
            QNA qna2 = this.LIZ.LJLJL;
            if (qna2 == null) {
                return;
            }
            qna2.LIZLLL();
        }
    }
}
