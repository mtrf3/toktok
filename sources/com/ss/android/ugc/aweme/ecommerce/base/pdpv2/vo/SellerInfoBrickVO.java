package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.AbstractC27664AtQ;
import X.C27739Aud;
import X.C65330PkU;
import X.C65352Pkq;
import X.RXM;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SellerInfoBrickVO extends AbstractC27664AtQ<SellerInfoBizData, SellerInfoBizExtra> implements Parcelable {
    public static final Parcelable.Creator<SellerInfoBrickVO> CREATOR = new RXM();
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
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(SellerInfoBizData.class)));
            if (!(fromJson instanceof SellerInfoBizData)) {
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
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(SellerInfoBizExtra.class)));
            if (!(fromJson instanceof SellerInfoBizExtra)) {
                fromJson = null;
            }
            return fromJson;
        } catch (s unused) {
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerInfoBrickVO(BrickInfo brickInfo, CommonData commonData) {
        super(brickInfo, commonData);
        o.LJIIIZ(brickInfo, "brickInfo");
        this.brickInfo = brickInfo;
        this.commonData = commonData;
    }
}
