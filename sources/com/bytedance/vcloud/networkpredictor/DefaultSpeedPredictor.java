package com.bytedance.vcloud.networkpredictor;

import X.C16880lQ;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class DefaultSpeedPredictor implements ISpeedPredictor, Handler.Callback {
    public ReentrantReadWriteLock lock;
    public long mHandle;
    public Handler mSpeedUpdateHander;
    public final ReentrantReadWriteLock.ReadLock readLock;
    public Thread subThread;
    public final ReentrantReadWriteLock.WriteLock writeLock;

    private native void _close(long j);

    private native long _create(int i);

    private native float _getAverageDownloadSpeed(long j, int i, int i2, boolean z);

    private native double _getDoubleValue(long j, int i, double d);

    private native Map<String, String> _getDownloadSpeed(long j, int i);

    private native int _getIntValue(long j, int i, int i2);

    private native float _getLastPredictConfidence(long j);

    private native long _getLongValue(long j, int i, long j2);

    private native SpeedPredictorResultCollection _getMultidimensionalDownloadSpeeds(long j);

    private native SpeedPredictorResultCollection _getMultidimensionalPredictSpeeds(long j);

    private native float _getPredictSpeed(long j, int i);

    private native String _getVersion();

    private native void _prepare(long j);

    private native void _release(long j);

    private native void _setConfigSpeedInfo(long j, Map<String, String> map);

    private native void _setDoubleValue(long j, int i, double d);

    private native void _setIntValue(long j, int i, int i2);

    private native void _setLongValue(long j, int i, long j2);

    private native void _setSpeedQueueSize(long j, int i);

    private native void _setStringValue(long j, int i, String str);

    private native void _start(long j);

    private native void _update(long j, ArrayList<SpeedPredictorRecord> arrayList, Map<String, Integer> map);

    private native void _updateOldWithStreamId(long j, ISpeedRecordOld iSpeedRecordOld, Map<String, Integer> map);

    private native void _updateWithSizeTime(long j, long j2, long j3, long j4);

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getPredictSpeed() {
        return getPredictSpeed(0);
    }

    private void resetSpeedPredictor() {
        Handler handler = this.mSpeedUpdateHander;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mSpeedUpdateHander.getLooper().quit();
            this.mSpeedUpdateHander = null;
            this.subThread = null;
        }
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void close() {
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
        } else {
            _close(j);
            this.readLock.unlock();
        }
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getLastPredictConfidence() {
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            return -1.0f;
        }
        float _getLastPredictConfidence = _getLastPredictConfidence(j);
        this.readLock.unlock();
        return _getLastPredictConfidence;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public String getMultidimensionalDownloadSpeeds() {
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            return null;
        }
        String speedPredictorResultArrayToString = speedPredictorResultArrayToString(_getMultidimensionalDownloadSpeeds(j).getResultCollection());
        this.readLock.unlock();
        return speedPredictorResultArrayToString;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public SpeedPredictorResultCollection getMultidimensionalDownloadSpeedsObj() {
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            return null;
        }
        SpeedPredictorResultCollection _getMultidimensionalDownloadSpeeds = _getMultidimensionalDownloadSpeeds(j);
        this.readLock.unlock();
        return _getMultidimensionalDownloadSpeeds;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public String getMultidimensionalPredictSpeeds() {
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            return null;
        }
        SpeedPredictorResultCollection _getMultidimensionalPredictSpeeds = _getMultidimensionalPredictSpeeds(j);
        if (_getMultidimensionalPredictSpeeds != null) {
            this.readLock.unlock();
            return speedPredictorResultArrayToString(_getMultidimensionalPredictSpeeds.getResultCollection());
        }
        this.readLock.unlock();
        return null;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public SpeedPredictorResultCollection getMultidimensionalPredictSpeedsObj() {
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            return null;
        }
        SpeedPredictorResultCollection _getMultidimensionalPredictSpeeds = _getMultidimensionalPredictSpeeds(j);
        this.readLock.unlock();
        return _getMultidimensionalPredictSpeeds;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public String getVersion() {
        if (this.mHandle == 0) {
            return "j_1.7.0";
        }
        return _getVersion();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void prepare() {
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
        } else {
            _prepare(j);
            this.readLock.unlock();
        }
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void release() {
        this.writeLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.writeLock.unlock();
            return;
        }
        _close(j);
        _release(this.mHandle);
        this.mHandle = 0L;
        resetSpeedPredictor();
        this.writeLock.unlock();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void start() {
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
        } else {
            _start(j);
            this.readLock.unlock();
        }
    }

    public DefaultSpeedPredictor(int i) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(false);
        this.lock = reentrantReadWriteLock;
        this.readLock = reentrantReadWriteLock.readLock();
        this.writeLock = this.lock.writeLock();
        SpeedPredictorJniLoader.loadLibrary();
        if (!SpeedPredictorJniLoader.isLibraryLoaded) {
            SpeedPredictorLog.e("SpeedPredictor", "[SpeedPredictor] no predictor native loaded");
            return;
        }
        this.mHandle = _create(i);
        SpeedPredictorConfig.setLoglevel(0);
        _setIntValue(this.mHandle, 0, SpeedPredictorConfig.getLogLevel());
    }

    private String speedPredictorResultArrayToString(ArrayList<SpeedPredictorResult> arrayList) {
        JSONObject jsonObject;
        try {
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (arrayList == null) {
            throw new NullPointerException("size");
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<SpeedPredictorResult> it = arrayList.iterator();
        while (it.hasNext()) {
            SpeedPredictorResult next = it.next();
            if (next != null && (jsonObject = next.toJsonObject()) != null) {
                jSONArray.put(jsonObject);
            }
        }
        if (jSONArray.length() > 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", jSONArray);
            return jSONObject.toString();
        }
        return null;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public Map<String, String> getDownloadSpeed(int i) {
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            return null;
        }
        Map<String, String> _getDownloadSpeed = _getDownloadSpeed(j, i);
        this.readLock.unlock();
        return _getDownloadSpeed;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getPredictSpeed(int i) {
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            return -1.0f;
        }
        float _getPredictSpeed = _getPredictSpeed(j, i);
        this.readLock.unlock();
        return _getPredictSpeed;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            SpeedPredictorNotifyInfo speedPredictorNotifyInfo = (SpeedPredictorNotifyInfo) message.obj;
            _updateOldWithStreamId(this.mHandle, speedPredictorNotifyInfo.mSpeedRecord, speedPredictorNotifyInfo.mStreamIdMediaTypeMap);
            return true;
        }
        return true;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void setConfigInfo(Map map) {
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
        } else {
            _setConfigSpeedInfo(j, map);
            this.readLock.unlock();
        }
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void setSpeedQueueSize(int i) {
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
        } else {
            _setSpeedQueueSize(j, i);
            this.readLock.unlock();
        }
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void update(String str, Map<String, Integer> map) {
        this.readLock.lock();
        if (this.mHandle == 0 || str == null || str.length() < 0 || map == null || map.size() < 0) {
            this.readLock.unlock();
            return;
        }
        this.readLock.unlock();
        try {
            JSONArray optJSONArray = new JSONObject(str).optJSONArray("data");
            ArrayList<SpeedPredictorRecord> arrayList = new ArrayList<>();
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(optJSONArray, i);
                    SpeedPredictorRecord speedPredictorRecord = new SpeedPredictorRecord();
                    speedPredictorRecord.extractFields(jSONObject);
                    arrayList.add(speedPredictorRecord);
                } catch (Throwable unused) {
                }
            }
            this.readLock.lock();
            _update(this.mHandle, arrayList, map);
            this.readLock.unlock();
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void update(ISpeedRecordOld iSpeedRecordOld, Map<String, Integer> map) {
        this.readLock.lock();
        if (this.mHandle == 0) {
            this.readLock.unlock();
            return;
        }
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            if (this.subThread == null) {
                PthreadThread pthreadThread = new PthreadThread() { // from class: com.bytedance.vcloud.networkpredictor.DefaultSpeedPredictor.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        com_bytedance_vcloud_networkpredictor_DefaultSpeedPredictor$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_bytedance_vcloud_networkpredictor_DefaultSpeedPredictor$1__run$___twin___() {
                        if (Looper.myLooper() == null) {
                            Looper.prepare();
                        }
                        DefaultSpeedPredictor.this.mSpeedUpdateHander = new Handler(this);
                        Looper.loop();
                    }

                    public static void com_bytedance_vcloud_networkpredictor_DefaultSpeedPredictor$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_bytedance_vcloud_networkpredictor_DefaultSpeedPredictor$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super("DefaultSpeedPredictor$1");
                    }
                };
                this.subThread = pthreadThread;
                pthreadThread.setName("speed_predict_update_thread");
                this.subThread.start();
            }
            if (this.mSpeedUpdateHander != null) {
                SpeedPredictorNotifyInfo speedPredictorNotifyInfo = new SpeedPredictorNotifyInfo();
                speedPredictorNotifyInfo.what = 0;
                speedPredictorNotifyInfo.mSpeedRecord = iSpeedRecordOld;
                speedPredictorNotifyInfo.mStreamIdMediaTypeMap = map;
                Message obtainMessage = this.mSpeedUpdateHander.obtainMessage();
                obtainMessage.what = 0;
                obtainMessage.obj = speedPredictorNotifyInfo;
                obtainMessage.sendToTarget();
            }
        } else {
            _updateOldWithStreamId(this.mHandle, iSpeedRecordOld, map);
        }
        this.readLock.unlock();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getAverageDownloadSpeed(int i, int i2, boolean z) {
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            return -1.0f;
        }
        float _getAverageDownloadSpeed = _getAverageDownloadSpeed(j, i, i2, z);
        this.readLock.unlock();
        return _getAverageDownloadSpeed;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void update(long j, long j2, long j3) {
        this.readLock.lock();
        long j4 = this.mHandle;
        if (j4 == 0) {
            this.readLock.unlock();
        } else {
            _updateWithSizeTime(j4, j, j2, j3);
            this.readLock.unlock();
        }
    }
}
