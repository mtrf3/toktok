package com.ss.android.ugc.aweme.setting.performance;

import X.C125424w6;
import X.C221108m2;
import X.C5H3;

/* loaded from: classes3.dex */
public final class OpenUseVEUserConfigForImageOptimize {
    public static final boolean OPTION_FALSE = true;
    public static final boolean OPTION_TRUE = false;
    public static final OpenUseVEUserConfigForImageOptimize INSTANCE = new OpenUseVEUserConfigForImageOptimize();
    public static final C5H3 _enable$delegate = C221108m2.LIZIZ(C125424w6.LJLIL);

    private final boolean get_enable() {
        return ((Boolean) _enable$delegate.getValue()).booleanValue();
    }

    public static final boolean isOpen() {
        return INSTANCE.get_enable();
    }
}
