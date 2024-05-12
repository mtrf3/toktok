package com.ss.android.ugc.aweme.infoSticker.customsticker.api;

import X.C44296Ha0;
import X.C60903NvH;
import X.C64626PXy;
import X.C64627PXz;
import X.C64797Pbt;
import X.C64908Pdg;
import X.EF7;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class CustomStickerNetInterceptor implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        C64626PXy LJIIJJI = C64626PXy.LJIIJJI(request.getUrl());
        if (LJIIJJI != null) {
            C64627PXz LJIIJ = LJIIJJI.LJIIJ();
            LJIIJ.LIZIZ("access_key", C60903NvH.LJIIJJI().LJIJI().LIZLLL());
            C60903NvH.LJIIJJI().getApplicationService().getClass();
            LJIIJ.LIZIZ("app_version", EF7.LIZLLL());
            LJIIJ.LIZIZ("app_language", IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage());
            C60903NvH.LJIIJJI().getRegionService();
            LJIIJ.LIZIZ("region", C44296Ha0.LIZ());
            String str = LJIIJ.LIZJ().LJIIIIZZ;
            o.LJIIIIZZ(str, "urlBuilder.build().toString()");
            C64908Pdg newBuilder = request.newBuilder();
            newBuilder.LIZJ(str);
            request = newBuilder.LIZ();
        }
        return f7s.LIZ(request);
    }
}
