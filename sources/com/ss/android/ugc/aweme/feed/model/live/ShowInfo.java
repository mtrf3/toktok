package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ShowInfo {

    @InterfaceC65349Pkn("anchors")
    public List<? extends LiveUser> anchors;

    @InterfaceC65349Pkn("show_end_time")
    public long showEndTime;

    @InterfaceC65349Pkn("show_introduction")
    public String showIntroduction = "";

    @InterfaceC65349Pkn("show_start_time")
    public long showStartTime;

    public final void setShowIntroduction(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.showIntroduction = str;
    }
}
