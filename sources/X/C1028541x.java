package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$dismissBottomPopupsOnKeyboardOpen$1", f = "BaseChatPanel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.41x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1028541x extends AbstractC65782Prm implements InterfaceC88471Ynr<C1023940d, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;

    public C1028541x(InterfaceC67352kd<? super C1028541x> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C1028541x c1028541x = new C1028541x(interfaceC67352kd);
        c1028541x.LJLIL = obj;
        return c1028541x;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C41X c41x;
        C141335gf.LIZJ(obj);
        C1023940d c1023940d = (C1023940d) this.LJLIL;
        if (c1023940d.LIZ.getSceneId() == C45Q.BOTTOM && !c1023940d.LIZ.isConflictedWithInputView() && (c41x = c1023940d.LIZ) != C41X.SAY_HI && c41x != C41X.SUGGESTED_STICKERS) {
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
