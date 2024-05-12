package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PhoneContact;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommend;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Arg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27556Arg implements Parcelable.Creator<SellerInfo> {
    @Override // android.os.Parcelable.Creator
    public final SellerInfo createFromParcel(Parcel parcel) {
        Long valueOf;
        PhoneContact createFromParcel;
        ShopRecommend createFromParcel2;
        boolean z;
        Boolean valueOf2;
        ArrayList arrayList;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        boolean z2;
        Boolean valueOf6;
        SellerSellingPoint createFromParcel3;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Image image = (Image) parcel.readParcelable(SellerInfo.class.getClassLoader());
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = PhoneContact.CREATOR.createFromParcel(parcel);
        }
        PhoneContact phoneContact = createFromParcel;
        String readString6 = parcel.readString();
        StoreLabel storeLabel = (StoreLabel) parcel.readParcelable(SellerInfo.class.getClassLoader());
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = ShopRecommend.CREATOR.createFromParcel(parcel);
        }
        ShopRecommend shopRecommend = createFromParcel2;
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf2 = Boolean.valueOf(z);
        }
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(SellerDetailInfo.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf4 = null;
        } else {
            valueOf4 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf5 = null;
        } else {
            valueOf5 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf6 = null;
        } else {
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            valueOf6 = Boolean.valueOf(z2);
        }
        String readString7 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = SellerSellingPoint.CREATOR.createFromParcel(parcel);
        }
        return new SellerInfo(readString, readString2, image, valueOf, readString3, readString4, readString5, phoneContact, readString6, storeLabel, shopRecommend, valueOf2, arrayList, valueOf3, valueOf4, valueOf5, valueOf6, readString7, createFromParcel3);
    }

    @Override // android.os.Parcelable.Creator
    public final SellerInfo[] newArray(int i) {
        return new SellerInfo[i];
    }
}
