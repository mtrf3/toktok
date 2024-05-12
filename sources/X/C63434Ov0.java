package X;

import com.bytedance.im.core.proto.AckMessage;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.ackmessage.MessageBatchAckUseCase$onNewMessageSaved$1", f = "MessageBatchAckUseCase.kt", l = {58}, m = "invokeSuspend")
/* renamed from: X.Ov0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63434Ov0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<C63374Ou2> LJLILLLLZI;
    public final /* synthetic */ C63630OyA LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63434Ov0(List<C63374Ou2> list, C63630OyA c63630OyA, int i, boolean z, InterfaceC67352kd<? super C63434Ov0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = c63630OyA;
        this.LJLJJI = i;
        this.LJLJJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63434Ov0(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            ArrayList LJFF = C1JX.LJFF(obj);
            try {
                for (C63374Ou2 c63374Ou2 : this.LJLILLLLZI) {
                    AckMessage LIZ = C63630OyA.LIZ(c63374Ou2.LIZ, this.LJLJJI, this.LJLJJL, c63374Ou2.LIZIZ);
                    if (LIZ != null) {
                        LJFF.add(LIZ);
                    }
                }
            } catch (IllegalStateException unused) {
            }
            if (!LJFF.isEmpty()) {
                C63630OyA c63630OyA = this.LJLJI;
                int i2 = this.LJLJJI;
                this.LJLIL = 1;
                if (c63630OyA.LJFF(i2, LJFF, this) == enumC58928NAu) {
                    return enumC58928NAu;
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
