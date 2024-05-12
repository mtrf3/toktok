package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AdditionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DescDetailV2;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DescRawData {

    @InterfaceC65349Pkn("additional_info")
    public final List<AdditionInfo> additionInfo;

    @InterfaceC65349Pkn("desc_detail_v_2")
    public final DescDetailV2 descDetailv2;

    @InterfaceC65349Pkn("desc_detail")
    public final String details;

    @InterfaceC65349Pkn("desc_video")
    public final Video video;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescRawData)) {
            return false;
        }
        DescRawData descRawData = (DescRawData) obj;
        return o.LJ(this.details, descRawData.details) && o.LJ(this.video, descRawData.video) && o.LJ(this.additionInfo, descRawData.additionInfo) && o.LJ(this.descDetailv2, descRawData.descDetailv2);
    }

    public final int hashCode() {
        String str = this.details;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Video video = this.video;
        int hashCode2 = (hashCode + (video == null ? 0 : video.hashCode())) * 31;
        List<AdditionInfo> list = this.additionInfo;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        DescDetailV2 descDetailV2 = this.descDetailv2;
        return hashCode3 + (descDetailV2 != null ? descDetailV2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DescRawData(details=");
        LIZ.append(this.details);
        LIZ.append(", video=");
        LIZ.append(this.video);
        LIZ.append(", additionInfo=");
        LIZ.append(this.additionInfo);
        LIZ.append(", descDetailv2=");
        LIZ.append(this.descDetailv2);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public DescRawData(String str, Video video, List<AdditionInfo> list, DescDetailV2 descDetailV2) {
        this.details = str;
        this.video = video;
        this.additionInfo = list;
        this.descDetailv2 = descDetailV2;
    }

    public /* synthetic */ DescRawData(String str, Video video, List list, DescDetailV2 descDetailV2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : video, list, (i & 8) != 0 ? null : descDetailV2);
    }
}
