package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.duetupload.DuetUploadModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GfA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42068GfA implements Parcelable.Creator<DuetUploadModel> {
    @Override // android.os.Parcelable.Creator
    public final DuetUploadModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new DuetUploadModel(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final DuetUploadModel[] newArray(int i) {
        return new DuetUploadModel[i];
    }
}
