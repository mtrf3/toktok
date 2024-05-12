package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.AbstractC27664AtQ;
import X.C27719AuJ;
import X.C27739Aud;
import X.C65330PkU;
import X.C65352Pkq;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductInfoBrickVO extends AbstractC27664AtQ<ProductInfoBizData, ProductInfoBizExtra> implements Parcelable {
    public static final Parcelable.Creator<ProductInfoBrickVO> CREATOR = new C27719AuJ();
    public final BrickInfo brickInfo;
    public final CommonData commonData;

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
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(ProductInfoBizData.class)));
            if (!(fromJson instanceof ProductInfoBizData)) {
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
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(ProductInfoBizExtra.class)));
            if (!(fromJson instanceof ProductInfoBizExtra)) {
                fromJson = null;
            }
            return fromJson;
        } catch (s unused) {
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductInfoBrickVO(BrickInfo brickInfo, CommonData commonData) {
        super(brickInfo, commonData);
        o.LJIIIZ(brickInfo, "brickInfo");
        this.brickInfo = brickInfo;
        this.commonData = commonData;
    }
}
