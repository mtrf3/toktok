package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.question.QuestionInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RSW implements Parcelable.Creator<QuestionInfo> {
    @Override // android.os.Parcelable.Creator
    public final QuestionInfo createFromParcel(Parcel parcel) {
        Long valueOf;
        Long valueOf2;
        o.LJIIIZ(parcel, "parcel");
        Long l = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() != 0) {
            l = Long.valueOf(parcel.readLong());
        }
        return new QuestionInfo(valueOf, valueOf2, l, parcel.readString(), parcel.readString(), (UrlModel) parcel.readSerializable(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final QuestionInfo[] newArray(int i) {
        return new QuestionInfo[i];
    }
}
