package X;

import Y.ARunnableS22S0300000_11;
import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;
import com.bytedance.mt.protector.impl.UriProtector;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QNK implements OCS {
    public final Activity LIZ;

    public QNK(Activity activity) {
        this.LIZ = activity;
    }

    @Override // X.OCS
    public final void LIZ(OCR ocr) {
        char c;
        try {
            String str = ocr.LIZ;
            if (str == null) {
                return;
            }
            switch (str.hashCode()) {
                case -433891794:
                    if (str.equals("second_verify.close")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -431325456:
                    if (str.equals("second_verify.fetch")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -418116003:
                    if (str.equals("second_verify.toast")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -268991152:
                    if (str.equals("second_verify.hideLoading")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 103102532:
                    if (str.equals("second_verify.isSmsAvailable")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 239578933:
                    if (str.equals("second_verify.showLoading")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1807041893:
                    if (str.equals("second_verify.openSms")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    try {
                        JSONObject jSONObject = new JSONObject(ocr.LIZIZ);
                        QNB qnb = QNC.LIZ;
                        ARunnableS22S0300000_11 aRunnableS22S0300000_11 = new ARunnableS22S0300000_11(this, jSONObject, ocr, 13);
                        QNL qnl = qnb.LIZIZ;
                        if (qnl == null) {
                            return;
                        }
                        qnl.post(aRunnableS22S0300000_11);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                case 1:
                    JSONObject jSONObject2 = new JSONObject(ocr.LIZIZ);
                    int optInt = jSONObject2.optInt("status_code");
                    jSONObject2.optString("message");
                    QNV qnv = QNQ.LIZ().LIZIZ;
                    if (qnv == null) {
                        return;
                    }
                    if (optInt != 0) {
                        ((QNR) qnv).LIZ.onFail(optInt);
                    } else {
                        ((QNR) qnv).LIZ.LIZ(0, null);
                    }
                    Activity activity = this.LIZ;
                    if (activity == null) {
                        return;
                    }
                    activity.finish();
                    return;
                case 2:
                    QNQ.LIZ().LIZ.LJIIIIZZ();
                    return;
                case 3:
                    String optString = new JSONObject(ocr.LIZIZ).optString("text");
                    Activity activity2 = this.LIZ;
                    if (activity2 == null) {
                        return;
                    }
                    C16880lQ.LLZILL(Toast.makeText(activity2, optString, 0));
                    return;
                case 4:
                    new JSONObject(ocr.LIZIZ).optString("text");
                    if (this.LIZ == null) {
                        return;
                    }
                    QNQ.LIZ().LIZ.LJII();
                    return;
                case 5:
                    ocr.LIZLLL(1, null);
                    return;
                case 6:
                    JSONObject jSONObject3 = new JSONObject(ocr.LIZIZ);
                    LIZIZ(jSONObject3.optString("phone_number"), jSONObject3.optString("sms_content"));
                    return;
                default:
                    return;
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LIZIZ(String str, String str2) {
        if (this.LIZ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("smsto:");
            LIZ.append(str);
            Intent intent = new Intent("android.intent.action.SENDTO", UriProtector.parse(X1D.LIZIZ(LIZ)));
            intent.putExtra("sms_body", str2);
            intent.putExtra("pns.sandbox.dataflow_id", 1207960578);
            C16880lQ.LIZIZ(this.LIZ, intent);
        }
    }

    public static void LIZJ(JSONObject jSONObject, QN4 qn4, Activity activity) {
        if (!jSONObject.has("app_name")) {
            jSONObject.put("app_name", qn4.LIZLLL);
        }
        if (!jSONObject.has("app_version")) {
            jSONObject.put("app_version", qn4.LJII);
        }
        if (!jSONObject.has("aid")) {
            jSONObject.put("aid", qn4.LIZIZ);
        }
        if (!jSONObject.has("iid")) {
            jSONObject.put("iid", qn4.LJI);
        }
        if (!jSONObject.has("device_id")) {
            jSONObject.put("device_id", qn4.LJIIIIZZ);
        }
        if (!jSONObject.has("device_model")) {
            jSONObject.put("device_model", QNI.LIZIZ);
        }
        if (!jSONObject.has("device_brand")) {
            jSONObject.put("device_brand", QNI.LIZ);
        }
        if (!jSONObject.has("os_type")) {
            jSONObject.put("os_type", 0);
        }
        if (!jSONObject.has("os_version")) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(QNI.LIZJ);
            jSONObject.put("os_version", X1D.LIZIZ(LIZ));
        }
        if (!jSONObject.has("channel")) {
            jSONObject.put("channel", qn4.LJ);
        }
        if (!jSONObject.has("region")) {
            jSONObject.put("region", qn4.LIZ);
        }
        if (!jSONObject.has("sdk_version")) {
            jSONObject.put("sdk_version", "2.3.3.i18n");
        }
        if (!jSONObject.has("language")) {
            jSONObject.put("language", qn4.LIZJ);
        }
        if (!jSONObject.has("time")) {
            jSONObject.put("time", System.currentTimeMillis());
        }
        if (!jSONObject.has("locale")) {
            jSONObject.put("locale", qn4.LIZ());
        }
        if (!jSONObject.has("resolution") && activity != null) {
            jSONObject.put("resolution", C78840Uwu.LJIIZILJ(activity));
        }
    }
}
