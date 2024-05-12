package com.ss.android.ugc.aweme.autocut.sdk.data;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class RequestMusicMeta {

    @InterfaceC65349Pkn("duration")
    public final Long duration;

    @InterfaceC65349Pkn("is_video")
    public final Boolean isVideo;

    /* JADX WARN: Multi-variable type inference failed */
    public RequestMusicMeta() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public RequestMusicMeta(Boolean bool, Long l) {
        this.isVideo = bool;
        this.duration = l;
    }

    public /* synthetic */ RequestMusicMeta(Boolean bool, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? 0L : l);
    }
}
