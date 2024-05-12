package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Creator;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RWK implements Parcelable.Creator<Creator> {
    @Override // android.os.Parcelable.Creator
    public final Creator createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        o.LJIIIZ(parcel, "parcel");
        boolean z2 = false;
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
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            bool = Boolean.valueOf(z2);
        }
        return new Creator(valueOf, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final Creator[] newArray(int i) {
        return new Creator[i];
    }
}
