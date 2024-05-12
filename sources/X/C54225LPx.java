package X;

import fjb.a;

/* JADX INFO: Add missing generic type declarations: [T] */
@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.deeplink.actions.base.BaseLinkAction$open$1$1$1", f = "BaseLinkAction.kt", l = {42}, m = "invokeSuspend")
/* renamed from: X.LPx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54225LPx<T> extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super T>, Object> {
    public int LJLIL;
    public final /* synthetic */ AbstractC54341LUj<T> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54225LPx(AbstractC54341LUj<T> abstractC54341LUj, InterfaceC67352kd<? super C54225LPx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = abstractC54341LUj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54225LPx(this.LJLILLLLZI, interfaceC67352kd);
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
            AbstractC54341LUj<T> abstractC54341LUj = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = abstractC54341LUj.preRunBlock(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, Object obj) {
        return ((a) create(interfaceC70422pa, (InterfaceC67352kd) obj)).invokeSuspend(C76800UCe.LIZ);
    }
}
