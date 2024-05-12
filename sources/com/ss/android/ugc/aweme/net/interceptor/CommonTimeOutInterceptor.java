package com.ss.android.ugc.aweme.net.interceptor;

import X.C48153Iv7;
import X.C64697PaH;
import X.C64797Pbt;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.net.experiment.NetTimeOutExperiment;

/* loaded from: classes12.dex */
public final class CommonTimeOutInterceptor implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        C64697PaH c64697PaH;
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        NetTimeOutExperiment.NetTimeOutConfig netTimeOutConfig = NetTimeOutExperiment.LIZ;
        if (netTimeOutConfig.pathList.contains(request.getPath())) {
            Object extraInfo = request.getExtraInfo();
            if (extraInfo == null) {
                extraInfo = new C48153Iv7();
                request.setExtraInfo(extraInfo);
            }
            if ((extraInfo instanceof C64697PaH) && (c64697PaH = (C64697PaH) extraInfo) != null) {
                c64697PaH.LJIIIIZZ = netTimeOutConfig.protectLimit;
                c64697PaH.LJFF = netTimeOutConfig.connectLimit;
                c64697PaH.LJII = netTimeOutConfig.readLimit;
                c64697PaH.LJI = netTimeOutConfig.writeLimit;
            }
        }
        return f7s.LIZ(request);
    }
}
