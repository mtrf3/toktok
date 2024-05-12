package com.bytedance.pitaya.cep_engine;

import X.F9E;
import com.bytedance.pitaya.cep_engine.port.CepKeeper;

/* loaded from: classes7.dex */
public final class CepHostInfo extends F9E implements CepKeeper {
    public final double cepTaskSampling;

    public static /* synthetic */ CepHostInfo copy$default(CepHostInfo cepHostInfo, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = cepHostInfo.cepTaskSampling;
        }
        return cepHostInfo.copy(d);
    }

    public final CepHostInfo copy(double d) {
        return new CepHostInfo(d);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Double.valueOf(this.cepTaskSampling)};
    }

    public final double getCepTaskSampling() {
        return this.cepTaskSampling;
    }

    public CepHostInfo(double d) {
        this.cepTaskSampling = d;
    }
}
