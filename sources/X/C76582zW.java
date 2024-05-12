package X;

import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.2zW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76582zW {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C76592zX.LJLIL);

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static List LIZIZ() {
        long j;
        Long LJJIZ;
        Keva kevaRepo = LIZ();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long LIZ2 = NetworkService.LJI().LIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("previous_recommended_conv_ids_within_14_days");
        LIZ3.append(curUserId);
        String string = kevaRepo.getString(X1D.LIZIZ(LIZ3), "");
        o.LJIIIIZZ(string, "repo.getString(KEY_PREVI…WITHIN_14_DAYS + uid, \"\")");
        List LJLJJL = s.LJLJJL(string, new String[]{","}, 0, 6);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : LJLJJL) {
            if (true ^ o.LJ(obj, "")) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            List LJLJJL2 = s.LJLJJL((String) it.next(), new String[]{"_"}, 0, 6);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : LJLJJL2) {
                if (!o.LJ(obj2, "")) {
                    arrayList3.add(obj2);
                }
            }
            if (arrayList3.size() == 2) {
                Object obj3 = ListProtector.get(arrayList3, 0);
                Long LJJIZ2 = C38350F3i.LJJIZ((String) ListProtector.get(arrayList3, 1));
                long j2 = 0;
                if (LJJIZ2 != null) {
                    j = LJJIZ2.longValue();
                } else {
                    j = 0;
                }
                if (LIZ2 - j <= 1209600000) {
                    if (linkedHashMap.containsKey(obj3)) {
                        String str = (String) linkedHashMap.get(obj3);
                        if (str != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
                            j2 = LJJIZ.longValue();
                        }
                        linkedHashMap.put(obj3, String.valueOf(Math.max(j2, j)));
                    } else {
                        linkedHashMap.put(obj3, String.valueOf(j));
                    }
                }
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(str2);
            LIZ4.append('_');
            LIZ4.append(str3);
            arrayList.add(X1D.LIZIZ(LIZ4));
        }
        return arrayList;
    }

    public static long LIZJ() {
        Keva kevaRepo = LIZ();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("recommended_chats_appeared_from_last_time");
        LIZ2.append(curUserId);
        return kevaRepo.getLong(X1D.LIZIZ(LIZ2), -1L);
    }

    public static long LIZLLL() {
        Keva kevaRepo = LIZ();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("time_ignore_push_at_first");
        LIZ2.append(curUserId);
        return kevaRepo.getLong(X1D.LIZIZ(LIZ2), 0L);
    }

    public static void LJ(String convIds) {
        Keva kevaRepo = LIZ();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        o.LJIIIZ(convIds, "convIds");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("previous_recommended_user_ids");
        LIZ2.append(curUserId);
        kevaRepo.storeString(X1D.LIZIZ(LIZ2), convIds);
    }

    public static void LJFF(long j) {
        Keva kevaRepo = LIZ();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("time_ignore_push_at_first");
        LIZ2.append(curUserId);
        kevaRepo.storeLong(X1D.LIZIZ(LIZ2), j);
    }

    public static void LJI(long j) {
        Keva kevaRepo = LIZ();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("time_ignore_push_at_second");
        LIZ2.append(curUserId);
        kevaRepo.storeLong(X1D.LIZIZ(LIZ2), j);
    }

    public static void LJII(long j) {
        Keva kevaRepo = LIZ();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("time_ignore_rec_push_for_2_days");
        LIZ2.append(curUserId);
        kevaRepo.storeLong(X1D.LIZIZ(LIZ2), j);
    }
}
