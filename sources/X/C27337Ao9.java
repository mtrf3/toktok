package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.FeeTag;
import kotlin.jvm.internal.o;

/* renamed from: X.Ao9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27337Ao9 implements Parcelable.Creator<FeeTag> {
    @Override // android.os.Parcelable.Creator
    public final FeeTag createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new FeeTag(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final FeeTag[] newArray(int i) {
        return new FeeTag[i];
    }
}
