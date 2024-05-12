package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldData;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S89 implements Parcelable.Creator<TemplateField> {
    @Override // android.os.Parcelable.Creator
    public final TemplateField createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new TemplateField(parcel.readLong(), parcel.readInt(), TemplateFieldData.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final TemplateField[] newArray(int i) {
        return new TemplateField[i];
    }
}
