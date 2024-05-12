package com.bytedance.bdlocation.trace;

import X.Q89;
import X.X1D;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.callback.LocateCallback;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.exception.BDLocationException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class LocationTrace implements LocateCallback {
    public boolean isCache;
    public TraceCallback mCallback;
    public BDLocationException mError;
    public long mFirstCallbackTimeMs;
    public long mGeocodeDuration;
    public BDLocation mLocation;
    public long mStartTimeMs;
    public long mStopTimeMs;
    public final String mTag;
    public List<Throwable> mThrowables = Collections.synchronizedList(new ArrayList(3));

    private void reset() {
        this.isCache = false;
        this.mStopTimeMs = 0L;
        this.mFirstCallbackTimeMs = 0L;
        this.mLocation = null;
        this.mError = null;
        this.mGeocodeDuration = 0L;
    }

    public void endTrace() {
        endTrace(false);
    }

    public void clearCauses() {
        this.mThrowables.clear();
    }

    public BDLocationException getAllCauses() {
        if (!this.mThrowables.isEmpty()) {
            return new BDLocationException(new ArrayList(this.mThrowables));
        }
        return this.mError;
    }

    public long getTraceTimeMs() {
        return this.mStopTimeMs - this.mStartTimeMs;
    }

    public void startTrace() {
        TraceCallback traceCallback = this.mCallback;
        if (traceCallback != null) {
            traceCallback.onStart(this);
        }
        this.mStartTimeMs = System.currentTimeMillis();
        BDLocationConfig.isDebug();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocationTrace{mTag='");
        Q89.LIZIZ(LIZ, this.mTag, '\'', ", mStartTimeMs=");
        LIZ.append(this.mStartTimeMs);
        LIZ.append(", isCache=");
        LIZ.append(this.isCache);
        LIZ.append(", mStopTimeMs=");
        LIZ.append(this.mStopTimeMs);
        LIZ.append(", mLocation=");
        LIZ.append(this.mLocation);
        LIZ.append(", mError=");
        LIZ.append(this.mError);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public long getStartTimeMs() {
        return this.mStartTimeMs;
    }

    public String getTag() {
        return this.mTag;
    }

    public LocationTrace(String str) {
        this.mTag = str;
    }

    private void endTrace(boolean z) {
        int i;
        TraceCallback traceCallback = this.mCallback;
        if (traceCallback != null && !z) {
            traceCallback.onStop();
        }
        this.mStopTimeMs = System.currentTimeMillis();
        BDLocation bDLocation = this.mLocation;
        BDLocationException bDLocationException = this.mError;
        BDLocationConfig.isDebug();
        if (this.mFirstCallbackTimeMs == 0) {
            this.mFirstCallbackTimeMs = System.currentTimeMillis();
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("biz_module", this.mTag);
            if (BDLocationConfig.isBackground()) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("background", i);
            if (bDLocation != null) {
                jSONObject.put("total_duration", this.mFirstCallbackTimeMs - this.mStartTimeMs);
                jSONObject.put("reverse_gis_cost", this.mGeocodeDuration);
                jSONObject.put("reduce", z);
                jSONObject.put("status", 1);
                return;
            }
            if (bDLocationException != null) {
                jSONObject.put("total_duration", this.mFirstCallbackTimeMs - this.mStartTimeMs);
                jSONObject.put("status", 0);
                jSONObject.put("reduce", z);
                jSONObject2.put("locate_fail_code", bDLocationException.getCode());
                jSONObject2.put("locate_fail_reason", bDLocationException.getMessage());
                for (Map.Entry<String, String> entry : bDLocationException.getExtra().entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception unused) {
        }
    }

    public void addGeocodeDuration(long j) {
        if (this.mGeocodeDuration == 0) {
            this.mGeocodeDuration = j;
        }
    }

    public void addTraceInfo(BDLocationException bDLocationException) {
        TraceCallback traceCallback = this.mCallback;
        if (traceCallback != null) {
            traceCallback.onError(bDLocationException);
        }
        this.mError = bDLocationException;
        try {
            if (this.mThrowables.size() < 16) {
                this.mThrowables.add(bDLocationException);
            }
        } catch (Exception unused) {
        }
        if (this.mFirstCallbackTimeMs == 0) {
            this.mFirstCallbackTimeMs = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.bdlocation.callback.LocateCallback
    public void onLocateStart(String str) {
        TraceCallback traceCallback = this.mCallback;
        if (traceCallback != null) {
            traceCallback.onLocateStart(str);
        }
    }

    @Override // com.bytedance.bdlocation.callback.LocateCallback
    public void onLocateStop(String str) {
        TraceCallback traceCallback = this.mCallback;
        if (traceCallback != null) {
            traceCallback.onLocateStop(str);
        }
    }

    public void reduce(BDLocationException bDLocationException) {
        addTraceInfo(bDLocationException);
        endTrace(true);
        reset();
    }

    public void setTraceCallback(TraceCallback traceCallback) {
        this.mCallback = traceCallback;
    }

    public void addTraceInfo(BDLocation bDLocation) {
        TraceCallback traceCallback = this.mCallback;
        if (traceCallback != null) {
            traceCallback.onLocationChanged(new BDLocation(bDLocation));
        }
        this.mLocation = bDLocation;
        this.isCache = bDLocation.isCache();
        if (this.mFirstCallbackTimeMs == 0) {
            this.mFirstCallbackTimeMs = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.bdlocation.callback.LocateCallback
    public void onLocateChange(String str, BDLocation bDLocation) {
        TraceCallback traceCallback = this.mCallback;
        if (traceCallback != null) {
            traceCallback.onLocateChange(str, bDLocation);
        }
    }

    @Override // com.bytedance.bdlocation.callback.LocateCallback
    public void onLocateError(String str, BDLocationException bDLocationException) {
        TraceCallback traceCallback = this.mCallback;
        if (traceCallback != null) {
            traceCallback.onLocateError(str, bDLocationException);
        }
    }
}
