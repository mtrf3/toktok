package com.ss.android.ugc.aweme.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SetTrailerRequest extends F9E {

    @InterfaceC65349Pkn("collection_id")
    public final String collectionId;

    @InterfaceC65349Pkn("video_id")
    public final String videoId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.collectionId, this.videoId};
    }

    public SetTrailerRequest(String collectionId, String videoId) {
        o.LJIIIZ(collectionId, "collectionId");
        o.LJIIIZ(videoId, "videoId");
        this.collectionId = collectionId;
        this.videoId = videoId;
    }
}
