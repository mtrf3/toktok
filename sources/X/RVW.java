package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonText;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVW implements Parcelable.Creator<SkuCommonText> {
    @Override // android.os.Parcelable.Creator
    public final SkuCommonText createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new SkuCommonText(valueOf, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SkuCommonText[] newArray(int i) {
        return new SkuCommonText[i];
    }
}
