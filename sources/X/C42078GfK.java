package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.PublishItemTrackModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GfK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42078GfK implements Parcelable.Creator<PublishItemTrackModel> {
    @Override // android.os.Parcelable.Creator
    public final PublishItemTrackModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new PublishItemTrackModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PublishItemTrackModel[] newArray(int i) {
        return new PublishItemTrackModel[i];
    }
}
