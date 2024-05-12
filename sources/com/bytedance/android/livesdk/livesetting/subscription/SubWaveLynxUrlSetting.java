package com.bytedance.android.livesdk.livesetting.subscription;

import X.C221108m2;
import X.C5H3;
import X.CD0;
import X.CD1;
import X.CD2;
import X.CD3;
import X.CD4;
import X.CD5;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@SettingsKey("live_subscription_wave_url")
/* loaded from: classes6.dex */
public final class SubWaveLynxUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final SubWaveLynxUrlSetting INSTANCE = new SubWaveLynxUrlSetting();
    public static final C5H3 urlMap$delegate = C221108m2.LIZIZ(CD0.LJLIL);
    public static final C5H3 waveIntroPopup$delegate = C221108m2.LIZIZ(CD3.LJLIL);
    public static final C5H3 waveSettingPage$delegate = C221108m2.LIZIZ(CD4.LJLIL);
    public static final C5H3 waveSettingPopup$delegate = C221108m2.LIZIZ(CD5.LJLIL);
    public static final C5H3 userWavePopup$delegate = C221108m2.LIZIZ(CD2.LJLIL);
    public static final C5H3 anchorWavePopup$delegate = C221108m2.LIZIZ(CD1.LJLIL);

    public final String getAnchorWavePopup() {
        Object value = anchorWavePopup$delegate.getValue();
        o.LJIIIIZZ(value, "<get-anchorWavePopup>(...)");
        return (String) value;
    }

    public final JSONObject getUrlMap() {
        return (JSONObject) urlMap$delegate.getValue();
    }

    public final String getUserWavePopup() {
        Object value = userWavePopup$delegate.getValue();
        o.LJIIIIZZ(value, "<get-userWavePopup>(...)");
        return (String) value;
    }

    public final String getWaveIntroPopup() {
        Object value = waveIntroPopup$delegate.getValue();
        o.LJIIIIZZ(value, "<get-waveIntroPopup>(...)");
        return (String) value;
    }

    public final String getWaveSettingPage() {
        Object value = waveSettingPage$delegate.getValue();
        o.LJIIIIZZ(value, "<get-waveSettingPage>(...)");
        return (String) value;
    }

    public final String getWaveSettingPopup() {
        Object value = waveSettingPopup$delegate.getValue();
        o.LJIIIIZZ(value, "<get-waveSettingPopup>(...)");
        return (String) value;
    }
}
