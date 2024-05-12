package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import X.X1D;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectQRCode;
import com.ss.android.ugc.effectmanager.effect.model.net.ScanQRCodeResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.ScanQRCodeTaskResult;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class FetchEffectInfoByQRCodeTask extends NormalTask {
    public EffectConfiguration mConfiguration;
    public int mCurCnt;
    public EffectContext mEffectContext;
    public final EffectQRCode mEffectQRCode;
    public IJsonConverter mJsonConverter;

    private EffectRequest buildEffectListRequest() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.mConfiguration.getSdkVersion())) {
            hashMap.put("sdk_version", this.mConfiguration.getSdkVersion());
        }
        hashMap.put("sec_id", URLEncoder.encode(JSONObjectProtectorUtils.getString(new JSONObject(this.mEffectQRCode.getQrCodeText()), "SecId")));
        if (!TextUtils.isEmpty(this.mConfiguration.getAppID())) {
            hashMap.put("aid", this.mConfiguration.getAppID());
        }
        String bestHostUrl = this.mEffectContext.getBestHostUrl();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(bestHostUrl);
        LIZ.append(this.mConfiguration.getApiAdress());
        LIZ.append("/tidyEffect/secId");
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(hashMap, X1D.LIZIZ(LIZ)));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        InputStream inputStream;
        try {
            EffectRequest buildEffectListRequest = buildEffectListRequest();
            while (true) {
                int i = this.mCurCnt;
                this.mCurCnt = i - 1;
                if (i != 0) {
                    try {
                    } catch (Exception e) {
                        if (this.mCurCnt == 0 || (e instanceof StatusCodeException)) {
                            onFail(new ExceptionResult(e));
                            return;
                        }
                    }
                    if (isCanceled()) {
                        onFail(new ExceptionResult(10001));
                        return;
                    }
                    try {
                        inputStream = this.mConfiguration.getEffectNetWorker().execute(buildEffectListRequest);
                        try {
                            ScanQRCodeResponse scanQRCodeResponse = (ScanQRCodeResponse) this.mConfiguration.getEffectNetWorker().parse(buildEffectListRequest, inputStream, this.mJsonConverter, ScanQRCodeResponse.class);
                            if (!scanQRCodeResponse.checkValue()) {
                                if (this.mCurCnt == 0) {
                                    onFail(new ExceptionResult(10002));
                                    FileUtils.INSTANCE.closeQuietly(inputStream);
                                    return;
                                }
                                FileUtils.INSTANCE.closeQuietly(inputStream);
                            } else {
                                ScanQRCodeResponse.DataNode dataNode = scanQRCodeResponse.data;
                                Effect effect = dataNode.effect.toEffect(dataNode.url_prefix);
                                EffectUtils.setEffectPath(this.mConfiguration.getEffectDir().getAbsolutePath(), Collections.singletonList(effect));
                                sendMessage(25, new ScanQRCodeTaskResult(effect, null));
                                FileUtils.INSTANCE.closeQuietly(inputStream);
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            FileUtils.INSTANCE.closeQuietly(inputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = null;
                    }
                } else {
                    return;
                }
            }
        } catch (JSONException e2) {
            onFail(new ExceptionResult(e2));
        }
    }

    private void onFail(ExceptionResult exceptionResult) {
        sendMessage(22, new ScanQRCodeTaskResult(null, exceptionResult));
    }

    public FetchEffectInfoByQRCodeTask(EffectContext effectContext, EffectQRCode effectQRCode, String str, Handler handler) {
        super(handler, str);
        this.mEffectContext = effectContext;
        EffectConfiguration effectConfiguration = effectContext.getEffectConfiguration();
        this.mConfiguration = effectConfiguration;
        this.mJsonConverter = effectConfiguration.getJsonConverter();
        this.mCurCnt = this.mConfiguration.getRetryCount();
        this.mEffectQRCode = effectQRCode;
    }
}
