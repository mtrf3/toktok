package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", f = "CoreTextField.kt", l = {302}, m = "invokeSuspend")
/* renamed from: X.2FU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC14660hq LJLILLLLZI;
    public final /* synthetic */ C15010iP LJLJI;
    public final /* synthetic */ C18810oX LJLJJI;
    public final /* synthetic */ C18830oZ LJLJJL;
    public final /* synthetic */ InterfaceC14950iJ LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2FU(InterfaceC14660hq interfaceC14660hq, C15010iP c15010iP, C18810oX c18810oX, C18830oZ c18830oZ, InterfaceC14950iJ interfaceC14950iJ, InterfaceC67352kd<? super C2FU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC14660hq;
        this.LJLJI = c15010iP;
        this.LJLJJI = c18810oX;
        this.LJLJJL = c18830oZ;
        this.LJLJJLL = interfaceC14950iJ;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2FU(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C10390ax c10390ax;
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
            InterfaceC14660hq interfaceC14660hq = this.LJLILLLLZI;
            C15010iP c15010iP = this.LJLJI;
            C18590oB c18590oB = this.LJLJJI.LIZ;
            C0VG c0vg = this.LJLJJL.LIZ;
            InterfaceC14950iJ interfaceC14950iJ = this.LJLJJLL;
            this.LJLIL = 1;
            int LIZIZ = interfaceC14950iJ.LIZIZ(C08350Ul.LIZLLL(c15010iP.LIZIZ));
            if (LIZIZ < c0vg.LIZ.LIZ.length()) {
                c10390ax = c0vg.LIZIZ(LIZIZ);
            } else if (LIZIZ != 0) {
                c10390ax = c0vg.LIZIZ(LIZIZ - 1);
            } else {
                c10390ax = new C10390ax(0.0f, 0.0f, 1.0f, C23490w5.LIZIZ(C18800oW.LIZ(c18590oB.LIZIZ, c18590oB.LJFF, c18590oB.LJI, C18800oW.LIZ, 1)));
            }
            Object LIZ = interfaceC14660hq.LIZ(c10390ax, this);
            if (LIZ != enumC58928NAu) {
                LIZ = C76800UCe.LIZ;
            }
            if (LIZ == enumC58928NAu) {
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
