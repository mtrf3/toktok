package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSaleReminderButton;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RV6 implements Parcelable.Creator<FlashSale> {
    @Override // android.os.Parcelable.Creator
    public final FlashSale createFromParcel(Parcel parcel) {
        Integer valueOf;
        FlashSaleReminderButton createFromParcel;
        Integer valueOf2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        Image image = (Image) parcel.readParcelable(FlashSale.class.getClassLoader());
        Image image2 = (Image) parcel.readParcelable(FlashSale.class.getClassLoader());
        Image image3 = (Image) parcel.readParcelable(FlashSale.class.getClassLoader());
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = FlashSaleReminderButton.CREATOR.createFromParcel(parcel);
        }
        FlashSaleReminderButton flashSaleReminderButton = createFromParcel;
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        String readString7 = parcel.readString();
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new FlashSale(readString, valueOf, readString2, readString3, readString4, readString5, readString6, image, image2, image3, flashSaleReminderButton, valueOf2, readString7, num);
    }

    @Override // android.os.Parcelable.Creator
    public final FlashSale[] newArray(int i) {
        return new FlashSale[i];
    }
}
