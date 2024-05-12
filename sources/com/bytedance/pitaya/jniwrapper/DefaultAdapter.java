package com.bytedance.pitaya.jniwrapper;

import X.C37692Eqm;
import X.C39427Fdf;
import X.C93238aNe;
import X.C93283aON;
import X.C93302aOg;
import X.C93317aOv;
import X.C93323aP1;
import X.C93330aP8;
import X.C93331aP9;
import X.EnumC93298aOc;
import X.ExecutorC93235aNb;
import X.PVC;
import X.RunnableC93284aOO;
import X.RunnableC93285aOP;
import X.RunnableC93286aOQ;
import X.RunnableC93287aOR;
import X.RunnableC93288aOS;
import X.RunnableC93289aOT;
import X.RunnableC93290aOU;
import X.X1D;
import android.content.Context;
import android.os.Handler;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYErrorCode;
import com.bytedance.pitaya.log.PitayaLogger;
import com.bytedance.pitaya.network.NetworkCommon;
import com.bytedance.pitaya.thirdcomponent.featureevent.FeatureEventProducer;
import com.bytedance.pitaya.thirdcomponent.monitor.Monitor;
import com.bytedance.pitaya.thirdcomponent.stddelegate.PitayaInnerServiceProvider;
import com.bytedance.pitaya.thirdcomponent.trace.TraceReport;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes30.dex */
public final class DefaultAdapter implements IAdapter {
    public static final C93283aON Companion = new C93283aON();

