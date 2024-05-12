package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import kotlin.jvm.internal.o;

/* renamed from: X.AoK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27348AoK implements Parcelable.Creator<CommonColor> {
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
