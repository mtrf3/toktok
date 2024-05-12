package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecoration;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecorationPosition;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecorationTitle;
import kotlin.jvm.internal.o;

/* renamed from: X.S8i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71604S8i implements Parcelable.Creator<TemplateDecoration> {
    @Override // android.os.Parcelable.Creator
    public final TemplateDecoration createFromParcel(Parcel parcel) {
        Integer valueOf;
        TemplateDecorationTitle createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        TemplateDecorationPosition templateDecorationPosition = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = TemplateDecorationTitle.CREATOR.createFromParcel(parcel);
        }
        TemplateDecorationTitle templateDecorationTitle = createFromParcel;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            templateDecorationPosition = TemplateDecorationPosition.CREATOR.createFromParcel(parcel);
        }
        return new TemplateDecoration(valueOf, templateDecorationTitle, readString, readString2, readString3, readString4, templateDecorationPosition);
    }

    @Override // android.os.Parcelable.Creator
    public final TemplateDecoration[] newArray(int i) {
        return new TemplateDecoration[i];
    }
}
