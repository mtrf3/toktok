package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.user.UserStore;

/* loaded from: classes12.dex */
public final /* synthetic */ class RB1 extends TBS implements InterfaceC65784Pro<UserStore.AccountUser> {
    public RB1(RB3 rb3) {
        super(0, rb3, RB3.class, "accountUserUpgrade", "accountUserUpgrade()Lcom/ss/android/ugc/aweme/user/UserStore$AccountUser;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final UserStore.AccountUser invoke() {
        RB3 rb3 = (RB3) this.receiver;
        rb3.getClass();
        String str = rb3.LIZ;
        long j = C36244EKi.LIZ().getLong("user_id", 0L);
        String str2 = "";
        String string = C36244EKi.LIZ().getString("session_key", "");
        if (string == null) {
            string = "";
        }
        String string2 = C36244EKi.LIZ().getString("user_name", "");
        if (string2 == null) {
            string2 = "";
        }
        boolean z = C36244EKi.LIZ().getBoolean("user_verified", false);
        String string3 = C36244EKi.LIZ().getString("country_code", "");
        if (string3 == null) {
            string3 = "";
        }
        String string4 = C36244EKi.LIZ().getString("sec_uid", "");
        if (string4 != null) {
            str2 = string4;
        }
        boolean z2 = C36244EKi.LIZ().getBoolean("is_kids_mode", false);
        if (!TextUtils.equals(str, String.valueOf(j))) {
            return null;
        }
        return C68544QvE.LIZ(0, 0, j, string, string2, string3, str2, z, z2);
    }
}
