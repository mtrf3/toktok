package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BNO implements Parcelable.Creator<EnterRoomConfig.FeedCoverData> {
    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.FeedCoverData createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new EnterRoomConfig.FeedCoverData(z, parcel.createStringArrayList(), EnterRoomConfig.FeedCoverData.PlayerInfo.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.FeedCoverData[] newArray(int i) {
        return new EnterRoomConfig.FeedCoverData[i];
    }
}
