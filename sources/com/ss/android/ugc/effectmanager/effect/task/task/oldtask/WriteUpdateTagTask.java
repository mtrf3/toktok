package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import android.util.Log;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.task.result.WriteTagTaskResult;
import java.util.HashMap;

/* loaded from: classes16.dex */
public class WriteUpdateTagTask extends NormalTask {
    public ICache mCache;
    public IJsonConverter mJsonConverter;
    public HashMap<String, String> mTagsCachedMap;
    public String mTaskId;

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        try {
            this.mCache.save("updatetime", this.mJsonConverter.convertObjToJson(this.mTagsCachedMap));
            sendMessage(51, new WriteTagTaskResult(this.mTaskId, null));
        } catch (Exception e) {
            EPLog.e("NewWriteUpdateTagTask", Log.getStackTraceString(e));
        }
    }

    public WriteUpdateTagTask(Handler handler, EffectContext effectContext, String str, HashMap<String, String> hashMap) {
        super(handler, str);
        this.mTagsCachedMap = new HashMap<>();
        this.mCache = effectContext.getEffectConfiguration().getCache();
        this.mJsonConverter = effectContext.getEffectConfiguration().getJsonConverter();
        this.mTagsCachedMap.putAll(hashMap);
        this.mTaskId = str;
    }
}
