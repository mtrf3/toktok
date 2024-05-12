package com.ss.android.ugc.aweme.net.interceptor;

import X.C64626PXy;
import X.C64627PXz;
import X.C64797Pbt;
import X.C64908Pdg;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;

/* loaded from: classes7.dex */
public class DevicesNullInterceptorTTNet implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt intercept(FBZ fbz) {
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        C64626PXy LJIIJJI = C64626PXy.LJIIJJI(request.getUrl());
        C64627PXz LJIIJ = LJIIJJI.LJIIJ();
        if (TextUtils.equals("", LJIIJJI.LJIILL("device_id"))) {
            LJIIJ.LJFF("device_id");
            LJIIJJI = LJIIJ.LIZJ();
        }
        C64908Pdg newBuilder = request.newBuilder();
        newBuilder.LIZJ(LJIIJJI.LJIIIIZZ);
        return f7s.LIZ(newBuilder.LIZ());
    }
}
