package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.PublishPreviewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H7x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43565H7x implements Parcelable.Creator<PublishPreviewModel> {
    @Override // android.os.Parcelable.Creator
    public final PublishPreviewModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new PublishPreviewModel(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PublishPreviewModel[] newArray(int i) {
        return new PublishPreviewModel[i];
    }
}
