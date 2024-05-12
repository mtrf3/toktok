package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", f = "Draggable.kt", l = {260}, m = "invokeSuspend")
/* renamed from: X.2Cu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54722Cu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC88472Yns<C11P, Boolean>> LJLJJI;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC65784Pro<Boolean>> LJLJJL;
    public final /* synthetic */ C0UT LJLJJLL;
    public final /* synthetic */ InterfaceC78936UyS<C0UQ> LJLJL;
    public final /* synthetic */ boolean LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C54722Cu(boolean z, InterfaceC24760y8<? extends InterfaceC88472Yns<? super C11P, Boolean>> interfaceC24760y8, InterfaceC24760y8<? extends InterfaceC65784Pro<Boolean>> interfaceC24760y82, C0UT c0ut, InterfaceC78936UyS<C0UQ> interfaceC78936UyS, boolean z2, InterfaceC67352kd<? super C54722Cu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = z;
        this.LJLJJI = interfaceC24760y8;
        this.LJLJJL = interfaceC24760y82;
        this.LJLJJLL = c0ut;
        this.LJLJL = interfaceC78936UyS;
        this.LJLJLJ = z2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C54722Cu c54722Cu = new C54722Cu(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
        c54722Cu.LJLILLLLZI = obj;
        return c54722Cu;
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
            if (!this.LJLJI) {
                return C76800UCe.LIZ;
            }
            C54712Ct c54712Ct = new C54712Ct(interfaceC37501da, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, null);
            this.LJLIL = 1;
            if (C48841JEv.LJI(c54712Ct, this) == enumC58928NAu) {
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
