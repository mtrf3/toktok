package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.TabType;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.UploadConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HCU implements Parcelable.Creator<UploadConfig> {
    @Override // android.os.Parcelable.Creator
    public final UploadConfig createFromParcel(Parcel parcel) {
        Integer valueOf;
        Integer valueOf2;
        boolean z;
        Long valueOf3;
        o.LJIIIZ(parcel, "parcel");
        TabType createFromParcel = TabType.CREATOR.createFromParcel(parcel);
        Long l = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            valueOf3 = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() != 0) {
            l = Long.valueOf(parcel.readLong());
        }
        return new UploadConfig(createFromParcel, valueOf, valueOf2, z, valueOf3, l);
    }

    @Override // android.os.Parcelable.Creator
    public final UploadConfig[] newArray(int i) {
        return new UploadConfig[i];
    }
}
