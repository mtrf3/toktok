package com.ss.android.ugc.aweme.now;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class NowIntroductionVideoReplica {

    @InterfaceC65349Pkn("codec_type")
    public final Integer codecType;

    @InterfaceC65349Pkn("file_id")
    public final String fileId;

    @InterfaceC65349Pkn("size")
    public final Long size;

    @InterfaceC65349Pkn("url")
    public final List<String> urls;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowIntroductionVideoReplica)) {
            return false;
        }
        NowIntroductionVideoReplica nowIntroductionVideoReplica = (NowIntroductionVideoReplica) obj;
        return o.LJ(this.urls, nowIntroductionVideoReplica.urls) && o.LJ(this.codecType, nowIntroductionVideoReplica.codecType) && o.LJ(this.fileId, nowIntroductionVideoReplica.fileId) && o.LJ(this.size, nowIntroductionVideoReplica.size);
    }

    public final int hashCode() {
        List<String> list = this.urls;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.codecType;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.fileId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.size;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowIntroductionVideoReplica(urls=");
        LIZ.append(this.urls);
        LIZ.append(", codecType=");
        LIZ.append(this.codecType);
        LIZ.append(", fileId=");
        LIZ.append(this.fileId);
        LIZ.append(", size=");
        return JBR.LJ(LIZ, this.size, ')', LIZ);
    }

    public NowIntroductionVideoReplica(List<String> list, Integer num, String str, Long l) {
        this.urls = list;
        this.codecType = num;
        this.fileId = str;
        this.size = l;
    }

    public /* synthetic */ NowIntroductionVideoReplica(List list, Integer num, String str, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : l);
    }
}
