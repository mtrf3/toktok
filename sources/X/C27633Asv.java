package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Padding;
import kotlin.jvm.internal.o;

/* renamed from: X.Asv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27633Asv implements Parcelable.Creator<BrickStyle> {
    @Override // android.os.Parcelable.Creator
    public final BrickStyle createFromParcel(Parcel parcel) {
        Float valueOf;
        Padding createFromParcel;
        boolean z;
        Boolean valueOf2;
        o.LJIIIZ(parcel, "parcel");
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Float.valueOf(parcel.readFloat());
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Padding.CREATOR.createFromParcel(parcel);
        }
        Padding padding = createFromParcel;
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf2 = Boolean.valueOf(z);
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new BrickStyle(valueOf, padding, valueOf2, readString, readString2, num);
    }

    @Override // android.os.Parcelable.Creator
    public final BrickStyle[] newArray(int i) {
        return new BrickStyle[i];
    }
}
