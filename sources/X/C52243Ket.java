package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.Ket, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52243Ket {
    public static boolean LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("enable_4k_import_benchmark", false)) {
                if (!((Boolean) C52244Keu.LIZ.getValue()).booleanValue()) {
                    return false;
                }
            }
            return true;
        } catch (C158056If unused) {
            return false;
        }
    }
}
