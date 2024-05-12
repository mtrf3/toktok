package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SecurityInformation;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SecurityInformationItem;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ae5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26713Ae5 implements Parcelable.Creator<SecurityInformation> {
    @Override // android.os.Parcelable.Creator
    public final SecurityInformation createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(SecurityInformationItem.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new SecurityInformation(readString, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final SecurityInformation[] newArray(int i) {
        return new SecurityInformation[i];
    }
}
