package com.kakao.sdk.auth;

import X.InterfaceC65784Pro;
import com.kakao.sdk.common.util.SdkLog;

/* loaded from: classes12.dex */
public final class TokenManagerKt {
    public static final <T> T parseOrNull(InterfaceC65784Pro<? extends T> interfaceC65784Pro) {
        try {
            return interfaceC65784Pro.invoke();
        } catch (Exception e) {
            SdkLog.Companion.e(e);
            return null;
        }
    }
}
