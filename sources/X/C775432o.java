package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoSugResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.32o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C775432o {
    public XKQ LIZ;

    public final void LIZ(int i, C99033ud sessionInfo, InterfaceC70422pa scope, C109544Rq c109544Rq, boolean z, InterfaceC88472Yns<? super TakoSugResponse, C76800UCe> interfaceC88472Yns) {
        String str;
        Long l;
        Long l2;
        Long l3;
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(scope, "scope");
        V1B.LJIIZILJ("cancel current sug request");
        XKQ xkq = this.LIZ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        java.util.Map<String, String> botQueryRequestExtra = sessionInfo.getBotQueryRequestExtra();
        if (botQueryRequestExtra == null) {
            return;
        }
        String str2 = botQueryRequestExtra.get("chat_sug_key");
        if (c109544Rq == null || (str = c109544Rq.getExtValue("a:query_server_message_id")) == null) {
            str = "";
        }
        String str3 = botQueryRequestExtra.get("gid");
        if (str3 != null) {
            l = C38350F3i.LJJIZ(str3);
        } else {
            l = null;
        }
        String str4 = botQueryRequestExtra.get("feed_bar");
        String str5 = botQueryRequestExtra.get("entry_time");
        if (str5 != null) {
            l2 = C38350F3i.LJJIZ(str5);
        } else {
            l2 = null;
        }
        String str6 = botQueryRequestExtra.get("view_duration");
        if (str6 != null) {
            l3 = C38350F3i.LJJIZ(str6);
        } else {
            l3 = null;
        }
        this.LIZ = XKX.LIZLLL(scope, null, null, new C71312r1(i, sessionInfo, l, str4, l2, str, str2, l3, interfaceC88472Yns, c109544Rq, z, null), 3);
    }
}
