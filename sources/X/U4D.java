package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* loaded from: classes14.dex */
public final class U4D {
    public static boolean LIZ() {
        if (C29306Beo.LJIIJJI(DataChannelGlobal.LJLJJI)) {
            return LiveAbLabelSetting.INSTANCE.getBooleanValue("live_effect_selector_white_setting");
        }
        return C29306Beo.LJJIFFI(U4C.LIZ("live_effect_selector_white_setting"));
    }
}
