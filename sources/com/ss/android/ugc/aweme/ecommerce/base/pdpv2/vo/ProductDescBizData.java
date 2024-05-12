package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.C27645At7;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AdditionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductDescBizData implements Parcelable {
    public static final Parcelable.Creator<ProductDescBizData> CREATOR = new C27645At7();

    @InterfaceC65349Pkn("additional_info")
    public final List<AdditionInfo> additionalInfo;

    @InterfaceC65349Pkn("desc_detail")
    public final String desc;

    @InterfaceC65349Pkn("desc_video")
    public final Video descVideo;

    @InterfaceC65349Pkn("size_guide")
    public final Image sizeGuide;

    @InterfaceC65349Pkn("specifications")
    public final List<Specification> specifications;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDescBizData)) {
            return false;
        }
        ProductDescBizData productDescBizData = (ProductDescBizData) obj;
        return o.LJ(this.descVideo, productDescBizData.descVideo) && o.LJ(this.desc, productDescBizData.desc) && o.LJ(this.specifications, productDescBizData.specifications) && o.LJ(this.additionalInfo, productDescBizData.additionalInfo) && o.LJ(this.sizeGuide, productDescBizData.sizeGuide);
    }

    public final int hashCode() {
        Video video = this.descVideo;
        int hashCode = (video == null ? 0 : video.hashCode()) * 31;
        String str = this.desc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Specification> list = this.specifications;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<AdditionInfo> list2 = this.additionalInfo;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Image image = this.sizeGuide;
        return hashCode4 + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductDescBizData(descVideo=");
        LIZ.append(this.descVideo);
        LIZ.append(", desc=");
        LIZ.append(this.desc);
        LIZ.append(", specifications=");
        LIZ.append(this.specifications);
        LIZ.append(", additionalInfo=");
        LIZ.append(this.additionalInfo);
        LIZ.append(", sizeGuide=");
        LIZ.append(this.sizeGuide);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Video video = this.descVideo;
        if (video == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            video.writeToParcel(out, i);
        }
        out.writeString(this.desc);
        List<Specification> list = this.specifications;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((Specification) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        List<AdditionInfo> list2 = this.additionalInfo;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                ((AdditionInfo) LIZIZ2.next()).writeToParcel(out, i);
            }
        }
        out.writeParcelable(this.sizeGuide, i);
    }

    public ProductDescBizData(Video video, String str, List<Specification> list, List<AdditionInfo> list2, Image image) {
        this.descVideo = video;
        this.desc = str;
        this.specifications = list;
        this.additionalInfo = list2;
        this.sizeGuide = image;
    }
}
