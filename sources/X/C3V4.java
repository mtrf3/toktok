package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.analytics.SendTemplateMessageAnalytics$onMessageSending$1", f = "SendTemplateMessageAnalytics.kt", l = {C61447O9r.LJIIJ}, m = "invokeSuspend")
/* renamed from: X.3V4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3V4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C109544Rq LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3V4(C109544Rq c109544Rq, InterfaceC67352kd<? super C3V4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c109544Rq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3V4(this.LJLILLLLZI, interfaceC67352kd);
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
            C48G c48g = C48G.LIZ;
            C109544Rq c109544Rq = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = c48g.LJI(c109544Rq, new C84843Uq(), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        java.util.Map map = (java.util.Map) obj;
        C109544Rq c109544Rq2 = this.LJLILLLLZI;
        if (c109544Rq2.getMsgType() == 1809) {
            map.put("message_type", "share_video");
        } else {
            map.put("message_type", c109544Rq2.getScene());
        }
        map.put("message_template", C3V7.LIZ(c109544Rq2));
        String localExtValue = c109544Rq2.getLocalExtValue("enter_from");
        String str = "";
        if (localExtValue == null) {
            localExtValue = "";
        }
        map.put("enter_from", localExtValue);
        String localExtValue2 = c109544Rq2.getLocalExtValue("panel_source");
        if (localExtValue2 == null) {
            localExtValue2 = "";
        }
        map.put("panel_source", localExtValue2);
        String localExtValue3 = c109544Rq2.getLocalExtValue("author_follow_status");
        if (localExtValue3 != null) {
            str = localExtValue3;
        }
        map.put("author_follow_status", str);
        C3V3 LJI = C106674Gp.LJI(c109544Rq2, null);
        if (LJI != null) {
            map.put("message_type_v2", LJI.LIZ);
            map.put("content_type", LJI.LIZIZ);
        }
        FMX.LJIIL("send_message", map);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
