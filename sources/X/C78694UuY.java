package X;

import com.ss.android.ugc.aweme.im.INotificationManagerService;
import com.ss.android.ugc.aweme.im.sdk.notification.NotificationManagerServiceImpl;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.UuY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78694UuY implements EUJ {
    public static final C5H3<C78694UuY> LJLIL = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C78695UuZ.LJLIL);

    @Override // X.EUJ
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
    }

    public static INotificationManagerService LIZ() {
        INotificationManagerService LJIIIZ = NotificationManagerServiceImpl.LJIIIZ();
        o.LJIIIIZZ(LJIIIZ, "getImNotificationProxy()");
        return LJIIIZ;
    }

    @Override // X.EUJ
    public final void A1(PushSettings settings) {
        o.LJIIIZ(settings, "settings");
        LIZ().LIZIZ(settings);
    }
}
