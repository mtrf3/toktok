package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AdditionalInfoItem;
import kotlin.jvm.internal.o;

/* renamed from: X.Ass, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27630Ass implements Parcelable.Creator<AdditionalInfoItem> {
    @Override // android.os.Parcelable.Creator
    public final AdditionalInfoItem createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new AdditionalInfoItem(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AdditionalInfoItem[] newArray(int i) {
        return new AdditionalInfoItem[i];
    }
}
