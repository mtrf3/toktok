package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RankInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Ao4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27332Ao4 implements Parcelable.Creator<RankInfo> {
    @Override // android.os.Parcelable.Creator
    public final RankInfo createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new RankInfo(readString, valueOf, readString2, readString3, readString4, readString5, readString6, num);
    }

    @Override // android.os.Parcelable.Creator
    public final RankInfo[] newArray(int i) {
        return new RankInfo[i];
    }
}
