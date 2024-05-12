package com.bytedance.pitaya.cep_package.port;

import com.bytedance.pitaya.cep_engine.port.CepKeeper;

/* loaded from: classes7.dex */
public interface CepPackageCallback extends CepKeeper {
    void onResult(boolean z, String str, CepPackageInfo cepPackageInfo);
}
