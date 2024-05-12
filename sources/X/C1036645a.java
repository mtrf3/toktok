package X;

import fjb.a;
import java.util.LinkedHashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.noticeflow.base.ChatNoticeFlowEngine$ChatNoticeScene$isTaskValid$2", f = "ChatNoticeFlowEngine.kt", l = {277}, m = "invokeSuspend")
/* renamed from: X.45a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1036645a extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C1036845c LJLILLLLZI;
    public final /* synthetic */ C1023940d LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1036645a(C1036845c c1036845c, C1023940d c1023940d, InterfaceC67352kd<? super C1036645a> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c1036845c;
        this.LJLJI = c1023940d;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1036645a(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            AbstractC1036945d abstractC1036945d = (AbstractC1036945d) ((LinkedHashMap) this.LJLILLLLZI.LJFF).get(this.LJLJI.LIZ);
            if (abstractC1036945d != null) {
                C1023940d c1023940d = this.LJLJI;
                this.LJLIL = 1;
                obj = abstractC1036945d.LJFF(c1023940d, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return Boolean.valueOf(z);
        }
        if (((Boolean) obj).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
