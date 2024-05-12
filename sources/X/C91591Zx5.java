package X;

import android.app.NotificationChannel;
import android.os.Build;

/* renamed from: X.Zx5, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91591Zx5 extends AbstractC65781Prl implements InterfaceC65784Pro<AnonymousClass078> {
    public static final C91591Zx5 LJLIL = new C91591Zx5();

    public C91591Zx5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final AnonymousClass078 invoke() {
        AnonymousClass078 anonymousClass078 = new AnonymousClass078(EF7.LIZIZ());
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("MUSIC_PLAY_SERVICE", "Music Play Service", 4);
            notificationChannel.setDescription("MUSIC_PLAY_SERVICE");
            notificationChannel.setLockscreenVisibility(1);
            notificationChannel.setSound(null, null);
            notificationChannel.enableVibration(true);
            anonymousClass078.LIZIZ.createNotificationChannel(notificationChannel);
        }
        return anonymousClass078;
    }
}
