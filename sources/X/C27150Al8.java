package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingServiceModule;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Al8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27150Al8 implements Parcelable.Creator<PDPShippingServiceModule> {
    @Override // android.os.Parcelable.Creator
    public final PDPShippingServiceModule createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        LinkRichText createFromParcel2;
        ArrayList arrayList;
        Icon createFromParcel3;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        Icon icon = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon2 = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = LinkRichText.CREATOR.createFromParcel(parcel);
        }
        LinkRichText linkRichText = createFromParcel2;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(LinkRichText.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon3 = createFromParcel3;
        if (parcel.readInt() != 0) {
            icon = Icon.CREATOR.createFromParcel(parcel);
        }
        return new PDPShippingServiceModule(readString, icon2, linkRichText, arrayList, icon3, icon);
    }

    @Override // android.os.Parcelable.Creator
    public final PDPShippingServiceModule[] newArray(int i) {
        return new PDPShippingServiceModule[i];
    }
}
