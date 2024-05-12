package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.list.RecentStickerListView$onPanelSelected$1", f = "RecentStickerListView.kt", l = {105}, m = "invokeSuspend")
/* renamed from: X.29v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C539529v extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C29571Eb LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539529v(C29571Eb c29571Eb, InterfaceC67352kd<? super C539529v> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c29571Eb;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C539529v(this.LJLILLLLZI, interfaceC67352kd);
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
            XK4 xk4 = this.LJLILLLLZI.LJIILJJIL.LJLILLLLZI;
            C36921ce c36921ce = C36921ce.LIZ;
            this.LJLIL = 1;
            if (xk4.LJIIIZ(c36921ce, this) == enumC58928NAu) {
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
