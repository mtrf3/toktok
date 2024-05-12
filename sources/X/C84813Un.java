package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMReadMessageAnalytics$reportReadMessage$1", f = "IMReadMessageAnalytics.kt", l = {77}, m = "invokeSuspend")
/* renamed from: X.3Un, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84813Un extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C109544Rq LJLJI;
    public final /* synthetic */ C48M LJLJJI;
    public final /* synthetic */ InterfaceC75532xp LJLJJL;
    public final /* synthetic */ C31F LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84813Un(C109544Rq c109544Rq, C48M c48m, InterfaceC75532xp interfaceC75532xp, C31F c31f, InterfaceC67352kd<? super C84813Un> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c109544Rq;
        this.LJLJJI = c48m;
        this.LJLJJL = interfaceC75532xp;
        this.LJLJJLL = c31f;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C84813Un c84813Un = new C84813Un(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c84813Un.LJLILLLLZI = obj;
        return c84813Un;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        java.util.Map<String, String> localExt;
        long j;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            C109544Rq c109544Rq = this.LJLJI;
            C63120Opw LIZ = this.LJLJJI.LIZ(c109544Rq.getConversationId());
            if (LIZ != null && (localExt = LIZ.getLocalExt()) != null) {
                long LJJII = C54840Lfg.LJJ().LJJII();
                if (LJJII < 0) {
                    LJJII = System.currentTimeMillis();
                }
                String str = localExt.get("key_local_ext_last_read_time_millis");
                if (str != null) {
                    j = CastLongProtector.parseLong(str);
                } else {
                    j = -1;
                }
                if (LJJII > j) {
                    localExt.put("key_local_ext_last_read_time_millis", String.valueOf(LJJII));
                    String conversationId = c109544Rq.getConversationId();
                    o.LJIIIIZZ(conversationId, "message.conversationId");
                    C81273Gx.LIZ(conversationId).LJIJJ(localExt, null);
                }
            }
            java.util.Map<String, String> localExt2 = this.LJLJI.getLocalExt();
            o.LJIIIIZZ(localExt2, "message.localExt");
            localExt2.put("key_local_ext_has_read", "1");
            ((ArrayList) C84823Uo.LIZIZ).add(this.LJLJI);
            C48G c48g = C48G.LIZ;
            C109544Rq c109544Rq2 = this.LJLJI;
            C48M c48m = this.LJLJJI;
            this.LJLILLLLZI = interfaceC70422pa;
            this.LJLIL = 1;
            obj = C48G.LJFF(c48g, c109544Rq2, c48m, this, 4);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        java.util.Map<String, String> map = (java.util.Map) obj;
        map.put("from_user_id", String.valueOf(this.LJLJI.getSender()));
        map.put("message_type", C106674Gp.LJ(this.LJLJI));
        C3V3 LIZLLL = this.LJLJJI.LIZLLL(this.LJLJI, null);
        if (LIZLLL != null) {
            map.put("message_type_v2", LIZLLL.LIZ);
            map.put("content_type", LIZLLL.LIZIZ);
        }
        this.LJLJJL.LIZIZ("read_message", map);
        XKQ xkq = C84823Uo.LIZJ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        C84823Uo.LIZJ = XKX.LIZLLL(interfaceC70422pa, null, null, new C772531l(this.LJLJJLL, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
