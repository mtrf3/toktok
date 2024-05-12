package com.kakao.sdk.network;

import X.C64598PWw;
import X.C64618PXq;
import X.InterfaceC48121Iub;
import X.PXZ;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ContextInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import okhttp3.Request;

/* loaded from: classes12.dex */
public final class KakaoAgentInterceptor implements InterfaceC48121Iub {
    public final ContextInfo contextInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public KakaoAgentInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final ContextInfo getContextInfo() {
        return this.contextInfo;
    }

    public KakaoAgentInterceptor(ContextInfo contextInfo) {
        o.LJIIIZ(contextInfo, "contextInfo");
        this.contextInfo = contextInfo;
    }

    @Override // X.InterfaceC48121Iub
    public C64598PWw intercept(PXZ chain) {
        o.LJIIIZ(chain, "chain");
        Request request = chain.request();
        String kaHeader = this.contextInfo.getKaHeader();
        C64618PXq newBuilder = request.newBuilder();
        newBuilder.LIZJ.LIZ("KA", kaHeader);
        C64598PWw LIZ = chain.LIZ(newBuilder.LIZIZ());
        o.LJIIIIZZ(LIZ, "chain.proceed(request)");
        return LIZ;
    }

    public /* synthetic */ KakaoAgentInterceptor(ContextInfo contextInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo() : contextInfo);
    }
}
