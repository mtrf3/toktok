package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDesc;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDescBlock;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ak5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27085Ak5 implements Parcelable.Creator<UserRightDesc> {
    @Override // android.os.Parcelable.Creator
    public final UserRightDesc createFromParcel(Parcel parcel) {
        Integer valueOf;
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        Icon icon = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(UserRightDescBlock.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() != 0) {
            icon = Icon.CREATOR.createFromParcel(parcel);
        }
        return new UserRightDesc(readString, readString2, readString3, valueOf, readString4, arrayList, icon, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final UserRightDesc[] newArray(int i) {
        return new UserRightDesc[i];
    }
}
