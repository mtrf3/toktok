package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.challenge.presenter.ChallengeShareModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Oee, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62420Oee implements Parcelable.Creator<ChallengeShareModel> {
    @Override // android.os.Parcelable.Creator
    public final ChallengeShareModel createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        Challenge challenge = (Challenge) parcel.readSerializable();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readSerializable());
            }
        }
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new ChallengeShareModel(challenge, arrayList, z, parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ChallengeShareModel[] newArray(int i) {
        return new ChallengeShareModel[i];
    }
}
