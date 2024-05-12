package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl$fetchLocation$1$onFailed$1", f = "LocationServiceImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.XdC, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85262XdC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC56182M3e LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85262XdC(InterfaceC56182M3e interfaceC56182M3e, InterfaceC67352kd<? super C85262XdC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC56182M3e;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C85262XdC(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC56182M3e interfaceC56182M3e = this.LJLIL;
        if (interfaceC56182M3e != null) {
            interfaceC56182M3e.onError(new J0X("Location SDK is not available, make sure you have added it to your dependency", "location sdk", ""));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
