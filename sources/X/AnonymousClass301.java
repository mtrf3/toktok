package X;

import fjb.a;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@InterfaceC65848Psq(c = "com.bytedance.im.core.client.IMUseCaseClient$checkConversationCompleteness$1", f = "IMUseCaseClient.kt", l = {350}, m = "invokeSuspend")
/* renamed from: X.301, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass301 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C63383OuB LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass301(C63383OuB c63383OuB, int i, InterfaceC67352kd<? super AnonymousClass301> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c63383OuB;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AnonymousClass301(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        java.util.Map<String, C63120Opw> map;
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
            C115284fk LJIILIIL = C115284fk.LJIILIIL();
            synchronized (LJIILIIL) {
                map = LJIILIIL.LIZ;
            }
            List<? extends C63120Opw> LLJI = ORZ.LLJI(((ConcurrentHashMap) map).values());
            AnonymousClass302 anonymousClass302 = this.LJLILLLLZI.LJIIJJI;
            int i2 = this.LJLJI;
            this.LJLIL = 1;
            if (anonymousClass302.LIZ(i2, LLJI, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
