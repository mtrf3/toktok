package X;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.i0;

/* renamed from: X.Sbs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72440Sbs {
    public static void LIZ(String str) {
        C81814W9a LJIIJ = C81814W9a.LJIIJ();
        if (LJIIJ.LIZIZ.LJJII.LIZ() == null || !((Boolean) LJIIJ.LIZIZ.LJJII.LIZ()).booleanValue() || C16880lQ.LLJJJJ() != Looper.myLooper()) {
        } else {
            throw new RuntimeException(i0.LJFF(str, ".   Any question please contact @weixin.gary"));
        }
    }

    public static boolean LIZIZ(String str) {
        LIZ("isImageDownloaded may cause ANR,use isImageDownloadedAsync or call it in Non-UI Thread");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return W5U.LIZJ().LIZ(UriProtector.parse(str));
    }
}
