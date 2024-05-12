package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$1$2$1", f = "BaseChatPanel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.41j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1027141j extends AbstractC65782Prm implements InterfaceC88471Ynr<C1023940d, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;

    public C1027141j(InterfaceC67352kd<? super C1027141j> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C1027141j c1027141j = new C1027141j(interfaceC67352kd);
        c1027141j.LJLIL = obj;
        return c1027141j;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        if (((C1023940d) this.LJLIL).LIZ == C41X.SAY_HI) {
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
