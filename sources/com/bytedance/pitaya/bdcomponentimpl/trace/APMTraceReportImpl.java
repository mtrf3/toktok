package com.bytedance.pitaya.bdcomponentimpl.trace;

import X.C93271aOB;
import X.PIT;
import X.PIU;
import com.bytedance.pitaya.thirdcomponent.trace.TraceReport;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes30.dex */
public final class APMTraceReportImpl implements TraceReport {
    public static final C93271aOB Companion = new C93271aOB();
    public int round;
    public final List<Object> taskCache = new ArrayList();
    public final List<Object> initCache = new ArrayList();
    public final List<Object> asyncCache = new ArrayList();

    private final void addRunDetailSpan(PIU piu, String str, PIT pit, int i) {
    }

    private final void upload(String str, JSONObject jSONObject, int i) {
    }

    private final void uploadInit(String str, JSONObject jSONObject, int i) {
    }

    private final void uploadTask(String str, JSONObject jSONObject, int i) {
    }

    @Override // com.bytedance.pitaya.thirdcomponent.trace.TraceReport
    public boolean isTraceEnable() {
        return false;
    }

    @Override // com.bytedance.pitaya.thirdcomponent.trace.TraceReport
    public void reportTrace(String trace, String str, int i) {
        o.LJIIJ(trace, "trace");
    }
}
