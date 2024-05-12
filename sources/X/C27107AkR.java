package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LeadMessage;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.Icon;
import kotlin.jvm.internal.o;

/* renamed from: X.AkR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27107AkR implements Parcelable.Creator<LeadMessage> {
    @Override // android.os.Parcelable.Creator
    public final LeadMessage createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        Icon createFromParcel2;
        o.LJIIIZ(parcel, "parcel");
        Icon icon = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon2 = createFromParcel;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon3 = createFromParcel2;
        if (parcel.readInt() != 0) {
            icon = Icon.CREATOR.createFromParcel(parcel);
        }
        return new LeadMessage(icon2, readString, readString2, readString3, icon3, icon, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final LeadMessage[] newArray(int i) {
        return new LeadMessage[i];
    }
}