    @Override // com.bytedance.pitaya.jniwrapper.IAdapter
    public void cancelAllDownload() {
        NetworkCommon networkCommon = NetworkCommon.INSTANCE;
        Context LIZ = C93317aOv.LIZ();
        if (LIZ != null) {
            networkCommon.cancelAllDownload(LIZ);
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.content.Context");
    }

    @Override // com.bytedance.pitaya.jniwrapper.IAdapter
    public int currentNetworkStatus() {
        return NetworkCommon.INSTANCE.getNetWorkType();
    }

    @Override // com.bytedance.pitaya.jniwrapper.IAdapter
    public void cancelTimer(String token) {
        Handler handler;
        o.LJIIJ(token, "token");
        ConcurrentHashMap<String, Runnable> concurrentHashMap = C93238aNe.LIZIZ;
        Runnable runnable = concurrentHashMap.get(token);
        if (runnable != null && (handler = C93238aNe.LIZ) != null) {
            handler.removeCallbacks(runnable);
        }
        concurrentHashMap.remove(token);
    }

    @Override // com.bytedance.pitaya.jniwrapper.IAdapter
    public boolean isAllowedMonitorEvent(String eventName) {
        o.LJIIJ(eventName, "eventName");
        Monitor monitor = (Monitor) PitayaInnerServiceProvider.getService(Monitor.class);
        if (monitor != null) {
            return monitor.isAllowedEvent(eventName);
        }
        return false;
    }

    @Override // com.bytedance.pitaya.jniwrapper.IAdapter
    public boolean isBusinessDisabled(String business) {
        o.LJIIJ(business, "business");
        return C93302aOg.LIZ(business);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.pitaya.jniwrapper.IAdapter
    public void appLogEvent(String eventName, String str) {
        boolean z;
        o.LJIIJ(eventName, "eventName");
        FeatureEventProducer featureEventProducer = (FeatureEventProducer) PitayaInnerServiceProvider.getService(FeatureEventProducer.class);
        if (featureEventProducer != null) {
            if (str == null || ujb.o.LJJJJJL(str)) {
                z = true;
            } else {
                z = false;
            }
            JSONObject jSONObject = null;
            String str2 = 0;
            if (!z) {
                try {
                    str2 = new JSONObject(str);
                    jSONObject = str2;
                } catch (JSONException e) {
                    PitayaLogger.LJ(e, str2, 6);
                    jSONObject = str2;
                }
            }
            featureEventProducer.newEvent(eventName, jSONObject);
        }
    }

    @Override // com.bytedance.pitaya.jniwrapper.IAdapter
    public void async(int i, long j) {
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            if (i != 6) {
                if (i != 7) {
                    ExecutorC93235aNb.LJLJL.execute(new RunnableC93287aOR(j));
                    return;
                }
                RunnableC93286aOQ runnableC93286aOQ = new RunnableC93286aOQ(j);
                C93323aP1 c93323aP1 = ExecutorC93235aNb.LJLJI;
                if (c93323aP1 == null) {
                    return;
                }
                c93323aP1.execute(runnableC93286aOQ);
                return;
            }
            ExecutorC93235aNb.LJLILLLLZI.execute(new RunnableC93285aOP(j));
            return;
        }
        ExecutorC93235aNb.LIZIZ(new RunnableC93284aOO(j));
    }

    @Override // com.bytedance.pitaya.jniwrapper.IAdapter
    public void logger(String level, String content) {
        o.LJIIJ(level, "level");
        o.LJIIJ(content, "content");
        if (level.hashCode() != 96784904 || !level.equals("error")) {
            PitayaLogger.LIZJ("JNILOG", content);
        } else {
            PitayaLogger.LIZIZ("JNILOG", content);
        }
    }

    @Override // com.bytedance.pitaya.jniwrapper.IAdapter
    public void reportTrace(String trace, String str) {
        o.LJIIJ(trace, "trace");
        TraceReport traceReport = (TraceReport) PitayaInnerServiceProvider.getService(TraceReport.class);
        if (traceReport != null) {
            traceReport.reportTrace(trace, str, 1000);
        }
    }

    @Override // com.bytedance.pitaya.jniwrapper.IAdapter
    public String timer(long j, int i) {
        return C93238aNe.LIZJ.LIZ(new RunnableC93289aOT(j), i);
    }

    @Override // com.bytedance.pitaya.jniwrapper.IAdapter
    public void asyncAfter(double d, int i, long j) {
        if (d <= 0) {
            async(i, j);
        } else {
            C93238aNe.LIZJ.LIZ(new RunnableC93288aOS(this, i, j), (int) (d * 1000));
        }
    }

    @Override // com.bytedance.pitaya.jniwrapper.IAdapter
    public void download(String url, String distDir, long j) {
        o.LJIIJ(url, "url");
        o.LJIIJ(distDir, "distDir");
        File file = new File(distDir);
        String parent = file.getParent();
        if (parent != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("download, url is ");
            LIZ.append(url);
            LIZ.append(", distDir is ");
            LIZ.append(parent);
            LIZ.append(",fileName is ");
            LIZ.append(file.getName());
            LIZ.append(", callback address is ");
            LIZ.append(j);
            PitayaLogger.LIZ("DefaultAdapter", X1D.LIZIZ(LIZ));
            NetworkCommon networkCommon = NetworkCommon.INSTANCE;
            Context LIZ2 = C93317aOv.LIZ();
            if (LIZ2 != null) {
                String name = file.getName();
                o.LJFF(name, "file.name");
                networkCommon.downloadFile(LIZ2, url, name, null, parent, new C93330aP8(j));
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type android.content.Context");
        }
        PitayaLogger.LIZ("DefaultAdapter", "Can't resolve save dir from dst");
        CallCallbackInNative callCallbackInNative = CallCallbackInNative.LIZ;
        PTYErrorCode pTYErrorCode = PTYErrorCode.FILE_ERROR;
        callCallbackInNative.LIZ(j, false, new PTYError("download", pTYErrorCode.getCode(), pTYErrorCode.getCode(), "Can't resolve save dir from dst", null), null);
    }

    @Override // com.bytedance.pitaya.jniwrapper.IAdapter
    public void unzip(String srcPath, String distPath, long j) {
        o.LJIIJ(srcPath, "srcPath");
        o.LJIIJ(distPath, "distPath");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unzip, srcPath = ");
        LIZ.append(srcPath);
        LIZ.append(", distPath = ");
        LIZ.append(distPath);
        LIZ.append(", callback address is ");
        LIZ.append(j);
        PitayaLogger.LIZ("DefaultAdapter", X1D.LIZIZ(LIZ));
        ExecutorC93235aNb.LIZIZ(new RunnableC93290aOU(srcPath, distPath, j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.bytedance.pitaya.thirdcomponent.monitor.Monitor] */
    @Override // com.bytedance.pitaya.jniwrapper.IAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void monitor(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            r6 = this;
            java.lang.String r0 = "service"
            kotlin.jvm.internal.o.LJIIJ(r7, r0)
            java.lang.Class<com.bytedance.pitaya.thirdcomponent.monitor.Monitor> r0 = com.bytedance.pitaya.thirdcomponent.monitor.Monitor.class
            com.bytedance.pitaya.jniwrapper.ReflectionCall r5 = com.bytedance.pitaya.thirdcomponent.stddelegate.PitayaInnerServiceProvider.getService(r0)
            com.bytedance.pitaya.thirdcomponent.monitor.Monitor r5 = (com.bytedance.pitaya.thirdcomponent.monitor.Monitor) r5
            if (r5 == 0) goto L31
            if (r9 == 0) goto L17
            boolean r0 = ujb.o.LJJJJJL(r9)
            if (r0 == 0) goto L54
        L17:
            r0 = 1
        L18:
            r4 = 6
            r3 = 0
            if (r0 == 0) goto L49
        L1c:
            r2 = r3
        L1d:
            if (r8 == 0) goto L25
            boolean r0 = ujb.o.LJJJJJL(r8)
            if (r0 == 0) goto L3e
        L25:
            r1 = r3
        L26:
            if (r10 == 0) goto L2e
            boolean r0 = ujb.o.LJJJJJL(r10)
            if (r0 == 0) goto L32
        L2e:
            r5.monitorEvent(r7, r2, r1, r3)
        L31:
            return
        L32:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L39
            r0.<init>(r10)     // Catch: org.json.JSONException -> L39
            r3 = r0
            goto L2e
        L39:
            r0 = move-exception
            com.bytedance.pitaya.log.PitayaLogger.LJ(r0, r3, r4)
            goto L2e
        L3e:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L44
            r1.<init>(r8)     // Catch: org.json.JSONException -> L44
            goto L26
        L44:
            r0 = move-exception
            com.bytedance.pitaya.log.PitayaLogger.LJ(r0, r3, r4)
            goto L25
        L49:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4f
            r2.<init>(r9)     // Catch: org.json.JSONException -> L4f
            goto L1d
        L4f:
            r0 = move-exception
            com.bytedance.pitaya.log.PitayaLogger.LJ(r0, r3, r4)
            goto L1c
        L54:
            r0 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pitaya.jniwrapper.DefaultAdapter.monitor(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.bytedance.pitaya.jniwrapper.IAdapter
    public void request(int i, String url, String str, long j) {
        o.LJIIJ(url, "url");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request, requestType is ");
        LIZ.append(i);
        LIZ.append(", url is ");
        LIZ.append(url);
        LIZ.append(", params is ");
        LIZ.append(str);
        LIZ.append(", callback address is ");
        LIZ.append(j);
        PitayaLogger.LIZ("DefaultAdapter", X1D.LIZIZ(LIZ));
        C93331aP9 c93331aP9 = new C93331aP9(j);
        byte[] bArr = null;
        if (i == 1) {
            NetworkCommon networkCommon = NetworkCommon.INSTANCE;
            if (str != null) {
                bArr = str.getBytes(PVC.LIZ);
                o.LJFF(bArr, "(this as java.lang.String).getBytes(charset)");
            }
            networkCommon.post(url, bArr, c93331aP9, EnumC93298aOc.JSON);
            return;
        }
        throw new C39427Fdf(null, 1, null);
    }

    @Override // com.bytedance.pitaya.jniwrapper.IAdapter
    public void threadException(String type, String str, String str2, int i) {
        o.LJIIJ(type, "type");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("threadException, type is ");
        LIZ.append(type);
        LIZ.append(", filter is ");
        LIZ.append(str);
        LIZ.append(", params is ");
        LIZ.append(str2);
        LIZ.append(", skipDepth is ");
        LIZ.append(i);
        PitayaLogger.LIZ("DefaultAdapter", X1D.LIZIZ(LIZ));
        Monitor monitor = (Monitor) PitayaInnerServiceProvider.getService(Monitor.class);
        if (monitor != null) {
            monitor.threadException(type, str, str2, i);
        }
    }
}
