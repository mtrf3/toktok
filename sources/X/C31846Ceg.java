package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftInfoInBox;
import com.bytedance.android.livesdk.model.GiftsBoxInfoForSend;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Ceg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31846Ceg {
    public static final LinkedList<Long> LIZ = new LinkedList<>();
    public static final HashMap<Long, Long> LIZIZ = new HashMap<>();
    public static final Keva LIZJ;

    static {
        Keva repo = Keva.getRepo("gift_send");
        LIZJ = repo;
        String recentGiftsString = repo.getString(LIZ(), "");
        o.LJIIIIZZ(recentGiftsString, "recentGiftsString");
        Iterator it = s.LJLJJL(recentGiftsString, new String[]{" "}, 0, 6).iterator();
        while (it.hasNext()) {
            List LJLJJL = s.LJLJJL((String) it.next(), new String[]{","}, 0, 6);
            if (LJLJJL.size() == 2) {
                Long LJJIZ = C38350F3i.LJJIZ((String) ListProtector.get(LJLJJL, 0));
                Long LJJIZ2 = C38350F3i.LJJIZ((String) ListProtector.get(LJLJJL, 1));
                if (LJJIZ != null && LJJIZ2 != null) {
                    LIZ.add(LJJIZ);
                    LIZIZ.put(LJJIZ, LJJIZ2);
                }
            }
        }
    }

    public static String LIZIZ() {
        LinkedList<Long> linkedList = LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it = linkedList.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            Long l = LIZIZ.get(Long.valueOf(longValue));
            if (l != null) {
                arrayList.add(new OSZ(Long.valueOf(longValue), l));
            }
        }
        return ORZ.LLD(arrayList, ",", "[", "]", C58482Rg.LJLIL, 24);
    }

    public static String LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("recent_gifts_");
        LIZ2.append(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        return X1D.LIZIZ(LIZ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    public static void LIZJ(long j, GiftsBoxInfoForSend giftsBoxInfoForSend, long j2) {
        ?? LJJIJ;
        List<GiftInfoInBox> list;
        Gift findGiftById = GiftManager.inst().findGiftById(j);
        if (findGiftById == null) {
            return;
        }
        if (findGiftById.isBoxGift) {
            if (giftsBoxInfoForSend != null && (list = giftsBoxInfoForSend.gifts) != null) {
                LJJIJ = new ArrayList(C32I.LJJL(list, 10));
                Iterator<GiftInfoInBox> it = list.iterator();
                while (it.hasNext()) {
                    LJJIJ.add(Long.valueOf(it.next().giftId));
                }
            } else {
                LJJIJ = C61878OQg.INSTANCE;
            }
        } else {
            LJJIJ = C47261Igj.LJJIJ(Long.valueOf(findGiftById.id));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : LJJIJ) {
            if (hashSet.add(Long.valueOf(((Number) obj).longValue()))) {
                arrayList.add(obj);
            }
        }
        LinkedList<Long> linkedList = LIZ;
        ORS.LJJLIL(new AqS171S0100000_5(arrayList, (List<? extends AbstractC32698CsQ<? extends C30896CAq>>) 654), linkedList);
        linkedList.addAll(0, arrayList);
        while (true) {
            LinkedList<Long> linkedList2 = LIZ;
            if (linkedList2.size() <= 20) {
                break;
            } else {
                linkedList2.removeLast();
            }
        }
        long size = j2 - (arrayList.size() * 1000);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LIZIZ.put(Long.valueOf(((Number) it2.next()).longValue()), Long.valueOf(size));
            size += 1000;
        }
        LinkedList<Long> linkedList3 = LIZ;
        ArrayList arrayList2 = new ArrayList();
        Iterator<Long> it3 = linkedList3.iterator();
        while (it3.hasNext()) {
            long longValue = it3.next().longValue();
            Long l = LIZIZ.get(Long.valueOf(longValue));
            if (l != null) {
                arrayList2.add(new OSZ(Long.valueOf(longValue), l));
            }
        }
        LIZJ.storeString(LIZ(), ORZ.LLD(arrayList2, " ", null, null, C58442Rc.LJLIL, 30));
    }
}
