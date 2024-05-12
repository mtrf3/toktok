package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.elements.FormsKt$Forms$6$2", f = "Forms.kt", l = {505}, m = "invokeSuspend")
/* renamed from: X.aLB, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93085aLB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C92220a7E LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<Integer> LJLJI;
    public final /* synthetic */ List<C0ZJ> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93085aLB(C92220a7E c92220a7E, InterfaceC35811ar<Integer> interfaceC35811ar, List<C0ZJ> list, InterfaceC67352kd<? super C93085aLB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c92220a7E;
        this.LJLJI = interfaceC35811ar;
        this.LJLJJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93085aLB(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            if (this.LJLILLLLZI.LIZJ() == 1) {
                this.LJLIL = 1;
                if (C1JD.LIZJ(100L, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        this.LJLJI.setValue(new Integer(0));
        ((C0ZJ) ListProtector.get(this.LJLJJI, this.LJLJI.getValue().intValue())).LIZIZ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
