package com.ss.android.ugc.awemepushlib.experiments;

import X.FFL;

/* loaded from: classes10.dex */
public final class PushPermissionPopupGuideExp {
    public static final boolean DEFAULT = false;
    public static final PushPermissionPopupGuideExp INSTANCE = new PushPermissionPopupGuideExp();
    public static final boolean V1 = true;

    public final boolean withGuideAndMask() {
        FFL.LJIIIZ().getClass();
        return FFL.LJFF(1, "push_permission_popup_with_guide_mask", false, false);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getV1() {
        return V1;
    }
}
