package com.bytedance.pitaya.cep_engine.port;

import com.bytedance.pitaya.cep_engine.CepEngineResult;

/* loaded from: classes7.dex */
public interface CepAsyncListener extends CepKeeper {
    void onFinish(CepEngineResult cepEngineResult);
}
