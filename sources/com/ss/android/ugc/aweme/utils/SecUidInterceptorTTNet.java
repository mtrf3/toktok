package com.ss.android.ugc.aweme.utils;

import X.C16880lQ;
import X.C40515FvD;
import X.C64626PXy;
import X.C64627PXz;
import X.C64797Pbt;
import X.C64908Pdg;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;

/* loaded from: classes7.dex */
public class SecUidInterceptorTTNet implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt intercept(FBZ fbz) {
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        C64626PXy LJIIJJI = C64626PXy.LJIIJJI(request.getUrl());
        if (LJIIJJI != null) {
            C40515FvD.LIZJ().getClass();
            if (!C40515FvD.LJ()) {
                try {
                    C40515FvD.LJII(LJIIJJI.LJFF(), false);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            C64627PXz LJIIJ = LJIIJJI.LJIIJ();
            for (String str : C40515FvD.LIZJ) {
                String LJIILL = LJIIJJI.LJIILL(str);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("sec_");
                LIZ.append(str);
                if (TextUtils.isEmpty(LJIIJJI.LJIILL(X1D.LIZIZ(LIZ)))) {
                    String LIZLLL = C40515FvD.LIZJ().LIZLLL(LJIILL);
                    if (!TextUtils.isEmpty(LIZLLL)) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("sec_");
                        LIZ2.append(str);
                        LJIIJ.LJIIIIZZ(X1D.LIZIZ(LIZ2), LIZLLL);
                    }
                }
            }
            C64908Pdg newBuilder = request.newBuilder();
            newBuilder.LIZJ(LJIIJ.LIZJ().LJIIIIZZ);
            request = newBuilder.LIZ();
        }
        return f7s.LIZ(request);
    }
}
