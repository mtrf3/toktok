package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import kotlin.jvm.internal.o;

/* renamed from: X.PSf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64477PSf implements Parcelable.Creator<DialogButton> {
    @Override // android.os.Parcelable.Creator
    public final DialogButton createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        ButtonAction buttonAction = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            buttonAction = ButtonAction.CREATOR.createFromParcel(parcel);
        }
        return new DialogButton(readString, valueOf, buttonAction);
    }

    @Override // android.os.Parcelable.Creator
    public final DialogButton[] newArray(int i) {
        return new DialogButton[i];
    }
}
