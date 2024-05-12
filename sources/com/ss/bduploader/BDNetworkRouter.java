package com.ss.bduploader;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.bduploader.smartserver.SmartRouting;
import java.io.File;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class BDNetworkRouter extends BDAbstractUpload implements Handler.Callback {
    public static boolean IsErrored;
    public boolean hasInit;
    public long mEndTime;
    public long mHandle;
    public Handler mHandler;
    public BDNetworkRouterListener mListener;
    public final ReentrantReadWriteLock.ReadLock mReadLock;
    public final ReentrantReadWriteLock mReadWritedLock;
    public SmartRouting mSmartRouting;
    public long mStartTime;
    public final ReentrantReadWriteLock.WriteLock mWriteLock;
    public int mState = -1;
    public int mEstimatedFileSize = -1;

    public static native void _close(long j);

    private final native long _create(int i);

    public static native void _setContext(long j, String str);

    public static native void _setIntValue(long j, int i, int i2);

    public static native void _setStringValue(long j, int i, String str);

    public static native void _start(long j);

    public static native void _stop(long j);

    public void onLogInfo(int i, int i2, String str) {
    }

    private void preloadModel() {
        SmartRouting smartRouting = this.mSmartRouting;
        if (smartRouting != null) {
            smartRouting.preloadEnv();
        }
    }

    public void close() {
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _close(j);
                this.mHandle = 0L;
                this.mState = 5;
                this.mHandler.removeCallbacksAndMessages(null);
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void start() {
        this.mReadLock.lock();
        String str = BDUploadUtil.sdkConfigDir;
        if (str != null && str.length() > 0) {
            setContextDir(BDUploadUtil.sdkConfigDir);
        }
        try {
            if (this.mHandle != 0) {
                this.mState = 1;
                this.mStartTime = System.currentTimeMillis();
                _start(this.mHandle);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void stop() {
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _stop(j);
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public BDNetworkRouter(int i) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWritedLock = reentrantReadWriteLock;
        this.mListener = null;
        if (Looper.myLooper() != null) {
            this.mHandler = new Handler(this);
        } else {
            this.mHandler = new Handler(C16880lQ.LLJJJJ(), this);
        }
        this.mReadLock = reentrantReadWriteLock.readLock();
        this.mWriteLock = reentrantReadWriteLock.writeLock();
        try {
            this.mHandle = _create(i);
        } catch (Throwable unused) {
            this.mHandle = 0L;
        }
        long j = this.mHandle;
        if (j != 0) {
            _setIntValue(j, 421, BDUploadUtil.mEnableNativeLog.booleanValue() ? 1 : 0);
            return;
        }
        throw new Exception("create native network router fail");
    }

    private void checkAndInit(String str) {
        if (this.hasInit) {
            return;
        }
        this.hasInit = true;
        SmartRouting smartRouting = new SmartRouting();
        this.mSmartRouting = smartRouting;
        smartRouting.init();
        this.mSmartRouting.parseUrl(str);
        this.mSmartRouting.configServer();
    }

    private String insertFileSizeInfo(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            jSONObject.put("file_size", (this.mEstimatedFileSize / 1024) / 1024);
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return str;
        }
        return jSONObject.toString();
    }

    private float predictIntelligentTCPQUIC(String str) {
        if (this.mSmartRouting == null) {
            return -1.0f;
        }
        try {
            return this.mSmartRouting.predictSpeedSync(new JSONObject(str));
        } catch (Exception unused) {
            return -1.0f;
        }
    }

    private JSONObject processIntelligentPrediction(float f) {
        JSONObject jSONObject = new JSONObject();
        if (f < 0.0f || f > 1.0f) {
            return null;
        }
        try {
            if (f < 0.5d) {
                jSONObject.put("intelligentRoutingResult", 0);
            } else {
                jSONObject.put("intelligentRoutingResult", 1);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private void setContextDir(String str) {
        if (this.mHandle == 0 || str == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(File.separator);
        LIZ.append(BDUploadUtil.SpeedTestcontextDir);
        String LIZIZ = X1D.LIZIZ(LIZ);
        BDUploadUtil.createDir(LIZIZ);
        _setStringValue(this.mHandle, 418, LIZIZ);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        BDNetworkRouterListener bDNetworkRouterListener = this.mListener;
        if (bDNetworkRouterListener != null) {
            Object obj = message.obj;
            if (obj instanceof BDNetworkRouteInfo) {
                BDNetworkRouteInfo bDNetworkRouteInfo = (BDNetworkRouteInfo) obj;
                bDNetworkRouterListener.onRouteContext(bDNetworkRouteInfo.mContextType, bDNetworkRouteInfo.mSpeed, bDNetworkRouteInfo.mContext);
                return true;
            }
            return true;
        }
        return true;
    }

    public void setAuthType(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 416, i);
    }

    public void setCustomHttpHeaders(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle == 0 || treeMap == null || (mapToString = BDUploadUtil.mapToString(treeMap)) == null) {
            return;
        }
        setStringValue(430, mapToString);
    }

    public void setDataTransportProtocol(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 411, i);
    }

    public void setEnableExternDNS(int i) {
        long j = this.mHandle;
        if (j != 0) {
            if (i != 0 && i != 1) {
                return;
            }
            _setIntValue(j, 21, i);
        }
    }

    public void setEnableHttps(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 19, i);
    }

    public void setFileRetryCount(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 6, i);
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(BDNetworkRouterListener bDNetworkRouterListener) {
        this.mListener = bDNetworkRouterListener;
    }

    public void setMaxFailTime(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 13, i);
    }

    public void setProcessActionType(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 65, i);
    }

    public void setQueryAuth(String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _setStringValue(j, 15, str);
    }

    public void setRWTimeout(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 7, i);
    }

    public void setRegionName(String str) {
        setStringValue(47, str);
    }

    public void setRouteWeight(int i) {
        long j = this.mHandle;
        if (j == 0 || i <= 0) {
            return;
        }
        _setIntValue(j, 408, i);
    }

    public void setSDKConfigDir(String str) {
        if (this.mHandle == 0 || str == null) {
            return;
        }
        BDUploadUtil.createDir(str);
        _setStringValue(this.mHandle, 417, str);
        setContextDir(str);
    }

    public void setServerParameter(String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _setStringValue(j, 16, str);
    }

    public void setSpaceName(String str) {
        setStringValue(45, str);
    }

    public void setTcpOpenTimeOutMilliSec(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 24, i);
    }

    public void setTopAccessKey(String str) {
        setStringValue(42, str);
    }

    public void setTopSecretKey(String str) {
        setStringValue(43, str);
    }

    public void setTopSessionToken(String str) {
        setStringValue(44, str);
    }

    public void setTraceId(String str) {
        if (this.mHandle == 0 || str == null || str.isEmpty()) {
            return;
        }
        _setStringValue(this.mHandle, 69, str);
    }

    public void setTranTimeOutUnit(int i) {
        long j = this.mHandle;
        if (j == 0 || i <= 0) {
            return;
        }
        _setIntValue(j, 64, i);
    }

    public void setUploadDomain(String str) {
        setStringValue(46, str);
    }

    private void setStringValue(int i, String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _setStringValue(j, i, str);
    }

    public int checkNet(int i, int i2) {
        BDNetworkRouterListener bDNetworkRouterListener = this.mListener;
        if (bDNetworkRouterListener != null) {
            return bDNetworkRouterListener.networkRouteCheckNetState(i, i2);
        }
        return 1;
    }

    @Override // com.ss.bduploader.BDAbstractUpload
    public String intelligentInterface(int i, String str) {
        JSONObject processIntelligentPrediction;
        if (i != 0) {
            if (i != 1 || (processIntelligentPrediction = processIntelligentPrediction(predictIntelligentTCPQUIC(insertFileSizeInfo(str)))) == null) {
                return "";
            }
            return processIntelligentPrediction.toString();
        }
        checkAndInit(str);
        preloadModel();
        return "";
    }

    public void setNetworkType(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, i, i2);
    }

    public void onNotify(int i, long j, int i2, String str) {
        BDNetworkRouteInfo bDNetworkRouteInfo = new BDNetworkRouteInfo(str, i, (int) j);
        Handler handler = this.mHandler;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = i;
            obtainMessage.obj = bDNetworkRouteInfo;
            obtainMessage.sendToTarget();
        }
    }
}
