package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.duet.DuetModel;
import com.ss.android.ugc.aweme.creative.model.duet.DuetUser;
import kotlin.jvm.internal.o;

/* renamed from: X.GSx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41563GSx implements Parcelable.Creator<DuetModel> {
    @Override // android.os.Parcelable.Creator
    public final DuetModel createFromParcel(Parcel parcel) {
        DuetUser createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = DuetUser.CREATOR.createFromParcel(parcel);
        }
        return new DuetModel(createFromParcel, parcel.readString(), parcel.readString(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final DuetModel[] newArray(int i) {
        return new DuetModel[i];
    }
}
