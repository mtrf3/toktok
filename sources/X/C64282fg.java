package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.templatedownload.TemplateProducer$getProducedTemplateZip$1", f = "TemplateProducer.kt", l = {57}, m = "invokeSuspend")
/* renamed from: X.2fg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64282fg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C68322mC<String> LJLJI;
    public final /* synthetic */ InterfaceC68342mE<String> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64282fg(C68322mC<String> c68322mC, InterfaceC68342mE<String> interfaceC68342mE, InterfaceC67352kd<? super C64282fg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c68322mC;
        this.LJLJJI = interfaceC68342mE;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64282fg(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C68322mC<String> c68322mC;
        T t;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                c68322mC = this.LJLIL;
                C141335gf.LIZJ(obj);
                t = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            c68322mC = this.LJLJI;
            InterfaceC68342mE<String> interfaceC68342mE = this.LJLJJI;
            this.LJLIL = c68322mC;
            this.LJLILLLLZI = 1;
            Object LJI = interfaceC68342mE.LJI(this);
            t = LJI;
            if (LJI == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        c68322mC.element = t;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
