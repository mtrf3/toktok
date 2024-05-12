package X;

import Y.IDxS126S0200000_1;
import fjb.a;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AqS151S0100000_1;

@InterfaceC65848Psq(c = "kotlinx.coroutines.rx2.RxConvertKt$asFlow$1", f = "RxConvert.kt", l = {95}, m = "invokeSuspend")
/* renamed from: X.4gQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115704gQ extends AbstractC65782Prm implements InterfaceC88471Ynr<C3CK<Object>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC115714gR<Object> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C115704gQ(InterfaceC115714gR<Object> interfaceC115714gR, InterfaceC67352kd<? super C115704gQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC115714gR;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C115704gQ c115704gQ = new C115704gQ(this.LJLJI, interfaceC67352kd);
        c115704gQ.LJLILLLLZI = obj;
        return c115704gQ;
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
            C3CK c3ck = (C3CK) this.LJLILLLLZI;
            AtomicReference atomicReference = new AtomicReference();
            this.LJLJI.LIZ(new IDxS126S0200000_1(c3ck, atomicReference, 0));
            AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(atomicReference, (AtomicReference<InterfaceC92693kP>) 23);
            this.LJLIL = 1;
            if (C3T0.LIZ(c3ck, aqS151S0100000_1, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3CK<Object> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c3ck, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
