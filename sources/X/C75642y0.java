package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.client.IMUseCaseClient$createSingleConversation$1", f = "IMUseCaseClient.kt", l = {286}, m = "invokeSuspend")
/* renamed from: X.2y0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75642y0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C63383OuB LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ InterfaceC86963bA<C63120Opw> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75642y0(C63383OuB c63383OuB, int i, long j, InterfaceC86963bA<C63120Opw> interfaceC86963bA, InterfaceC67352kd<? super C75642y0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c63383OuB;
        this.LJLJI = i;
        this.LJLJJI = j;
        this.LJLJJL = interfaceC86963bA;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75642y0(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            C63560Ox2 c63560Ox2 = this.LJLILLLLZI.LJIIIZ;
            int i2 = this.LJLJI;
            long j = this.LJLJJI;
            InterfaceC86963bA<C63120Opw> interfaceC86963bA = this.LJLJJL;
            this.LJLIL = 1;
            if (c63560Ox2.LIZJ(i2, j, interfaceC86963bA, this) == enumC58928NAu) {
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
