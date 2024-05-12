package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeInboxFilterGroups;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LVB {
    public static final LVB LIZ = new LVB();
    public static final ConcurrentHashMap<Integer, NoticeGroupAttrs> LIZIZ = new ConcurrentHashMap<>();
    public static List<NoticeInboxFilterGroups> LIZJ = C61878OQg.INSTANCE;
    public static final Keva LIZLLL = Keva.getRepo("keva_notice_count");

    static {
        C10K.LIZIZ(LVC.LJLIL, C10K.LJI, null);
    }

    public static List LIZJ() {
        ConcurrentHashMap<Integer, NoticeGroupAttrs> concurrentHashMap = LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, NoticeGroupAttrs> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue().showType == EnumC54302LSw.ShowDot) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return ORZ.LLJI(linkedHashMap.keySet());
    }

    public static List LIZLLL() {
        ConcurrentHashMap<Integer, NoticeGroupAttrs> concurrentHashMap = LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, NoticeGroupAttrs> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue().showType == EnumC54302LSw.ShowNum) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return ORZ.LLJI(linkedHashMap.keySet());
    }

    public static String LJFF() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, NoticeGroupAttrs> entry : LIZIZ.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        String json = GsonProtectorUtils.toJson(C75792yF.LIZIZ(), linkedHashMap, new LVI().getType());
        o.LJIIIIZZ(json, "getGson().toJson(mutable…ceGroupAttrs>>() {}.type)");
        return json;
    }

    public static List LIZ(int i) {
        NoticeInboxFilterGroups noticeInboxFilterGroups;
        List<Integer> list;
        Iterator<NoticeInboxFilterGroups> it = LIZJ.iterator();
        do {
            noticeInboxFilterGroups = null;
            if (!it.hasNext()) {
                break;
            }
            noticeInboxFilterGroups = it.next();
        } while (noticeInboxFilterGroups.LIZ != i);
        NoticeInboxFilterGroups noticeInboxFilterGroups2 = noticeInboxFilterGroups;
        if (noticeInboxFilterGroups2 == null || (list = noticeInboxFilterGroups2.groups) == null) {
            return C61878OQg.INSTANCE;
        }
        return list;
    }

    public static List LIZIZ(int i) {
        NoticeInboxFilterGroups noticeInboxFilterGroups;
        List<Integer> list;
        Iterator<NoticeInboxFilterGroups> it = LIZJ.iterator();
        do {
            noticeInboxFilterGroups = null;
            if (!it.hasNext()) {
                break;
            }
            noticeInboxFilterGroups = it.next();
        } while (noticeInboxFilterGroups.filterType != i);
        NoticeInboxFilterGroups noticeInboxFilterGroups2 = noticeInboxFilterGroups;
        if (noticeInboxFilterGroups2 == null || (list = noticeInboxFilterGroups2.groups) == null) {
            return C61878OQg.INSTANCE;
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJ(String str) {
        new LinkedHashMap();
        Object fromJson = GsonProtectorUtils.fromJson(C75792yF.LIZIZ(), str, new LVH().getType());
        o.LJIIIIZZ(fromJson, "getGson().fromJson(attrJ…ceGroupAttrs>>() {}.type)");
        for (Map.Entry entry : ((java.util.Map) fromJson).entrySet()) {
            LIZIZ.put(entry.getKey(), entry.getValue());
        }
    }

    public static void LJI(NoticeList noticeList) {
        int ordinal;
        int ordinal2;
        List<NoticeCount> items = noticeList.getItems();
        if (items != null) {
            for (NoticeCount noticeCount : items) {
                LVG[] values = LVG.values();
                Integer clearOccasion = noticeCount.getClearOccasion();
                if (clearOccasion != null) {
                    ordinal = clearOccasion.intValue();
                } else {
                    ordinal = LVG.Normal.ordinal();
                }
                LVG lvg = values[ordinal];
                EnumC54302LSw[] values2 = EnumC54302LSw.values();
                Integer showType = noticeCount.getShowType();
                if (showType != null) {
                    ordinal2 = showType.intValue();
                } else {
                    ordinal2 = EnumC54302LSw.ShowDefault.ordinal();
                }
                LIZIZ.put(Integer.valueOf(noticeCount.getGroup()), new NoticeGroupAttrs(lvg, values2[ordinal2], noticeCount.getAliveDuration(), false, 8, null));
            }
            C10K.LIZIZ(LVF.LJLIL, C10K.LJI, null);
        }
        C10K.LIZIZ(new LVD(false), C10K.LJI, null);
    }
}
