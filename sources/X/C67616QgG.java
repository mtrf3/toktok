package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;

/* renamed from: X.QgG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67616QgG implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        try {
            for (ChannelIdValue.ChannelIdValueType channelIdValueType : ChannelIdValue.ChannelIdValueType.values()) {
                if (readInt == channelIdValueType.zzb) {
                    return channelIdValueType;
                }
            }
            throw new C67617QgH(readInt);
        } catch (C67617QgH e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChannelIdValue.ChannelIdValueType[i];
    }
}
