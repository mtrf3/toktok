package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SecurityInformationItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SecurityInformationItemDesc;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ae2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26710Ae2 implements Parcelable.Creator<SecurityInformationItem> {
    @Override // android.os.Parcelable.Creator
    public final SecurityInformationItem createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon = createFromParcel;
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(SecurityInformationItemDesc.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new SecurityInformationItem(readString, icon, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final SecurityInformationItem[] newArray(int i) {
        return new SecurityInformationItem[i];
    }
}
