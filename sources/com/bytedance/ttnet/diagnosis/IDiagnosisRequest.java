package com.bytedance.ttnet.diagnosis;

/* loaded from: classes9.dex */
public interface IDiagnosisRequest {
    void cancel();

    void doExtraCommand(String str, String str2);

    void setUserExtraInfo(String str);

    void start(IDiagnosisCallback iDiagnosisCallback);
}
