package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SpendMoreForFree;
import kotlin.jvm.internal.o;

/* renamed from: X.Ai5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26961Ai5 implements Parcelable.Creator<SpendMoreForFree> {
    @Override // android.os.Parcelable.Creator
    public final SpendMoreForFree createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new SpendMoreForFree(parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SpendMoreForFree[] newArray(int i) {
        return new SpendMoreForFree[i];
    }
}
