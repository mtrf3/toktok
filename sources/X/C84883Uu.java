package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;
import java.util.HashMap;
import java.util.Map;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageReactionAnalytics$reportReactMessage$1", f = "IMMessageReactionAnalytics.kt", l = {130}, m = "invokeSuspend")
/* renamed from: X.3Uu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84883Uu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C109544Rq LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ HashMap<String, String> LJLJJI;
    public final /* synthetic */ InterfaceC75532xp LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84883Uu(C109544Rq c109544Rq, boolean z, HashMap<String, String> hashMap, InterfaceC75532xp interfaceC75532xp, InterfaceC67352kd<? super C84883Uu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c109544Rq;
        this.LJLJI = z;
        this.LJLJJI = hashMap;
        this.LJLJJL = interfaceC75532xp;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C84883Uu(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v27 */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ?? r0;
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
        map.put("message_type", C84893Uv.LIZ(this.LJLILLLLZI));
        C3V3 LJI = C106674Gp.LJI(this.LJLILLLLZI, null);
        if (LJI != null) {
            map.put("message_type_v2", LJI.LIZ);
            map.put("content_type", LJI.LIZIZ);
        }
        if (this.LJLJI) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        map.put("is_reply", str);
        C109544Rq c109544Rq2 = this.LJLILLLLZI;
        if (c109544Rq2 == null) {
            r0 = 0;
        } else {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            r0 = C84283Sm.LJIIIIZZ(C4WC.LIZIZ.LIZ(c109544Rq2.getConversationId()));
        }
        map.put("is_master", String.valueOf((int) r0));
        map.put("to_user_id", String.valueOf(this.LJLILLLLZI.getSender()));
        for (Map.Entry<String, String> entry : this.LJLJJI.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        this.LJLJJL.LIZIZ("like_message", map);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
