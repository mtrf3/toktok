package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPAppendix;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticAddressInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModuleMeta;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Al5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27147Al5 implements Parcelable.Creator<PDPShippingModule> {
    @Override // android.os.Parcelable.Creator
    public final PDPShippingModule createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        LinkRichText createFromParcel2;
        Icon createFromParcel3;
        LogisticPromotion createFromParcel4;
        ArrayList arrayList;
        Icon createFromParcel5;
        Icon createFromParcel6;
        PDPLogisticAddressInfo createFromParcel7;
        ArrayList arrayList2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        PDPShippingModuleMeta pDPShippingModuleMeta = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = LinkRichText.CREATOR.createFromParcel(parcel);
        }
        LinkRichText linkRichText = createFromParcel2;
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon2 = createFromParcel3;
        if (parcel.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = LogisticPromotion.CREATOR.createFromParcel(parcel);
        }
        LogisticPromotion logisticPromotion = createFromParcel4;
        int i = 0;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = C279117r.LIZIZ(LinkRichText.CREATOR, parcel, arrayList, i2, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel5 = null;
        } else {
            createFromParcel5 = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon3 = createFromParcel5;
        if (parcel.readInt() == 0) {
            createFromParcel6 = null;
        } else {
            createFromParcel6 = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon4 = createFromParcel6;
        if (parcel.readInt() == 0) {
            createFromParcel7 = null;
        } else {
            createFromParcel7 = PDPLogisticAddressInfo.CREATOR.createFromParcel(parcel);
        }
        PDPLogisticAddressInfo pDPLogisticAddressInfo = createFromParcel7;
        if (parcel.readInt() == 0) {
            arrayList2 = null;
        } else {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = C279117r.LIZIZ(PDPAppendix.CREATOR, parcel, arrayList2, i, 1);
            }
        }
        if (parcel.readInt() != 0) {
            pDPShippingModuleMeta = PDPShippingModuleMeta.CREATOR.createFromParcel(parcel);
        }
        return new PDPShippingModule(readString, icon, linkRichText, icon2, logisticPromotion, arrayList, icon3, icon4, pDPLogisticAddressInfo, arrayList2, pDPShippingModuleMeta);
    }

    @Override // android.os.Parcelable.Creator
    public final PDPShippingModule[] newArray(int i) {
        return new PDPShippingModule[i];
    }
}
