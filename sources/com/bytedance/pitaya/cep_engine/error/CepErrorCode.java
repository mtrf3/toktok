package com.bytedance.pitaya.cep_engine.error;

import X.V0N;
import com.bytedance.pitaya.cep_engine.port.CepKeeper;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public enum CepErrorCode implements CepKeeper {
    SUCCESS(0),
    NOT_SETUP(16),
    DUPLICATE_SETUP(17),
    UNZIP_FAILED(32),
    DOWNLOAD_FAILED(33),
    INVALID_BUSINESS_NAME(34),
    REGISTER_FAILED(49),
    CANT_FIND_CEP_INFO(50),
    INVALID_CEP_INFO(51),
    CEP_RESOURCE_ERR(52),
    INVALID_CEP_JSON(53),
    REQUEST_FAILED(65);

    public int code;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static CepErrorCode[] valuesCustom() {
        CepErrorCode[] valuesCustom = values();
        return (CepErrorCode[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final int getCode() {
        return this.code;
    }

    public static CepErrorCode valueOf(String value) {
        o.LJIIIZ(value, "value");
        return (CepErrorCode) V0N.LJJJ(CepErrorCode.class, value);
    }

    public final void setCode(int i) {
        this.code = i;
    }

    CepErrorCode(int i) {
        this.code = i;
    }
}
