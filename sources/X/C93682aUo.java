package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.aUo, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93682aUo {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C16880lQ.LJLLJ(C93682aUo.class);
    }

    public static void LIZ(Activity activity, String str) {
        activity.getPackageName();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("referrer=");
        LIZ2.append(android.net.Uri.encode(str));
        String LIZIZ = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("market://details?id=com.apple.android.music&");
        LIZ3.append(LIZIZ);
        C16880lQ.LJFF(activity, 2024, new Intent("android.intent.action.VIEW", UriProtector.parse(X1D.LIZIZ(LIZ3))));
    }
}
