package X;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ies.powerpreload.task.DataTask$internalRun$3", f = "DataTask.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class X82 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC70422pa LJLIL;
    public InterfaceC70422pa LJLILLLLZI;
    public X81 LJLJI;
    public int LJLJJI;
    public final /* synthetic */ X85 LJLJJL;
    public final /* synthetic */ X83 LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X82(X85 x85, X83 x83, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = x85;
        this.LJLJJLL = x83;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIJ(completion, "completion");
        X82 x82 = new X82(this.LJLJJL, this.LJLJJLL, completion);
        x82.LJLIL = (InterfaceC70422pa) obj;
        return x82;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        X81<Object> x81;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJI;
        if (i != 0) {
            if (i == 1) {
                x81 = this.LJLJI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = this.LJLIL;
            X85 x85 = this.LJLJJL;
            x81 = x85.LJLJLLL;
            if (x81 != null) {
                X83 x83 = this.LJLJJLL;
                if (x85.LJLJJLL == null) {
                    new Bundle();
                }
                this.LJLILLLLZI = interfaceC70422pa;
                this.LJLJI = x81;
                this.LJLJJI = 1;
                obj = x83.LIZJ();
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        if (obj != null) {
            ((LiveData) x81.LIZ.LIZ).postValue(obj);
            return C76800UCe.LIZ;
        }
        throw new C37692Eqm("null cannot be cast to non-null type kotlin.Any");
    }
}
