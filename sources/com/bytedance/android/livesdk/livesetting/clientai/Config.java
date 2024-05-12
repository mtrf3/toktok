package com.bytedance.android.livesdk.livesetting.clientai;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class Config {

    @InterfaceC65349Pkn("delay_download_pkgs")
    public int delayDownloadPkgs;

    @InterfaceC65349Pkn("enable")
    public int enable;

    @InterfaceC65349Pkn("im_msg_enable_list")
    public List<String> imMsgEnableList;

    public Config() {
        this(0, null, 0, 7, null);
    }

    public Config(int i, List<String> imMsgEnableList, int i2) {
        o.LJIIIZ(imMsgEnableList, "imMsgEnableList");
        this.enable = i;
        this.imMsgEnableList = imMsgEnableList;
        this.delayDownloadPkgs = i2;
    }

    public Config(int i, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? C61878OQg.INSTANCE : list, (i3 & 4) != 0 ? 30 : i2);
    }
}
