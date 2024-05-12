package com.bytedance.android.livesdk.livesetting.level;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BarrageGradeResConfig {

    @InterfaceC65349Pkn("anim_duration")
    public long animDuration;

    @InterfaceC65349Pkn("barrage_background")
    public String background;

    @InterfaceC65349Pkn("gecko_channel")
    public String barrageChannel;

    @InterfaceC65349Pkn("barrage_webp_animation")
    public String barrageWebp;

    @InterfaceC65349Pkn("barrage_beam")
    public String beam;

    @InterfaceC65349Pkn("effect_format")
    public String effectFormat;

    @InterfaceC65349Pkn("grade")
    public int level;

    @InterfaceC65349Pkn("barrage_ribbon")
    public String ribbon;

    /* JADX WARN: Multi-variable type inference failed */
    public BarrageGradeResConfig() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public BarrageGradeResConfig(int i, String background, String ribbon, String beam, String barrageWebp, long j, String effectFormat, String barrageChannel) {
        o.LJIIIZ(background, "background");
        o.LJIIIZ(ribbon, "ribbon");
        o.LJIIIZ(beam, "beam");
        o.LJIIIZ(barrageWebp, "barrageWebp");
        o.LJIIIZ(effectFormat, "effectFormat");
        o.LJIIIZ(barrageChannel, "barrageChannel");
        this.level = i;
        this.background = background;
        this.ribbon = ribbon;
        this.beam = beam;
        this.barrageWebp = barrageWebp;
        this.animDuration = j;
        this.effectFormat = effectFormat;
        this.barrageChannel = barrageChannel;
    }

    public /* synthetic */ BarrageGradeResConfig(int i, String str, String str2, String str3, String str4, long j, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? 1000L : j, (i2 & 64) != 0 ? "" : str5, (i2 & 128) == 0 ? str6 : "");
    }
}
