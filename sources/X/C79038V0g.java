package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.tux.compose.TuxTextKt$TuxText$7$1", f = "TuxText.kt", l = {163}, m = "invokeSuspend")
/* renamed from: X.V0g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79038V0g extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<C0VG> LJLJI;
    public final /* synthetic */ C08440Uu LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr<C08410Ur<String>, Boolean, C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C79038V0g(InterfaceC35811ar<C0VG> interfaceC35811ar, C08440Uu c08440Uu, InterfaceC88471Ynr<? super C08410Ur<String>, ? super Boolean, C76800UCe> interfaceC88471Ynr, InterfaceC67352kd<? super C79038V0g> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC35811ar;
        this.LJLJJI = c08440Uu;
        this.LJLJJL = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C79038V0g c79038V0g = new C79038V0g(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c79038V0g.LJLILLLLZI = obj;
        return c79038V0g;
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
            InterfaceC37501da interfaceC37501da = (InterfaceC37501da) this.LJLILLLLZI;
            C79037V0f c79037V0f = new C79037V0f(this.LJLJI, this.LJLJJI, this.LJLJJL, null);
            this.LJLIL = 1;
            if (C0UR.LIZIZ(interfaceC37501da, c79037V0f, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37501da interfaceC37501da, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37501da, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
