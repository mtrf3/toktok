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
import com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.FetchCategoryEffectTaskResult;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class FetchCategoryEffectTask extends NormalTask {
    public String category;
    public int count;
    public int cursor;
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
    public int requestStrategy;
    public long size;
    public int sortingPosition;
    public String version;

    private EffectRequest buildEffectListRequest() {
        String str;
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        if (!TextUtils.isEmpty(this.panel)) {
            addCommonParams.put("panel", this.panel);
        }
        addCommonParams.put("category", this.category);
        addCommonParams.put("cursor", String.valueOf(this.cursor));
        addCommonParams.put("count", String.valueOf(this.count));
        addCommonParams.put("sorting_position", String.valueOf(this.sortingPosition));
        addCommonParams.put("version", String.valueOf(this.version));
        String testStatus = this.mConfiguration.getTestStatus();
        if (!TextUtils.isEmpty(testStatus)) {
            addCommonParams.put("test_status", testStatus);
        }
        this.mSelectedHost = this.mEffectContext.getBestHostUrl();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mSelectedHost);
        LIZ.append(this.mConfiguration.getApiAdress());
        if (this.requestStrategy == 2) {
            str = "/category/effects/v2";
        } else {
            str = "/category/effects";
        }
        LIZ.append(str);
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

    /* JADX WARN: Code restructure failed: missing block: B:30:0x018b, code lost:
    
        onFail(new com.ss.android.ugc.effectmanager.common.task.ExceptionResult(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a6, code lost:
    
        com.ss.android.ugc.effectmanager.common.utils.CloseUtil.close(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01a9, code lost:
    
        return;
     */
    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute() {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchCategoryEffectTask.execute():void");
    }

    private void onFail(ExceptionResult exceptionResult) {
        exceptionResult.setTrackParams(this.mRequestedUrl, this.mSelectedHost, this.mRemoteIp);
        sendMessage(21, new FetchCategoryEffectTaskResult(null, exceptionResult));
        IMonitorService iMonitorService = this.monitorService;
        if (iMonitorService != null) {
            EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
            newBuilder.addValuePair("app_id", this.mConfiguration.getAppID());
            newBuilder.addValuePair("access_key", this.mConfiguration.getAccessKey());
            newBuilder.addValuePair("panel", this.panel);
            newBuilder.addValuePair("category", this.category);
            newBuilder.addValuePair("error_code", Integer.valueOf(exceptionResult.getErrorCode()));
            newBuilder.addValuePair("error_msg", exceptionResult.getMsg());
            newBuilder.addValuePair("download_url", this.mRequestedUrl);
            newBuilder.addValuePair("host_ip", this.mRemoteIp);
            newBuilder.addValuePair("effect_platform_type", (Integer) 0);
            iMonitorService.monitorStatusRate("category_list_success_rate", 1, newBuilder.build());
        }
    }

    private void saveEffectList(CategoryEffectListResponse categoryEffectListResponse) {
        try {
            this.size = this.mFileCache.save(EffectCacheKeyGenerator.generateCategoryEffectKey(this.panel, this.category, this.count, this.cursor, this.sortingPosition), this.mJsonConverter.convertObjToJson(categoryEffectListResponse)) / EffectConstants.KB;
        } catch (Exception e) {
            EPLog.e("FetchCategoryEffectTask", Log.getStackTraceString(e));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", categoryEffectListResponse.getData().getCategoryEffects().getVersion());
            jSONObject.put("cursor", categoryEffectListResponse.getData().getCategoryEffects().getCursor());
            jSONObject.put("sorting_position", categoryEffectListResponse.getData().getCategoryEffects().getSortingPosition());
            this.mFileCache.save(EffectCacheKeyGenerator.generateCategoryVersionKey(this.panel, this.category), jSONObject.toString());
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public FetchCategoryEffectTask(EffectContext effectContext, String str, String str2, String str3, int i, int i2, int i3, String str4, Handler handler) {
        super(handler, str2);
        this.panel = str;
        this.category = str3;
        this.count = i;
        this.cursor = i2;
        this.sortingPosition = i3;
        this.version = str4;
        this.mEffectContext = effectContext;
        EffectConfiguration effectConfiguration = effectContext.getEffectConfiguration();
        this.mConfiguration = effectConfiguration;
        this.mFileCache = effectConfiguration.getCache();
        this.mJsonConverter = this.mConfiguration.getJsonConverter();
        this.monitorService = this.mConfiguration.getMonitorService();
        this.mCurCnt = this.mConfiguration.getRetryCount();
        this.requestStrategy = this.mConfiguration.getRequestStrategy();
    }
}
