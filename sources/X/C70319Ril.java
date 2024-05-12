package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.dto.SourceInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Ril, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70319Ril implements Parcelable.Creator<SourceInfo> {
    @Override // android.os.Parcelable.Creator
    public final SourceInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new SourceInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SourceInfo[] newArray(int i) {
        return new SourceInfo[i];
    }
}
