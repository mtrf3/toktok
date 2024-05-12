package X;

import Y.IDfS22S0200000_4;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailReviewListAssem;
import fjb.a;
import kotlin.jvm.internal.AqS108S0300000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailReviewListAssem$onViewCreated$1$1", f = "PaidContentCollectionDetailReviewListAssem.kt", l = {229}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class A4D extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PaidContentCollectionDetailReviewListAssem LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLJI;
    public final /* synthetic */ InterfaceC35811ar<A4T> LJLJJI;
    public final /* synthetic */ InterfaceC35811ar<CollectionDetailModel> LJLJJL;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A4D(PaidContentCollectionDetailReviewListAssem paidContentCollectionDetailReviewListAssem, InterfaceC35811ar<Boolean> interfaceC35811ar, InterfaceC35811ar<A4T> interfaceC35811ar2, InterfaceC35811ar<CollectionDetailModel> interfaceC35811ar3, InterfaceC35811ar<Boolean> interfaceC35811ar4, InterfaceC67352kd<? super A4D> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = paidContentCollectionDetailReviewListAssem;
        this.LJLJI = interfaceC35811ar;
        this.LJLJJI = interfaceC35811ar2;
        this.LJLJJL = interfaceC35811ar3;
        this.LJLJJLL = interfaceC35811ar4;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new A4D(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
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
            AssemViewModel.asyncSubscribe$default(this.LJLILLLLZI.LJLILLLLZI.getValue(), new TBT() { // from class: X.A4C
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj2) {
                    return ((A3V) obj2).LJLILLLLZI;
                }
            }, null, null, null, new AqS108S0300000_4((InterfaceC35811ar) this.LJLJI, (InterfaceC35811ar<Boolean>) this.LJLJJI, (InterfaceC35811ar<A4T>) this.LJLJJL, (InterfaceC35811ar<CollectionDetailModel>) 18), 14, null);
            C79863Bm c79863Bm = A4S.LIZIZ;
            IDfS22S0200000_4 iDfS22S0200000_4 = new IDfS22S0200000_4(this.LJLJJLL, this.LJLJJL, 1);
            this.LJLIL = 1;
            if (c79863Bm.collect(iDfS22S0200000_4, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
