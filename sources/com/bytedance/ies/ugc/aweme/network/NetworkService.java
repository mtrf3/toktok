package com.bytedance.ies.ugc.aweme.network;

import X.C10K;
import X.C16880lQ;
import X.C1E4;
import X.C58096Mr6;
import X.C64756PbE;
import X.C64829PcP;
import X.C64830PcQ;
import X.C64854Pco;
import X.C64910Pdi;
import X.EP7;
import X.X1D;
import Y.ACallableS114S0100000_11;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptorTTNet;
import com.ss.android.ugc.aweme.network.INetwork;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public class NetworkService implements INetwork {
    public static INetwork LJI() {
        Object LIZ = C58096Mr6.LIZ(INetwork.class, false);
        if (LIZ != null) {
            return (INetwork) LIZ;
        }
        return new NetworkService();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final ApiAlisgInterceptorTTNet LJ() {
        return new ApiAlisgInterceptorTTNet();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final C64830PcQ getConfig() {
        return (C64830PcQ) C64829PcP.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final long LIZ() {
        return C1E4.LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final int LIZJ() {
        return C1E4.LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final void LJFF() {
        C64829PcP.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final void LIZIZ(long j) {
        if (!C64829PcP.LIZIZ || !C64829PcP.LIZLLL) {
            return;
        }
        try {
            TTNetInit.setALogFuncAddr(j);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final void LIZLLL(C64756PbE c64756PbE, Executor executor) {
        C64756PbE.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("create disk cache, cache directory: ");
        LIZ.append((String) null);
        LIZ.append(", max size: ");
        LIZ.append(0L);
        X1D.LIZIZ(LIZ);
        C64854Pco.LIZ = new C64910Pdi();
        C10K.LIZIZ(new ACallableS114S0100000_11(c64756PbE, 4), executor, null).LIZLLL(EP7.LIZ);
    }
}
