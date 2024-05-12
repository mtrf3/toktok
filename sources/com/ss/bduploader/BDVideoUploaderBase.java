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
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class BDVideoUploaderBase extends BDAbstractUpload implements Handler.Callback {
    public int headerIndex;
    public long mEndTime;
    public long mHandle;
    public Handler mHandler;
    public String[] mHeaders;
    public JSONObject mJsonInfo;
    public final ReentrantReadWriteLock.ReadLock mReadLock;
    public long mStartTime;
    public int mState;
    public final ReentrantReadWriteLock.WriteLock mWriteLock;
    public final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    public BDVideoUploaderListener mListener = null;
    public BDVideoUploaderAbstractListener mAbstractListener = null;
    public Lock mHeadersLock = new ReentrantLock();
    public boolean mFinish = false;
    public boolean mEnableVideoPatch = false;

    public static native void _cancelUpload(long j);

    public static native void _close(long j);

    private final native long _create();

    public static native long _getLongValue(long j, int i);

    public static native String _getStrByKeyAndIndex(long j, int i, int i2);

    public static native String _getStringValue(long j, int i);

    public static native void _mergeUpload(long j);

    public static native void _setContext(long j, String str);

    public static native void _setFilePaths(long j, int i, String[] strArr);

    public static native void _setInt64Value(long j, int i, long j2);

    public static native void _setIntValue(long j, int i, int i2);

    public static native void _setObject(long j, int i, Object obj);

    public static native void _setPoster(long j, float f);

    public static native void _setStringValue(long j, int i, String str);

    public static native void _start(long j);

    public static native void _stop(long j);

    private void setEnableBatch() {
        this.mEnableVideoPatch = true;
        _setIntValue(this.mHandle, 304, 1);
    }

    private void parseLog() {
        if (this.mFinish) {
            return;
        }
        this.mFinish = true;
        addLogToManager(_getStringValue(this.mHandle, 100));
    }

    public void allowMergeUpload() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _mergeUpload(j);
    }

    public void close() {
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _stop(j);
                parseLog();
                _close(this.mHandle);
                this.mHandle = 0L;
                this.mState = 5;
                this.mHandler.removeCallbacksAndMessages(null);
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void start() {
        this.mWriteLock.lock();
        String str = BDUploadUtil.sdkConfigDir;
        if (str != null && str.length() > 0) {
            setContextDir(BDUploadUtil.sdkConfigDir);
            setDiskResumeDir(BDUploadUtil.sdkConfigDir);
            setRetryStatesDir(BDUploadUtil.sdkConfigDir);
        }
        try {
            if (this.mHandle != 0) {
                this.mFinish = false;
                this.mState = 1;
                this.mStartTime = System.currentTimeMillis();
                _start(this.mHandle);
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void stop() {
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _stop(j);
                String dnsip = getDNSIP();
                if (dnsip != null && !dnsip.isEmpty()) {
                    setStringValue(75, dnsip);
                }
                parseLog();
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public BDVideoUploaderBase() {
        this.mState = -1;
        try {
            this.mHandle = _create();
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
            this.mHeaders = new String[20];
            int i = 0;
            do {
                this.mHeaders[i] = null;
                i++;
            } while (i < 20);
            this.headerIndex = 0;
            setTraceId(UUID.randomUUID().toString());
            _setIntValue(this.mHandle, 429, BDUploadUtil.xquicAvalilable() ? 1 : 0);
            setBatchVideoId();
            return;
        }
        throw new Exception("create native uploader fail:" + ((Object) BDAbstractUpload.mErrorMsg));
    }

    private void setBatchVideoId() {
        String uuid = UUID.randomUUID().toString();
        if (uuid != null && uuid.length() > 0) {
            _setStringValue(this.mHandle, 420, uuid);
        }
    }

    public String getDNSIP() {
        return BDUploadUtil.getDNSServerIP();
    }

    /* loaded from: classes8.dex */
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

    private void setDiskResumeDir(String str) {
        if (this.mHandle == 0 || str == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(File.separator);
        LIZ.append(BDUploadUtil.DiskResumeConfigDir);
        String LIZIZ = X1D.LIZIZ(LIZ);
        BDUploadUtil.createDir(LIZIZ);
        _setStringValue(this.mHandle, 303, LIZIZ);
    }

    private void setRetryStatesDir(String str) {
        if (this.mHandle == 0 || str == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(File.separator);
        LIZ.append(BDUploadUtil.RetryStatesInfoDir);
        String LIZIZ = X1D.LIZIZ(LIZ);
        BDUploadUtil.createDir(LIZIZ);
        _setStringValue(this.mHandle, 433, LIZIZ);
    }

    public JSONObject addLogToManager(String str) {
        JSONObject jSONObject;
        String uuid = UUID.randomUUID().toString();
        JSONArray jSONArray = null;
        try {
            jSONObject = new JSONObject(str);
            jSONObject.put("dns_version", BDUploadResolver.mDNSVersion);
            jSONObject.put("main_dns_type", BDUploadDNSParser.mGlobalMainType);
            jSONObject.put("main_back_type", BDUploadDNSParser.mGlobalBackType);
            jSONObject.put("back_delayed_time", BDUploadDNSParser.mGlobalBackUpDelayedTime);
            jSONObject.put("expired_time", BDUploadDNSParser.mGlobalDefaultExpiredTime);
            JSONObject jSONObject2 = this.mJsonInfo;
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, this.mJsonInfo.get(next));
                }
            }
            String str2 = "";
            try {
                this.mHeadersLock.lock();
                for (int i = 0; i < 20; i++) {
                    if (!TextUtils.isEmpty(this.mHeaders[i])) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(str2);
                        LIZ.append("#");
                        LIZ.append(this.mHeaders[i]);
                        str2 = X1D.LIZIZ(LIZ);
                    }
                }
                this.mHeadersLock.unlock();
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("cdn_headers", str2);
                }
            } catch (Throwable th) {
                this.mHeadersLock.unlock();
                throw th;
            }
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            try {
                Object obj = jSONObject.get("video_array");
                if (obj instanceof JSONArray) {
                    jSONArray = (JSONArray) obj;
                    jSONObject.remove("video_array");
                }
                int i2 = JSONObjectProtectorUtils.getInt(jSONObject, "file_num");
                for (int i3 = 0; i3 < i2; i3++) {
                    JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
                    jSONObject3.remove("event");
                    jSONObject3.put("event", "bd_video_upload");
                    if (jSONArray != null && jSONArray.length() > i3) {
                        JSONObject jSONObject4 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i3);
                        Iterator<String> keys2 = jSONObject4.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            jSONObject3.put(next2, jSONObject4.get(next2));
                        }
                    }
                    jSONObject3.put("uuid", uuid);
                    UploadEventManager.instance.addEvent(jSONObject3);
                }
                return jSONObject;
            } catch (Exception unused2) {
            }
        }
        UploadEventManager.instance.addEvent(jSONObject);
        return jSONObject;
    }

    @Override // com.ss.bduploader.BDAbstractUpload
    public String getStringFromExtern(int i) {
        if (i != 0) {
            if (i == 1) {
                return UUID.randomUUID().toString();
            }
        } else {
            BDVideoUploaderListener bDVideoUploaderListener = this.mListener;
            if (bDVideoUploaderListener != null) {
                return bDVideoUploaderListener.getStringFromExtern(i);
            }
        }
        return null;
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
        BDVideoUploaderListener bDVideoUploaderListener = this.mListener;
        if (bDVideoUploaderListener == null) {
            return true;
        }
        BDVideoInfo bDVideoInfo = (BDVideoInfo) obj;
        if (bDVideoInfo != null) {
            j = bDVideoInfo.mProgress;
        } else {
            j = 0;
        }
        bDVideoUploaderListener.onNotify(i, j, bDVideoInfo);
        return true;
    }

    public void setAbstractListener(BDVideoUploaderAbstractListener bDVideoUploaderAbstractListener) {
        this.mAbstractListener = bDVideoUploaderAbstractListener;
    }

    public void setAliveMaxFailTime(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 22, i);
    }

    public void setCustomHttpHeaders(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle == 0 || treeMap == null || (mapToString = BDUploadUtil.mapToString(treeMap)) == null) {
            return;
        }
        setStringValue(430, mapToString);
    }

    public void setDiskResumeOption(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 302, i);
    }

    public void setDiskResumeUniqueKey(String str) {
        if (this.mHandle == 0 || str == null || str.isEmpty()) {
            return;
        }
        _setStringValue(this.mHandle, 301, str);
    }

    public void setEnableBigFile(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 83, i);
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

    public void setEnableFiletryHttps(int i) {
        long j = this.mHandle;
        if (j != 0) {
            if (i != 0 && i != 1) {
                return;
            }
            _setIntValue(j, 25, i);
        }
    }

    public void setEnableHttps(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 19, i);
    }

    public void setEnableKeepAlive(int i) {
        long j = this.mHandle;
        if (j != 0) {
            if (i != 0 && i != 1) {
                return;
            }
            _setIntValue(j, 20, i);
        }
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

    public void setListener(BDVideoUploaderListener bDVideoUploaderListener) {
        this.mListener = bDVideoUploaderListener;
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

    public void setMaxUploadSpeedThresh(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 413, i);
    }

    public void setMediaDataReader(BDMediaDataReader bDMediaDataReader) {
        long j = this.mHandle;
        if (j == 0 || bDMediaDataReader == null) {
            return;
        }
        _setIntValue(j, 81, 2);
        _setObject(this.mHandle, 201, bDMediaDataReader);
    }

    public void setObjectType(String str) {
        if (this.mHandle == 0 || str == null || str.equals("")) {
            return;
        }
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

    public void setPathName(String str) {
        setStringValue(0, str);
    }

    public void setPoster(float f) {
        long j = this.mHandle;
        if (j == 0 || f < 0.0f) {
            return;
        }
        _setPoster(j, f);
    }

    public void setPreUploadEncryptionMode(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 74, i);
    }

    public void setRWTimeout(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 7, i);
    }

    public void setResponseTimeOut(int i) {
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            return;
        }
        _setIntValue(j, 76, i);
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

    public void setSliceReTryCount(int i) {
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
        if (this.mHandle == 0 || str == null) {
            return;
        }
        setStringValue(46, str);
    }

    public int checkNet(int i, int i2) {
        BDVideoUploaderListener bDVideoUploaderListener = this.mListener;
        if (bDVideoUploaderListener == null) {
            return 1;
        }
        return bDVideoUploaderListener.videoUploadCheckNetState(i, i2);
    }

    public void setExternFileReader(BDMultiExternalFileReader bDMultiExternalFileReader, int i) {
        if (this.mHandle == 0 || bDMultiExternalFileReader == null || i <= 0) {
            return;
        }
        setEnableBatch();
        _setIntValue(this.mHandle, 71, i);
        _setIntValue(this.mHandle, 81, 1);
        _setObject(this.mHandle, 200, bDMultiExternalFileReader);
    }

    public void setFilePath(int i, String[] strArr) {
        if (this.mHandle == 0 || strArr == null || i <= 0) {
            return;
        }
        setEnableBatch();
        _setFilePaths(this.mHandle, i, strArr);
        _setIntValue(this.mHandle, 81, 0);
    }

    public void setStringValue(int i, String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _setStringValue(j, i, str);
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
        JSONObject jSONObject;
        if (i == 102) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.mHeadersLock.lock();
                    if (this.headerIndex >= 20) {
                        this.headerIndex = 0;
                    }
                    String[] strArr = this.mHeaders;
                    int i3 = this.headerIndex;
                    strArr[i3] = str;
                    this.headerIndex = i3 + 1;
                    return;
                } finally {
                    this.mHeadersLock.unlock();
                }
            }
        } else {
            if (i == 104) {
                if (this.mAbstractListener != null) {
                    new HashMap(20);
                    try {
                        JSONObject jSONObject2 = new JSONObject(str);
                        JSONObject jSONObject3 = this.mJsonInfo;
                        if (jSONObject3 != null) {
                            Iterator<String> keys = jSONObject3.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                jSONObject2.put(next, this.mJsonInfo.get(next));
                            }
                        }
                        BDUploadUtil.jsonToHashMap(jSONObject2);
                        return;
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                        return;
                    }
                }
                return;
            }
            if (i == 103) {
                long time = new Date().getTime() / 1000;
                BDVideoUploaderListener bDVideoUploaderListener = this.mListener;
                if (bDVideoUploaderListener != null) {
                    bDVideoUploaderListener.onUploadVideoStage(i2, time);
                }
            } else if (i == 107) {
                try {
                    jSONObject = new JSONObject(str);
                } catch (Exception unused) {
                    jSONObject = null;
                }
                UploadEventManager.instance.addEvent(jSONObject);
                BDVideoUploaderAbstractListener bDVideoUploaderAbstractListener = this.mAbstractListener;
                if (bDVideoUploaderAbstractListener != null) {
                    bDVideoUploaderAbstractListener.onEventLog();
                }
            }
        }
        BDVideoUploaderListener bDVideoUploaderListener2 = this.mListener;
        if (bDVideoUploaderListener2 != null) {
            bDVideoUploaderListener2.onLog(i, i2, str);
        }
    }

    public void onNotify(int i, long j, int i2, String str) {
        BDVideoInfo bDVideoInfo;
        if (this.mState != 1) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 50) {
                            if (i != 120) {
                                if (i != 121) {
                                    switch (i) {
                                        case 8:
                                            int i3 = (int) j;
                                            bDVideoInfo = new BDVideoInfo(_getStrByKeyAndIndex(this.mHandle, 10, i3), _getStrByKeyAndIndex(this.mHandle, 12, i3), j, i2, null, _getStrByKeyAndIndex(this.mHandle, 300, i3), _getStrByKeyAndIndex(this.mHandle, 68, i3), _getStrByKeyAndIndex(this.mHandle, 407, i3), _getStrByKeyAndIndex(this.mHandle, 1002, i3));
                                            break;
                                        case 9:
                                            bDVideoInfo = new BDVideoInfo(null, null, j, i2, str, null, null, null, null);
                                            break;
                                        case 10:
                                            parseLog();
                                            bDVideoInfo = new BDVideoInfo(null, null, j, null, null, null, null);
                                            this.mState = 3;
                                            break;
                                        default:
                                            bDVideoInfo = null;
                                            break;
                                    }
                                } else {
                                    String dnsip = getDNSIP();
                                    if (dnsip != null && !dnsip.isEmpty()) {
                                        setStringValue(75, dnsip);
                                    }
                                    bDVideoInfo = new BDVideoInfo(null, null, j, _getStringValue(this.mHandle, 415), _getStringValue(this.mHandle, 14), null, null);
                                    parseLog();
                                    this.mState = 2;
                                }
                            }
                        }
                    } else {
                        parseLog();
                        bDVideoInfo = new BDVideoInfo(null, null, j, null, _getStringValue(this.mHandle, 14), null, null);
                    }
                } else {
                    String dnsip2 = getDNSIP();
                    if (dnsip2 != null && !dnsip2.isEmpty()) {
                        setStringValue(75, dnsip2);
                    }
                    bDVideoInfo = new BDVideoInfo(null, null, j, _getStringValue(this.mHandle, 415), _getStringValue(this.mHandle, 14), null, null);
                    parseLog();
                    this.mState = 2;
                }
                Message obtainMessage = this.mHandler.obtainMessage();
                obtainMessage.what = i;
                obtainMessage.obj = bDVideoInfo;
                obtainMessage.sendToTarget();
            }
            if (this.mEnableVideoPatch) {
                bDVideoInfo = new BDVideoInfo(null, null, j, i2, null, null, null, null, null);
            } else {
                bDVideoInfo = new BDVideoInfo(null, null, j, null, null, null, null);
            }
            Message obtainMessage2 = this.mHandler.obtainMessage();
            obtainMessage2.what = i;
            obtainMessage2.obj = bDVideoInfo;
            obtainMessage2.sendToTarget();
        }
        this.mEndTime = System.currentTimeMillis();
        bDVideoInfo = new BDVideoInfo(_getStringValue(this.mHandle, 10), _getStringValue(this.mHandle, 12), j, null, _getStringValue(this.mHandle, 300), _getStringValue(this.mHandle, 68), _getStringValue(this.mHandle, 407), _getStringValue(this.mHandle, 1002));
        String dnsip3 = getDNSIP();
        if (dnsip3 != null && !dnsip3.isEmpty()) {
            setStringValue(75, dnsip3);
        }
        parseLog();
        this.mState = 3;
        Message obtainMessage22 = this.mHandler.obtainMessage();
        obtainMessage22.what = i;
        obtainMessage22.obj = bDVideoInfo;
        obtainMessage22.sendToTarget();
    }
}
