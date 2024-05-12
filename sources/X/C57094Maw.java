package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeFilterModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Maw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57094Maw implements Parcelable.Creator<NoticeFilterModel> {
    @Override // android.os.Parcelable.Creator
    public final NoticeFilterModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new NoticeFilterModel(parcel.readInt(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final NoticeFilterModel[] newArray(int i) {
        return new NoticeFilterModel[i];
    }
}
