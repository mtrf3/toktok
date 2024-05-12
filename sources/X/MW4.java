package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class MW4 {
    public static void LIZ(MW4 mw4, String str, String str2, BaseNotice baseNotice, boolean z, String str3, HashMap hashMap, int i) {
        String str4;
        String str5 = null;
        if ((i & 4) != 0) {
            baseNotice = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            str3 = "";
        }
        if ((i & 64) != 0) {
            hashMap = null;
        }
        mw4.getClass();
        if (TextUtils.isEmpty(str3)) {
            str3 = "notification_page";
        }
        C78857UxB.LJJIFFI(str, str2, str3, hashMap);
        if (z) {
            str4 = "click_name";
        } else {
            str4 = "click_head";
        }
        if (baseNotice != null) {
            str5 = baseNotice.getAccountType();
        }
        ViewOnClickListenerC56908MVc.logEnterPersonalDetail(str, str3, str4, str5);
    }
}
