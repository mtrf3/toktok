package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InteractiveUserTask;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInteractiveInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.RUo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69634RUo implements Parcelable.Creator<VoucherInteractiveInfo> {
    @Override // android.os.Parcelable.Creator
    public final VoucherInteractiveInfo createFromParcel(Parcel parcel) {
        InteractiveUserTask createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        Image image = (Image) parcel.readParcelable(VoucherInteractiveInfo.class.getClassLoader());
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = InteractiveUserTask.CREATOR.createFromParcel(parcel);
        }
        return new VoucherInteractiveInfo(image, readString, readString2, readString3, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final VoucherInteractiveInfo[] newArray(int i) {
        return new VoucherInteractiveInfo[i];
    }
}
