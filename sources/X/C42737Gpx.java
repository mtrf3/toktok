package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.api.model.AnchorIcon;
import kotlin.jvm.internal.o;

/* renamed from: X.Gpx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42737Gpx implements Parcelable.Creator<AnchorCell> {
    @Override // android.os.Parcelable.Creator
    public final AnchorCell createFromParcel(Parcel parcel) {
        AnchorIcon createFromParcel;
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = AnchorIcon.CREATOR.createFromParcel(parcel);
        }
        AnchorIcon anchorIcon = createFromParcel;
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        int readInt = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new AnchorCell(readString, anchorIcon, readString2, readString3, readString4, readString5, readInt, z);
    }

    @Override // android.os.Parcelable.Creator
    public final AnchorCell[] newArray(int i) {
        return new AnchorCell[i];
    }
}
