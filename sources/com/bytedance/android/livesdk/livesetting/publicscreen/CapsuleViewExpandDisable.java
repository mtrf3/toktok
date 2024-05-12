package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C29567Bj1;
import X.C5H3;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_capsule_view_expand_disable")
/* loaded from: classes6.dex */
public final class CapsuleViewExpandDisable {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final CapsuleViewExpandDisable INSTANCE = new CapsuleViewExpandDisable();
    public static final C5H3 value$delegate = C78996UzQ.LJJIJIIJI(C29567Bj1.LJLIL);

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public final boolean disable() {
        return getValue();
    }
}
