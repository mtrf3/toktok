package X;

import Y.ARunnableS13S0201000_10;
import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.OsJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63267OsJ extends AbstractC63515OwJ {
    public final boolean LIZJ;
    public List<C63120Opw> LIZLLL;

    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    public C63267OsJ(boolean z) {
        super(EnumC63625Oy5.GET_CONVERSATION_INFO_LIST_V2.getValue());
        this.LIZJ = z;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody;
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && (getConversationInfoListV2ResponseBody = responseBody.get_conversation_info_list_v2_body) != null && getConversationInfoListV2ResponseBody.conversation_info_list != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        int intValue = c63622Oy2.LJLJJLL.inbox_type.intValue();
        java.util.Map<String, MessageBody> map = (java.util.Map) c63622Oy2.LJLJJL[0];
        C115284fk LJIILIIL = C115284fk.LJIILIIL();
        Integer num = c63622Oy2.LJLJL.status_code;
        LJIILIIL.getClass();
        if (C115284fk.LIZJ(num)) {
            AtomicInteger atomicInteger = new AtomicInteger(0);
            AtomicInteger atomicInteger2 = new AtomicInteger(0);
            ArrayList arrayList = new ArrayList();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            C63268OsK c63268OsK = new C63268OsK(this, atomicInteger, atomicInteger2, arrayList, map, concurrentHashMap, intValue, c63622Oy2);
            for (MessageBody messageBody : map.values()) {
                if (messageBody.conversation_type.intValue() == AbstractC63505Ow9.LIZ) {
                    arrayList.add(messageBody);
                } else {
                    concurrentHashMap.put(messageBody.conversation_id, messageBody);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MessageBody messageBody2 = (MessageBody) it.next();
                C115284fk LJIILIIL2 = C115284fk.LJIILIIL();
                String str = messageBody2.conversation_id;
                int LJFF = c63622Oy2.LJFF();
                LJIILIIL2.getClass();
                C115284fk.LJIL(LJFF, c63268OsK, str);
            }
            return;
        }
        if (!c63622Oy2.LJIIJ() || !LJIIIZ(c63622Oy2)) {
            LJIILL(c63622Oy2, intValue, map);
        } else {
            HashSet hashSet = new HashSet();
            RunnableC63345OtZ.LJ(new C63266OsI(intValue, c63622Oy2, map, hashSet), new C63263OsF(intValue, this, c63622Oy2, map, hashSet), false);
        }
    }

    public final void LJIILJJIL(int i, java.util.Map<String, MessageBody> map) {
        java.util.Set<String> keySet;
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.LIZJ && (keySet = map.keySet()) != null && !keySet.isEmpty()) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C63269OsL.LJIIIZ;
            if (concurrentHashMap.get(Integer.valueOf(i)) == null) {
                concurrentHashMap.put(Integer.valueOf(i), new ArrayList(keySet));
            } else {
                ((List) concurrentHashMap.get(Integer.valueOf(i))).addAll(keySet);
            }
        }
        C63346Ota.LIZIZ().execute(new ARunnableS13S0201000_10(i, map, this, 8));
    }

    public static void LJIILIIL(java.util.Map map, int i, boolean z) {
        if (map == null || map.isEmpty()) {
            return;
        }
        while (true) {
            HashMap hashMap = null;
            for (Object obj : map.keySet()) {
                Object obj2 = map.get(obj);
                if (obj2 != null) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(obj, obj2);
                    if (hashMap.size() == 50) {
                        break;
                    }
                }
            }
            new C63267OsJ(z).LJIILJJIL(i, hashMap);
            return;
            new C63267OsJ(z).LJIILJJIL(i, hashMap);
        }
    }

    public final void LJIILL(C63622Oy2 c63622Oy2, int i, java.util.Map<String, MessageBody> map) {
        List<C63120Opw> list;
        C63269OsL.LJIIL(i, 2);
        C63337OtR.LJII(c63622Oy2, false).LIZ();
        if (c63622Oy2.LJLL <= -1000 && (list = this.LIZLLL) != null && !((ArrayList) list).isEmpty()) {
            C115284fk.LJIILIIL().LJIJJ(false, 6, (C63120Opw[]) ((ArrayList) this.LIZLLL).toArray(new C63120Opw[0]));
        }
        if (this.LIZJ && map != null) {
            C63269OsL.LJIIIZ(i, map.keySet());
        }
    }
}
