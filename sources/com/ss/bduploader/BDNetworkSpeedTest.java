package com.ss.bduploader;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.bduploader.smartserver.SmartProtocol;
import com.ss.bduploader.smartserver.SmartSpeedTest;
import java.io.File;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class BDNetworkSpeedTest extends BDAbstractUpload implements Handler.Callback {
    public int hasInit;
    public int mEnableIntelligentProtocol;
    public int mEnableIntelligentSpeedTest;
    public long mEndTime;
    public long mHandle;
    public Handler mHandler;
    public BDNetworkSpeedTestListener mListener;
    public final ReentrantReadWriteLock.ReadLock mReadLock;
    public final ReentrantReadWriteLock mReadWritedLock;
    public SmartProtocol mSmartProtocol;
    public SmartSpeedTest mSmartSpeedTest;
    public long mStartTime;
    public final ReentrantReadWriteLock.WriteLock mWriteLock;
    public int mState = -1;
    public String mIntelligentModelURL = "";
    public String mIntelligentProtocolModelURL = "";

    public static native void _close(long j);

    private final native long _create();

    public static native void _setIntValue(long j, int i, int i2);

    public static native void _setStringValue(long j, int i, String str);

    public static native void _start(long j);

    public static native void _stop(long j);

    public void onLogInfo(int i, int i2, String str) {
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

    public BDNetworkSpeedTest() {
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
            this.mHandle = _create();
        } catch (Throwable unused) {
            this.mHandle = 0L;
        }
        long j = this.mHandle;
        if (j != 0) {
            _setIntValue(j, 421, BDUploadUtil.mEnableNativeLog.booleanValue() ? 1 : 0);
            return;
        }
        throw new Exception("create native speed tester fail");
    }

    private int predictIntelligentProtocol(JSONObject jSONObject) {
        SmartProtocol smartProtocol = this.mSmartProtocol;
        if (smartProtocol == null) {
            return -1;
        }
        return smartProtocol.predictClassificationSync(jSONObject);
    }

    private float predictIntelligentSpeed(JSONObject jSONObject) {
        SmartSpeedTest smartSpeedTest = this.mSmartSpeedTest;
        if (smartSpeedTest == null) {
            return -1.0f;
        }
        return smartSpeedTest.predictSpeedSync(jSONObject);
    }

    private void preloadModel(int i) {
        SmartProtocol smartProtocol;
        if (i != 0) {
            if (i != 1 || (smartProtocol = this.mSmartProtocol) == null) {
                return;
            }
            smartProtocol.preloadEnv();
            return;
        }
        SmartSpeedTest smartSpeedTest = this.mSmartSpeedTest;
        if (smartSpeedTest == null) {
            return;
        }
        smartSpeedTest.preloadEnv();
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
        BDNetworkSpeedTestListener bDNetworkSpeedTestListener = this.mListener;
        if (bDNetworkSpeedTestListener != null) {
            Object obj = message.obj;
            if (obj instanceof BDNetworkSpeedTestInfo) {
                BDNetworkSpeedTestInfo bDNetworkSpeedTestInfo = (BDNetworkSpeedTestInfo) obj;
                bDNetworkSpeedTestListener.onSpeedTestContext(bDNetworkSpeedTestInfo.mContextType, bDNetworkSpeedTestInfo.mSpeed, bDNetworkSpeedTestInfo.mContext);
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

    public void setListener(BDNetworkSpeedTestListener bDNetworkSpeedTestListener) {
        this.mListener = bDNetworkSpeedTestListener;
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

    private void checkAndInit(String str, int i) {
        int i2 = 1 << i;
        int i3 = this.hasInit;
        if ((i2 & i3) == 1) {
            return;
        }
        this.hasInit = i2 | i3;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                return;
            }
            SmartProtocol smartProtocol = new SmartProtocol();
            this.mSmartProtocol = smartProtocol;
            smartProtocol.init();
            this.mSmartProtocol.setUrl(str);
            this.mSmartProtocol.configServer();
            return;
        }
        SmartSpeedTest smartSpeedTest = new SmartSpeedTest();
        this.mSmartSpeedTest = smartSpeedTest;
        smartSpeedTest.init();
        this.mSmartSpeedTest.setUrl(str);
        this.mSmartSpeedTest.configServer();
    }

    public int checkNet(int i, int i2) {
        BDNetworkSpeedTestListener bDNetworkSpeedTestListener = this.mListener;
        if (bDNetworkSpeedTestListener != null) {
            return bDNetworkSpeedTestListener.speedTestCheckNetState(i, i2);
        }
        return 1;
    }

    @Override // com.ss.bduploader.BDAbstractUpload
    public String intelligentInterface(int i, String str) {
        int i2;
        int predictIntelligentProtocol;
        JSONObject jSONObject = new JSONObject();
        if (i == 3 || i == 5 || i == 6) {
            if (i == 3 || i == 6) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            SmartSpeedTest smartSpeedTest = this.mSmartSpeedTest;
            if (smartSpeedTest == null) {
                return "";
            }
            smartSpeedTest.setSpeedTestUseVCN(i2);
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                if (this.mEnableIntelligentSpeedTest == 1) {
                    float predictIntelligentSpeed = predictIntelligentSpeed(jSONObject2);
                    if (predictIntelligentSpeed > 0.0f) {
                        jSONObject.put("intelligentTestResult", predictIntelligentSpeed);
                    }
                }
                if (this.mEnableIntelligentProtocol == 1 && this.mSmartProtocol != null && (predictIntelligentProtocol = predictIntelligentProtocol(jSONObject2)) >= 0) {
                    jSONObject.put("intelligentProtocolResult", predictIntelligentProtocol);
                }
            } catch (Exception unused) {
                jSONObject = null;
            }
        }
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.toString();
    }

    public void setIntelligentProtocolInfo(int i, String str) {
        if (this.mHandle == 0 || str == null) {
            return;
        }
        this.mEnableIntelligentProtocol = i;
        this.mIntelligentProtocolModelURL = str;
        if (i == 1) {
            checkAndInit(str, 1);
            preloadModel(1);
        }
        _setIntValue(this.mHandle, 444, i);
    }

    public void setIntelligentSpeedTestInfo(int i, String str) {
        if (this.mHandle == 0 || str == null) {
            return;
        }
        this.mEnableIntelligentSpeedTest = i;
        this.mIntelligentModelURL = str;
        if (i == 1) {
            checkAndInit(str, 0);
            preloadModel(0);
        }
        _setIntValue(this.mHandle, 431, i);
    }

    public void setNetworkType(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, i, i2);
    }

    public void setStringValue(int i, String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _setStringValue(j, i, str);
    }

    public void onNotify(int i, long j, int i2, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "upload_log");
        } catch (Exception unused) {
            jSONObject = null;
        }
        UploadEventManager.instance.addEvent(jSONObject);
        BDNetworkSpeedTestInfo bDNetworkSpeedTestInfo = new BDNetworkSpeedTestInfo(str, i, (int) j);
        Handler handler = this.mHandler;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = i;
            obtainMessage.obj = bDNetworkSpeedTestInfo;
            obtainMessage.sendToTarget();
        }
    }
}
