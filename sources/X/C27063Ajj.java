package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SpendMoreForFree;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.ShippingDialogDto;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsDescription;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ajj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27063Ajj implements Parcelable.Creator<LogisticDTO> {
    @Override // android.os.Parcelable.Creator
    public final LogisticDTO createFromParcel(Parcel parcel) {
        Integer valueOf;
        boolean z;
        Boolean valueOf2;
        boolean z2;
        Boolean valueOf3;
        Price createFromParcel;
        boolean z3;
        Boolean valueOf4;
        boolean z4;
        Boolean valueOf5;
        LogisticTextDTO createFromParcel2;
        Integer valueOf6;
        Integer valueOf7;
        SpendMoreForFree createFromParcel3;
        LinkedHashMap linkedHashMap;
        LogisticPromotion createFromParcel4;
        boolean z5;
        Boolean valueOf8;
        ShippingDialogDto createFromParcel5;
        ShippingService createFromParcel6;
        LogisticLinkRichText createFromParcel7;
        LogisticLinkRichText createFromParcel8;
        ArrayList arrayList;
        LogisticLinkRichText createFromParcel9;
        LogisticsDescription createFromParcel10;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf2 = Boolean.valueOf(z);
        }
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            valueOf3 = Boolean.valueOf(z2);
        }
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Price.CREATOR.createFromParcel(parcel);
        }
        Price price = createFromParcel;
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf4 = null;
        } else {
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            valueOf4 = Boolean.valueOf(z3);
        }
        if (parcel.readInt() == 0) {
            valueOf5 = null;
        } else {
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            valueOf5 = Boolean.valueOf(z4);
        }
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = LogisticTextDTO.CREATOR.createFromParcel(parcel);
        }
        LogisticTextDTO logisticTextDTO = createFromParcel2;
        String readString5 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf6 = null;
        } else {
            valueOf6 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf7 = null;
        } else {
            valueOf7 = Integer.valueOf(parcel.readInt());
        }
        String readString6 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = SpendMoreForFree.CREATOR.createFromParcel(parcel);
        }
        SpendMoreForFree spendMoreForFree = createFromParcel3;
        if (parcel.readInt() == 0) {
            linkedHashMap = null;
        } else {
            int readInt = parcel.readInt();
            linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = LogisticPromotion.CREATOR.createFromParcel(parcel);
        }
        LogisticPromotion logisticPromotion = createFromParcel4;
        if (parcel.readInt() == 0) {
            valueOf8 = null;
        } else {
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            valueOf8 = Boolean.valueOf(z5);
        }
        if (parcel.readInt() == 0) {
            createFromParcel5 = null;
        } else {
            createFromParcel5 = ShippingDialogDto.CREATOR.createFromParcel(parcel);
        }
        ShippingDialogDto shippingDialogDto = createFromParcel5;
        if (parcel.readInt() == 0) {
            createFromParcel6 = null;
        } else {
            createFromParcel6 = ShippingService.CREATOR.createFromParcel(parcel);
        }
        ShippingService shippingService = createFromParcel6;
        String readString7 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel7 = null;
        } else {
            createFromParcel7 = LogisticLinkRichText.CREATOR.createFromParcel(parcel);
        }
        LogisticLinkRichText logisticLinkRichText = createFromParcel7;
        if (parcel.readInt() == 0) {
            createFromParcel8 = null;
        } else {
            createFromParcel8 = LogisticLinkRichText.CREATOR.createFromParcel(parcel);
        }
        LogisticLinkRichText logisticLinkRichText2 = createFromParcel8;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt2 = parcel.readInt();
            arrayList = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = C279117r.LIZIZ(LogisticLinkRichText.CREATOR, parcel, arrayList, i2, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel9 = null;
        } else {
            createFromParcel9 = LogisticLinkRichText.CREATOR.createFromParcel(parcel);
        }
        LogisticLinkRichText logisticLinkRichText3 = createFromParcel9;
        if (parcel.readInt() == 0) {
            createFromParcel10 = null;
        } else {
            createFromParcel10 = LogisticsDescription.CREATOR.createFromParcel(parcel);
        }
        return new LogisticDTO(valueOf, readString, valueOf2, valueOf3, readString2, price, readString3, readString4, valueOf4, valueOf5, logisticTextDTO, readString5, valueOf6, valueOf7, readString6, spendMoreForFree, linkedHashMap, logisticPromotion, valueOf8, shippingDialogDto, shippingService, readString7, logisticLinkRichText, logisticLinkRichText2, arrayList, logisticLinkRichText3, createFromParcel10);
    }

    @Override // android.os.Parcelable.Creator
    public final LogisticDTO[] newArray(int i) {
        return new LogisticDTO[i];
    }
}
