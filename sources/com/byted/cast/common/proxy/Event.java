package com.byted.cast.common.proxy;

import X.X1D;
import android.content.Context;

/* loaded from: classes29.dex */
public class Event {
    public String appId;
    public long costTime;
    public String packageName;
    public boolean success;
    public long timestamp = System.currentTimeMillis();

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Event{appId='");
        LIZ.append(this.appId);
        LIZ.append('\'');
        LIZ.append(", packageName='");
        LIZ.append(this.packageName);
        LIZ.append('\'');
        LIZ.append(", timestamp=");
        LIZ.append(this.timestamp);
        LIZ.append(", costTime=");
        LIZ.append(this.costTime);
        LIZ.append(", success=");
        LIZ.append(this.success);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public Event(Context context, String str) {
        this.appId = str;
        this.packageName = context.getPackageName();
    }

    public Event(Context context, String str, long j, boolean z) {
        this.appId = str;
        this.packageName = context.getPackageName();
        this.costTime = j;
        this.success = z;
    }
}
