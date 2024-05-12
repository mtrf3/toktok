package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VideoInfo extends F9E {
    public final UrlModel cover;

    @InterfaceC65349Pkn("link_info")
    public final LinkInfo linkInfo;

    public static /* synthetic */ VideoInfo copy$default(VideoInfo videoInfo, UrlModel urlModel, LinkInfo linkInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = videoInfo.cover;
        }
        if ((i & 2) != 0) {
            linkInfo = videoInfo.linkInfo;
        }
        return videoInfo.copy(urlModel, linkInfo);
    }

    public final VideoInfo copy(UrlModel cover, LinkInfo linkInfo) {
        o.LJIIIZ(cover, "cover");
        o.LJIIIZ(linkInfo, "linkInfo");
        return new VideoInfo(cover, linkInfo);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.cover, this.linkInfo};
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final LinkInfo getLinkInfo() {
        return this.linkInfo;
    }

    public VideoInfo(UrlModel cover, LinkInfo linkInfo) {
        o.LJIIIZ(cover, "cover");
        o.LJIIIZ(linkInfo, "linkInfo");
        this.cover = cover;
        this.linkInfo = linkInfo;
    }
}
