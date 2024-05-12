package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.record.UploadPreviewClipModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H7y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43566H7y implements Parcelable.Creator<UploadPreviewClipModel> {
    @Override // android.os.Parcelable.Creator
    public final UploadPreviewClipModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new UploadPreviewClipModel(z);
    }

    @Override // android.os.Parcelable.Creator
    public final UploadPreviewClipModel[] newArray(int i) {
        return new UploadPreviewClipModel[i];
    }
}
