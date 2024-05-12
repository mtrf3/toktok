package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SecurityInformationItemDesc;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ae3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26711Ae3 implements Parcelable.Creator<SecurityInformationItemDesc> {
    @Override // android.os.Parcelable.Creator
    public final SecurityInformationItemDesc createFromParcel(Parcel parcel) {
        Integer valueOf;
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        LinkRichText linkRichText = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(Icon.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() != 0) {
            linkRichText = LinkRichText.CREATOR.createFromParcel(parcel);
        }
        return new SecurityInformationItemDesc(valueOf, readString, arrayList, linkRichText);
    }

    @Override // android.os.Parcelable.Creator
    public final SecurityInformationItemDesc[] newArray(int i) {
        return new SecurityInformationItemDesc[i];
    }
}
