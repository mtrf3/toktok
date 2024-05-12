package com.ss.android.ugc.aweme.service.protection;

import X.C19N;

/* loaded from: classes10.dex */
public final class TooltipProtectionSetting {
    public static final boolean DEFAULT = false;
    public static final TooltipProtectionSetting INSTANCE = new TooltipProtectionSetting();

    public final boolean isKillSwitchDisabled() {
        return !C19N.LJ("disable_tooltip_protection", false);
    }
}
