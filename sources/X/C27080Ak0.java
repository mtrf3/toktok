package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BottomTip;
import kotlin.jvm.internal.o;

/* renamed from: X.Ak0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27080Ak0 implements Parcelable.Creator<BottomTip> {
    @Override // android.os.Parcelable.Creator
    public final BottomTip createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        Icon icon = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            icon = Icon.CREATOR.createFromParcel(parcel);
        }
        return new BottomTip(valueOf, readString, readString2, readString3, icon);
    }

    @Override // android.os.Parcelable.Creator
    public final BottomTip[] newArray(int i) {
        return new BottomTip[i];
    }
}
