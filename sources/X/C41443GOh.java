package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.GOh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41443GOh implements Parcelable.Creator<DraftEditTransferModel> {
    @Override // android.os.Parcelable.Creator
    public final DraftEditTransferModel createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C5YW.LIZ(DraftEditTransferModel.class, parcel, arrayList, i, 1);
            }
        }
        return new DraftEditTransferModel(readString, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final DraftEditTransferModel[] newArray(int i) {
        return new DraftEditTransferModel[i];
    }
}
