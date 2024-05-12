package com.bytedance.android.livesdk.livesetting.level;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BarrageEnterRoomResConfig {

    @InterfaceC65349Pkn("barrage_background")
    public String background;

    @InterfaceC65349Pkn("gecko_channel")
    public String barrageChannel;

    @InterfaceC65349Pkn("grade")
    public int level;

    /* JADX WARN: Multi-variable type inference failed */
    public BarrageEnterRoomResConfig() {
        this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public BarrageEnterRoomResConfig(int i, String background, String barrageChannel) {
        o.LJIIIZ(background, "background");
        o.LJIIIZ(barrageChannel, "barrageChannel");
        this.level = i;
        this.background = background;
        this.barrageChannel = barrageChannel;
    }

    public /* synthetic */ BarrageEnterRoomResConfig(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
