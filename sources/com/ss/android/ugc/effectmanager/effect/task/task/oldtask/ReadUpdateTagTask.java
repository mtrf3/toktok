package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.CloseUtil;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.task.result.ReadTagTaskResult;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes16.dex */
public class ReadUpdateTagTask extends NormalTask {
    public ICache mCache;
    public String mId;
    public IJsonConverter mJsonConverter;
    public String mUpdateTime;

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        InputStream queryToStream = this.mCache.queryToStream("updatetime");
        try {
            if (queryToStream == null) {
                sendMessage(52, new ReadTagTaskResult(this.mId, this.mUpdateTime, null, new ExceptionResult(10009)));
                return;
            }
            try {
                HashMap hashMap = (HashMap) this.mJsonConverter.convertJsonToObj(queryToStream, HashMap.class);
                if (hashMap != null) {
                    sendMessage(52, new ReadTagTaskResult(this.mId, this.mUpdateTime, hashMap, null));
                } else {
                    sendMessage(52, new ReadTagTaskResult(this.mId, this.mUpdateTime, null, new ExceptionResult(new IllegalStateException("local file destroy"))));
                }
            } catch (Exception e) {
                sendMessage(52, new ReadTagTaskResult(this.mId, this.mUpdateTime, null, new ExceptionResult(e)));
            }
        } finally {
            CloseUtil.close(queryToStream);
        }
    }

    public ReadUpdateTagTask(Handler handler, EffectContext effectContext, String str, String str2, String str3) {
        super(handler, str);
        this.mCache = effectContext.getEffectConfiguration().getCache();
        this.mJsonConverter = effectContext.getEffectConfiguration().getJsonConverter();
        this.mId = str2;
        this.mUpdateTime = str3;
    }
}
