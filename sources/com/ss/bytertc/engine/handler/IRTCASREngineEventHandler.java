package com.ss.bytertc.engine.handler;

import X.V0N;

/* loaded from: classes33.dex */
public interface IRTCASREngineEventHandler {
    void onError(int i, String str);

    void onMessage(String str);

    void onSuccess();

    /* loaded from: classes33.dex */
    public enum RTCASRErrorCode {
        NETWORK_INTERRUPTED(-1),
        ALREADY_STARTED(-2),
        TOKEN_EMPTY(-3),
        SIGNATURE_KEY_EMPTY(-4),
        USERID_NULL(-5),
        APPID_NULL(-6),
        CLUSTER_NULL(-7),
        OPERATION_DENIED(-8);

        public int value;

        public int value() {
            return this.value;
        }

        public static RTCASRErrorCode valueOf(String str) {
            return (RTCASRErrorCode) V0N.LJJJ(RTCASRErrorCode.class, str);
        }

        RTCASRErrorCode(int i) {
            this.value = i;
        }
    }
}
