package com.ss.android.ugc.aweme.property;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class VESettingConfigs extends F9E {

    @InterfaceC65349Pkn("high_quality_ve_synthesis_settings_key")
    public final String highQualityVeSynthesisSettingsKey;

    @InterfaceC65349Pkn("ve_synthesis_settings_key")
    public final String veSynthesisSettingsKey;

    /* JADX WARN: Multi-variable type inference failed */
    public VESettingConfigs() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.veSynthesisSettingsKey, this.highQualityVeSynthesisSettingsKey};
    }

    public VESettingConfigs(String veSynthesisSettingsKey, String highQualityVeSynthesisSettingsKey) {
        o.LJIIIZ(veSynthesisSettingsKey, "veSynthesisSettingsKey");
        o.LJIIIZ(highQualityVeSynthesisSettingsKey, "highQualityVeSynthesisSettingsKey");
        this.veSynthesisSettingsKey = veSynthesisSettingsKey;
        this.highQualityVeSynthesisSettingsKey = highQualityVeSynthesisSettingsKey;
    }

    public /* synthetic */ VESettingConfigs(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
