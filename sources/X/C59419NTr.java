package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.NTr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59419NTr implements Parcelable.Creator<AdLiveEnterRoomConfig> {
    @Override // android.os.Parcelable.Creator
    public final AdLiveEnterRoomConfig createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new AdLiveEnterRoomConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AdLiveEnterRoomConfig[] newArray(int i) {
        return new AdLiveEnterRoomConfig[i];
    }
}
