package com.bytedance.vcloud.networkpredictor;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes9.dex */
public class AwemeSpeedPredictor implements ISpeedPredictor, ISpeedPredictorAwemeListener {
    public ISpeedPredictorAwemePredictor mAwemeRealPredictor;
    public ISpeedPredictorListener mSpeedPredictorListener;
    public Timer timer;

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void close() {
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getAverageDownloadSpeed(int i, int i2, boolean z) {
        return -1.0f;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public Map<String, String> getDownloadSpeed(int i) {
        return null;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getLastPredictConfidence() {
        return -1.0f;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public String getMultidimensionalDownloadSpeeds() {
        return null;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public SpeedPredictorResultCollection getMultidimensionalDownloadSpeedsObj() {
        return null;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public String getMultidimensionalPredictSpeeds() {
        return null;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public SpeedPredictorResultCollection getMultidimensionalPredictSpeedsObj() {
        return null;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getPredictSpeed() {
        return getPredictSpeed(0);
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public String getVersion() {
        return "A1.7.0";
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void prepare() {
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void release() {
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void setConfigInfo(Map map) {
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void setSpeedQueueSize(int i) {
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void start() {
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void update(ISpeedRecordOld iSpeedRecordOld, Map<String, Integer> map) {
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void update(String str, Map<String, Integer> map) {
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorAwemeListener
    public String getCountry() {
        return this.mSpeedPredictorListener.getCountry();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorAwemeListener
    public String getFilesCachePath() {
        return this.mSpeedPredictorListener.getFilesCachePath();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorAwemeListener
    public Object getIOExecutor() {
        return this.mSpeedPredictorListener.getIOExecutor();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorAwemeListener
    public String getNetworkType() {
        return this.mSpeedPredictorListener.getNetworkType();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorAwemeListener
    public int getPhoneSignal() {
        return this.mSpeedPredictorListener.getPhoneSignal();
    }

    public void startCalculate() {
        PthreadTimer pthreadTimer = new PthreadTimer("awemeSpeedPredictor");
        this.timer = pthreadTimer;
        pthreadTimer.schedule(new TimerTask() { // from class: com.bytedance.vcloud.networkpredictor.AwemeSpeedPredictor.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                com_bytedance_vcloud_networkpredictor_AwemeSpeedPredictor$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_vcloud_networkpredictor_AwemeSpeedPredictor$1__run$___twin___() {
                AwemeSpeedPredictor.this.mAwemeRealPredictor.calculateSpeed();
            }

            public static void com_bytedance_vcloud_networkpredictor_AwemeSpeedPredictor$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_bytedance_vcloud_networkpredictor_AwemeSpeedPredictor$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, 500L, 500L);
    }

    public void stopCalculate() {
        this.timer.cancel();
    }

    public AwemeSpeedPredictor(ISpeedPredictorListener iSpeedPredictorListener) {
        Class<?> cls;
        this.mSpeedPredictorListener = iSpeedPredictorListener;
        try {
            cls = Class.forName("com.bytedance.vcloud.iesnetworkpredictnative.NetworkSpeedManager");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        this.mAwemeRealPredictor = (ISpeedPredictorAwemePredictor) cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        this.mSpeedPredictorListener = iSpeedPredictorListener;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getPredictSpeed(int i) {
        return (float) this.mAwemeRealPredictor.getSpeed();
    }

    public void setupAlgorithmTypeAndConfig(int i, ISpeedPredictorMLConfig iSpeedPredictorMLConfig) {
        if (i == 4) {
            Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
            }
            this.mAwemeRealPredictor.setSpeedAlgorithmType(4);
            return;
        }
        if (i != 5) {
            return;
        }
        this.mAwemeRealPredictor.setPredictorListener(this);
        this.mAwemeRealPredictor.configMlModel(iSpeedPredictorMLConfig);
        this.mAwemeRealPredictor.setSpeedAlgorithmType(5);
        startCalculate();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorAwemeListener
    public boolean getDownFileState(String str, String str2, String str3) {
        return this.mSpeedPredictorListener.getDownFileState(str, str2, str3);
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void update(long j, long j2, long j3) {
        if (j2 <= 0) {
            return;
        }
        double d = j;
        this.mAwemeRealPredictor.monitorVideoSpeed((8.0d * d) / (j2 / 1000.0d), d, j2);
    }
}
