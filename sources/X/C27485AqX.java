package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.AqX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27485AqX implements Parcelable.Creator<PreOrderInfo> {
    @Override // android.os.Parcelable.Creator
    public final PreOrderInfo createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new PreOrderInfo(readString, valueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final PreOrderInfo[] newArray(int i) {
        return new PreOrderInfo[i];
    }
}
