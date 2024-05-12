package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import kotlin.jvm.internal.o;

/* renamed from: X.RWt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69691RWt implements Parcelable.Creator<BuyButton> {
    @Override // android.os.Parcelable.Creator
    public final BuyButton createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
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
        return new BuyButton(readString, readString2, valueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final BuyButton[] newArray(int i) {
        return new BuyButton[i];
    }
}
