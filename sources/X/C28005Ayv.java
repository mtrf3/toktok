package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Ayv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28005Ayv implements Parcelable.Creator<SkuCardStyleInfo> {
    @Override // android.os.Parcelable.Creator
    public final SkuCardStyleInfo createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new SkuCardStyleInfo(valueOf, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SkuCardStyleInfo[] newArray(int i) {
        return new SkuCardStyleInfo[i];
    }
}
