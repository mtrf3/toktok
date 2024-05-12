package X;

import android.text.TextUtils;
import com.bytedance.im.core.proto.MessageBody;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.OsL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63269OsL {
    public static final java.util.Set<Integer> LIZ = new CopyOnWriteArraySet();
    public static final java.util.Set<String> LIZIZ = new CopyOnWriteArraySet();
    public static final java.util.Set<Integer> LIZJ = new CopyOnWriteArraySet();
    public static final java.util.Set<Integer> LIZLLL = new CopyOnWriteArraySet();
    public static final java.util.Set<Integer> LJ = new CopyOnWriteArraySet();
    public static final java.util.Set<Integer> LJFF = new CopyOnWriteArraySet();
    public static final java.util.Set<String> LJI = new CopyOnWriteArraySet();
    public static final java.util.Map<Integer, java.util.Map<String, MessageBody>> LJII = new ConcurrentHashMap();
    public static final java.util.Set<String> LJIIIIZZ = new CopyOnWriteArraySet();
    public static final java.util.Map<Integer, List<String>> LJIIIZ = new ConcurrentHashMap();
    public static final java.util.Set<Integer> LJIIJ = new CopyOnWriteArraySet();
    public static final java.util.Set<Integer> LJIIJJI = new CopyOnWriteArraySet();
    public static final java.util.Map<String, WeakReference<C63536Owe>> LJIIL = new ConcurrentHashMap();
    public static final java.util.Set<String> LJIILIIL = new CopyOnWriteArraySet();

    public static void LJ() {
        ((CopyOnWriteArraySet) LIZ).clear();
        ((CopyOnWriteArraySet) LIZIZ).clear();
        ((CopyOnWriteArraySet) LIZJ).clear();
        ((CopyOnWriteArraySet) LJFF).clear();
        ((ConcurrentHashMap) LJII).clear();
        ((CopyOnWriteArraySet) LJI).clear();
        ((CopyOnWriteArraySet) LJIIIIZZ).clear();
        ((ConcurrentHashMap) LJIIIZ).clear();
        ((CopyOnWriteArraySet) LJIIJ).clear();
        ((CopyOnWriteArraySet) LJIIJJI).clear();
        ((CopyOnWriteArraySet) LJIILIIL).clear();
    }

    public static void LIZLLL(boolean z) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LJII;
        if (!concurrentHashMap.isEmpty()) {
            for (Integer num : concurrentHashMap.keySet()) {
                C63356Otk LJIIIZ2 = C63356Otk.LJIIIZ();
                int intValue = num.intValue();
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) LJII;
                java.util.Map map = (java.util.Map) concurrentHashMap2.get(num);
                LJIIIZ2.getClass();
                C63267OsJ.LJIILIIL(map, intValue, z);
                concurrentHashMap2.put(num, new ConcurrentHashMap());
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) LJIIIIZZ;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C63356Otk.LJIIIZ().getClass();
                new C63265OsH(true).LJIILIIL(str, 0L, null);
            }
            ((CopyOnWriteArraySet) LJIIIIZZ).clear();
        }
    }

    public static boolean LJFF(int i) {
        return ((CopyOnWriteArraySet) LJFF).contains(Integer.valueOf(i));
    }

    public static boolean LJII(int i) {
        java.util.Map<Integer, java.util.Map<String, MessageBody>> map = LJII;
        if (((ConcurrentHashMap) map).containsKey(Integer.valueOf(i))) {
            if (!((java.util.Map) ((ConcurrentHashMap) map).get(Integer.valueOf(i))).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static void LJIIIIZZ(C109544Rq c109544Rq) {
        C63536Owe c63536Owe;
        if (c109544Rq == null || TextUtils.isEmpty(c109544Rq.getUuid())) {
            return;
        }
        java.util.Map<String, WeakReference<C63536Owe>> map = LJIIL;
        Reference reference = (Reference) ((ConcurrentHashMap) map).get(c109544Rq.getUuid());
        if (reference == null || (c63536Owe = (C63536Owe) reference.get()) == null) {
            return;
        }
        String uuid = c109544Rq.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            ((ConcurrentHashMap) map).remove(uuid);
        }
        c63536Owe.LIZJ.LJJI = true;
        C63308Osy.LJI().LIZLLL().getClass();
        C63322OtC.LIZLLL("SendMsgHandler handleSendMsgByPush but options disabled");
    }

    public static void LJIIJ(int i) {
        ((CopyOnWriteArraySet) LIZJ).remove(Integer.valueOf(i));
    }

    public static void LIZ(int i, C109544Rq c109544Rq) {
        if (c109544Rq == null) {
            return;
        }
        C63579OxL c63579OxL = new C63579OxL();
        c63579OxL.LIZLLL = c109544Rq.getConversationId();
        c63579OxL.LJII = Long.valueOf(c109544Rq.getConversationShortId());
        c63579OxL.LJ = Integer.valueOf(c109544Rq.getConversationType());
        c63579OxL.LJIIL = Long.valueOf(c109544Rq.getCreatedAt());
        LIZIZ(i, c63579OxL.build());
    }

    public static void LIZIZ(int i, MessageBody messageBody) {
        if (messageBody.conversation_id != null && messageBody.conversation_short_id != null && messageBody.conversation_type != null) {
            java.util.Map<Integer, java.util.Map<String, MessageBody>> map = LJII;
            if (((ConcurrentHashMap) map).get(Integer.valueOf(i)) == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                concurrentHashMap.put(messageBody.conversation_id, messageBody);
                ((ConcurrentHashMap) map).put(Integer.valueOf(i), concurrentHashMap);
                return;
            }
            ((java.util.Map) ((ConcurrentHashMap) map).get(Integer.valueOf(i))).put(messageBody.conversation_id, messageBody);
        }
    }

    public static boolean LJI(int i, String str) {
        java.util.Map<Integer, java.util.Map<String, MessageBody>> map = LJII;
        if (((ConcurrentHashMap) map).containsKey(Integer.valueOf(i))) {
            if (((ConcurrentHashMap) map).get(Integer.valueOf(i)) != null) {
                if (((java.util.Map) ((ConcurrentHashMap) map).get(Integer.valueOf(i))).containsKey(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void LJIIIZ(int i, Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        List list = (List) ((ConcurrentHashMap) LJIIIZ).get(Integer.valueOf(i));
        if (list == null) {
            return;
        }
        list.removeAll(collection);
        if (!list.isEmpty()) {
            return;
        }
        if (!((CopyOnWriteArraySet) LJIIJ).contains(Integer.valueOf(i))) {
            return;
        }
        C63309Osz.LIZLLL().LJII(i);
    }

    public static void LJIIJJI(int i, String str) {
        java.util.Map<Integer, java.util.Map<String, MessageBody>> map = LJII;
        if (((ConcurrentHashMap) map).containsKey(Integer.valueOf(i))) {
            ((java.util.Map) ((ConcurrentHashMap) map).get(Integer.valueOf(i))).remove(str);
        }
    }

    public static void LJIIL(int i, int i2) {
        java.util.Set<Integer> set = LIZ;
        if (((CopyOnWriteArraySet) set).contains(Integer.valueOf(i))) {
            ((CopyOnWriteArraySet) set).remove(Integer.valueOf(i));
            C63308Osy.LJI().LIZIZ().LJIIL(i, i2);
        }
    }

    public static void LIZJ(long j, long j2, int i, int i2, String str) {
        C63579OxL c63579OxL = new C63579OxL();
        c63579OxL.LIZLLL = str;
        c63579OxL.LJII = Long.valueOf(j);
        c63579OxL.LJ = Integer.valueOf(i2);
        c63579OxL.LJIIL = Long.valueOf(j2);
        LIZIZ(i, c63579OxL.build());
    }
}
