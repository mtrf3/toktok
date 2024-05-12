package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecorationPosition;
import kotlin.jvm.internal.o;

/* renamed from: X.S8k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71606S8k implements Parcelable.Creator<TemplateDecorationPosition> {
    @Override // android.os.Parcelable.Creator
    public final TemplateDecorationPosition createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new TemplateDecorationPosition(valueOf, num);
    }

    @Override // android.os.Parcelable.Creator
    public final TemplateDecorationPosition[] newArray(int i) {
        return new TemplateDecorationPosition[i];
    }
}
