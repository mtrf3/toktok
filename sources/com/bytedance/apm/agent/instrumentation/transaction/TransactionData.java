package com.bytedance.apm.agent.instrumentation.transaction;

import X.Q89;
import X.X1D;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TransactionData {
    public long bytesReceived;
    public long bytesSent;
    public String carrier;
    public int errorCode;
    public JSONObject extraData;
    public String httpMethod;
    public long requestEnd;
    public int statusCode;
    public long totalTime;
    public String url;
    public String wanType;
    public long requestStart = System.currentTimeMillis();
    public Object lock = new Object();

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TransactionData{requestStart=");
        LIZ.append(this.requestStart);
        LIZ.append(", url='");
        Q89.LIZIZ(LIZ, this.url, '\'', ", carrier='");
        Q89.LIZIZ(LIZ, this.carrier, '\'', ", totalTime=");
        LIZ.append(this.totalTime);
        LIZ.append(", statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", errorCode=");
        LIZ.append(this.errorCode);
        LIZ.append(", bytesSent=");
        LIZ.append(this.bytesSent);
        LIZ.append(", bytesReceived=");
        LIZ.append(this.bytesReceived);
        LIZ.append(", wanType='");
        Q89.LIZIZ(LIZ, this.wanType, '\'', ", httpMethod='");
        Q89.LIZIZ(LIZ, this.httpMethod, '\'', ", extraData=");
        LIZ.append(this.extraData);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public long getBytesReceived() {
        return this.bytesReceived;
    }

    public long getBytesSent() {
        return this.bytesSent;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public JSONObject getExtraData() {
        return this.extraData;
    }

    public String getHttpMethod() {
        return this.httpMethod;
    }

    public long getRequestEnd() {
        return this.requestEnd;
    }

    public long getRequestStart() {
        return this.requestStart;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public long getTotalTime() {
        return this.totalTime;
    }

    public String getUrl() {
        return this.url;
    }

    public String getWanType() {
        return this.wanType;
    }

    public void setErrorCode(int i) {
        synchronized (this.lock) {
            this.errorCode = i;
        }
    }

    public void setRequestEnd(long j) {
        this.requestEnd = j;
    }

    public TransactionData(String str, String str2, long j, int i, int i2, long j2, long j3, String str3, String str4, JSONObject jSONObject) {
        this.url = str;
        this.carrier = str2;
        this.totalTime = j;
        this.statusCode = i;
        this.errorCode = i2;
        this.bytesSent = j2;
        this.bytesReceived = j3;
        this.wanType = str3;
        this.httpMethod = str4;
        this.extraData = jSONObject;
    }
}
