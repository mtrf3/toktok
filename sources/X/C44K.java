package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;

/* renamed from: X.44K, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C44K {
    public static final /* synthetic */ int LIZ = 0;

    public static SystemContent LIZ(C109544Rq c109544Rq, BaseTemplate baseTemplate) {
        CheckMessage checkMessage;
        CheckMessage.StatusMsg statusMsg;
        BaseResponseComponent LLILLJJLI;
        java.util.Map<String, String> map;
        String str;
        if (baseTemplate != null && (LLILLJJLI = baseTemplate.LLILLJJLI()) != null && (map = LLILLJJLI.extras) != null) {
            if (map.containsKey("ext")) {
                str = map.get("ext");
            } else if (map.containsKey("notice")) {
                str = map.get("notice");
            }
            if (str != null) {
                return (SystemContent) C62070OXq.LIZ(SystemContent.class, str);
            }
        }
        String str2 = c109544Rq.getLocalExt().get("s:send_response_check_msg");
        if (!C78685UuP.LJJJZ(str2) || (checkMessage = (CheckMessage) C62070OXq.LIZ(CheckMessage.class, str2)) == null) {
            return null;
        }
        CheckMessage.StatusMsg statusMsg2 = checkMessage.getStatusMsg();
        if ((statusMsg2 != null && statusMsg2.getMsgType() == 1022) || (statusMsg = checkMessage.getStatusMsg()) == null) {
            return null;
        }
        return statusMsg.getMsgContent();
    }
}
