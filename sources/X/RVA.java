package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.MarketingConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVA implements Parcelable.Creator<MarketingConfig> {
    @Override // android.os.Parcelable.Creator
    public final MarketingConfig createFromParcel(Parcel parcel) {
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
        return new MarketingConfig(valueOf, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final MarketingConfig[] newArray(int i) {
        return new MarketingConfig[i];
    }
}
