package com.bytedance.pitaya.ptyapt;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes30.dex */
public class TypeMapping {
    public Map<String, String> mapping;

    public TypeMapping() {
        HashMap hashMap = new HashMap();
        this.mapping = hashMap;
        hashMap.put("com.bytedance.pitaya.thirdcomponent.monitor.Monitor", "com.bytedance.pitaya.bdcomponentimpl.monitor.APMMonitorImpl");
        this.mapping.put("com.bytedance.pitaya.log.PitayaLogPrinter", "com.bytedance.pitaya.bdcomponentimpl.monitor.ALogPrinter");
        this.mapping.put("com.bytedance.pitaya.thirdcomponent.net.WebSocketCreator", "com.bytedance.pitaya.bdcomponentimpl.network.OKHttpSocketCreator");
        this.mapping.put("com.bytedance.pitaya.thirdcomponent.net.PTYHttpClient", "com.bytedance.pitaya.bdcomponentimpl.network.TTNetHttpClientImpl");
        this.mapping.put("com.bytedance.pitaya.thirdcomponent.downloader.PTYFileDownloader", "com.bytedance.pitaya.bdcomponentimpl.network.DownloaderFileDownloaderImpl");
        this.mapping.put("com.bytedance.pitaya.thirdcomponent.featureevent.FeatureEventProducer", "com.bytedance.pitaya.bdcomponentimpl.featureevent.AppLogEventProducer");
        this.mapping.put("com.bytedance.pitaya.thirdcomponent.encrypt.ClientEncrypt", "com.bytedance.pitaya.bdcomponentimpl.sword.SWordEncryptImpl");
        this.mapping.put("com.bytedance.pitaya.thirdcomponent.trace.TraceReport", "com.bytedance.pitaya.bdcomponentimpl.trace.APMTraceReportImpl");
        this.mapping.put("com.bytedance.pitaya.thirdcomponent.crash.CrashInfoCollector", "com.bytedance.pitaya.bdcomponentimpl.crash.NpthCrashCollector");
    }
}
