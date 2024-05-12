package com.ss.android.ugc.aweme.im.sdk.u16.controller;

import X.AV1;
import X.AbstractC73946T0k;
import X.C30Y;
import X.C4IE;
import X.C4IF;
import X.C73542Ste;
import X.C73969T1h;
import X.HG3;
import X.RBX;
import X.T16;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.sdk.u16.data.api.IMUnder16API;
import com.ss.android.ugc.aweme.im.service.IIMUnder16Proxy;
import kotlin.jvm.internal.AqS44S0110000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMUnder16ProxyImpl implements IIMUnder16Proxy {
    @Override // com.ss.android.ugc.aweme.im.service.IIMUnder16Proxy
    public final IMUnder16InitTask LIZ() {
        return new IMUnder16InitTask();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMUnder16Proxy
    public final boolean LIZIZ() {
        boolean z;
        C4IE.LIZ.getClass();
        Keva repo = Keva.getRepo("disable_im_under_sixteen_repo");
        o.LJIIIIZZ(repo, "getRepo(KEVA_REPO_NAME)");
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        Boolean bool = C4IE.LIZJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (isLogin) {
            z = repo.getBoolean("is_chat_function_off", false);
        } else {
            z = true;
        }
        C4IE.LIZJ = Boolean.valueOf(z);
        return z;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMUnder16Proxy
    public final void LIZJ() {
        C4IE.LIZ.getClass();
        Keva repo = Keva.getRepo("disable_im_under_sixteen_repo");
        o.LJIIIIZZ(repo, "getRepo(KEVA_REPO_NAME)");
        repo.storeBoolean("is_chat_function_off", false);
        C4IE.LIZIZ = false;
        C4IE.LIZJ = null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IIMUnder16Proxy
    public final void LIZLLL() {
        C4IE c4ie = C4IE.LIZ;
        AbstractC73946T0k LIZ = T16.LIZ();
        o.LJIIIIZZ(LIZ, "io()");
        AbstractC73946T0k LIZIZ = C73969T1h.LIZIZ();
        IMUnder16API.LIZ.getClass();
        IMUnder16API api = (IMUnder16API) RetrofitFactory.LIZLLL().LIZ(C30Y.LIZ).LJFF().LIZ.LIZ(IMUnder16API.class);
        c4ie.getClass();
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        Keva repo = Keva.getRepo("disable_im_under_sixteen_repo");
        o.LJIIIIZZ(repo, "getRepo(KEVA_REPO_NAME)");
        Boolean valueOf = Boolean.valueOf(AV1.LJIIJJI());
        o.LJIIIZ(api, "api");
        if (o.LJ(valueOf, Boolean.TRUE) || !isLogin) {
            return;
        }
        C73542Ste.LIZLLL(api.getUnder16Info().LJJIIJ(LIZ).LJIJJ(LIZIZ), C4IF.LJLIL, new AqS44S0110000_1(repo, isLogin, 3));
    }
}
