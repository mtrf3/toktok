package com.bytedance.apm.ttnet;

import X.C17N;
import X.C64092PDk;
import X.C64094PDm;
import X.C64797Pbt;
import X.C64908Pdg;
import X.C77800Ug8;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class TTNetSampleInterceptor implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt intercept(FBZ fbz) {
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        if (C17N.LJJIIZI(request.headers("x-tt-trace-log"))) {
            C64092PDk c64092PDk = C64094PDm.LIZ;
            if (c64092PDk.LJZL) {
                if (c64092PDk.LJIILL() && c64092PDk.LJLJLLL) {
                    return f7s.LIZ(LIZ(request, "01"));
                }
                if (c64092PDk.LJLJLJ == 1 && c64092PDk.LJLJLLL) {
                    return f7s.LIZ(LIZ(request, "02"));
                }
            }
        }
        return f7s.LIZ(request);
    }

    public static Request LIZ(Request request, String str) {
        ArrayList arrayList = new ArrayList(request.getHeaders());
        C64908Pdg newBuilder = request.newBuilder();
        C77800Ug8.LJFF("x-tt-trace-log", str, arrayList);
        newBuilder.LIZJ = arrayList;
        return newBuilder.LIZ();
    }
}
