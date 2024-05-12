package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDesc;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ak6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27086Ak6 implements Parcelable.Creator<UserRightDetail> {
    @Override // android.os.Parcelable.Creator
    public final UserRightDetail createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        ArrayList arrayList;
        boolean z;
        Boolean valueOf;
        boolean z2;
        Boolean valueOf2;
        Icon createFromParcel2;
        Integer valueOf3;
        boolean z3;
        Boolean valueOf4;
        Icon createFromParcel3;
        Integer valueOf5;
        Integer valueOf6;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon = createFromParcel;
        boolean z4 = false;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(UserRightDesc.CREATOR, parcel, arrayList, i, 1);
            }
        }
        String readString3 = parcel.readString();
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
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon2 = createFromParcel2;
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf4 = null;
        } else {
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            valueOf4 = Boolean.valueOf(z3);
        }
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon3 = createFromParcel3;
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
            if (parcel.readInt() != 0) {
                z4 = true;
            }
            bool = Boolean.valueOf(z4);
        }
        return new UserRightDetail(readString, readString2, icon, arrayList, readString3, valueOf, valueOf2, readString4, icon2, valueOf3, valueOf4, icon3, valueOf5, valueOf6, bool, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final UserRightDetail[] newArray(int i) {
        return new UserRightDetail[i];
    }
}
