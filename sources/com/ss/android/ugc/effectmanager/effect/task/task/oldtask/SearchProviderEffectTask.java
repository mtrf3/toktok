package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.net.ProviderEffectListResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.ProviderEffectTaskResult;
import java.io.File;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;

/* loaded from: classes16.dex */
public class SearchProviderEffectTask extends NormalTask {
    public int count;
    public int cursor;
    public EffectConfiguration mConfiguration;
    public int mCurCnt;
    public EffectContext mEffectContext;
    public ICache mFileCache;
    public IJsonConverter mJsonConverter;
    public String mProviderName;
    public String mRemoteIp;
    public String mRequestedUrl;
    public String mSearchWord;
    public String mSelectedHost;

    private EffectRequest buildEffectListRequest() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.mConfiguration.getAccessKey())) {
            hashMap.put("access_key", this.mConfiguration.getAccessKey());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getAppVersion())) {
            hashMap.put("app_version", this.mConfiguration.getAppVersion());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getSdkVersion())) {
            hashMap.put("sdk_version", this.mConfiguration.getSdkVersion());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getChannel())) {
            hashMap.put("channel", this.mConfiguration.getChannel());
        }
        if (!TextUtils.isEmpty(this.mProviderName)) {
            hashMap.put("library", this.mProviderName);
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getPlatform())) {
            hashMap.put("device_platform", this.mConfiguration.getPlatform());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getDeviceId())) {
            hashMap.put("device_id", this.mConfiguration.getDeviceId());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getRegion())) {
            hashMap.put("region", this.mConfiguration.getRegion());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getDeviceType())) {
            hashMap.put("device_type", this.mConfiguration.getDeviceType());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getAppID())) {
            hashMap.put("aid", this.mConfiguration.getAppID());
        }
        if (!TextUtils.isEmpty(this.mConfiguration.getAppLanguage())) {
            hashMap.put("app_language", this.mConfiguration.getAppLanguage());
        }
        if (!TextUtils.isEmpty(this.mSearchWord)) {
            hashMap.put("word", this.mSearchWord);
        }
        hashMap.put("cursor", String.valueOf(this.cursor));
        hashMap.put("count", String.valueOf(this.count));
        this.mSelectedHost = this.mEffectContext.getBestHostUrl();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mSelectedHost);
        LIZ.append(this.mConfiguration.getApiAdress());
        LIZ.append("/stickers/search");
        String buildRequestUrl = NetworkUtils.buildRequestUrl(hashMap, X1D.LIZIZ(LIZ));
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

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        EffectRequest buildEffectListRequest = buildEffectListRequest();
        while (true) {
            int i = this.mCurCnt;
            this.mCurCnt = i - 1;
            if (i != 0) {
                try {
                } catch (Exception e) {
                    if (this.mCurCnt == 0 || (e instanceof StatusCodeException)) {
                        sendMessage(18, new ProviderEffectTaskResult(new ProviderEffectModel(), new ExceptionResult(e)));
                    }
                }
                if (isCanceled()) {
                    ExceptionResult exceptionResult = new ExceptionResult(10001);
                    exceptionResult.setTrackParams(this.mRequestedUrl, this.mSelectedHost, this.mRemoteIp);
                    sendMessage(18, new ProviderEffectTaskResult(new ProviderEffectModel(), exceptionResult));
                } else {
                    ProviderEffectListResponse providerEffectListResponse = (ProviderEffectListResponse) this.mConfiguration.getEffectNetWorker().execute(buildEffectListRequest, this.mJsonConverter, ProviderEffectListResponse.class);
                    if (!providerEffectListResponse.checkValue()) {
                        if (this.mCurCnt == 0) {
                            ExceptionResult exceptionResult2 = new ExceptionResult(10002);
                            exceptionResult2.setTrackParams(this.mRequestedUrl, this.mSelectedHost, this.mRemoteIp);
                            sendMessage(18, new ProviderEffectTaskResult(new ProviderEffectModel(), exceptionResult2));
                        } else {
                            continue;
                        }
                    } else {
                        ProviderEffectModel data = providerEffectListResponse.getData();
                        fillEffectPath(data);
                        sendMessage(18, new ProviderEffectTaskResult(data, null));
                    }
                }
                return;
            }
            return;
        }
        sendMessage(18, new ProviderEffectTaskResult(new ProviderEffectModel(), new ExceptionResult(e)));
    }

    private void fillEffectPath(ProviderEffectModel providerEffectModel) {
        if (providerEffectModel == null || providerEffectModel.getStickerList() == null) {
            return;
        }
        for (ProviderEffect providerEffect : providerEffectModel.getStickerList()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.mConfiguration.getEffectDir());
            LIZ.append(File.separator);
            LIZ.append(providerEffect.getId());
            LIZ.append(".gif");
            providerEffect.setPath(X1D.LIZIZ(LIZ));
        }
    }

    public SearchProviderEffectTask(EffectContext effectContext, String str, String str2, String str3, int i, int i2, Handler handler) {
        super(handler, str);
        this.mProviderName = str3;
        this.cursor = i;
        this.count = i2;
        this.mSearchWord = str2;
        this.mEffectContext = effectContext;
        EffectConfiguration effectConfiguration = effectContext.getEffectConfiguration();
        this.mConfiguration = effectConfiguration;
        this.mFileCache = effectConfiguration.getCache();
        this.mJsonConverter = this.mConfiguration.getJsonConverter();
        this.mCurCnt = this.mConfiguration.getRetryCount();
    }
}
