package com.ss.android.ugc.aweme.opt;

import X.C38090ExC;
import X.C64797Pbt;
import X.C64908Pdg;
import X.EJ6;
import X.EOJ;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BackendApiCallerOptInterceptor implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        String str;
        C38090ExC c38090ExC = C38090ExC.LIZIZ;
        if (!c38090ExC.LIZ()) {
            F7S f7s = (F7S) fbz;
            return f7s.LIZ(f7s.LIZJ);
        }
        F7S f7s2 = (F7S) fbz;
        Request request = f7s2.LIZJ;
        if (request != null) {
            str = request.getPath();
        } else {
            str = null;
        }
        if (!c38090ExC.LIZIZ(str)) {
            return f7s2.LIZ(f7s2.LIZJ);
        }
        String string = EOJ.LIZ().getString("key_backend_params_data", "");
        o.LJIIIIZZ(string, "keva.getString(KEY_BACKEND_PARAMS_DATA, \"\")");
        if (string.length() == 0) {
            return f7s2.LIZ(request);
        }
        ArrayList arrayList = new ArrayList();
        List<EJ6> headers = request.getHeaders();
        o.LJIIIIZZ(headers, "request.headers");
        arrayList.addAll(headers);
        arrayList.add(new EJ6("x-opti-ut", string));
        C64908Pdg newBuilder = f7s2.LIZJ.newBuilder();
        newBuilder.LIZJ = arrayList;
        return f7s2.LIZ(newBuilder.LIZ());
    }
}
