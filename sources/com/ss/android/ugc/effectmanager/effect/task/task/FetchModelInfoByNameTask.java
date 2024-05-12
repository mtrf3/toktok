package com.ss.android.ugc.effectmanager.effect.task.task;

import X.AnonymousClass636;
import X.C113554cx;
import X.OSZ;
import X.X1D;
import android.os.Message;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.WeakHandler;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import com.ss.android.ugc.effectmanager.model.FetchSingleAlgorithmModelTaskResult;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import java.io.InputStream;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ujb.o;

/* loaded from: classes16.dex */
public final class FetchModelInfoByNameTask extends NormalTask implements WeakHandler.IHandler {
    public final String bigVersion;
    public final int businessId;
    public final DownloadableModelConfig config;
    public final String modelName;
    public final String taskFlag;
    public final WeakHandler weakHandler;

    private final EffectRequest buildEffectRequest() {
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("sdk_version", this.config.getSdkVersion()), new OSZ("device_type", this.config.getDeviceType()), new OSZ("device_platform", "android"), new OSZ("status", String.valueOf(this.config.getModelFileEnv().ordinal())), new OSZ("name", this.modelName));
        int i = this.businessId;
        if (i > 0) {
            LJJLIIIIJ.put("busi_id", String.valueOf(i));
        }
        EffectConfiguration effectConfiguration = this.config.getEffectConfiguration();
        if (effectConfiguration != null) {
            LJJLIIIIJ.putAll(EffectRequestUtil.INSTANCE.addCommonParams(effectConfiguration));
        }
        String str = this.bigVersion;
        if (str != null && (true ^ o.LJJJJJL(str))) {
            LJJLIIIIJ.put("big_version", str);
        }
        Object obj = ListProtector.get(this.config.getHosts(), 0);
        kotlin.jvm.internal.o.LJFF(obj, "config.hosts[0]");
        String itemName = ((Host) obj).getItemName();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(itemName);
        LIZ.append("/model/api/model");
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(LJJLIIIIJ, X1D.LIZIZ(LIZ)));
    }

    @Override // com.ss.android.ugc.effectmanager.common.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public final SingleAlgorithmModelResponse runDirectly() {
        SingleAlgorithmModelResponse singleAlgorithmModelResponse;
        EffectRequest buildEffectRequest = buildEffectRequest();
        IEffectNetWorker effectNetWorker = this.config.getEffectNetWorker();
        if (effectNetWorker == null) {
            onFail(new ExceptionResult(10011));
            return null;
        }
        try {
            InputStream execute = effectNetWorker.execute(buildEffectRequest);
            if (execute == null) {
                onFail(new ExceptionResult(10002));
                return null;
            }
            try {
                IJsonConverter jsonConverter = this.config.getJsonConverter();
                if (jsonConverter == null || (singleAlgorithmModelResponse = (SingleAlgorithmModelResponse) jsonConverter.convertJsonToObj(execute, SingleAlgorithmModelResponse.class)) == null) {
                    onFail(new ExceptionResult(10008));
                    singleAlgorithmModelResponse = null;
                } else {
                    onSuccess(singleAlgorithmModelResponse);
                }
                AnonymousClass636.LJFF(execute, null);
                return singleAlgorithmModelResponse;
            } finally {
            }
        } catch (Exception e) {
            EPLog.e("FetchModelInfoByNameTask", "fetch single model info failed!", e);
            onFail(new ExceptionResult(e));
            return null;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        runDirectly();
    }

    private final void onFail(ExceptionResult exceptionResult) {
        sendMessage(70, new FetchSingleAlgorithmModelTaskResult(null, exceptionResult));
    }

    private final void onSuccess(SingleAlgorithmModelResponse singleAlgorithmModelResponse) {
        sendMessage(70, new FetchSingleAlgorithmModelTaskResult(singleAlgorithmModelResponse, null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchModelInfoByNameTask(DownloadableModelConfig config, String modelName, int i, String str, String str2, WeakHandler weakHandler) {
        super(weakHandler, str2);
        kotlin.jvm.internal.o.LJIIJ(config, "config");
        kotlin.jvm.internal.o.LJIIJ(modelName, "modelName");
        this.config = config;
        this.modelName = modelName;
        this.businessId = i;
        this.bigVersion = str;
        this.taskFlag = str2;
        this.weakHandler = weakHandler;
    }

    public /* synthetic */ FetchModelInfoByNameTask(DownloadableModelConfig downloadableModelConfig, String str, int i, String str2, String str3, WeakHandler weakHandler, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(downloadableModelConfig, str, i, (i2 & 8) != 0 ? null : str2, str3, weakHandler);
    }
}
