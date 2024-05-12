package com.byted.cast.common.pin;

import X.X1D;
import android.text.TextUtils;
import android.util.Base64;
import com.byted.cast.common.Logger;
import com.byted.cast.common.UrlUtils;
import com.byted.cast.common.api.IHttpNetWork;
import com.byted.cast.common.api.Response;
import com.byted.cast.common.auth.license.VerifyUtil;
import com.byted.cast.common.bean.SinkInfoBean;
import com.byted.cast.common.network.DefaultHttpNetWork;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.Gson;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class QRPinNetWork {
    public final IHttpNetWork httpNetWork;
    public final boolean isBoe;
    public final String TAG = "QRPinNetWork";
    public final String ACTION_UPLOAD_RESOURCE = "UploadResource";
    public final String ACTION_DOWNLOAD_RESOURCE = "DownloadResource";
    public final String mSplit = "_0_";
    public String tokenAndTime = "_0_0";
    public String hostName = UrlUtils.getQRDataDomain(false);
    public final String tokenHost = UrlUtils.getQRTokenDomain(false);

    public QRPinNetWork() {
        DefaultHttpNetWork defaultHttpNetWork = new DefaultHttpNetWork();
        this.httpNetWork = defaultHttpNetWork;
        if (defaultHttpNetWork instanceof DefaultHttpNetWork) {
            defaultHttpNetWork.setTimeOut(5000);
        }
    }

    public QRPinNetWork(IHttpNetWork iHttpNetWork) {
        iHttpNetWork = iHttpNetWork == null ? new DefaultHttpNetWork() : iHttpNetWork;
        this.httpNetWork = iHttpNetWork;
        if (iHttpNetWork instanceof DefaultHttpNetWork) {
            ((DefaultHttpNetWork) iHttpNetWork).setTimeOut(5000);
        }
    }

    private String doRequestTokenAndHostName(String str) {
        JSONObject optJSONObject;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("doRequestToken tokenHost:");
        LIZ.append(this.tokenHost);
        LIZ.append(", action:");
        LIZ.append(str);
        Logger.d("QRPinNetWork", X1D.LIZIZ(LIZ));
        String[] split = this.tokenAndTime.split("_0_");
        if (split.length == 2 && System.currentTimeMillis() - CastLongProtector.parseLong(split[1]) <= 840000) {
            return split[0];
        }
        try {
            String jSONObject = new JSONObject().put("action", str).toString();
            String generateAppServerReqContent = VerifyUtil.generateAppServerReqContent(jSONObject);
            String generateAppServerReqSignature = VerifyUtil.generateAppServerReqSignature(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("content", generateAppServerReqContent);
            jSONObject2.put("signature", generateAppServerReqSignature);
            String jSONObject3 = jSONObject2.toString();
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/json");
            Response doPost = this.httpNetWork.doPost(this.tokenHost, jSONObject3, hashMap);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("response : ");
            LIZ2.append(doPost);
            Logger.d("QRPinNetWork", X1D.LIZIZ(LIZ2));
            if (doPost != null && doPost.code == 200) {
                JSONObject jSONObject4 = new JSONObject(doPost.body);
                if (jSONObject4.optInt("status_code") == 0 && (optJSONObject = jSONObject4.optJSONObject("data")) != null) {
                    String optString = optJSONObject.optString("token");
                    String optString2 = optJSONObject.optString("url");
                    if (!TextUtils.isEmpty(optString2)) {
                        this.hostName = optString2;
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(optString);
                    LIZ3.append("_0_");
                    LIZ3.append(System.currentTimeMillis());
                    this.tokenAndTime = X1D.LIZIZ(LIZ3);
                    return optString;
                }
                return "";
            }
            return "";
        } catch (Throwable th) {
            Logger.e("QRPinNetWork", th.toString());
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0066, code lost:
    
        if (r2 == 200) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
    
        r1 = new org.json.JSONObject(r3.body).optJSONObject("Result");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0075, code lost:
    
        if (r1 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        r3 = new java.lang.String(android.util.Base64.decode(r1.optString("Data"), 2));
        r1 = X.X1D.LIZ();
        r1.append("getLinkInfoByQRContent data : ");
        r1.append(r3);
        com.byted.cast.common.Logger.i("QRPinNetWork", X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00aa, code lost:
    
        return (com.byted.cast.common.bean.SinkInfoBean) new com.google.gson.Gson().LJI(r3, com.byted.cast.common.bean.SinkInfoBean.class);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.byted.cast.common.bean.SinkInfoBean getLinkInfoByQRContent(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "DownloadResource"
            java.lang.String r2 = r6.doRequestTokenAndHostName(r0)     // Catch: java.lang.Throwable -> Lb8
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = r6.hostName     // Catch: java.lang.Throwable -> Lb8
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = "?"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb8
            r1.append(r2)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = "&Number="
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb8
            r1.append(r7)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r5 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = "QRPinNetWork"
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = "getLinkInfoByQRContent url : "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb8
            r1.append(r5)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lb8
            com.byted.cast.common.Logger.i(r2, r0)     // Catch: java.lang.Throwable -> Lb8
            r4 = 0
        L3a:
            com.byted.cast.common.api.IHttpNetWork r2 = r6.httpNetWork     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            java.lang.String r1 = ""
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            com.byted.cast.common.api.Response r3 = r2.doPost(r5, r1, r0)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            java.lang.String r2 = "QRPinNetWork"
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            java.lang.String r0 = "getLinkInfoByQRContent response : "
            r1.append(r0)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            r1.append(r3)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            com.byted.cast.common.Logger.i(r2, r0)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            int r4 = r4 + 1
            int r2 = r3.code     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            r1 = 200(0xc8, float:2.8E-43)
            if (r2 == r1) goto L68
            r0 = 3
            if (r4 <= r0) goto L3a
            if (r2 != r1) goto Lb5
        L68:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            java.lang.String r0 = r3.body     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            r1.<init>(r0)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            java.lang.String r0 = "Result"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            if (r1 == 0) goto Lb5
            java.lang.String r0 = "Data"
            java.lang.String r1 = r1.optString(r0)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            r0 = 2
            byte[] r0 = android.util.Base64.decode(r1, r0)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            r3.<init>(r0)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            java.lang.String r2 = "QRPinNetWork"
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            java.lang.String r0 = "getLinkInfoByQRContent data : "
            r1.append(r0)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            r1.append(r3)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            com.byted.cast.common.Logger.i(r2, r0)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            r1.<init>()     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            java.lang.Class<com.byted.cast.common.bean.SinkInfoBean> r0 = com.byted.cast.common.bean.SinkInfoBean.class
            java.lang.Object r0 = r1.LJI(r3, r0)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            com.byted.cast.common.bean.SinkInfoBean r0 = (com.byted.cast.common.bean.SinkInfoBean) r0     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lb8
            monitor-exit(r6)
            return r0
        Lab:
            r0 = move-exception
            java.lang.String r1 = "QRPinNetWork"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb8
            com.byted.cast.common.Logger.e(r1, r0)     // Catch: java.lang.Throwable -> Lb8
        Lb5:
            monitor-exit(r6)
            r0 = 0
            return r0
        Lb8:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.common.pin.QRPinNetWork.getLinkInfoByQRContent(java.lang.String):com.byted.cast.common.bean.SinkInfoBean");
    }

    public synchronized String uploadLinkInfo(SinkInfoBean sinkInfoBean) {
        JSONObject optJSONObject;
        String encodeToString = Base64.encodeToString(GsonProtectorUtils.toJson(new Gson(), sinkInfoBean).getBytes(), 2);
        int i = 0;
        Response response = null;
        do {
            i++;
            try {
                String doRequestTokenAndHostName = doRequestTokenAndHostName("UploadResource");
                if (!TextUtils.isEmpty(doRequestTokenAndHostName)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(this.hostName);
                    LIZ.append("?");
                    LIZ.append(doRequestTokenAndHostName);
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("uploadLinkInfo url : ");
                    LIZ2.append(LIZIZ);
                    Logger.i("QRPinNetWork", X1D.LIZIZ(LIZ2));
                    IHttpNetWork iHttpNetWork = this.httpNetWork;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("{ \"data\":\"");
                    LIZ3.append(encodeToString);
                    LIZ3.append("\"}");
                    response = iHttpNetWork.doPost(LIZIZ, X1D.LIZIZ(LIZ3), Collections.emptyMap());
                }
            } catch (Exception e) {
                try {
                    e.printStackTrace();
                } catch (Exception e2) {
                    Logger.e("QRPinNetWork", e2.toString());
                }
            }
            if (response != null) {
                break;
            }
        } while (i <= 3);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("uploadLinkInfo response : ");
        LIZ4.append(response);
        Logger.i("QRPinNetWork", X1D.LIZIZ(LIZ4));
        if (response != null && response.code == 200 && (optJSONObject = new JSONObject(response.body).optJSONObject("Result")) != null) {
            return optJSONObject.optString("Number");
        }
        return null;
    }
}
