package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelCard;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Aqy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27512Aqy implements Parcelable.Creator<ModelCard> {
    @Override // android.os.Parcelable.Creator
    public final ModelCard createFromParcel(Parcel parcel) {
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
                i = C279117r.LIZIZ(ModelInfo.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new ModelCard(readString, arrayList, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ModelCard[] newArray(int i) {
        return new ModelCard[i];
    }
}
