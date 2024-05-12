package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import kotlin.jvm.internal.o;

/* renamed from: X.Adi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26690Adi implements Parcelable.Creator<ExposeUserRight> {
    @Override // android.os.Parcelable.Creator
    public final ExposeUserRight createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        return new ExposeUserRight(readString, readString2, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final ExposeUserRight[] newArray(int i) {
        return new ExposeUserRight[i];
    }
}
