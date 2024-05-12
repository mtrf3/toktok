package X;

import android.util.ArrayMap;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.3bI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87043bI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, int i2, String str, int i3, boolean z) {
        String str2;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("enter_from", "notification_page");
        arrayMap.put("invited_user_cnt", String.valueOf(i));
        arrayMap.put("active_user_cnt", String.valueOf(i2));
        arrayMap.put("action", str);
        arrayMap.put("selected_user_cnt", String.valueOf(i3));
        if (z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        arrayMap.put("selected_all_users", str2);
        onEventV3.LIZIZ("click_create_group_chat_panel", arrayMap);
    }
}
