package com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TtDmNudgeConfigModel extends F9E {

    @InterfaceC65349Pkn("frenquency")
    public final long frequency;

    @InterfaceC65349Pkn("nudge_sticker")
    public final TTDmNudgeConfigNudgeSticker nudge_sticker;

    /* JADX WARN: Multi-variable type inference failed */
    public TtDmNudgeConfigModel() {
        this(0L, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.frequency), this.nudge_sticker};
    }

    public TtDmNudgeConfigModel(long j, TTDmNudgeConfigNudgeSticker nudge_sticker) {
        o.LJIIIZ(nudge_sticker, "nudge_sticker");
        this.frequency = j;
        this.nudge_sticker = nudge_sticker;
    }

    public /* synthetic */ TtDmNudgeConfigModel(long j, TTDmNudgeConfigNudgeSticker tTDmNudgeConfigNudgeSticker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 60L : j, (i & 2) != 0 ? new TTDmNudgeConfigNudgeSticker(null, null, null, null, 0, 0, 0L, 0L, null, null, 1023, null) : tTDmNudgeConfigNudgeSticker);
    }
}
