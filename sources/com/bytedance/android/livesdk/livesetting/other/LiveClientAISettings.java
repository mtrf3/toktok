package com.bytedance.android.livesdk.livesetting.other;

import X.C141335gf;
import X.C221108m2;
import X.C30998CEo;
import X.C3C5;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import org.json.JSONObject;

@SettingsKey("live_client_ai_settings")
/* loaded from: classes6.dex */
public final class LiveClientAISettings {

    @Group(isDefault = true, value = "default group")
    public static final LivePitayaSettingsParams DEFAULT;
    public static final LiveClientAISettings INSTANCE = new LiveClientAISettings();
    public static final C5H3 settingsValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C30998CEo.LJLIL);

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        DEFAULT = new LivePitayaSettingsParams(i, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, 0L, i, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    private final LivePitayaSettingsParams getSettingsValue() {
        return (LivePitayaSettingsParams) settingsValue$delegate.getValue();
    }

    public final JSONObject abParams() {
        Object LIZ;
        try {
            LIZ = new JSONObject(INSTANCE.getSettingsValue().abParams);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        JSONObject jSONObject = new JSONObject();
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = jSONObject;
        }
        return (JSONObject) LIZ;
    }

    public final LiveAIServices aiServices() {
        return getSettingsValue().aiServices;
    }

    public final boolean enable() {
        if (getSettingsValue().enable > 0) {
            return true;
        }
        return false;
    }

    public final LivePitayaTaskFrequentControlManager frequentControlSettings() {
        return getSettingsValue().fequentSettings;
    }

    public final LivePitayaTaskSettingsParams getTaskSettings() {
        return getSettingsValue().taskSettingsParams;
    }

    public final boolean initAfterAppStart() {
        if (getSettingsValue().initAfterAppStart > 0) {
            return true;
        }
        return false;
    }

    public final long requestAllPkgsDelay() {
        return getSettingsValue().requestAllPkgsDelay;
    }

    public final boolean requestAllPkgsOnce() {
        if (getSettingsValue().requestAllPkgsOnce > 0) {
            return true;
        }
        return false;
    }

    public final LivePitayaSettingsParams getDEFAULT() {
        return DEFAULT;
    }
}
