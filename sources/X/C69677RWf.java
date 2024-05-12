package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Favorite;
import kotlin.jvm.internal.o;

/* renamed from: X.RWf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69677RWf implements Parcelable.Creator<Favorite> {
    @Override // android.os.Parcelable.Creator
    public final Favorite createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new Favorite(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Favorite[] newArray(int i) {
        return new Favorite[i];
    }
}
