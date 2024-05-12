package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectConstants;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectCacheKeyGenerator;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectChannelTaskResult;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class FetchEffectChannelTask extends NormalTask {
    public EffectConfiguration mConfiguration;
    public int mCurCnt;
    public EffectContext mEffectContext;
    public ICache mFileCache;
    public IJsonConverter mJsonConverter;
    public String mRemoteIp;
    public String mRequestedUrl;
    public String mSelectedHost;
    public IMonitorService monitorService;
    public String panel;
    public long size;

    private EffectRequest buildEffectListRequest() {
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        if (!TextUtils.isEmpty(this.panel)) {
            addCommonParams.put("panel", this.panel);
        }
        this.mSelectedHost = this.mEffectContext.getBestHostUrl();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mSelectedHost);
        LIZ.append(this.mConfiguration.getApiAdress());
        LIZ.append("/v3/effects");
        String buildRequestUrl = NetworkUtils.buildRequestUrl(addCommonParams, X1D.LIZIZ(LIZ));
        this.mRequestedUrl = buildRequestUrl;
        try {
            this.mRemoteIp = InetAddress.getByName(new URL(buildRequestUrl).getHost()).getHostAddress();
        } catch (MalformedURLException e) {
            C16880lQ.LLLLIIL(e);
        } catch (UnknownHostException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        return new EffectRequest("GET", buildRequestUrl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0119, code lost:
    
        com.ss.android.ugc.effectmanager.common.utils.CloseUtil.close(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute() {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchEffectChannelTask.execute():void");
    }

    private void onFail(ExceptionResult exceptionResult) {
        exceptionResult.setTrackParams(this.mRequestedUrl, this.mSelectedHost, this.mRemoteIp);
        sendMessage(14, new EffectChannelTaskResult(null, exceptionResult));
        IMonitorService iMonitorService = this.monitorService;
        if (iMonitorService != null) {
            EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
            newBuilder.addValuePair("app_id", this.mConfiguration.getAppID());
            newBuilder.addValuePair("access_key", this.mConfiguration.getAccessKey());
            newBuilder.addValuePair("panel", this.panel);
            newBuilder.addValuePair("error_code", Integer.valueOf(exceptionResult.getErrorCode()));
            newBuilder.addValuePair("error_msg", exceptionResult.getMsg());
            newBuilder.addValuePair("host_ip", this.mRemoteIp);
            newBuilder.addValuePair("download_url", this.mRequestedUrl);
            newBuilder.addValuePair("effect_platform_type", (Integer) 0);
            iMonitorService.monitorStatusRate("effect_list_success_rate", 1, newBuilder.build());
        }
    }

    private void saveEffectList(EffectChannelModel effectChannelModel) {
        try {
            this.size = this.mFileCache.save(EffectCacheKeyGenerator.generatePanelKey(this.mConfiguration.getChannel(), this.panel), this.mJsonConverter.convertObjToJson(effectChannelModel)) / EffectConstants.KB;
        } catch (Exception e) {
            EPLog.e("FetchEffectChannelTask", Log.getStackTraceString(e));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", effectChannelModel.getVersion());
            ICache iCache = this.mFileCache;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("effect_version");
            LIZ.append(this.panel);
            iCache.save(X1D.LIZIZ(LIZ), jSONObject.toString());
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public FetchEffectChannelTask(EffectContext effectContext, String str, String str2, Handler handler) {
        super(handler, str2);
        this.panel = str;
        this.mEffectContext = effectContext;
        EffectConfiguration effectConfiguration = effectContext.getEffectConfiguration();
        this.mConfiguration = effectConfiguration;
        this.mFileCache = effectConfiguration.getCache();
        this.mJsonConverter = this.mConfiguration.getJsonConverter();
        this.monitorService = this.mConfiguration.getMonitorService();
        this.mCurCnt = this.mConfiguration.getRetryCount();
    }
}
