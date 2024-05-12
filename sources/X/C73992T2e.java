package X;

import android.os.Bundle;
import com.ss.android.common.lib.AppLogNewUtils;

/* renamed from: X.T2e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73992T2e {
    public static void LIZ(int i, String str) {
        Bundle LIZ = C0H1.LIZ("api", str);
        LIZ.putString("status", String.valueOf(i));
        try {
            AppLogNewUtils.LIZJ("pns_popup_api_response", LIZ);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
