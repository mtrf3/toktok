package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1$1", f = "TapGestureDetector.kt", l = {225}, m = "invokeSuspend")
/* renamed from: X.2Cz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54772Cz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC88473Ynt<C1N5, C10370av, InterfaceC67352kd<? super C76800UCe>, Object> LJLILLLLZI;
    public final /* synthetic */ C42091kz LJLJI;
    public final /* synthetic */ C11P LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C54772Cz(InterfaceC88473Ynt<? super C1N5, ? super C10370av, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88473Ynt, C42091kz c42091kz, C11P c11p, InterfaceC67352kd<? super C54772Cz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC88473Ynt;
        this.LJLJI = c42091kz;
        this.LJLJJI = c11p;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54772Cz(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            InterfaceC88473Ynt<C1N5, C10370av, InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88473Ynt = this.LJLILLLLZI;
            C42091kz c42091kz = this.LJLJI;
            C10370av c10370av = new C10370av(this.LJLJJI.LIZJ);
            this.LJLIL = 1;
            if (interfaceC88473Ynt.invoke(c42091kz, c10370av, this) == enumC58928NAu) {
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
