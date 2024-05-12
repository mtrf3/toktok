package X;

import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.common.popcard.AbsECLiveExplanationCardWidget$dealNewAtmosphereTags$2", f = "AbsECLiveExplanationCardWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Rx4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71206Rx4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractC71187Rwl LJLIL;
    public final /* synthetic */ AtmosphereTagInfo LJLILLLLZI;
    public final /* synthetic */ AtmosphereTag LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71206Rx4(AbstractC71187Rwl abstractC71187Rwl, AtmosphereTagInfo atmosphereTagInfo, AtmosphereTag atmosphereTag, InterfaceC67352kd<? super C71206Rx4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC71187Rwl;
        this.LJLILLLLZI = atmosphereTagInfo;
        this.LJLJI = atmosphereTag;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71206Rx4(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJIIZILJ().LJIILJJIL(this.LJLILLLLZI.tagType, this.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
