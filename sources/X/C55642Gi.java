package X;

import Y.IDfS20S0200000;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.smallitem.LiveSmallSubItemBeautyListView$observeViewModel$1", f = "LiveSmallSubItemBeautyListView.kt", l = {176}, m = "invokeSuspend")
/* renamed from: X.2Gi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55642Gi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C260810q LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55642Gi(C260810q c260810q, InterfaceC67352kd<? super C55642Gi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c260810q;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C55642Gi c55642Gi = new C55642Gi(this.LJLJI, interfaceC67352kd);
        c55642Gi.LJLILLLLZI = obj;
        return c55642Gi;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            C260810q c260810q = this.LJLJI;
            XLM xlm = c260810q.LJIIL.LJLJJL;
            IDfS20S0200000 iDfS20S0200000 = new IDfS20S0200000(interfaceC70422pa, c260810q, 7);
            this.LJLIL = 1;
            if (xlm.collect(iDfS20S0200000, this) == enumC58928NAu) {
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
