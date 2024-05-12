package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.PSg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64478PSg implements Parcelable.Creator<ButtonAction> {
    @Override // android.os.Parcelable.Creator
    public final ButtonAction createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        ButtonActionInfo buttonActionInfo = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            buttonActionInfo = ButtonActionInfo.CREATOR.createFromParcel(parcel);
        }
        return new ButtonAction(valueOf, buttonActionInfo, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ButtonAction[] newArray(int i) {
        return new ButtonAction[i];
    }
}
