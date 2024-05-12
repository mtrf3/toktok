package com.ss.android.ugc.aweme.feed.api;

import X.C10K;
import X.C64797Pbt;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import Y.ACallableS109S0100000_6;
import com.bytedance.retrofit2.client.Request;
import ujb.s;

/* loaded from: classes7.dex */
public final class ComplianceEncryptCheckInterceptor implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        String url;
        Request request = ((F7S) fbz).LIZJ;
        if (request == null || (url = request.getUrl()) == null || !s.LJJJLZIJ(url, "cmpl_enc", false)) {
            C10K.LIZIZ(new ACallableS109S0100000_6(request, 1), C10K.LJIIIIZZ, null);
        }
        return ((F7S) fbz).LIZ(request);
    }
}
