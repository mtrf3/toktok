package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.CapsuleViewExpandDisable;

/* renamed from: X.Bj1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29567Bj1 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C29567Bj1 LJLIL = new C29567Bj1();

    public C29567Bj1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(CapsuleViewExpandDisable.class));
    }
}
