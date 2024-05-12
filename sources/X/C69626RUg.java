package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShareInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.RUg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69626RUg implements Parcelable.Creator<ShareInfo> {
    @Override // android.os.Parcelable.Creator
    public final ShareInfo createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        }
        return new ShareInfo(valueOf, parcel.readString(), (Image) parcel.readParcelable(ShareInfo.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final ShareInfo[] newArray(int i) {
        return new ShareInfo[i];
    }
}
