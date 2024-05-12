package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuVoucher;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVN implements Parcelable.Creator<SkuPanelState> {
    @Override // android.os.Parcelable.Creator
    public final SkuPanelState createFromParcel(Parcel parcel) {
        SkuVoucher createFromParcel;
        Integer valueOf;
        boolean z;
        boolean z2;
        Boolean valueOf2;
        Boolean valueOf3;
        ImageSelectData createFromParcel2;
        ArrayList arrayList;
        Integer valueOf4;
        Long valueOf5;
        InstallmentPlan createFromParcel3;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = SkuVoucher.CREATOR.createFromParcel(parcel);
        }
        SkuVoucher skuVoucher = createFromParcel;
        String[] createStringArray = parcel.createStringArray();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        boolean z3 = true;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        int readInt = parcel.readInt();
        CartEntry cartEntry = (CartEntry) parcel.readParcelable(SkuPanelState.class.getClassLoader());
        ExceptionUX exceptionUX = (ExceptionUX) parcel.readParcelable(SkuPanelState.class.getClassLoader());
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            valueOf2 = Boolean.valueOf(z2);
        }
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            if (parcel.readInt() == 0) {
                z3 = false;
            }
            valueOf3 = Boolean.valueOf(z3);
        }
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = ImageSelectData.CREATOR.createFromParcel(parcel);
        }
        ImageSelectData imageSelectData = createFromParcel2;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt2 = parcel.readInt();
            arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
        }
        if (parcel.readInt() == 0) {
            valueOf4 = null;
        } else {
            valueOf4 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf5 = null;
        } else {
            valueOf5 = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = InstallmentPlan.CREATOR.createFromParcel(parcel);
        }
        return new SkuPanelState(readString, readString2, readString3, skuVoucher, createStringArray, valueOf, z, readInt, cartEntry, exceptionUX, valueOf2, readString4, valueOf3, readString5, readString6, imageSelectData, arrayList, valueOf4, valueOf5, createFromParcel3);
    }

    @Override // android.os.Parcelable.Creator
    public final SkuPanelState[] newArray(int i) {
        return new SkuPanelState[i];
    }
}
