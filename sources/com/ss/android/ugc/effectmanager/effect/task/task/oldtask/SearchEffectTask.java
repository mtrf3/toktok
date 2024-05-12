package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.SearchEffectTaskResult;
import com.ss.android.ugc.effectmanager.knadapt.AdapterExtKt;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes16.dex */
public class SearchEffectTask extends NormalTask {
    public int count;
    public int cursor;
    public Map<String, String> extraParams;
    public String keyword;
    public EffectConfiguration mConfiguration;
    public EffectContext mContext;
    public int mCurCnt;
    public IJsonConverter mJsonConverter;
    public String panel;

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        EffectRequest buildRequest = buildRequest(this.keyword, this.count, this.cursor);
        while (true) {
            int i = this.mCurCnt;
            this.mCurCnt = i - 1;
            if (i != 0) {
                try {
                } catch (Exception e) {
                    if (this.mCurCnt == 0 || (e instanceof StatusCodeException)) {
                        sendMessage(60, new SearchEffectTaskResult(null, new ExceptionResult(e)));
                        C16880lQ.LLLLIIL(e);
                        return;
                    }
                }
                if (isCanceled()) {
                    sendMessage(60, new SearchEffectTaskResult(null, new ExceptionResult(10001)));
                    return;
                }
                SearchEffectResponse searchEffectResponse = (SearchEffectResponse) AdapterExtKt.parse(this.mConfiguration.getEffectNetWorker(), buildRequest, this.mConfiguration.getEffectNetWorker().execute(buildRequest), this.mJsonConverter, SearchEffectResponse.class);
                if (searchEffectResponse != null && searchEffectResponse.checkValue()) {
                    EffectUtils.setEffectField(this.mConfiguration.getEffectDir().getAbsolutePath(), this.panel, searchEffectResponse.getEffects());
                    EffectUtils.setEffectField(this.mConfiguration.getEffectDir().getAbsolutePath(), this.panel, searchEffectResponse.getCollection());
                    EffectUtils.setEffectField(this.mConfiguration.getEffectDir().getAbsolutePath(), this.panel, searchEffectResponse.getBindEffects());
                    sendMessage(60, new SearchEffectTaskResult(searchEffectResponse, null));
                    return;
                }
                if (this.mCurCnt == 0) {
                    sendMessage(60, new SearchEffectTaskResult(null, new ExceptionResult(10014)));
                }
            } else {
                return;
            }
        }
    }

    private EffectRequest buildRequest(String str, int i, int i2) {
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        addCommonParams.put("panel", this.panel);
        addCommonParams.put("keyword", str);
        addCommonParams.put("cursor", String.valueOf(i2));
        addCommonParams.put("count", String.valueOf(i));
        Map<String, String> map = this.extraParams;
        if (map != null) {
            addCommonParams.putAll(map);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mContext.getBestHostUrl());
        LIZ.append(this.mConfiguration.getApiAdress());
        LIZ.append("/search");
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(addCommonParams, X1D.LIZIZ(LIZ)));
    }

    public SearchEffectTask(EffectContext effectContext, String str, String str2, int i, int i2, Map<String, String> map, Handler handler, String str3) {
        super(handler, str3);
        this.keyword = str2;
        this.count = i;
        this.cursor = i2;
        this.panel = str;
        this.extraParams = map;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mContext = effectContext;
        this.mCurCnt = effectContext.getEffectConfiguration().getRetryCount();
        this.mJsonConverter = this.mConfiguration.getJsonConverter();
    }
}
