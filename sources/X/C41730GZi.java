package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import kotlin.jvm.internal.o;

/* renamed from: X.GZi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41730GZi {
    public static PublishService LIZ;

    public static void LIZ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PublishNotificationManager ");
        LIZ2.append(str);
        GUH.LJIJJ(X1D.LIZIZ(LIZ2));
    }

    public static void LIZIZ(String publishId) {
        Object LLLL;
        o.LJIIIZ(publishId, "publishId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("show publishId:");
        LIZ2.append(publishId);
        LIZ(X1D.LIZIZ(LIZ2));
        Context LIZ3 = C5L7.LIZ();
        Intent intent = new Intent(LIZ3, (Class<?>) PublishService.class);
        intent.putExtra("PUBLISH_ID", publishId);
        PublishService publishService = LIZ;
        if (publishService != null) {
            publishService.LIZ(publishId);
            LLLL = true;
        } else {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26 && ((!C19N.LJ("studio_force_foreground_under_android_s", true) || i < 31) && (i < 33 || new AnonymousClass078(C16880lQ.LLLLJI(C60903NvH.LJ)).LIZIZ()))) {
                LLLL = LIZ3.startForegroundService(intent);
            } else {
                LLLL = C16880lQ.LLLL(LIZ3, intent);
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("start result=");
        LIZ4.append(LLLL);
        LIZ(X1D.LIZIZ(LIZ4));
    }

    public static final void LIZJ(String publishId, InterfaceC88471Ynr interfaceC88471Ynr) {
        o.LJIIIZ(publishId, "publishId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("show publishId:");
        LIZ2.append(publishId);
        LIZ(X1D.LIZIZ(LIZ2));
        C41732GZk.LIZIZ();
        Context LIZ3 = C5L7.LIZ();
        Intent intent = new Intent(LIZ3, (Class<?>) PublishService.class);
        intent.putExtra("PUBLISH_ID", publishId);
        PublishService publishService = LIZ;
        boolean z = true;
        if (publishService != null) {
            publishService.LIZ(publishId);
        } else {
            z = ((Boolean) interfaceC88471Ynr.invoke(LIZ3, intent)).booleanValue();
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("start result=");
        LIZ4.append(z);
        LIZ(X1D.LIZIZ(LIZ4));
    }
}
