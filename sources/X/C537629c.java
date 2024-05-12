package X;

import androidx.compose.ui.platform.WrappedComposition;
import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.ui.platform.WrappedComposition$setOriginContent$1$2", f = "Wrapper.android.kt", l = {187}, m = "invokeSuspend")
/* renamed from: X.29c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C537629c extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ WrappedComposition LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537629c(WrappedComposition wrappedComposition, InterfaceC67352kd<? super C537629c> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = wrappedComposition;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C537629c(this.LJLILLLLZI, interfaceC67352kd);
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
            C45211q1 c45211q1 = this.LJLILLLLZI.LJLIL;
            this.LJLIL = 1;
            Object LIZ = c45211q1.LJLLL.LIZ(this);
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
