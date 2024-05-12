package X;

import fjb.a;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.elements.FormsKt$Forms$2", f = "Forms.kt", l = {161}, m = "invokeSuspend")
/* renamed from: X.aL9, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93083aL9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC35811ar<Integer> LJLILLLLZI;
    public final /* synthetic */ List<Integer> LJLJI;
    public final /* synthetic */ C31431Lf LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<Integer> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93083aL9(InterfaceC35811ar<Integer> interfaceC35811ar, List<Integer> list, C31431Lf c31431Lf, InterfaceC65784Pro<Integer> interfaceC65784Pro, InterfaceC67352kd<? super C93083aL9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC35811ar;
        this.LJLJI = list;
        this.LJLJJI = c31431Lf;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93083aL9(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer invoke;
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
            if (this.LJLILLLLZI.getValue().intValue() != -1) {
                Iterator it = C91895a1z.LIZ(this.LJLILLLLZI.getValue().intValue() + 1, this.LJLJI).iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = new Integer(((Number) next).intValue() + ((Number) it.next()).intValue());
                    }
                    int intValue2 = ((Number) next).intValue();
                    int LJ = intValue2 - this.LJLJJI.LJ();
                    InterfaceC65784Pro<Integer> interfaceC65784Pro = this.LJLJJL;
                    if (interfaceC65784Pro == null || (invoke = interfaceC65784Pro.invoke()) == null) {
                        intValue = 0;
                    } else {
                        intValue = invoke.intValue();
                    }
                    int i2 = LJ - intValue;
                    Iterator it2 = C91895a1z.LIZ(3, this.LJLJI).iterator();
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        while (it2.hasNext()) {
                            next2 = new Integer(((Number) next2).intValue() + ((Number) it2.next()).intValue());
                        }
                        int intValue3 = ((Number) next2).intValue();
                        if (i2 > 0) {
                            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                            C93082aL8 c93082aL8 = new C93082aL8(this.LJLJJI, intValue2, intValue3, null);
                            this.LJLIL = 1;
                            if (XKX.LJI(abstractC78621UtN, c93082aL8, this) == enumC58928NAu) {
                                return enumC58928NAu;
                            }
                        }
                    } else {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                } else {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
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
