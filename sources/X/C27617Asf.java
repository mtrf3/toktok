package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RichBlock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.XLLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.Asf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27617Asf implements Parcelable.Creator<RichBlock> {
    @Override // android.os.Parcelable.Creator
    public final RichBlock createFromParcel(Parcel parcel) {
        Integer valueOf;
        LogisticLinkRichText createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        XLLinkRichText xLLinkRichText = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = LogisticLinkRichText.CREATOR.createFromParcel(parcel);
        }
        LogisticLinkRichText logisticLinkRichText = createFromParcel;
        Image image = (Image) parcel.readParcelable(RichBlock.class.getClassLoader());
        if (parcel.readInt() != 0) {
            xLLinkRichText = XLLinkRichText.CREATOR.createFromParcel(parcel);
        }
        return new RichBlock(valueOf, logisticLinkRichText, image, xLLinkRichText);
    }

    @Override // android.os.Parcelable.Creator
    public final RichBlock[] newArray(int i) {
        return new RichBlock[i];
    }
}
