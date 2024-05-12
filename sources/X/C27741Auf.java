package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.Auf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27741Auf implements Parcelable.Creator<PromotionLogo> {
    @Override // android.os.Parcelable.Creator
    public final PromotionLogo createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        Image image = (Image) parcel.readParcelable(PromotionLogo.class.getClassLoader());
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new PromotionLogo(image, readString, valueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final PromotionLogo[] newArray(int i) {
        return new PromotionLogo[i];
    }
}
