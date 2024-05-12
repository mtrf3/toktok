package com.ss.android.ugc.aweme.property;

import X.C44654Hfm;
import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CanvasVEEncodeSettings extends F9E {

    @InterfaceC65349Pkn("high_quality_ve_synthesis_settings")
    public final String highQualityVeSynthesisSettings;

    @InterfaceC65349Pkn("ve_synthesis_settings")
    public final String veSynthesisSettings;

    /* JADX WARN: Multi-variable type inference failed */
    public CanvasVEEncodeSettings() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.veSynthesisSettings, this.highQualityVeSynthesisSettings};
    }

    public CanvasVEEncodeSettings(String veSynthesisSettings, String highQualityVeSynthesisSettings) {
        o.LJIIIZ(veSynthesisSettings, "veSynthesisSettings");
        o.LJIIIZ(highQualityVeSynthesisSettings, "highQualityVeSynthesisSettings");
        this.veSynthesisSettings = veSynthesisSettings;
        this.highQualityVeSynthesisSettings = highQualityVeSynthesisSettings;
    }

    public /* synthetic */ CanvasVEEncodeSettings(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C44654Hfm.LIZIZ(false) : str, (i & 2) != 0 ? C44654Hfm.LIZ() : str2);
    }
}
