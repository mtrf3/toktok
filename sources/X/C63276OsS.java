package X;

import Y.ARunnableS13S0201000_10;
import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.ConversationCheckInfo;
import com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.OsS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63276OsS extends AbstractC63515OwJ {
    public C63276OsS() {
        super(EnumC63625Oy5.GET_CONVERSATIONS_CHECKINFO.getValue());
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        Response response;
        ResponseBody responseBody;
        if (c63622Oy2 != null && (response = c63622Oy2.LJLJL) != null && (responseBody = response.body) != null && responseBody.get_conversations_checkinfo_body != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        List<ConversationCheckInfo> list;
        if (!LJIIIZ(c63622Oy2) || !c63622Oy2.LJIIJ() || (list = c63622Oy2.LJLJL.body.get_conversations_checkinfo_body.conversation_checkinfo_list) == null || list.isEmpty()) {
            return;
        }
        C63346Ota.LIZIZ().execute(new ARunnableS13S0201000_10(c63622Oy2.LJLJJLL.inbox_type.intValue(), list, this, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public static void LJIILIIL(int i, List list, long j) {
        ?? r0;
        int i2 = 0;
        if (list == null || list.isEmpty()) {
            r0 = list;
        } else {
            r0 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ConversationCheckInfo conversationCheckInfo = (ConversationCheckInfo) it.next();
                if (conversationCheckInfo != null) {
                    String str = conversationCheckInfo.conversation_id;
                    if (!((CopyOnWriteArraySet) C63269OsL.LIZIZ).contains(str)) {
                        java.util.Map<Integer, java.util.Map<String, MessageBody>> map = C63269OsL.LJII;
                        if (map != null) {
                            for (java.util.Map map2 : ((ConcurrentHashMap) map).values()) {
                                if (map2 == null || !map2.containsKey(str)) {
                                }
                            }
                        }
                        java.util.Map<Integer, List<String>> map3 = C63269OsL.LJIIIZ;
                        if (map3 != null) {
                            for (List list2 : ((ConcurrentHashMap) map3).values()) {
                                if (list2 == null || !list2.contains(str)) {
                                }
                            }
                        }
                        r0.add(conversationCheckInfo);
                    }
                }
            }
        }
        if (!"1".equals(C63314Ot4.LIZJ("only_check_not_repair"))) {
            if (r0 != 0) {
                r0.size();
            }
            C63271OsN c63271OsN = new C63271OsN();
            if (r0 != 0 && !r0.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (ConversationCheckInfo conversationCheckInfo2 : r0) {
                    if (conversationCheckInfo2 != null) {
                        C63480Ovk c63480Ovk = new C63480Ovk();
                        c63480Ovk.LIZLLL = conversationCheckInfo2.conversation_id;
                        c63480Ovk.LJ = conversationCheckInfo2.conversation_short_id;
                        c63480Ovk.LJFF = conversationCheckInfo2.conversation_type;
                        arrayList.add(c63480Ovk.build());
                        if (arrayList.size() == 50) {
                            C89453Z8v c89453Z8v = new C89453Z8v();
                            c89453Z8v.LJIJJ = new GetConversationInfoListV2RequestBody(arrayList);
                            c63271OsN.LJIIJJI(i, c89453Z8v.build(), null, new Object[0]);
                            arrayList = new ArrayList();
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    C89453Z8v c89453Z8v2 = new C89453Z8v();
                    c89453Z8v2.LJIJJ = new GetConversationInfoListV2RequestBody(arrayList);
                    c63271OsN.LJIIJJI(i, c89453Z8v2.build(), null, new Object[0]);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (r0 != 0 && !r0.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("leak_conversation_count", String.valueOf(r0.size()));
            arrayList2.add(new C63670Oyo(EnumC63665Oyj.COUNTER, "check_conversation_leak", 1L, hashMap));
        }
        arrayList2.add(new C63670Oyo(EnumC63665Oyj.TIMER, "check_conversation_cost", System.currentTimeMillis() - j, null));
        C63275OsR.LIZIZ().LJ(arrayList2);
        if (r0 != 0) {
            i2 = r0.size();
        }
        C63272OsO.LJIIIZ(i2, true);
    }
}
