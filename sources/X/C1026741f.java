package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.noticeflow.base.ChatNoticeFlowEngine$addTask$2", f = "ChatNoticeFlowEngine.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.41f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1026741f extends AbstractC65782Prm implements InterfaceC88471Ynr<C1023940d, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C1023940d LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1026741f(C1023940d c1023940d, InterfaceC67352kd<? super C1026741f> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c1023940d;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C1026741f c1026741f = new C1026741f(this.LJLILLLLZI, interfaceC67352kd);
        c1026741f.LJLIL = obj;
        return c1026741f;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        C1023940d c1023940d = (C1023940d) this.LJLIL;
        if (c1023940d.LIZ.getSceneId() == this.LJLILLLLZI.LIZ.getSceneId() && c1023940d.LIZ.getPriority() > this.LJLILLLLZI.LIZ.getPriority() && (c1023940d.LIZ.getCanBeOverridden() || this.LJLILLLLZI.LIZ.getCanOverride())) {
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
