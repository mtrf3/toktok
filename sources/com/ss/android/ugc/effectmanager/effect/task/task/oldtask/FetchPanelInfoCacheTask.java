package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import android.util.Log;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.CloseUtil;
import com.ss.android.ugc.effectmanager.common.utils.EffectCacheKeyGenerator;
import com.ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.FetchPanelInfoTaskResult;
import java.io.InputStream;

/* loaded from: classes16.dex */
public class FetchPanelInfoCacheTask extends NormalTask {
    public EffectConfiguration mConfiguration;
    public EffectContext mEffectContext;
    public ICache mFileCache;
    public IJsonConverter mJsonConverter;
    public IMonitorService monitorService;
    public String panel;
    public int requestStrategy;

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        PanelInfoResponse panelInfoResponse;
        long currentTimeMillis = System.currentTimeMillis();
        InputStream queryToStream = this.mFileCache.queryToStream(EffectCacheKeyGenerator.generatePanelInfoKey(this.mConfiguration.getChannel(), this.panel));
        if (queryToStream == null) {
            sendMessage(22, new FetchPanelInfoTaskResult(null, new ExceptionResult(10004)));
            return;
        }
        try {
            panelInfoResponse = (PanelInfoResponse) this.mJsonConverter.convertJsonToObj(queryToStream, PanelInfoResponse.class);
        } catch (Exception e) {
            EPLog.e("FetchPanelInfoCacheTask", Log.getStackTraceString(e));
            panelInfoResponse = null;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (panelInfoResponse == null || !panelInfoResponse.checkValue()) {
            mobEvent(currentTimeMillis2 - currentTimeMillis);
            sendMessage(22, new FetchPanelInfoTaskResult(null, new ExceptionResult(10004)));
        } else {
            sendMessage(22, new FetchPanelInfoTaskResult(panelInfoResponse.getData(), null));
        }
        CloseUtil.close(queryToStream);
    }

    private void mobEvent(long j) {
        IMonitorService iMonitorService = this.monitorService;
        if (iMonitorService != null) {
            EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
            newBuilder.addValuePair("app_id", this.mConfiguration.getAppID());
            newBuilder.addValuePair("access_key", this.mConfiguration.getAccessKey());
            newBuilder.addValuePair("panel", this.panel);
            newBuilder.addValuePair("duration", Long.valueOf(j));
            newBuilder.addValuePair("from_cache", "true");
            newBuilder.addValuePair("request_strategy", Integer.valueOf(this.requestStrategy));
            newBuilder.addValuePair("effect_platform_type", (Integer) 0);
            iMonitorService.monitorStatusRate("panel_info_success_rate", 0, newBuilder.build());
        }
    }

    public FetchPanelInfoCacheTask(EffectContext effectContext, String str, String str2, Handler handler) {
        super(handler, str2);
        this.panel = str;
        this.mEffectContext = effectContext;
        EffectConfiguration effectConfiguration = effectContext.getEffectConfiguration();
        this.mConfiguration = effectConfiguration;
        this.mFileCache = effectConfiguration.getCache();
        this.mJsonConverter = this.mConfiguration.getJsonConverter();
        this.monitorService = this.mConfiguration.getMonitorService();
        this.requestStrategy = this.mConfiguration.getRequestStrategy();
    }
}
