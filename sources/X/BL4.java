package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BL4 implements Parcelable.Creator<EnterRoomConfig.SearchWrapData> {
    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.SearchWrapData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new EnterRoomConfig.SearchWrapData(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final EnterRoomConfig.SearchWrapData[] newArray(int i) {
        return new EnterRoomConfig.SearchWrapData[i];
    }
}
