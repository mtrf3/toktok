package X;

import com.bytedance.im.core.proto.SendMessageResponseBody;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.client.IMUseCaseClient$sendMessage$1", f = "IMUseCaseClient.kt", l = {313, 315}, m = "invokeSuspend")
/* renamed from: X.OuI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63390OuI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC86963bA<C109544Rq> LJLILLLLZI;
    public final /* synthetic */ C63383OuB LJLJI;
    public final /* synthetic */ C109544Rq LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63390OuI(InterfaceC86963bA<C109544Rq> interfaceC86963bA, C63383OuB c63383OuB, C109544Rq c109544Rq, InterfaceC67352kd<? super C63390OuI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC86963bA;
        this.LJLJI = c63383OuB;
        this.LJLJJI = c109544Rq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63390OuI(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                ((C3C5) obj).m15unboximpl();
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC86963bA<C109544Rq> interfaceC86963bA = this.LJLILLLLZI;
            if (interfaceC86963bA == null) {
                C63440Ov6 c63440Ov6 = C63537Owf.LJ;
                C63383OuB c63383OuB = this.LJLJI;
                InterfaceC117594jT interfaceC117594jT = c63383OuB.LIZIZ;
                C109544Rq c109544Rq = this.LJLJJI;
                C63686Oz4<SendMessageResponseBody> c63686Oz4 = c63383OuB.LJIILIIL;
                this.LJLIL = 1;
                if (c63440Ov6.LIZ(interfaceC117594jT, c109544Rq, c63686Oz4, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                C63440Ov6 c63440Ov62 = C63537Owf.LJ;
                C63383OuB c63383OuB2 = this.LJLJI;
                InterfaceC117594jT interfaceC117594jT2 = c63383OuB2.LIZIZ;
                C109544Rq c109544Rq2 = this.LJLJJI;
                C63686Oz4<SendMessageResponseBody> c63686Oz42 = c63383OuB2.LJIILIIL;
                this.LJLIL = 2;
                if (c63440Ov62.LIZIZ(interfaceC117594jT2, c109544Rq2, interfaceC86963bA, c63686Oz42, this) == enumC58928NAu) {
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
