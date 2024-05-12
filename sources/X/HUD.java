package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class HUD extends AbstractC65781Prl implements InterfaceC65784Pro<HashMap<String, String>> {
    public static final HUD LJLIL = new HUD();

    public HUD() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.HashMap<java.lang.String, java.lang.String>] */
    @Override // X.InterfaceC65784Pro
    public final HashMap<String, String> invoke() {
        return SettingsManager.LIZLLL().LJIIIIZZ("ecom_photo_search_guide_tip", HashMap.class, HUC.LIZ);
    }
}
