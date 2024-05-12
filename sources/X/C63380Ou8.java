package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.client.IMUseCaseClient$getMessagesByUser$2", f = "IMUseCaseClient.kt", l = {264}, m = "invokeSuspend")
/* renamed from: X.Ou8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63380Ou8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C63383OuB LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ java.util.Map<String, Object> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63380Ou8(C63383OuB c63383OuB, int i, int i2, java.util.Map<String, ? extends Object> map, InterfaceC67352kd<? super C63380Ou8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c63383OuB;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = map;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63380Ou8(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            C63383OuB c63383OuB = this.LJLILLLLZI;
            C63364Ots c63364Ots = c63383OuB.LJII;
            int i2 = this.LJLJI;
            int i3 = this.LJLJJI;
            InterfaceC63396OuO LIZ = c63383OuB.LIZ(i2);
            java.util.Map<String, ? extends Object> map = this.LJLJJL;
            this.LJLIL = 1;
            C63291Osh.LIZ().getClass();
            if (c63364Ots.LIZIZ(i2, i3, LIZ, C63291Osh.LIZLLL(i2), false, map, this) == enumC58928NAu) {
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
