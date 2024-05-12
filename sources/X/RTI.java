package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopupPrompt;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RTI implements Parcelable.Creator<PopupPrompt> {
    @Override // android.os.Parcelable.Creator
    public final PopupPrompt createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new PopupPrompt(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PopupPrompt[] newArray(int i) {
        return new PopupPrompt[i];
    }
}
