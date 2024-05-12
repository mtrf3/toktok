package X;

import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.model.Gift;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.OSg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61930OSg {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list, java.util.Map map, List list2, java.util.Map map2, java.util.Map map3) {
        String str;
        Object obj;
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Gift gift = (Gift) it.next();
            Gift gift2 = (Gift) ((LinkedHashMap) map2).get(Long.valueOf(gift.id));
            if (gift2 == null) {
                gift2 = (Gift) map.get(Long.valueOf(gift.id));
            }
            if (gift2 != null) {
                java.util.Set LLJJ = ORZ.LLJJ(list2);
                try {
                    java.util.Map LIZ2 = C36528EVg.LIZ(gift);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(LIZ2.size()));
                    for (Object obj2 : ((LinkedHashMap) LIZ2).entrySet()) {
                        Map.Entry entry = (Map.Entry) obj2;
                        if (map3 != null) {
                            str2 = (String) map3.get(entry.getKey());
                        } else {
                            str2 = null;
                        }
                        linkedHashMap.put(str2, ((Map.Entry) obj2).getValue());
                    }
                    Field[] declaredFields = gift2.getClass().getDeclaredFields();
                    o.LJIIIIZZ(declaredFields, "coldGift.javaClass.declaredFields");
                    for (Field field : declaredFields) {
                        if (map3 != null) {
                            str = (String) map3.get(field.getName());
                        } else {
                            str = null;
                        }
                        field.setAccessible(true);
                        if (ORZ.LJLJJI(str, LLJJ) && (obj = linkedHashMap.get(str)) != null) {
                            field.set(gift2, obj);
                        }
                        C36528EVg.LIZIZ(gift2, field, new AqS176S0100000_10(gift2, 79));
                    }
                } catch (Exception e) {
                    C78983UzD.LJIIZILJ(e);
                    throw new UWH("Merge hot gift failed", e.getMessage());
                }
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Missing Gift: ");
                C0RN.LJ(LIZ3, gift.id, LIZ3, "MergeDataUtils");
                long j = gift.id;
                JSONObject LIZLLL = C770830u.LIZLLL("merge_type", -1);
                String LIZIZ = Q8U.LIZIZ(new Object[]{String.valueOf(j)}, 1, "Missing gift when merge %s", "format(format, *args)");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_code", 102);
                jSONObject.put("error_msg", LIZIZ);
                JSONObject LIZIZ2 = C1B8.LIZIZ("error_msg", LIZIZ, "error_code", 102);
                if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_gift_list_data_merge", 0.1d)) {
                    BZI LIZ4 = C28787BRn.LIZ("gift_list_data_merge");
                    LIZ4.LJIIZILJ();
                    LIZ4.LJIJJ(Integer.valueOf(C77285UUv.LIZ()), "is_anchor");
                    LIZ4.LJJ(LIZLLL);
                    LIZ4.LJJ(jSONObject);
                    LIZ4.LJJ(LIZIZ2);
                    LIZ4.LJJIIJZLJL();
                }
                C0K2.LJI("gift_list_data_merge_error", jSONObject, LIZLLL, LIZIZ2);
                gift2 = null;
            }
            arrayList.add(gift2);
        }
        List LJLL = ORZ.LJLL(arrayList);
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("toFullGiftList ");
        LIZ5.append(list.size());
        LIZ5.append(" in ");
        LIZ5.append(currentTimeMillis2 - currentTimeMillis);
        LIZ5.append(" ms");
        C0NB.LJIIIZ("MergeDataUtils", X1D.LIZIZ(LIZ5));
        return LJLL;
    }
}
