package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.EditSaveLocalModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H7v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43563H7v implements Parcelable.Creator<EditSaveLocalModel> {
    @Override // android.os.Parcelable.Creator
    public final EditSaveLocalModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new EditSaveLocalModel(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final EditSaveLocalModel[] newArray(int i) {
        return new EditSaveLocalModel[i];
    }
}
