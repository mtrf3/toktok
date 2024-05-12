package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.bnpl.utils.BillHomeArg;
import kotlin.jvm.internal.o;

/* renamed from: X.a0p, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91823a0p implements Parcelable.Creator<BillHomeArg> {
    @Override // android.os.Parcelable.Creator
    public final BillHomeArg createFromParcel(Parcel parcel) {
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
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            bool = Boolean.valueOf(z2);
        }
        return new BillHomeArg(valueOf, readString, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final BillHomeArg[] newArray(int i) {
        return new BillHomeArg[i];
    }
}
