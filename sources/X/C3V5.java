package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage;
import fjb.a;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.analytics.SendTemplateMessageAnalytics$onMessageSent$1", f = "SendTemplateMessageAnalytics.kt", l = {74}, m = "invokeSuspend")
/* renamed from: X.3V5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3V5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C109544Rq LJLILLLLZI;
    public final /* synthetic */ C63540Owi LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3V5(C109544Rq c109544Rq, C63540Owi c63540Owi, InterfaceC67352kd<? super C3V5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c109544Rq;
        this.LJLJI = c63540Owi;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3V5(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        CheckMessage checkMessage;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        if (i2 != 0) {
            if (i2 == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C106714Gt c106714Gt = C106714Gt.LIZ;
            C109544Rq c109544Rq = this.LJLILLLLZI;
            long uptimeMillis = SystemClock.uptimeMillis();
            C63540Owi c63540Owi = this.LJLJI;
            this.LJLIL = 1;
            obj = c106714Gt.LIZIZ(c109544Rq, uptimeMillis, c63540Owi, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        JSONObject jSONObject = (JSONObject) obj;
        C109544Rq c109544Rq2 = this.LJLILLLLZI;
        String localExtValue = c109544Rq2.getLocalExtValue("enter_from");
        if (localExtValue == null) {
            localExtValue = "chat";
        }
        jSONObject.put("enter_from", localExtValue);
        jSONObject.put("message_type", c109544Rq2.getScene());
        C3V3 LJI = C106674Gp.LJI(c109544Rq2, null);
        if (LJI != null) {
            jSONObject.put("message_type_v2", LJI.LIZ);
            jSONObject.put("content_type", LJI.LIZIZ);
        }
        jSONObject.put("message_template", C3V7.LIZ(c109544Rq2));
        jSONObject.put("message_destination", C106674Gp.LJII(c109544Rq2));
        java.util.Map<String, String> localExt = c109544Rq2.getLocalExt();
        o.LJIIIIZZ(localExt, "message.localExt");
        try {
            checkMessage = (CheckMessage) C62070OXq.LIZ(CheckMessage.class, localExt.get("s:send_response_check_msg"));
        } catch (Exception unused) {
        }
        if (checkMessage != null) {
            i = o.LJ(checkMessage.getMediaMask(), Boolean.TRUE);
            jSONObject.put("is_media_masked", String.valueOf(i));
            FMX.LJIILJJIL("send_message_response", jSONObject);
            C106714Gt.LIZJ(jSONObject, this.LJLJI);
            return C76800UCe.LIZ;
        }
        i = 0;
        jSONObject.put("is_media_masked", String.valueOf(i));
        FMX.LJIILJJIL("send_message_response", jSONObject);
        C106714Gt.LIZJ(jSONObject, this.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
