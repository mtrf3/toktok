package com.ss.android.ugc.effectmanager.common.network;

import X.X1D;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.common.utils.CloseUtil;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import java.io.InputStream;
import org.json.JSONException;

/* loaded from: classes16.dex */
public class EffectNetWorkerWrapper {
    public Context mContext;
    public IEffectNetWorker mIEffectNetWorker;

    public Context getContext() {
        return this.mContext;
    }

    public IEffectNetWorker getIEffectNetWorker() {
        return this.mIEffectNetWorker;
    }

    private void logRequestedUrl(EffectRequest effectRequest) {
        try {
            String replaceAll = effectRequest.getUrl().replaceAll("&?device_info=[^&]*", "");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("request url: ");
            LIZ.append(replaceAll);
            EPLog.d("EffectNetWorker", X1D.LIZIZ(LIZ));
        } catch (Exception e) {
            EPLog.e("EffectNetWorker", "error in print url", e);
        }
    }

    public InputStream execute(EffectRequest effectRequest) {
        logRequestedUrl(effectRequest);
        InputStream execute = this.mIEffectNetWorker.execute(effectRequest);
        if (execute == null) {
            if (NetworkUtils.isNetworkAvailable(this.mContext)) {
                if (TextUtils.isEmpty(effectRequest.getErrorMsg())) {
                    throw new RuntimeException("Download error");
                }
                throw new RuntimeException(effectRequest.getErrorMsg());
            }
            throw new RuntimeException("network unavailable");
        }
        return execute;
    }

    public void setIEffectNetWorker(IEffectNetWorker iEffectNetWorker) {
        this.mIEffectNetWorker = iEffectNetWorker;
    }

    public EffectNetWorkerWrapper(IEffectNetWorker iEffectNetWorker, Context context) {
        this.mIEffectNetWorker = iEffectNetWorker;
        this.mContext = context;
    }

    public <T extends BaseNetResponse> T execute(EffectRequest effectRequest, IJsonConverter iJsonConverter, Class<T> cls) {
        logRequestedUrl(effectRequest);
        InputStream execute = this.mIEffectNetWorker.execute(effectRequest);
        if (execute == null) {
            if (NetworkUtils.isNetworkAvailable(this.mContext)) {
                if (TextUtils.isEmpty(effectRequest.getErrorMsg())) {
                    throw new NetworkErrorException("Download error");
                }
                throw new NetworkErrorException(effectRequest.getErrorMsg());
            }
            throw new Exception("network unavailable");
        }
        T t = (T) iJsonConverter.convertJsonToObj(execute, cls);
        CloseUtil.close(execute);
        if (t != null) {
            int i = t.status_code;
            if (i == 0) {
                return t;
            }
            throw new StatusCodeException(i, t.message);
        }
        throw new JSONException("Json convert fail");
    }

    public <T extends BaseNetResponse> T parse(EffectRequest effectRequest, InputStream inputStream, IJsonConverter iJsonConverter, Class<T> cls) {
        T t = (T) iJsonConverter.convertJsonToObj(inputStream, cls);
        if (t != null) {
            int i = t.status_code;
            if (i == 0) {
                return t;
            }
            throw new StatusCodeException(i, t.message);
        }
        throw new JSONException("Json convert fail");
    }
}
