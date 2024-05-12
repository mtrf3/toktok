package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldProduct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldText;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S8D implements Parcelable.Creator<TemplateFieldData> {
    @Override // android.os.Parcelable.Creator
    public final TemplateFieldData createFromParcel(Parcel parcel) {
        TemplateFieldText createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        TemplateFieldProduct templateFieldProduct = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = TemplateFieldText.CREATOR.createFromParcel(parcel);
        }
        TemplateFieldText templateFieldText = createFromParcel;
        if (parcel.readInt() != 0) {
            templateFieldProduct = TemplateFieldProduct.CREATOR.createFromParcel(parcel);
        }
        return new TemplateFieldData(templateFieldText, templateFieldProduct);
    }

    @Override // android.os.Parcelable.Creator
    public final TemplateFieldData[] newArray(int i) {
        return new TemplateFieldData[i];
    }
}
