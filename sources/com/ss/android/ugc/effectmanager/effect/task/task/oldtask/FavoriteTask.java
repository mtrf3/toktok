package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.task.result.FavoriteTaskResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes16.dex */
public class FavoriteTask extends NormalTask {
    public EffectConfiguration mConfiguration;
    public int mCurCnt;
    public EffectContext mEffectContext;
    public List<String> mEffectIds;
    public boolean mIsFavorite;
    public IJsonConverter mJsonConverter;
    public String mPanel;

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        for (int i = 0; i < this.mCurCnt; i++) {
            try {
                this.mConfiguration.getEffectNetWorker().execute(buildRequest(this.mEffectIds, this.mIsFavorite), this.mJsonConverter, BaseNetResponse.class);
                sendMessage(40, new FavoriteTaskResult(true, this.mEffectIds, null));
                return;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                if (i == this.mCurCnt - 1 || (e instanceof StatusCodeException)) {
                    sendMessage(40, new FavoriteTaskResult(false, this.mEffectIds, new ExceptionResult(e)));
                    return;
                }
            }
        }
    }

    private EffectRequest buildRequest(List<String> list, boolean z) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.mConfiguration.getAccessKey())) {
            hashMap.put("access_key", this.mConfiguration.getAccessKey());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getDeviceId())) {
            hashMap.put("device_id", this.mConfiguration.getDeviceId());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getDeviceType())) {
            hashMap.put("device_type", this.mConfiguration.getDeviceType());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getPlatform())) {
            hashMap.put("device_platform", this.mConfiguration.getPlatform());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getRegion())) {
            hashMap.put("region", this.mConfiguration.getRegion());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getSdkVersion())) {
            hashMap.put("sdk_version", this.mConfiguration.getSdkVersion());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getAppVersion())) {
            hashMap.put("app_version", this.mConfiguration.getAppVersion());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getChannel())) {
            hashMap.put("channel", this.mConfiguration.getChannel());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getAppID())) {
            hashMap.put("aid", this.mConfiguration.getAppID());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getAppLanguage())) {
            hashMap.put("app_language", this.mConfiguration.getAppLanguage());
        }
        if (!CollectionUtil.isMapEmpty(this.mConfiguration.getIopInfo())) {
            hashMap.putAll(this.mConfiguration.getIopInfo());
        }
        if (!TextUtils.isEmpty(this.mPanel)) {
            hashMap.put("panel", this.mPanel);
        }
        hashMap.put("effect_ids", list);
        hashMap.put("type", Integer.valueOf(z ? 1 : 0));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mEffectContext.getBestHostUrl());
        LIZ.append(this.mConfiguration.getApiAdress());
        LIZ.append("/v3/effect/favorite");
        EffectRequest effectRequest = new EffectRequest("POST", X1D.LIZIZ(LIZ));
        effectRequest.setBodyParams(hashMap);
        effectRequest.setContentType("application/json");
        return effectRequest;
    }

    public FavoriteTask(EffectContext effectContext, String str, String str2, Handler handler, String str3, boolean z) {
        super(handler, str2);
        this.mEffectIds = new ArrayList();
        this.mEffectContext = effectContext;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mJsonConverter = this.mEffectContext.getEffectConfiguration().getJsonConverter();
        this.mEffectIds.clear();
        this.mEffectIds.add(str3);
        this.mIsFavorite = z;
        this.mPanel = str;
        this.mCurCnt = this.mConfiguration.getRetryCount();
    }

    public FavoriteTask(EffectContext effectContext, String str, String str2, Handler handler, List<String> list, boolean z) {
        super(handler, str2);
        this.mEffectIds = new ArrayList();
        this.mEffectContext = effectContext;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mJsonConverter = this.mEffectContext.getEffectConfiguration().getJsonConverter();
        this.mEffectIds.clear();
        this.mEffectIds.addAll(list);
        this.mIsFavorite = z;
        this.mPanel = str;
        this.mCurCnt = this.mConfiguration.getRetryCount();
    }
}
