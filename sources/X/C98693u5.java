package X;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.3u5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98693u5 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C98733u9.INSTANCE);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C94763nk.LJLIL);
    public static final ConcurrentHashMap<String, C98843uK> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, InterfaceC98713u7> LIZLLL = new ConcurrentHashMap<>();
    public static final CopyOnWriteArrayList<InterfaceC98683u4> LJ = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<C99453vJ> LJFF = new CopyOnWriteArrayList<>();
    public static final C98833uJ LJI = new C4ZE() { // from class: X.3uJ
        @Override // X.C4ZE
        public final void LIZ(Long l, Long l2, String str) {
            long longValue = l.longValue();
            long longValue2 = l2.longValue();
            C34B.LIZIZ("TypingStatusReceiverTimer", "onGetTypingEvent");
            ((Handler) C98693u5.LIZ.getValue()).removeMessages(str.hashCode());
            C98843uK c98843uK = new C98843uK(str, longValue, longValue2);
            C98693u5.LIZJ.put(str, c98843uK);
            Iterator<C99453vJ> it = C98693u5.LJFF.iterator();
            while (it.hasNext()) {
                C99453vJ next = it.next();
                if (o.LJ(str, next.getConversationId())) {
                    next.LIZJ = true;
                    next.LJ = longValue;
                    next.LJFF = longValue2;
                    next.LJI = str;
                }
            }
            C98693u5.LIZIZ(str, true);
            Message obtain = Message.obtain();
            obtain.what = str.hashCode();
            obtain.obj = c98843uK;
            ((Handler) C98693u5.LIZ.getValue()).sendMessageDelayed(obtain, ((Number) C98693u5.LIZIZ.getValue()).longValue());
        }
    };

    public static void LIZ(InterfaceC98683u4 controller) {
        o.LJIIIZ(controller, "controller");
        CopyOnWriteArrayList<InterfaceC98683u4> copyOnWriteArrayList = LJ;
        if (!copyOnWriteArrayList.contains(controller)) {
            copyOnWriteArrayList.add(controller);
            if (LIZJ.get(controller.getSessionId()) != null) {
                controller.LLFII();
            } else {
                controller.LJIL();
            }
        }
    }

    public static void LIZIZ(String conversationId, boolean z) {
        o.LJIIIZ(conversationId, "conversationId");
        InterfaceC98713u7 interfaceC98713u7 = LIZLLL.get(conversationId);
        if (interfaceC98713u7 != null) {
            interfaceC98713u7.V1(z);
        }
        Iterator<InterfaceC98683u4> it = LJ.iterator();
        while (it.hasNext()) {
            InterfaceC98683u4 next = it.next();
            if (o.LJ(next.getSessionId(), conversationId)) {
                if (z) {
                    next.LLFII();
                } else {
                    next.LJIL();
                }
            }
        }
    }

    public static void LIZJ(String convId, InterfaceC98713u7 observer) {
        o.LJIIIZ(convId, "convId");
        o.LJIIIZ(observer, "observer");
        LIZLLL.put(convId, observer);
        if (LIZJ.get(convId) != null) {
            observer.V1(true);
        }
    }
}
