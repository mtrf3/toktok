package com.ss.android.ugc.aweme.bullet.module.p002default;

import X.C38559FBj;
import X.C38562FBm;
import X.C38563FBn;
import X.E8L;
import X.ENX;
import X.F3T;
import X.FBF;
import X.FBH;
import X.FBM;
import X.FCP;
import X.FCR;
import X.InterfaceC195747mE;
import X.InterfaceC37276Ek4;
import X.InterfaceC38565FBp;
import X.InterfaceC60298NlW;
import X.InterfaceC60304Nlc;
import com.bytedance.retrofit2.mime.TypedInput;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DefaultLynxKitDelegatesProvider implements InterfaceC60304Nlc {

    /* loaded from: classes7.dex */
    public interface LynxApi {
        @E8L
        InterfaceC37276Ek4<String> getDebugUrlData(@InterfaceC195747mE String str);

        @ENX
        @E8L
        InterfaceC37276Ek4<TypedInput> getUrlStream(@InterfaceC195747mE String str);
    }

    static {
        C38559FBj c38559FBj = (C38559FBj) C38559FBj.LIZIZ.getValue();
        new FBF();
        FBM provider = FBM.LJLIL;
        o.LJIIJ(provider, "provider");
        FBH fbh = new FBH(provider);
        c38559FBj.getClass();
        c38559FBj.LIZ = fbh;
    }

    @Override // X.InterfaceC60304Nlc
    public final void LIZ(F3T providerFactory) {
        o.LJIIJ(providerFactory, "providerFactory");
    }

    @Override // X.InterfaceC60304Nlc
    public final void LIZIZ(F3T providerFactory) {
        o.LJIIJ(providerFactory, "providerFactory");
    }

    @Override // X.InterfaceC60304Nlc
    public final InterfaceC60298NlW LIZJ(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return new C38562FBm();
    }

    @Override // X.InterfaceC60304Nlc
    public final InterfaceC38565FBp LIZLLL(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return new C38563FBn();
    }

    @Override // X.InterfaceC60304Nlc
    public final void LJ(F3T providerFactory) {
        o.LJIIJ(providerFactory, "providerFactory");
    }

    @Override // X.InterfaceC60281NlF
    public final FCR LJIIIIZZ(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return new FCP(this, providerFactory);
    }
}
