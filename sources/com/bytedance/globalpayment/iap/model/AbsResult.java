package com.bytedance.globalpayment.iap.model;

import X.C77800Ug8;
import X.X1D;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public class AbsResult {
    public int mCode = -1;
    public int mDetailCode = -1;
    public String mMessage = "";
    public HashMap<String, String> performanceLogMap = new HashMap<>();

    public boolean isSuccess() {
        if (this.mCode == 0) {
            return true;
        }
        return false;
    }

    public void resetPerformanceLog() {
        this.performanceLogMap = new HashMap<>();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AbsResult{mCode=");
        LIZ.append(this.mCode);
        LIZ.append(", mDetailCode=");
        LIZ.append(this.mDetailCode);
        LIZ.append(", mMessage='");
        return C77800Ug8.LIZJ(LIZ, this.mMessage, '\'', '}', LIZ);
    }

    public int getCode() {
        return this.mCode;
    }

    public int getDetailCode() {
        return this.mDetailCode;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public Map<String, String> getPerformanceLog() {
        return this.performanceLogMap;
    }

    public AbsResult withDetailCode(int i) {
        this.mDetailCode = i;
        return this;
    }

    public AbsResult withErrorCode(int i) {
        this.mCode = i;
        return this;
    }

    public AbsResult withMessage(String str) {
        this.mMessage = str;
        return this;
    }

    public void addPerformanceLog(String str, String str2) {
        this.performanceLogMap.put(str, str2);
    }
}
