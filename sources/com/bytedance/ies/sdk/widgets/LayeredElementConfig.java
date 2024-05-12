package com.bytedance.ies.sdk.widgets;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class LayeredElementConfig {

    @InterfaceC65349Pkn("animation_duration")
    public long animationDuration = 300;

    @InterfaceC65349Pkn("guideline_indicator_enabled")
    public boolean guidelineIndicatorEnabled;

    public static LayeredElementConfig createDefault() {
        return new LayeredElementConfig();
    }

    public long getAnimationDuration() {
        return this.animationDuration;
    }

    public boolean isGuidelineIndicatorEnabled() {
        return this.guidelineIndicatorEnabled;
    }
}
