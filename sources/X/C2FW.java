package X;

import Y.IDfS20S0200000;
import fjb.a;
import kotlin.jvm.internal.IDqS420S0100000;

@InterfaceC65848Psq(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", l = {88}, m = "invokeSuspend")
/* renamed from: X.2FW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC24760y8<C10370av> LJLJI;
    public final /* synthetic */ C07070Pn<C10370av, C1JN> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2FW(InterfaceC24760y8<C10370av> interfaceC24760y8, C07070Pn<C10370av, C1JN> c07070Pn, InterfaceC67352kd<? super C2FW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC24760y8;
        this.LJLJJI = c07070Pn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2FW c2fw = new C2FW(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c2fw.LJLILLLLZI = obj;
        return c2fw;
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
            C3C3 LJJJJZI = C78966Uyw.LJJJJZI(new IDqS420S0100000(this.LJLJI, (InterfaceC24760y8<C10370av>) 157));
            IDfS20S0200000 iDfS20S0200000 = new IDfS20S0200000(this.LJLJJI, interfaceC70422pa, 5);
            this.LJLIL = 1;
            if (LJJJJZI.collect(iDfS20S0200000, this) == enumC58928NAu) {
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
