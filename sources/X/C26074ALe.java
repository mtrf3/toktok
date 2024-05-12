package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveStatus;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.ALe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26074ALe {
    public static final C26074ALe LIZ = C26080ALk.LIZ;

    public static final void LIZIZ(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.setFlags(268435456);
            intent.putExtra("android.provider.extra.APP_PACKAGE", EF7.LIZIZ().getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", C78685UuP.LJJIII().getRealChannelId("live_push"));
            if (C26073ALd.LIZ == null) {
                C26073ALd.LIZ = EF7.LIZIZ().getPackageManager();
            }
            PackageManager packageManager = C26073ALd.LIZ;
            if (packageManager != null && packageManager.resolveActivity(intent, 65536) != null && context != null) {
                C16880lQ.LIZJ(context, intent);
            }
        }
    }

    public static final void LIZJ(boolean z) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("push_live_");
        LIZ2.append(C26073ALd.LIZJ());
        Keva repo = KevaImpl.getRepo(X1D.LIZIZ(LIZ2), 0);
        o.LJIIIIZZ(repo, "getRepo(PUSH_LIVE_ + get…ants.MODE_SINGLE_PROCESS)");
        repo.storeBoolean("key_mt_live_push_switch", z);
    }

    public static final void LIZLLL(C26076ALg c26076ALg) {
        if (C26073ALd.LIZIZ == null) {
            C73893SzJ<C26076ALg> c73893SzJ = new C73893SzJ<>();
            C26073ALd.LIZIZ = c73893SzJ;
            c73893SzJ.LJJLIIIJILLIZJL(400L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(C26075ALf.LJLIL);
        }
        C73893SzJ<C26076ALg> c73893SzJ2 = C26073ALd.LIZIZ;
        if (c73893SzJ2 != null) {
            c73893SzJ2.onNext(c26076ALg);
        }
    }

    public final void LIZ(String str) {
        NotificationLiveStatus notificationLiveStatus = new NotificationLiveStatus(new NotificationLiveStatus.DataBean(2), 0, 2, null);
        AYW.LJLILLLLZI.getClass();
        AYW.LJLJJI.put(str, notificationLiveStatus);
    }
}
