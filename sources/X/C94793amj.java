package X;

import com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender;
import fjb.a;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.recovery.RecoveryImpl$onRestore$1$3$1", f = "RecoveryImpl.kt", l = {137, 138}, m = "invokeSuspend")
/* renamed from: X.amj, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94793amj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IDqS423S0100000_42 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94793amj(IDqS423S0100000_42 iDqS423S0100000_42, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iDqS423S0100000_42;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94793amj(this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    ((C94792ami) this.LJLILLLLZI.l0).LJLILLLLZI.restoring = false;
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            ICameraRender LIZ = C93939aYx.LIZ();
            this.LJLIL = 1;
            if (LIZ.awaitAlgorithm(true, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C3BJ<EnumC93946aZ4> c3bj = ((C94792ami) this.LJLILLLLZI.l0).LJLILLLLZI.recoveryEvent;
        EnumC93946aZ4 enumC93946aZ4 = EnumC93946aZ4.FinishRecovery;
        this.LJLIL = 2;
        if (c3bj.emit(enumC93946aZ4, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        ((C94792ami) this.LJLILLLLZI.l0).LJLILLLLZI.restoring = false;
        return C76800UCe.LIZ;
    }
}
