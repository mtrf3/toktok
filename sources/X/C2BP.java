package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {377}, m = "invokeSuspend")
/* renamed from: X.2BP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C07070Pn<Object, Object> LJLJI;
    public final /* synthetic */ InterfaceC24760y8<C0Q2<Object>> LJLJJI;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC88472Yns<Object, C76800UCe>> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2BP(Object obj, C07070Pn<Object, Object> c07070Pn, InterfaceC24760y8<? extends C0Q2<Object>> interfaceC24760y8, InterfaceC24760y8<? extends InterfaceC88472Yns<Object, C76800UCe>> interfaceC24760y82, InterfaceC67352kd<? super C2BP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = obj;
        this.LJLJI = c07070Pn;
        this.LJLJJI = interfaceC24760y8;
        this.LJLJJL = interfaceC24760y82;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2BP(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            if (!o.LJ(this.LJLILLLLZI, this.LJLJI.LJ.getValue())) {
                C07070Pn<Object, Object> c07070Pn = this.LJLJI;
                Object obj2 = this.LJLILLLLZI;
                C0Q2<Object> value = this.LJLJJI.getValue();
                this.LJLIL = 1;
                if (C07070Pn.LIZIZ(c07070Pn, obj2, value, null, this, 12) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        InterfaceC88472Yns<Object, C76800UCe> value2 = this.LJLJJL.getValue();
        if (value2 != null) {
            value2.invoke(this.LJLJI.LIZJ());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
