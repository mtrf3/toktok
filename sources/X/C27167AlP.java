package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.PolicyItem;
import kotlin.jvm.internal.o;

/* renamed from: X.AlP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27167AlP implements Parcelable.Creator<PolicyItem> {
    @Override // android.os.Parcelable.Creator
    public final PolicyItem createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Icon icon = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon2 = createFromParcel;
        if (parcel.readInt() != 0) {
            icon = Icon.CREATOR.createFromParcel(parcel);
        }
        return new PolicyItem(readString, readString2, icon2, icon);
    }

    @Override // android.os.Parcelable.Creator
    public final PolicyItem[] newArray(int i) {
        return new PolicyItem[i];
    }
}
