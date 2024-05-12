package com.bytedance.android.livesdk.livesetting.slot;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class GeckoContent {

    @InterfaceC65349Pkn("gecko_channel")
    public String geckoChannel;

    @InterfaceC65349Pkn("msg_type")
    public int msgType;

    @InterfaceC65349Pkn("ribbon_file_name")
    public String ribbonFileName;

    @InterfaceC65349Pkn("animation_video_file_name")
    public String videoFileName;

    /* JADX WARN: Multi-variable type inference failed */
    public GeckoContent() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public GeckoContent(int i, String str, String str2, String str3) {
        this.msgType = i;
        this.ribbonFileName = str;
        this.videoFileName = str2;
        this.geckoChannel = str3;
    }

    public /* synthetic */ GeckoContent(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
    }
}
