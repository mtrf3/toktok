package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DelayOperation;
import kotlin.jvm.internal.o;

/* renamed from: X.IxX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48303IxX implements Parcelable.Creator<DelayOperation> {
    @Override // android.os.Parcelable.Creator
    public final DelayOperation createFromParcel(Parcel parcel) {
        Integer valueOf;
        Long valueOf2;
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        }
        return new DelayOperation(valueOf, valueOf2, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final DelayOperation[] newArray(int i) {
        return new DelayOperation[i];
    }
}
