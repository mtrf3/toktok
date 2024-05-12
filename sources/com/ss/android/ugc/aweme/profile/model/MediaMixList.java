package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.MixStruct;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MediaMixList extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final long cursor;

    @InterfaceC65349Pkn("has_more")
    public final int hasMore;

    @InterfaceC65349Pkn("mix_infos")
    public final List<MixStruct> mixInfos;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaMixList copy$default(MediaMixList mediaMixList, List list, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = mediaMixList.mixInfos;
        }
        if ((i2 & 2) != 0) {
            j = mediaMixList.cursor;
        }
        if ((i2 & 4) != 0) {
            i = mediaMixList.hasMore;
        }
        return mediaMixList.copy(list, j, i);
    }

    public final MediaMixList copy(List<? extends MixStruct> list, long j, int i) {
        return new MediaMixList(list, j, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMixList)) {
            return false;
        }
        MediaMixList mediaMixList = (MediaMixList) obj;
        return o.LJ(this.mixInfos, mediaMixList.mixInfos) && this.cursor == mediaMixList.cursor && this.hasMore == mediaMixList.hasMore;
    }

    public int hashCode() {
        int hashCode;
        List<MixStruct> list = this.mixInfos;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return JBR.LIZJ(this.cursor, hashCode * 31, 31) + this.hasMore;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaMixList(mixInfos=");
        LIZ.append(this.mixInfos);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", hasMore=");
        return b0.LIZJ(LIZ, this.hasMore, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaMixList(List<? extends MixStruct> list, long j, int i) {
        this.mixInfos = list;
        this.cursor = j;
        this.hasMore = i;
    }
}
