package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderRsp;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ESL implements Parcelable.Creator<ReminderRsp> {
    @Override // android.os.Parcelable.Creator
    public final ReminderRsp createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ReminderRsp(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ReminderRsp[] newArray(int i) {
        return new ReminderRsp[i];
    }
}
