package com.bytedance.apm.agent.instrumentation.okhttp3;

import X.C09970aH;
import X.C16880lQ;
import X.C64550PVa;
import X.C64551PVb;
import X.C64598PWw;
import X.PVM;
import X.PVP;
import X.X1D;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionData;
import com.bytedance.apm.agent.instrumentation.transaction.TxState;
import com.bytedance.apm.agent.monitor.MonitorTool;
import java.io.IOException;
import okhttp3.Request;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MonitorRecorder {
    public static void reportExceptionMonitor(TxState txState, Exception exc) {
    }

    public static void recordRequest(Request request, TxState txState) {
        if (request == null || txState == null) {
            return;
        }
        txState.addAssistData("NetworkLib", "OkHttp3");
        txState.setUrl(request.url().LJIIIIZZ);
        txState.setMethod(request.method());
        txState.setStartTime(System.currentTimeMillis());
        txState.setCarrier("");
        txState.setWanType("");
        PVP body = request.body();
        if (body == null) {
            return;
        }
        if (body instanceof C64550PVa) {
            txState.setBytesSent(body.LIZ());
        } else {
            if (!(body instanceof C64551PVb)) {
                return;
            }
            try {
                txState.setBytesSent(body.LIZ());
            } catch (IOException unused) {
            }
        }
    }

    public static void recordResponse(C64598PWw c64598PWw, TxState txState) {
        if (c64598PWw == null || txState == null) {
            return;
        }
        txState.setStatusCode(c64598PWw.LJLJI);
        PVM pvm = c64598PWw.LJLJL;
        if (pvm == null) {
            return;
        }
        txState.setBytesReceived(pvm.contentLength());
    }

    public static void reportMonitorData(TxState txState, String str) {
        long startTime;
        if (txState == null) {
            return;
        }
        TransactionData end = txState.end();
        if (C09970aH.LJII()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("auto plugin, reportMonitorData: ");
            LIZ.append(end.toString());
            X1D.LIZIZ(LIZ);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sent_bytes", end.getBytesSent());
            jSONObject2.put("received_bytes", end.getBytesReceived());
            jSONObject.put("response", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("request_log", jSONObject);
            jSONObject3.put("net_consume_type", str);
            long totalTime = end.getTotalTime();
            if (txState.getStartTime() == 0) {
                startTime = end.getRequestStart();
            } else {
                startTime = txState.getStartTime();
            }
            MonitorTool.monitorSLA(totalTime, startTime, end.getUrl(), "", "", end.getStatusCode(), jSONObject3);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void reportMonitorData(TxState txState, C64598PWw c64598PWw) {
        if (txState == null || c64598PWw == null) {
            return;
        }
        reportMonitorData(txState, "okhttp");
    }
}
