package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.CheckoutLink;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.LogisticBizData;
import kotlin.jvm.internal.o;

/* renamed from: X.Akj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27125Akj implements Parcelable.Creator<LogisticBizData> {
    @Override // android.os.Parcelable.Creator
    public final LogisticBizData createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        boolean z2;
        Boolean valueOf2;
        Price createFromParcel;
        Integer valueOf3;
        Integer valueOf4;
        CheckoutLink createFromParcel2;
        boolean z3;
        Boolean valueOf5;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        boolean z4 = false;
        Boolean bool = null;
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
            valueOf2 = null;
        } else {
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            valueOf2 = Boolean.valueOf(z2);
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Price.CREATOR.createFromParcel(parcel);
        }
        Price price = createFromParcel;
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
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
            createFromParcel2 = null;
        } else {
            createFromParcel2 = CheckoutLink.CREATOR.createFromParcel(parcel);
        }
        CheckoutLink checkoutLink = createFromParcel2;
        if (parcel.readInt() == 0) {
            valueOf5 = null;
        } else {
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            valueOf5 = Boolean.valueOf(z3);
        }
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z4 = true;
            }
            bool = Boolean.valueOf(z4);
        }
        return new LogisticBizData(readString, readString2, valueOf, valueOf2, price, readString3, readString4, valueOf3, valueOf4, checkoutLink, valueOf5, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final LogisticBizData[] newArray(int i) {
        return new LogisticBizData[i];
    }
}
