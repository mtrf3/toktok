package X;

import com.ss.android.ugc.aweme.live.notification.NotificationLiveStatus;
import kotlin.jvm.internal.o;

/* renamed from: X.ALu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26090ALu extends AbstractC65781Prl implements InterfaceC88473Ynt<String, NotificationLiveStatus, NotificationLiveStatus, NotificationLiveStatus> {
    public static final C26090ALu LJLIL = new C26090ALu();

    public C26090ALu() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final NotificationLiveStatus invoke(String newK, NotificationLiveStatus notificationLiveStatus, NotificationLiveStatus notificationLiveStatus2) {
        o.LJIIIZ(newK, "newK");
        AYW.LJLJJI.put(newK, notificationLiveStatus2);
        return notificationLiveStatus;
    }
}
