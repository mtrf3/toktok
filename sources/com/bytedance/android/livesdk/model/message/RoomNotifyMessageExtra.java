package com.bytedance.android.livesdk.model.message;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* loaded from: classes6.dex */
public class RoomNotifyMessageExtra {

    @InterfaceC65349Pkn("background")
    public Background background;

    @InterfaceC65349Pkn("duration")
    public long duration;

    @InterfaceC65349Pkn("content_list")
    public NotifyHighlightInfo highlightInfo;

    @InterfaceC65349Pkn("highlighted")
    public List<Object> highlightedList;

    /* loaded from: classes6.dex */
    public static class Background extends ImageModel {
    }
}
