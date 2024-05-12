package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUp;
import kotlin.jvm.internal.o;

/* renamed from: X.RTx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69617RTx implements Parcelable.Creator<PopUp> {
    @Override // android.os.Parcelable.Creator
    public final PopUp createFromParcel(Parcel parcel) {
        Long valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        return new PopUp(readString, valueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final PopUp[] newArray(int i) {
        return new PopUp[i];
    }
}
