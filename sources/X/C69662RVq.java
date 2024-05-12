package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CodPolicy;
import kotlin.jvm.internal.o;

/* renamed from: X.RVq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69662RVq implements Parcelable.Creator<CodPolicy> {
    @Override // android.os.Parcelable.Creator
    public final CodPolicy createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        return new CodPolicy(readString, readString2, createFromParcel, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final CodPolicy[] newArray(int i) {
        return new CodPolicy[i];
    }
}
