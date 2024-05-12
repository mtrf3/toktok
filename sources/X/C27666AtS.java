package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Padding;
import kotlin.jvm.internal.o;

/* renamed from: X.AtS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27666AtS implements Parcelable.Creator<Padding> {
    @Override // android.os.Parcelable.Creator
    public final Padding createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new Padding(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public final Padding[] newArray(int i) {
        return new Padding[i];
    }
}
