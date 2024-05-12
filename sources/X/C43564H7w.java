package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.EditStickerModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H7w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43564H7w implements Parcelable.Creator<EditStickerModel> {
    @Override // android.os.Parcelable.Creator
    public final EditStickerModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new EditStickerModel(z);
    }

    @Override // android.os.Parcelable.Creator
    public final EditStickerModel[] newArray(int i) {
        return new EditStickerModel[i];
    }
}
