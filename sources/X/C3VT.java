package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3VT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VT {
    public static C3VU LIZ;
    public static final java.util.Map<String, C3VU> LIZIZ = new LinkedHashMap();

    public static void LIZ(C109544Rq c109544Rq) {
        C3VU c3vu;
        Boolean remove;
        boolean z;
        Boolean remove2;
        boolean z2;
        String str = null;
        if (!TextUtils.isEmpty(c109544Rq.getLocalExtValue("process_id"))) {
            C3VU c3vu2 = (C3VU) ((LinkedHashMap) LIZIZ).get(c109544Rq.getLocalExtValue("process_id"));
            if (c3vu2 != null && o.LJ(c3vu2.LJLIL, "aweme") && (c109544Rq.getMsgType() == 8 || c109544Rq.getMsgType() == 11)) {
                if (c3vu2.LJLILLLLZI.containsKey(c109544Rq.getConversationId()) && (remove2 = c3vu2.LJLILLLLZI.remove(c109544Rq.getConversationId())) != null) {
                    remove2.booleanValue();
                    long LIZLLL = C81273Gx.LIZLLL(c109544Rq.getConversationId());
                    SharePackage sharePackage = c3vu2.LJLJI;
                    String conversationId = c109544Rq.getConversationId();
                    o.LJIIIIZZ(conversationId, "message.conversationId");
                    C57428MgK.LJ(sharePackage, conversationId, LIZLLL);
                    if (c109544Rq.getMsgStatus() == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    SharePackage sharePackage2 = c3vu2.LJLJI;
                    String conversationId2 = c109544Rq.getConversationId();
                    o.LJIIIIZZ(conversationId2, "message.conversationId");
                    C57428MgK.LIZLLL(sharePackage2, conversationId2, LIZLLL, z2, c109544Rq.getLocalExt().get("s:err_code"));
                    return;
                }
                return;
            }
        }
        C3VU c3vu3 = LIZ;
        if (c3vu3 != null) {
            str = c3vu3.LJLIL;
        }
        if (o.LJ(str, "aweme")) {
            if ((c109544Rq.getMsgType() == 8 || c109544Rq.getMsgType() == 11) && (c3vu = LIZ) != null && c3vu.LJLILLLLZI.containsKey(c109544Rq.getConversationId()) && (remove = c3vu.LJLILLLLZI.remove(c109544Rq.getConversationId())) != null) {
                remove.booleanValue();
                long LIZLLL2 = C81273Gx.LIZLLL(c109544Rq.getConversationId());
                SharePackage sharePackage3 = c3vu.LJLJI;
                String conversationId3 = c109544Rq.getConversationId();
                o.LJIIIIZZ(conversationId3, "message.conversationId");
                C57428MgK.LJ(sharePackage3, conversationId3, LIZLLL2);
                if (c109544Rq.getMsgStatus() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                SharePackage sharePackage4 = c3vu.LJLJI;
                String conversationId4 = c109544Rq.getConversationId();
                o.LJIIIIZZ(conversationId4, "message.conversationId");
                C57428MgK.LIZLLL(sharePackage4, conversationId4, LIZLLL2, z, c109544Rq.getLocalExt().get("s:err_code"));
            }
        }
    }

    public static final synchronized void LIZIZ(SharePackage sharePackage, String str, List list) {
        synchronized (C3VT.class) {
            o.LJIIIZ(sharePackage, "sharePackage");
            o.LJIIIZ(list, "list");
            C3VU c3vu = LIZ;
            if (list.isEmpty()) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                IMContact iMContact = (IMContact) it.next();
                if (iMContact instanceof IMUser) {
                    String uid = ((IMUser) iMContact).getUid();
                    o.LJIIIIZZ(uid, "it.uid");
                    linkedHashMap.put(C81273Gx.LIZIZ(CastLongProtector.parseLong(uid)), Boolean.FALSE);
                } else if (iMContact instanceof IMConversation) {
                    String conversationId = ((IMConversation) iMContact).getConversationId();
                    o.LJIIIIZZ(conversationId, "it.conversationId");
                    linkedHashMap.put(conversationId, Boolean.TRUE);
                }
            }
            LIZ = new C3VU(sharePackage.itemType, linkedHashMap, sharePackage, list);
            if (!TextUtils.isEmpty(str)) {
                java.util.Map<String, C3VU> map = LIZIZ;
                o.LJI(str);
                map.put(str, LIZ);
            }
        }
    }
}
