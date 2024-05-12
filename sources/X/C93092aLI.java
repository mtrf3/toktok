package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.elements.FormsKt$Forms$6$1$onNewWindowClose$1$1", f = "Forms.kt", l = {255}, m = "invokeSuspend")
/* renamed from: X.aLI, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93092aLI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC35811ar<Integer> LJLILLLLZI;
    public final /* synthetic */ List<C0ZJ> LJLJI;
    public final /* synthetic */ C05P LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93092aLI(InterfaceC35811ar<Integer> interfaceC35811ar, List<C0ZJ> list, C05P c05p, InterfaceC67352kd<? super C93092aLI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC35811ar;
        this.LJLJI = list;
        this.LJLJJI = c05p;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93092aLI(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            if (this.LJLILLLLZI.getValue().intValue() != -1) {
                ((C0ZJ) ListProtector.get(this.LJLJI, this.LJLILLLLZI.getValue().intValue())).LIZIZ();
                this.LJLIL = 1;
                if (C1JD.LIZJ(150L, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        C05P c05p = this.LJLJJI;
        if (c05p != null) {
            c05p.show();
        }
        this.LJLILLLLZI.setValue(new Integer(-1));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
