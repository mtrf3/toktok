package com.bytedance.apm.agent.tracing;

import X.C16880lQ;
import X.C77357UXp;
import X.WM7;
import X.X1D;
import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import java.util.HashSet;
import java.util.Stack;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TraceMachine {
    public static ThreadLocal<Stack<Trace>> traceStackThreadLocal = new ThreadLocal<>();
    public static HashSet<String> sMethodSet = new HashSet<>(32);
    public static AgentLog log = AgentLogManager.getAgentLog();

    public static void exitMethod() {
        exitMethod("");
    }

    public static void exitMethod(String str) {
        if (traceStackThreadLocal.get() == null) {
            return;
        }
        Stack<Trace> stack = traceStackThreadLocal.get();
        if (!stack.isEmpty()) {
            Trace pop = stack.pop();
            pop.setExitTime(System.currentTimeMillis());
            pop.setExtraData(str);
            handleCost(pop);
        }
    }

    public static void handleCost(Trace trace) {
        boolean z;
        try {
            long j = trace.entryTime;
            long j2 = trace.exitTime;
            long longValue = Long.valueOf(j2 - j).longValue();
            if (longValue > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("begin_time", j);
                jSONObject.put("end_time", j2);
                JSONObject jSONObject2 = new JSONObject();
                if ("page_load".equals(trace.traceType)) {
                    jSONObject2.put(trace.methodName, longValue);
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(trace.className);
                    LIZ.append("#");
                    LIZ.append(trace.methodName);
                    jSONObject2.put(X1D.LIZIZ(LIZ), longValue);
                }
                JSONObject jSONObject3 = new JSONObject();
                if ("page_load".equals(trace.traceType)) {
                    jSONObject3.put(WM7.SCENE_SERVICE, trace.scene);
                    HashSet<String> hashSet = sMethodSet;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(trace.className);
                    LIZ2.append(trace.methodName);
                    if (!hashSet.contains(X1D.LIZIZ(LIZ2))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jSONObject3.put("is_first", z);
                    HashSet<String> hashSet2 = sMethodSet;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(trace.className);
                    LIZ3.append(trace.methodName);
                    hashSet2.add(X1D.LIZIZ(LIZ3));
                } else {
                    jSONObject3.put("is_main", C77357UXp.LJJIIJZLJL());
                }
                jSONObject.put("extra_data", trace.extraData);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void enterMethod(String str, String str2, String str3) {
        enterMethod(str, str, str2, str3);
    }

    public static void enterMethod(String str, String str2, String str3, String str4) {
        Trace trace = new Trace(str, str2, str3, System.currentTimeMillis(), str4);
        if (traceStackThreadLocal.get() == null) {
            Stack<Trace> stack = new Stack<>();
            stack.push(trace);
            traceStackThreadLocal.set(stack);
            return;
        }
        traceStackThreadLocal.get().push(trace);
    }
}
