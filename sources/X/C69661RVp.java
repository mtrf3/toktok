package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReturnPolicy;
import kotlin.jvm.internal.o;

/* renamed from: X.RVp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69661RVp implements Parcelable.Creator<ReturnPolicy> {
    @Override // android.os.Parcelable.Creator
    public final ReturnPolicy createFromParcel(Parcel parcel) {
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
        return new ReturnPolicy(readString, readString2, icon2, icon);
    }

    @Override // android.os.Parcelable.Creator
    public final ReturnPolicy[] newArray(int i) {
        return new ReturnPolicy[i];
    }
}
