package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B29 implements Parcelable.Creator<ToastContent> {
    @Override // android.os.Parcelable.Creator
    public final ToastContent createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new ToastContent(valueOf, num, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ToastContent[] newArray(int i) {
        return new ToastContent[i];
    }
}
