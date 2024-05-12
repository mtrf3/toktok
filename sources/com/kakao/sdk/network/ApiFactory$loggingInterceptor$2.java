package com.kakao.sdk.network;

import X.AbstractC65781Prl;
import X.C64575PVz;
import X.InterfaceC65784Pro;
import X.PPJ;
import X.PW2;
import com.kakao.sdk.common.util.SdkLog;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ApiFactory$loggingInterceptor$2 extends AbstractC65781Prl implements InterfaceC65784Pro<C64575PVz> {
    public static final ApiFactory$loggingInterceptor$2 INSTANCE = new ApiFactory$loggingInterceptor$2();

    public ApiFactory$loggingInterceptor$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final C64575PVz invoke() {
        C64575PVz c64575PVz = new C64575PVz(new PW2() { // from class: com.kakao.sdk.network.ApiFactory$loggingInterceptor$2$interceptor$1
            @Override // X.PW2
            public void log(String message) {
                o.LJIIIZ(message, "message");
                SdkLog.Companion.i(message);
            }
        });
        PPJ ppj = PPJ.HEADERS;
        if (ppj != null) {
            c64575PVz.LIZJ = ppj;
            return c64575PVz;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }
}
