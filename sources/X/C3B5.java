package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.3B5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3B5 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z, boolean z2, String str, String str2) {
        Object obj;
        C85323Wm LIZJ = C05040Hs.LIZJ(str, "toUid", "onEventV3");
        C65864Pt6 c65864Pt6 = new C65864Pt6();
        String str3 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c65864Pt6.put("is_active", obj);
        if (!z2) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c65864Pt6.put("is_active_after", str3);
        c65864Pt6.put("to_user_id", str);
        c65864Pt6.put("update_type", str2);
        c65864Pt6.build();
        LIZJ.LIZIZ("activity_status_receive_msg", c65864Pt6);
    }
}
