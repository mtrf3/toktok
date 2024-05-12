package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.QueryVideoUsedStickerTaskResult;
import com.ss.android.ugc.effectmanager.knadapt.AdapterExtKt;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes16.dex */
public class QueryVideoUsedStickerTask extends NormalTask {
    public EffectConfiguration configuration;
    public EffectContext effectContext;
    public Map<String, String> extraParams;
    public int mCurCnt;

    private EffectRequest createRequest() {
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.configuration);
        Map<String, String> map = this.extraParams;
        if (map != null && !map.isEmpty()) {
            addCommonParams.putAll(this.extraParams);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.effectContext.getBestHostUrl());
        LIZ.append(this.configuration.getApiAdress());
        LIZ.append("/user/usedSticker");
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(addCommonParams, X1D.LIZIZ(LIZ)));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        EffectRequest createRequest = createRequest();
        while (true) {
            int i = this.mCurCnt;
            this.mCurCnt = i - 1;
            if (i != 0) {
                try {
                } catch (Exception e) {
                    if (this.mCurCnt == 0 || (e instanceof StatusCodeException)) {
                        sendMessage(61, new QueryVideoUsedStickerTaskResult(null, new ExceptionResult(e)));
                        C16880lQ.LLLLIIL(e);
                        return;
                    }
                }
                if (isCanceled()) {
                    sendMessage(61, new QueryVideoUsedStickerTaskResult(null, new ExceptionResult(10001)));
                    return;
                }
                EffectListResponse effectListResponse = (EffectListResponse) AdapterExtKt.parse(this.configuration.getEffectNetWorker(), createRequest, this.configuration.getEffectNetWorker().execute(createRequest), this.configuration.getJsonConverter(), EffectListResponse.class);
                if (effectListResponse != null && effectListResponse.checkValue()) {
                    String absolutePath = this.configuration.getEffectDir().getAbsolutePath();
                    EffectUtils.setEffectPath(absolutePath, effectListResponse.getData());
                    EffectUtils.setEffectPath(absolutePath, effectListResponse.getCollection());
                    sendMessage(61, new QueryVideoUsedStickerTaskResult(effectListResponse, null));
                    return;
                }
                if (this.mCurCnt == 0) {
                    sendMessage(61, new QueryVideoUsedStickerTaskResult(null, new ExceptionResult(10003)));
                }
            } else {
                return;
            }
        }
    }

    public QueryVideoUsedStickerTask(EffectContext effectContext, Map<String, String> map, Handler handler, String str) {
        super(handler, str);
        this.effectContext = effectContext;
        EffectConfiguration effectConfiguration = effectContext.getEffectConfiguration();
        this.configuration = effectConfiguration;
        this.mCurCnt = effectConfiguration.getRetryCount();
        this.extraParams = map;
    }
}
