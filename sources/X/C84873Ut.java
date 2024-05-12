package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAdapterAnalytics$logClickMessageEvent$1", f = "IMMessageAdapterAnalytics.kt", l = {364}, m = "invokeSuspend")
/* renamed from: X.3Ut, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84873Ut extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C109544Rq LJLILLLLZI;
    public final /* synthetic */ InterfaceC75532xp LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84873Ut(C109544Rq c109544Rq, InterfaceC75532xp interfaceC75532xp, InterfaceC67352kd<? super C84873Ut> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c109544Rq;
        this.LJLJI = interfaceC75532xp;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C84873Ut(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            obj = C48G.LJFF(c48g, c109544Rq, null, this, 6);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        java.util.Map<String, String> map = (java.util.Map) obj;
        C109544Rq message = this.LJLILLLLZI;
        o.LJIIIZ(message, "message");
        map.put("message_type", C106674Gp.LJFF(message, null));
        C3V3 LJI = C106674Gp.LJI(this.LJLILLLLZI, null);
        if (LJI != null) {
            map.put("message_type_v2", LJI.LIZ);
            map.put("content_type", LJI.LIZIZ);
        }
        map.put("from_user_id", String.valueOf(this.LJLILLLLZI.getSender()));
        this.LJLJI.LIZIZ("click_dm_message", map);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
