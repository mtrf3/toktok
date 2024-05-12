package X;

import Y.IDfS126S0100000_1;
import com.ss.android.ugc.aweme.casting.ui.casting.CastingPanelComponent;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.casting.ui.casting.CastingPanelComponent$onParentViewCreated$1", f = "CastingPanelComponent.kt", l = {592}, m = "invokeSuspend")
/* renamed from: X.2qi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71122qi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CastingPanelComponent LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71122qi(CastingPanelComponent castingPanelComponent, InterfaceC67352kd<? super C71122qi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = castingPanelComponent;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71122qi(this.LJLILLLLZI, interfaceC67352kd);
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
            XLM xlm = C71042qa.LIZJ;
            IDfS126S0100000_1 iDfS126S0100000_1 = new IDfS126S0100000_1(this.LJLILLLLZI, 8);
            this.LJLIL = 1;
            if (xlm.collect(iDfS126S0100000_1, this) == enumC58928NAu) {
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
