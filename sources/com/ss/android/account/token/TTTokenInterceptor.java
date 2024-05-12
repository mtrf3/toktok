package com.ss.android.account.token;

import X.C64797Pbt;
import X.C64908Pdg;
import X.C66952QPk;
import X.EJ6;
import X.F7S;
import X.FBY;
import X.FBZ;
import X.InterfaceC37216Ej6;
import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class TTTokenInterceptor implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt intercept(FBZ fbz) {
        ArrayList arrayList;
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(request.getHeaders());
        Map LIZ = C66952QPk.LIZ(request.getUrl());
        if (LIZ != null && !LIZ.isEmpty()) {
            for (Map.Entry entry : LIZ.entrySet()) {
                if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                    arrayList2.add(new EJ6((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        C64908Pdg newBuilder = request.newBuilder();
        newBuilder.LIZJ = arrayList2;
        C64797Pbt LIZ2 = f7s.LIZ(newBuilder.LIZ());
        String url = request.getUrl();
        List<EJ6> list = LIZ2.LIZ.LIZLLL;
        if (list == null || list.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (EJ6 ej6 : list) {
                if (ej6 != null && !TextUtils.isEmpty(ej6.LIZ) && !TextUtils.isEmpty(ej6.LIZIZ)) {
                    arrayList.add(new FBY(ej6.LIZ, ej6.LIZIZ));
                }
            }
        }
        C66952QPk.LIZIZ(url, arrayList);
        return LIZ2;
    }
}
