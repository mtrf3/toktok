package com.bytedance.ttnet.diagnosis;

import X.C16880lQ;
import X.Q89;

/* loaded from: classes9.dex */
public class TTGameDiagnosisService {
    public static final String TAG = C16880lQ.LJLLJ(TTGameDiagnosisService.class);
    public static volatile TTGameDiagnosisService sInstance = null;
    public IDiagnosisCallback mDiagnosisCallback = new Q89();
    public volatile boolean mIsMonitoring;
    public IDiagnosisRequest mRequest;

    public void monitorEnd() {
        monitorEnd(null);
    }

    public static TTGameDiagnosisService inst() {
        if (sInstance == null) {
            synchronized (TTGameDiagnosisService.class) {
                if (sInstance == null) {
                    sInstance = new TTGameDiagnosisService();
                }
            }
        }
        return sInstance;
    }

    public boolean isMonitoring() {
        return this.mIsMonitoring;
    }

    public void doDiagnosisDuringGaming(String str) {
        synchronized (this) {
            if (!this.mIsMonitoring) {
                return;
            }
            this.mRequest.doExtraCommand("diagnosis", str);
        }
    }

    public void monitorEnd(String str) {
        synchronized (this) {
            if (!this.mIsMonitoring) {
                return;
            }
            if (str != null) {
                this.mRequest.doExtraCommand("extra_info", str);
            }
            this.mRequest.doExtraCommand("finish", "");
            this.mIsMonitoring = false;
        }
    }

    public void monitorBegin(String str, String str2) {
        synchronized (this) {
            if (this.mIsMonitoring) {
                return;
            }
            IDiagnosisRequest createRequest = TTNetDiagnosisService.createRequest(4, str, 0, Integer.MAX_VALUE);
            this.mRequest = createRequest;
            createRequest.start(this.mDiagnosisCallback);
            this.mRequest.doExtraCommand("extra_info", str2);
            this.mIsMonitoring = true;
        }
    }
}
