package X;

import android.os.SystemClock;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Or4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63190Or4 implements InterfaceC63352Otg<List<C109544Rq>> {
    public final /* synthetic */ MessagesInConversationResponseBody LJLIL;
    public final /* synthetic */ C63622Oy2 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C63261OsD LJLJJI;

    @Override // X.InterfaceC63352Otg
    public final List<C109544Rq> LIZIZ() {
        boolean z;
        C63120Opw LJIIIZ;
        C109544Rq c109544Rq;
        C78847Ux1.LJJLIIIJJI("LoadHistoryHandler.saveMsg(String,List,boolean)");
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.LJLIL.has_more;
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        MessagesInConversationResponseBody messagesInConversationResponseBody = this.LJLIL;
        Long l = messagesInConversationResponseBody.next_cursor;
        List<MessageBody> LJIIZILJ = C73994T2g.LJIIZILJ(messagesInConversationResponseBody, 1, this.LJLILLLLZI.LJIIIIZZ(), "LoadHistoryHandler");
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            for (MessageBody messageBody : LJIIZILJ) {
                Integer num = messageBody.status;
                if (num == null || num.intValue() != 1) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("s:get_msg_log_id", this.LJLILLLLZI.LJIIIIZZ());
                    C63195Or9 LJIJ = C63192Or6.LJIJ(messageBody, false, hashMap, 1);
                    if (LJIJ != null && (c109544Rq = LJIJ.LIZ) != null) {
                        arrayList.add(c109544Rq);
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                jSONObject.put("msg_count", LJIIZILJ.size());
                jSONObject.put("msg_source", 1);
                C63337OtR.LIZLLL("im_save_msg_list_duration", jSONObject);
            } catch (Exception unused) {
            }
            if (!z) {
                C63192Or6.LJIILL(this.LJLJI);
            }
            C78847Ux1.LJIJJLI("LoadHistoryHandler.saveMsg(String,List,boolean)", true);
            Collections.sort(arrayList);
            if (z && l != null && (LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(this.LJLJI)) != null) {
                this.LJLJJI.LJIILIIL(l.longValue(), LJIIIZ);
            }
        } catch (Exception e) {
            C78847Ux1.LJIJJLI("LoadHistoryHandler.saveMsg(String,List,boolean)", false);
            C63322OtC.LJ("LoadHistoryHandler saveMsg", e);
            C63272OsO.LJIIL(1, e);
        }
        return arrayList;
    }

    public C63190Or4(C63261OsD c63261OsD, MessagesInConversationResponseBody messagesInConversationResponseBody, C63622Oy2 c63622Oy2, String str) {
        this.LJLJJI = c63261OsD;
        this.LJLIL = messagesInConversationResponseBody;
        this.LJLILLLLZI = c63622Oy2;
        this.LJLJI = str;
    }
}
