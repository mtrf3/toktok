package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.Option;
import kotlin.jvm.internal.o;

/* renamed from: X.RqY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70802RqY implements Parcelable.Creator<Option> {
    @Override // android.os.Parcelable.Creator
    public final Option createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new Option(readString, readString2, readString3, z);
    }

    @Override // android.os.Parcelable.Creator
    public final Option[] newArray(int i) {
        return new Option[i];
    }
}
