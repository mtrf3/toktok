package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StaticSellingPoint;
import kotlin.jvm.internal.o;

/* renamed from: X.AoJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27347AoJ implements Parcelable.Creator<StaticSellingPoint> {
    @Override // android.os.Parcelable.Creator
    public final StaticSellingPoint createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        CommonColor commonColor = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon = createFromParcel;
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            commonColor = CommonColor.CREATOR.createFromParcel(parcel);
        }
        return new StaticSellingPoint(icon, readString, commonColor, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final StaticSellingPoint[] newArray(int i) {
        return new StaticSellingPoint[i];
    }
}
