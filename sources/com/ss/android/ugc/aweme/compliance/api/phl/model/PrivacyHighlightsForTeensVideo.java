package com.ss.android.ugc.aweme.compliance.api.phl.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PrivacyHighlightsForTeensVideo extends F9E {

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("video_info")
    public final Video videoInfo;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.id, this.title, this.videoInfo};
    }

    public PrivacyHighlightsForTeensVideo(String id, String title, Video videoInfo) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(videoInfo, "videoInfo");
        this.id = id;
        this.title = title;
        this.videoInfo = videoInfo;
    }

    public /* synthetic */ PrivacyHighlightsForTeensVideo(String str, String str2, Video video, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, video);
    }
}
