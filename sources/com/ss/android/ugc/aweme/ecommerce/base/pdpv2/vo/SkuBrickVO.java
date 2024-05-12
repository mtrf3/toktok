package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.AbstractC27664AtQ;
import X.C221108m2;
import X.C27739Aud;
import X.C5H3;
import X.C65330PkU;
import X.C65352Pkq;
import X.RXK;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuBrickVO extends AbstractC27664AtQ<SkuBizData, SkuBizExtra> implements Parcelable {
    public static final Parcelable.Creator<SkuBrickVO> CREATOR = new RXK();
    public final BrickInfo brickInfo;
    public final CommonData commonData;
    public final C5H3 images$delegate;
    public final C5H3 isSingleSku$delegate;
    public Image productFirstImage;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.brickInfo.writeToParcel(out, i);
        CommonData commonData = this.commonData;
        if (commonData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            commonData.writeToParcel(out, i);
        }
    }

    public final List<Image> LJIIL() {
        return (List) this.images$delegate.getValue();
    }

    public final boolean LJIILIIL() {
        return ((Boolean) this.isSingleSku$delegate.getValue()).booleanValue();
    }

    @Override // X.AbstractC27664AtQ
    public final boolean LJIIIZ() {
        SkuBizData LIZ;
        SkuBizData LIZ2 = LIZ();
        if (LIZ2 != null && LIZ2.skuItems != null && (LIZ = LIZ()) != null && LIZ.skuProps != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC27664AtQ
    public final BrickInfo LJ() {
        return this.brickInfo;
    }

    @Override // X.AbstractC27664AtQ
    public final CommonData LJIIIIZZ() {
        return this.commonData;
    }

    @Override // X.AbstractC27664AtQ
    public final Object LJIIJ(String str) {
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(SkuBizData.class)));
            if (!(fromJson instanceof SkuBizData)) {
                fromJson = null;
            }
            return fromJson;
        } catch (s unused) {
            return null;
        }
    }

    @Override // X.AbstractC27664AtQ
    public final Object LJIIJJI(String str) {
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(SkuBizExtra.class)));
            if (!(fromJson instanceof SkuBizExtra)) {
                fromJson = null;
            }
            return fromJson;
        } catch (s unused) {
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkuBrickVO(BrickInfo brickInfo, CommonData commonData) {
        super(brickInfo, commonData);
        o.LJIIIZ(brickInfo, "brickInfo");
        this.brickInfo = brickInfo;
        this.commonData = commonData;
        this.images$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 387));
        this.isSingleSku$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 388));
    }
}
