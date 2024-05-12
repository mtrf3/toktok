package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.services.BaseUserService;
import djb.IDaS20S0000000_1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.3WB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WB {
    public static volatile boolean LIZLLL;
    public static final ArrayList<String> LIZ = new ArrayList<>();
    public static final ArrayList<String> LIZIZ = new ArrayList<>();
    public static final ArrayList<String> LIZJ = new ArrayList<>();
    public static final C5H3<C3WB> LJ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C3WE.LJLIL);

    public static String LIZ() {
        return BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
    }

    public final void LIZIZ(List<? extends IMContact> contacts) {
        o.LJIIIZ(contacts, "contacts");
        C3WF.LIZ.getClass();
        if (C3WF.LIZ() == EnumC84133Rx.RECENT_SENT) {
            return;
        }
        LIZJ("recent share", contacts);
    }

    public final void LIZJ(String str, List list) {
        ArrayList LJ2 = AnonymousClass391.LJ(list, "contacts");
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                IMContact iMContact = (IMContact) it.next();
                String str2 = "";
                if (iMContact instanceof IMConversation) {
                    str2 = ((IMConversation) iMContact).getConversationId();
                    o.LJIIIIZZ(str2, "contact.conversationId");
                } else if (iMContact instanceof IMUser) {
                    str2 = ((IMUser) iMContact).getUid();
                    o.LJIIIIZZ(str2, "contact.uid");
                }
                if (str2.length() > 0) {
                    arrayList.add(str2);
                    long currentTimeMillis = System.currentTimeMillis();
                    String LIZ2 = LIZ();
                    o.LJIIIIZZ(LIZ2, "getCurrUid()");
                    LJ2.add(new YXF(currentTimeMillis, -1L, str2, LIZ2, str));
                    if (o.LJ(str, "recent link share")) {
                        ArrayList<String> arrayList2 = LIZIZ;
                        if (!arrayList2.contains(str2)) {
                            arrayList2.add(str2);
                        }
                    } else {
                        ArrayList<String> arrayList3 = LIZIZ;
                        if (arrayList3.contains(str2)) {
                            arrayList3.remove(str2);
                        }
                    }
                }
            }
            LIZ.removeAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                LIZ.add(0, (String) it2.next());
            }
        }
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ.plus(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 14)), null, new C3WC(LJ2, null), 2);
    }
}
