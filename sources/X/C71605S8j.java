package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecorationTitle;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecorationTitleColor;
import kotlin.jvm.internal.o;

/* renamed from: X.S8j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71605S8j implements Parcelable.Creator<TemplateDecorationTitle> {
    @Override // android.os.Parcelable.Creator
    public final TemplateDecorationTitle createFromParcel(Parcel parcel) {
        TemplateDecorationTitleColor createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = TemplateDecorationTitleColor.CREATOR.createFromParcel(parcel);
        }
        return new TemplateDecorationTitle(readString, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final TemplateDecorationTitle[] newArray(int i) {
        return new TemplateDecorationTitle[i];
    }
}
