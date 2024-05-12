package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C221108m2;
import X.C5H3;
import X.CEE;
import X.InterfaceC65349Pkn;
import X.WM7;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_message_list_capsule_block_list")
/* loaded from: classes6.dex */
public final class LiveCapsuleFallBackSetting {
    public static final LiveCapsuleFallBackSetting INSTANCE = new LiveCapsuleFallBackSetting();

    @Group(isDefault = true, value = "default group")
    public static final CapsuleTypeScene[] DEFAULT = new CapsuleTypeScene[0];
    public static final C5H3 value$delegate = C221108m2.LIZIZ(CEE.LJLIL);

    /* loaded from: classes6.dex */
    public static final class CapsuleTypeScene {

        @InterfaceC65349Pkn("type")
        public int type = -1;

        @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
        public String scene = "";
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final CapsuleTypeScene[] getValue() {
        return (CapsuleTypeScene[]) value$delegate.getValue();
    }
}
