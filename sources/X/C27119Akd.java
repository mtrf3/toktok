package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkText;
import kotlin.jvm.internal.o;

/* renamed from: X.Akd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27119Akd implements Parcelable.Creator<LogisticLinkText> {
    @Override // android.os.Parcelable.Creator
    public final LogisticLinkText createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        boolean z2;
        Boolean valueOf2;
        boolean z3;
        Boolean valueOf3;
        Boolean valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        boolean z4 = false;
        Integer num = null;
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
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
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
        if (parcel.readInt() == 0) {
            valueOf4 = null;
        } else {
            if (parcel.readInt() != 0) {
                z4 = true;
            }
            valueOf4 = Boolean.valueOf(z4);
        }
        if (parcel.readInt() == 0) {
            valueOf5 = null;
        } else {
            valueOf5 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf6 = null;
        } else {
            valueOf6 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new LogisticLinkText(readString, valueOf, valueOf2, readString2, readString3, valueOf3, valueOf4, valueOf5, valueOf6, num);
    }

    @Override // android.os.Parcelable.Creator
    public final LogisticLinkText[] newArray(int i) {
        return new LogisticLinkText[i];
    }
}
