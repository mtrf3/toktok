package com.ss.bduploader.net;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.bduploader.BDUploadLog;
import com.ss.bduploader.net.BDVNetClient;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class HTTPDNS extends BaseDNS {
    public static String mGlobalGoogleDNSParseHost = "";
    public static String mGlobalOwnDNSParseHost = "";
    public static String mGoogleDNSServerPath = "/resolve?name=";
    public static String mTTDNSServerPath = "/q?host=";
    public int mHttpDNSType;
    public Object mSource;
    public long mSourceId;

    private String _getURL() {
        StringBuilder sb = new StringBuilder();
        int i = this.mHttpDNSType;
        if (i == 2 || i == 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("https://");
            LIZ.append(mGlobalOwnDNSParseHost);
            LIZ.append(mTTDNSServerPath);
            sb.append(X1D.LIZIZ(LIZ));
        } else if (i == 3) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("https://");
            LIZ2.append(mGlobalGoogleDNSParseHost);
            LIZ2.append(mGoogleDNSServerPath);
            sb.append(X1D.LIZIZ(LIZ2));
        }
        sb.append(this.mHostname);
        return sb.toString();
    }

    @Override // com.ss.bduploader.net.BaseDNS
    public void cancel() {
        if (this.mCancelled) {
            return;
        }
        this.mCancelled = true;
        this.mNetClient.cancel();
    }

    @Override // com.ss.bduploader.net.BaseDNS
    public void start() {
        String _getURL = _getURL();
        for (Method method : this.mNetClient.getClass().getDeclaredMethods()) {
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                this.mNetClient.startTask(_getURL, null, null, 0, new BDVNetClient.CompletionListener() { // from class: com.ss.bduploader.net.HTTPDNS.1
                    @Override // com.ss.bduploader.net.BDVNetClient.CompletionListener
                    public void onCompletion(JSONObject jSONObject, Error error) {
                        HTTPDNS.this._handleResponse(jSONObject, error);
                    }
                });
                return;
            }
        }
        this.mNetClient.startTask(_getURL, null, new BDVNetClient.CompletionListener() { // from class: com.ss.bduploader.net.HTTPDNS.2
            @Override // com.ss.bduploader.net.BDVNetClient.CompletionListener
            public void onCompletion(JSONObject jSONObject, Error error) {
                HTTPDNS.this._handleResponse(jSONObject, error);
            }
        });
    }

    private BDUploadDNSInfo parserResult(JSONObject jSONObject) {
        long currentTimeMillis;
        String str;
        int i = this.mHttpDNSType;
        String str2 = "";
        int i2 = 60;
        if (i == 2 || i == 1) {
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                BDUploadLog.d("HTTPDNS", C16880lQ.LLLZ("no ips in json, type:%d", new Object[]{Integer.valueOf(this.mHttpDNSType)}));
                return null;
            }
            if (jSONObject.has("ttl")) {
                i2 = jSONObject.optInt("ttl");
            }
            currentTimeMillis = System.currentTimeMillis() + (i2 * 1000);
            str = null;
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                try {
                    str = JSONArrayProtectorUtils.getString(optJSONArray, i3);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(str2)) {
                        str2 = str2 + str;
                    } else {
                        str2 = str2 + "," + str;
                    }
                }
            }
        } else {
            currentTimeMillis = 0;
            str = null;
        }
        if (this.mHttpDNSType == 3) {
            try {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "Answer");
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i4);
                    if (jSONObject2.has("type") && JSONObjectProtectorUtils.getInt(jSONObject2, "type") == 1) {
                        if (jSONObject2.has("TTL")) {
                            i2 = jSONObject2.optInt("TTL");
                        }
                        if (jSONObject2.has("data")) {
                            str = jSONObject2.optString("data");
                        }
                        if (!TextUtils.isEmpty(str)) {
                            if (TextUtils.isEmpty(str2)) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(str2);
                                LIZ.append(str);
                                str2 = X1D.LIZIZ(LIZ);
                            } else {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(str2);
                                LIZ2.append(",");
                                LIZ2.append(str);
                                str2 = X1D.LIZIZ(LIZ2);
                            }
                        }
                    }
                }
                currentTimeMillis = System.currentTimeMillis() + (i2 * 1000);
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
                return null;
            }
        }
        return new BDUploadDNSInfo(this.mHttpDNSType, this.mHostname, str2, currentTimeMillis, this.mId);
    }

    public static void setDNSServerHost(String str, String str2) {
        synchronized (HTTPDNS.class) {
            if (!TextUtils.isEmpty(str)) {
                mGlobalOwnDNSParseHost = str;
            }
            if (!TextUtils.isEmpty(str2)) {
                mGlobalGoogleDNSParseHost = str2;
            }
        }
    }

    public void _handleResponse(JSONObject jSONObject, Error error) {
        BDUploadLog.d("HTTPDNS", C16880lQ.LLLZ("****http dns id:%s", new Object[]{this.mId}));
        BDUploadDNSInfo bDUploadDNSInfo = new BDUploadDNSInfo(this.mHttpDNSType, this.mHostname, null, 0L, this.mId);
        if (error != null) {
            bDUploadDNSInfo.mErrorStr = error.errStr;
        } else if (jSONObject == null || jSONObject.length() == 0) {
            BDUploadLog.d("HTTPDNS", C16880lQ.LLLZ("http dns json is empty type:%d", new Object[]{Integer.valueOf(this.mHttpDNSType)}));
        } else {
            BDUploadDNSInfo parserResult = parserResult(jSONObject);
            if (parserResult != null) {
                IPCache.getInstance().put(this.mHostname, parserResult);
                notifySuccess(parserResult);
                return;
            }
        }
        notifyError(bDUploadDNSInfo);
    }

    public HTTPDNS(String str, BDVNetClient bDVNetClient, int i, Handler handler) {
        super(str, bDVNetClient, handler);
        this.mHttpDNSType = i;
    }
}
