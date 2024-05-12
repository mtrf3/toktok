package X;

import Y.ARunnableS8S1300000_11;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class QNO implements OCS {
    public void LIZJ(int i, int i2) {
        throw null;
    }

    public void LIZLLL(int i, String str, String str2) {
        throw null;
    }

    @Override // X.OCS
    public final void LIZ(OCR ocr) {
        char c;
        String str;
        try {
            String str2 = ocr.LIZ;
            switch (str2.hashCode()) {
                case -1759249244:
                    if (str2.equals("bytedcert.verifyResult")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1628743486:
                    if (str2.equals("bytedcert.h5_state_changed")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1563440329:
                    if (str2.equals("bytedcert.getTouch")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1534238297:
                    if (str2.equals("bytedcert.verify")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1471628194:
                    if (str2.equals("bytedcert.pageEnd")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1366167938:
                    if (str2.equals("bytedcert.refreshVerifyViewFinish")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1028963129:
                    if (str2.equals("bytedcert.preLoadVerifyFinish")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -514719849:
                    if (str2.equals("bytedcert.dialogSize")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 428780843:
                    if (str2.equals("bytedcert.getSettings")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 491779646:
                    if (str2.equals("bytedcert.eventToNative")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1154510586:
                    if (str2.equals("bytedcert.readyView")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1176627553:
                    if (str2.equals("bytedcert.network.request")) {
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
                    JSONObject jSONObject = new JSONObject(ocr.LIZIZ);
                    LIZJ(JSONObjectProtectorUtils.getInt(jSONObject, "w"), JSONObjectProtectorUtils.getInt(jSONObject, "h"));
                    return;
                case 1:
                    QNB qnb = QNC.LIZ;
                    QNL qnl = qnb.LIZIZ;
                    if (qnl == null) {
                        return;
                    }
                    qnb.LIZIZ.sendMessage(qnl.obtainMessage(2, ocr));
                    return;
                case 2:
                    ((C66910QNu) this).LIZ.LIZ();
                    return;
                case 3:
                    JSONObject jSONObject2 = new JSONObject(ocr.LIZIZ);
                    int optInt = jSONObject2.optInt("result");
                    jSONObject2.optString("mode");
                    jSONObject2.optString("type");
                    LIZLLL(optInt, jSONObject2.optString("token"), jSONObject2.optString("mobile"));
                    return;
                case 4:
                    JSONObject jSONObject3 = new JSONObject(ocr.LIZIZ);
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object opt = jSONObject3.opt(next);
                        if (opt != null) {
                            str = opt.toString();
                        } else {
                            str = null;
                        }
                        hashMap.put(next, str);
                    }
                    return;
                case 5:
                    JSONObject jSONObject4 = new JSONObject(ocr.LIZIZ);
                    QN2.LIZJ(jSONObject4.optString("event"), jSONObject4);
                    return;
                case 6:
                    LIZIZ(ocr);
                    return;
                case 7:
                    OIP.LIZ.LIZ.getClass();
                    ocr.LIZLLL(1, null);
                    return;
                case '\b':
                    String string = JSONObjectProtectorUtils.getString(new JSONObject(ocr.LIZIZ), "params");
                    QNP qnp = new QNP(ocr);
                    C66910QNu c66910QNu = (C66910QNu) this;
                    QNY qny = new QNY(string);
                    qny.LJ = false;
                    qny.LIZLLL = false;
                    DialogC66909QNt dialogC66909QNt = c66910QNu.LIZ;
                    dialogC66909QNt.LJLLLLLL.onDismiss(dialogC66909QNt);
                    OIP.LIZ.LJ(c66910QNu.LIZ.LJZL.LIZ, qny, qnp);
                    return;
                case '\t':
                    QNH qnh = ((C66910QNu) this).LIZ.LJZL;
                    if (!(qnh instanceof QNU)) {
                        return;
                    }
                    ((QNU) qnh).getClass();
                    return;
                case '\n':
                    long currentTimeMillis = System.currentTimeMillis() - 0;
                    JSONObject jSONObject5 = new JSONObject();
                    try {
                        jSONObject5.put("duration", currentTimeMillis);
                        jSONObject5.put("key", "pre_create_success");
                        QN2.LIZJ("turing_verify_sdk", jSONObject5);
                        return;
                    } catch (JSONException e) {
                        if (C61349O5x.LIZ >= 3) {
                            return;
                        }
                        C16880lQ.LLLLIIL(e);
                        return;
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    long currentTimeMillis2 = System.currentTimeMillis() - 0;
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("duration", currentTimeMillis2);
                        jSONObject6.put("key", "pre_create_load_success");
                        QN2.LIZJ("turing_verify_sdk", jSONObject6);
                        return;
                    } catch (JSONException e2) {
                        if (C61349O5x.LIZ >= 3) {
                            return;
                        }
                        C16880lQ.LLLLIIL(e2);
                        return;
                    }
                default:
                    return;
            }
        } catch (Exception unused) {
        }
    }

    public final void LIZIZ(OCR ocr) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject(ocr.LIZIZ);
            String string = JSONObjectProtectorUtils.getString(jSONObject, "url");
            String string2 = JSONObjectProtectorUtils.getString(jSONObject, "method");
            JSONObject optJSONObject = jSONObject.optJSONObject("query");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
            String str2 = null;
            if (optJSONObject != null) {
                StringBuilder sb = new StringBuilder(string);
                sb.append("?");
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (optJSONObject.get(next) != null) {
                        str = optJSONObject.get(next).toString();
                    } else {
                        str = null;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("&");
                    LIZ.append(next);
                    LIZ.append("=");
                    sb.append(X1D.LIZIZ(LIZ));
                    sb.append(str);
                }
                string = sb.toString();
            }
            if (optJSONObject2 != null) {
                str2 = optJSONObject2.toString().replaceAll("\\\\/", "/");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/json; charset=utf-8");
            if (string2.equals("post")) {
                QNB qnb = QNC.LIZ;
                QNN qnn = new QNN(this, string, hashMap, str2, ocr);
                QNL qnl = qnb.LIZIZ;
                if (qnl != null) {
                    qnl.post(qnn);
                    return;
                }
                return;
            }
            QNB qnb2 = QNC.LIZ;
            ARunnableS8S1300000_11 aRunnableS8S1300000_11 = new ARunnableS8S1300000_11(hashMap, string, ocr, this, 2);
            QNL qnl2 = qnb2.LIZIZ;
            if (qnl2 != null) {
                qnl2.post(aRunnableS8S1300000_11);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LJ(OCR ocr, String str) {
        int i = !TextUtils.isEmpty(str) ? 1 : 0;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", str);
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            i = 0;
        }
        ocr.LIZLLL(i, jSONObject);
    }
}
