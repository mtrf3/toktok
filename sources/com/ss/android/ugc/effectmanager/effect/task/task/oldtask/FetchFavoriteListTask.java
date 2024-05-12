package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.exception.NetException;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.FetchFavoriteListTaskResult;
import com.ss.android.ugc.effectmanager.knadapt.AdapterExtKt;
import java.util.HashMap;

/* loaded from: classes16.dex */
public class FetchFavoriteListTask extends NormalTask {
    public EffectConfiguration mConfiguration;
    public int mCurCnt;
    public EffectContext mEffectContext;
    public IJsonConverter mJsonConverter;
    public String mPanel;

    private EffectRequest buildRequest() {
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        if (!TextUtils.isEmpty(this.mPanel)) {
            addCommonParams.put("panel", this.mPanel);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mEffectContext.getBestHostUrl());
        LIZ.append(this.mConfiguration.getApiAdress());
        LIZ.append("/v3/effect/my");
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(addCommonParams, X1D.LIZIZ(LIZ)));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        EffectRequest buildRequest = buildRequest();
        for (int i = 0; i < this.mCurCnt; i++) {
            try {
                FetchFavoriteListResponse fetchFavoriteListResponse = (FetchFavoriteListResponse) AdapterExtKt.execute(this.mConfiguration.getEffectNetWorker(), buildRequest, this.mJsonConverter, FetchFavoriteListResponse.class);
                if (fetchFavoriteListResponse != null && fetchFavoriteListResponse.checkValue()) {
                    EffectUtils.setEffectPath(this.mConfiguration.getEffectDir().getAbsolutePath(), fetchFavoriteListResponse.getEffects());
                    EffectUtils.setEffectPath(this.mConfiguration.getEffectDir().getAbsolutePath(), fetchFavoriteListResponse.getCollectEffects());
                    EffectUtils.setEffectPath(this.mConfiguration.getEffectDir().getAbsolutePath(), fetchFavoriteListResponse.getBindEffects());
                    sendMessage(41, new FetchFavoriteListTaskResult(fetchFavoriteListResponse));
                    return;
                }
                throw new NetException(10002, "Download error");
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                if (i == this.mCurCnt - 1 || (e instanceof StatusCodeException)) {
                    sendMessage(41, new FetchFavoriteListTaskResult(new ExceptionResult(e)));
                }
            }
        }
    }

    public FetchFavoriteListTask(EffectContext effectContext, String str, String str2, Handler handler) {
        super(handler, str2);
        this.mEffectContext = effectContext;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mJsonConverter = this.mEffectContext.getEffectConfiguration().getJsonConverter();
        this.mPanel = str;
        this.mCurCnt = this.mConfiguration.getRetryCount();
    }
}
