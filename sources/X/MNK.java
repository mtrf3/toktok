package X;

import com.ss.android.ugc.aweme.inbox.api.MultiApiManager;

/* loaded from: classes10.dex */
public final class MNK {
    public static /* synthetic */ AbstractC73672Svk LIZ(MultiApiManager.API api, String str, String str2, Boolean bool, Boolean bool2, int i) {
        int i2;
        Boolean bool3 = bool2;
        String str3 = str2;
        Boolean bool4 = bool;
        if ((i & 2) != 0) {
            str3 = null;
        }
        if ((i & 4) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            bool4 = Boolean.TRUE;
        }
        if ((i & 16) != 0) {
            bool3 = Boolean.FALSE;
        }
        return api.fetchInboxEntrance(str, str3, i2, bool4, bool3);
    }
}
