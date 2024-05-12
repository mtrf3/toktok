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
import com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.FetchCategoryEffectTaskResult;
import java.io.InputStream;

/* loaded from: classes16.dex */
public class FetchCategoryEffectCacheTask extends NormalTask {
    public String category;
    public int count;
    public int cursor;
    public EffectConfiguration mConfiguration;
    public EffectContext mEffectContext;
    public ICache mFileCache;
    public IJsonConverter mJsonConverter;
    public IMonitorService monitorService;
    public String panel;
    public int requestStrategy;
    public int sortingPosition;

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        CategoryEffectListResponse categoryEffectListResponse;
        long currentTimeMillis = System.currentTimeMillis();
        InputStream queryToStream = this.mFileCache.queryToStream(EffectCacheKeyGenerator.generateCategoryEffectKey(this.panel, this.category, this.count, this.cursor, this.sortingPosition));
        if (queryToStream == null) {
            sendMessage(21, new FetchCategoryEffectTaskResult(null, new ExceptionResult(10004)));
            return;
        }
        try {
            categoryEffectListResponse = (CategoryEffectListResponse) this.mJsonConverter.convertJsonToObj(queryToStream, CategoryEffectListResponse.class);
        } catch (Exception e) {
            EPLog.e("FetchCategoryEffectCacheTask", Log.getStackTraceString(e));
            categoryEffectListResponse = null;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (categoryEffectListResponse == null || !categoryEffectListResponse.checkValue()) {
            mobEvent(currentTimeMillis2 - currentTimeMillis);
            sendMessage(21, new FetchCategoryEffectTaskResult(null, new ExceptionResult(10004)));
        } else {
            sendMessage(21, new FetchCategoryEffectTaskResult(categoryEffectListResponse.getData(), null));
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
            newBuilder.addValuePair("category", this.category);
            newBuilder.addValuePair("duration", Long.valueOf(j));
            newBuilder.addValuePair("from_cache", "true");
            newBuilder.addValuePair("request_strategy", Integer.valueOf(this.requestStrategy));
            newBuilder.addValuePair("effect_platform_type", (Integer) 0);
            iMonitorService.monitorStatusRate("category_list_success_rate", 0, newBuilder.build());
        }
    }

    public FetchCategoryEffectCacheTask(EffectContext effectContext, String str, String str2, String str3, int i, int i2, int i3, String str4, Handler handler) {
        super(handler, str2);
        this.panel = str;
        this.category = str3;
        this.count = i;
        this.cursor = i2;
        this.sortingPosition = i3;
        this.mEffectContext = effectContext;
        EffectConfiguration effectConfiguration = effectContext.getEffectConfiguration();
        this.mConfiguration = effectConfiguration;
        this.mFileCache = effectConfiguration.getCache();
        this.mJsonConverter = this.mConfiguration.getJsonConverter();
        this.monitorService = this.mConfiguration.getMonitorService();
        this.requestStrategy = this.mConfiguration.getRequestStrategy();
    }
}
