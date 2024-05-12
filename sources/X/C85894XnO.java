package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.NotificationSettings;

/* renamed from: X.XnO, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85894XnO extends C8BR<C8BS<NotificationSettings>, InterfaceC85902XnW> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        NotificationSettings notificationSettings;
        T t = this.LJLIL;
        if (t != 0 && (notificationSettings = (NotificationSettings) t.getData()) != null) {
            ((InterfaceC85902XnW) this.LJLILLLLZI).cL(notificationSettings);
        }
    }

    public C85894XnO() {
        LJJ(new C85893XnN());
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        InterfaceC85902XnW interfaceC85902XnW = (InterfaceC85902XnW) this.LJLILLLLZI;
        if (interfaceC85902XnW != null) {
            interfaceC85902XnW.onFailed(exc);
        }
    }
}
