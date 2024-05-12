package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PrivacyPolicy;
import kotlin.jvm.internal.o;

/* renamed from: X.Ag2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26834Ag2 implements Parcelable.Creator<PrivacyPolicy> {
    @Override // android.os.Parcelable.Creator
    public final PrivacyPolicy createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new PrivacyPolicy(valueOf, parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PrivacyPolicy[] newArray(int i) {
        return new PrivacyPolicy[i];
    }
}
