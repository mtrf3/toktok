package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BL2 implements Parcelable.Creator<EnterRoomConfig> {
    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new EnterRoomConfig(EnterRoomConfig.StreamData.CREATOR.createFromParcel(parcel), EnterRoomConfig.LogData.CREATOR.createFromParcel(parcel), EnterRoomConfig.RoomsData.CREATOR.createFromParcel(parcel), EnterRoomConfig.SearchWrapData.CREATOR.createFromParcel(parcel), EnterRoomConfig.ECWrapData.CREATOR.createFromParcel(parcel), EnterRoomConfig.DrawParams.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig[] newArray(int i) {
        return new EnterRoomConfig[i];
    }
}
