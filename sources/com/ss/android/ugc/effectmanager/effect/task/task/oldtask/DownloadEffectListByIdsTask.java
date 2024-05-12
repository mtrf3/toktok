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
import com.ss.android.ugc.effectmanager.effect.task.result.EffectListTaskResult;
import com.ss.android.ugc.effectmanager.knadapt.AdapterExtKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes16.dex */
public class DownloadEffectListByIdsTask extends NormalTask {
    public Map<String, String> extraParams;
    public EffectConfiguration mConfiguration;
    public EffectContext mContext;
    public int mCurCnt;
    public List<String> mEffectIds;

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        EffectListResponse effectListResponse;
        while (true) {
            int i = this.mCurCnt;
            this.mCurCnt = i - 1;
            if (i != 0) {
                try {
                    effectListResponse = (EffectListResponse) AdapterExtKt.execute(this.mConfiguration.getEffectNetWorker(), buildRequest(this.mEffectIds), this.mConfiguration.getJsonConverter(), EffectListResponse.class);
                } catch (Exception e) {
                    if (this.mCurCnt == 0 || (e instanceof StatusCodeException)) {
                        sendMessage(17, new EffectListTaskResult(new ArrayList(), new ExceptionResult(e)));
                        C16880lQ.LLLLIIL(e);
                        return;
                    }
                }
                if (effectListResponse != null && effectListResponse.checkValue()) {
                    EffectUtils.setEffectPath(this.mConfiguration.getEffectDir().getAbsolutePath(), effectListResponse.getData());
                    sendMessage(17, new EffectListTaskResult(effectListResponse.getData(), null));
                    return;
                } else if (this.mCurCnt == 0) {
                    sendMessage(17, new EffectListTaskResult(new ArrayList(), new ExceptionResult(10014)));
                }
            } else {
                return;
            }
        }
    }

    private EffectRequest buildRequest(List<String> list) {
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        Map<String, String> map = this.extraParams;
        if (map != null) {
            addCommonParams.putAll(map);
        }
        addCommonParams.put("effect_ids", NetworkUtils.toJson(list));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mContext.getBestHostUrl());
        LIZ.append(this.mConfiguration.getApiAdress());
        LIZ.append("/v3/effect/list");
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(addCommonParams, X1D.LIZIZ(LIZ)));
    }

    public DownloadEffectListByIdsTask(EffectContext effectContext, List<String> list, Handler handler, String str) {
        this(effectContext, list, handler, str, null);
    }

    public DownloadEffectListByIdsTask(EffectContext effectContext, List<String> list, Handler handler, String str, Map<String, String> map) {
        super(handler, str);
        this.extraParams = map;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mContext = effectContext;
        this.mEffectIds = list;
        this.mCurCnt = effectContext.getEffectConfiguration().getRetryCount();
    }
}
