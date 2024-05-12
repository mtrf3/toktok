package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import kotlin.jvm.internal.o;

/* renamed from: X.At3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27641At3 implements Parcelable.Creator<BrickInfo> {
    @Override // android.os.Parcelable.Creator
    public final BrickInfo createFromParcel(Parcel parcel) {
        Integer valueOf;
        Integer valueOf2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        int readInt = parcel.readInt();
        BrickStyle brickStyle = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            brickStyle = BrickStyle.CREATOR.createFromParcel(parcel);
        }
        return new BrickInfo(readString, readString2, readString3, readInt, valueOf, valueOf2, readString4, brickStyle);
    }

    @Override // android.os.Parcelable.Creator
    public final BrickInfo[] newArray(int i) {
        return new BrickInfo[i];
    }
}
