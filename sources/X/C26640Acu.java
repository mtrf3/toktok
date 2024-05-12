package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import kotlin.jvm.internal.o;

/* renamed from: X.Acu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26640Acu implements Parcelable.Creator<ReachableAddress> {
    @Override // android.os.Parcelable.Creator
    public final ReachableAddress createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        Address createFromParcel;
        boolean z2;
        Boolean valueOf2;
        boolean z3;
        Boolean valueOf3;
        boolean z4;
        Boolean valueOf4;
        boolean z5;
        boolean z6;
        o.LJIIIZ(parcel, "parcel");
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
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Address.CREATOR.createFromParcel(parcel);
        }
        Address address = createFromParcel;
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            valueOf2 = Boolean.valueOf(z2);
        }
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            valueOf3 = Boolean.valueOf(z3);
        }
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf4 = null;
        } else {
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            valueOf4 = Boolean.valueOf(z4);
        }
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            bool = Boolean.valueOf(z5);
        }
        String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        return new ReachableAddress(valueOf, address, readString, valueOf2, valueOf3, readString2, valueOf4, bool, readString3, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final ReachableAddress[] newArray(int i) {
        return new ReachableAddress[i];
    }
}
