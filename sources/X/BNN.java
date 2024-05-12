package X;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BNN implements Parcelable.Creator<EnterRoomConfig.FeedCoverData.PlayerInfo> {
    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.FeedCoverData.PlayerInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new EnterRoomConfig.FeedCoverData.PlayerInfo(parcel.readString(), (Rect) parcel.readParcelable(EnterRoomConfig.FeedCoverData.PlayerInfo.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.FeedCoverData.PlayerInfo[] newArray(int i) {
        return new EnterRoomConfig.FeedCoverData.PlayerInfo[i];
    }
}
