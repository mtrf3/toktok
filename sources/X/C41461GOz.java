package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;

/* renamed from: X.GOz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41461GOz {
    public static final TcmConfig LIZ() {
        TcmConfig tcmConfig = null;
        try {
            tcmConfig = (TcmConfig) SettingsManager.LIZLLL().LJIIIIZZ("tcm_config", TcmConfig.class, null);
            return tcmConfig;
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            return tcmConfig;
        }
    }
}
