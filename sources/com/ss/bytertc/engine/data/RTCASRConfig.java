package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public class RTCASRConfig {
    public String accessToken;
    public String appId;
    public ASRAuthorizationType authorizationType;
    public String cluster;
    public String secretKey;
    public String userId;

    /* loaded from: classes33.dex */
    public enum ASRAuthorizationType {
        ASR_AUTHORIZATION_TYPE_TOKEN(0),
        ASR_AUTHORIZATION_TYPE_SIGNATURE(1);

        public int value;

        public int value() {
            return this.value;
        }

        public static ASRAuthorizationType valueOf(String str) {
            return (ASRAuthorizationType) V0N.LJJJ(ASRAuthorizationType.class, str);
        }

        ASRAuthorizationType(int i) {
            this.value = i;
        }
    }

    public RTCASRConfig(String str, String str2, String str3, ASRAuthorizationType aSRAuthorizationType, String str4, String str5) {
        this.userId = str;
        this.accessToken = str2;
        this.secretKey = str3;
        this.authorizationType = aSRAuthorizationType;
        this.cluster = str4;
        this.appId = str5;
    }
}
