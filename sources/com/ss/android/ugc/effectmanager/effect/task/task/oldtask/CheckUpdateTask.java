package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import X.C16880lQ;
import X.F9J;
import X.X1D;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.CloseUtil;
import com.ss.android.ugc.effectmanager.common.utils.EffectCacheKeyGenerator;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.CheckUpdateVersionModel;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectCheckUpdateResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectCheckUpdateResult;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes16.dex */
public class CheckUpdateTask extends NormalTask {
    public String mCategory;
    public int mCheckType;
    public EffectConfiguration mConfiguration;
    public EffectContext mEffectContext;
    public Map<String, String> mExtraParams;
    public String mPanel;
    public String mVersion;

    private EffectRequest buildRequest() {
        String str;
        SharedPreferences LIZIZ = F9J.LIZIZ(this.mEffectContext.getContext(), 0, "version");
        boolean z = !LIZIZ.getString("app_version", "").equals(this.mConfiguration.getAppVersion());
        if (z) {
            SharedPreferences.Editor edit = LIZIZ.edit();
            edit.putString("app_version", this.mConfiguration.getAppVersion());
            edit.commit();
        }
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        addCommonParams.put("panel", this.mPanel);
        if (this.mCheckType != 1) {
            str = "/panel/check";
        } else {
            addCommonParams.put("category", this.mCategory);
            str = "/category/check";
        }
        if (z) {
            addCommonParams.put("version", "");
        } else {
            addCommonParams.put("version", this.mVersion);
        }
        Map<String, String> map = this.mExtraParams;
        if (map != null) {
            addCommonParams.putAll(map);
        }
        String testStatus = this.mConfiguration.getTestStatus();
        if (!TextUtils.isEmpty(testStatus)) {
            addCommonParams.put("test_status", testStatus);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mEffectContext.getBestHostUrl());
        LIZ.append(this.mConfiguration.getApiAdress());
        LIZ.append(str);
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(addCommonParams, X1D.LIZIZ(LIZ)));
    }

    private boolean checkedChannelCache() {
        String generateCategoryVersionKey;
        CheckUpdateVersionModel checkUpdateVersionModel;
        int i = this.mCheckType;
        if (i != 1) {
            if (i != 2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("effect_version");
                LIZ.append(this.mPanel);
                generateCategoryVersionKey = X1D.LIZIZ(LIZ);
            } else {
                generateCategoryVersionKey = EffectCacheKeyGenerator.generatePanelInfoVersionKey(this.mPanel);
            }
        } else {
            generateCategoryVersionKey = EffectCacheKeyGenerator.generateCategoryVersionKey(this.mPanel, this.mCategory);
        }
        InputStream queryToStream = this.mConfiguration.getCache().queryToStream(generateCategoryVersionKey);
        if (queryToStream == null) {
            return false;
        }
        try {
            checkUpdateVersionModel = (CheckUpdateVersionModel) this.mConfiguration.getJsonConverter().convertJsonToObj(queryToStream, CheckUpdateVersionModel.class);
        } catch (Exception e) {
            EPLog.e("CheckUpdateTask", Log.getStackTraceString(e));
            checkUpdateVersionModel = null;
        }
        CloseUtil.close(queryToStream);
        if (checkUpdateVersionModel == null) {
            return false;
        }
        this.mVersion = checkUpdateVersionModel.getVersion();
        return true;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0061 -> B:10:0x0071). Please report as a decompilation issue!!! */
    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        if (checkedChannelCache()) {
            EffectRequest buildRequest = buildRequest();
            if (isCanceled()) {
                sendMessage(13, new EffectCheckUpdateResult(false, new ExceptionResult(10001)));
            }
            try {
                EffectCheckUpdateResponse effectCheckUpdateResponse = (EffectCheckUpdateResponse) this.mConfiguration.getEffectNetWorker().execute(buildRequest, this.mConfiguration.getJsonConverter(), EffectCheckUpdateResponse.class);
                if (effectCheckUpdateResponse != null) {
                    sendMessage(13, new EffectCheckUpdateResult(effectCheckUpdateResponse.isUpdated(), null));
                } else {
                    sendMessage(13, new EffectCheckUpdateResult(false, new ExceptionResult(10002)));
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                sendMessage(13, new EffectCheckUpdateResult(false, new ExceptionResult(e)));
            }
            return;
        }
        sendMessage(13, new EffectCheckUpdateResult(true, null));
    }

    public CheckUpdateTask(EffectContext effectContext, String str, Handler handler, String str2, String str3, int i, Map<String, String> map) {
        super(handler, str);
        this.mEffectContext = effectContext;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mPanel = str2;
        this.mCategory = str3;
        this.mCheckType = i;
        this.mExtraParams = map;
    }
}
