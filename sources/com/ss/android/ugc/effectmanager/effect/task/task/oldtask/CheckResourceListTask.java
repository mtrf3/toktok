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
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.net.ResourceListResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.FetchResourceListTaskResult;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes16.dex */
public class CheckResourceListTask extends NormalTask {
    public Map<String, String> extraParams;
    public EffectConfiguration mConfiguration;
    public EffectContext mContext;
    public int mCurCnt;

    private EffectRequest buildRequest() {
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        Map<String, String> map = this.extraParams;
        if (map != null) {
            addCommonParams.putAll(map);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mContext.getBestHostUrl());
        LIZ.append(this.mConfiguration.getApiAdress());
        LIZ.append("/moji/resource_lastest");
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(addCommonParams, X1D.LIZIZ(LIZ)));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        while (true) {
            int i = this.mCurCnt;
            this.mCurCnt = i - 1;
            if (i != 0) {
                try {
                    ResourceListResponse resourceListResponse = (ResourceListResponse) this.mConfiguration.getEffectNetWorker().execute(buildRequest(), this.mConfiguration.getJsonConverter(), ResourceListResponse.class);
                    if (resourceListResponse != null && resourceListResponse.checkValue()) {
                        sendMessage(24, new FetchResourceListTaskResult(resourceListResponse.getData()));
                        return;
                    }
                } catch (Exception e) {
                    if (this.mCurCnt == 0 || (e instanceof StatusCodeException)) {
                        sendMessage(24, new FetchResourceListTaskResult(new ExceptionResult(e)));
                        C16880lQ.LLLLIIL(e);
                    }
                }
            } else {
                return;
            }
        }
        sendMessage(24, new FetchResourceListTaskResult(new ExceptionResult(e)));
        C16880lQ.LLLLIIL(e);
    }

    public CheckResourceListTask(EffectContext effectContext, Handler handler, String str, Map<String, String> map) {
        super(handler, str);
        this.extraParams = map;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mContext = effectContext;
        this.mCurCnt = effectContext.getEffectConfiguration().getRetryCount();
    }
}
