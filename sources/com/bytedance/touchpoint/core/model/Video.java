package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class Video extends F9E {

    @InterfaceC65349Pkn("material_id")
    public final String materialId;

    @InterfaceC65349Pkn("multi_show_count")
    public final int multiShowCount;

    @InterfaceC65349Pkn("popup_view")
    public PopupView popupView;

    @InterfaceC65349Pkn("refresh_count")
    public int refreshCount;

    @InterfaceC65349Pkn("show_popup_after_video_time")
    public int showAfterVideoTime;

    @InterfaceC65349Pkn("video_cover")
    public String videoCover;

    @InterfaceC65349Pkn("video_url")
    public String videoUrl;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.materialId, Integer.valueOf(this.multiShowCount), this.videoUrl, this.videoCover, Integer.valueOf(this.showAfterVideoTime), Integer.valueOf(this.refreshCount), this.popupView};
    }

    public Video(String str, int i, String str2, String str3, int i2, int i3, PopupView popupView) {
        HH1.LIZ(str, "materialId", str2, "videoUrl", str3, "videoCover");
        this.materialId = str;
        this.multiShowCount = i;
        this.videoUrl = str2;
        this.videoCover = str3;
        this.showAfterVideoTime = i2;
        this.refreshCount = i3;
        this.popupView = popupView;
    }

    public /* synthetic */ Video(String str, int i, String str2, String str3, int i2, int i3, PopupView popupView, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, i, (i4 & 4) != 0 ? "" : str2, (i4 & 8) == 0 ? str3 : "", (i4 & 16) != 0 ? 0 : i2, i3, popupView);
    }
}
