package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Promotion;
import kotlin.jvm.internal.o;

/* renamed from: X.AoA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27338AoA implements Parcelable.Creator<Promotion> {
    @Override // android.os.Parcelable.Creator
    public final Promotion createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new Promotion(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Promotion[] newArray(int i) {
        return new Promotion[i];
    }
}
