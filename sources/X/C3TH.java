package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.analytics.IMChatListCtrAnalytics$trackSessionClick$2", f = "IMChatListCtrAnalytics.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3TH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3TH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3TG LJLIL;
    public final /* synthetic */ C3L4 LJLILLLLZI;
    public final /* synthetic */ AbstractC82843My LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3TH(C3TG c3tg, C3L4 c3l4, AbstractC82843My abstractC82843My, String str, InterfaceC67352kd<? super C3TH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3tg;
        this.LJLILLLLZI = c3l4;
        this.LJLJI = abstractC82843My;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3TH(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C3L3 c3l3;
        IMUser LJIJI;
        C141335gf.LIZJ(obj);
        C76732zl c76732zl = new C76732zl();
        C3TG c3tg = this.LJLIL;
        C3L4 c3l4 = this.LJLILLLLZI;
        synchronized (c3tg) {
            java.util.Map<String, Integer> map = C3TG.LIZIZ;
            Integer num = (Integer) ((LinkedHashMap) map).get(c3l4.LJFF());
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            c76732zl.element = i;
            String LJFF = c3l4.LJFF();
            o.LJIIIIZZ(LJFF, "session.sessionID");
            map.put(LJFF, new Integer(c76732zl.element + 1));
        }
        C3L4 c3l42 = this.LJLILLLLZI;
        if ((c3l42 instanceof C3L3) && (c3l3 = (C3L3) c3l42) != null && (LJIJI = c3l3.LJIJI()) != null) {
            i2 = LJIJI.getFollowStatus();
        } else {
            i2 = -1;
        }
        AbstractC82843My abstractC82843My = this.LJLJI;
        if (abstractC82843My instanceof C82493Lp) {
            i3 = ((C82493Lp) abstractC82843My).getNum();
        } else {
            i3 = 0;
        }
        AbstractC82843My abstractC82843My2 = this.LJLJI;
        if (abstractC82843My2 instanceof C82493Lp) {
            str = "num";
        } else if (abstractC82843My2 instanceof C82483Lo) {
            str = "dot";
        } else {
            str = "empty";
        }
        C3L4 c3l43 = this.LJLILLLLZI;
        if (c3l43 instanceof C3LK) {
            str2 = "stranger";
        } else if (c3l43 instanceof C3L2) {
            str2 = "request";
        } else if (c3l43 instanceof C3L3) {
            str2 = "single";
        } else if (c3l43 instanceof C3MY) {
            str2 = "group";
        } else {
            str2 = "unknown";
        }
        if (c3l43.LJLJLLL == 15) {
            z = true;
        } else {
            z = false;
        }
        OSZ[] oszArr = new OSZ[12];
        if (c3l43.LLFII) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[0] = new OSZ("is_online", str3);
        oszArr[1] = new OSZ("unread_count", String.valueOf(i3));
        oszArr[2] = new OSZ("unread_state", str);
        if (this.LJLILLLLZI.LJLJJLL.LJLIL.length() > 0) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[3] = new OSZ("display_active_status", str4);
        if (this.LJLILLLLZI.LL) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[4] = new OSZ("is_mute", str5);
        if (this.LJLILLLLZI.LLI) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[5] = new OSZ("is_filtered", str6);
        if (this.LJLILLLLZI.LJLLLL) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[6] = new OSZ("is_sticky_top", str7);
        oszArr[7] = new OSZ("click_times", String.valueOf(c76732zl.element));
        oszArr[8] = new OSZ("click_from", this.LJLJJI);
        oszArr[9] = new OSZ("chat_type", str2);
        oszArr[10] = new OSZ("follow_status", String.valueOf(i2));
        if (z) {
            str8 = "1";
        } else {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[11] = new OSZ("is_new_chat", str8);
        C772831o.LIZ().LIZIZ("im_inbox_session_click", C113554cx.LJJL(oszArr));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
