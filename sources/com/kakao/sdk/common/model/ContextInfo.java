package com.kakao.sdk.common.model;

import com.google.gson.m;

/* loaded from: classes7.dex */
public interface ContextInfo {
    String getAppVer();

    m getExtras();

    String getKaHeader();

    byte[] getSalt();

    String getSigningKeyHash();
}
