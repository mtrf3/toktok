package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordBottomTabConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.TabType;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HCV implements Parcelable.Creator<RecordBottomTabConfig> {
    @Override // android.os.Parcelable.Creator
    public final RecordBottomTabConfig createFromParcel(Parcel parcel) {
        Long valueOf;
        o.LJIIIZ(parcel, "parcel");
        TabType createFromParcel = TabType.CREATOR.createFromParcel(parcel);
        Long l = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() != 0) {
            l = Long.valueOf(parcel.readLong());
        }
        return new RecordBottomTabConfig(createFromParcel, valueOf, l);
    }

    @Override // android.os.Parcelable.Creator
    public final RecordBottomTabConfig[] newArray(int i) {
        return new RecordBottomTabConfig[i];
    }
}
