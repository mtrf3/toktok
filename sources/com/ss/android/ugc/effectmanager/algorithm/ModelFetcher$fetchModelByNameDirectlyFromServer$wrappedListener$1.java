package com.ss.android.ugc.effectmanager.algorithm;

import X.C10I;
import X.C10K;
import X.C84418XBe;
import X.JBR;
import X.X1D;
import X.XDR;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1 implements XDR<ModelInfo> {
    public final /* synthetic */ boolean $downloadModelAfterFetch;
    public final /* synthetic */ XDR $listener;
    public final /* synthetic */ String $modelName;
    public final /* synthetic */ ModelFetcher this$0;

    @Override // X.XDR
    public void preProcess(ModelInfo response) {
        o.LJIIJ(response, "response");
    }

    @Override // X.XDR
    public void onSuccess(final ModelInfo response) {
        o.LJIIJ(response, "response");
        if (this.$downloadModelAfterFetch) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fetch model: ");
            LIZ.append(this.$modelName);
            LIZ.append(" info success!");
            EPLog.d("ModelFetcher", X1D.LIZIZ(LIZ));
            C10K.LIZJ(new Callable() { // from class: com.ss.android.ugc.effectmanager.algorithm.ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1$onSuccess$1
                @Override // java.util.concurrent.Callable
                public final Boolean call() {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new com.ss.android.ugc.effectmanager.model.ModelInfo(response));
                    return ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1.this.this$0.downloadAndUpdateModelList(null, arrayList, null).get(response.getName());
                }
            }).LJ(new C10I<Boolean, Void>() { // from class: com.ss.android.ugc.effectmanager.algorithm.ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1$onSuccess$2
                @Override // X.C10I
                public final Void then(C10K<Boolean> task) {
                    o.LJFF(task, "task");
                    if (task.LJIILJJIL()) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("download model: ");
                        EPLog.e("ModelFetcher", JBR.LJFF(LIZ2, ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1.this.$modelName, " failed!", LIZ2), task.LJIIJ());
                        XDR xdr = ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1.this.$listener;
                        if (xdr != null) {
                            xdr.onFail(response, new C84418XBe(task.LJIIJ()));
                            return null;
                        }
                        return null;
                    }
                    if (o.LJ(task.LJIIJJI(), Boolean.TRUE)) {
                        XDR xdr2 = ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1.this.$listener;
                        if (xdr2 == null) {
                            return null;
                        }
                        xdr2.onSuccess(response);
                        return null;
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("download model: ");
                    LIZ3.append(ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1.this.$modelName);
                    LIZ3.append(" failed with null!");
                    EPLog.e("ModelFetcher", X1D.LIZIZ(LIZ3));
                    XDR xdr3 = ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1.this.$listener;
                    if (xdr3 == null) {
                        return null;
                    }
                    xdr3.onFail(response, new C84418XBe(10002));
                    return null;
                }
            }, C10K.LJIIIIZZ, null);
            return;
        }
        XDR xdr = this.$listener;
        if (xdr == null) {
            return;
        }
        xdr.onSuccess(response);
    }

    @Override // X.XDR
    public void onFail(ModelInfo modelInfo, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        XDR xdr = this.$listener;
        if (xdr != null) {
            xdr.onFail(modelInfo, exception);
        }
    }

    public ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1(ModelFetcher modelFetcher, XDR xdr, boolean z, String str) {
        this.this$0 = modelFetcher;
        this.$listener = xdr;
        this.$downloadModelAfterFetch = z;
        this.$modelName = str;
    }
}
