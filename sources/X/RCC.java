package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RCC {
    public static final /* synthetic */ int LIZ = 0;

    public static C73800Sxo LIZ(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            o.LJI(str);
            hashMap.put("verify_ticket", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            o.LJI(str2);
            hashMap.put("wait_ticket", str2);
        }
        NetworkProxyAccount.LIZ.getClass();
        return NetworkProxyAccount.LJII("/passport/push_challenge/request_2sv/", hashMap).LIZJ(C141335gf.LJLIL).LJII(C73969T1h.LIZIZ());
    }
}
