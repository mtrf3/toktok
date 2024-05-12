package com.bytedance.android.livesdk.livesetting.game;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class MultiDeviceInterruptGuideData {

    @InterfaceC65349Pkn("enable")
    public Integer enable;

    @InterfaceC65349Pkn("guide_url")
    public String guideUrl;

    @InterfaceC65349Pkn("process_exit_guide")
    public List<ProcessExitGuideData> processExitGuideList;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiDeviceInterruptGuideData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public MultiDeviceInterruptGuideData(Integer num, String str, List<ProcessExitGuideData> list) {
        this.enable = num;
        this.guideUrl = str;
        this.processExitGuideList = list;
    }

    public /* synthetic */ MultiDeviceInterruptGuideData(Integer num, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}
