package com.ss.android.ugc.aweme.model;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class EditVideoRequest {

    @InterfaceC65349Pkn("collection_id")
    public final String collectionId;

    @InterfaceC65349Pkn("video_cover_uri")
    public final String videoCoverUri;

    @InterfaceC65349Pkn("updated_id")
    public final String videoId;

    @InterfaceC65349Pkn("video_title")
    public final String videoTitle;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditVideoRequest)) {
            return false;
        }
        EditVideoRequest editVideoRequest = (EditVideoRequest) obj;
        return o.LJ(this.collectionId, editVideoRequest.collectionId) && o.LJ(this.videoId, editVideoRequest.videoId) && o.LJ(this.videoTitle, editVideoRequest.videoTitle) && o.LJ(this.videoCoverUri, editVideoRequest.videoCoverUri);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.collectionId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.videoId, hashCode * 31, 31);
        String str2 = this.videoTitle;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (LJ + hashCode2) * 31;
        String str3 = this.videoCoverUri;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditVideoRequest(collectionId=");
        LIZ.append(this.collectionId);
        LIZ.append(", videoId=");
        LIZ.append(this.videoId);
        LIZ.append(", videoTitle=");
        LIZ.append(this.videoTitle);
        LIZ.append(", videoCoverUri=");
        return q.LIZIZ(LIZ, this.videoCoverUri, ')', LIZ);
    }

    public EditVideoRequest(String str, String videoId, String str2, String str3) {
        o.LJIIIZ(videoId, "videoId");
        this.collectionId = str;
        this.videoId = videoId;
        this.videoTitle = str2;
        this.videoCoverUri = str3;
    }
}
