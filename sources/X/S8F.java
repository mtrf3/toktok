package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldProduct;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S8F implements Parcelable.Creator<TemplateFieldProduct> {
    @Override // android.os.Parcelable.Creator
    public final TemplateFieldProduct createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new TemplateFieldProduct(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final TemplateFieldProduct[] newArray(int i) {
        return new TemplateFieldProduct[i];
    }
}
