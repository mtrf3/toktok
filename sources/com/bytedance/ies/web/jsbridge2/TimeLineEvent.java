package com.bytedance.ies.web.jsbridge2;

import X.C38185Eyj;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class TimeLineEvent implements Serializable {
    public final long elapsedTimestamp;
    public final HashMap<String, Object> extra;
    public final String label;
    public final String message;
    public final String time;
    public final long timeInMillis;

    public long getElapsedTimestamp() {
        return this.elapsedTimestamp;
    }

    public HashMap<String, Object> getExtra() {
        return this.extra;
    }

    public String getLabel() {
        return this.label;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTime() {
        return this.time;
    }

    public long getTimeInMillis() {
        return this.timeInMillis;
    }

    public TimeLineEvent(C38185Eyj c38185Eyj) {
        this.label = c38185Eyj.LIZ;
        this.message = null;
        this.time = c38185Eyj.LIZIZ;
        this.extra = c38185Eyj.LJ;
        this.elapsedTimestamp = c38185Eyj.LIZLLL;
        this.timeInMillis = c38185Eyj.LIZJ;
    }
}
