package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.AgV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26863AgV implements Parcelable.Creator<Icon> {
    @Override // android.os.Parcelable.Creator
    public final Icon createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new Icon((Image) parcel.readParcelable(Icon.class.getClassLoader()), (Image) parcel.readParcelable(Icon.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Icon[] newArray(int i) {
        return new Icon[i];
    }
}
