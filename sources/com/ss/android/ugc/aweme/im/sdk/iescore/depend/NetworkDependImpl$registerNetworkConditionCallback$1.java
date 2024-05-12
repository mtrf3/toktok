package com.ss.android.ugc.aweme.im.sdk.iescore.depend;

import X.AbstractC65782Prm;
import X.C141335gf;
import X.C2NU;
import X.C48203Ivv;
import X.C76452zJ;
import X.C76482zM;
import X.C76800UCe;
import X.EF7;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import androidx.lifecycle.ProcessLifecycleOwner;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.iescore.depend.NetworkDependImpl$registerNetworkConditionCallback$1", f = "NetworkDependImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NetworkDependImpl$registerNetworkConditionCallback$1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public NetworkDependImpl$registerNetworkConditionCallback$1(InterfaceC67352kd<? super NetworkDependImpl$registerNetworkConditionCallback$1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new NetworkDependImpl$registerNetworkConditionCallback$1(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C76482zM.LIZJ.set(C48203Ivv.LJ(EF7.LIZIZ()));
        C2NU.LIZ.LIZ(C76452zJ.LJLIL);
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new NetworkDependImpl$registerNetworkConditionCallback$1$lifecycleObserver$1());
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new NetworkDependImpl$registerNetworkConditionCallback$1(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
