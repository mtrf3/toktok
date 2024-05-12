package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.question.model.QuestionDetailParam;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GHK implements Parcelable.Creator<QuestionDetailParam> {
    @Override // android.os.Parcelable.Creator
    public final QuestionDetailParam createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new QuestionDetailParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final QuestionDetailParam[] newArray(int i) {
        return new QuestionDetailParam[i];
    }
}
