package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.dto.SemiPdpRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.dto.SourceInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Ria, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70308Ria implements Parcelable.Creator<SemiPdpRequest> {
    @Override // android.os.Parcelable.Creator
    public final SemiPdpRequest createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        SourceInfo createFromParcel = SourceInfo.CREATOR.createFromParcel(parcel);
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new SemiPdpRequest(readString, readString2, readString3, createFromParcel, readString4, z);
    }

    @Override // android.os.Parcelable.Creator
    public final SemiPdpRequest[] newArray(int i) {
        return new SemiPdpRequest[i];
    }
}
