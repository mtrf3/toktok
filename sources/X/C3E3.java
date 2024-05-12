package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.3E3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3E3 implements C3E7 {
    public static final C3E3 LIZ = new C3E3();

    @Override // X.C3E7
    public final void LIZ(List<C63089OpR> memberList) {
        boolean z;
        List<String> list;
        String secUid;
        o.LJIIIIZZ(memberList, "memberList");
        C64962gm LIZ2 = C48841JEv.LIZ(C78613UtF.LIZJ);
        C3E4 findConversationIdByUid = C3E4.LJLIL;
        o.LJIIIZ(findConversationIdByUid, "findConversationIdByUid");
        if (C3E8.LIZ()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C63089OpR c63089OpR : memberList) {
            C63089OpR c63089OpR2 = c63089OpR;
            if (c63089OpR2.getUid() > 0 && (secUid = c63089OpR2.getSecUid()) != null && secUid.length() != 0 && c63089OpR2.getConversationType() != AbstractC63505Ow9.LIZIZ) {
                arrayList.add(c63089OpR);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C63089OpR c63089OpR3 = (C63089OpR) it.next();
            arrayList2.add(new OSZ(c63089OpR3, C80533Eb.LJIIJ(String.valueOf(c63089OpR3.getUid()), c63089OpR3.getSecUid())));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            OSZ osz = (OSZ) next;
            C63089OpR c63089OpR4 = (C63089OpR) osz.getFirst();
            IMUser iMUser = (IMUser) osz.getSecond();
            if (iMUser == null) {
                ConcurrentHashMap<String, String> concurrentHashMap = C3E5.LIZIZ;
                String valueOf = String.valueOf(c63089OpR4.getUid());
                String secUid2 = c63089OpR4.getSecUid();
                o.LJIIIIZZ(secUid2, "member.secUid");
                concurrentHashMap.put(valueOf, secUid2);
            } else {
                String secUid3 = iMUser.getSecUid();
                if (secUid3 == null || secUid3.length() == 0) {
                    z = true;
                    iMUser.setSecUid(c63089OpR4.getSecUid());
                } else {
                    z = false;
                }
                String uid = iMUser.getUid();
                o.LJIIIIZZ(uid, "user.uid");
                String str = (String) findConversationIdByUid.invoke(Long.valueOf(CastLongProtector.parseLong(uid)));
                if (str.length() > 0 && !C3E8.LIZ() && (list = C3E6.LIZJ) != null && ((CopyOnWriteArrayList) list).contains(str)) {
                    List<String> list2 = C3E6.LIZJ;
                    o.LJI(list2);
                    ((CopyOnWriteArrayList) list2).remove(str);
                }
                if (z) {
                    arrayList3.add(next);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object second = ((OSZ) it3.next()).getSecond();
            if (second != null) {
                arrayList4.add(second);
            }
        }
        XKX.LIZLLL(LIZ2, null, null, new C80473Dv(arrayList4, null), 3);
    }
}
