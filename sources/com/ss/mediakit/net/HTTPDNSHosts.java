package com.ss.mediakit.net;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.mediakit.medialoader.AVMDLLog;
import com.ss.mediakit.net.AVMDLNetClient;
import java.lang.reflect.Method;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class HTTPDNSHosts {
    public static String mTTDNSServer = "/q?host=";
    public boolean mCancelled;
    public Handler mHandler;
    public String[] mHostnames;
    public int mHttpDNSType;
    public String mId;
    public AVMDLNetClient mNetClient;

    private String _getURL() {
        StringBuilder sb = new StringBuilder();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append(AVMDLDNSParser.mGlobalOwnDNSParseHost);
        LIZ.append(mTTDNSServer);
        sb.append(X1D.LIZIZ(LIZ));
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.mHostnames;
            if (i < strArr.length) {
                if (!TextUtils.isEmpty(strArr[i])) {
                    if (i2 == 0) {
                        sb.append(this.mHostnames[i]);
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(",");
                        LIZ2.append(this.mHostnames[i]);
                        sb.append(X1D.LIZIZ(LIZ2));
                    }
                    i2++;
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    public void cancel() {
        if (this.mCancelled) {
            return;
        }
        this.mCancelled = true;
        this.mNetClient.cancel();
    }

    public void start() {
        String _getURL = _getURL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("batch http dns  url:");
        LIZ.append(_getURL);
        AVMDLLog.d("BatchParseHTTPDNSHosts", X1D.LIZIZ(LIZ));
        for (Method method : this.mNetClient.getClass().getDeclaredMethods()) {
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                this.mNetClient.startTask(_getURL, null, null, 0, new AVMDLNetClient.CompletionListener() { // from class: com.ss.mediakit.net.HTTPDNSHosts.1
                    @Override // com.ss.mediakit.net.AVMDLNetClient.CompletionListener
                    public void onCompletion(JSONObject jSONObject, Error error) {
                        HTTPDNSHosts.this._handleResponse(jSONObject, error);
                    }
                });
                return;
            }
        }
        this.mNetClient.startTask(_getURL, null, new AVMDLNetClient.CompletionListener() { // from class: com.ss.mediakit.net.HTTPDNSHosts.2
            @Override // com.ss.mediakit.net.AVMDLNetClient.CompletionListener
            public void onCompletion(JSONObject jSONObject, Error error) {
                HTTPDNSHosts.this._handleResponse(jSONObject, error);
            }
        });
    }

    private void parseResult(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "dns");
            for (int i = 0; i < jSONArray.length(); i++) {
                AVMDLDNSInfo parserResultForSingleHost = parserResultForSingleHost(JSONArrayProtectorUtils.getJSONObject(jSONArray, i));
                if (parserResultForSingleHost != null) {
                    IPCache.getInstance().put(parserResultForSingleHost.mHost, parserResultForSingleHost);
                }
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("parse json exception");
            LIZ.append(e);
            AVMDLLog.d("BatchParseHTTPDNSHosts", X1D.LIZIZ(LIZ));
        }
    }

    private AVMDLDNSInfo parserResultForSingleHost(JSONObject jSONObject) {
        int i;
        String str;
        long currentTimeMillis;
        String str2;
        int i2 = this.mHttpDNSType;
        String str3 = "";
        if (i2 == 2 || i2 == 1) {
            if (jSONObject != null && jSONObject.length() != 0) {
                if (jSONObject.has("ttl")) {
                    i = jSONObject.optInt("ttl");
                } else {
                    i = 60;
                }
                if (jSONObject.has("host")) {
                    str = jSONObject.optString("host");
                } else {
                    str = null;
                }
                currentTimeMillis = System.currentTimeMillis() + (i * 1000);
                JSONArray optJSONArray = jSONObject.optJSONArray("ips");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                        try {
                            str2 = JSONArrayProtectorUtils.getString(optJSONArray, i3);
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                            str2 = null;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            if (TextUtils.isEmpty(str3)) {
                                str3 = str3 + str2;
                            } else {
                                str3 = str3 + "," + str2;
                            }
                        }
                    }
                }
            }
            return null;
        }
        str = null;
        currentTimeMillis = 0;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            AVMDLLog.d("BatchParseHTTPDNSHosts", "parse result is null");
            return null;
        }
        AVMDLLog.d("BatchParseHTTPDNSHosts", C16880lQ.LLLZI(Locale.US, "parse result host:%s ips:%s expiredT:%d", new Object[]{str, str3, Long.valueOf(currentTimeMillis)}));
        return new AVMDLDNSInfo(this.mHttpDNSType, str, str3, currentTimeMillis, this.mId);
    }

    public void _handleResponse(JSONObject jSONObject, Error error) {
        Locale locale = Locale.US;
        AVMDLLog.d("BatchParseHTTPDNSHosts", C16880lQ.LLLZI(locale, "****http dns id:%s type:%d", new Object[]{this.mId, Integer.valueOf(this.mHttpDNSType)}));
        if (error != null) {
            AVMDLLog.d("BatchParseHTTPDNSHosts", C16880lQ.LLLZI(locale, "handle response receive err:%s", new Object[]{error.errStr}));
            return;
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            AVMDLLog.d("BatchParseHTTPDNSHosts", C16880lQ.LLLZI(locale, "json null err", new Object[0]));
            return;
        }
        try {
            parseResult(jSONObject);
        } catch (Throwable th) {
            AVMDLLog.d("BatchParseHTTPDNSHosts", C16880lQ.LLLZI(Locale.US, "handle response exception:%s", new Object[]{th.toString()}));
        }
        AVMDLLog.d("BatchParseHTTPDNSHosts", C16880lQ.LLLZI(Locale.US, "****parse end", new Object[0]));
    }

    public HTTPDNSHosts(String[] strArr, AVMDLNetClient aVMDLNetClient, int i, Handler handler) {
        this.mHttpDNSType = 2;
        if (i == 2) {
            if (strArr != null && strArr.length != 0) {
                this.mHttpDNSType = i;
                this.mHostnames = strArr;
                this.mNetClient = aVMDLNetClient;
                if (aVMDLNetClient == null) {
                    this.mNetClient = new AVMDLHTTPNetwork();
                }
                this.mHttpDNSType = i;
                this.mHandler = handler;
                return;
            }
            AVMDLLog.d("BatchParseHTTPDNSHosts", "host array is valid");
            throw new Exception("host array is valid");
        }
        AVMDLLog.d("BatchParseHTTPDNSHosts", "create fail type is not own");
        throw new Exception("type is not own");
    }
}
