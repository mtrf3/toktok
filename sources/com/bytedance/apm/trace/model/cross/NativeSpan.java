package com.bytedance.apm.trace.model.cross;

import X.C48339Iy7;
import X.PIC;
import X.PID;
import X.PIR;
import X.Q89;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public class NativeSpan {
    public long finishTime;
    public boolean isErrorSpan;
    public boolean isFinish;
    public String parentId;
    public String referenceId;
    public String spanId;
    public String spanName;
    public long startTime;
    public Map<String, String> tags;
    public String threadName;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NativeSpan{, spanName='");
        Q89.LIZIZ(LIZ, this.spanName, '\'', ", spanId=");
        LIZ.append(this.spanId);
        LIZ.append(", parentId=");
        LIZ.append(this.parentId);
        LIZ.append(", referenceId=");
        LIZ.append(this.referenceId);
        LIZ.append(", startTime=");
        LIZ.append(this.startTime);
        LIZ.append(", finishTime=");
        LIZ.append(this.finishTime);
        LIZ.append(", threadName='");
        Q89.LIZIZ(LIZ, this.threadName, '\'', ", tags=");
        LIZ.append(this.tags);
        LIZ.append(", isErrorSpan=");
        LIZ.append(this.isErrorSpan);
        LIZ.append(", isFinish=");
        return C48339Iy7.LIZJ(LIZ, this.isFinish, '}', LIZ);
    }

    public long getFinishTime() {
        return this.finishTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public PIR parseToSpan(PIC pic) {
        if (!this.isFinish) {
            return null;
        }
        String str = this.spanName;
        long parseLong = CastLongProtector.parseLong(this.spanId);
        pic.getClass();
        PID pid = new PID(str, pic, parseLong);
        String str2 = this.parentId;
        if (str2 != null && !str2.isEmpty()) {
            pid.LIZLLL = this.parentId;
        }
        String str3 = this.referenceId;
        if (str3 != null && !str3.isEmpty()) {
            pid.LJ = this.referenceId;
        }
        pid.LJI = this.threadName;
        for (Map.Entry<String, String> entry : this.tags.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            PIC pic2 = pid.LJFF;
            if (!((CopyOnWriteArrayList) pic2.LIZLLL).contains(key)) {
                ((CopyOnWriteArrayList) pic2.LIZLLL).add(key);
            }
            if (pid.LJII == null) {
                pid.LJII = new HashMap();
            }
            if (TextUtils.equals(key, "error")) {
                pid.LJIIIIZZ = true;
            }
            ((HashMap) pid.LJII).put(key, value);
        }
        return pid;
    }

    public NativeSpan(String str, String str2, String str3, String str4, long j, long j2, String str5, HashMap<String, String> hashMap, boolean z, boolean z2) {
        this.spanName = str;
        this.spanId = str2;
        this.parentId = str3;
        this.referenceId = str4;
        this.startTime = j;
        this.finishTime = j2;
        this.threadName = str5;
        this.tags = hashMap;
        this.isErrorSpan = z;
        this.isFinish = z2;
    }
}
