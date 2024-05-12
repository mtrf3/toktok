package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.EditBackSaveModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H8O implements Parcelable.Creator<EditBackSaveModel> {
    @Override // android.os.Parcelable.Creator
    public final EditBackSaveModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new EditBackSaveModel(z, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final EditBackSaveModel[] newArray(int i) {
        return new EditBackSaveModel[i];
    }
}
