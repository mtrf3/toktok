package X;

import Y.IDfS126S0100000_1;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.share.panel.ui.viewholder.VerticalShareListViewHolder$bind$2", f = "VerticalShareListViewHolder.kt", l = {403}, m = "invokeSuspend")
/* renamed from: X.4Kh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107634Kh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC71762rk<EnumC107604Ke> LJLILLLLZI;
    public final /* synthetic */ C108904Pe LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C107634Kh(InterfaceC71762rk<? extends EnumC107604Ke> interfaceC71762rk, C108904Pe c108904Pe, InterfaceC67352kd<? super C107634Kh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC71762rk;
        this.LJLJI = c108904Pe;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C107634Kh(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            InterfaceC71762rk<EnumC107604Ke> interfaceC71762rk = this.LJLILLLLZI;
            if (interfaceC71762rk != null) {
                IDfS126S0100000_1 iDfS126S0100000_1 = new IDfS126S0100000_1(this.LJLJI, 30);
                this.LJLIL = 1;
                if (interfaceC71762rk.collect(iDfS126S0100000_1, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
