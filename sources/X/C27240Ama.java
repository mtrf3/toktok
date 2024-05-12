package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Ama, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27240Ama implements Parcelable.Creator<ClientConfig> {
    @Override // android.os.Parcelable.Creator
    public final ClientConfig createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        boolean z2;
        Boolean valueOf2;
        boolean z3;
        Boolean valueOf3;
        boolean z4;
        Boolean valueOf4;
        boolean z5;
        Boolean valueOf5;
        boolean z6;
        Boolean valueOf6;
        boolean z7;
        Boolean valueOf7;
        o.LJIIIZ(parcel, "parcel");
        boolean z8 = false;
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
            valueOf2 = null;
        } else {
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            valueOf2 = Boolean.valueOf(z2);
        }
        String readString = parcel.readString();
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
        String readString3 = parcel.readString();
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
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        String readString10 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf5 = null;
        } else {
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            valueOf5 = Boolean.valueOf(z5);
        }
        String readString11 = parcel.readString();
        String readString12 = parcel.readString();
        String readString13 = parcel.readString();
        String readString14 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf6 = null;
        } else {
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            valueOf6 = Boolean.valueOf(z6);
        }
        if (parcel.readInt() == 0) {
            valueOf7 = null;
        } else {
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            valueOf7 = Boolean.valueOf(z7);
        }
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z8 = true;
            }
            bool = Boolean.valueOf(z8);
        }
        return new ClientConfig(valueOf, valueOf2, readString, valueOf3, readString2, readString3, valueOf4, readString4, readString5, readString6, readString7, readString8, readString9, readString10, valueOf5, readString11, readString12, readString13, readString14, valueOf6, valueOf7, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final ClientConfig[] newArray(int i) {
        return new ClientConfig[i];
    }
}
