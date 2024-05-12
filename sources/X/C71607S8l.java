package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecorationTitleColor;
import kotlin.jvm.internal.o;

/* renamed from: X.S8l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71607S8l implements Parcelable.Creator<TemplateDecorationTitleColor> {
    @Override // android.os.Parcelable.Creator
    public final TemplateDecorationTitleColor createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new TemplateDecorationTitleColor(parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final TemplateDecorationTitleColor[] newArray(int i) {
        return new TemplateDecorationTitleColor[i];
    }
}
