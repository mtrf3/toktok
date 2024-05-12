package X;

import com.ss.android.ugc.aweme.web.realtimeres.AdLandPageRealtimeResourceModule;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.web.realtimeres.AdLandPageRealtimeResourceModule$preconnctUrl$1", f = "AdLandPageRealtimeResourceModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EHR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AdLandPageRealtimeResourceModule LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EHR(AdLandPageRealtimeResourceModule adLandPageRealtimeResourceModule, String str, InterfaceC67352kd<? super EHR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = adLandPageRealtimeResourceModule;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EHR(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJII(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
