package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.GZk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41732GZk {
    public static void LIZ() {
        LIZLLL("clear");
        Context LIZ = C5L7.LIZ();
        LIZJ(LIZ);
        new AnonymousClass078(LIZ).LIZJ(1, null);
        Iterator it = ((ArrayList) PublishService.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            new AnonymousClass078(LIZ).LIZJ(((Number) it.next()).intValue(), null);
        }
        ((ArrayList) PublishService.LJLILLLLZI).clear();
    }

    public static void LIZIZ() {
        LIZLLL("clearProgress");
        Context LIZ = C5L7.LIZ();
        LIZJ(LIZ);
        new AnonymousClass078(LIZ).LIZJ(1, null);
    }

    public static void LIZJ(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            Object LLILL = C16880lQ.LLILL(context, "notification");
            o.LJII(LLILL, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) LLILL).createNotificationChannel(new NotificationChannel("com.ss.android.ugc.trill.publish", context.getString(R.string.thq), 2));
        }
    }

    public static void LIZLLL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishForegroundService ");
        LIZ.append(str);
        GUH.LJIJJ(X1D.LIZIZ(LIZ));
    }
}
