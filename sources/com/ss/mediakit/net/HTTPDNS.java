package com.ss.mediakit.net;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.ss.mediakit.medialoader.AVMDLLog;
import com.ss.mediakit.net.AVMDLNetClient;
import java.lang.reflect.Method;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class HTTPDNS extends BaseDNS {
    public static String mGoogleDNSServer = "/resolve?name=";
    public static String mTTDNSServer = "/q?host=";
    public int mHttpDNSType;
    public Object mSource;
    public long mSourceId;

    private String _getURL() {
        StringBuilder sb = new StringBuilder();
        boolean isIPv4Reachable = AVMDLMultiNetwork.isIPv4Reachable();
        boolean isIPv4Reachable2 = AVMDLMultiNetwork.isIPv4Reachable();
        int i = this.mHttpDNSType;
        if (i == 2 || i == 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("https://");
            LIZ.append(AVMDLDNSParser.mGlobalOwnDNSParseHost);
            LIZ.append(mTTDNSServer);
            sb.append(X1D.LIZIZ(LIZ));
        } else if (i == 3) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("https://");
            LIZ2.append(AVMDLDNSParser.mGlobalGoogleDNSParseHost);
            LIZ2.append(mGoogleDNSServer);
            sb.append(X1D.LIZIZ(LIZ2));
        }
        sb.append(this.mHostname);
        int i2 = this.mHttpDNSType;
        if (i2 == 2 || i2 == 1) {
            sb.append("&source=vod");
            AVMDLDataLoaderConfigure config = AVMDLDataLoader.getInstance().getConfig();
            if (config != null && config.mEnableNetworkChangeNotify == 1) {
                if (isIPv4Reachable) {
                    if (isIPv4Reachable2) {
                        sb.append("&f=0");
                    } else {
                        sb.append("&f=1");
                    }
                } else if (isIPv4Reachable2) {
                    sb.append("&f=2");
                }
            }
        }
        return sb.toString();
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public void cancel() {
        if (this.mCancelled) {
            return;
        }
        this.mCancelled = true;
        this.mNetClient.cancel();
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public void start() {
        String _getURL = _getURL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("http dns url:");
        LIZ.append(_getURL);
        AVMDLLog.d("HTTPDNS", X1D.LIZIZ(LIZ));
        for (Method method : this.mNetClient.getClass().getDeclaredMethods()) {
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                this.mNetClient.startTask(_getURL, null, null, 0, new AVMDLNetClient.CompletionListener() { // from class: com.ss.mediakit.net.HTTPDNS.1
                    @Override // com.ss.mediakit.net.AVMDLNetClient.CompletionListener
                    public void onCompletion(JSONObject jSONObject, Error error) {
                        HTTPDNS.this._handleResponse(jSONObject, error);
                    }
                });
                return;
            }
        }
        this.mNetClient.startTask(_getURL, null, new AVMDLNetClient.CompletionListener() { // from class: com.ss.mediakit.net.HTTPDNS.2
            @Override // com.ss.mediakit.net.AVMDLNetClient.CompletionListener
            public void onCompletion(JSONObject jSONObject, Error error) {
                HTTPDNS.this._handleResponse(jSONObject, error);
            }
        });
    }

    private AVMDLDNSInfo parserResult(JSONObject jSONObject) {
        long currentTimeMillis;
        String str;
        int i = this.mHttpDNSType;
        String str2 = "";
        int i2 = 60;
        if (i == 2 || i == 1) {
            if (jSONObject == null || jSONObject.length() == 0) {
                return null;
            }
            if (jSONObject.has("ttl")) {
                i2 = jSONObject.optInt("ttl");
            }
            AVMDLLog.d("HTTPDNS", C16880lQ.LLLZI(Locale.US, "receive expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(i2), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
            int i3 = AVMDLDNSParser.mGlobalForceExpiredTime;
            if (i3 > 0) {
                i2 = i3;
            }
            currentTimeMillis = System.currentTimeMillis() + (i2 * 1000);
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return null;
            }
            str = null;
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                try {
                    str = JSONArrayProtectorUtils.getString(optJSONArray, i4);
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
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i5);
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
                AVMDLLog.d("HTTPDNS", C16880lQ.LLLZI(Locale.US, "receive expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(i2), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
                int i6 = AVMDLDNSParser.mGlobalForceExpiredTime;
                if (i6 > 0) {
                    i2 = i6;
                }
                currentTimeMillis = System.currentTimeMillis() + (i2 * 1000);
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
                return null;
            }
        }
        return new AVMDLDNSInfo(this.mHttpDNSType, this.mHostname, str2, currentTimeMillis, this.mId);
    }

    public void _handleResponse(JSONObject jSONObject, Error error) {
        AVMDLDNSInfo parserResult;
        Locale locale = Locale.US;
        AVMDLLog.d("HTTPDNS", C16880lQ.LLLZI(locale, "****http dns id:%s type:%d host:%s", new Object[]{this.mId, Integer.valueOf(this.mHttpDNSType), this.mHostname}));
        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(this.mHttpDNSType, this.mHostname, (String) null, 0L, this.mId);
        if (error != null) {
            String str = error.errStr;
            aVMDLDNSInfo.mErrorStr = str;
            AVMDLLog.d("HTTPDNS", C16880lQ.LLLZI(locale, "handle response receive err:%s", new Object[]{str}));
        } else if (jSONObject == null || jSONObject.length() == 0) {
            int i = this.mHttpDNSType;
            new Error(i, this.mHostname, this.mId, C16880lQ.LLLZI(locale, "HTTP dns empty, type:%d", new Object[]{Integer.valueOf(i)}));
            AVMDLLog.d("HTTPDNS", C16880lQ.LLLZI(locale, "json null err", new Object[0]));
        } else {
            try {
                parserResult = parserResult(jSONObject);
            } catch (Throwable th) {
                AVMDLLog.d("HTTPDNS", C16880lQ.LLLZI(Locale.US, "handle response exception:%s", new Object[]{th.toString()}));
            }
            if (parserResult == null) {
                AVMDLLog.d("HTTPDNS", C16880lQ.LLLZI(Locale.US, "info null err", new Object[0]));
            } else {
                AVMDLLog.d("HTTPDNS", C16880lQ.LLLZI(Locale.US, "****parse suc for host:%s iplist:%s", new Object[]{this.mHostname, parserResult.mIpList}));
                IPCache.getInstance().put(this.mHostname, parserResult);
                notifySuccess(parserResult);
                return;
            }
        }
        AVMDLLog.d("HTTPDNS", C16880lQ.LLLZI(Locale.US, "****parse failed for host:%s", new Object[]{this.mHostname}));
        notifyError(aVMDLDNSInfo);
    }

    public HTTPDNS(String str, AVMDLNetClient aVMDLNetClient, int i, Handler handler) {
        super(str, aVMDLNetClient, handler);
        this.mHttpDNSType = i;
    }
}
