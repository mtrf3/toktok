package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.ChallengeModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class HIM implements Parcelable.Creator<ChallengeModel> {
    @Override // android.os.Parcelable.Creator
    public final ChallengeModel createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new ChallengeModel(in.readString(), in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ChallengeModel[] newArray(int i) {
        return new ChallengeModel[i];
    }
}
