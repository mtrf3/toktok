package com.ss.bduploader;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.bduploader.net.BDUploadDNSParser;
import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class BDObjectUploader extends BDAbstractUpload implements Handler.Callback {
    public long mEndTime;
    public long mHandle;
    public Handler mHandler;
    public int mObjectNum;
    public final ReentrantReadWriteLock.ReadLock mReadLock;
    public long mStartTime;
    public int mState;
    public final ReentrantReadWriteLock.WriteLock mWriteLock;
    public final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    public BDObjectUploaderListener mListener = null;
    public BDObjectUploaderAbstractListener mAbstractListener = null;

    public static native void _allowContinueUpload(long j);

    public static native void _cancelUpload(long j);

    public static native void _close(long j);

    private final native long _create(int i);

    public static native long _getLongValue(long j, int i);

    public static native String _getStrByKeyAndIndex(long j, int i, int i2);

    public static native String _getStringValue(long j, int i);

    public static native void _mergeUpload(long j);

    public static native void _setFileData(long j, int i, byte[][] bArr);

    public static native void _setFileName(long j, int i, String[] strArr);

    public static native void _setFileNum(long j, int i);

    public static native void _setFilePaths(long j, int i, String[] strArr);

    public static native void _setFileStoreKeys(long j, int i, String[] strArr);

    public static native void _setInt64Value(long j, int i, long j2);

    public static native void _setIntValue(long j, int i, int i2);

    public static native void _setObject(long j, int i, Object obj);

    public static native void _setStringValue(long j, int i, String str);

    public static native void _start(long j);

    public static native void _stop(long j);

    private void allowMergeUpload() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _mergeUpload(j);
    }

    private void cancelUpload() {
        this.mWriteLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.mWriteLock.unlock();
        } else {
            _cancelUpload(j);
            this.mWriteLock.unlock();
        }
    }

    public void allowContinueUpload() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _allowContinueUpload(j);
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
                addLogToManager(_getStringValue(this.mHandle, 100));
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public BDObjectUploader() {
        this.mState = -1;
        try {
            this.mHandle = _create(2);
        } catch (Throwable unused) {
            this.mHandle = 0L;
        }
        long j = this.mHandle;
        if (j != 0) {
            _setIntValue(j, 421, BDUploadUtil.mEnableNativeLog.booleanValue() ? 1 : 0);
            if (Looper.myLooper() != null) {
                this.mHandler = new Handler(this);
            } else {
                this.mHandler = new Handler(C16880lQ.LLJJJJ(), this);
            }
            this.mReadLock = this.mReadWritedLock.readLock();
            this.mWriteLock = this.mReadWritedLock.writeLock();
            this.mState = 0;
            getDNSIP();
            return;
        }
        throw new Exception("create native uploader fail");
    }

    public String getDNSIP() {
        return BDUploadUtil.getDNSServerIP();
    }

    /* loaded from: classes7.dex */
    public static class LogInfo {
        public int code;
        public String info;

        public int getCode() {
            return this.code;
        }

        public String getInfo() {
            return this.info;
        }

        public LogInfo(int i, String str) {
            this.code = i;
            this.info = str;
        }
    }

    public static boolean isError() {
        return BDAbstractUpload.IsErrored;
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

    private void setPreUploadEncryptionMode(int i) {
        String uuid;
        if (this.mHandle == 0) {
            return;
        }
        if (i == 2 && (uuid = UUID.randomUUID().toString()) != null && uuid.length() > 0) {
            _setStringValue(this.mHandle, 420, uuid);
        }
        _setIntValue(this.mHandle, 74, i);
    }

    public void SetExtraParams(JSONObject jSONObject) {
        if (this.mHandle == 0 || jSONObject == null) {
            return;
        }
        setStringValue(61, jSONObject.toString());
    }

    public void addLogToManager(String str) {
        JSONObject jSONObject;
        String uuid = UUID.randomUUID().toString();
        if (uuid == null || uuid.length() <= 0) {
            uuid = "invalid_uuid";
        }
        try {
            jSONObject = new JSONObject(str);
            jSONObject.put("dns_version", BDUploadResolver.mDNSVersion);
            jSONObject.put("main_dns_type", BDUploadDNSParser.mGlobalMainType);
            jSONObject.put("main_back_type", BDUploadDNSParser.mGlobalBackType);
            jSONObject.put("back_delayed_time", BDUploadDNSParser.mGlobalBackUpDelayedTime);
            jSONObject.put("expired_time", BDUploadDNSParser.mGlobalDefaultExpiredTime);
            jSONObject.put("uuid", uuid);
            jSONObject.remove("event");
            jSONObject.put("event", "bd_image_upload_all");
            try {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "image_array");
                if (jSONArray != null) {
                    jSONObject.remove("image_array");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                        jSONObject2.remove("event");
                        jSONObject2.put("event", "bd_image_upload_single");
                        JSONObject jSONObject3 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                        Iterator<String> keys = jSONObject3.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject2.put(next, jSONObject3.get(next));
                        }
                        jSONObject2.put("uuid", uuid);
                        UploadEventManager.instance.addEvent(jSONObject2);
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            jSONObject = null;
        }
        UploadEventManager.instance.addEvent(jSONObject);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        long j;
        int i = message.what;
        Object obj = message.obj;
        if (obj instanceof LogInfo) {
            LogInfo logInfo = (LogInfo) obj;
            onLogInfoSync(i, logInfo.getCode(), logInfo.getInfo());
            return true;
        }
        BDObjectUploaderListener bDObjectUploaderListener = this.mListener;
        if (bDObjectUploaderListener == null) {
            return true;
        }
        BDObjectInfo bDObjectInfo = (BDObjectInfo) obj;
        if (bDObjectInfo != null) {
            j = bDObjectInfo.mProgress;
        } else {
            j = 0;
        }
        bDObjectUploaderListener.onNotify(i, j, bDObjectInfo);
        return true;
    }

    public void setAbstractListener(BDObjectUploaderAbstractListener bDObjectUploaderAbstractListener) {
        this.mAbstractListener = bDObjectUploaderAbstractListener;
    }

    public void setAuthType(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 416, i);
    }

    public void setConfig(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle == 0 || treeMap == null || (mapToString = BDUploadUtil.mapToString(treeMap)) == null) {
            return;
        }
        setStringValue(56, mapToString);
    }

    public void setCustomConfig(TreeMap<String, Object> treeMap) {
        JSONObject mapToJSON;
        if (this.mHandle == 0 || treeMap == null || (mapToJSON = BDUploadUtil.mapToJSON(treeMap)) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("custom_config", mapToJSON);
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                return;
            }
            setStringValue(63, jSONObject2);
        } catch (Throwable unused) {
        }
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

    public void setEnableCommitUpload(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 401, z ? 1 : 0);
    }

    public void setEnableHttps(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 19, i);
    }

    public void setEnableLogCallBack(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        if (z) {
            _setIntValue(j, 78, 1);
        } else {
            _setIntValue(j, 78, 0);
        }
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

    public void setListener(BDObjectUploaderListener bDObjectUploaderListener) {
        this.mListener = bDObjectUploaderListener;
    }

    public void setMaxConcurrentFileNum(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, LiveChatShowDelayForHotLiveSetting.DEFAULT, i);
    }

    public void setMaxFailTime(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 13, i);
    }

    public void setObjectType(String str) {
        setStringValue(54, str);
    }

    public void setOpenBoe(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        if (z) {
            _setIntValue(j, 67, 1);
        } else {
            _setIntValue(j, 67, 0);
        }
    }

    public void setPolicyParams(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle == 0 || treeMap == null || (mapToString = BDUploadUtil.mapToString(treeMap)) == null) {
            return;
        }
        setStringValue(55, mapToString);
    }

    public void setPreUpload(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 80, z ? 1 : 0);
    }

    public void setPreheatUploader(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 419, z ? 1 : 0);
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

    public void setSDKConfigDir(String str) {
        if (this.mHandle == 0 || str == null) {
            return;
        }
        BDUploadUtil.createDir(str);
        _setStringValue(this.mHandle, 417, str);
        setContextDir(str);
    }

    public void setSDKMaxRetryCount(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 426, i);
    }

    public void setSDKMaxRetryTimeout(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 428, i);
    }

    public void setScenesTag(String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _setStringValue(j, 85, str);
    }

    public void setServerParameter(String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _setStringValue(j, 16, str);
    }

    public void setSliceRetryCount(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 5, i);
    }

    public void setSliceSize(int i) {
        long j = this.mHandle;
        if (j == 0 || i <= 0) {
            return;
        }
        _setIntValue(j, 8, i);
    }

    public void setSliceThreshold(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 402, i);
    }

    public void setSocketNum(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 9, i);
    }

    public void setSpaceName(String str) {
        setStringValue(45, str);
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
        if (this.mHandle == 0 || str == null) {
            return;
        }
        setStringValue(46, str);
    }

    public int checkNet(int i, int i2) {
        BDObjectUploaderListener bDObjectUploaderListener = this.mListener;
        if (bDObjectUploaderListener != null) {
            return bDObjectUploaderListener.objectUploadCheckNetState(i, i2);
        }
        return 1;
    }

    public void setFileData(int i, byte[][] bArr) {
        long j = this.mHandle;
        if (j == 0 || bArr == null || i <= 0) {
            return;
        }
        _setFileData(j, i, bArr);
    }

    public void setFileName(int i, String[] strArr) {
        long j = this.mHandle;
        if (j == 0 || strArr == null || i <= 0) {
            return;
        }
        _setFileName(j, i, strArr);
    }

    public void setFilePath(int i, String[] strArr) {
        long j = this.mHandle;
        if (j == 0 || strArr == null || i <= 0) {
            return;
        }
        this.mObjectNum = i;
        _setFilePaths(j, i, strArr);
        _setIntValue(this.mHandle, 81, 0);
    }

    public void setMediaDataReader(BDMediaDataReader bDMediaDataReader, int i) {
        long j = this.mHandle;
        if (j == 0 || bDMediaDataReader == null || i <= 0) {
            return;
        }
        _setIntValue(j, 71, i);
        _setIntValue(this.mHandle, 81, 2);
        _setObject(this.mHandle, 201, bDMediaDataReader);
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

    private void setMediaDataReader(BDMediaDataReader bDMediaDataReader, int i, int i2) {
        if (this.mHandle == 0 || bDMediaDataReader == null || i <= 0) {
            return;
        }
        setMediaDataReader(bDMediaDataReader, i);
        _setIntValue(this.mHandle, 81, i2);
    }

    public void onLogInfo(int i, int i2, String str) {
        if (this.mState != 1) {
            return;
        }
        LogInfo logInfo = new LogInfo(i2, str);
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = i;
        obtainMessage.obj = logInfo;
        obtainMessage.sendToTarget();
    }

    public void onLogInfoSync(int i, int i2, String str) {
        if (this.mListener != null) {
            if (i == 103) {
                long time = new Date().getTime();
                BDObjectUploaderAbstractListener bDObjectUploaderAbstractListener = this.mAbstractListener;
                if (bDObjectUploaderAbstractListener != null) {
                    bDObjectUploaderAbstractListener.onUploadStage(i2, time);
                }
            }
            this.mListener.onLog(i, i2, str);
        }
    }

    public void onNotify(int i, long j, int i2, String str) {
        BDObjectInfo bDObjectInfo;
        if (this.mState != 1) {
            return;
        }
        int i3 = (int) j;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 6) {
                            if (i == 7) {
                                bDObjectInfo = new BDObjectInfo(null, i2, i3, null, null);
                            }
                        } else {
                            this.mEndTime = System.currentTimeMillis();
                            bDObjectInfo = new BDObjectInfo(_getStrByKeyAndIndex(this.mHandle, 409, i3), 0L, i3, _getStrByKeyAndIndex(this.mHandle, 410, i3), _getStrByKeyAndIndex(this.mHandle, 407, i3));
                        }
                    } else {
                        addLogToManager(_getStringValue(this.mHandle, 100));
                        this.mState = 2;
                    }
                } else {
                    String dnsip = getDNSIP();
                    if (dnsip != null && !dnsip.isEmpty()) {
                        setStringValue(75, dnsip);
                    }
                    addLogToManager(_getStringValue(this.mHandle, 100));
                    this.mState = 2;
                }
            } else {
                bDObjectInfo = new BDObjectInfo(null, i2, i3, null, null);
            }
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.what = i;
            obtainMessage.obj = bDObjectInfo;
            obtainMessage.sendToTarget();
        }
        String dnsip2 = getDNSIP();
        if (dnsip2 != null && !dnsip2.isEmpty()) {
            setStringValue(75, dnsip2);
        }
        addLogToManager(_getStringValue(this.mHandle, 100));
        this.mState = 3;
        bDObjectInfo = null;
        Message obtainMessage2 = this.mHandler.obtainMessage();
        obtainMessage2.what = i;
        obtainMessage2.obj = bDObjectInfo;
        obtainMessage2.sendToTarget();
    }

    public void setCustomNetworkTimeoutParams(int i, int i2, int i3, int i4, int i5) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 422, i);
        _setIntValue(this.mHandle, 423, i2);
        _setIntValue(this.mHandle, 424, i3);
        _setIntValue(this.mHandle, 425, i4);
        _setIntValue(this.mHandle, 427, i5);
    }
}
