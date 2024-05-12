package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FirstNotice;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.RUi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69628RUi implements Parcelable.Creator<FirstNotice> {
    @Override // android.os.Parcelable.Creator
    public final FirstNotice createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new FirstNotice((Image) parcel.readParcelable(FirstNotice.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final FirstNotice[] newArray(int i) {
        return new FirstNotice[i];
    }
}
