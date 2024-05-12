package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C5H3;
import X.C66;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_parse_sei_async")
/* loaded from: classes6.dex */
public final class LiveParseSeiAsyncSetting {
    public static final LiveParseSeiAsyncSetting INSTANCE = new LiveParseSeiAsyncSetting();

    @Group(isDefault = true, value = "default group")
    public static final SeiParseConfig DEFAULT = new SeiParseConfig(false, false, false, false, 15, null);
    public static final C5H3 currentValue$delegate = C221108m2.LIZIZ(C66.LJLIL);

    private final SeiParseConfig getCurrentValue() {
        return (SeiParseConfig) currentValue$delegate.getValue();
    }

    public final SeiParseConfig getValue() {
        return getCurrentValue();
    }
}
