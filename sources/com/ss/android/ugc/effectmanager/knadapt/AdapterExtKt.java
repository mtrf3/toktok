package com.ss.android.ugc.effectmanager.knadapt;

import X.XDH;
import android.accounts.NetworkErrorException;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.ss.android.ugc.effectmanager.common.utils.CloseUtil;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import java.io.InputStream;
import kotlin.jvm.internal.o;
import org.json.JSONException;

/* loaded from: classes16.dex */
public final class AdapterExtKt {
    public static final <T extends XDH<?>> T execute(EffectNetWorkerWrapper execute, EffectRequest effectRequest, IJsonConverter jsonConverter, Class<T> cls) {
        String str;
        o.LJIIJ(execute, "$this$execute");
        o.LJIIJ(jsonConverter, "jsonConverter");
        InputStream execute2 = execute.getIEffectNetWorker().execute(effectRequest);
        if (execute2 != null) {
            T t = (T) jsonConverter.convertJsonToObj(execute2, cls);
            CloseUtil.close(execute2);
            if (t != null) {
                int statusCode = t.getStatusCode();
                if (statusCode == 0) {
                    return t;
                }
                throw new StatusCodeException(statusCode, t.getResponseMessage());
            }
            throw new JSONException("Json convert fail");
        }
        if (NetworkUtils.isNetworkAvailable(execute.getContext())) {
            String str2 = null;
            if (effectRequest != null) {
                str = effectRequest.getErrorMsg();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                if (effectRequest != null) {
                    str2 = effectRequest.getErrorMsg();
                }
                throw new NetworkErrorException(str2);
            }
            throw new NetworkErrorException("Download error");
        }
        throw new Exception("network unavailable");
    }

    public static final <T extends XDH<?>> T parse(EffectNetWorkerWrapper parse, EffectRequest effectRequest, InputStream inputStream, IJsonConverter jsonConverter, Class<T> cls) {
        o.LJIIJ(parse, "$this$parse");
        o.LJIIJ(jsonConverter, "jsonConverter");
        if (inputStream != null) {
            T t = (T) jsonConverter.convertJsonToObj(inputStream, cls);
            if (t != null) {
                int statusCode = t.getStatusCode();
                if (statusCode == 0) {
                    return t;
                }
                throw new StatusCodeException(statusCode, t.getResponseMessage());
            }
            throw new JSONException("Json convert fail");
        }
        o.LJIIZILJ();
        throw null;
    }
}
