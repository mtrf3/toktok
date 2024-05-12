package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPAppendix;
import kotlin.jvm.internal.o;

/* renamed from: X.Al9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27151Al9 implements Parcelable.Creator<PDPAppendix> {
    @Override // android.os.Parcelable.Creator
    public final PDPAppendix createFromParcel(Parcel parcel) {
        LinkRichText createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        Icon icon = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
        }
        LinkRichText linkRichText = createFromParcel;
        if (parcel.readInt() != 0) {
            icon = Icon.CREATOR.createFromParcel(parcel);
        }
        return new PDPAppendix(linkRichText, icon);
    }

    @Override // android.os.Parcelable.Creator
    public final PDPAppendix[] newArray(int i) {
        return new PDPAppendix[i];
    }
}
