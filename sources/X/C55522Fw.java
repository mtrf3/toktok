package X;

import fjb.a;
import kotlin.jvm.internal.IDqS416S0100000;

@InterfaceC65848Psq(c = "androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1", f = "ModalBottomSheet.kt", l = {443}, m = "invokeSuspend")
/* renamed from: X.2Fw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55522Fw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55522Fw(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C55522Fw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C55522Fw c55522Fw = new C55522Fw(this.LJLJI, interfaceC67352kd);
        c55522Fw.LJLILLLLZI = obj;
        return c55522Fw;
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
            IDqS416S0100000 iDqS416S0100000 = new IDqS416S0100000((InterfaceC65784Pro) this.LJLJI, (InterfaceC65784Pro<C10370av>) 284);
            this.LJLIL = 1;
            if (C0UM.LIZJ(interfaceC37501da, null, iDqS416S0100000, this, 7) == enumC58928NAu) {
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
