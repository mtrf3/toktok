package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.noticeflow.base.ChatNoticeFlowEngine$defaultTaskInvalidator$1", f = "ChatNoticeFlowEngine.kt", l = {30}, m = "invokeSuspend")
/* renamed from: X.45Z, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C45Z extends AbstractC65782Prm implements InterfaceC88471Ynr<C1023940d, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C1036745b LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45Z(C1036745b c1036745b, InterfaceC67352kd<? super C45Z> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c1036745b;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C45Z c45z = new C45Z(this.LJLJI, interfaceC67352kd);
        c45z.LJLILLLLZI = obj;
        return c45z;
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
            C1023940d c1023940d = (C1023940d) this.LJLILLLLZI;
            C1036845c c1036845c = (C1036845c) ListProtector.get(this.LJLJI.LIZLLL, c1023940d.LIZ.getSceneId().ordinal());
            this.LJLIL = 1;
            obj = XKX.LJI(c1036845c.LIZIZ, new C1036645a(c1036845c, c1023940d, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return Boolean.valueOf(!((Boolean) obj).booleanValue());
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C1023940d c1023940d, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(c1023940d, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
