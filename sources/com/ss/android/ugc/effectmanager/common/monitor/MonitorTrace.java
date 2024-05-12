package com.ss.android.ugc.effectmanager.common.monitor;

import X.X1D;
import X.YE1;
import android.os.SystemClock;
import com.ss.android.ugc.effectmanager.common.utils.TimeUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class MonitorTrace {
    public long duration;
    public final String id;
    public boolean isTraceEnded;
    public final List<String> stepList = new ArrayList();
    public long traceBeginTimeMills;

    public final void begin() {
        if (!this.stepList.isEmpty()) {
            this.stepList.clear();
        }
        this.isTraceEnded = false;
        this.traceBeginTimeMills = SystemClock.uptimeMillis();
        addStep(">>>>>>> Trace Begin <<<<<<<");
    }

    public final void end() {
        addStep(">>>>>>> Trace End <<<<<<<");
        this.isTraceEnded = true;
        this.duration = SystemClock.uptimeMillis() - this.traceBeginTimeMills;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getStepList() {
        return this.stepList;
    }

    public MonitorTrace(String str) {
        this.id = str;
    }

    public final void addStep(String step) {
        o.LJIIJ(step, "step");
        if (!this.isTraceEnded) {
            List<String> list = this.stepList;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(TimeUtils.INSTANCE.currentTime());
            LIZ.append(" [");
            YE1.LIZLLL(LIZ, this.id, "]->", step, " \n");
            list.add(X1D.LIZIZ(LIZ));
        }
    }
}
