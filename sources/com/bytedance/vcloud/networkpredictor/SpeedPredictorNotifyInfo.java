package com.bytedance.vcloud.networkpredictor;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class SpeedPredictorNotifyInfo {
    public long code;
    public ISpeedRecordOld mSpeedRecord;
    public Map<String, Integer> mStreamIdMediaTypeMap;
    public long parameter;
    public int what;

    public SpeedPredictorNotifyInfo() {
        this.what = -1;
        this.code = -1L;
        this.parameter = -1L;
    }

    public SpeedPredictorNotifyInfo(int i, ISpeedRecordOld iSpeedRecordOld, HashMap<String, Integer> hashMap) {
        this.what = i;
        this.code = -1L;
        this.parameter = -1L;
        this.mSpeedRecord = iSpeedRecordOld;
        this.mStreamIdMediaTypeMap = hashMap;
    }
}
