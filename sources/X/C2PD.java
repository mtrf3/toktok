package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;

/* renamed from: X.2PD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2PD {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Integer num, String str, String str2, String str3, boolean z) {
        String str4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("author_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("group_id", str3);
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_enter", str4);
        if (num != null) {
            linkedHashMap.put("aweme_type", String.valueOf(num.intValue()));
        }
        FMX.LJIIL("re_tag_entrance_click", linkedHashMap);
    }
}
