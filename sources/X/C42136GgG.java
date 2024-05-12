package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GgG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42136GgG implements Parcelable.Creator<NowsShootModel> {
    @Override // android.os.Parcelable.Creator
    public final NowsShootModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        NowsExtra createFromParcel = NowsExtra.CREATOR.createFromParcel(parcel);
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new NowsShootModel(readInt, readString, readString2, readString3, readString4, createFromParcel, readString5, readString6, readString7, readString8, z, parcel.readLong(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final NowsShootModel[] newArray(int i) {
        return new NowsShootModel[i];
    }
}
