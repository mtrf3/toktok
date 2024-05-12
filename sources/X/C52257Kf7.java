package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.concurrent.CancellationException;

/* renamed from: X.Kf7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52257Kf7 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C52257Kf7 LJLIL = new C52257Kf7();

    public C52257Kf7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        try {
            SettingsManager.LIZLLL().getClass();
            num = Integer.valueOf(SettingsManager.LJ("remind_banned_permission_enable", 1));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            num = null;
        }
        return Integer.valueOf(num != null ? num.intValue() : 1);
    }
}
