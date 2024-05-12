package com.bytedance.android.livesdk.livesetting.level;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftPanelAnimatorConfig {

    @InterfaceC65349Pkn("channel")
    public String channel;

    @InterfaceC65349Pkn("grade")
    public int grade;

    @InterfaceC65349Pkn("light_name")
    public String lightName;

    /* JADX WARN: Multi-variable type inference failed */
    public GiftPanelAnimatorConfig() {
        this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public GiftPanelAnimatorConfig(int i, String lightName, String channel) {
        o.LJIIIZ(lightName, "lightName");
        o.LJIIIZ(channel, "channel");
        this.grade = i;
        this.lightName = lightName;
        this.channel = channel;
    }

    public /* synthetic */ GiftPanelAnimatorConfig(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
