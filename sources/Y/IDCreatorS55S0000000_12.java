package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;

/* loaded from: classes13.dex */
public class IDCreatorS55S0000000_12 implements Parcelable.Creator {
    public final int $t;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.$t) {
            case 0:
                return createFromParcel$0(this, parcel);
            case 1:
                return createFromParcel$1(this, parcel);
            case 2:
                return createFromParcel$2(this, parcel);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.$t) {
            case 0:
                return newArray$0(this, i);
            case 1:
                return newArray$1(this, i);
            case 2:
                return newArray$2(this, i);
            default:
                return new Object[0];
        }
    }

    public IDCreatorS55S0000000_12(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(IDCreatorS55S0000000_12 iDCreatorS55S0000000_12, Parcel parcel) {
        return new ShopOrderShareStruct(parcel);
    }

    public static final Object createFromParcel$1(IDCreatorS55S0000000_12 iDCreatorS55S0000000_12, Parcel parcel) {
        return new ShopOrderShareStructInfo(parcel);
    }

    public static final Object createFromParcel$2(IDCreatorS55S0000000_12 iDCreatorS55S0000000_12, Parcel parcel) {
        return new FaceStickerCommerceBean(parcel);
    }

    public static final Object[] newArray$0(IDCreatorS55S0000000_12 iDCreatorS55S0000000_12, int i) {
        return new ShopOrderShareStruct[i];
    }

    public static final Object[] newArray$1(IDCreatorS55S0000000_12 iDCreatorS55S0000000_12, int i) {
        return new ShopOrderShareStructInfo[i];
    }

    public static final Object[] newArray$2(IDCreatorS55S0000000_12 iDCreatorS55S0000000_12, int i) {
        return new FaceStickerCommerceBean[i];
    }
}
