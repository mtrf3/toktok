package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PrivacyPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPolicy;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ag1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26833Ag1 implements Parcelable.Creator<ShopPolicy> {
    @Override // android.os.Parcelable.Creator
    public final ShopPolicy createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        Icon createFromParcel2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon2 = createFromParcel2;
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(PrivacyPolicy.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new ShopPolicy(readString, readString2, icon, icon2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final ShopPolicy[] newArray(int i) {
        return new ShopPolicy[i];
    }
}
