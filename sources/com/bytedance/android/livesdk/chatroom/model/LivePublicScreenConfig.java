package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes6.dex */
public class LivePublicScreenConfig {

    @InterfaceC65349Pkn("anim_style")
    public int animStyle;

    @InterfaceC65349Pkn("fold_message_scroll_type")
    public int foldMessageScrollType;

    @InterfaceC65349Pkn("consume_count_per_loop")
    public int consumeCountPerLoop = 100;

    @InterfaceC65349Pkn("consume_interval")
    public int consumeInterval = 1000;

    @InterfaceC65349Pkn("first_loop_consume_delay")
    public int firstLoopConsumeDelay = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

    @InterfaceC65349Pkn("ms_per_inch")
    public int msPerInch = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;

    @InterfaceC65349Pkn("others_buffer_size")
    public int othersBufferSize = 100;

    @InterfaceC65349Pkn("max_message_in_recyclerview")
    public int maxMessageInRecyclerview = 200;

    public final int LIZ() {
        int i = this.consumeCountPerLoop;
        if (i <= 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public final boolean LIZIZ() {
        if (this.animStyle == 1) {
            return true;
        }
        return false;
    }
}
