package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.InterfaceC61312at;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import defpackage.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MediaListState implements InterfaceC61312at {
    public final ArrayList<MyMediaModel> mediaList;
    public final String photoSearchType;
    public final long value;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaListState copy$default(MediaListState mediaListState, ArrayList arrayList, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = mediaListState.mediaList;
        }
        if ((i & 2) != 0) {
            j = mediaListState.value;
        }
        if ((i & 4) != 0) {
            str = mediaListState.photoSearchType;
        }
        return mediaListState.copy(arrayList, j, str);
    }

    public final MediaListState copy(ArrayList<MyMediaModel> mediaList, long j, String str) {
        o.LJIIIZ(mediaList, "mediaList");
        return new MediaListState(mediaList, j, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaListState)) {
            return false;
        }
        MediaListState mediaListState = (MediaListState) obj;
        return o.LJ(this.mediaList, mediaListState.mediaList) && this.value == mediaListState.value && o.LJ(this.photoSearchType, mediaListState.photoSearchType);
    }

    public int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.value, this.mediaList.hashCode() * 31, 31);
        String str = this.photoSearchType;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LIZJ + hashCode;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaListState(mediaList=");
        LIZ.append(this.mediaList);
        LIZ.append(", value=");
        LIZ.append(this.value);
        LIZ.append(", photoSearchType=");
        return q.LIZIZ(LIZ, this.photoSearchType, ')', LIZ);
    }

    public final ArrayList<MyMediaModel> getMediaList() {
        return this.mediaList;
    }

    public final String getPhotoSearchType() {
        return this.photoSearchType;
    }

    public final long getValue() {
        return this.value;
    }

    public MediaListState(ArrayList<MyMediaModel> mediaList, long j, String str) {
        o.LJIIIZ(mediaList, "mediaList");
        this.mediaList = mediaList;
        this.value = j;
        this.photoSearchType = str;
    }

    public /* synthetic */ MediaListState(ArrayList arrayList, long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, j, (i & 4) != 0 ? null : str);
    }
}
