package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.KfS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52278KfS extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C52278KfS LJLIL = new C52278KfS();

    public C52278KfS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String str = "";
        try {
            SettingsManager.LIZLLL().getClass();
            str = SettingsManager.LJI("sticker_slide_slip_gesture_stickers", "");
            return str;
        } catch (Throwable unused) {
            return str;
        }
    }
}
