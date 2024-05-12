package X;

import com.ss.android.ugc.aweme.effectcreator.services.TiktokGifRepository;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.effectcreator.services.TiktokGifRepository$downloadGif$2", f = "TiktokGifRepository.kt", l = {170}, m = "invokeSuspend")
/* renamed from: X.amt, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94803amt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super ProviderEffect>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ TiktokGifRepository LJLJI;
    public final /* synthetic */ ProviderEffect LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94803amt(TiktokGifRepository tiktokGifRepository, ProviderEffect providerEffect, InterfaceC67352kd<? super C94803amt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = tiktokGifRepository;
        this.LJLJJI = providerEffect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94803amt(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            TiktokGifRepository tiktokGifRepository = this.LJLJI;
            ProviderEffect providerEffect = this.LJLJJI;
            this.LJLIL = tiktokGifRepository;
            this.LJLILLLLZI = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            tiktokGifRepository.effectPlatform.LJIIJ(providerEffect, new C94436agy(xks));
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super ProviderEffect> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
