package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ContactDetail;
import kotlin.jvm.internal.o;

/* renamed from: X.Ajv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27075Ajv implements Parcelable.Creator<ContactDetail> {
    @Override // android.os.Parcelable.Creator
    public final ContactDetail createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        return new ContactDetail(readString, createFromParcel, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ContactDetail[] newArray(int i) {
        return new ContactDetail[i];
    }
}
