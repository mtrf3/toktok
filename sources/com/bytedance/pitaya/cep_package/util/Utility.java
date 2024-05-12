package com.bytedance.pitaya.cep_package.util;

import com.bytedance.pitaya.cep_engine.port.CepKeeper;

/* loaded from: classes7.dex */
public interface Utility extends CepKeeper {
    void async(int i, long j);

    void download(String str, String str2, long j);

    void request(int i, String str, String str2, long j);

    void unzip(String str, String str2, long j);
}
