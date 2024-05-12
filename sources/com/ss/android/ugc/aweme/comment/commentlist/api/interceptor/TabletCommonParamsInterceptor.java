package com.ss.android.ugc.aweme.comment.commentlist.api.interceptor;

import X.C36922EeM;
import X.C64550PVa;
import X.C64626PXy;
import X.C64627PXz;
import X.C64629PYb;
import X.C64797Pbt;
import X.C64908Pdg;
import X.F7S;
import X.FBZ;
import X.FLT;
import X.InterfaceC37216Ej6;
import X.LFH;
import X.PVP;
import X.PVR;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TabletCommonParamsInterceptor implements InterfaceC37216Ej6 {
    public static Request LIZ(Request request) {
        PVP requestBody = request.getRequestBody();
        o.LJII(requestBody, "null cannot be cast to non-null type okhttp3.FormBody");
        C64550PVa c64550PVa = (C64550PVa) requestBody;
        C64629PYb c64629PYb = new C64629PYb();
        int size = c64550PVa.LIZ.size();
        for (int i = 0; i < size; i++) {
            c64629PYb.LIZIZ(c64550PVa.LJFF(i), (String) ListProtector.get(c64550PVa.LIZIZ, i));
        }
        FLT LJIJ = LFH.LIZIZ.LIZLLL().LJIJ();
        int LIZLLL = LJIJ.LIZLLL();
        int LIZ = LJIJ.LIZ();
        c64629PYb.LIZIZ("is_pad", String.valueOf(LIZLLL));
        c64629PYb.LIZIZ("is_landscape", String.valueOf(LIZ));
        C64550PVa c64550PVa2 = new C64550PVa(c64629PYb.LIZ, c64629PYb.LIZIZ);
        C64908Pdg newBuilder = request.newBuilder();
        newBuilder.LIZIZ("POST", new PVR(c64550PVa2));
        return newBuilder.LIZ();
    }

    public static Request LIZIZ(Request request) {
        C64626PXy LJIIJJI = C64626PXy.LJIIJJI(request.getUrl());
        if (LJIIJJI != null) {
            Set<String> LJIILLIIL = LJIIJJI.LJIILLIIL();
            C64627PXz LJIIJ = LJIIJJI.LJIIJ();
            for (String str : LJIILLIIL) {
                Iterator<String> it = LJIIJJI.LJIIZILJ(str).iterator();
                while (it.hasNext()) {
                    LJIIJ.LIZIZ(str, it.next());
                }
            }
            FLT LJIJ = LFH.LIZIZ.LIZLLL().LJIJ();
            int LIZLLL = LJIJ.LIZLLL();
            int LIZ = LJIJ.LIZ();
            LJIIJ.LIZIZ("is_pad", String.valueOf(LIZLLL));
            LJIIJ.LIZIZ("is_landscape", String.valueOf(LIZ));
            C64908Pdg newBuilder = request.newBuilder();
            newBuilder.LIZJ(LJIIJ.LIZJ().LJIIIIZZ);
            return newBuilder.LIZ();
        }
        return request;
    }

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        Request request = ((F7S) fbz).LIZJ;
        if (request != null) {
            try {
                if (o.LJ(request.getMethod(), "POST") && (request.getRequestBody() instanceof C64550PVa)) {
                    request = LIZ(request);
                } else {
                    request = LIZIZ(request);
                }
            } catch (Throwable th) {
                C36922EeM.LJFF(th);
            }
        }
        return ((F7S) fbz).LIZ(request);
    }
}
