package X;

import Y.IDfS22S0200000_4;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.composable.PaidContentReviewListKt$PaidContentReviewSeeAllButton$1$1", f = "PaidContentReviewList.kt", l = {566}, m = "invokeSuspend")
/* renamed from: X.A4d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25631A4d extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ A4T LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25631A4d(A4T a4t, InterfaceC35811ar<Boolean> interfaceC35811ar, InterfaceC67352kd<? super C25631A4d> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = a4t;
        this.LJLJI = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C25631A4d(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C79863Bm c79863Bm = A4S.LIZIZ;
            IDfS22S0200000_4 iDfS22S0200000_4 = new IDfS22S0200000_4(this.LJLJI, this.LJLILLLLZI, 2);
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
