package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import android.util.Log;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.CloseUtil;
import com.ss.android.ugc.effectmanager.common.utils.EffectCacheKeyGenerator;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.HotEffectTaskResult;
import com.ss.android.ugc.effectmanager.knadapt.AdapterExtKt;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes16.dex */
public class FetchHotEffectTask extends NormalTask {
    public int count;
    public int cursor;
    public Map<String, String> extraParams;
    public EffectConfiguration mConfiguration;
    public EffectContext mContext;
    public int mCurCnt;
    public ICache mFileCache;
    public IJsonConverter mJsonConverter;
    public IMonitorService monitorService;
    public long startTime;

    private FetchHotEffectResponse getFromCache() {
        FetchHotEffectResponse fetchHotEffectResponse;
        InputStream queryToStream = this.mFileCache.queryToStream(EffectCacheKeyGenerator.generateHotStickerKey());
        if (queryToStream == null) {
            return null;
        }
        try {
            fetchHotEffectResponse = (FetchHotEffectResponse) this.mJsonConverter.convertJsonToObj(queryToStream, FetchHotEffectResponse.class);
        } catch (Exception e) {
            e = e;
            fetchHotEffectResponse = null;
        }
        try {
            fetchHotEffectResponse.setFromCache(true);
        } catch (Exception e2) {
            e = e2;
            EPLog.e("FetchPanelInfoCacheTask", Log.getStackTraceString(e));
            System.currentTimeMillis();
            CloseUtil.close(queryToStream);
            return fetchHotEffectResponse;
        }
        System.currentTimeMillis();
        CloseUtil.close(queryToStream);
        return fetchHotEffectResponse;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        EffectRequest buildRequest = buildRequest(this.count, this.cursor);
        this.startTime = System.currentTimeMillis();
        while (true) {
            int i = this.mCurCnt;
            this.mCurCnt = i - 1;
            if (i != 0) {
                try {
                } catch (Exception e) {
                    if (this.mCurCnt == 0 || (e instanceof StatusCodeException)) {
                        tryGetFromCache(e);
                        C16880lQ.LLLLIIL(e);
                        return;
                    }
                }
                if (isCanceled()) {
                    sendMessage(62, new HotEffectTaskResult(null, new ExceptionResult(10001)));
                    return;
                }
                InputStream execute = this.mConfiguration.getEffectNetWorker().execute(buildRequest);
                long currentTimeMillis = System.currentTimeMillis();
                FetchHotEffectResponse fetchHotEffectResponse = (FetchHotEffectResponse) AdapterExtKt.parse(this.mConfiguration.getEffectNetWorker(), buildRequest, execute, this.mJsonConverter, FetchHotEffectResponse.class);
                if (fetchHotEffectResponse != null) {
                    EffectUtils.setEffectPath(this.mConfiguration.getEffectDir().getAbsolutePath(), fetchHotEffectResponse.getEffects());
                    EffectUtils.setEffectPath(this.mConfiguration.getEffectDir().getAbsolutePath(), fetchHotEffectResponse.getCollection());
                    EffectUtils.setUrlModel(fetchHotEffectResponse.getUrlPrefix(), fetchHotEffectResponse.getEffects());
                    EffectUtils.setUrlModel(fetchHotEffectResponse.getUrlPrefix(), fetchHotEffectResponse.getCollection());
                    EffectUtils.setEffectRecId(fetchHotEffectResponse.getRecId(), fetchHotEffectResponse.getEffects());
                    EffectUtils.setEffectRecId(fetchHotEffectResponse.getRecId(), fetchHotEffectResponse.getCollection());
                    sendMessage(62, new HotEffectTaskResult(fetchHotEffectResponse, null));
                    long currentTimeMillis2 = System.currentTimeMillis();
                    IMonitorService iMonitorService = this.monitorService;
                    if (iMonitorService != null) {
                        EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
                        newBuilder.addValuePair("app_id", this.mConfiguration.getAppID());
                        newBuilder.addValuePair("access_key", this.mConfiguration.getAccessKey());
                        newBuilder.addValuePair("duration", Long.valueOf(currentTimeMillis2 - this.startTime));
                        newBuilder.addValuePair("network_time", Long.valueOf(currentTimeMillis - this.startTime));
                        newBuilder.addValuePair("effect_platform_type", (Integer) 0);
                        iMonitorService.monitorStatusRate("hot_list_success_rate", 0, newBuilder.build());
                    }
                    saveEffectList(fetchHotEffectResponse);
                    return;
                }
                if (this.mCurCnt == 0) {
                    tryGetFromCache(null);
                }
            } else {
                return;
            }
        }
    }

    private void saveEffectList(FetchHotEffectResponse fetchHotEffectResponse) {
        String generateHotStickerKey = EffectCacheKeyGenerator.generateHotStickerKey();
        if (this.mFileCache == null) {
            return;
        }
        try {
            this.mFileCache.save(generateHotStickerKey, this.mJsonConverter.convertObjToJson(fetchHotEffectResponse));
        } catch (Exception e) {
            EPLog.e("save hot EffectList", Log.getStackTraceString(e));
        }
    }

    private void tryGetFromCache(Exception exc) {
        if (this.monitorService != null) {
            long currentTimeMillis = System.currentTimeMillis();
            IMonitorService iMonitorService = this.monitorService;
            EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
            newBuilder.addValuePair("app_id", this.mConfiguration.getAppID());
            newBuilder.addValuePair("access_key", this.mConfiguration.getAccessKey());
            newBuilder.addValuePair("error_code", (Integer) 10002);
            newBuilder.addValuePair("duration", Long.valueOf(currentTimeMillis - this.startTime));
            newBuilder.addValuePair("error_msg", Log.getStackTraceString(exc));
            newBuilder.addValuePair("effect_platform_type", (Integer) 0);
            iMonitorService.monitorStatusRate("hot_list_success_rate", 1, newBuilder.build());
        }
        FetchHotEffectResponse fromCache = getFromCache();
        if (fromCache == null || !fromCache.checkValue()) {
            sendMessage(62, new HotEffectTaskResult(null, new ExceptionResult(new Exception())));
        } else {
            sendMessage(62, new HotEffectTaskResult(fromCache, null));
        }
    }

    private EffectRequest buildRequest(int i, int i2) {
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        addCommonParams.put("cursor", String.valueOf(i2));
        addCommonParams.put("count", String.valueOf(i));
        addCommonParams.put("panel", "default");
        Map<String, String> map = this.extraParams;
        if (map != null) {
            addCommonParams.putAll(map);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mContext.getBestHostUrl());
        LIZ.append(this.mConfiguration.getApiAdress());
        LIZ.append("/hoteffects");
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(addCommonParams, X1D.LIZIZ(LIZ)));
    }

    public FetchHotEffectTask(EffectContext effectContext, int i, int i2, Map<String, String> map, Handler handler, String str) {
        super(handler, str);
        this.startTime = System.currentTimeMillis();
        this.count = i;
        this.cursor = i2;
        this.extraParams = map;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mContext = effectContext;
        this.mCurCnt = effectContext.getEffectConfiguration().getRetryCount();
        this.mFileCache = this.mConfiguration.getCache();
        this.mJsonConverter = this.mConfiguration.getJsonConverter();
        this.monitorService = this.mConfiguration.getMonitorService();
    }
}
