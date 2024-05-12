package com.ss.android.ugc.aweme.effectplatform;

import X.C64626PXy;
import X.C64627PXz;
import X.C64797Pbt;
import X.C64908Pdg;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import com.bytedance.retrofit2.client.Request;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EPRequestInterceptor implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        C64626PXy LJIIJJI = C64626PXy.LJIIJJI(request.getUrl());
        if (LJIIJJI != null) {
            C64627PXz LJIIJ = LJIIJJI.LJIIJ();
            LJIIJ.LJIIIIZZ("channel", EffectPlatform.LJJJJZ());
            String str = LJIIJ.LIZJ().LJIIIIZZ;
            o.LJIIIIZZ(str, "it.newBuilder().setQuery…nel()).build().toString()");
            C64908Pdg newBuilder = request.newBuilder();
            newBuilder.LIZJ(str);
            request = newBuilder.LIZ();
        }
        return f7s.LIZ(request);
    }
}
