package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.property.SmartCompileModelV1;

/* renamed from: X.Heq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44596Heq {
    public static SmartCompileModelV1 LIZ() {
        if (!C19N.LJ("enable_smart_compile_effect", true)) {
            return null;
        }
        return (SmartCompileModelV1) SettingsManager.LIZLLL().LJIIIIZZ("smart_compile_model", SmartCompileModelV1.class, null);
    }
}
