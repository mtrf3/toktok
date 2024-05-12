package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;

/* renamed from: X.3rP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97033rP {
    public static final C97033rP LIZ = new C97033rP();

    public static java.util.Map LIZ(C109544Rq c109544Rq, C99033ud c99033ud) {
        String str;
        String str2;
        java.util.Map<String, String> localExt;
        java.util.Map<String, String> localExt2;
        java.util.Map<String, String> botSendParams;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c99033ud != null && (botSendParams = c99033ud.getBotSendParams()) != null) {
            linkedHashMap.putAll(botSendParams);
        }
        if (c109544Rq == null || (localExt2 = c109544Rq.getLocalExt()) == null || (str = localExt2.get("content_type")) == null || str.length() == 0) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("content_type", str);
        if (c109544Rq == null || (localExt = c109544Rq.getLocalExt()) == null || (str2 = localExt.get("im_client_send_msg_time")) == null) {
            str2 = "";
        }
        linkedHashMap.put("im_client_send_msg_time", str2);
        return linkedHashMap;
    }
}
