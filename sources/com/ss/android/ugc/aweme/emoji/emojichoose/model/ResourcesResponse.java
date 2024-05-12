package com.ss.android.ugc.aweme.emoji.emojichoose.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* loaded from: classes2.dex */
public final class ResourcesResponse extends BaseResponse {

    @InterfaceC65349Pkn("navi_stickers_status")
    public final NaviStatusCode naviStickerStatus;

    @InterfaceC65349Pkn("navi_stickers")
    public final List<Resources> naviStickers;

    @InterfaceC65349Pkn("resources")
    public final List<Resources> resources;

    public final NaviStatusCode getNaviStickerStatus() {
        return this.naviStickerStatus;
    }

    public final List<Resources> getNaviStickers() {
        return this.naviStickers;
    }

    public final List<Resources> getResources() {
        return this.resources;
    }
}
