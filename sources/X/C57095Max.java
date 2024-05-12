package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Max, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57095Max implements Parcelable.Creator<NoticeSortModel> {
    @Override // android.os.Parcelable.Creator
    public final NoticeSortModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new NoticeSortModel(parcel.readInt(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final NoticeSortModel[] newArray(int i) {
        return new NoticeSortModel[i];
    }
}
