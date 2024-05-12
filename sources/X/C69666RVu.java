package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CombinedSalesVolume;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DeductibleVoucherReminder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPointsBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.RVu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69666RVu implements Parcelable.Creator<ProductBase> {
    @Override // android.os.Parcelable.Creator
    public final ProductBase createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        Video createFromParcel;
        ArrayList arrayList;
        ArrayList arrayList2;
        CombinedSalesVolume createFromParcel2;
        ProductPrice createFromParcel3;
        PurchaseNotice createFromParcel4;
        SizeGuide createFromParcel5;
        DeductibleVoucherReminder createFromParcel6;
        Integer valueOf2;
        boolean z2;
        Boolean valueOf3;
        DynamicSellingPointsBase createFromParcel7;
        boolean z3;
        Boolean valueOf4;
        ProductPrice createFromParcel8;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        LinkRichText linkRichText = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Video.CREATOR.createFromParcel(parcel);
        }
        Video video = createFromParcel;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C5YW.LIZ(ProductBase.class, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() == 0) {
            arrayList2 = null;
        } else {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = C279117r.LIZIZ(Specification.CREATOR, parcel, arrayList2, i2, 1);
            }
        }
        String readString3 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = CombinedSalesVolume.CREATOR.createFromParcel(parcel);
        }
        CombinedSalesVolume combinedSalesVolume = createFromParcel2;
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = ProductPrice.CREATOR.createFromParcel(parcel);
        }
        ProductPrice productPrice = createFromParcel3;
        if (parcel.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = PurchaseNotice.CREATOR.createFromParcel(parcel);
        }
        PurchaseNotice purchaseNotice = createFromParcel4;
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel5 = null;
        } else {
            createFromParcel5 = SizeGuide.CREATOR.createFromParcel(parcel);
        }
        SizeGuide sizeGuide = createFromParcel5;
        if (parcel.readInt() == 0) {
            createFromParcel6 = null;
        } else {
            createFromParcel6 = DeductibleVoucherReminder.CREATOR.createFromParcel(parcel);
        }
        DeductibleVoucherReminder deductibleVoucherReminder = createFromParcel6;
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            valueOf3 = Boolean.valueOf(z2);
        }
        if (parcel.readInt() == 0) {
            createFromParcel7 = null;
        } else {
            createFromParcel7 = DynamicSellingPointsBase.CREATOR.createFromParcel(parcel);
        }
        DynamicSellingPointsBase dynamicSellingPointsBase = createFromParcel7;
        if (parcel.readInt() == 0) {
            valueOf4 = null;
        } else {
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            valueOf4 = Boolean.valueOf(z3);
        }
        if (parcel.readInt() == 0) {
            createFromParcel8 = null;
        } else {
            createFromParcel8 = ProductPrice.CREATOR.createFromParcel(parcel);
        }
        ProductPrice productPrice2 = createFromParcel8;
        if (parcel.readInt() != 0) {
            linkRichText = LinkRichText.CREATOR.createFromParcel(parcel);
        }
        return new ProductBase(readString, readString2, valueOf, video, arrayList, arrayList2, readString3, combinedSalesVolume, productPrice, purchaseNotice, readString4, sizeGuide, deductibleVoucherReminder, valueOf2, valueOf3, dynamicSellingPointsBase, valueOf4, productPrice2, linkRichText);
    }

    @Override // android.os.Parcelable.Creator
    public final ProductBase[] newArray(int i) {
        return new ProductBase[i];
    }
}
