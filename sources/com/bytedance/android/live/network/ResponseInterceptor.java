package com.bytedance.android.live.network;

import X.C31061CGz;
import X.C64797Pbt;
import X.C64908Pdg;
import X.C65132PhI;
import X.EJ6;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import com.bytedance.retrofit2.client.Request;
import java.util.LinkedList;

/* loaded from: classes12.dex */
public class ResponseInterceptor implements InterfaceC37216Ej6 {
    public static ResponseInterceptor LIZ() {
        return new ResponseInterceptor();
    }

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt intercept(FBZ fbz) {
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        if (C65132PhI.LIZJ(request)) {
            LinkedList linkedList = new LinkedList(request.getHeaders());
            linkedList.add(new EJ6("response-format", "protobuf"));
            C64908Pdg newBuilder = request.newBuilder();
            newBuilder.LIZJ = linkedList;
            request = newBuilder.LIZ();
        }
        C64797Pbt LIZ = f7s.LIZ(request);
        C31061CGz.LIZIZ(request, LIZ, 1);
        return LIZ;
    }
}
