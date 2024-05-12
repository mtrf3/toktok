package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PDPImageConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X7J implements Parcelable.Creator<PDPImageConfig> {
    @Override // android.os.Parcelable.Creator
    public final PDPImageConfig createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new PDPImageConfig(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final PDPImageConfig[] newArray(int i) {
        return new PDPImageConfig[i];
    }
}
