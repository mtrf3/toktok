package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.RedirectContent;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B28 implements Parcelable.Creator<RedirectContent> {
    @Override // android.os.Parcelable.Creator
    public final RedirectContent createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
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
        return new RedirectContent(readString, valueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final RedirectContent[] newArray(int i) {
        return new RedirectContent[i];
    }
}
