package X;

import fjb.a;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.elements.FormsKt$Forms$3$1", f = "Forms.kt", l = {188}, m = "invokeSuspend")
/* renamed from: X.aLD, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93087aLD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC35811ar<Integer> LJLILLLLZI;
    public final /* synthetic */ List<Integer> LJLJI;
    public final /* synthetic */ InterfaceC35811ar<Integer> LJLJJI;
    public final /* synthetic */ C31431Lf LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93087aLD(InterfaceC35811ar<Integer> interfaceC35811ar, List<Integer> list, InterfaceC35811ar<Integer> interfaceC35811ar2, C31431Lf c31431Lf, InterfaceC67352kd<? super C93087aLD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC35811ar;
        this.LJLJI = list;
        this.LJLJJI = interfaceC35811ar2;
        this.LJLJJL = c31431Lf;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93087aLD(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int intValue;
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
            if (this.LJLILLLLZI.getValue().intValue() == 0) {
                intValue = 0;
            } else {
                Iterator it = C91895a1z.LIZ(this.LJLILLLLZI.getValue().intValue(), this.LJLJI).iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = new Integer(((Number) next).intValue() + ((Number) it.next()).intValue());
                    }
                    intValue = ((Number) next).intValue();
                } else {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
            }
            int intValue2 = (intValue + this.LJLJJI.getValue().intValue()) - this.LJLJJL.LJ();
            if (intValue2 > 0) {
                AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                C93086aLC c93086aLC = new C93086aLC(this.LJLJJL, intValue2, null);
                this.LJLIL = 1;
                if (XKX.LJI(abstractC78621UtN, c93086aLC, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        this.LJLJJI.setValue(new Integer(0));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
