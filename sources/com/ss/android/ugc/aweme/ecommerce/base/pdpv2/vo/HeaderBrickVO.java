package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.AbstractC27664AtQ;
import X.C221108m2;
import X.C27739Aud;
import X.C5H3;
import X.C65330PkU;
import X.C65352Pkq;
import X.RXL;
import X.RXO;
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
public final class HeaderBrickVO extends AbstractC27664AtQ<HeaderBizData, HeaderBizExtra> implements Parcelable {
    public final BrickInfo brickInfo;
    public final CommonData commonData;
    public final C5H3 showImageList$delegate;
    public final C5H3 skuImageSize$delegate;
    public List<Image> skuImages;
    public final C5H3 videoSize$delegate;
    public static final RXO Companion = new RXO();
    public static final Parcelable.Creator<HeaderBrickVO> CREATOR = new RXL();

    @Override // X.AbstractC27664AtQ
    public final /* bridge */ /* synthetic */ Object LJIIJJI(String str) {
        return null;
    }

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
        return (List) this.showImageList$delegate.getValue();
    }

    public final int LJIILIIL() {
        return ((Number) this.skuImageSize$delegate.getValue()).intValue();
    }

    public final int LJIILJJIL() {
        return ((Number) this.videoSize$delegate.getValue()).intValue();
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
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(HeaderBizData.class)));
            if (!(fromJson instanceof HeaderBizData)) {
                fromJson = null;
            }
            return fromJson;
        } catch (s unused) {
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderBrickVO(BrickInfo brickInfo, CommonData commonData) {
        super(brickInfo, commonData);
        o.LJIIIZ(brickInfo, "brickInfo");
        this.brickInfo = brickInfo;
        this.commonData = commonData;
        this.skuImageSize$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 385));
        this.showImageList$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 384));
        this.videoSize$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 386));
    }
}
