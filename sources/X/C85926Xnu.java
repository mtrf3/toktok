package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.o;

/* renamed from: X.Xnu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85926Xnu {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(String str) {
        NotificationChannel notificationChannel;
        if (str == null || !C78685UuP.LJJIII().isSystemNotifyChannel(str)) {
            return true;
        }
        String realChannelId = C78685UuP.LJJIII().getRealChannelId(str);
        Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "notification");
        o.LJII(LLILL, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) LLILL;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = notificationManager.getNotificationChannel(realChannelId)) == null || notificationChannel.getImportance() != 0) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(Context context) {
        if (C40322Fs6.LIZJ(context)) {
            return true;
        }
        C85962XoU.LJII(context, true, null, true);
        return false;
    }

    public static final String LIZJ(String originChannelId) {
        o.LJIIIZ(originChannelId, "originChannelId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(originChannelId);
        LIZ2.append("_associated_");
        LIZ2.append(2);
        return X1D.LIZIZ(LIZ2);
    }

    public static final C2068389v LIZLLL(String resName) {
        boolean z;
        int identifier;
        o.LJIIIZ(resName, "resName");
        if (resName.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (identifier = EF7.LIZIZ().getResources().getIdentifier(resName, "raw", EF7.LIZIZ().getPackageName())) == 0) {
            return null;
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = identifier;
        return c2068389v;
    }
}
