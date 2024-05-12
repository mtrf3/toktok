package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;

/* renamed from: X.XnP, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85895XnP extends C8BR<C8BS<PushSettings>, InterfaceC85901XnV> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        PushSettings pushSettings;
        T t = this.LJLIL;
        if (t == 0 || (pushSettings = (PushSettings) t.getData()) == null || this.LJLILLLLZI == 0) {
            return;
        }
        C38776FJs.LJIIL().LJIIJJI(EF7.LIZIZ(), "last_user_setting_version", pushSettings.settingsVersion);
        ((InterfaceC85901XnV) this.LJLILLLLZI).A1(pushSettings);
    }

    public C85895XnP() {
        LJJ(new C85899XnT());
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC85901XnV) k).onFailed(exc);
        }
    }
}
