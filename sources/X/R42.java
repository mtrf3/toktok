package X;

import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class R42 {
    public static int LIZ;
    public static long LIZIZ;

    public static final void LIZ() {
        if (!R41.LJ().isEnableMultiAccountLogin()) {
            return;
        }
        if (LIZIZ == 0) {
            SharedPreferences LIZIZ2 = F9J.LIZIZ(EF7.LIZIZ(), 0, "ProfilePreferences");
            LIZ = LIZIZ2.getInt("last_upload_account_num", 0);
            LIZIZ = LIZIZ2.getLong("last_upload_account_num_time", 0L);
        }
        if (!R41.LJI()) {
            return;
        }
        if (SU4.LIZLLL(LIZIZ) && LIZ == ((RBX) HG3.LJIILL()).allUidList().size()) {
            return;
        }
        LIZ = ((RBX) HG3.LJIILL()).allUidList().size();
        LIZIZ = Calendar.getInstance().getTime().getTime();
        F9J.LIZIZ(EF7.LIZIZ(), 0, "ProfilePreferences").edit().putInt("last_upload_account_num", LIZ).putLong("last_upload_account_num_time", LIZIZ).apply();
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(LIZ, "account_num");
        RBY LIZ2 = R41.LIZ();
        List<String> allUidList = LIZ2.allUidList();
        ArrayList LIZIZ3 = s1.LIZIZ(allUidList, "userAccountService.allUidList()");
        Iterator<String> it = allUidList.iterator();
        while (it.hasNext()) {
            SignificantUserInfo findSignificanUserInfo = LIZ2.findSignificanUserInfo(it.next());
            if (findSignificanUserInfo != null) {
                LIZIZ3.add(findSignificanUserInfo);
            }
        }
        c188727au.LJIIIZ("user_ids", ORZ.LLD(LIZIZ3, ",", null, null, R43.LJLIL, 30));
        FMX.LJIIL("multi_account_status", c188727au.LIZ);
    }
}
