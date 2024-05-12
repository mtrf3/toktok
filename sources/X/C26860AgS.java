package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonColor;
import kotlin.jvm.internal.o;

/* renamed from: X.AgS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26860AgS implements Parcelable.Creator<CommonColor> {
    @Override // android.os.Parcelable.Creator
    public final CommonColor createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CommonColor(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final CommonColor[] newArray(int i) {
        return new CommonColor[i];
    }
}
