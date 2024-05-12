package com.ss.android.ugc.aweme.net.interceptor;

import X.C55376LoK;
import X.C55511LqV;
import X.C56662Kg;
import X.C64626PXy;
import X.C64627PXz;
import X.C64797Pbt;
import X.C64908Pdg;
import X.FBZ;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.retrofit2.client.Request;

/* loaded from: classes12.dex */
public class AwemeSplashParamsCronetInterceptor extends FeedBaseCronetInterceptor {
    @Override // com.ss.android.ugc.aweme.net.interceptor.FeedBaseCronetInterceptor
    public final C64797Pbt LIZ(FBZ fbz) {
        if (!SplashSettingServiceImpl.LJII().LJFF()) {
            return fbz.LIZ(fbz.request());
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!C55376LoK.LIZ) {
            Object obj = C55376LoK.LIZIZ;
            synchronized (obj) {
                if (!C55376LoK.LIZ) {
                    try {
                        obj.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        Request request = fbz.request();
        String str = C55511LqV.LIZLLL;
        Long l = C55511LqV.LJ;
        if (!TextUtils.isEmpty(str) || l != null) {
            C64627PXz LJIIJ = C64626PXy.LJIIJJI(request.getUrl()).LJIIJ();
            if (!TextUtils.isEmpty(str)) {
                LJIIJ.LJIIIIZZ("top_view_cid", str);
            }
            if (l != null) {
                LJIIJ.LJIIIIZZ("top_view_aid", String.valueOf(l));
            }
            C64626PXy LIZJ = LJIIJ.LIZJ();
            C64908Pdg newBuilder = request.newBuilder();
            newBuilder.LIZJ(LIZJ.LJIIIIZZ);
            request = newBuilder.LIZ();
        }
        C56662Kg.LIZ().LIZLLL(System.currentTimeMillis() - currentTimeMillis, "aweme_splash_params_interceptor_duration");
        return fbz.LIZ(request);
    }
}
