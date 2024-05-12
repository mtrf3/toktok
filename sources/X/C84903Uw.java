package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageReactionAnalytics$likeMessageByChatEmojiPanel$1", f = "IMMessageReactionAnalytics.kt", l = {110}, m = "invokeSuspend")
/* renamed from: X.3Uw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84903Uw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C109544Rq LJLILLLLZI;
    public final /* synthetic */ C48M LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ InterfaceC75532xp LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84903Uw(C109544Rq c109544Rq, C48M c48m, String str, InterfaceC75532xp interfaceC75532xp, InterfaceC67352kd<? super C84903Uw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c109544Rq;
        this.LJLJI = c48m;
        this.LJLJJI = str;
        this.LJLJJL = interfaceC75532xp;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C84903Uw(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            C48M c48m = this.LJLJI;
            this.LJLIL = 1;
            obj = C48G.LJFF(c48g, c109544Rq, c48m, this, 4);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        java.util.Map<String, String> map = (java.util.Map) obj;
        String str = this.LJLJJI;
        if (str == null) {
            return C76800UCe.LIZ;
        }
        map.put("emoji_name", str);
        map.put("like_method", "chat_panel_emoji");
        map.put("message_type", "video");
        C3V3 LIZLLL = this.LJLJI.LIZLLL(this.LJLILLLLZI, null);
        if (LIZLLL != null) {
            map.put("message_type_v2", LIZLLL.LIZ);
            map.put("content_type", LIZLLL.LIZIZ);
        }
        map.put("to_user_id", String.valueOf(this.LJLILLLLZI.getSender()));
        this.LJLJJL.LIZIZ("like_message", map);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
