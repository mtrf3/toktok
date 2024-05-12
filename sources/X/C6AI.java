package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.setting.CaptionConfig;
import defpackage.e1;

/* renamed from: X.6AI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6AI {
    public static final boolean LIZ() {
        if (e1.LIZ(31744, "studio_enable_auto_captions", true, false) && C1B8.LIZJ() && !C1DG.LJIIIIZZ() && SettingsManager.LIZLLL().LJIIIIZZ("tool_caption_config", CaptionConfig.class, null) != null) {
            return true;
        }
        return false;
    }
}
