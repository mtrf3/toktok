package X;

import androidx.lifecycle.LiveData;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tools.net.WeakNetOptUtilsKt$delayReturnWhenError$1$onChanged$1$1", f = "WeakNetOptUtils.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EGb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36133EGb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C36132EGa LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36133EGb(C36132EGa c36132EGa, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c36132EGa;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C36133EGb(this.LJLIL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C36134EGc c36134EGc = this.LJLIL.LJLILLLLZI;
        if (((Boolean) c36134EGc.LJLJI.invoke(((LiveData) c36134EGc.LJLJJLL.element).getValue())).booleanValue()) {
            C36132EGa c36132EGa = this.LJLIL;
            c36132EGa.LJLILLLLZI.LJLJJI.setValue(c36132EGa.LJLJJI);
        }
        return C76800UCe.LIZ;
    }
}
