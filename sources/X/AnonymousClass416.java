package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel$invalidateNotice$1$1", f = "SingleChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.416, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass416 extends AbstractC65782Prm implements InterfaceC88471Ynr<C1023940d, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C41X LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass416(C41X c41x, InterfaceC67352kd<? super AnonymousClass416> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c41x;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        AnonymousClass416 anonymousClass416 = new AnonymousClass416(this.LJLILLLLZI, interfaceC67352kd);
        anonymousClass416.LJLIL = obj;
        return anonymousClass416;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        if (((C1023940d) this.LJLIL).LIZ == this.LJLILLLLZI) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C1023940d c1023940d, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(c1023940d, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
