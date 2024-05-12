package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailDescriptionAssem;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailDescriptionAssem$setupCollectionHeaderUI$imageLoadCallback$1$onComplete$videoPrepJob$1", f = "PaidContentCollectionDetailDescriptionAssem.kt", l = {801, 803}, m = "invokeSuspend")
/* renamed from: X.A2q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25592A2q extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PaidContentCollectionDetailDescriptionAssem LJLILLLLZI;
    public final /* synthetic */ PaidVideoItem LJLJI;
    public final /* synthetic */ CollectionDetailModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25592A2q(PaidContentCollectionDetailDescriptionAssem paidContentCollectionDetailDescriptionAssem, PaidVideoItem paidVideoItem, CollectionDetailModel collectionDetailModel, InterfaceC67352kd<? super C25592A2q> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = paidContentCollectionDetailDescriptionAssem;
        this.LJLJI = paidVideoItem;
        this.LJLJJI = collectionDetailModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C25592A2q(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            if (!this.LJLILLLLZI.A3().getHasPrepared()) {
                this.LJLIL = 1;
                if (C1JD.LIZJ(1000L, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        C25591A2p c25591A2p = new C25591A2p(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, null);
        this.LJLIL = 2;
        if (XKX.LJI(abstractC78621UtN, c25591A2p, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
