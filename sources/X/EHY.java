package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.ecommerce.live.TopLiveProductViewNew$setPreloadCover$1", f = "TopLiveProductViewNew.kt", l = {324}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EHY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ KSB LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EHY(KSB ksb, String str, InterfaceC67352kd<? super EHY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = ksb;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EHY(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C84657XKj c84657XKj = this.LJLILLLLZI.LJLLLLLL;
            if (c84657XKj != null) {
                this.LJLIL = 1;
                if (c84657XKj.LJJIJ(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        this.LJLILLLLZI.setCover(this.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}