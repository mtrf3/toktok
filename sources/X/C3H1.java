package X;

import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3H1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3H1 {
    public static final C3H1 LIZ = new C3H1();
    public static String LIZIZ = "keyword";

    public static C1HQ LIZ(String str, TextContent content) {
        List<RichTextInfo> richTextInfos;
        boolean z;
        boolean z2;
        int size;
        int i;
        o.LJIIIZ(content, "content");
        C1HQ c1hq = new C1HQ();
        if (C81253Gv.LIZ() && (richTextInfos = content.getRichTextInfos()) != null && !richTextInfos.isEmpty()) {
            Iterator<RichTextInfo> it = richTextInfos.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RichTextInfo next = it.next();
                if (next.type == C3H0.MENTION_ALL.getValue()) {
                    if (next != null) {
                        z = true;
                    }
                }
            }
            z = false;
            Iterator<RichTextInfo> it2 = richTextInfos.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                RichTextInfo next2 = it2.next();
                if (next2.type == C3H0.MENTION_SINGLE.getValue()) {
                    if (next2 != null) {
                        z2 = true;
                    }
                }
            }
            z2 = false;
            if (z) {
                C3Q9.LIZ.getClass();
                C75782yE.LIZ();
                C63120Opw LIZ2 = C4WC.LIZIZ.LIZ(str);
                if (LIZ2 != null) {
                    i = LIZ2.getMemberCount();
                } else {
                    i = 0;
                }
                size = Math.max(i - 1, 0);
            } else {
                size = richTextInfos.size();
            }
            StringBuilder sb = new StringBuilder("[");
            if (z2) {
                sb.append("user");
            }
            if (z) {
                if (z2) {
                    sb.append(", ");
                }
                sb.append("all");
            }
            sb.append("]");
            c1hq.put("mention_cnt", String.valueOf(size));
            c1hq.put("mention_type", sb.toString());
        }
        return c1hq;
    }

    public static void LIZIZ(C3H1 c3h1, String str, Integer num, String str2, int i) {
        C85323Wm onEventV3 = C772831o.LIZ();
        c3h1.getClass();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        if (!o.LJ(str2, CardStruct.IStatusCode.DEFAULT)) {
            c1hq.put("to_user_id", str2);
            c1hq.put("relation_tag", String.valueOf(i));
            c1hq.put("mention_type", "user");
        } else {
            c1hq.put("mention_type", "all");
        }
        if (num != null) {
            c1hq.put("rank_num", num.toString());
        }
        c1hq.put("enter_from", "chat");
        c1hq.put("chat_type", "group");
        c1hq.put("action", str);
        onEventV3.LIZIZ("dm_mention_user_click", c1hq);
    }
}
