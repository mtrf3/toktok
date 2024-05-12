package X;

import fjb.a;

/* JADX INFO: Add missing generic type declarations: [T] */
@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
/* renamed from: X.2hX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65432hX<T> extends AbstractC65782Prm implements InterfaceC88471Ynr<T, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC64672gJ<T> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C65432hX(InterfaceC64672gJ<? super T> interfaceC64672gJ, InterfaceC67352kd<? super C65432hX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC64672gJ;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C65432hX c65432hX = new C65432hX(this.LJLJI, interfaceC67352kd);
        c65432hX.LJLILLLLZI = obj;
        return c65432hX;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            Object obj2 = this.LJLILLLLZI;
            InterfaceC64672gJ<T> interfaceC64672gJ = this.LJLJI;
            this.LJLIL = 1;
            if (interfaceC64672gJ.emit(obj2, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(obj, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
