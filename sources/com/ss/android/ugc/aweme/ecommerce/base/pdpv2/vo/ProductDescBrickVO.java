package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.AbstractC27664AtQ;
import X.C27649AtB;
import X.C27656AtI;
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
public class ProductDescBrickVO extends AbstractC27664AtQ<ProductDescBizData, ProductDescBizExtra> implements Parcelable {
    public final BrickInfo brickInfo;
    public final CommonData commonData;
    public boolean needShowViewMore;
    public int style;
    public static final C27656AtI Companion = new C27656AtI();
    public static final Parcelable.Creator<ProductDescBrickVO> CREATOR = new C27649AtB();

    @Override // X.AbstractC27664AtQ
    public final /* bridge */ /* synthetic */ Object LJIIJJI(String str) {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
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
    public int hashCode() {
        return super.hashCode();
    }

    @Override // X.AbstractC27664AtQ
    public BrickInfo LJ() {
        return this.brickInfo;
    }

    @Override // X.AbstractC27664AtQ
    public CommonData LJIIIIZZ() {
        return this.commonData;
    }

    public int LJIIL() {
        return this.style;
    }

    @Override // X.AbstractC27664AtQ
    public final Object LJIIJ(String str) {
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(ProductDescBizData.class)));
            if (!(fromJson instanceof ProductDescBizData)) {
                fromJson = null;
            }
            return fromJson;
        } catch (s unused) {
            return null;
        }
    }

    public final void LJIILIIL(int i) {
        this.style = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c4 A[EDGE_INSN: B:98:0x01c4->B:95:0x01c4 BREAK  A[LOOP:1: B:76:0x019a->B:97:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f1  */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescBrickVO> LJIILJJIL(com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpBodyViewModel r17) {
        /*
            Method dump skipped, instructions count: 1348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescBrickVO.LJIILJJIL(com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpBodyViewModel):java.util.List");
    }

    @Override // X.AbstractC27664AtQ
    public boolean equals(Object obj) {
        ProductDescBrickVO productDescBrickVO;
        if (!(obj instanceof ProductDescBrickVO) || (productDescBrickVO = (ProductDescBrickVO) obj) == null) {
            return super.equals(obj);
        }
        if (super.equals(obj) && productDescBrickVO.needShowViewMore == this.needShowViewMore && LJIIL() == productDescBrickVO.LJIIL()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDescBrickVO(BrickInfo brickInfo, CommonData commonData) {
        super(brickInfo, commonData);
        o.LJIIIZ(brickInfo, "brickInfo");
        this.brickInfo = brickInfo;
        this.commonData = commonData;
        this.style = -1;
    }
}
