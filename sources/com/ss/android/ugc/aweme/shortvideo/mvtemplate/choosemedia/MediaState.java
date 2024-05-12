package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC61312at;
import X.X1D;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MediaState implements InterfaceC61312at {
    public final MyMediaModel media;
    public final long value;

    public static /* synthetic */ MediaState copy$default(MediaState mediaState, MyMediaModel myMediaModel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            myMediaModel = mediaState.media;
        }
        if ((i & 2) != 0) {
            j = mediaState.value;
        }
        return mediaState.copy(myMediaModel, j);
    }

    public final MediaState copy(MyMediaModel myMediaModel, long j) {
        return new MediaState(myMediaModel, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaState)) {
            return false;
        }
        MediaState mediaState = (MediaState) obj;
        return o.LJ(this.media, mediaState.media) && this.value == mediaState.value;
    }

    public int hashCode() {
        MyMediaModel myMediaModel = this.media;
        return C16880lQ.LLJIJIL(this.value) + ((myMediaModel == null ? 0 : myMediaModel.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaState(media=");
        LIZ.append(this.media);
        LIZ.append(", value=");
        return C47135Ieh.LIZIZ(LIZ, this.value, ')', LIZ);
    }

    public final MyMediaModel getMedia() {
        return this.media;
    }

    public final long getValue() {
        return this.value;
    }

    public MediaState(MyMediaModel myMediaModel, long j) {
        this.media = myMediaModel;
        this.value = j;
    }

    public /* synthetic */ MediaState(MyMediaModel myMediaModel, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : myMediaModel, j);
    }
}
