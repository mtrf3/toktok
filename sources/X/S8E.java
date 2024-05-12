package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldText;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S8E implements Parcelable.Creator<TemplateFieldText> {
    @Override // android.os.Parcelable.Creator
    public final TemplateFieldText createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new TemplateFieldText(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final TemplateFieldText[] newArray(int i) {
        return new TemplateFieldText[i];
    }
}
